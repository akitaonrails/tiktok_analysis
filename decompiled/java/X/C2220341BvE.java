package X;

import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BvE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220341BvE extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2220341BvE(C2220331BvD c2220331BvD) {
        super(2, c2220331BvD, C2220331BvD.class, "openSync", "openSync(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        JSONObject jSONObject2 = jSONObject;
        int iIntValue = num.intValue();
        C2220331BvD c2220331BvD = (C2220331BvD) this.receiver;
        c2220331BvD.getClass();
        Pair pairLJIILLIIL = C2220331BvD.LJIILLIIL(c2220331BvD, jSONObject2);
        boolean zBooleanValue = ((Boolean) pairLJIILLIIL.getFirst()).booleanValue();
        String str = (String) pairLJIILLIIL.getSecond();
        if (zBooleanValue && str != null) {
            Pair pairLJJ = C2220331BvD.LJJ(jSONObject2);
            boolean zBooleanValue2 = ((Boolean) pairLJJ.getFirst()).booleanValue();
            String str2 = (String) pairLJJ.getSecond();
            if (!zBooleanValue2) {
                return c2220331BvD.LJIIIZ(iIntValue, false);
            }
            C2220221Bv2 c2220221Bv2LIZ = C2220331BvD.LIZ(c2220331BvD.LIZ.LIZ.LJJLIIIJL(str, str2));
            c2220331BvD.LJJIIJZLJL(c2220221Bv2LIZ, str2);
            return c2220221Bv2LIZ.LIZ();
        }
        return c2220331BvD.LJIIIZ(iIntValue, false);
    }
}
