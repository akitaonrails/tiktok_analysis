package com.bytedance.android.live.network.gson;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.i;
import com.google.gson.k;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes24.dex */
public class BaseResponseTypeAdapter extends AbsJsonDeserializer<BaseResponse> {
    public BaseResponseTypeAdapter(Gson gson) {
        super(gson);
    }

    @Override // com.google.gson.j
    public final Object deserialize(k kVar, Type type, i iVar) {
        BaseResponse baseResponse = (BaseResponse) GsonProtectorUtils.fromJson(this.LIZ, kVar, type);
        if (baseResponse.statusCode != 0) {
            baseResponse.LJ = (RequestError) GsonProtectorUtils.fromJson(this.LIZ, kVar.LJIILIIL().LJJIIZ("data"), RequestError.class);
        }
        return baseResponse;
    }
}
