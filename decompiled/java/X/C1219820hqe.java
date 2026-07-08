package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hqe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1219820hqe {
    public static final C1219820hqe LIZ = new C1219820hqe();
    public static long LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;

    public static void LIZ(boolean z, String str) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("start_preload_node", LIZJ - LIZIZ);
            jSONObject.put("preload_duration", LIZLLL - LIZJ);
            jSONObject.put("end_preload_node", LIZLLL - LIZIZ);
            if (z) {
                str2 = "success";
            } else {
                str2 = "fail";
            }
            jSONObject.put("result", str2);
            C189200o6.m2constructorimpl(jSONObject.put("error_msg", str));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C20684815ws.LJIJ("story_inbox_preload_perf", jSONObject);
    }
}
