package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VgJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C803970VgJ {
    public long LIZ;
    public long LIZIZ;
    public int LIZJ;
    public long LIZLLL;
    public long LJ;
    public String LJFF;
    public String LJI;
    public String LJII;

    public final JSONObject LIZ() {
        if (this.LIZ == 0) {
            return null;
        }
        int i = this.LIZJ;
        if (i != 2 && i != 4) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cost", this.LIZ);
            jSONObject.put("longMsgEnd", this.LIZIZ);
            if (this.LIZJ == 4) {
                jSONObject.put("when", this.LIZLLL);
                jSONObject.put("what", this.LJ);
                jSONObject.put("target", this.LJFF);
                C0VJO.LJIIIIZZ(jSONObject, this.LJI, this.LJII);
                return jSONObject;
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return jSONObject;
    }
}
