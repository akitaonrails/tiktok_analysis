package X;

import Y.AObjectS89S0101000_34;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bvs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220741Bvs extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2220741Bvs(C2220331BvD c2220331BvD) {
        super(2, c2220331BvD, C2220331BvD.class, "ftruncate", "ftruncate(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        JSONObject jSONObject2 = jSONObject;
        int iIntValue = num.intValue();
        C2220331BvD c2220331BvD = (C2220331BvD) this.receiver;
        c2220331BvD.getClass();
        Integer numLJIL = C2220331BvD.LJIL(jSONObject2);
        if (numLJIL != null) {
            int iIntValue2 = numLJIL.intValue();
            Pair pairLJJII = C2220331BvD.LJJII(jSONObject2);
            boolean zBooleanValue = ((Boolean) pairLJJII.getFirst()).booleanValue();
            Long l = (Long) pairLJJII.getSecond();
            if (zBooleanValue && l != null) {
                InterfaceC2220701Bvo interfaceC2220701Bvo = c2220331BvD.LIZ.LIZ;
                long jLongValue = l.longValue();
                if (jLongValue < 0) {
                    jLongValue = 0;
                }
                interfaceC2220701Bvo.LJJJJZ(iIntValue2, jLongValue, new AObjectS89S0101000_34(c2220331BvD, iIntValue, 1));
                return C2220181Buy.LJ;
            }
            return c2220331BvD.LJIIIZ(iIntValue, true);
        }
        return c2220331BvD.LJIIIZ(iIntValue, true);
    }
}
