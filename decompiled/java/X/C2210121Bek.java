package X;

import com.bytedance.applog.engine.Session;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bek, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2210121Bek {
    public long LIZ;
    public String LIZIZ;
    public boolean LIZJ;
    public String LIZLLL;
    public boolean LJ;
    public String LJFF;
    public JSONObject LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;

    public final String LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("start_time", this.LIZ);
            jSONObject.put("session_id", this.LIZIZ);
            jSONObject.put("is_front_continuous", this.LIZJ);
            jSONObject.put("front_session_id", this.LIZLLL);
            jSONObject.put("is_end_continuous", this.LJ);
            jSONObject.put("end_session_id", this.LJFF);
            jSONObject.put("latest_end_time", this.LJII);
            jSONObject.put("non_task_time", this.LJIIIIZZ);
            jSONObject.put("tea_event_index", this.LJIIIZ);
            JSONObject jSONObject2 = this.LJI;
            if (jSONObject2 != null) {
                jSONObject.put("flatParams", jSONObject2);
            }
            return C786410Ut5.J3(jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public final String toString() {
        return LIZ();
    }

    public C2210121Bek() {
    }

    public C2210121Bek(long j, long j2) {
        this.LIZ = j;
        this.LIZIZ = Session.LIZJ();
        this.LJIIIZ = j2;
    }
}
