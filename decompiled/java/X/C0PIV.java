package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0PIV, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PIV {
    public static final JSONArray LIZ(String str) {
        boolean z;
        String str2;
        if (str != null) {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str2 = str;
            } else {
                str2 = null;
            }
            if (str2 != null) {
                try {
                    return new JSONArray(str);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return null;
    }

    public static final JSONObject LIZIZ(String str) {
        boolean z;
        String str2;
        if (str != null) {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str2 = str;
            } else {
                str2 = null;
            }
            if (str2 != null) {
                try {
                    return new JSONObject(str);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return null;
    }
}
