package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jBD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1271010jBD implements InterfaceC1266960j4g {
    public final InterfaceC1266960j4g LIZ;
    public int LIZIZ;

    public C1271010jBD(C780270UjB c780270UjB) {
        this.LIZ = c780270UjB;
    }

    @Override // X.InterfaceC1266870j4X
    public final void LIZ(String str, JSONObject jSONObject) {
        InterfaceC1266960j4g interfaceC1266960j4g;
        if (str == null || (interfaceC1266960j4g = this.LIZ) == null) {
            return;
        }
        if (jSONObject != null) {
            try {
                jSONObject.put("livecore_event_index", AbstractC1273900jFs.LL.incrementAndGet());
                jSONObject.put("livecore_app_alive_uuid", AbstractC1273900jFs.LLILLJJLI);
                jSONObject.put("livecore_instance_id", this.LIZIZ);
                long jOptLong = jSONObject.optLong("timestamp", -1L);
                if (jOptLong != -1) {
                    jSONObject.put("ntp_time", jOptLong + ((long) TimeUtils.getServerGapTime()));
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        interfaceC1266960j4g.LIZ(str, jSONObject);
    }
}
