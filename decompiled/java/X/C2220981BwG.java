package X;

import Y.AObjectS89S0101000_34;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BwG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220981BwG extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2220981BwG(C2220331BvD c2220331BvD) {
        super(2, c2220331BvD, C2220331BvD.class, "fstat", "fstat(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        int iIntValue = num.intValue();
        C2220331BvD c2220331BvD = (C2220331BvD) this.receiver;
        c2220331BvD.getClass();
        Integer numLJIL = C2220331BvD.LJIL(jSONObject);
        if (numLJIL != null) {
            c2220331BvD.LIZ.LIZ.LJJLI(numLJIL.intValue(), new AObjectS89S0101000_34(c2220331BvD, iIntValue, 26));
            return C2220181Buy.LJ;
        }
        return c2220331BvD.LJIIIZ(iIntValue, true);
    }
}
