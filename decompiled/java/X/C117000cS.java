package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00cS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C117000cS {
    public static JSONObject LIZ(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    if (TextUtils.equals("log_pb", str)) {
                        jSONObject.put(str, new JSONObject(map.get(str)));
                    } else {
                        jSONObject.put(str, map.get(str));
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return jSONObject;
    }
}
