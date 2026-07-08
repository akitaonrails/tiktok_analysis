package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cl4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1024160cl4 {
    public JSONObject LIZ;

    public final void LIZ(String str, Object obj) {
        try {
            if (this.LIZ == null) {
                this.LIZ = new JSONObject();
            }
            this.LIZ.put(str, obj);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
    }
}
