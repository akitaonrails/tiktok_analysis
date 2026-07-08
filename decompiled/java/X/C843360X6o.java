package X;

import android.webkit.WebView;
import com.bytedance.android.monitorV2.webview.WebViewMonitorHelper;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0X6o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C843360X6o {
    public final C0X6L LIZ = new C0X6L();
    public final C0X6W LIZIZ = new C0X6W();
    public final C843380X6q LIZJ = new C843380X6q();

    public final void LIZ(WebView webView, C0X6F c0x6f, String str, C0X61 c0x61, C0X70 c0x70) throws JSONException {
        Map<String, Object> map;
        this.LIZ.LIZIZ = false;
        C843380X6q c843380X6q = this.LIZJ;
        c843380X6q.LIZIZ = str;
        c843380X6q.LIZ = c0x6f.getCode();
        Map<? extends String, ? extends Object> mapLIZIZ = C0X72.LIZIZ(this);
        Map<? extends String, ? extends Object> mapLIZJ = C0X72.LIZJ(this, webView);
        Map<? extends String, ? extends Object> mapLIZ = C0X72.LIZ(this);
        if (c0x61 == C0X61.RESOURCE_INTERCEPT && ((Boolean) C843290X6h.LJIIJJI.getValue()).booleanValue()) {
            if (c0x70 != null) {
                Map<String, Object> map2 = c0x70.LIZ;
                if (map2 != null) {
                    map2.putAll(mapLIZIZ);
                }
                Map<String, Object> map3 = c0x70.LIZIZ;
                if (map3 != null) {
                    map3.putAll(mapLIZJ);
                }
            }
            if (mapLIZ != null && c0x70 != null && (map = c0x70.LIZLLL) != null) {
                map.putAll(mapLIZ);
                return;
            }
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("res_loader_info", new JSONObject(mapLIZIZ));
        jSONObject.put("res_info", new JSONObject(mapLIZJ));
        jSONObject.put("res_load_error", new JSONObject(mapLIZ));
        if (this.LIZ.LIZLLL) {
            WebViewMonitorHelper.getInstance().handleNativeInfo(webView, "res_loader_error_template", jSONObject);
        } else {
            WebViewMonitorHelper.getInstance().handleNativeInfo(webView, "res_loader_error", jSONObject);
        }
    }
}
