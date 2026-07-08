package X;

import android.app.Application;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tiktok.security.OptIABUAExp;

/* JADX INFO: renamed from: X.0doU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1064720doU {
    public static boolean LIZ;
    public static C1064620doK LIZIZ;
    public static WebKitView LIZJ;

    public static boolean LIZ() {
        C1064620doK c1064620doK = LIZIZ;
        return (c1064620doK == null || c1064620doK.LIZIZ) ? LIZ || C1541490qDT.LIZJ : C1541490qDT.LIZJ;
    }

    public static void LIZLLL() {
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        C786410Ut5.te(new WebView(C1161970gLL.LIZIZ().LIZJ()), new WebViewClient() { // from class: X.0doJ
            @Override // android.webkit.WebViewClient
            public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                if (webView != null) {
                    webView.stopLoading();
                    C786410Ut5.ue(webView, "about:blank");
                    webView.destroy();
                    return true;
                }
                return true;
            }
        });
        C1520080pew.LJFF(null, "webview_warmup", "warmup", null, null, null, null, null, 249);
    }

    public static void LJ() {
        String strLIZJ;
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        WebKitView webKitView = new WebKitView(C1161970gLL.LIZIZ().LIZJ(), C1064790dob.LIZ);
        LIZJ = webKitView;
        webKitView.setTag("WebViewWarmupTool");
        WebKitView webKitView2 = LIZJ;
        if (webKitView2 != null) {
            WebViewClient webViewClient = new WebViewClient() { // from class: X.0doL
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.webkit.WebViewClient
                public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                    if (webView instanceof WebKitView) {
                        InterfaceC1541990qEH interfaceC1541990qEH = (InterfaceC1541990qEH) webView;
                        C01GW<C1537410q6t> c01gw2 = C1537410q6t.LJIIIZ;
                        Application applicationLIZJ = C1161970gLL.LIZIZ().LIZJ();
                        if (interfaceC1541990qEH != 0) {
                            boolean z = interfaceC1541990qEH.e1() instanceof WebView;
                            if (z) {
                                ((WebView) interfaceC1541990qEH).stopLoading();
                            }
                            if (applicationLIZJ != null && (interfaceC1541990qEH instanceof View)) {
                                Context context = ((View) interfaceC1541990qEH).getContext();
                                if (context instanceof MutableContextWrapper) {
                                    ((MutableContextWrapper) context).setBaseContext(applicationLIZJ);
                                }
                            }
                            if (z) {
                                C786410Ut5.ue((WebView) interfaceC1541990qEH, "about:blank");
                            }
                            interfaceC1541990qEH.LLD(true);
                        }
                    }
                    return true;
                }
            };
            if (!C794280VDu.LIZ(webKitView2, "csrf") && C292470BdF.LIZ()) {
                C1537480q70 hybridContext = webKitView2.getHybridContext();
                Integer numValueOf = hybridContext != null ? Integer.valueOf(hybridContext.LJ()) : null;
                WebSettings settings = webKitView2.getSettings();
                if (numValueOf != null) {
                    C788140Uvs.LIZ.put(settings, numValueOf);
                }
                String userAgentString = settings.getUserAgentString();
                if (OptIABUAExp.LIZ(numValueOf)) {
                    strLIZJ = OptIABUAExp.LIZJ();
                    if (strLIZJ == null || strLIZJ.isEmpty()) {
                        webKitView2.setWebViewClient(webViewClient);
                    }
                } else {
                    strLIZJ = " BytedanceWebview/d8a21c6";
                }
                if (!userAgentString.contains(strLIZJ)) {
                    settings.setUserAgentString(userAgentString.concat(strLIZJ));
                }
                webKitView2.setWebViewClient(webViewClient);
            } else {
                webKitView2.setWebViewClient(webViewClient);
            }
        }
        C1520080pew.LJFF(null, "webview_warmup", "warmup", null, null, null, null, null, 249);
    }

    public static void LIZIZ(Context context) {
        C1520080pew.LJFF(null, "webview_warmup_pre_init_chromium", "call", null, null, null, null, null, 249);
        if (LIZ) {
            return;
        }
        try {
            C786410Ut5.F3(context);
            C1520080pew.LJFF(null, "webview_warmup_pre_init_chromium", "init_chromium", null, null, null, null, null, 249);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LIZJ(C1064620doK c1064620doK) {
        C1520080pew.LJFF(null, "webview_warmup", "call", "native", null, null, null, null, 241);
        if (LIZIZ != null) {
            return;
        }
        LIZIZ = c1064620doK;
        if (!LIZ()) {
            C1064620doK c1064620doK2 = LIZIZ;
            if (c1064620doK2 == null) {
                c1064620doK2 = null;
            }
            if (c1064620doK2.LIZ) {
                C1064640doM.LIZ(new C1064710doT());
            } else {
                LJ();
            }
        }
    }
}
