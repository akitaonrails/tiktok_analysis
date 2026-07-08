package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ceQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1020040ceQ {
    public JSONObject LIZ;

    public final void LIZ(long j, String str) {
        try {
            if (this.LIZ == null) {
                this.LIZ = new JSONObject();
            }
            this.LIZ.put(str, j);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZIZ(String str, Object obj) {
        try {
            if (this.LIZ == null) {
                this.LIZ = new JSONObject();
            }
            this.LIZ.put(str, obj);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
