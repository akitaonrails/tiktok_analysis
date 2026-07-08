package X;

import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bw9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220911Bw9 extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2220911Bw9(C2220331BvD c2220331BvD) {
        super(2, c2220331BvD, C2220331BvD.class, "rmdirSync", "rmdirSync(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        JSONObject jSONObject2 = jSONObject;
        int iIntValue = num.intValue();
        C2220331BvD c2220331BvD = (C2220331BvD) this.receiver;
        c2220331BvD.getClass();
        String strLJIILJJIL = C2220331BvD.LJIILJJIL("dirPath", jSONObject2);
        if (strLJIILJJIL == null && (strLJIILJJIL = C2220331BvD.LJIILJJIL("path", jSONObject2)) == null) {
            return c2220331BvD.LJIIIZ(iIntValue, false);
        }
        return c2220331BvD.LIZ.LIZ.LIZIZ(strLJIILJJIL, jSONObject2.optBoolean("recursive", false)).LIZ();
    }
}
