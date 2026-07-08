package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dgi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1059900dgi {
    public static void LIZ(JSONObject jSONObject, C0XI4 c0xi4) throws JSONException {
        if (jSONObject != null && jSONObject.length() > 0) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof Integer) {
                    c0xi4.LIZIZ(((Integer) obj).intValue(), next);
                } else if (obj instanceof Long) {
                    c0xi4.LIZJ(((Long) obj).longValue(), next);
                } else if (obj instanceof Double) {
                    c0xi4.LIZ(((Double) obj).doubleValue(), next);
                } else if (obj instanceof String) {
                    c0xi4.LJ(next, (String) obj);
                } else if (obj instanceof JSONObject) {
                    LIZ((JSONObject) obj, c0xi4);
                }
            }
        }
    }

    public static void LIZIZ(Context context, JSONObject jSONObject) {
        Activity activityLIZ;
        try {
            if (!(context instanceof Activity) || (activityLIZ = C1388190mED.LIZ(context)) == null || !C1893760zNe.LIZ(activityLIZ, true)) {
                return;
            }
            String strOptString = jSONObject.optString("type");
            if (C2093608Ic.LJ(strOptString) || strOptString.indexOf(58) >= 0) {
                return;
            }
            C0XI4 c0xi4 = new C0XI4("sslocal://".concat(strOptString));
            LIZ(jSONObject.optJSONObject("args"), c0xi4);
            C1039210d9L.LIZIZ(activityLIZ, c0xi4.LJFF());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
