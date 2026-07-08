package X;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.shopify.checkout.models.errors.InternalErrorCode;
import com.shopify.checkout.models.errors.InternalErrorPayload;
import com.shopify.checkout.models.errors.InternalErrorReasons;
import java.util.Collections;

/* JADX INFO: renamed from: X.0dSY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1051120dSY extends WebViewClient {
    public WebView LIZ;
    public String LIZIZ;
    public C1040050dAh LIZJ;

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            InternalErrorPayload internalErrorPayload = new InternalErrorPayload(InternalErrorCode.WebviewFailedToLoad, new C1051130dSZ(webResourceRequest, webResourceError, null), InternalErrorReasons.WebViewOnError.getValue());
            C1040050dAh c1040050dAh = this.LIZJ;
            if (c1040050dAh != null) {
                c1040050dAh.LIZ.LIZLLL(Collections.singletonList(internalErrorPayload));
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            InternalErrorPayload internalErrorPayload = new InternalErrorPayload(InternalErrorCode.WebviewFailedToLoad, new C1051130dSZ(webResourceRequest, null, webResourceResponse), InternalErrorReasons.WebViewOnError.getValue());
            C1040050dAh c1040050dAh = this.LIZJ;
            if (c1040050dAh != null) {
                c1040050dAh.LIZ.LIZLLL(Collections.singletonList(internalErrorPayload));
            }
        }
    }
}
