package X;

import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bvy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220801Bvy extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2220801Bvy(C2220331BvD c2220331BvD) {
        super(2, c2220331BvD, C2220331BvD.class, "accessSync", "accessSync(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        num.intValue();
        C2220331BvD c2220331BvD = (C2220331BvD) this.receiver;
        c2220331BvD.getClass();
        Pair pairLJIILL = C2220331BvD.LJIILL(c2220331BvD, jSONObject);
        boolean zBooleanValue = ((Boolean) pairLJIILL.getFirst()).booleanValue();
        String str = (String) pairLJIILL.getSecond();
        if (!zBooleanValue) {
            return C2220331BvD.LJIIL(EnumC2221121BwU.INVALID_ARG);
        }
        return c2220331BvD.LIZ.LIZ.LIZ(str).LIZ();
    }
}
