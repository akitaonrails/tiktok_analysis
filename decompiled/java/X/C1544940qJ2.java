package X;

import android.webkit.WebView;
import com.bytedance.hybrid.spark.security.web_js.api.IJSInjectCallback$ErrorCode;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qJ2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1544940qJ2 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(WebView webView, String str, String str2, String str3, IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode) {
        JSONObject jSONObject = new JSONObject();
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("js_name", str2);
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put("error_message", str3);
        jSONObject.put("error_code", iJSInjectCallback$ErrorCode.getCode());
        C828160WeE.LIZIZ(webView, "js_inject_manage_client_error", str, jSONObject, new JSONObject());
    }
}
