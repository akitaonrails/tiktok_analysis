package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.LynxViewClient;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.AFwS263S0000000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qYR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1554490qYR extends AbstractC1539010q9T {
    public final int $t;

    @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
    public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
        switch (this.$t) {
            case 0:
                LJJJLL$0(this, interfaceC1531560pxS);
                break;
            case 1:
                LJJJLL$1(this, interfaceC1531560pxS);
                break;
            case 2:
                LJJJLL$2(this, interfaceC1531560pxS);
                break;
            case 3:
                LJJJLL$3(this, interfaceC1531560pxS);
                break;
            default:
                super.LJJJLL(interfaceC1531560pxS);
                break;
        }
    }

    public C1554490qYR(int i) {
        this.$t = i;
    }

    public static final void LJJJLL$0(C1554490qYR c1554490qYR, InterfaceC1531560pxS interfaceC1531560pxS) {
        C1537910q7h c1537910q7h;
        if ((interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
            c1537910q7h.LJIIIIZZ(new LynxViewClient() { // from class: X.0qRU
                @Override // com.lynx.tasm.LynxViewClient
                public final void LJIILL(C1299240juk c1299240juk) {
                    String str = c1299240juk.LIZ.LIZIZ;
                    LynxView lynxView = c1299240juk.LIZJ;
                    if (Intrinsics.LJFF(str, "tap")) {
                        C1545510qJx c1545510qJx = C1545510qJx.LIZ;
                        if (lynxView != null) {
                            C2211621BhA.LIZ.getClass();
                            C2211641BhC c2211641BhCLIZLLL = C2211621BhA.LIZLLL(lynxView, null);
                            if (c2211641BhCLIZLLL != null && c2211641BhCLIZLLL.LJJIIZ) {
                                C2211621BhA.LJ = c2211641BhCLIZLLL;
                            }
                            c1545510qJx.getClass();
                        }
                    }
                }
            });
        }
    }

    public static final void LJJJLL$1(C1554490qYR c1554490qYR, InterfaceC1531560pxS interfaceC1531560pxS) {
        if (C1324970kaF.LIZ[interfaceC1531560pxS.getType().ordinal()] != 1 || !(interfaceC1531560pxS instanceof C1541480qDS)) {
            return;
        }
        ((C1541480qDS) interfaceC1531560pxS).LJII(C1524220plc.class, AFwS263S0000000_23.get$arr$(32));
    }

    public static final void LJJJLL$2(C1554490qYR c1554490qYR, InterfaceC1531560pxS interfaceC1531560pxS) {
        C1541480qDS c1541480qDS;
        boolean z = interfaceC1531560pxS instanceof C1541480qDS;
        if (z) {
            C1541480qDS c1541480qDS2 = (C1541480qDS) interfaceC1531560pxS;
            if (c1541480qDS2 != null) {
                C1536360q5C c1536360q5C = new C1536360q5C();
                c1536360q5C.LIZ = 0;
                c1536360q5C.LIZIZ = true;
                c1541480qDS2.LJIILIIL = c1536360q5C;
            }
            if (z && (c1541480qDS = (C1541480qDS) interfaceC1531560pxS) != null) {
                c1541480qDS.LIZJ = new C844210X9v() { // from class: X.0zN2
                    @Override // X.AbstractC2205961BVi
                    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                        C1893370zN1 c1893370zN1 = (C1893370zN1) C1619720sFe.LIZ.LIZ(1003);
                        if (c1893370zN1 != null) {
                            c1893370zN1.LJIILL();
                        }
                        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
                    }
                };
            }
        }
    }

    public static final void LJJJLL$3(C1554490qYR c1554490qYR, InterfaceC1531560pxS interfaceC1531560pxS) {
        C1541480qDS c1541480qDS;
        boolean z = interfaceC1531560pxS instanceof C1541480qDS;
        if (z) {
            C1541480qDS c1541480qDS2 = (C1541480qDS) interfaceC1531560pxS;
            if (c1541480qDS2 != null) {
                c1541480qDS2.LJ = new InterfaceC1541760qDu() { // from class: X.0qN0
                    @Override // X.InterfaceC1541760qDu
                    public final void LIZ(WebSettings webSettings, WebKitView webKitView) {
                        String strLJII;
                        InterfaceC1877250yx1 interfaceC1877250yx1;
                        WeakReference<InterfaceC1877250yx1> weakReference = C1547430qN3.LIZIZ;
                        if (weakReference == null || (interfaceC1877250yx1 = weakReference.get()) == null || (strLJII = interfaceC1877250yx1.LJII()) == null) {
                            strLJII = "TikTok-Minis";
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(webSettings.getUserAgentString());
                        sbLIZ.append(' ');
                        sbLIZ.append(strLJII);
                        sbLIZ.append('/');
                        C844470XAv.LIZ.getClass();
                        sbLIZ.append(C844470XAv.LJFF());
                        C786410Ut5.se(webSettings, C2188811AlT.LIZIZ(sbLIZ));
                    }
                };
            }
            if (z) {
                C1541480qDS c1541480qDS3 = (C1541480qDS) interfaceC1531560pxS;
                if (c1541480qDS3 != null) {
                    c1541480qDS3.LJIILIIL = new C1536360q5C();
                }
                if (z) {
                    C1541480qDS c1541480qDS4 = (C1541480qDS) interfaceC1531560pxS;
                    if (c1541480qDS4 != null) {
                        c1541480qDS4.LIZJ = new C844210X9v() { // from class: X.0qMz
                            @Override // X.AbstractC2205961BVi
                            public final void onPageFinished(WebView webView, String str) {
                                super.onPageFinished(webView, str);
                                int i = C2187451AjH.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("AbsKitInitParamHandler onPageFinished, callback:");
                                C1547430qN3.LIZ.getClass();
                                sbLIZ.append(C1547430qN3.LJIIL());
                                sbLIZ.append(", url:");
                                sbLIZ.append(str);
                                C2188811AlT.LIZIZ(sbLIZ);
                                InterfaceC1547420qN2 interfaceC1547420qN2LJIIL = C1547430qN3.LJIIL();
                                if (interfaceC1547420qN2LJIIL != null) {
                                    interfaceC1547420qN2LJIIL.LIZIZ(str);
                                }
                            }

                            @Override // X.AbstractC2205961BVi
                            public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                                Uri url;
                                String method;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("shouldInterceptRequest, url:");
                                Map<String, String> requestHeaders = null;
                                if (webResourceRequest != null) {
                                    url = webResourceRequest.getUrl();
                                } else {
                                    url = null;
                                }
                                sbLIZ.append(url);
                                sbLIZ.append(", method:");
                                if (webResourceRequest != null) {
                                    method = webResourceRequest.getMethod();
                                } else {
                                    method = null;
                                }
                                sbLIZ.append(method);
                                sbLIZ.append(", requestHeaders:");
                                if (webResourceRequest != null) {
                                    requestHeaders = webResourceRequest.getRequestHeaders();
                                }
                                sbLIZ.append(requestHeaders);
                                C2188811AlT.LIZIZ(sbLIZ);
                                return super.shouldInterceptRequest(webView, webResourceRequest);
                            }

                            @Override // X.AbstractC2205961BVi
                            public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                                String string;
                                Uri url;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("AbsKitInitParamHandler shouldOverrideUrlLoading, callback:");
                                C1547430qN3.LIZ.getClass();
                                sbLIZ.append(C1547430qN3.LJIIL());
                                sbLIZ.append(", request:");
                                if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
                                    string = url.toString();
                                } else {
                                    string = null;
                                }
                                sbLIZ.append(string);
                                C2188811AlT.LIZIZ(sbLIZ);
                                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
                            }

                            @Override // X.AbstractC2205961BVi
                            public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                                return super.shouldInterceptRequest(webView, str);
                            }

                            @Override // X.AbstractC2205961BVi
                            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                                int i = C2187451AjH.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("AbsKitInitParamHandler shouldOverrideUrlLoading, callback:");
                                C1547430qN3.LIZ.getClass();
                                sbLIZ.append(C1547430qN3.LJIIL());
                                sbLIZ.append(", url:");
                                sbLIZ.append(str);
                                C2188811AlT.LIZIZ(sbLIZ);
                                return super.shouldOverrideUrlLoading(webView, str);
                            }

                            @Override // X.AbstractC2205961BVi
                            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                                super.onPageStarted(webView, str, bitmap);
                                int i = C2187451AjH.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("AbsKitInitParamHandler onPageStarted, callback:");
                                C1547430qN3.LIZ.getClass();
                                sbLIZ.append(C1547430qN3.LJIIL());
                                sbLIZ.append(", url:");
                                sbLIZ.append(str);
                                C2188811AlT.LIZIZ(sbLIZ);
                                InterfaceC1547420qN2 interfaceC1547420qN2LJIIL = C1547430qN3.LJIIL();
                                if (interfaceC1547420qN2LJIIL != null) {
                                    interfaceC1547420qN2LJIIL.LIZJ(str);
                                }
                            }

                            @Override // X.AbstractC2205961BVi
                            public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                                Uri url;
                                super.onReceivedError(webView, webResourceRequest, webResourceError);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("AbsKitInitParamHandler onReceivedError, callback:");
                                C1547430qN3.LIZ.getClass();
                                sbLIZ.append(C1547430qN3.LJIIL());
                                sbLIZ.append(", error:");
                                sbLIZ.append(webResourceError);
                                sbLIZ.append(", url:");
                                if (webResourceRequest != null) {
                                    url = webResourceRequest.getUrl();
                                } else {
                                    url = null;
                                }
                                sbLIZ.append(url);
                                C2188811AlT.LIZIZ(sbLIZ);
                            }

                            @Override // X.AbstractC2205961BVi
                            public final void onReceivedError(WebView webView, int i, String str, String str2) {
                                super.onReceivedError(webView, i, str, str2);
                                int i2 = C2187451AjH.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("AbsKitInitParamHandler onReceivedError, callback:");
                                C1547430qN3.LIZ.getClass();
                                sbLIZ.append(C1547430qN3.LJIIL());
                                sbLIZ.append(", errorCode:");
                                sbLIZ.append(i);
                                sbLIZ.append(", failingUrl:");
                                sbLIZ.append(str2);
                                sbLIZ.append(", description:");
                                sbLIZ.append(str);
                                C2188811AlT.LIZIZ(sbLIZ);
                            }
                        };
                    }
                    if (z && (c1541480qDS = (C1541480qDS) interfaceC1531560pxS) != null) {
                        c1541480qDS.LIZLLL = new C1542400qEw() { // from class: X.0qN1
                            @Override // X.C1BVX
                            public final void onProgressChanged(WebView webView, int i) {
                                super.onProgressChanged(webView, i);
                                int i2 = C2187451AjH.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("AbsKitInitParamHandler onProgressChanged, callback:");
                                C1547430qN3.LIZ.getClass();
                                sbLIZ.append(C1547430qN3.LJIIL());
                                sbLIZ.append(", newProgress:");
                                sbLIZ.append(i);
                                C2188811AlT.LIZIZ(sbLIZ);
                                InterfaceC1547420qN2 interfaceC1547420qN2LJIIL = C1547430qN3.LJIIL();
                                if (interfaceC1547420qN2LJIIL != null) {
                                    interfaceC1547420qN2LJIIL.onProgressChanged(webView, i);
                                }
                            }

                            @Override // X.C1BVX
                            public final void onReceivedTitle(WebView webView, String str) {
                                super.onReceivedTitle(webView, str);
                                int i = C2187451AjH.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("AbsKitInitParamHandler onReceivedTitle, callback:");
                                C1547430qN3.LIZ.getClass();
                                sbLIZ.append(C1547430qN3.LJIIL());
                                sbLIZ.append(", title:");
                                sbLIZ.append(str);
                                C2188811AlT.LIZIZ(sbLIZ);
                                InterfaceC1547420qN2 interfaceC1547420qN2LJIIL = C1547430qN3.LJIIL();
                                if (interfaceC1547420qN2LJIIL != null) {
                                    interfaceC1547420qN2LJIIL.LIZLLL(str);
                                }
                            }
                        };
                    }
                }
            }
        }
    }
}
