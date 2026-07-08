package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jFu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1273920jFu {
    public JSONObject LIZ;
    public C1D47 LIZIZ;

    public final JSONObject LIZ() {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObject = this.LIZ;
        if (jSONObject == null) {
            return null;
        }
        boolean z = jSONObject.optInt("enable_override_sdk_params", -1) == 1;
        C1D47 c1d47 = this.LIZIZ;
        String str = c1d47 != null ? c1d47.LJJII : null;
        if (!z || c1d47 == null || TextUtils.isEmpty(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getFinalSdkParams: return2. enableOverrideSdkParams=");
            sbLIZ.append(z);
            sbLIZ.append("; gearIdentifier=");
            sbLIZ.append(str);
            sbLIZ.append("; mVideoQualityResultIsNull=");
            sbLIZ.append(this.LIZIZ == null);
            C2188811AlT.LIZIZ(sbLIZ);
            return this.LIZ;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            Iterator<String> itKeys = this.LIZ.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject2.put(next, this.LIZ.opt(next));
            }
            jSONObject2.put("gear_identifier", str);
            JSONObject jSONObjectOptJSONObject = this.LIZ.optJSONObject("ProbeSpeedResolutionBaseMap");
            if (jSONObjectOptJSONObject != null) {
                Object objOpt = jSONObjectOptJSONObject.opt(str);
                if ((objOpt instanceof String) && (jSONArrayOptJSONArray = this.LIZ.optJSONArray((String) objOpt)) != null) {
                    jSONObject2.put("ProbeSpeedResolutionBase", jSONArrayOptJSONArray);
                }
            }
            return jSONObject2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return this.LIZ;
        }
    }
}
