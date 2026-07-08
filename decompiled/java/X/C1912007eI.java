package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.07eI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1912007eI {
    public static final boolean LIZ(String str) {
        if (str != null && str.length() >= 2) {
            try {
                new JSONObject(str);
                return true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }
}
