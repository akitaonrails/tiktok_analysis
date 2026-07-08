package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.ConsoleMessage;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tts.oecverify.BdTuring;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.14AS, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14AS {
    public final Context LIZ;
    public C14BO LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LJ;
    public FrameLayout LJFF;
    public C20221114Af LJI;
    public final C14B5 LJII;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.14B5] */
    public C14AS(final Context context) {
        this.LJII = new AbstractC1539010q9T() { // from class: X.14B5
            @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
            public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                C1541480qDS c1541480qDS;
                boolean z = interfaceC1531560pxS instanceof C1541480qDS;
                if (z) {
                    C1541480qDS c1541480qDS2 = (C1541480qDS) interfaceC1531560pxS;
                    if (c1541480qDS2 != null) {
                        c1541480qDS2.LJ = new InterfaceC1541760qDu() { // from class: X.14B4
                            @Override // X.InterfaceC1541760qDu
                            public final void LIZ(WebSettings webSettings, WebKitView webKitView) {
                                webSettings.setLoadWithOverviewMode(true);
                                webSettings.setDomStorageEnabled(true);
                                webSettings.setAppCacheEnabled(false);
                                webSettings.setUseWideViewPort(true);
                                webSettings.setSupportZoom(false);
                                webSettings.setAllowFileAccessFromFileURLs(false);
                                webSettings.setLoadsImagesAutomatically(true);
                                webSettings.setDefaultTextEncodingName("utf-8");
                                webSettings.setCacheMode(2);
                                webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
                                webSettings.setTextZoom(100);
                                if (BdTuring.getInstance().getConfig().isRegionBoe()) {
                                    webSettings.setMixedContentMode(0);
                                }
                            }
                        };
                    }
                    if (z) {
                        C1541480qDS c1541480qDS3 = (C1541480qDS) interfaceC1531560pxS;
                        if (c1541480qDS3 != null) {
                            final C14AS c14as = this.LLILLJJLI;
                            final Context context2 = context;
                            c1541480qDS3.LIZJ = new C844210X9v() { // from class: X.14BM
                                @Override // X.AbstractC2205961BVi
                                public final void onPageFinished(WebView webView, String str) {
                                    c14as.getClass();
                                    C14AS c14as2 = c14as;
                                    if (!c14as2.LIZJ && !c14as2.LIZLLL) {
                                        c14as2.LIZLLL = true;
                                        C14BO c14bo = c14as2.LIZIZ;
                                        if (c14bo != null) {
                                            c14bo.LIZIZ();
                                        }
                                    }
                                    super.onPageFinished(webView, str);
                                }

                                @Override // X.AbstractC2205961BVi
                                public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                                    if (a0.LJJIIZI(str.toLowerCase(Locale.getDefault()), "/favicon.ico", false)) {
                                        try {
                                            return new WebResourceResponse("image/png", null, null);
                                        } catch (Exception e) {
                                            TryCatchGuardChecker.doCheck(e);
                                        }
                                    }
                                    return super.shouldInterceptRequest(webView, str);
                                }

                                @Override // X.AbstractC2205961BVi
                                public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                                    c14as.getClass();
                                    super.onPageStarted(webView, str, bitmap);
                                }

                                @Override // X.AbstractC2205961BVi
                                public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                                    if (C14A6.LIZ()) {
                                        C786410Ut5.re(Toast.makeText(context2, Intrinsics.LJIIJJI(webResourceResponse, "onReceivedHttpError : "), 1));
                                    }
                                    c14as.getClass();
                                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                                    try {
                                        a0.LJJIIZI(webResourceRequest.getUrl().toString().toLowerCase(Locale.getDefault()), "/favicon.ico", false);
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        C14A6.LIZIZ();
                                    }
                                }

                                @Override // X.AbstractC2205961BVi
                                public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                                    if (C14A6.LIZ()) {
                                        C786410Ut5.re(Toast.makeText(context2, Intrinsics.LJIIJJI(sslError, "onReceivedSslError : "), 1));
                                    }
                                    c14as.getClass();
                                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                                }

                                @Override // X.AbstractC2205961BVi
                                public final void onReceivedError(WebView webView, int i, String str, String str2) {
                                    C14AS c14as2 = c14as;
                                    c14as2.LIZJ = true;
                                    c14as2.getClass();
                                    C786410Ut5.j4("%d onReceivedError %s", Arrays.copyOf(new Object[]{Integer.valueOf(i), str}, 2));
                                    C14BO c14bo = c14as.LIZIZ;
                                    if (c14bo != null) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append((Object) str);
                                        sbLIZ.append('|');
                                        sbLIZ.append((Object) str2);
                                        c14bo.LIZ(i, C2188811AlT.LIZIZ(sbLIZ));
                                    }
                                    c14as.getClass();
                                    super.onReceivedError(webView, i, str, str2);
                                }
                            };
                        }
                        if (z && (c1541480qDS = (C1541480qDS) interfaceC1531560pxS) != null) {
                            c1541480qDS.LIZLLL = new C1542400qEw() { // from class: X.14B6
                                @Override // X.C1BVX
                                public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                                    return super.onConsoleMessage(consoleMessage);
                                }
                            };
                        }
                    }
                }
            }
        };
        this.LIZ = context;
    }
}
