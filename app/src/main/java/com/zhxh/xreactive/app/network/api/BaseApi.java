

package com.zhxh.xreactive.app.network.api;

import com.zhxh.xreactive.app.model.BaseImage;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import io.reactivex.Observable;

public interface BaseApi {
    @GET("search")
    Observable<List<BaseImage>> search(@Query("q") String query);
}
