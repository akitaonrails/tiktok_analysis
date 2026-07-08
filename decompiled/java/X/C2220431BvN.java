package X;

import Y.AObjectS81S0201000_34;
import android.util.Base64;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BvN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220431BvN extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2220431BvN(C2220331BvD c2220331BvD) {
        super(2, c2220331BvD, C2220331BvD.class, "read", "read(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        final byte[] bArrLIZLLL;
        int length;
        JSONObject jSONObject2 = jSONObject;
        final int iIntValue = num.intValue();
        final C2220331BvD c2220331BvD = (C2220331BvD) this.receiver;
        c2220331BvD.getClass();
        Integer numLJIL = C2220331BvD.LJIL(jSONObject2);
        if (numLJIL != null) {
            int iIntValue2 = numLJIL.intValue();
            Pair pairLJJI = C2220331BvD.LJJI("offset", jSONObject2);
            boolean zBooleanValue = ((Boolean) pairLJJI.getFirst()).booleanValue();
            Integer num2 = (Integer) pairLJJI.getSecond();
            Pair pairLJJI2 = C2220331BvD.LJJI("length", jSONObject2);
            boolean zBooleanValue2 = ((Boolean) pairLJJI2.getFirst()).booleanValue();
            Integer num3 = (Integer) pairLJJI2.getSecond();
            Pair pairLJJIFFI = C2220331BvD.LJJIFFI(jSONObject2);
            if (pairLJJIFFI == null) {
                return c2220331BvD.LJIIIZ(iIntValue, true);
            }
            Integer num4 = (Integer) pairLJJIFFI.getSecond();
            if (zBooleanValue && num2 == null) {
                return c2220331BvD.LJIIIZ(iIntValue, true);
            }
            if (zBooleanValue2 && num3 == null) {
                return c2220331BvD.LJIIIZ(iIntValue, true);
            }
            final int iIntValue3 = 0;
            if (jSONObject2.has("arrayBuffer")) {
                bArrLIZLLL = C2220331BvD.LIZLLL(jSONObject2.opt("arrayBuffer"));
                if (bArrLIZLLL == null) {
                    if (zBooleanValue2 && num3 != null && num3.intValue() == 0) {
                        bArrLIZLLL = new byte[0];
                    } else {
                        return c2220331BvD.LJIIJJI(EnumC2221121BwU.ARRAYBUFFER_NOT_EXIST, iIntValue);
                    }
                }
            } else if (zBooleanValue2 && num3 != null && num3.intValue() == 0) {
                bArrLIZLLL = new byte[0];
            } else {
                return c2220331BvD.LJIIJJI(EnumC2221121BwU.ARRAYBUFFER_NOT_EXIST, iIntValue);
            }
            if (num2 != null) {
                iIntValue3 = num2.intValue();
            }
            if (num3 != null) {
                length = num3.intValue();
            } else {
                length = bArrLIZLLL.length - iIntValue3;
            }
            if (iIntValue3 >= 0 && length >= 0) {
                c2220331BvD.LIZ.LIZ.LJJJJJ(iIntValue2, length, num4, new AObjectS81S0201000_34(c2220331BvD, iIntValue, new Function1() { // from class: X.1BvM
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte[] bArr = bArrLIZLLL;
                        int i = iIntValue3;
                        C2220331BvD c2220331BvD2 = c2220331BvD;
                        int i2 = iIntValue;
                        byte[] bArr2 = (byte[]) obj;
                        int length2 = bArr.length - i;
                        if (length2 < 0) {
                            length2 = 0;
                        }
                        int iMin = Math.min(length2, bArr2.length);
                        if (iMin > 0) {
                            System.arraycopy(bArr2, 0, bArr, i, iMin);
                        }
                        String strEncodeToString = Base64.encodeToString(bArr, 2);
                        c2220331BvD2.LIZ.LIZIZ.LJJLIIJ(Integer.valueOf(i2), C2220251Bv5.LIZJ(null, C2097608Jq.LJIIIIZZ(new Pair("data", strEncodeToString), new Pair("arrayBuffer", strEncodeToString), new Pair("bytesRead", Integer.valueOf(iMin)), new Pair("readBytes", Integer.valueOf(iMin)))).LIZ());
                        return Unit.LIZ;
                    }
                }, 0));
                return C2220181Buy.LJ;
            }
            return c2220331BvD.LJIIIZ(iIntValue, true);
        }
        return c2220331BvD.LJIIIZ(iIntValue, true);
    }
}
