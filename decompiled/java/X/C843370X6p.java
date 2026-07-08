package X;

import android.webkit.WebView;
import com.bytedance.android.monitorV2.webview.WebViewMonitorHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0X6p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C843370X6p {
    public final C0X6O LIZ = new C0X6O();
    public final C0X6X LIZIZ = new C0X6X();
    public final C843390X6r LIZJ = new C843390X6r();

    public final void LIZ(WebView webView, C0X6H c0x6h, String str) throws JSONException {
        this.LIZ.LIZIZ = false;
        C843390X6r c843390X6r = this.LIZJ;
        c843390X6r.LIZIZ = str;
        c843390X6r.LIZ = c0x6h.getCode();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("res_loader_name", "webview_intercept");
        jSONObject2.put("res_loader_version", "1.0");
        jSONObject.put("res_loader_info", jSONObject2);
        jSONObject.put("res_info", C0X71.LIZIZ(this));
        jSONObject.put("res_load_error", C0X71.LIZ(this));
        if (this.LIZ.LIZLLL) {
            WebViewMonitorHelper.getInstance().handleNativeInfo(webView, "res_loader_error_template", jSONObject);
        } else {
            WebViewMonitorHelper.getInstance().handleNativeInfo(webView, "res_loader_error", jSONObject);
        }
    }
}
