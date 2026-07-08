package X;

import Y.AObjectS89S0101000_34;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bw8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220901Bw8 extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2220901Bw8(C2220331BvD c2220331BvD) {
        super(2, c2220331BvD, C2220331BvD.class, "readdir", "readdir(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        int iIntValue = num.intValue();
        C2220331BvD c2220331BvD = (C2220331BvD) this.receiver;
        C2220391BvJ c2220391BvJ = c2220331BvD.LIZ;
        InterfaceC2220701Bvo interfaceC2220701Bvo = c2220391BvJ.LIZ;
        Pair pairLJIILLIIL = C2220331BvD.LJIILLIIL(c2220331BvD, jSONObject);
        boolean zBooleanValue = ((Boolean) pairLJIILLIIL.getFirst()).booleanValue();
        String str = (String) pairLJIILLIIL.getSecond();
        if (zBooleanValue && str != null) {
            interfaceC2220701Bvo.LJ(str, new AObjectS89S0101000_34(c2220391BvJ, iIntValue, 14));
            return C2220181Buy.LJ;
        }
        return c2220331BvD.LJIIIZ(iIntValue, true);
    }
}
