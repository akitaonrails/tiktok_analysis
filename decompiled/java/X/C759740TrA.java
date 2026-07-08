package X;

import android.net.Uri;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0TrA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C759740TrA {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(JSONObject jSONObject, Function1 function1) throws JSONException {
        jSONObject.put("priority_region", C1717770unn.LJIIIIZZ().getCurrentRegionCode());
        if (function1 != null) {
            function1.invoke(jSONObject);
        }
    }

    public static void LIZIZ(int i, String str, JSONObject jSONObject) throws JSONException {
        Uri uriLIZLLL = C759510Tqn.LIZLLL(str, "stellar addWebCommonParams");
        if (uriLIZLLL != null) {
            jSONObject.put("url", str);
            jSONObject.put("url_host", uriLIZLLL.getHost());
            jSONObject.put("url_path", uriLIZLLL.getPath());
            jSONObject.put("retried_times", i);
        }
    }

    public static void LIZJ(String str, String str2, long j, Integer num, Integer num2, String str3, String str4, Function1 function1, int i) throws JSONException {
        int i2;
        if ((i & 4) != 0) {
            j = -1;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            num2 = null;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        if ((i & 64) != 0) {
            str4 = null;
        }
        if ((i & 128) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        if ((i & 256) != 0) {
            function1 = null;
        }
        JSONObject jSONObject = new JSONObject();
        LIZ(jSONObject, function1);
        LIZIZ(i2, str, jSONObject);
        jSONObject.put("step", str2);
        jSONObject.put("time_duration", j);
        if (num != null) {
            jSONObject.put("load_from_gecko", num.intValue());
        }
        if (num2 != null) {
            num2.intValue();
            jSONObject.put("success", num2.intValue());
        }
        if (str3 != null) {
            jSONObject.put("error_code", str3);
        }
        if (str4 != null) {
            jSONObject.put("error_msg", str4);
        }
        C1725270uzt.LJ(C1725270uzt.LIZ, "rd_pipo_stellar_web_load", jSONObject, null, 12);
    }
}
