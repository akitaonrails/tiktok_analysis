package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Jf6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C497460Jf6 {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public String LJFF;

    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("startTime", this.LIZ);
            jSONObject.put("cost", this.LIZIZ);
            jSONObject.put("delay", this.LIZJ);
            jSONObject.put("isMessage", String.valueOf(this.LIZLLL));
            jSONObject.put("seqNum", this.LJ);
            jSONObject.put("stack", this.LJFF);
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }
}
