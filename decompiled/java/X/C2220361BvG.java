package X;

import Y.AObjectS81S0201000_34;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BvG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220361BvG extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2220361BvG(C2220331BvD c2220331BvD) {
        super(2, c2220331BvD, C2220331BvD.class, "write", "write(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        int length;
        int i;
        JSONObject jSONObject2 = jSONObject;
        int iIntValue = num.intValue();
        C2220331BvD c2220331BvD = (C2220331BvD) this.receiver;
        c2220331BvD.getClass();
        Integer numLJIL = C2220331BvD.LJIL(jSONObject2);
        if (numLJIL != null) {
            int iIntValue2 = numLJIL.intValue();
            if (Intrinsics.LJFF(c2220331BvD.LIZIZ.get(Integer.valueOf(iIntValue2)), Boolean.FALSE)) {
                return c2220331BvD.LJIIJJI(EnumC2221121BwU.FLAG_PERMISSION_DENIED, iIntValue);
            }
            Pair pairLJJI = C2220331BvD.LJJI("offset", jSONObject2);
            boolean zBooleanValue = ((Boolean) pairLJJI.getFirst()).booleanValue();
            Integer num2 = (Integer) pairLJJI.getSecond();
            Pair pairLJJI2 = C2220331BvD.LJJI("length", jSONObject2);
            boolean zBooleanValue2 = ((Boolean) pairLJJI2.getFirst()).booleanValue();
            Integer num3 = (Integer) pairLJJI2.getSecond();
            Pair pairLJJI3 = C2220331BvD.LJJI("position", jSONObject2);
            boolean zBooleanValue3 = ((Boolean) pairLJJI3.getFirst()).booleanValue();
            Integer num4 = (Integer) pairLJJI3.getSecond();
            if (zBooleanValue && num2 == null) {
                return c2220331BvD.LJIIIZ(iIntValue, true);
            }
            if (zBooleanValue2 && num3 == null) {
                return c2220331BvD.LJIIIZ(iIntValue, true);
            }
            if (zBooleanValue3 && num4 == null) {
                return c2220331BvD.LJIIIZ(iIntValue, true);
            }
            byte[] bArrLJJIII = c2220331BvD.LJJIII(jSONObject2);
            int iIntValue3 = 0;
            if (bArrLJJIII == null) {
                if (zBooleanValue2 && num3 != null && num3.intValue() == 0) {
                    bArrLJJIII = new byte[0];
                } else {
                    return c2220331BvD.LJIIJJI(EnumC2221121BwU.INVALID_ARG, iIntValue);
                }
            }
            if (num2 != null) {
                iIntValue3 = num2.intValue();
            }
            if (num3 != null) {
                length = num3.intValue();
            } else {
                length = bArrLJJIII.length - iIntValue3;
            }
            if (length == 0 && bArrLJJIII.length - iIntValue3 > 0) {
                length = bArrLJJIII.length - iIntValue3;
            }
            if (iIntValue3 >= 0 && length >= 0 && (i = iIntValue3 + length) <= bArrLJJIII.length) {
                if (iIntValue3 != 0 || length != bArrLJJIII.length) {
                    C1691430u7J.LIZ(i, bArrLJJIII.length);
                    bArrLJJIII = Arrays.copyOfRange(bArrLJJIII, iIntValue3, i);
                }
                if (zBooleanValue3 && (num4 == null || num4.intValue() < 0)) {
                    return c2220331BvD.LJIIIZ(iIntValue, true);
                }
                InterfaceC2220701Bvo interfaceC2220701Bvo = c2220331BvD.LIZ.LIZ;
                if (!zBooleanValue3) {
                    num4 = null;
                }
                interfaceC2220701Bvo.LJII(iIntValue2, bArrLJJIII, num4, new AObjectS81S0201000_34(c2220331BvD, iIntValue, bArrLJJIII, 1));
                return C2220181Buy.LJ;
            }
            return c2220331BvD.LJIIIZ(iIntValue, true);
        }
        return c2220331BvD.LJIIIZ(iIntValue, true);
    }
}
