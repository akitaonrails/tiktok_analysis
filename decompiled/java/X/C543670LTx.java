package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0LTx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C543670LTx {
    public final HashMap<String, Object> LIZ = new HashMap<>();

    public final synchronized JSONObject LJ() {
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
        return new JSONObject(this.LIZ);
    }

    public final void LIZ(Boolean bool, String str) {
        this.LIZ.put(str, bool);
    }

    public final void LIZIZ(Integer num, String str) {
        this.LIZ.put(str, num);
    }

    public final void LIZJ(Long l, String str) {
        this.LIZ.put(str, l);
    }

    public final void LIZLLL(String str, String str2) {
        this.LIZ.put(str, str2);
    }
}
