package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14Ad, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20220914Ad {
    public final double LIZ;
    public final double LIZIZ;
    public final double LIZJ;
    public final long LIZLLL;

    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("alpha", Math.round(Math.toDegrees(this.LIZ) * 100.0d) / 100.0d);
            jSONObject.put("beta", Math.round(Math.toDegrees(this.LIZIZ) * 100.0d) / 100.0d);
            jSONObject.put("gamma", Math.round(Math.toDegrees(this.LIZJ) * 100.0d) / 100.0d);
            jSONObject.put("time", this.LIZLLL);
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    public C20220914Ad(double d, double d2, double d3, long j) {
        this.LIZ = d;
        this.LIZIZ = d2;
        this.LIZJ = d3;
        this.LIZLLL = j;
    }
}
