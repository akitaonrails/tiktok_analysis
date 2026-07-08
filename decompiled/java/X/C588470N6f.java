package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0N6f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C588470N6f {
    public static final C588470N6f LIZ = new C588470N6f();

    public static void LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            C189200o6.m2constructorimpl(jSONObject.put("name", "skylight_request_times"));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C20684815ws.LJIJ("inbox_perf_monitor_internal", jSONObject);
    }
}
