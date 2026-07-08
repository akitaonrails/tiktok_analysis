package X;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* JADX INFO: renamed from: X.1BVo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public interface InterfaceC2206021BVo {
    void onPageCommitVisible(WebView webView, String str);

    void onPageFinished(WebView webView, String str);

    void onPageStarted(WebView webView, String str, Bitmap bitmap);

    void onReceivedError(WebView webView, int i, String str, String str2);

    void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError);

    void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse);

    boolean onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError);

    WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest);

    boolean shouldOverrideUrlLoading(WebView webView, String str, WebResourceRequest webResourceRequest, Boolean bool);
}
