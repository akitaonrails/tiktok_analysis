package X;

import android.webkit.WebView;
import com.bytedance.android.monitorV2.webview.WebViewMonitorHelper;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0piG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1522140piG implements InterfaceC1287060jb6 {
    public static final C1522140piG LIZ = new C1522140piG();

    @Override // X.InterfaceC1287060jb6
    public final void LIZ(String str, WebView webView, Map<String, Object> map, Map<String, Object> map2) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (map != null) {
            jSONObject = new JSONObject(map);
        } else {
            jSONObject = new JSONObject();
        }
        if (map2 != null) {
            jSONObject2 = new JSONObject(map2);
        } else {
            jSONObject2 = new JSONObject();
        }
        WebViewMonitorHelper.getInstance().handlePiaInfo(webView, str, jSONObject, jSONObject2);
    }
}
