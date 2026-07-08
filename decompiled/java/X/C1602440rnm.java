package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0rnm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1602440rnm {
    public static JSONArray LIZ(String str) {
        boolean z;
        boolean z2 = false;
        if (str != null) {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        if (z2) {
            try {
                return new JSONArray(str);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                return new JSONArray();
            }
        }
        return new JSONArray();
    }
}
