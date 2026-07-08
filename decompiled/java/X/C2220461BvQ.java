package X;

import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BvQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220461BvQ extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2220461BvQ(C2220331BvD c2220331BvD) {
        super(2, c2220331BvD, C2220331BvD.class, "closeSync", "closeSync(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        JSONObject jSONObject2 = jSONObject;
        int iIntValue = num.intValue();
        C2220331BvD c2220331BvD = (C2220331BvD) this.receiver;
        c2220331BvD.getClass();
        Integer numLJIL = C2220331BvD.LJIL(jSONObject2);
        if (numLJIL != null) {
            int iIntValue2 = numLJIL.intValue();
            C2220221Bv2 c2220221Bv2LJI = c2220331BvD.LIZ.LIZ.LJI(iIntValue2);
            if (c2220221Bv2LJI.LIZIZ.LIZ) {
                c2220331BvD.LIZIZ.remove(Integer.valueOf(iIntValue2));
            }
            return c2220221Bv2LJI.LIZ();
        }
        if (jSONObject2.has("fd")) {
            return C2220331BvD.LJIIL(EnumC2221121BwU.BAD_FD);
        }
        return c2220331BvD.LJIIIZ(iIntValue, false);
    }
}
