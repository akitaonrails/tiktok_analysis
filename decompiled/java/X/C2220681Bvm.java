package X;

import Y.AObjectS320S0200000_34;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bvm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220681Bvm extends C2217421BqW implements InterfaceC1631620sYq<JSONObject, Map<String, ? extends byte[]>, Integer, C2220181Buy> {
    public C2220681Bvm(C2220331BvD c2220331BvD) {
        super(3, c2220331BvD, C2220331BvD.class, "decompressBuffer", "decompressBuffer(Lorg/json/JSONObject;Ljava/util/Map;Ljava/lang/Integer;)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final C2220181Buy invoke(JSONObject jSONObject, Map<String, ? extends byte[]> map, Integer num) {
        JSONObject jSONObject2 = jSONObject;
        Integer num2 = num;
        C2220331BvD c2220331BvD = (C2220331BvD) this.receiver;
        c2220331BvD.getClass();
        if (jSONObject2 != null && num2 != null) {
            C2220391BvJ c2220391BvJ = c2220331BvD.LIZ;
            InterfaceC2220701Bvo interfaceC2220701Bvo = c2220391BvJ.LIZ;
            String strLJIIZILJ = C2220331BvD.LJIIZILJ(c2220331BvD, jSONObject2);
            if (strLJIIZILJ == null) {
                return c2220331BvD.LJIIIZ(num2.intValue(), true);
            }
            String lowerCase = jSONObject2.optString("compression", "br").toLowerCase(Locale.ROOT);
            if (!Intrinsics.LJFF(lowerCase, "br")) {
                return c2220331BvD.LJIIJJI(EnumC2221121BwU.INVALID_ARG, num2.intValue());
            }
            interfaceC2220701Bvo.LIZLLL(strLJIIZILJ, lowerCase, new AObjectS320S0200000_34(c2220391BvJ, num2, 0), true);
            return C2220181Buy.LJ;
        }
        return C2220181Buy.LIZLLL;
    }
}
