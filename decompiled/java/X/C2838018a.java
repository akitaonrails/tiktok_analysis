package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.018a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2838018a {
    public static final /* synthetic */ int LIZ = 0;

    public static final int LIZ(String str) {
        JSONArray jSONArray;
        try {
            jSONArray = new JSONArray(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            jSONArray = null;
            if (0 == 0) {
                return 0;
            }
        }
        int length = jSONArray.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            String strOptString = jSONArray.optString(i2);
            if (strOptString != null && strOptString.length() != 0) {
                try {
                    if (new JSONObject(strOptString).optInt("c") >= 1000) {
                        i++;
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
        return i;
    }
}
