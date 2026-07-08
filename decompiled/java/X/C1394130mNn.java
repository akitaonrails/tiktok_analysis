package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mNn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1394130mNn {
    public static JSONObject LIZ(String str) {
        if (str != null) {
            try {
                return new JSONObject(str);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }
}
