package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VAf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793350VAf extends AbstractC793340VAe {
    public int LJ;
    public long LJFF;
    public String LJI;

    public final JSONObject LIZIZ() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("start_time", this.LIZ);
            jSONObject.put("end_time", this.LIZIZ);
            jSONObject.put("thread_name", this.LIZJ);
            jSONObject.put("thread_stack", LIZ());
            jSONObject.put("interval", this.LJFF);
            jSONObject.put("type", this.LJ);
            jSONObject.put("intent_info", this.LJI);
            return jSONObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AlarmInfo{type=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", interval=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", intentInfo=");
        sbLIZ.append(this.LJI);
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
