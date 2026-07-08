package X;

import android.graphics.Bitmap;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS7S1001000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0plS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1524120plS extends AbstractC1541650qDj<C1ET2> implements InterfaceC1524070plN {
    public InterfaceC1047120dM6 LLIZ;
    public final C1056770dbf LLIZLLLIL = new C1ET3() { // from class: X.0dbf
        @Override // X.C1ET3
        public final void LJI() {
            super.LJI();
            InterfaceC1047120dM6 interfaceC1047120dM6 = this.LL.LLIZ;
            if (interfaceC1047120dM6 != null) {
                interfaceC1047120dM6.destroy();
            }
        }

        @Override // X.AbstractC1541670qDl
        public final AbstractC1541650qDj<?> getExtension() {
            return this.LL;
        }
    };

    @Override // X.AbstractC1541650qDj
    public final void LIZJ() {
        WebKitView webKitView;
        C1537480q70 hybridContext;
        C0V1Y c0v1yLIZ = LIZ();
        InterfaceC1047120dM6 interfaceC1047120dM6 = null;
        if ((c0v1yLIZ instanceof WebKitView) && (webKitView = (WebKitView) c0v1yLIZ) != null && (hybridContext = webKitView.getHybridContext()) != null) {
            interfaceC1047120dM6 = (InterfaceC1047120dM6) hybridContext.LJFF(InterfaceC1047120dM6.class);
        }
        this.LLIZ = interfaceC1047120dM6;
        C1541640qDi.LIZ(((C1BVV) LIZ()).getExtendableWebChromeClient(), new AbstractC1541650qDj<C1047100dM4>(this) { // from class: X.0dM4
            public final C1047090dM3 LLIZ;

            @Override // X.AbstractC1541650qDj
            public final void LIZJ() {
                LIZLLL("onReceivedTitle", this.LLIZ);
                LIZLLL("onProgressChanged", this.LLIZ);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [X.0dM3] */
            {
                this.LLIZ = new C1BVX() { // from class: X.0dM3
                    @Override // X.AbstractC1541670qDl
                    public final AbstractC1541650qDj<?> getExtension() {
                        return this.LL;
                    }

                    @Override // X.C1BVX
                    public final void onProgressChanged(WebView webView, int i) {
                        String url;
                        String str;
                        super.onProgressChanged(webView, i);
                        if (i == 100 && !C1047070dM1.LJIJI.contains(100)) {
                            String str2 = C1047070dM1.LJIILL;
                            if (webView != null) {
                                url = webView.getUrl();
                            } else {
                                url = null;
                            }
                            if (!Intrinsics.LJFF(str2, url)) {
                                return;
                            }
                            C1047070dM1.LJIJI.add(100);
                            if (C1047070dM1.LJIILJJIL) {
                                return;
                            }
                            String str3 = C1047070dM1.LJIILL;
                            C1040210dAx c1040210dAx = C1047070dM1.LJIILLIIL;
                            if (c1040210dAx != null) {
                                str = c1040210dAx.LIZ;
                            } else {
                                str = null;
                            }
                            if (Intrinsics.LJFF(str3, str) && C1047070dM1.LJIILLIIL != null) {
                                C1047070dM1.LJIILLIIL = null;
                                C1047070dM1.LJIILJJIL = true;
                                return;
                            }
                            C1040580dBY c1040580dBY = new C1040580dBY(C1047070dM1.LJIJ);
                            C1040750dBp.LIZ.getClass();
                            c1040580dBY.log(C1040750dBp.LIZLLL, AFwS252S0000000_16.get$arr$(738));
                            C1047070dM1.LJIILJJIL = true;
                            if (C1047070dM1.LJIIJJI == 1) {
                                C1047070dM1.LJIJJ = System.currentTimeMillis();
                            }
                        }
                    }

                    @Override // X.C1BVX
                    public final void onReceivedTitle(WebView webView, String str) {
                        super.onReceivedTitle(webView, str);
                        InterfaceC1047120dM6 interfaceC1047120dM62 = this.LLIZ;
                        if (interfaceC1047120dM62 != null) {
                            interfaceC1047120dM62.LJLILLLLZI(str);
                        }
                    }
                };
            }
        });
        C1541640qDi.LIZ(((C1BVV) LIZ()).getExtendableWebViewClient(), new AbstractC1541650qDj<C1075550e5x>() { // from class: X.0e5x
            public final C1047080dM2 LLIZ = new AbstractC2205961BVi() { // from class: X.0dM2
                @Override // X.AbstractC1541670qDl
                public final AbstractC1541650qDj<?> getExtension() {
                    return this.LL;
                }

                public static void LIZIZ(String str) {
                    if (!Intrinsics.LJFF(C1047070dM1.LJIILL, str) && !C1047070dM1.LJIILJJIL) {
                        C1040580dBY c1040580dBY = new C1040580dBY(C1047070dM1.LJIJ);
                        C1040750dBp.LIZ.getClass();
                        c1040580dBY.log(C1040750dBp.LJI, AFwS252S0000000_16.get$arr$(741));
                        C1047070dM1.LJIILJJIL = true;
                        if (str == null) {
                            str = "";
                        }
                        C1047070dM1.LJIILL = str;
                        if (C1047070dM1.LJIIJJI == 1) {
                            C1047070dM1.LJIJJ = System.currentTimeMillis();
                        }
                    }
                }

                @Override // X.AbstractC2205961BVi
                public final void onPageFinished(WebView webView, String str) {
                    String str2;
                    super.onPageFinished(webView, str);
                    if (!Intrinsics.LJFF(C1047070dM1.LJIILL, str) || C1047070dM1.LJIILJJIL) {
                        return;
                    }
                    String str3 = C1047070dM1.LJIILL;
                    C1040210dAx c1040210dAx = C1047070dM1.LJIILLIIL;
                    if (c1040210dAx != null) {
                        str2 = c1040210dAx.LIZ;
                    } else {
                        str2 = null;
                    }
                    if (Intrinsics.LJFF(str3, str2) && C1047070dM1.LJIILLIIL != null) {
                        C1047070dM1.LJIILLIIL = null;
                        C1047070dM1.LJIILJJIL = true;
                        return;
                    }
                    C1040580dBY c1040580dBY = new C1040580dBY(C1047070dM1.LJIJ);
                    C1040750dBp.LIZ.getClass();
                    c1040580dBY.log(C1040750dBp.LIZLLL, AFwS252S0000000_16.get$arr$(742));
                    C1047070dM1.LJIILJJIL = true;
                    if (C1047070dM1.LJIIJJI == 1) {
                        C1047070dM1.LJIJJ = System.currentTimeMillis();
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
                @Override // X.AbstractC2205961BVi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean shouldOverrideUrlLoading(android.webkit.WebView r3, android.webkit.WebResourceRequest r4) {
                    /*
                        r2 = this;
                        if (r4 == 0) goto L15
                        boolean r1 = r4.isRedirect()
                        r0 = 1
                        if (r1 == r0) goto L1a
                        android.net.Uri r0 = r4.getUrl()
                        if (r0 == 0) goto L15
                        java.lang.String r0 = r0.toString()
                        if (r0 != 0) goto L17
                    L15:
                        java.lang.String r0 = ""
                    L17:
                        LIZIZ(r0)
                    L1a:
                        boolean r0 = super.shouldOverrideUrlLoading(r3, r4)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1047080dM2.shouldOverrideUrlLoading(android.webkit.WebView, android.webkit.WebResourceRequest):boolean");
                }

                @Override // X.AbstractC2205961BVi
                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    LIZIZ(str);
                    return super.shouldOverrideUrlLoading(webView, str);
                }

                public static void LIZ(int i, String str, String str2) {
                    if (!Intrinsics.LJFF(str, C1047070dM1.LJIILL)) {
                        C1047070dM1.LJIILJJIL = false;
                    }
                    if (C1047070dM1.LJIILJJIL) {
                        return;
                    }
                    C1047070dM1.LJIILLIIL = new C1040210dAx(str);
                    C1040580dBY c1040580dBY = new C1040580dBY(C1047070dM1.LJIJ);
                    C1040750dBp.LIZ.getClass();
                    c1040580dBY.log(C1040750dBp.LJFF, new AwS7S1001000_16(i, str2, 6));
                    C1047070dM1.LJIILJJIL = true;
                    if (C1047070dM1.LJIIJJI == 1) {
                        C1047070dM1.LJIJJ = System.currentTimeMillis();
                    }
                }

                @Override // X.AbstractC2205961BVi
                public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    C1047070dM1.LJIIL = System.currentTimeMillis();
                    int i = 1;
                    C1047070dM1.LJIILIIL++;
                    C1047070dM1.LJIJI.clear();
                    if (C1047070dM1.LJIILIIL > 1) {
                        i = 0;
                    }
                    C1047070dM1.LJIIJJI = i;
                    C1047070dM1.LJIILJJIL = false;
                    if (str == null) {
                        str = "";
                    }
                    C1047070dM1.LJIILL = str;
                }

                @Override // X.AbstractC2205961BVi
                public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                    String url;
                    String string;
                    int errorCode;
                    CharSequence description;
                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                    if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                        if (webView == null || (url = webView.getUrl()) == null) {
                            url = "";
                        }
                        if (webResourceError != null && (description = webResourceError.getDescription()) != null) {
                            string = description.toString();
                        } else {
                            string = null;
                            if (webResourceError == null) {
                                errorCode = 9999;
                            }
                            LIZ(errorCode, url, string);
                        }
                        errorCode = webResourceError.getErrorCode();
                        LIZ(errorCode, url, string);
                    }
                }

                @Override // X.AbstractC2205961BVi
                public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    String url;
                    String reasonPhrase;
                    int statusCode;
                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                    if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                        if (webView == null || (url = webView.getUrl()) == null) {
                            url = "";
                        }
                        if (webResourceResponse != null) {
                            reasonPhrase = webResourceResponse.getReasonPhrase();
                            statusCode = webResourceResponse.getStatusCode();
                        } else {
                            reasonPhrase = null;
                            statusCode = -1;
                        }
                        LIZ(statusCode, url, reasonPhrase);
                    }
                }

                @Override // X.AbstractC2205961BVi
                public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    String url;
                    String string;
                    int primaryError;
                    SslCertificate certificate;
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                    if (webView == null || (url = webView.getUrl()) == null) {
                        url = "";
                    }
                    if (sslError != null && (certificate = sslError.getCertificate()) != null) {
                        string = certificate.toString();
                    } else {
                        string = null;
                        if (sslError == null) {
                            primaryError = 9999;
                        }
                        LIZ(primaryError, url, string);
                    }
                    primaryError = sslError.getPrimaryError();
                    LIZ(primaryError, url, string);
                }

                @Override // X.AbstractC2205961BVi
                public final void onReceivedError(WebView webView, int i, String str, String str2) {
                    String url;
                    super.onReceivedError(webView, i, str, str2);
                    if (webView == null || (url = webView.getUrl()) == null) {
                        url = "";
                    }
                    LIZ(i, url, str);
                }
            };

            @Override // X.AbstractC1541650qDj
            public final void LIZJ() {
                LIZLLL("onPageStarted", this.LLIZ);
                LIZLLL("onPageFinished", this.LLIZ);
                LIZLLL("onReceivedError", this.LLIZ);
                LIZLLL("onReceivedHttpError", this.LLIZ);
                LIZLLL("onReceivedSslError", this.LLIZ);
                LIZLLL("shouldOverrideUrlLoading", this.LLIZ);
            }
        });
        LJ("destroy", this.LLIZLLLIL, 2000);
    }
}
