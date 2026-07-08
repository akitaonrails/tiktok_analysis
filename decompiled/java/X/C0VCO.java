package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VCO, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VCO extends C0VCW {
    public JSONObject LIZIZ;

    public final JSONObject LIZIZ(C0VCI c0vci) {
        try {
            if (this.LIZIZ == null) {
                this.LIZIZ = new JSONObject();
            }
            this.LIZIZ.put("log_type", (Object) null);
            if (this.LIZIZ.isNull("timestamp")) {
                this.LIZIZ.put("timestamp", 0L);
            }
            LIZ(this.LIZIZ);
            return this.LIZIZ;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
