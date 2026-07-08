package X;

import android.util.Base64;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BvL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220411BvL extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2220411BvL(C2220331BvD c2220331BvD) {
        super(2, c2220331BvD, C2220331BvD.class, "readSync", "readSync(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        byte[] bArrLIZLLL;
        int iIntValue;
        int length;
        byte[] bArr;
        JSONObject jSONObject2 = jSONObject;
        int iIntValue2 = num.intValue();
        C2220331BvD c2220331BvD = (C2220331BvD) this.receiver;
        c2220331BvD.getClass();
        Integer numLJIL = C2220331BvD.LJIL(jSONObject2);
        if (numLJIL != null) {
            int iIntValue3 = numLJIL.intValue();
            Pair pairLJJI = C2220331BvD.LJJI("offset", jSONObject2);
            boolean zBooleanValue = ((Boolean) pairLJJI.getFirst()).booleanValue();
            Integer num2 = (Integer) pairLJJI.getSecond();
            Pair pairLJJI2 = C2220331BvD.LJJI("length", jSONObject2);
            boolean zBooleanValue2 = ((Boolean) pairLJJI2.getFirst()).booleanValue();
            Integer num3 = (Integer) pairLJJI2.getSecond();
            Pair pairLJJIFFI = C2220331BvD.LJJIFFI(jSONObject2);
            if (pairLJJIFFI == null) {
                return c2220331BvD.LJIIIZ(iIntValue2, false);
            }
            Integer num4 = (Integer) pairLJJIFFI.getSecond();
            if (zBooleanValue && num2 == null) {
                return c2220331BvD.LJIIIZ(iIntValue2, false);
            }
            if (zBooleanValue2 && num3 == null) {
                return c2220331BvD.LJIIIZ(iIntValue2, false);
            }
            if (jSONObject2.has("arrayBuffer")) {
                bArrLIZLLL = C2220331BvD.LIZLLL(jSONObject2.opt("arrayBuffer"));
                if (bArrLIZLLL == null) {
                    if (zBooleanValue2 && num3 != null && num3.intValue() == 0) {
                        bArrLIZLLL = new byte[0];
                    } else {
                        return C2220331BvD.LJIIL(EnumC2221121BwU.ARRAYBUFFER_NOT_EXIST);
                    }
                }
            } else if (zBooleanValue2 && num3 != null && num3.intValue() == 0) {
                bArrLIZLLL = new byte[0];
            } else {
                return C2220331BvD.LJIIL(EnumC2221121BwU.ARRAYBUFFER_NOT_EXIST);
            }
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = 0;
            }
            if (num3 != null) {
                length = num3.intValue();
            } else {
                length = bArrLIZLLL.length - iIntValue;
            }
            if (iIntValue >= 0 && length >= 0) {
                C2220221Bv2 c2220221Bv2LJJJJIZL = c2220331BvD.LIZ.LIZ.LJJJJIZL(iIntValue3, length, num4);
                C2220231Bv3 c2220231Bv3 = c2220221Bv2LJJJJIZL.LIZIZ;
                if (!c2220231Bv3.LIZ) {
                    return c2220221Bv2LJJJJIZL.LIZ();
                }
                Map<String, Object> map = c2220231Bv3.LIZLLL;
                Object obj = null;
                if (map != null) {
                    obj = map.get("data");
                }
                if (!(obj instanceof byte[]) || (bArr = (byte[]) obj) == null) {
                    bArr = new byte[0];
                }
                int length2 = bArrLIZLLL.length - iIntValue;
                if (length2 < 0) {
                    length2 = 0;
                }
                int iMin = Math.min(length2, bArr.length);
                if (iMin > 0) {
                    System.arraycopy(bArr, 0, bArrLIZLLL, iIntValue, iMin);
                }
                String strEncodeToString = Base64.encodeToString(bArrLIZLLL, 2);
                return C2220251Bv5.LIZJ(null, C2097608Jq.LJIIIIZZ(new Pair("data", strEncodeToString), new Pair("arrayBuffer", strEncodeToString), new Pair("bytesRead", Integer.valueOf(iMin)), new Pair("readBytes", Integer.valueOf(iMin)))).LIZ();
            }
            return c2220331BvD.LJIIIZ(iIntValue2, false);
        }
        return c2220331BvD.LJIIIZ(iIntValue2, false);
    }
}
