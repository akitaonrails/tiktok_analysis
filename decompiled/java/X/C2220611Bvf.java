package X;

import Y.AObjectS89S0101000_34;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bvf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220611Bvf extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2220611Bvf(C2220331BvD c2220331BvD) {
        super(2, c2220331BvD, C2220331BvD.class, "appendFile", "appendFile(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        JSONObject jSONObject2 = jSONObject;
        int iIntValue = num.intValue();
        C2220331BvD c2220331BvD = (C2220331BvD) this.receiver;
        c2220331BvD.getClass();
        Pair pairLJIILL = C2220331BvD.LJIILL(c2220331BvD, jSONObject2);
        boolean zBooleanValue = ((Boolean) pairLJIILL.getFirst()).booleanValue();
        String str = (String) pairLJIILL.getSecond();
        if (!zBooleanValue) {
            return c2220331BvD.LJIIJJI(EnumC2221121BwU.INVALID_ARG, iIntValue);
        }
        if (u.LJIIZILJ(a0.LJLIIIL(str).toString(), "/", false)) {
            return c2220331BvD.LJIIJJI(EnumC2221121BwU.IS_DIR, iIntValue);
        }
        if (!jSONObject2.has("data")) {
            return c2220331BvD.LJIIJJI(EnumC2221121BwU.INVALID_ARG, iIntValue);
        }
        Pair<byte[], EnumC2221121BwU> pairLJIJJLI = c2220331BvD.LJIJJLI(jSONObject2);
        byte[] first = pairLJIJJLI.getFirst();
        EnumC2221121BwU second = pairLJIJJLI.getSecond();
        if (second != null) {
            return c2220331BvD.LJIIJJI(second, iIntValue);
        }
        if (first == null) {
            return c2220331BvD.LJIIJJI(EnumC2221121BwU.INVALID_ARG, iIntValue);
        }
        if (first.length == 0) {
            return c2220331BvD.LJIIJJI(EnumC2221121BwU.DATA_EMPTY, iIntValue);
        }
        c2220331BvD.LIZ.LIZ.LJIIJ(str, first, new AObjectS89S0101000_34(c2220331BvD, iIntValue, 30));
        return C2220181Buy.LJ;
    }
}
