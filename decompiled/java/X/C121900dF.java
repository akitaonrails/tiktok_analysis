package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00dF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C121900dF {
    public static void LIZJ(String str, JSONObject jSONObject) {
        try {
            jSONObject.put(str, 1);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZ(String str, String str2, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("err_empty_");
            sbLIZ.append(str2);
            LIZJ(C2188811AlT.LIZIZ(sbLIZ), jSONObject);
        }
    }

    public static void LIZIZ(JSONObject jSONObject, String str, Object obj) {
        if (obj == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("err_null_");
            sbLIZ.append(str);
            LIZJ(C2188811AlT.LIZIZ(sbLIZ), jSONObject);
        }
    }
}
