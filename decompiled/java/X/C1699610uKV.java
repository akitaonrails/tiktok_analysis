package X;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uKV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1699610uKV {
    public boolean LIZ = true;

    public static boolean LIZ(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject != null && !TextUtils.isEmpty(str) && jSONObject.has(str)) {
            if (jSONObject.optBoolean(str, z)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("please replace True/False with 1/0 for setting :");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                return true;
            }
            if (jSONObject.optInt(str, z ? 1 : 0) == 1) {
                return true;
            }
            return false;
        }
        return z;
    }
}
