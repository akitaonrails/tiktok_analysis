package X;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qDK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1541400qDK extends AbstractC1530000puw {
    public static final C1541460qDQ Companion = new Object() { // from class: X.0qDQ
    };

    public InterfaceC1544780qIm addDocumentStartJavaScript(WebView webView, String str, Set<String> set, EnumC1541410qDL enumC1541410qDL) {
        return null;
    }

    public void addResourceEventListener(WebView webView, Function1<? super String, Unit> function1) {
    }

    public boolean enableAddDocumentJS() {
        return false;
    }

    public boolean enableOptimizeIframeJSInjection() {
        return false;
    }

    public boolean enableOptimizeOfflineResource(WebView webView) {
        return false;
    }

    public boolean enablePreloadJSInjection() {
        return false;
    }

    public String getDefaultUserAgent() {
        return "";
    }

    public WebResourceResponse handleForestResponse(WebView webView, C1533790q13 c1533790q13) {
        return null;
    }

    public WebResourceResponse handleForestXResponse(WebView webView, C1532310pyf c1532310pyf) {
        return null;
    }

    public boolean isRenderAlive() {
        return false;
    }

    public boolean isTTWebView(WebView webView) {
        return false;
    }

    public boolean isTTWebViewInitialized() {
        return false;
    }

    public boolean isTTWebViewLoaded() {
        return false;
    }

    public boolean isTTWebViewTTNetResLoadEnable() {
        return false;
    }

    public void onBootFinish() {
    }

    public void onColdStartFinish() {
    }

    public void onDestroy(WebKitView webKitView) {
    }

    public void onFirstFrameFinish() {
    }

    public void onPageFinished(WebKitView webKitView) {
    }

    public void onWebViewCreated(WebKitView webKitView) {
    }

    public void onWebViewLoadUrl(WebKitView webKitView, String str) {
    }

    public boolean tryPreConnect(String str) {
        return false;
    }

    public void tryPreloadResource(boolean z, long j, int i, boolean z2, Map<String, String> map, Pair<String, byte[]> pair) {
    }

    public static final void onTTWebViewServiceRegister(C1541400qDK c1541400qDK) {
        Companion.getClass();
        C1541490qDT.LIZLLL = c1541400qDK;
    }
}
