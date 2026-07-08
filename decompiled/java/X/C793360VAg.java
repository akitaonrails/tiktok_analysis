package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VAg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793360VAg extends AbstractC793340VAe {
    public int LJ;
    public String LJFF;

    public final JSONObject LIZIZ() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("flags", this.LJ);
            jSONObject.put("tag", this.LJFF);
            jSONObject.put("start_time", this.LIZ);
            jSONObject.put("end_time", this.LIZIZ);
            jSONObject.put("thread_name", this.LIZJ);
            jSONObject.put("thread_stack", LIZ());
            return jSONObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WakeLockInfo{flags=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", tag=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", threadName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", threadStack=");
        sbLIZ.append(LIZ());
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
