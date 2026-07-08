package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oTL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1474450oTL {
    public static JSONObject LIZ(Throwable th, JSONObject jSONObject) {
        if (th == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("err", th.getMessage());
            jSONObject.put("err_type", th.getClass().getSimpleName());
            Throwable cause = th.getCause();
            if (cause != null) {
                while (true) {
                    Throwable cause2 = cause.getCause();
                    if (cause2 == null) {
                        jSONObject.put("err_inner", cause.getMessage());
                        jSONObject.put("err_type_inner", cause.getClass().getSimpleName());
                        return jSONObject;
                    }
                    cause = cause2;
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        return jSONObject;
    }
}
