package X;

import Y.AObjectS89S0101000_34;
import java.util.Locale;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bvl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220671Bvl extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2220671Bvl(C2220331BvD c2220331BvD) {
        super(2, c2220331BvD, C2220331BvD.class, "decompress", "decompress(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        JSONObject jSONObject2 = jSONObject;
        int iIntValue = num.intValue();
        C2220331BvD c2220331BvD = (C2220331BvD) this.receiver;
        C2220391BvJ c2220391BvJ = c2220331BvD.LIZ;
        InterfaceC2220701Bvo interfaceC2220701Bvo = c2220391BvJ.LIZ;
        String strLJIIZILJ = C2220331BvD.LJIIZILJ(c2220331BvD, jSONObject2);
        if (strLJIIZILJ == null) {
            return c2220331BvD.LJIIIZ(iIntValue, true);
        }
        String lowerCase = jSONObject2.optString("compression", "br").toLowerCase(Locale.ROOT);
        if (!Intrinsics.LJFF(lowerCase, "br")) {
            return C2220251Bv5.LIZ(EnumC2221121BwU.INVALID_ARG, "compression must be 'br'").LIZ();
        }
        interfaceC2220701Bvo.LIZLLL(strLJIIZILJ, lowerCase, new AObjectS89S0101000_34(c2220391BvJ, iIntValue, 23), false);
        return C2220181Buy.LJ;
    }
}
