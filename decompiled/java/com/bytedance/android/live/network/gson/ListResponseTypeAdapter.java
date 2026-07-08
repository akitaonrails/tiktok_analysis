package com.bytedance.android.live.network.gson;

import X.C472830IgT;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.i;
import com.google.gson.k;
import com.google.gson.n;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes24.dex */
public class ListResponseTypeAdapter extends AbsJsonDeserializer<C472830IgT> {
    public ListResponseTypeAdapter(Gson gson) {
        super(gson);
    }

    @Override // com.google.gson.j
    public final Object deserialize(k kVar, Type type, i iVar) {
        n nVarLJIILIIL = kVar.LJIILIIL();
        int iLJIIJJI = nVarLJIILIIL.LJJIIZ("status_code").LJIIJJI();
        if (iLJIIJJI == 0) {
            return GsonProtectorUtils.fromJson(this.LIZ, kVar, type);
        }
        C472830IgT c472830IgT = new C472830IgT();
        c472830IgT.statusCode = iLJIIJJI;
        c472830IgT.extra = (R) GsonProtectorUtils.fromJson(this.LIZ, nVarLJIILIIL.LJJIIZ("extra"), Extra.class);
        c472830IgT.LJ = (RequestError) GsonProtectorUtils.fromJson(this.LIZ, nVarLJIILIIL.LJJIIZ("data"), RequestError.class);
        return c472830IgT;
    }
}
