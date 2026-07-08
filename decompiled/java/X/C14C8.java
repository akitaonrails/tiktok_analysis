package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.ConsoleMessage;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.Toast;
import com.bytedance.bdturing.twiceverify.TwiceVerifyWebActivity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14C8, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14C8 extends AbstractC1541650qDj<C1ET2> implements InterfaceC1524070plN {
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public InterfaceC20220614Aa LLJ;
    public Context LLJI;
    public Context LLJIJIL;
    public final C14C9 LLJILJIL = new C1ET3() { // from class: X.14C9
        @Override // X.AbstractC1541670qDl
        public final AbstractC1541650qDj<?> getExtension() {
            return this.LL;
        }
    };

    @Override // X.AbstractC1541650qDj
    public final void LIZJ() {
        C1541640qDi.LIZ(((C1BVV) LIZ()).getExtendableWebViewClient(), new AbstractC1541650qDj<C2205951BVh>(this) { // from class: X.14Bn
            public final C14BN LLIZ;

            @Override // X.AbstractC1541650qDj
            public final void LIZJ() {
                LJ("onPageStarted", this.LLIZ, 7000);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [X.14BN] */
            {
                this.LLIZ = new AbstractC2205961BVi() { // from class: X.14BN
                    @Override // X.AbstractC1541670qDl
                    public final AbstractC1541650qDj<?> getExtension() {
                        return this.LL;
                    }

                    @Override // X.AbstractC2205961BVi
                    public final void onPageFinished(WebView webView, String str) {
                        C14C8 c14c8 = this;
                        if (!c14c8.LLIZ && !c14c8.LLIZLLLIL) {
                            c14c8.LLIZLLLIL = true;
                            InterfaceC20220614Aa interfaceC20220614Aa = c14c8.LLJ;
                            if (interfaceC20220614Aa != null) {
                                interfaceC20220614Aa.LIZIZ(1);
                            }
                        }
                        super.onPageFinished(webView, str);
                    }

                    @Override // X.AbstractC2205961BVi
                    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                        super.onPageStarted(webView, str, bitmap);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
                    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
                    @Override // X.AbstractC2205961BVi
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void onReceivedHttpError(android.webkit.WebView r5, android.webkit.WebResourceRequest r6, android.webkit.WebResourceResponse r7) {
                        /*
                            r4 = this;
                            boolean r0 = X.C20221514Aj.LIZ()
                            r3 = 0
                            if (r0 == 0) goto L1c
                            X.14C8 r0 = r2
                            android.content.Context r2 = r0.LLJI
                            if (r7 != 0) goto L2a
                            r1 = r3
                        Le:
                            java.lang.String r0 = "onReceivedHttpError : "
                            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.LJIIJJI(r1, r0)
                            r0 = 1
                            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r1, r0)
                            X.C786410Ut5.re(r0)
                        L1c:
                            X.14C8 r0 = r2
                            android.content.Context r0 = r0.LLJIJIL
                            r2 = 0
                            if (r0 == 0) goto L48
                            boolean r0 = r0 instanceof com.bytedance.bdturing.twiceverify.TwiceVerifyWebActivity
                            if (r0 == 0) goto L48
                            if (r7 == 0) goto L3c
                            goto L33
                        L2a:
                            int r0 = r7.getStatusCode()
                            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                            goto Le
                        L33:
                            int r1 = r7.getStatusCode()     // Catch: java.lang.Throwable -> L38
                            goto L3d
                        L38:
                            r0 = move-exception
                            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                        L3c:
                            r1 = 0
                        L3d:
                            X.14C8 r0 = r2
                            android.content.Context r0 = r0.LLJIJIL
                            if (r0 == 0) goto L71
                            com.bytedance.bdturing.twiceverify.TwiceVerifyWebActivity r0 = (com.bytedance.bdturing.twiceverify.TwiceVerifyWebActivity) r0
                            r0.LLLLLZL(r1)
                        L48:
                            super.onReceivedHttpError(r5, r6, r7)
                            if (r6 == 0) goto L51
                            android.net.Uri r3 = r6.getUrl()     // Catch: java.lang.Exception -> L66
                        L51:
                            java.lang.String r1 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> L66
                            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch: java.lang.Exception -> L66
                            java.lang.String r1 = r1.toLowerCase(r0)     // Catch: java.lang.Exception -> L66
                            java.lang.String r0 = "/favicon.ico"
                            boolean r0 = kotlin.text.a0.LJJIIZI(r1, r0, r2)     // Catch: java.lang.Exception -> L66
                            if (r0 == 0) goto L6d
                            return
                        L66:
                            r0 = move-exception
                            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                            X.C20221514Aj.LIZIZ()
                        L6d:
                            super.onReceivedHttpError(r5, r6, r7)
                            return
                        L71:
                            java.lang.NullPointerException r1 = new java.lang.NullPointerException
                            java.lang.String r0 = "null cannot be cast to non-null type com.bytedance.bdturing.twiceverify.TwiceVerifyWebActivity"
                            r1.<init>(r0)
                            throw r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C14BN.onReceivedHttpError(android.webkit.WebView, android.webkit.WebResourceRequest, android.webkit.WebResourceResponse):void");
                    }

                    @Override // X.AbstractC2205961BVi
                    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                        if (C20221514Aj.LIZ()) {
                            C786410Ut5.re(Toast.makeText(this.LLJI, Intrinsics.LJIIJJI(sslError, "onReceivedSslError : "), 1));
                        }
                        Context context = this.LLJIJIL;
                        if (context != null && (context instanceof TwiceVerifyWebActivity)) {
                            int primaryError = 0;
                            if (sslError != null) {
                                try {
                                    primaryError = sslError.getPrimaryError();
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            }
                            Context context2 = this.LLJIJIL;
                            if (context2 != null) {
                                ((TwiceVerifyWebActivity) context2).LLLLLZL(primaryError);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type com.bytedance.bdturing.twiceverify.TwiceVerifyWebActivity");
                            }
                        }
                        super.onReceivedSslError(webView, sslErrorHandler, sslError);
                    }

                    @Override // X.AbstractC2205961BVi
                    public final void onReceivedError(WebView webView, int i, String str, String str2) {
                        this.LLIZ = true;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(i);
                        sbLIZ.append(" onReceivedError ");
                        sbLIZ.append((Object) str);
                        C2188811AlT.LIZIZ(sbLIZ);
                        InterfaceC20220614Aa interfaceC20220614Aa = this.LLJ;
                        if (interfaceC20220614Aa != null) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append((Object) str);
                            sbLIZ2.append('|');
                            sbLIZ2.append((Object) str2);
                            interfaceC20220614Aa.LIZ(i, 1, C2188811AlT.LIZIZ(sbLIZ2));
                        }
                        Context context = this.LLJIJIL;
                        if (context != null && (context instanceof TwiceVerifyWebActivity)) {
                            ((TwiceVerifyWebActivity) context).LLLLLZL(i);
                        }
                        super.onReceivedError(webView, i, str, str2);
                    }
                };
            }
        });
        C1541640qDi.LIZ(((C1BVV) LIZ()).getExtendableWebChromeClient(), new AbstractC1541650qDj<C1BVW>() { // from class: X.14Bo
            public final C14BB LLIZ = new C1BVX() { // from class: X.14BB
                @Override // X.AbstractC1541670qDl
                public final AbstractC1541650qDj<?> getExtension() {
                    return this.LL;
                }

                @Override // X.C1BVX
                public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                    ConsoleMessage.MessageLevel messageLevel;
                    String strMessage = null;
                    if (consoleMessage == null) {
                        messageLevel = null;
                    } else {
                        messageLevel = consoleMessage.messageLevel();
                    }
                    if (messageLevel == ConsoleMessage.MessageLevel.ERROR) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("JS Error: ");
                        sbLIZ.append((Object) consoleMessage.message());
                        sbLIZ.append(" -- From line ");
                        sbLIZ.append(consoleMessage.lineNumber());
                        sbLIZ.append(" of ");
                        sbLIZ.append((Object) consoleMessage.sourceId());
                        C202179148z.LJ(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    if (C20221514Aj.LIZ()) {
                        if (consoleMessage != null) {
                            strMessage = consoleMessage.message();
                        }
                        Intrinsics.LJIIJJI(strMessage, "onConsoleMessage: ");
                        return super.onConsoleMessage(consoleMessage);
                    }
                    return true;
                }
            };

            @Override // X.AbstractC1541650qDj
            public final void LIZJ() {
                LIZLLL("onCloseWindow", this.LLIZ);
            }
        });
        LJ("loadUrl", this.LLJILJIL, 8000);
        LJ("destroy", this.LLJILJIL, 2000);
    }
}
