package X;

import android.webkit.WebView;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0phK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public interface InterfaceC1521560phK {
    void handleJSBError(WebView webView, C1521520phG c1521520phG);

    void handleJSBInfo(WebView webView, C1521480phC c1521480phC);

    void handleJSBInfoV2(WebView webView, Map<String, Object> map);

    void handleJSBPvV2(WebView webView, Map<String, Object> map);

    void handleNativeInfo(WebView webView, String str, JSONObject jSONObject);

    void handlePiaInfo(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2);
}
