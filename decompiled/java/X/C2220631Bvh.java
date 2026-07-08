package X;

import Y.AObjectS89S0101000_34;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bvh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220631Bvh extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2220631Bvh(C2220331BvD c2220331BvD) {
        super(2, c2220331BvD, C2220331BvD.class, "stat", "stat(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        JSONObject jSONObject2 = jSONObject;
        final int iIntValue = num.intValue();
        final C2220331BvD c2220331BvD = (C2220331BvD) this.receiver;
        c2220331BvD.getClass();
        Pair pairLJIILIIL = C2220331BvD.LJIILIIL(C1697810uHb.LJIIJJI("path", "filePath"), jSONObject2);
        boolean zBooleanValue = ((Boolean) pairLJIILIIL.getFirst()).booleanValue();
        final String str = (String) pairLJIILIIL.getSecond();
        if (zBooleanValue && str != null) {
            if (jSONObject2.has("recursive") && !(jSONObject2.opt("recursive") instanceof Boolean)) {
                return c2220331BvD.LJIIIZ(iIntValue, true);
            }
            if (!jSONObject2.optBoolean("recursive", false)) {
                c2220331BvD.LIZ.LIZ.LJJJIL(str, new AObjectS89S0101000_34(c2220331BvD, iIntValue, 31));
            } else {
                c2220331BvD.LIZ.LIZ.LJJJI(new Function0() { // from class: X.1BwN
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        C2220331BvD c2220331BvD2 = c2220331BvD;
                        String str2 = str;
                        c2220331BvD2.LIZ.LIZIZ.LJJLIIJ(Integer.valueOf(iIntValue), c2220331BvD2.LJFF(str2).LIZ());
                        return Unit.LIZ;
                    }
                });
            }
            return C2220181Buy.LJ;
        }
        return c2220331BvD.LJIIIZ(iIntValue, true);
    }
}
