package X;

import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bvg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220621Bvg extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2220621Bvg(C2220331BvD c2220331BvD) {
        super(2, c2220331BvD, C2220331BvD.class, "statSync", "statSync(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        C2220221Bv2 c2220221Bv2LJFF;
        JSONObject jSONObject2 = jSONObject;
        int iIntValue = num.intValue();
        C2220331BvD c2220331BvD = (C2220331BvD) this.receiver;
        c2220331BvD.getClass();
        Pair pairLJIILIIL = C2220331BvD.LJIILIIL(C1697810uHb.LJIIJJI("path", "filePath"), jSONObject2);
        boolean zBooleanValue = ((Boolean) pairLJIILIIL.getFirst()).booleanValue();
        String str = (String) pairLJIILIIL.getSecond();
        if (zBooleanValue && str != null) {
            if (jSONObject2.has("recursive") && !(jSONObject2.opt("recursive") instanceof Boolean)) {
                return c2220331BvD.LJIIIZ(iIntValue, false);
            }
            if (!jSONObject2.optBoolean("recursive", false)) {
                c2220221Bv2LJFF = c2220331BvD.LIZ.LIZ.LJJLIIIJ(str);
            } else {
                c2220221Bv2LJFF = c2220331BvD.LJFF(str);
            }
            return c2220221Bv2LJFF.LIZ();
        }
        return c2220331BvD.LJIIIZ(iIntValue, false);
    }
}
