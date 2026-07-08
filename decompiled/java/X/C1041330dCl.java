package X;

import android.net.Uri;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dCl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1041330dCl extends WebViewClient {
    public InterfaceC1041260dCe LIZ = null;

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        System.currentTimeMillis();
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String method;
        String string;
        InterfaceC1041260dCe interfaceC1041260dCe;
        WebResourceResponse webResourceResponseLIZ;
        if (webResourceRequest != null) {
            method = webResourceRequest.getMethod();
        } else {
            method = null;
        }
        if (!Intrinsics.LJFF(method, "GET")) {
            return null;
        }
        Uri url = webResourceRequest.getUrl();
        if (url != null) {
            string = url.toString();
        } else {
            string = null;
        }
        if ((!URLUtil.isHttpUrl(string) && !URLUtil.isHttpsUrl(string)) || (interfaceC1041260dCe = this.LIZ) == null || (webResourceResponseLIZ = interfaceC1041260dCe.LIZ(string)) == null) {
            return null;
        }
        return webResourceResponseLIZ;
    }
}
