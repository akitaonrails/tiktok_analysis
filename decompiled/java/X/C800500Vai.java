package X;

import android.content.pm.PackageInfo;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: renamed from: X.0Vai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C800500Vai {
    public static PackageInfo LIZ() {
        return WebView.getCurrentWebViewPackage();
    }

    public static boolean LIZIZ(WebSettings webSettings) {
        return webSettings.getSafeBrowsingEnabled();
    }

    public static WebChromeClient LIZJ(WebView webView) {
        return webView.getWebChromeClient();
    }

    public static WebViewClient LIZLLL(WebView webView) {
        return webView.getWebViewClient();
    }

    public static void LJ(WebSettings webSettings, boolean z) {
        webSettings.setSafeBrowsingEnabled(z);
    }
}
