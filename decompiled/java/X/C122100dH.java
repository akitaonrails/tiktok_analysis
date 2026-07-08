package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00dH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C122100dH {
    public boolean LIZ;
    public final Map<String, JSONObject> LIZIZ = new HashMap();

    public final JSONObject LIZIZ() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("default", this.LIZ ? 1 : 0);
            for (Map.Entry entry : ((HashMap) this.LIZIZ).entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static C122100dH LIZ(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        C122100dH c122100dH = new C122100dH();
        boolean z = true;
        if (jSONObject.optInt("default", 1) != 1) {
            z = false;
        }
        c122100dH.LIZ = z;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.equals(next, "default") && (jSONObjectOptJSONObject = jSONObject.optJSONObject(next)) != null) {
                ((HashMap) c122100dH.LIZIZ).put(next, jSONObjectOptJSONObject);
            }
        }
        return c122100dH;
    }
}
