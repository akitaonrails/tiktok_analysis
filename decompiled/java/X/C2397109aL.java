package X;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09aL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2397109aL {
    public static void LIZ(String str, Throwable th) {
        if (th != null && !TextUtils.isEmpty(str)) {
            if ((th instanceof C0XIO) || (th instanceof s)) {
                String stackTraceString = Log.getStackTraceString(th);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("errorUrl", str);
                    jSONObject.put("errorDesc", stackTraceString);
                    jSONObject.put("errorResponse", "");
                    try {
                        if (!TextUtils.isEmpty("")) {
                            jSONObject.put("service", "");
                        }
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    C793770VBv.LJ("aweme_parse_error_log", jSONObject);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
    }
}
