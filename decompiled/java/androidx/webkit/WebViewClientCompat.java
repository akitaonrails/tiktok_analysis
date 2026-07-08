package androidx.webkit;

import X.C085G;
import X.C085J;
import X.C2197831B0b;
import X.C2202361BHm;
import X.C2266731Dnr;
import X.C2266811Dnz;
import X.C2266821Do0;
import X.C2266851Do3;
import android.app.PendingIntent;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.internal.WebViewFeatureInternal;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes36.dex */
public class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface {
    public static final String[] LL = {"VISUAL_STATE_CALLBACK", "RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_HTTP_ERROR", "SHOULD_OVERRIDE_WITH_REDIRECTS", "SAFE_BROWSING_HIT"};

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onPageCommitVisible(WebView webView, String str) {
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final boolean onWebAuthnIntent(WebView webView, PendingIntent pendingIntent, InvocationHandler invocationHandler) {
        return false;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return LL;
    }

    public static void LIZIZ(C2266811Dnz c2266811Dnz) {
        if (WebViewFeatureInternal.isSupported("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            C2266731Dnr c2266731Dnr = WebViewFeatureInternal.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL;
            if (c2266731Dnr.LIZIZ()) {
                if (c2266811Dnz.LIZ == null) {
                    C085J c085j = C085G.LIZ;
                    c2266811Dnz.LIZ = (SafeBrowsingResponse) c085j.LIZ.convertSafeBrowsingResponse(Proxy.getInvocationHandler(c2266811Dnz.LIZIZ));
                }
                C2197831B0b.LJ(c2266811Dnz.LIZ, true);
                return;
            }
            if (c2266731Dnr.LIZJ()) {
                if (c2266811Dnz.LIZIZ == null) {
                    C085J c085j2 = C085G.LIZ;
                    c2266811Dnz.LIZIZ = (SafeBrowsingResponseBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(SafeBrowsingResponseBoundaryInterface.class, c085j2.LIZ.convertSafeBrowsingResponse(c2266811Dnz.LIZ));
                }
                c2266811Dnz.LIZIZ.showInterstitial(true);
                return;
            }
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, C2202361BHm.LIZ(webResourceRequest).toString());
    }

    public final void LIZ(WebView webView, WebResourceRequest webResourceRequest, C2266821Do0 c2266821Do0) {
        if (WebViewFeatureInternal.isSupported("WEB_RESOURCE_ERROR_GET_CODE") && WebViewFeatureInternal.isSupported("WEB_RESOURCE_ERROR_GET_DESCRIPTION") && C2202361BHm.LIZIZ(webResourceRequest)) {
            WebViewFeatureInternal.WEB_RESOURCE_ERROR_GET_CODE.getClass();
            if (c2266821Do0.LIZ == null) {
                C085J c085j = C085G.LIZ;
                c2266821Do0.LIZ = (WebResourceError) c085j.LIZ.convertWebResourceError(Proxy.getInvocationHandler(c2266821Do0.LIZIZ));
            }
            int iLJFF = C2266851Do3.LJFF(c2266821Do0.LIZ);
            WebViewFeatureInternal.WEB_RESOURCE_ERROR_GET_DESCRIPTION.getClass();
            if (c2266821Do0.LIZ == null) {
                C085J c085j2 = C085G.LIZ;
                c2266821Do0.LIZ = (WebResourceError) c085j2.LIZ.convertWebResourceError(Proxy.getInvocationHandler(c2266821Do0.LIZIZ));
            }
            onReceivedError(webView, iLJFF, C2266851Do3.LJ(c2266821Do0.LIZ).toString(), C2202361BHm.LIZ(webResourceRequest).toString());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        LIZ(webView, webResourceRequest, new C2266821Do0(webResourceError));
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, InvocationHandler invocationHandler) {
        LIZ(webView, webResourceRequest, new C2266821Do0(invocationHandler));
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        LIZIZ(new C2266811Dnz(safeBrowsingResponse));
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, InvocationHandler invocationHandler) {
        LIZIZ(new C2266811Dnz(invocationHandler));
    }
}
