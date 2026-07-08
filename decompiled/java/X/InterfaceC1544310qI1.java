package X;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* JADX INFO: renamed from: X.0qI1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public interface InterfaceC1544310qI1 {
    void LIZ(WebView webView, String str);

    WebResourceResponse LIZIZ(WebView webView, WebResourceRequest webResourceRequest);

    void LIZJ(WebView webView);

    WebResourceResponse LIZLLL(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse);

    void LJ(WebView webView, String str);

    void LJFF(WebView webView);

    void LJI(WebView webView, String str, boolean z);

    void LJII(WebView webView, String str);

    void destroy(WebView webView);

    void onPageFinished(WebView webView, String str);
}
