package X;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Eeq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C369900Eeq {
    public static final String LIZ(Effect effect) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        boolean z;
        try {
            C1446130njf.LIZ.getClass();
            JSONObject jSONObjectLJIIIZ = C1446130njf.LJIIIZ(effect);
            if (jSONObjectLJIIIZ != null && (jSONObjectOptJSONObject = jSONObjectLJIIIZ.optJSONObject("setting")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("effect_adjust_params")) != null) {
                JSONObject jSONObject = new JSONObject();
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(jSONArrayOptJSONArray, i);
                    String strOptString = jSONObject2.optString("effect_key");
                    double dOptDouble = jSONObject2.optDouble("default");
                    if (strOptString == null || strOptString.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z && !Double.isNaN(dOptDouble)) {
                        jSONObject.put(strOptString, dOptDouble);
                    }
                }
                return C786410Ut5.J3(jSONObject);
            }
            return null;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return "{}";
        }
    }
}
