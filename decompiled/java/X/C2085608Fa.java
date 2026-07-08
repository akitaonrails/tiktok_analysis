package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URL;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08Fa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2085608Fa {
    public static JSONObject LIZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            String strOptString = jSONObject.optString("url");
            if (!TextUtils.isEmpty(strOptString)) {
                String host = new URL(strOptString).getHost();
                if (!TextUtils.isEmpty(host)) {
                    jSONObject.put("host", host);
                }
            }
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
