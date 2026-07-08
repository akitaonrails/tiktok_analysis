package X;

import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* JADX INFO: renamed from: X.0q55, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public interface InterfaceC1536290q55 {
    void destroy(WebView webView);

    void goBack(WebView webView);

    void handleFetchError(WebView webView, C1064300dno c1064300dno);

    void handleRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail, C1521810phj c1521810phj);

    void handleRequestError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError);

    void handleRequestHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse);

    void handleViewCreate(WebView webView);

    void onAttachedToWindow(WebView webView);

    void onLoadUrl(WebView webView, String str);

    void onPageFinished(WebView webView, String str);

    void onPageStarted(WebView webView, String str, Bitmap bitmap);

    void onProgressChanged(WebView webView, int i);

    void reload(WebView webView);
}
