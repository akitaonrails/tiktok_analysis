package X;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import j27.s;
import java.util.HashMap;

/* JADX INFO: renamed from: X.14BG, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14BG implements InterfaceC2178151AMj {
    public final Context LIZ;
    public InterfaceC844240X9y LIZIZ;
    public WebView LIZJ;

    @Override // X.InterfaceC2178151AMj
    public final void setParams(HashMap<String, Object> map) {
    }

    @Override // X.InterfaceC2178151AMj
    public final void LJJI() {
        WebSettings settings;
        WebSettings settings2;
        WebSettings settings3;
        WebSettings settings4;
        WebSettings settings5;
        WebSettings settings6;
        WebView webView = new WebView(this.LIZ);
        this.LIZJ = webView;
        WebSettings settings7 = webView.getSettings();
        if (settings7 != null) {
            settings7.setJavaScriptEnabled(true);
        }
        WebView webView2 = this.LIZJ;
        WebSettings settings8 = webView2 != null ? webView2.getSettings() : null;
        if (settings8 != null) {
            settings8.setAllowFileAccess(false);
        }
        WebView webView3 = this.LIZJ;
        if (webView3 != null && (settings6 = webView3.getSettings()) != null) {
            settings6.setAllowContentAccess(false);
        }
        WebView webView4 = this.LIZJ;
        if (webView4 != null && (settings5 = webView4.getSettings()) != null) {
            settings5.setJavaScriptCanOpenWindowsAutomatically(true);
        }
        WebView webView5 = this.LIZJ;
        if (webView5 != null && (settings4 = webView5.getSettings()) != null) {
            settings4.setMixedContentMode(0);
        }
        WebView webView6 = this.LIZJ;
        if (webView6 != null && (settings3 = webView6.getSettings()) != null) {
            settings3.setDomStorageEnabled(true);
        }
        WebView webView7 = this.LIZJ;
        if (webView7 != null && (settings2 = webView7.getSettings()) != null) {
            settings2.setUseWideViewPort(true);
        }
        WebView webView8 = this.LIZJ;
        if (webView8 != null && (settings = webView8.getSettings()) != null) {
            settings.setLoadWithOverviewMode(true);
        }
        WebView webView9 = this.LIZJ;
        if (webView9 != null) {
            webView9.addJavascriptInterface(this, "LynxWebViewBridge");
        }
        C786410Ut5.te(this.LIZJ, new WebViewClient() { // from class: X.14BJ
            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView10, String str) {
                super.onPageFinished(webView10, str);
                InterfaceC844240X9y interfaceC844240X9y = this.LIZ.LIZIZ;
                if (interfaceC844240X9y != null) {
                    interfaceC844240X9y.LJ();
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView10, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                InterfaceC844240X9y interfaceC844240X9y;
                super.onReceivedError(webView10, webResourceRequest, webResourceError);
                if (webResourceError != null && (interfaceC844240X9y = this.LIZ.LIZIZ) != null) {
                    interfaceC844240X9y.LIZIZ(webResourceError.getErrorCode(), webResourceError.getDescription().toString());
                }
            }
        });
    }

    @Override // X.InterfaceC2178151AMj
    public final void destroy() {
        WebView webView = this.LIZJ;
        if (webView != null) {
            webView.destroy();
        }
        this.LIZJ = null;
    }

    @Override // X.InterfaceC2178151AMj
    public final void reload() {
        WebView webView = this.LIZJ;
        if (webView != null) {
            webView.reload();
        }
    }

    @Override // X.InterfaceC2178151AMj
    public final WebView LIZ() {
        return this.LIZJ;
    }

    public C14BG(s sVar) {
        this.LIZ = sVar;
    }

    @Override // X.InterfaceC2178151AMj
    public final void LJJ(String str) {
        WebView webView = this.LIZJ;
        if (webView != null) {
            C786410Ut5.ue(webView, str);
        }
    }

    @Override // X.InterfaceC2178151AMj
    public final void LJJIFFI(String str) {
        WebView webView = this.LIZJ;
        if (webView != null) {
            webView.evaluateJavascript(str, null);
        }
    }

    @Override // X.InterfaceC2178151AMj
    public final void LJJII(C2178141AMi c2178141AMi) {
        this.LIZIZ = c2178141AMi;
    }

    @Override // X.InterfaceC2178151AMj
    public final void LJJIII(String str) {
        WebView webView = this.LIZJ;
        if (webView != null) {
            webView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
        }
    }

    @JavascriptInterface
    public final void onMessageReceived(String str) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/bytedance/ies/xelement/webview/DefaultWebViewServiceImpl", "onMessageReceived", this, new Object[]{str}, "void", new C0WZW(false, "(Ljava/lang/String;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvW5E5Tb1cuCxA+0UAO/D4N8llsetZKcRBNuU5qiNFuLO0EHcTjiNSbvA", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            str = (String) obj;
        }
        InterfaceC844240X9y interfaceC844240X9y = this.LIZIZ;
        if (interfaceC844240X9y != null) {
            interfaceC844240X9y.LIZ(str);
        }
    }
}
