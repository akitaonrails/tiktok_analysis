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

/* JADX INFO: renamed from: X.1BVi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractC2205961BVi extends AbstractC1541670qDl<C2205951BVh> {
    public void onLoadResource(WebView webView, String str) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onLoadResource");
        if (abstractC1541670qDlLIZ instanceof AbstractC2205961BVi) {
            ((AbstractC2205961BVi) abstractC1541670qDlLIZ).onLoadResource(webView, str);
        } else {
            getExtendable().LIZLLL(webView, str);
        }
    }

    public void onPageCommitVisible(WebView webView, String str) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onPageCommitVisible");
        if (abstractC1541670qDlLIZ instanceof AbstractC2205961BVi) {
            ((AbstractC2205961BVi) abstractC1541670qDlLIZ).onPageCommitVisible(webView, str);
        } else {
            getExtendable().LJ(webView, str);
        }
    }

    public void onPageFinished(WebView webView, String str) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onPageFinished");
        if (abstractC1541670qDlLIZ instanceof AbstractC2205961BVi) {
            ((AbstractC2205961BVi) abstractC1541670qDlLIZ).onPageFinished(webView, str);
        } else {
            getExtendable().LJFF(webView, str);
        }
    }

    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onReceivedClientCertRequest");
        if (abstractC1541670qDlLIZ instanceof AbstractC2205961BVi) {
            ((AbstractC2205961BVi) abstractC1541670qDlLIZ).onReceivedClientCertRequest(webView, clientCertRequest);
        } else {
            getExtendable().LJII(webView, clientCertRequest);
        }
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onRenderProcessGone");
        if (abstractC1541670qDlLIZ instanceof AbstractC2205961BVi) {
            return ((AbstractC2205961BVi) abstractC1541670qDlLIZ).onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        return getExtendable().LJIILJJIL(webView, renderProcessGoneDetail);
    }

    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onUnhandledKeyEvent");
        if (abstractC1541670qDlLIZ instanceof AbstractC2205961BVi) {
            ((AbstractC2205961BVi) abstractC1541670qDlLIZ).onUnhandledKeyEvent(webView, keyEvent);
        } else {
            getExtendable().LJIJ(webView, keyEvent);
        }
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "shouldInterceptRequest");
        if (abstractC1541670qDlLIZ instanceof AbstractC2205961BVi) {
            return ((AbstractC2205961BVi) abstractC1541670qDlLIZ).shouldInterceptRequest(webView, webResourceRequest);
        }
        return getExtendable().LJIJI(webView, webResourceRequest);
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "shouldOverrideKeyEvent");
        if (abstractC1541670qDlLIZ instanceof AbstractC2205961BVi) {
            return ((AbstractC2205961BVi) abstractC1541670qDlLIZ).shouldOverrideKeyEvent(webView, keyEvent);
        }
        return getExtendable().LJIJJLI(webView, keyEvent);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "shouldOverrideUrlLoading");
        if (abstractC1541670qDlLIZ instanceof AbstractC2205961BVi) {
            return ((AbstractC2205961BVi) abstractC1541670qDlLIZ).shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        return getExtendable().LJIL(webView, webResourceRequest);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "shouldInterceptRequest");
        if (abstractC1541670qDlLIZ instanceof AbstractC2205961BVi) {
            return ((AbstractC2205961BVi) abstractC1541670qDlLIZ).shouldInterceptRequest(webView, str);
        }
        return getExtendable().LJIJJ(webView, str);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "shouldOverrideUrlLoading");
        if (abstractC1541670qDlLIZ instanceof AbstractC2205961BVi) {
            return ((AbstractC2205961BVi) abstractC1541670qDlLIZ).shouldOverrideUrlLoading(webView, str);
        }
        return getExtendable().LJJ(webView, str);
    }

    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "doUpdateVisitedHistory");
        if (abstractC1541670qDlLIZ instanceof AbstractC2205961BVi) {
            ((AbstractC2205961BVi) abstractC1541670qDlLIZ).doUpdateVisitedHistory(webView, str, z);
        } else {
            getExtendable().LIZ(webView, str, z);
        }
    }

    public void onFormResubmission(WebView webView, Message message, Message message2) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onFormResubmission");
        if (abstractC1541670qDlLIZ instanceof AbstractC2205961BVi) {
            ((AbstractC2205961BVi) abstractC1541670qDlLIZ).onFormResubmission(webView, message, message2);
        } else {
            getExtendable().LIZJ(webView, message, message2);
        }
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onPageStarted");
        if (abstractC1541670qDlLIZ instanceof AbstractC2205961BVi) {
            ((AbstractC2205961BVi) abstractC1541670qDlLIZ).onPageStarted(webView, str, bitmap);
        } else {
            getExtendable().LJI(webView, str, bitmap);
        }
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onReceivedError");
        if (abstractC1541670qDlLIZ instanceof AbstractC2205961BVi) {
            ((AbstractC2205961BVi) abstractC1541670qDlLIZ).onReceivedError(webView, webResourceRequest, webResourceError);
        } else {
            getExtendable().LJIIIZ(webView, webResourceRequest, webResourceError);
        }
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onReceivedHttpError");
        if (abstractC1541670qDlLIZ instanceof AbstractC2205961BVi) {
            ((AbstractC2205961BVi) abstractC1541670qDlLIZ).onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        } else {
            getExtendable().LJIIJJI(webView, webResourceRequest, webResourceResponse);
        }
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onReceivedSslError");
        if (abstractC1541670qDlLIZ instanceof AbstractC2205961BVi) {
            ((AbstractC2205961BVi) abstractC1541670qDlLIZ).onReceivedSslError(webView, sslErrorHandler, sslError);
        } else {
            getExtendable().LJIILIIL(webView, sslErrorHandler, sslError);
        }
    }

    public void onScaleChanged(WebView webView, float f, float f2) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onScaleChanged");
        if (abstractC1541670qDlLIZ instanceof AbstractC2205961BVi) {
            ((AbstractC2205961BVi) abstractC1541670qDlLIZ).onScaleChanged(webView, f, f2);
        } else {
            getExtendable().LJIILLIIL(webView, f, f2);
        }
    }

    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onTooManyRedirects");
        if (abstractC1541670qDlLIZ instanceof AbstractC2205961BVi) {
            ((AbstractC2205961BVi) abstractC1541670qDlLIZ).onTooManyRedirects(webView, message, message2);
        } else {
            getExtendable().LJIIZILJ(webView, message, message2);
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onReceivedError");
        if (abstractC1541670qDlLIZ instanceof AbstractC2205961BVi) {
            ((AbstractC2205961BVi) abstractC1541670qDlLIZ).onReceivedError(webView, i, str, str2);
        } else {
            getExtendable().LJIIIIZZ(webView, i, str, str2);
        }
    }

    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onReceivedHttpAuthRequest");
        if (abstractC1541670qDlLIZ instanceof AbstractC2205961BVi) {
            ((AbstractC2205961BVi) abstractC1541670qDlLIZ).onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        } else {
            getExtendable().LJIIJ(webView, httpAuthHandler, str, str2);
        }
    }

    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onReceivedLoginRequest");
        if (abstractC1541670qDlLIZ instanceof AbstractC2205961BVi) {
            ((AbstractC2205961BVi) abstractC1541670qDlLIZ).onReceivedLoginRequest(webView, str, str2, str3);
        } else {
            getExtendable().LJIIL(webView, str, str2, str3);
        }
    }

    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "onSafeBrowsingHit");
        if (abstractC1541670qDlLIZ instanceof AbstractC2205961BVi) {
            ((AbstractC2205961BVi) abstractC1541670qDlLIZ).onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
        } else {
            getExtendable().LJIILL(webView, webResourceRequest, i, safeBrowsingResponse);
        }
    }
}
