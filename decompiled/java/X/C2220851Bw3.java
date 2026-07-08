package X;

import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bw3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220851Bw3 extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2220851Bw3(C2220331BvD c2220331BvD) {
        super(2, c2220331BvD, C2220331BvD.class, "mkdirSync", "mkdirSync(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        JSONObject jSONObject2 = jSONObject;
        int iIntValue = num.intValue();
        C2220331BvD c2220331BvD = (C2220331BvD) this.receiver;
        InterfaceC2220701Bvo interfaceC2220701Bvo = c2220331BvD.LIZ.LIZ;
        String strLJIIZILJ = C2220331BvD.LJIIZILJ(c2220331BvD, jSONObject2);
        if (strLJIIZILJ == null) {
            return c2220331BvD.LJIIIZ(iIntValue, false);
        }
        if (jSONObject2.has("recursive") && !(jSONObject2.opt("recursive") instanceof Boolean)) {
            return c2220331BvD.LJIIIZ(iIntValue, false);
        }
        return interfaceC2220701Bvo.LJIJJ(strLJIIZILJ, jSONObject2.optBoolean("recursive", false)).LIZ();
    }
}
