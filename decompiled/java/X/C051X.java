package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.051X, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C051X {
    public final HashMap<String, Object> LIZ = new HashMap<>();

    public final synchronized JSONObject LIZ() {
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
        return new JSONObject(this.LIZ);
    }
}
