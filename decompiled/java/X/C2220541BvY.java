package X;

import Y.AObjectS320S0200000_34;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BvY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220541BvY extends C2217421BqW implements InterfaceC1631620sYq<JSONObject, Map<String, ? extends byte[]>, Integer, C2220181Buy> {
    public C2220541BvY(C2220331BvD c2220331BvD) {
        super(3, c2220331BvD, C2220331BvD.class, "writeFileBuffer", "writeFileBuffer(Lorg/json/JSONObject;Ljava/util/Map;Ljava/lang/Integer;)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final C2220181Buy invoke(JSONObject jSONObject, Map<String, ? extends byte[]> map, Integer num) {
        JSONObject jSONObject2 = jSONObject;
        Map<String, ? extends byte[]> map2 = map;
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
            byte[] bArr = map2.get("data");
            if (bArr == null) {
                return c2220331BvD.LJIIJJI(EnumC2221121BwU.INVALID_ARG, num2.intValue());
            }
            if (bArr.length == 0) {
                return c2220331BvD.LJIIJJI(EnumC2221121BwU.DATA_EMPTY, num2.intValue());
            }
            c2220331BvD.LIZ.LIZ.LJJJJL(str, bArr, jSONObject2.optBoolean("append", false), new AObjectS320S0200000_34(c2220331BvD, num2, 4));
            return C2220181Buy.LJ;
        }
        return C2220181Buy.LIZLLL;
    }
}
