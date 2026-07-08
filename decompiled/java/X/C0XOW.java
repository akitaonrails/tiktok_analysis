package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XOW, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XOW {
    public static final Regex LIZ = new Regex("^(\\+[0-9]{1,4})?1234[0-9]{7}$");
    public static final Regex LIZIZ = new Regex("[^\\d]");
    public static String LIZJ;

    public static void LIZ(int i, String str, String str2, boolean z) {
        int i2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("request_domain", str);
            jSONObject.put("result_domain", str2);
            jSONObject.put("error_code", i);
            if (z) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("bypass_tnc", i2);
            C0XG9.LJ("ttp_get_region_result", jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
