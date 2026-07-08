package X;

import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BvT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220491BvT extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2220491BvT(C2220331BvD c2220331BvD) {
        super(2, c2220331BvD, C2220331BvD.class, "readFileSync", "readFileSync(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        int iIntValue;
        JSONObject jSONObject2 = jSONObject;
        int iIntValue2 = num.intValue();
        C2220331BvD c2220331BvD = (C2220331BvD) this.receiver;
        c2220331BvD.getClass();
        Pair pairLJIILL = C2220331BvD.LJIILL(c2220331BvD, jSONObject2);
        boolean zBooleanValue = ((Boolean) pairLJIILL.getFirst()).booleanValue();
        String str = (String) pairLJIILL.getSecond();
        int iIntValue3 = 0;
        if (!zBooleanValue) {
            return c2220331BvD.LJIIIZ(iIntValue2, false);
        }
        if (u.LJIIZILJ(a0.LJLIIIL(str).toString(), "/", false)) {
            return C2220331BvD.LJIIL(EnumC2221121BwU.IS_DIR);
        }
        String strOptString = jSONObject2.optString("encoding", "");
        if ((!a0.LJJJIL(strOptString)) && !c2220331BvD.LJIJI(strOptString)) {
            return C2220251Bv5.LIZ(EnumC2221121BwU.INVALID_ARG, "unsupported encoding").LIZ();
        }
        Pair pairLJJI = C2220331BvD.LJJI("position", jSONObject2);
        boolean zBooleanValue2 = ((Boolean) pairLJJI.getFirst()).booleanValue();
        Integer num2 = (Integer) pairLJJI.getSecond();
        Pair pairLJJI2 = C2220331BvD.LJJI("length", jSONObject2);
        boolean zBooleanValue3 = ((Boolean) pairLJJI2.getFirst()).booleanValue();
        Integer num3 = (Integer) pairLJJI2.getSecond();
        if (C2220331BvD.LJIJ(num2, num3, zBooleanValue2, zBooleanValue3)) {
            return C2220331BvD.LJIIL(EnumC2221121BwU.INVALID_ARG);
        }
        if (num2 != null) {
            iIntValue3 = num2.intValue();
        }
        if (num3 != null) {
            iIntValue = num3.intValue();
        } else {
            iIntValue = -1;
        }
        C2220221Bv2 c2220221Bv2LJJJZ = c2220331BvD.LIZ.LIZ.LJJJZ(iIntValue3, iIntValue, str, strOptString);
        if (!a0.LJJJIL(strOptString)) {
            c2220221Bv2LJJJZ = C2220331BvD.LIZJ(c2220221Bv2LJJJZ, strOptString);
        }
        return c2220221Bv2LJJJZ.LIZ();
    }
}
