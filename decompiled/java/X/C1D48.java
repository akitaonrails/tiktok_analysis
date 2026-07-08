package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1D48, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D48 {
    public C1D41 LIZ;

    public final void LIZ(C1D49 c1d49, int i, int i2, long j, int i3) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() - j;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("speedtest_duration", jCurrentTimeMillis);
            jSONObject.put("speedtest_result", c1d49.LIZIZ);
            jSONObject.put("definition_recommend", c1d49.LIZJ());
            jSONObject.put("error_code", i);
            jSONObject.put("live_core_error_code", i3);
            jSONObject.put("use_probe_result", i2);
            jSONObject.put("call_livecore_speedtest_timestamp", j);
            C1D41 c1d41 = this.LIZ;
            if (c1d41 != null) {
                c1d41.onEvent("livesdk_golive_speedtest", jSONObject);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
