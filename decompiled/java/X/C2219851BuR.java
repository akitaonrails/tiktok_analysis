package X;

import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BuR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2219851BuR extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2219851BuR(C2219841BuQ c2219841BuQ) {
        super(2, c2219841BuQ, C2219841BuQ.class, "getNetworkType", "getNetworkType(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) throws JSONException {
        int iIntValue = num.intValue();
        C2219841BuQ c2219841BuQ = (C2219841BuQ) this.receiver;
        C2219681BuA c2219681BuA = c2219841BuQ.LIZ.LJFF;
        c2219681BuA.LJLJJI();
        c2219681BuA.LJLJI();
        C2219731BuF c2219731BuF = c2219681BuA.LIZLLL;
        String strLIZ = C2219841BuQ.LIZ(c2219731BuF.LIZIZ);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("networkType", strLIZ);
        jSONObject2.put("weakNet", c2219731BuF.LIZJ);
        jSONObject2.put("hasSystemProxy", c2219731BuF.LIZLLL);
        jSONObject2.put("signalStrength", c2219731BuF.LJ);
        C2220181Buy c2220181Buy = C2220181Buy.LIZJ;
        c2219841BuQ.LIZ.LIZJ.LJJLIIJ(Integer.valueOf(iIntValue), C2220191Buz.LIZIZ(jSONObject2));
        return C2220181Buy.LJ;
    }
}
