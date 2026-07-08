package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0PSK, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0PSK {
    public boolean LIZ;

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reuse", this.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return C786410Ut5.J3(jSONObject);
    }
}
