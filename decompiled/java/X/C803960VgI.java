package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VgI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C803960VgI {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public int LJ;
    public int LJFF;
    public long LJI;
    public String LJII;
    public long LJIIIIZZ;
    public final Map<String, Long> LJIIIZ = new HashMap();
    public final long LJIIJ = 30000;

    public final long LIZ() {
        long j = this.LJIIJ;
        if (j == 0) {
            return 0L;
        }
        long j2 = ((this.LIZLLL + this.LIZJ) * 100) / j;
        long j3 = (this.LIZ * 100) / j;
        long j4 = (this.LIZIZ * 25) / j;
        this.LJI = j2;
        if (j2 <= 30) {
            this.LJI = j2 + j3;
        }
        if (j3 <= 30) {
            this.LJI += j4;
        }
        if (this.LJI > 500) {
            this.LJI = 500L;
        }
        return this.LJI;
    }

    public final String LIZIZ() {
        String str = this.LJII;
        if (str != null) {
            return str;
        }
        for (Map.Entry entry : ((HashMap) this.LJIIIZ).entrySet()) {
            if (((Long) entry.getValue()).longValue() > this.LJIIIIZZ) {
                this.LJIIIIZZ = ((Long) entry.getValue()).longValue();
                this.LJII = (String) entry.getKey();
            }
        }
        return this.LJII;
    }

    public final JSONObject LIZJ() {
        if (this.LJFF == 0 || this.LIZJ == 0) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("blockGcCost", this.LIZ);
            jSONObject.put("blockGcCount", this.LJ);
            jSONObject.put("gcCount", this.LJFF);
            jSONObject.put("gcCost", this.LIZIZ);
            jSONObject.put("mainWaitCount", 0);
            jSONObject.put("mainWait", this.LIZJ);
            jSONObject.put("mainPerformCount", 0);
            jSONObject.put("mainPerform", this.LIZLLL);
            jSONObject.put("blockGcCause", LIZIZ());
            jSONObject.put("blockGcCauseCost", this.LJIIIIZZ);
            jSONObject.put("gcScore", LIZ());
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }
}
