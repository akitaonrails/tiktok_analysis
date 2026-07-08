package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V43, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V43 {
    public static volatile C0V43 LIZ;

    public static JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            C0V44 c0v44 = (C0V44) C792590V7h.LIZ(C0V44.class);
            jSONObject.put("process_usage", c0v44.getCpuRate());
            jSONObject.put("stat_speed", c0v44.LIZ());
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return new JSONObject();
        }
    }

    public static C0V43 LIZIZ() {
        if (LIZ == null) {
            synchronized (C0V43.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new C0V43();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }
}
