package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.SystemClock;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.webview.WebViewMonitorHelper;
import com.bytedance.forest.Forest;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.lynx.hybrid.settings.HybridSettings;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0q52, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536260q52 extends AbstractC1541650qDj<C1ET2> implements InterfaceC1524070plN {
    public static final Object LLJIJIL;
    public static final boolean LLJILJIL;
    public static final C1535210q3L LLJILJILJ;
    public static final C1536320q58 LLJILLL;
    public final AtomicBoolean LLIZ = new AtomicBoolean(false);
    public final C1536270q53 LLIZLLLIL = new C1ET3() { // from class: X.0q53
        @Override // X.C1ET3
        public final void LJJLIIIIJ() {
            this.LL.LLIZ.set(false);
            super.LJJLIIIIJ();
        }

        @Override // X.AbstractC1541670qDl
        public final AbstractC1541650qDj<?> getExtension() {
            return this.LL;
        }

        @Override // X.C1ET3
        public final void LJJII(String str) {
            this.LL.LLIZ.set(false);
            super.LJJII(str);
        }

        @Override // X.C1ET3
        public final void LJJIII(String str, Map<String, String> map) {
            this.LL.LLIZ.set(false);
            super.LJJIII(str, map);
        }
    };
    public final C1536280q54 LLJ = new AbstractC1541650qDj<C2205951BVh>() { // from class: X.0q54
        public final C1536250q51 LLIZ;

        @Override // X.AbstractC1541650qDj
        public final boolean LIZIZ() {
            return this.LLIZLLLIL.LLILZ;
        }

        @Override // X.AbstractC1541650qDj
        public final void LIZJ() {
            LJ("onPageFinished", this.LLIZ, 8000);
            LJ("onReceivedError", this.LLIZ, 8000);
            LJ("onReceivedHttpError", this.LLIZ, 8000);
            LJ("onReceivedHttpAuthRequest", this.LLIZ, 8000);
            LJ("onReceivedSslError", this.LLIZ, 8000);
            LJ("onPageStarted", this.LLIZ, 8000);
            LJ("shouldOverrideUrlLoading", this.LLIZ, 8000);
            LJ("onLoadResource", this.LLIZ, 8000);
            LJ("shouldInterceptRequest", this.LLIZ, 8000);
            LJ("onRenderProcessGone", this.LLIZ, 8000);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [X.0q51] */
        {
            this.LLIZ = new AbstractC2205961BVi() { // from class: X.0q51
                public boolean LL;
                public int LLILLJJLI;
                public String LLILLL;
                public boolean LLILZ = true;
                public String LLILZIL;
                public long LLILZLL;
                public int LLIZ;
                public long LLIZLLLIL;

                @Override // X.AbstractC1541670qDl
                public final AbstractC1541650qDj<?> getExtension() {
                    return this.LLJ;
                }

                public final void LIZ(String str) {
                    if (str != null && str.length() != 0) {
                        C1490740otc c1490740otc = C1490740otc.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("markOverrideHandled: url=");
                        sbLIZ.append(str);
                        sbLIZ.append(", time=");
                        sbLIZ.append(SystemClock.elapsedRealtime());
                        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, null, 6);
                        this.LLILZIL = str;
                        this.LLILZLL = SystemClock.elapsedRealtime();
                    }
                }

                @Override // X.AbstractC2205961BVi
                public final void onLoadResource(WebView webView, String str) {
                    WebKitView webKitView;
                    InterfaceC1538820q9A bridgeService$hybrid_web_release;
                    super.onLoadResource(webView, str);
                    if ((webView instanceof WebKitView) && (webKitView = (WebKitView) webView) != null && str != null && (bridgeService$hybrid_web_release = webKitView.getBridgeService$hybrid_web_release()) != null) {
                        bridgeService$hybrid_web_release.LIZJ(str);
                    }
                }

                @Override // X.AbstractC2205961BVi
                public final void onPageFinished(WebView webView, String str) {
                    WebKitView webKitView;
                    WebKitView webKitView2;
                    final WebKitView webKitView3;
                    super.onPageFinished(webView, str);
                    WebViewMonitorHelper.getInstance().onPageFinished(webView, str);
                    boolean z = webView instanceof WebKitView;
                    if (z) {
                        webKitView = (WebKitView) webView;
                    } else {
                        webKitView = null;
                    }
                    if (webKitView != null) {
                        AbstractC1537870q7d webKitLifeCycle$hybrid_web_release = webKitView.getWebKitLifeCycle$hybrid_web_release();
                        if (webKitLifeCycle$hybrid_web_release != null) {
                            webKitLifeCycle$hybrid_web_release.LJLIIIL(webKitView);
                        }
                        webKitView.setReadyToSendEvent$hybrid_web_release(true);
                        webKitView.getHybridContext().LJJIIZI();
                        C1490740otc c1490740otc = C1490740otc.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onPageFinished, url:");
                        sbLIZ.append(str);
                        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, null, 6);
                        if (Intrinsics.LJFF(str, this.LLILLL) && this.LLILZ) {
                            this.LLILZ = false;
                        }
                        C1530570pvr.LIZJ(webKitView.getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.PREPARE_ENGINE_LOAD_END}, null);
                    }
                    if (z && (webKitView3 = (WebKitView) webView) != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("javascript:(function () {    window.reactId = '");
                        sbLIZ2.append(webKitView3.getHybridContext().containerId);
                        sbLIZ2.append("';})();");
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        InterfaceC1055820da8 interfaceC1055820da8 = C1054720dYM.LIZ;
                        if (interfaceC1055820da8 != null) {
                            interfaceC1055820da8.LIZ(webKitView3, strLIZIZ, null, EnumC1055790da5.LoadUrl, new AbstractC1069050dvT() { // from class: X.0dvU
                                @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
                                public final String LJFF(Uri uri, WebView webView2) throws JSONException {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put(FollowStatusChangeMethod.PARAM_UID, webKitView3.getHybridContext().containerId);
                                    return C786410Ut5.J3(jSONObject);
                                }
                            });
                        } else {
                            webKitView3.loadUrl(strLIZIZ);
                        }
                    }
                    if (!this.LL && str != null) {
                        UriProtector.parse(str);
                    }
                    this.LL = false;
                    if (z && (webKitView2 = (WebKitView) webView) != null) {
                        C1541490qDT.LIZLLL.onPageFinished(webKitView2);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
                @Override // X.AbstractC2205961BVi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean onRenderProcessGone(android.webkit.WebView r12, android.webkit.RenderProcessGoneDetail r13) {
                    /*
                        r11 = this;
                        boolean r2 = r12 instanceof com.bytedance.lynx.hybrid.webkit.WebKitView
                        r5 = 0
                        if (r2 == 0) goto L67
                        r0 = r12
                    L6:
                        r4 = 2
                        java.lang.String r3 = "BasicExtension_"
                        if (r0 == 0) goto L12
                        X.0otc r1 = X.C1490740otc.LIZ
                        java.lang.String r0 = "onRenderProcessGone"
                        X.C1490740otc.LIZIZ(r1, r0, r5, r3, r4)
                    L12:
                        boolean r8 = super.onRenderProcessGone(r12, r13)
                        if (r2 == 0) goto L65
                        r0 = r12
                        com.bytedance.lynx.hybrid.webkit.WebKitView r0 = (com.bytedance.lynx.hybrid.webkit.WebKitView) r0
                        if (r0 == 0) goto L65
                        X.0qDS r0 = r0.getInitParams()
                        if (r0 == 0) goto L65
                        X.0q5C r6 = r0.LJIILIIL
                        if (r6 != 0) goto L30
                    L27:
                        boolean r0 = X.C1536260q52.LLJILJIL
                        if (r0 == 0) goto L30
                        X.0q5C r6 = new X.0q5C
                        r6.<init>()
                    L30:
                        X.0dDj r10 = com.bytedance.android.monitorV2.webview.WebViewMonitorHelper.getInstance()
                        X.0phj r9 = new X.0phj
                        int r0 = r11.LLILLJJLI
                        r7 = 1
                        int r2 = r0 + 1
                        if (r6 == 0) goto L62
                        int r1 = r6.LIZ
                        boolean r0 = r6.LIZIZ
                    L41:
                        r9.<init>(r2, r1, r0, r8)
                        r10.handleRenderProcessGone(r12, r13, r9)
                        if (r8 != 0) goto L83
                        if (r6 == 0) goto L83
                        int r1 = r11.LLILLJJLI
                        int r0 = r1 + 1
                        r11.LLILLJJLI = r0
                        int r0 = r6.LIZ
                        if (r1 >= r0) goto L69
                        X.0otc r1 = X.C1490740otc.LIZ
                        java.lang.String r0 = "onRenderProcessGone reload"
                        X.C1490740otc.LIZIZ(r1, r0, r5, r3, r4)
                        if (r12 == 0) goto L61
                        r12.reload()
                    L61:
                        return r7
                    L62:
                        r1 = -1
                        r0 = 0
                        goto L41
                    L65:
                        r6 = r5
                        goto L27
                    L67:
                        r0 = r5
                        goto L6
                    L69:
                        X.0otc r2 = X.C1490740otc.LIZ
                        java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                        java.lang.String r0 = "onRenderProcessGone avoidCrash="
                        r1.append(r0)
                        boolean r0 = r6.LIZIZ
                        r1.append(r0)
                        java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                        X.C1490740otc.LIZIZ(r2, r0, r5, r3, r4)
                        boolean r7 = r6.LIZIZ
                        return r7
                    L83:
                        X.0otc r2 = X.C1490740otc.LIZ
                        java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                        java.lang.String r0 = "onRenderProcessGone ret="
                        r1.append(r0)
                        r1.append(r8)
                        java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                        X.C1490740otc.LIZIZ(r2, r0, r5, r3, r4)
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1536250q51.onRenderProcessGone(android.webkit.WebView, android.webkit.RenderProcessGoneDetail):boolean");
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:271:0x049d  */
                /* JADX WARN: Removed duplicated region for block: B:288:0x04ec  */
                /* JADX WARN: Removed duplicated region for block: B:329:0x05ba  */
                /* JADX WARN: Removed duplicated region for block: B:349:0x062b  */
                /* JADX WARN: Type inference failed for: r0v124 */
                /* JADX WARN: Type inference failed for: r0v140 */
                /* JADX WARN: Type inference failed for: r0v142 */
                /* JADX WARN: Type inference failed for: r0v46 */
                /* JADX WARN: Type inference failed for: r0v48 */
                /* JADX WARN: Type inference failed for: r9v2, types: [com.tiktok.forestx.RequestParamsX] */
                /* JADX WARN: Type inference failed for: r9v28, types: [com.bytedance.forest.model.RequestParams] */
                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object] */
                @Override // X.AbstractC2205961BVi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r27, android.webkit.WebResourceRequest r28) throws org.json.JSONException {
                    /*
                        Method dump skipped, instruction units count: 1585
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1536250q51.shouldInterceptRequest(android.webkit.WebView, android.webkit.WebResourceRequest):android.webkit.WebResourceResponse");
                }

                /* JADX WARN: Removed duplicated region for block: B:82:0x028d A[PHI: r7
                  0x028d: PHI (r7v3 java.lang.String) = (r7v1 java.lang.String), (r7v1 java.lang.String), (r7v4 java.lang.String) binds: [B:14:0x0030, B:16:0x0036, B:81:0x028c] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // X.AbstractC2205961BVi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean shouldOverrideUrlLoading(android.webkit.WebView r20, java.lang.String r21) throws org.json.JSONException {
                    /*
                        Method dump skipped, instruction units count: 666
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1536250q51.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
                }

                @Override // X.AbstractC2205961BVi
                public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    return super.shouldInterceptRequest(webView, str);
                }

                @Override // X.AbstractC2205961BVi
                public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                    WebKitView webKitView;
                    WebKitView webKitView2;
                    Uri url;
                    C1536330q59 c1536330q59;
                    InterfaceC1536300q56 navigationServiceProtocol$hybrid_web_release;
                    Uri url2;
                    Uri url3;
                    String string = null;
                    if (super.shouldOverrideUrlLoading(webView, webResourceRequest)) {
                        if (webResourceRequest != null && (url3 = webResourceRequest.getUrl()) != null) {
                            string = url3.toString();
                        }
                        LIZ(string);
                        return true;
                    }
                    boolean z = webView instanceof WebKitView;
                    if (z) {
                        webKitView = (WebKitView) webView;
                    } else {
                        webKitView = null;
                    }
                    if (webKitView != null && (navigationServiceProtocol$hybrid_web_release = webKitView.getNavigationServiceProtocol$hybrid_web_release()) != null && navigationServiceProtocol$hybrid_web_release.LIZ(webKitView.getHybridContext(), webKitView.getHybridRuntime$hybrid_web_release(), webView, webResourceRequest)) {
                        if (webResourceRequest != null && (url2 = webResourceRequest.getUrl()) != null) {
                            string = url2.toString();
                        }
                        LIZ(string);
                        return true;
                    }
                    if (z && (webKitView2 = (WebKitView) webView) != null && webResourceRequest != null && (url = webResourceRequest.getUrl()) != null && (c1536330q59 = (C1536330q59) webKitView2.getHybridContext().LJFF(C1536330q59.class)) != null) {
                        c1536330q59.LJLJL(url.toString(), webResourceRequest.isRedirect());
                    }
                    return false;
                }

                @Override // X.AbstractC2205961BVi
                public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    WebKitView webKitView;
                    InterfaceC1538820q9A bridgeService$hybrid_web_release;
                    if ((webView instanceof WebKitView) && (webKitView = (WebKitView) webView) != null) {
                        if (this.LLILLL == null && this.LLILZ) {
                            C1530570pvr.LIZJ(webKitView.getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.PREPARE_ENGINE_LOAD_START}, null);
                            this.LLILLL = str;
                        }
                        if (str != null && (bridgeService$hybrid_web_release = webKitView.getBridgeService$hybrid_web_release()) != null) {
                            bridgeService$hybrid_web_release.LIZLLL(str);
                        }
                        InterfaceC1536300q56 navigationServiceProtocol$hybrid_web_release = webKitView.getNavigationServiceProtocol$hybrid_web_release();
                        if (navigationServiceProtocol$hybrid_web_release != null) {
                            navigationServiceProtocol$hybrid_web_release.LIZJ(webKitView.getHybridContext(), webKitView.getHybridRuntime$hybrid_web_release(), webView, str);
                        }
                        C1490740otc c1490740otc = C1490740otc.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onPageStarted, url:");
                        sbLIZ.append(str);
                        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, null, 6);
                    }
                    super.onPageStarted(webView, str, bitmap);
                    WebViewMonitorHelper.getInstance().onPageStarted(webView, str, bitmap);
                }

                @Override // X.AbstractC2205961BVi
                public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                    WebKitView webKitView;
                    boolean z;
                    Integer numValueOf;
                    CharSequence description;
                    Uri url;
                    Boolean boolValueOf;
                    Integer numValueOf2;
                    CharSequence description2;
                    Integer numValueOf3;
                    CharSequence description3;
                    Integer numValueOf4;
                    CharSequence description4;
                    if (webView instanceof WebKitView) {
                        webKitView = (WebKitView) webView;
                    } else {
                        webKitView = null;
                    }
                    if (webKitView != null) {
                        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            AbstractC1537870q7d webKitLifeCycle$hybrid_web_release = webKitView.getWebKitLifeCycle$hybrid_web_release();
                            String str = "";
                            if (webKitLifeCycle$hybrid_web_release != null) {
                                String webUrl$hybrid_web_release = webKitView.getWebUrl$hybrid_web_release();
                                if (webUrl$hybrid_web_release == null) {
                                    webUrl$hybrid_web_release = "";
                                }
                                C1542120qEU c1542120qEU = new C1542120qEU();
                                c1542120qEU.LIZ = 207;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("errorCode:");
                                if (webResourceError != null) {
                                    numValueOf3 = Integer.valueOf(webResourceError.getErrorCode());
                                } else {
                                    numValueOf3 = null;
                                }
                                sbLIZ.append(numValueOf3);
                                sbLIZ.append(", description:");
                                if (webResourceError != null) {
                                    description3 = webResourceError.getDescription();
                                } else {
                                    description3 = null;
                                }
                                sbLIZ.append((Object) description3);
                                sbLIZ.append(' ');
                                c1542120qEU.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                if (webResourceError != null) {
                                    numValueOf4 = Integer.valueOf(webResourceError.getErrorCode());
                                } else {
                                    numValueOf4 = null;
                                }
                                c1542120qEU.LIZJ = numValueOf4;
                                if (webResourceError != null) {
                                    description4 = webResourceError.getDescription();
                                } else {
                                    description4 = null;
                                }
                                c1542120qEU.LIZLLL = String.valueOf(description4);
                                webKitLifeCycle$hybrid_web_release.LJL(webKitView, webUrl$hybrid_web_release, c1542120qEU);
                            }
                            String str2 = webKitView.getHybridContext().containerId;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("errorCode:");
                            if (webResourceError != null) {
                                numValueOf2 = Integer.valueOf(webResourceError.getErrorCode());
                            } else {
                                numValueOf2 = null;
                            }
                            sbLIZ2.append(numValueOf2);
                            sbLIZ2.append(", description:");
                            if (webResourceError != null) {
                                description2 = webResourceError.getDescription();
                            } else {
                                description2 = null;
                            }
                            sbLIZ2.append((Object) description2);
                            sbLIZ2.append(' ');
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                            String str3 = webKitView.getHybridContext().vaid;
                            if (str3 != null) {
                                str = str3;
                            }
                            webKitView.getHybridContext();
                            C1520080pew.LJ(webKitView, str2, new C1520180pf6(205, strLIZIZ, str));
                        }
                        C1490740otc c1490740otc = C1490740otc.LIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("onReceivedError, errorCode:");
                        if (webResourceError != null) {
                            numValueOf = Integer.valueOf(webResourceError.getErrorCode());
                        } else {
                            numValueOf = null;
                        }
                        sbLIZ3.append(numValueOf);
                        sbLIZ3.append(", description:");
                        if (webResourceError != null) {
                            description = webResourceError.getDescription();
                        } else {
                            description = null;
                        }
                        sbLIZ3.append((Object) description);
                        sbLIZ3.append(", failingUrl:");
                        if (webResourceRequest != null) {
                            url = webResourceRequest.getUrl();
                        } else {
                            url = null;
                        }
                        sbLIZ3.append(url);
                        sbLIZ3.append(", isForMainFrame:");
                        if (webResourceRequest != null) {
                            boolValueOf = Boolean.valueOf(webResourceRequest.isForMainFrame());
                        } else {
                            boolValueOf = null;
                        }
                        sbLIZ3.append(boolValueOf);
                        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ3), null, null, 6);
                    }
                    if (webResourceRequest != null && webResourceRequest.isForMainFrame() && 1 != 0) {
                        this.LL = true;
                    }
                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                    WebViewMonitorHelper.getInstance().handleRequestError(webView, webResourceRequest, webResourceError);
                }

                @Override // X.AbstractC2205961BVi
                public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    WebKitView webKitView;
                    Integer numValueOf;
                    String reasonPhrase;
                    Uri url;
                    Boolean boolValueOf;
                    C1535690q47 c1535690q47;
                    HybridSchemaParam hybridSchemaParamLIZJ;
                    boolean z;
                    AbstractC1537870q7d webKitLifeCycle$hybrid_web_release;
                    String reasonPhrase2;
                    Integer numValueOf2;
                    String reasonPhrase3;
                    String reasonPhrase4;
                    if ((webView instanceof WebKitView) && (webKitView = (WebKitView) webView) != null) {
                        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                            this.LL = true;
                            C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
                            InterfaceC1529520puA interfaceC1529520puA = C1161970gLL.LIZIZ().LJFF;
                            if (interfaceC1529520puA instanceof C1535690q47) {
                                c1535690q47 = (C1535690q47) interfaceC1529520puA;
                            } else {
                                c1535690q47 = null;
                            }
                            InterfaceC1531560pxS interfaceC1531560pxS = webKitView.getHybridContext().hybridParams;
                            if (interfaceC1531560pxS != null) {
                                hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ();
                            } else {
                                hybridSchemaParamLIZJ = null;
                            }
                            if (c1535690q47 != null && !c1535690q47.LIZJ) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if ((z || ((hybridSchemaParamLIZJ != null && !hybridSchemaParamLIZJ.getIgnoreWebHttpOrSslError()) || Intrinsics.LJFF(C1536260q52.LLJIJIL, Boolean.FALSE))) && (webKitLifeCycle$hybrid_web_release = webKitView.getWebKitLifeCycle$hybrid_web_release()) != null) {
                                String string = webResourceRequest.getUrl().toString();
                                C1542120qEU c1542120qEU = new C1542120qEU();
                                c1542120qEU.LIZ = 206;
                                if (webResourceResponse != null) {
                                    reasonPhrase2 = webResourceResponse.getReasonPhrase();
                                } else {
                                    reasonPhrase2 = null;
                                }
                                c1542120qEU.LIZIZ = reasonPhrase2;
                                if (webResourceResponse != null) {
                                    numValueOf2 = Integer.valueOf(webResourceResponse.getStatusCode());
                                } else {
                                    numValueOf2 = null;
                                }
                                c1542120qEU.LIZJ = numValueOf2;
                                if (webResourceResponse != null) {
                                    reasonPhrase3 = webResourceResponse.getReasonPhrase();
                                } else {
                                    reasonPhrase3 = null;
                                }
                                c1542120qEU.LIZLLL = reasonPhrase3;
                                webKitLifeCycle$hybrid_web_release.LJL(webKitView, string, c1542120qEU);
                            }
                            String str = webKitView.getHybridContext().containerId;
                            String str2 = "";
                            if (webResourceResponse == null || (reasonPhrase4 = webResourceResponse.getReasonPhrase()) == null) {
                                reasonPhrase4 = "";
                            }
                            String str3 = webKitView.getHybridContext().vaid;
                            if (str3 != null) {
                                str2 = str3;
                            }
                            webKitView.getHybridContext();
                            C1520080pew.LJ(webKitView, str, new C1520180pf6(206, reasonPhrase4, str2));
                        }
                        C1490740otc c1490740otc = C1490740otc.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onReceivedError, errorCode:");
                        if (webResourceResponse != null) {
                            numValueOf = Integer.valueOf(webResourceResponse.getStatusCode());
                        } else {
                            numValueOf = null;
                        }
                        sbLIZ.append(numValueOf);
                        sbLIZ.append(", reason:");
                        if (webResourceResponse != null) {
                            reasonPhrase = webResourceResponse.getReasonPhrase();
                        } else {
                            reasonPhrase = null;
                        }
                        sbLIZ.append(reasonPhrase);
                        sbLIZ.append(", failingUrl:");
                        if (webResourceRequest != null) {
                            url = webResourceRequest.getUrl();
                        } else {
                            url = null;
                        }
                        sbLIZ.append(url);
                        sbLIZ.append(", isForMainFrame:");
                        if (webResourceRequest != null) {
                            boolValueOf = Boolean.valueOf(webResourceRequest.isForMainFrame());
                        } else {
                            boolValueOf = null;
                        }
                        sbLIZ.append(boolValueOf);
                        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, null, 6);
                    }
                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                    WebViewMonitorHelper.getInstance().handleRequestHttpError(webView, webResourceRequest, webResourceResponse);
                }

                @Override // X.AbstractC2205961BVi
                public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    WebKitView webKitView;
                    C1535690q47 c1535690q47;
                    HybridSchemaParam hybridSchemaParamLIZJ;
                    boolean z;
                    AbstractC1537870q7d webKitLifeCycle$hybrid_web_release;
                    String string;
                    Integer numValueOf;
                    String string2;
                    String string3;
                    String string4;
                    this.LL = true;
                    if ((webView instanceof WebKitView) && (webKitView = (WebKitView) webView) != null) {
                        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
                        InterfaceC1529520puA interfaceC1529520puA = C1161970gLL.LIZIZ().LJFF;
                        if (interfaceC1529520puA instanceof C1535690q47) {
                            c1535690q47 = (C1535690q47) interfaceC1529520puA;
                        } else {
                            c1535690q47 = null;
                        }
                        InterfaceC1531560pxS interfaceC1531560pxS = webKitView.getHybridContext().hybridParams;
                        if (interfaceC1531560pxS != null) {
                            hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ();
                        } else {
                            hybridSchemaParamLIZJ = null;
                        }
                        if (c1535690q47 != null && !c1535690q47.LIZJ) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String str = "";
                        if ((z || ((hybridSchemaParamLIZJ != null && !hybridSchemaParamLIZJ.getIgnoreWebHttpOrSslError()) || Intrinsics.LJFF(C1536260q52.LLJIJIL, Boolean.FALSE))) && (webKitLifeCycle$hybrid_web_release = webKitView.getWebKitLifeCycle$hybrid_web_release()) != null) {
                            String webUrl$hybrid_web_release = webKitView.getWebUrl$hybrid_web_release();
                            if (webUrl$hybrid_web_release == null) {
                                webUrl$hybrid_web_release = "";
                            }
                            C1542120qEU c1542120qEU = new C1542120qEU();
                            c1542120qEU.LIZ = 208;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onReceivedSslError, error:");
                            if (sslError != null) {
                                string = sslError.toString();
                            } else {
                                string = null;
                            }
                            sbLIZ.append(string);
                            c1542120qEU.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            if (sslError != null) {
                                numValueOf = Integer.valueOf(sslError.getPrimaryError());
                            } else {
                                numValueOf = null;
                            }
                            c1542120qEU.LIZJ = numValueOf;
                            if (sslError != null) {
                                string2 = sslError.toString();
                            } else {
                                string2 = null;
                            }
                            c1542120qEU.LIZLLL = string2;
                            webKitLifeCycle$hybrid_web_release.LJL(webKitView, webUrl$hybrid_web_release, c1542120qEU);
                        }
                        String str2 = webKitView.getHybridContext().containerId;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onReceivedSslError, error:");
                        if (sslError != null) {
                            string3 = sslError.toString();
                        } else {
                            string3 = null;
                        }
                        sbLIZ2.append(string3);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        String str3 = webKitView.getHybridContext().vaid;
                        if (str3 != null) {
                            str = str3;
                        }
                        webKitView.getHybridContext();
                        C1520080pew.LJ(webKitView, str2, new C1520180pf6(205, strLIZIZ, str));
                        C1490740otc c1490740otc = C1490740otc.LIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("onReceivedSslError, error:");
                        if (sslError != null) {
                            string4 = sslError.toString();
                        } else {
                            string4 = null;
                        }
                        sbLIZ3.append(string4);
                        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ3), null, null, 6);
                    }
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }

                @Override // X.AbstractC2205961BVi
                public final void onReceivedError(WebView webView, int i, String str, String str2) {
                    WebKitView webKitView;
                    IResourceServiceX resource$hybrid_web_release;
                    Forest forest;
                    if (C1535630q41.LJIILL && str2 != null && (webView instanceof WebKitView) && (webKitView = (WebKitView) webView) != null && (resource$hybrid_web_release = webKitView.getResource$hybrid_web_release()) != null && (forest = resource$hybrid_web_release.getForest()) != null) {
                        forest.onUrlCorrupt(Collections.singletonList(str2));
                    }
                    this.LL = true;
                }

                @Override // X.AbstractC2205961BVi
                public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
                    super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
                    if ((webView instanceof WebKitView) && webView != null) {
                        C1490740otc c1490740otc = C1490740otc.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onReceivedHttpAuthRequest, host:");
                        sbLIZ.append(str);
                        sbLIZ.append(", realm:");
                        sbLIZ.append(str2);
                        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, null, 6);
                    }
                }
            };
        }
    };
    public final C1541540qDY LLJI = new AbstractC1541650qDj<C1BVW>() { // from class: X.0qDY
        public final C1541500qDU LLIZ;

        @Override // X.AbstractC1541650qDj
        public final boolean LIZIZ() {
            return this.LLIZLLLIL.LLILZ;
        }

        @Override // X.AbstractC1541650qDj
        public final void LIZJ() {
            LJ("onProgressChanged", this.LLIZ, 8000);
            LJ("getDefaultVideoPoster", this.LLIZ, 8000);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [X.0qDU] */
        {
            this.LLIZ = new C1BVX() { // from class: X.0qDU
                @Override // X.C1BVX
                public final Bitmap getDefaultVideoPoster() {
                    WebKitView webKitView;
                    C1541480qDS initParams;
                    Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
                    C0V1Y c0v1yLIZ = c1536260q52.LIZ();
                    return ((!(c0v1yLIZ instanceof WebKitView) || (webKitView = (WebKitView) c0v1yLIZ) == null || (initParams = webKitView.getInitParams()) == null || !Intrinsics.LJFF(initParams.LJIILJJIL, Boolean.TRUE)) && defaultVideoPoster != null) ? defaultVideoPoster : Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                }

                @Override // X.AbstractC1541670qDl
                public final AbstractC1541650qDj<?> getExtension() {
                    return this.LL;
                }

                @Override // X.C1BVX
                public final void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                    WebViewMonitorHelper.getInstance().onProgressChanged(webView, i);
                }
            };
        }
    };

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0q3L] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0q58] */
    static {
        Object objValueOf;
        try {
            JSONObject config = HybridSettings.INSTANCE.getConfig("ignore_web_http_or_ssl_error_setting");
            objValueOf = config != null ? Integer.valueOf(config.optInt("enable", 1)) : Boolean.TRUE;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            objValueOf = 1;
        }
        LLJIJIL = objValueOf;
        JSONObject config2 = HybridSettings.INSTANCE.getConfig("set_default_render_process_gone_handler");
        LLJILJIL = config2 != null ? config2.optBoolean("enable", true) : true;
        LLJILJILJ = new InterfaceC1530490pvj() { // from class: X.0q3L
            @Override // X.InterfaceC1530490pvj
            public final boolean LIZ(C1534360q1y<?> c1534360q1y, C1533790q13 c1533790q13, boolean z, boolean z2) {
                return Intrinsics.LJFF(c1534360q1y.LIZJ, InputStream.class);
            }
        };
        LLJILLL = new InterfaceC1533160q02() { // from class: X.0q58
            @Override // X.InterfaceC1533160q02
            public final boolean LIZ(Class cls, boolean z) {
                return Intrinsics.LJFF(cls, InputStream.class);
            }
        };
    }

    @Override // X.AbstractC1541650qDj
    public final void LIZJ() {
        this.LLILLL = "basic";
        LJ("loadUrl", this.LLIZLLLIL, 8000);
        LJ("reload", this.LLIZLLLIL, 8000);
        C1541640qDi.LIZ(((C1BVV) LIZ()).getExtendableWebViewClient(), this.LLJ);
        C1541640qDi.LIZ(((C1BVV) LIZ()).getExtendableWebChromeClient(), this.LLJI);
    }
}
