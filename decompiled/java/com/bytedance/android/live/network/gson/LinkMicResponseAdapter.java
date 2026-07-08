package com.bytedance.android.live.network.gson;

import X.C926820aE4;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.i;
import com.google.gson.k;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes24.dex */
public class LinkMicResponseAdapter extends AbsJsonDeserializer<C926820aE4> {
    public LinkMicResponseAdapter(Gson gson) {
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
