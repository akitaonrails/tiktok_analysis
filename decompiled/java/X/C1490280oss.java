package X;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oss, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1490280oss {
    public static boolean LIZ(Object obj) {
        JSONObject jSONObject;
        if (obj instanceof String) {
            if (((String) obj).length() > 0) {
                return true;
            }
            return false;
        }
        if (obj instanceof JSONObject) {
            if (((JSONObject) obj).length() > 0) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof C1490270osr)) {
            return false;
        }
        C1490270osr c1490270osr = (C1490270osr) obj;
        if (!TextUtils.isEmpty(c1490270osr.LIZ) || ((jSONObject = c1490270osr.LIZIZ) != null && jSONObject.length() > 0)) {
            return true;
        }
        return false;
    }
}
