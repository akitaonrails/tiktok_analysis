package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00mx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C182100mx {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, String str3, String str4, boolean z, String str5, String str6) {
        int i;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            i = 0;
        } else {
            i = 1;
        }
        try {
            jSONObject.putOpt("code", Integer.valueOf(i));
            jSONObject.putOpt("trigger_business_name", str);
            jSONObject.putOpt("trigger_type", str2);
            jSONObject.putOpt("rule_name", str3);
            jSONObject.putOpt("rules_pkg_name", str4);
            C189200o6.m2constructorimpl(jSONObject.putOpt("client_log_id", str5));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            C189200o6.m2constructorimpl(jSONObject3.putOpt("error_msg", str6));
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        C1CC2.LIZJ("ttlive_trigger_result_monitor", jSONObject, jSONObject2, jSONObject3);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("trigger_result_monitor");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LJJIIJZLJL(jSONObject3);
        c474500IjALIZ.LIZ();
    }
}
