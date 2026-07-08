package X;

import Y.AObjectS89S0101000_34;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BwJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2221011BwJ extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2221011BwJ(C2220331BvD c2220331BvD) {
        super(2, c2220331BvD, C2220331BvD.class, "unzip", "unzip(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        JSONObject jSONObject2 = jSONObject;
        int iIntValue = num.intValue();
        C2220331BvD c2220331BvD = (C2220331BvD) this.receiver;
        c2220331BvD.getClass();
        String strLJIILJJIL = C2220331BvD.LJIILJJIL("zipFilePath", jSONObject2);
        if (strLJIILJJIL == null && (strLJIILJJIL = C2220331BvD.LJIILJJIL("zipPath", jSONObject2)) == null) {
            return c2220331BvD.LJIIIZ(iIntValue, true);
        }
        String strLJIILJJIL2 = C2220331BvD.LJIILJJIL("targetPath", jSONObject2);
        if (strLJIILJJIL2 == null && (strLJIILJJIL2 = C2220331BvD.LJIILJJIL("destPath", jSONObject2)) == null) {
            return c2220331BvD.LJIIIZ(iIntValue, true);
        }
        c2220331BvD.LIZ.LIZ.LJJJJLL(strLJIILJJIL, strLJIILJJIL2, new AObjectS89S0101000_34(c2220331BvD, iIntValue, 3));
        return C2220181Buy.LJ;
    }
}
