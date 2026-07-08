package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00Y6, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00Y6 {
    public static final JSONObject LIZ(JSONObject jSONObject) {
        try {
            return new JSONObject(C786410Ut5.J3(jSONObject));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new JSONObject();
        }
    }
}
