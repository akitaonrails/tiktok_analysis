package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AFq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2176401AFq {
    public int LIZ;
    public int LIZIZ = -1;
    public EnumC2176421AFs LIZJ = EnumC2176421AFs.V3_EVENT;
    public EnumC2176431AFt LIZLLL = EnumC2176431AFt.l_0_60;

    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event", "sdk_event_latency");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("stage", 2);
            jSONObject2.put("event_priority", this.LIZIZ);
            jSONObject2.put("event_type", this.LIZJ.getLabel());
            jSONObject2.put("interval_scope", this.LIZLLL.toString());
            jSONObject2.put("event_count", this.LIZ);
            jSONObject.put("params", jSONObject2);
            jSONObject.put("local_time_ms", System.currentTimeMillis());
            jSONObject.put("event_id", C830270Whd.LIZIZ.incrementAndGet());
            jSONObject.put("datetime", C830270Whd.LIZ());
            return jSONObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return jSONObject;
        }
    }
}
