package X;

import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bw1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220831Bw1 extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2220831Bw1(C2220331BvD c2220331BvD) {
        super(2, c2220331BvD, C2220331BvD.class, "readDirSync", "readDirSync(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        int iIntValue = num.intValue();
        C2220331BvD c2220331BvD = (C2220331BvD) this.receiver;
        InterfaceC2220701Bvo interfaceC2220701Bvo = c2220331BvD.LIZ.LIZ;
        Pair pairLJIILL = C2220331BvD.LJIILL(c2220331BvD, jSONObject);
        boolean zBooleanValue = ((Boolean) pairLJIILL.getFirst()).booleanValue();
        String str = (String) pairLJIILL.getSecond();
        if (!zBooleanValue) {
            return c2220331BvD.LJIIIZ(iIntValue, false);
        }
        return interfaceC2220701Bvo.LJJIIJ(str).LIZ();
    }
}
