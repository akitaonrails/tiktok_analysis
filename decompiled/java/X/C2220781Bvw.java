package X;

import java.util.Collections;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bvw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220781Bvw extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2220781Bvw(C2220331BvD c2220331BvD) {
        super(2, c2220331BvD, C2220331BvD.class, "renameSync", "renameSync(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        JSONObject jSONObject2 = jSONObject;
        int iIntValue = num.intValue();
        C2220331BvD c2220331BvD = (C2220331BvD) this.receiver;
        c2220331BvD.getClass();
        Pair pairLJIILIIL = C2220331BvD.LJIILIIL(Collections.singletonList("oldPath"), jSONObject2);
        boolean zBooleanValue = ((Boolean) pairLJIILIIL.getFirst()).booleanValue();
        String str = (String) pairLJIILIIL.getSecond();
        Pair pairLJIILIIL2 = C2220331BvD.LJIILIIL(Collections.singletonList("newPath"), jSONObject2);
        boolean zBooleanValue2 = ((Boolean) pairLJIILIIL2.getFirst()).booleanValue();
        String str2 = (String) pairLJIILIIL2.getSecond();
        if (zBooleanValue && str != null && zBooleanValue2 && str2 != null) {
            return c2220331BvD.LIZ.LIZ.LJJJJZI(str, str2).LIZ();
        }
        return c2220331BvD.LJIIIZ(iIntValue, false);
    }
}
