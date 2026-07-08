package X;

import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bvj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220651Bvj extends C2217421BqW implements InterfaceC1631620sYq<JSONObject, Map<String, ? extends byte[]>, Integer, C2220181Buy> {
    public C2220651Bvj(C2220331BvD c2220331BvD) {
        super(3, c2220331BvD, C2220331BvD.class, "decompressBufferSync", "decompressBufferSync(Lorg/json/JSONObject;Ljava/util/Map;Ljava/lang/Integer;)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final C2220181Buy invoke(JSONObject jSONObject, Map<String, ? extends byte[]> map, Integer num) {
        JSONObject jSONObject2 = jSONObject;
        C2220331BvD c2220331BvD = (C2220331BvD) this.receiver;
        if (jSONObject2 == null) {
            c2220331BvD.getClass();
            return C2220181Buy.LIZLLL;
        }
        InterfaceC2220701Bvo interfaceC2220701Bvo = c2220331BvD.LIZ.LIZ;
        String strLJIIZILJ = C2220331BvD.LJIIZILJ(c2220331BvD, jSONObject2);
        if (strLJIIZILJ == null) {
            return C2220181Buy.LIZLLL;
        }
        String lowerCase = jSONObject2.optString("compression", "br").toLowerCase(Locale.ROOT);
        if (!Intrinsics.LJFF(lowerCase, "br")) {
            return C2220251Bv5.LIZ(EnumC2221121BwU.INVALID_ARG, "compression must be 'br'").LIZ();
        }
        return interfaceC2220701Bvo.LJIJJLI(strLJIIZILJ, lowerCase, true).LIZIZ();
    }
}
