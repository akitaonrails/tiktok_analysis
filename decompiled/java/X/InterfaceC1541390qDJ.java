package X;

import android.content.Context;
import android.webkit.WebView;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qDJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public interface InterfaceC1541390qDJ {
    InterfaceC1544780qIm addDocumentStartJavaScript(WebView webView, String str, Set<String> set, int i);

    void addResourceEventListener(WebView webView, Function1<? super String, Unit> function1);

    int getCookieDBVersion(Context context, int i, StringBuilder sb);

    String getDefaultUserAgent();

    JSONObject getLoadInfo();

    JSONObject getLoadTimingInfo();

    long getPreInitDuration();

    int getPreInitStatus();

    int getTTNetNativeInitError();

    String getWebViewError(WebView webView);

    JSONObject getWebViewLoadingTelemetryMetrics(WebView webView);

    JSONObject getWebViewPerformanceMetrics(WebView webView, List<String> list);

    boolean initTTWebView(Context context, JSONObject jSONObject);

    boolean initTTWebViewRenderProcess(Context context);

    boolean isOfflineNativeInterceptorSupport();

    boolean isPredictorEnable();

    boolean isRenderAlive();

    boolean isTTNetNativeEnable();

    boolean isTTWebView(WebView webView);

    boolean isTTWebViewLoaded();

    void onBootFinish();

    void onColdStartFinish();

    void onFirstFrameFinish();

    boolean preConnect(String str);

    boolean preInitBrowser();

    void preInitTTWebView(Context context);

    void preRender();

    boolean preloadBytes(String str, String str2, byte[] bArr, JSONObject jSONObject, InterfaceC1685420txc<? super Boolean, ? super String, ? super Integer, ? super Integer, ? super Long, Unit> interfaceC1685420txc);

    boolean preloadFile(String str, Map<String, String> map, JSONObject jSONObject, InterfaceC1685420txc<? super Boolean, ? super String, ? super Integer, ? super Integer, ? super Long, Unit> interfaceC1685420txc);

    boolean preloadOnline(String str, Set<String> set, JSONObject jSONObject, InterfaceC1685420txc<? super Boolean, ? super String, ? super Integer, ? super Integer, ? super Long, Unit> interfaceC1685420txc);

    boolean prepareTTWebViewFactoryProvider();

    void registerDataReportListener();

    void release(String str);

    void uninstallTTWebView(Context context);
}
