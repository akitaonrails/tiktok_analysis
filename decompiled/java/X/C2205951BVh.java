package X;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* JADX INFO: renamed from: X.1BVh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2205951BVh extends C2202471BHx {
    public final void LIZLLL(WebView webView, String str) {
        super.onLoadResource(webView, str);
    }

    public final void LJ(WebView webView, String str) {
        super.onPageCommitVisible(webView, str);
    }

    public final void LJFF(WebView webView, String str) {
        super.onPageFinished(webView, str);
    }

    public final void LJII(WebView webView, ClientCertRequest clientCertRequest) {
        super.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    public final boolean LJIILJJIL(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    public final void LJIJ(WebView webView, KeyEvent keyEvent) {
        super.onUnhandledKeyEvent(webView, keyEvent);
    }

    public final WebResourceResponse LJIJI(WebView webView, WebResourceRequest webResourceRequest) {
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    public final WebResourceResponse LJIJJ(WebView webView, String str) {
        return super.shouldInterceptRequest(webView, str);
    }

    public final boolean LJIJJLI(WebView webView, KeyEvent keyEvent) {
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    public final boolean LJIL(WebView webView, WebResourceRequest webResourceRequest) {
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public final boolean LJJ(WebView webView, String str) {
        return super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // X.C2202471BHx, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onLoadResource");
        if (abstractC1541670qDlLIZIZ instanceof AbstractC2205961BVi) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((AbstractC2205961BVi) abstractC1541670qDlLIZIZ).onLoadResource(webView, str);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onLoadResource(webView, str);
    }

    @Override // X.C2202471BHx, android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onPageCommitVisible");
        if (abstractC1541670qDlLIZIZ instanceof AbstractC2205961BVi) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((AbstractC2205961BVi) abstractC1541670qDlLIZIZ).onPageCommitVisible(webView, str);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override // X.C2202471BHx, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onPageFinished");
        if (abstractC1541670qDlLIZIZ instanceof AbstractC2205961BVi) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((AbstractC2205961BVi) abstractC1541670qDlLIZIZ).onPageFinished(webView, str);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onPageFinished(webView, str);
    }

    @Override // X.C2202471BHx, android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onReceivedClientCertRequest");
        if (abstractC1541670qDlLIZIZ instanceof AbstractC2205961BVi) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((AbstractC2205961BVi) abstractC1541670qDlLIZIZ).onReceivedClientCertRequest(webView, clientCertRequest);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // X.C2202471BHx, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onRenderProcessGone");
        if (abstractC1541670qDlLIZIZ instanceof AbstractC2205961BVi) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            boolean zOnRenderProcessGone = ((AbstractC2205961BVi) abstractC1541670qDlLIZIZ).onRenderProcessGone(webView, renderProcessGoneDetail);
            c1542630qFJ.get().LIZ();
            return zOnRenderProcessGone;
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // X.C2202471BHx, android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onUnhandledKeyEvent");
        if (abstractC1541670qDlLIZIZ instanceof AbstractC2205961BVi) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((AbstractC2205961BVi) abstractC1541670qDlLIZIZ).onUnhandledKeyEvent(webView, keyEvent);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onUnhandledKeyEvent(webView, keyEvent);
    }

    @Override // X.C2202471BHx, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "shouldInterceptRequest");
        if (abstractC1541670qDlLIZIZ instanceof AbstractC2205961BVi) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            WebResourceResponse webResourceResponseShouldInterceptRequest = ((AbstractC2205961BVi) abstractC1541670qDlLIZIZ).shouldInterceptRequest(webView, webResourceRequest);
            c1542630qFJ.get().LIZ();
            return webResourceResponseShouldInterceptRequest;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // X.C2202471BHx, android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "shouldOverrideKeyEvent");
        if (abstractC1541670qDlLIZIZ instanceof AbstractC2205961BVi) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            boolean zShouldOverrideKeyEvent = ((AbstractC2205961BVi) abstractC1541670qDlLIZIZ).shouldOverrideKeyEvent(webView, keyEvent);
            c1542630qFJ.get().LIZ();
            return zShouldOverrideKeyEvent;
        }
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // X.C2202471BHx, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "shouldOverrideUrlLoading");
        if (abstractC1541670qDlLIZIZ instanceof AbstractC2205961BVi) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            boolean zShouldOverrideUrlLoading = ((AbstractC2205961BVi) abstractC1541670qDlLIZIZ).shouldOverrideUrlLoading(webView, webResourceRequest);
            c1542630qFJ.get().LIZ();
            return zShouldOverrideUrlLoading;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // X.C2202471BHx, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "shouldInterceptRequest");
        if (abstractC1541670qDlLIZIZ instanceof AbstractC2205961BVi) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            WebResourceResponse webResourceResponseShouldInterceptRequest = ((AbstractC2205961BVi) abstractC1541670qDlLIZIZ).shouldInterceptRequest(webView, str);
            c1542630qFJ.get().LIZ();
            return webResourceResponseShouldInterceptRequest;
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // X.C2202471BHx, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "shouldOverrideUrlLoading");
        if (abstractC1541670qDlLIZIZ instanceof AbstractC2205961BVi) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            boolean zShouldOverrideUrlLoading = ((AbstractC2205961BVi) abstractC1541670qDlLIZIZ).shouldOverrideUrlLoading(webView, str);
            c1542630qFJ.get().LIZ();
            return zShouldOverrideUrlLoading;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    public final void LIZ(WebView webView, String str, boolean z) {
        super.doUpdateVisitedHistory(webView, str, z);
    }

    public final void LIZJ(WebView webView, Message message, Message message2) {
        super.onFormResubmission(webView, message, message2);
    }

    public final void LJI(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
    }

    public final void LJIIIZ(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    public final void LJIIJJI(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    public final void LJIILIIL(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    public final void LJIILLIIL(WebView webView, float f, float f2) {
        super.onScaleChanged(webView, f, f2);
    }

    public final void LJIIZILJ(WebView webView, Message message, Message message2) {
        super.onTooManyRedirects(webView, message, message2);
    }

    @Override // X.C2202471BHx, android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "doUpdateVisitedHistory");
        if (abstractC1541670qDlLIZIZ instanceof AbstractC2205961BVi) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((AbstractC2205961BVi) abstractC1541670qDlLIZIZ).doUpdateVisitedHistory(webView, str, z);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.doUpdateVisitedHistory(webView, str, z);
    }

    @Override // X.C2202471BHx, android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onFormResubmission");
        if (abstractC1541670qDlLIZIZ instanceof AbstractC2205961BVi) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((AbstractC2205961BVi) abstractC1541670qDlLIZIZ).onFormResubmission(webView, message, message2);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onFormResubmission(webView, message, message2);
    }

    @Override // X.C2202471BHx, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onPageStarted");
        if (abstractC1541670qDlLIZIZ instanceof AbstractC2205961BVi) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((AbstractC2205961BVi) abstractC1541670qDlLIZIZ).onPageStarted(webView, str, bitmap);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // X.C2202471BHx, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onReceivedError");
        if (abstractC1541670qDlLIZIZ instanceof AbstractC2205961BVi) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((AbstractC2205961BVi) abstractC1541670qDlLIZIZ).onReceivedError(webView, webResourceRequest, webResourceError);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // X.C2202471BHx, android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onReceivedHttpError");
        if (abstractC1541670qDlLIZIZ instanceof AbstractC2205961BVi) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((AbstractC2205961BVi) abstractC1541670qDlLIZIZ).onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // X.C2202471BHx, android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onReceivedSslError");
        if (abstractC1541670qDlLIZIZ instanceof AbstractC2205961BVi) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((AbstractC2205961BVi) abstractC1541670qDlLIZIZ).onReceivedSslError(webView, sslErrorHandler, sslError);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // X.C2202471BHx, android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f, float f2) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onScaleChanged");
        if (abstractC1541670qDlLIZIZ instanceof AbstractC2205961BVi) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((AbstractC2205961BVi) abstractC1541670qDlLIZIZ).onScaleChanged(webView, f, f2);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onScaleChanged(webView, f, f2);
    }

    @Override // X.C2202471BHx, android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onTooManyRedirects");
        if (abstractC1541670qDlLIZIZ instanceof AbstractC2205961BVi) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((AbstractC2205961BVi) abstractC1541670qDlLIZIZ).onTooManyRedirects(webView, message, message2);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onTooManyRedirects(webView, message, message2);
    }

    public final void LJIIIIZZ(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
    }

    public final void LJIIJ(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    public final void LJIIL(WebView webView, String str, String str2, String str3) {
        super.onReceivedLoginRequest(webView, str, str2, str3);
    }

    public final void LJIILL(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        super.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
    }

    @Override // X.C2202471BHx, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onReceivedError");
        if (abstractC1541670qDlLIZIZ instanceof AbstractC2205961BVi) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((AbstractC2205961BVi) abstractC1541670qDlLIZIZ).onReceivedError(webView, i, str, str2);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // X.C2202471BHx, android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onReceivedHttpAuthRequest");
        if (abstractC1541670qDlLIZIZ instanceof AbstractC2205961BVi) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((AbstractC2205961BVi) abstractC1541670qDlLIZIZ).onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // X.C2202471BHx, android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onReceivedLoginRequest");
        if (abstractC1541670qDlLIZIZ instanceof AbstractC2205961BVi) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((AbstractC2205961BVi) abstractC1541670qDlLIZIZ).onReceivedLoginRequest(webView, str, str2, str3);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // X.C2202471BHx, android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "onSafeBrowsingHit");
        if (abstractC1541670qDlLIZIZ instanceof AbstractC2205961BVi) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            ((AbstractC2205961BVi) abstractC1541670qDlLIZIZ).onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
            c1542630qFJ.get().LIZ();
            return;
        }
        super.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
    }
}
