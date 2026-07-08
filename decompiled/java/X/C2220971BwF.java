package X;

import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BwF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220971BwF extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2220971BwF(C2220331BvD c2220331BvD) {
        super(2, c2220331BvD, C2220331BvD.class, "fstatSync", "fstatSync(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) throws JSONException {
        int iIntValue = num.intValue();
        C2220331BvD c2220331BvD = (C2220331BvD) this.receiver;
        c2220331BvD.getClass();
        Integer numLJIL = C2220331BvD.LJIL(jSONObject);
        if (numLJIL != null) {
            C2220181Buy c2220181BuyLIZ = c2220331BvD.LIZ.LIZ.LJIJ(numLJIL.intValue()).LIZ();
            C2220331BvD.LJJIIZ(c2220181BuyLIZ);
            return c2220181BuyLIZ;
        }
        return c2220331BvD.LJIIIZ(iIntValue, false);
    }
}
