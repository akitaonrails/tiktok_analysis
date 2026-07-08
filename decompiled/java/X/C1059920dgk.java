package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dgk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1059920dgk {
    public final WeakReference<Context> LL;

    public C1059920dgk(WeakReference<Context> weakReference) {
        this.LL = weakReference;
    }

    public static Activity LIZ(Context context) {
        if (context == null) {
            return null;
        }
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            return activityLIZ;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return LIZ(((ContextWrapper) context).getBaseContext());
    }

    public final void LIZJ(JSONObject jSONObject) {
        Activity activityLIZ;
        try {
            WeakReference<Context> weakReference = this.LL;
            Context context = null;
            if (weakReference != null) {
                context = weakReference.get();
            }
            if (((!(context instanceof Activity) || (activityLIZ = C1388190mED.LIZ(context)) == null) && (activityLIZ = LIZ(context)) == null) || !C1893760zNe.LIZ(activityLIZ, true)) {
                return;
            }
            String strOptString = jSONObject.optString("type");
            if (C2093608Ic.LJ(strOptString) || strOptString.indexOf(58) >= 0) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C1059990dgr.LIZ().getSSLocalScheme());
            sbLIZ.append("://");
            sbLIZ.append(strOptString);
            C0XI4 c0xi4 = new C0XI4(C2188811AlT.LIZIZ(sbLIZ));
            LIZIZ(jSONObject.optJSONObject("args"), c0xi4);
            C1059990dgr.LIZ().startAdsAppActivity(activityLIZ, c0xi4.LJFF());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZIZ(JSONObject jSONObject, C0XI4 c0xi4) throws JSONException {
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
                } else if (obj instanceof Boolean) {
                    c0xi4.LJ(next, obj.toString());
                } else if (obj instanceof JSONArray) {
                    c0xi4.LJ(next, ((JSONArray) obj).toString());
                } else if (obj instanceof JSONObject) {
                    LIZIZ((JSONObject) obj, c0xi4);
                }
            }
        }
    }
}
