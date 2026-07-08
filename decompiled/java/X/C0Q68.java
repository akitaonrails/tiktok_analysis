package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Q68, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q68 {
    public static final Integer LIZ(String str, JSONObject jSONObject) {
        if (jSONObject.has(str)) {
            return Integer.valueOf(JSONObjectProtectorUtils.getInt(jSONObject, str));
        }
        return null;
    }

    public static final String LIZIZ(String str, JSONObject jSONObject) {
        if (jSONObject.has(str)) {
            String string = JSONObjectProtectorUtils.getString(jSONObject, str);
            if (string.length() > 0) {
                return string;
            }
            return null;
        }
        return null;
    }
}
