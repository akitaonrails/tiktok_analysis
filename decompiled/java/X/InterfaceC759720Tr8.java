package X;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* JADX INFO: renamed from: X.0Tr8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC759720Tr8 {
    void LIZ(WebView webView, String str);

    void LIZIZ(long j, boolean z);

    void onPageFinished(WebView webView, String str);

    void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError);

    void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse);
}
