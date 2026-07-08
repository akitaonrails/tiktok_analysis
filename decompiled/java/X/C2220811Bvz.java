package X;

import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bvz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220811Bvz extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2220811Bvz(C2220331BvD c2220331BvD) {
        super(2, c2220331BvD, C2220331BvD.class, "readFileArrayBufferSync", "readFileArrayBufferSync(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
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
        return interfaceC2220701Bvo.LJJJZ(0, -1, str, "binary").LIZ();
    }
}
