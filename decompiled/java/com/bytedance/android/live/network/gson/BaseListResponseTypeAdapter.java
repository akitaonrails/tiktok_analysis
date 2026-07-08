package com.bytedance.android.live.network.gson;

import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.i;
import com.google.gson.k;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes24.dex */
public class BaseListResponseTypeAdapter extends AbsJsonDeserializer<BaseListResponse> {
    public BaseListResponseTypeAdapter(Gson gson) {
        super(gson);
    }

    @Override // com.google.gson.j
    public final Object deserialize(k kVar, Type type, i iVar) {
        BaseListResponse baseListResponse = (BaseListResponse) GsonProtectorUtils.fromJson(this.LIZ, kVar, type);
        if (baseListResponse.statusCode != 0) {
            baseListResponse.LJ = (RequestError) GsonProtectorUtils.fromJson(this.LIZ, kVar.LJIILIIL().LJJIIZ("data"), RequestError.class);
        }
        return baseListResponse;
    }
}
