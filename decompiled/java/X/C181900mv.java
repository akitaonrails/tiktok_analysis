package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00mv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C181900mv {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("biz", str);
            jSONObject.putOpt("guide_type", str2);
            C189200o6.m2constructorimpl(jSONObject.putOpt("content", str3));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.putOpt("biz", str);
            jSONObject3.putOpt("guide_type", str2);
            C189200o6.m2constructorimpl(jSONObject3.putOpt("content", str3));
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        C1CC2.LIZJ("ttlive_client_ai_algorithm_output_monitor", jSONObject, jSONObject2, jSONObject3);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("client_ai_algorithm_output_monitor");
        c474500IjALIZ.LJJII(str, "biz");
        c474500IjALIZ.LJJII(str2, "guide_type");
        c474500IjALIZ.LJJII(str3, "content");
        c474500IjALIZ.LIZ();
    }
}
