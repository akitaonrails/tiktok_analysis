package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08HV, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08HV {
    public final JSONObject LIZ;
    public final Map<String, String> LIZIZ;
    public final Map<String, String> LIZJ;

    public C08HV(String str) {
        if (str != null) {
            try {
                this.LIZ = new JSONObject(str);
                this.LIZIZ = LIZ("custom_error_tracking");
                this.LIZJ = LIZ("click_type");
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final Map<String, String> LIZ(String str) {
        if (this.LIZ.has(str)) {
            HashMap map = new HashMap();
            try {
                JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(this.LIZ, str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject.optString(next, ""));
                }
                return map;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }
}
