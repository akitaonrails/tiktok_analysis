package X;

import Y.AObjectS320S0200000_34;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BvX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220531BvX extends C2217421BqW implements InterfaceC1631620sYq<JSONObject, Map<String, ? extends byte[]>, Integer, C2220181Buy> {
    public C2220531BvX(C2220331BvD c2220331BvD) {
        super(3, c2220331BvD, C2220331BvD.class, "readFileBuffer", "readFileBuffer(Lorg/json/JSONObject;Ljava/util/Map;Ljava/lang/Integer;)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final C2220181Buy invoke(JSONObject jSONObject, Map<String, ? extends byte[]> map, Integer num) {
        int iIntValue;
        int iIntValue2;
        JSONObject jSONObject2 = jSONObject;
        Integer num2 = num;
        C2220331BvD c2220331BvD = (C2220331BvD) this.receiver;
        c2220331BvD.getClass();
        if (jSONObject2 != null && num2 != null) {
            Pair pairLJIILL = C2220331BvD.LJIILL(c2220331BvD, jSONObject2);
            boolean zBooleanValue = ((Boolean) pairLJIILL.getFirst()).booleanValue();
            String str = (String) pairLJIILL.getSecond();
            if (!zBooleanValue) {
                return c2220331BvD.LJIIJJI(EnumC2221121BwU.INVALID_ARG, num2.intValue());
            }
            if (u.LJIIZILJ(a0.LJLIIIL(str).toString(), "/", false)) {
                return c2220331BvD.LJIIJJI(EnumC2221121BwU.IS_DIR, num2.intValue());
            }
            Pair pairLJJI = C2220331BvD.LJJI("position", jSONObject2);
            boolean zBooleanValue2 = ((Boolean) pairLJJI.getFirst()).booleanValue();
            Integer num3 = (Integer) pairLJJI.getSecond();
            Pair pairLJJI2 = C2220331BvD.LJJI("length", jSONObject2);
            boolean zBooleanValue3 = ((Boolean) pairLJJI2.getFirst()).booleanValue();
            Integer num4 = (Integer) pairLJJI2.getSecond();
            if (C2220331BvD.LJIJ(num3, num4, zBooleanValue2, zBooleanValue3)) {
                return c2220331BvD.LJIIJJI(EnumC2221121BwU.INVALID_ARG, num2.intValue());
            }
            if (num3 != null) {
                iIntValue = num3.intValue();
            } else {
                iIntValue = 0;
            }
            if (num4 != null) {
                iIntValue2 = num4.intValue();
            } else {
                iIntValue2 = -1;
            }
            c2220331BvD.LIZ.LIZ.LJJIL(iIntValue, iIntValue2, str, "", new AObjectS320S0200000_34(c2220331BvD, num2, 2));
            return C2220181Buy.LJ;
        }
        return C2220181Buy.LIZLLL;
    }
}
