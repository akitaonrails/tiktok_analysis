package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BvV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220511BvV extends C2217421BqW implements InterfaceC1631620sYq<JSONObject, Map<String, ? extends byte[]>, Integer, C2220181Buy> {
    public C2220511BvV(C2220331BvD c2220331BvD) {
        super(3, c2220331BvD, C2220331BvD.class, "readFileBufferSync", "readFileBufferSync(Lorg/json/JSONObject;Ljava/util/Map;Ljava/lang/Integer;)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final C2220181Buy invoke(JSONObject jSONObject, Map<String, ? extends byte[]> map, Integer num) {
        int iIntValue;
        JSONObject jSONObject2 = jSONObject;
        C2220331BvD c2220331BvD = (C2220331BvD) this.receiver;
        c2220331BvD.getClass();
        if (jSONObject2 == null) {
            return C2220181Buy.LIZLLL;
        }
        Pair pairLJIILL = C2220331BvD.LJIILL(c2220331BvD, jSONObject2);
        boolean zBooleanValue = ((Boolean) pairLJIILL.getFirst()).booleanValue();
        String str = (String) pairLJIILL.getSecond();
        if (!zBooleanValue) {
            return C2220331BvD.LJIIL(EnumC2221121BwU.INVALID_ARG);
        }
        int iIntValue2 = 0;
        if (u.LJIIZILJ(a0.LJLIIIL(str).toString(), "/", false)) {
            return C2220331BvD.LJIIL(EnumC2221121BwU.IS_DIR);
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
            iIntValue2 = num2.intValue();
        }
        if (num3 != null) {
            iIntValue = num3.intValue();
        } else {
            iIntValue = -1;
        }
        return c2220331BvD.LIZ.LIZ.LJJJZ(iIntValue2, iIntValue, str, "").LIZIZ();
    }
}
