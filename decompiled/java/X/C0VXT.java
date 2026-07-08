package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VXT, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VXT {
    public final String LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final JSONObject LJ;
    public final JSONObject LJFF;

    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("log_type", "service_monitor");
            jSONObject.put("event_type", "exception");
            jSONObject.put("service", this.LIZJ);
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, this.LIZLLL);
            jSONObject.put("category", this.LJ);
            jSONObject.put("metric", this.LJFF);
            jSONObject.put("sid", C0VX9.LIZJ());
            jSONObject.put("timestamp", System.currentTimeMillis());
            jSONObject.put("crash_time", this.LIZIZ);
            jSONObject.put("process_name", C802270VdZ.LIZJ());
            jSONObject.put("crash_thread_name", this.LIZ);
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    public C0VXT(String str, long j, String str2, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = str2;
        this.LIZLLL = i;
        this.LJ = jSONObject;
        this.LJFF = jSONObject2;
    }
}
