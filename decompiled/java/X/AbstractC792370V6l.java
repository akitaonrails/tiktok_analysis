package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V6l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC792370V6l extends C0V6S {
    public JSONObject LIZIZ;

    public abstract JSONObject LIZLLL();

    public abstract JSONObject LJ();

    public abstract JSONObject LJFF();

    public abstract String LJI();

    @Override // X.C0VB5
    public final String getLogType() {
        return "performance_monitor";
    }

    @Override // X.C0VB5
    public final JSONObject LIZ() {
        try {
            if (this.LIZIZ == null) {
                this.LIZIZ = LIZJ();
            }
            this.LIZIZ.put("log_type", "performance_monitor");
            this.LIZIZ.put("service", LJI());
            JSONObject jSONObjectLJ = LJ();
            if (!C792450V6t.LIZJ(jSONObjectLJ)) {
                this.LIZIZ.put("extra_values", jSONObjectLJ);
            }
            JSONObject jSONObjectLIZLLL = LIZLLL();
            if (!C792450V6t.LIZJ(jSONObjectLIZLLL)) {
                this.LIZIZ.put("extra_status", jSONObjectLIZLLL);
            }
            JSONObject jSONObjectLJFF = LJFF();
            if (!C792450V6t.LIZJ(jSONObjectLJFF)) {
                this.LIZIZ.put("filters", jSONObjectLJFF);
            }
            return this.LIZIZ;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public JSONObject LIZJ() {
        return new JSONObject();
    }
}
