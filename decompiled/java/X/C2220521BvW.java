package X;

import Y.AObjectS15S1101000_34;
import Y.AObjectS89S0101000_34;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BvW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220521BvW extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2220521BvW(C2220331BvD c2220331BvD) {
        super(2, c2220331BvD, C2220331BvD.class, "readFile", "readFile(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        int iIntValue;
        int iIntValue2;
        JSONObject jSONObject2 = jSONObject;
        int iIntValue3 = num.intValue();
        C2220331BvD c2220331BvD = (C2220331BvD) this.receiver;
        c2220331BvD.getClass();
        Pair pairLJIILL = C2220331BvD.LJIILL(c2220331BvD, jSONObject2);
        boolean zBooleanValue = ((Boolean) pairLJIILL.getFirst()).booleanValue();
        String str = (String) pairLJIILL.getSecond();
        if (!zBooleanValue) {
            return c2220331BvD.LJIIJJI(EnumC2221121BwU.INVALID_ARG, iIntValue3);
        }
        if (u.LJIIZILJ(a0.LJLIIIL(str).toString(), "/", false)) {
            return c2220331BvD.LJIIJJI(EnumC2221121BwU.IS_DIR, iIntValue3);
        }
        String strOptString = jSONObject2.optString("encoding", "");
        if ((!a0.LJJJIL(strOptString)) && !c2220331BvD.LJIJI(strOptString)) {
            c2220331BvD.LIZ.LIZIZ.LJJLIIJ(Integer.valueOf(iIntValue3), C2220251Bv5.LIZ(EnumC2221121BwU.INVALID_ARG, "unsupported encoding").LIZ());
            return C2220181Buy.LJ;
        }
        Pair pairLJJI = C2220331BvD.LJJI("position", jSONObject2);
        boolean zBooleanValue2 = ((Boolean) pairLJJI.getFirst()).booleanValue();
        Integer num2 = (Integer) pairLJJI.getSecond();
        Pair pairLJJI2 = C2220331BvD.LJJI("length", jSONObject2);
        boolean zBooleanValue3 = ((Boolean) pairLJJI2.getFirst()).booleanValue();
        Integer num3 = (Integer) pairLJJI2.getSecond();
        if (C2220331BvD.LJIJ(num2, num3, zBooleanValue2, zBooleanValue3)) {
            return c2220331BvD.LJIIJJI(EnumC2221121BwU.INVALID_ARG, iIntValue3);
        }
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = 0;
        }
        if (num3 != null) {
            iIntValue2 = num3.intValue();
        } else {
            iIntValue2 = -1;
        }
        if (a0.LJJJIL(strOptString)) {
            c2220331BvD.LIZ.LIZ.LJJIL(iIntValue, iIntValue2, str, strOptString, new AObjectS89S0101000_34(c2220331BvD, iIntValue3, 25));
        } else {
            c2220331BvD.LIZ.LIZ.LJJIL(iIntValue, iIntValue2, str, strOptString, new AObjectS15S1101000_34(c2220331BvD, strOptString, iIntValue3, 1));
        }
        return C2220181Buy.LJ;
    }
}
