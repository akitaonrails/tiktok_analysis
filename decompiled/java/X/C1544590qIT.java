package X;

import android.graphics.Bitmap;
import android.os.Build;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.security.impl.service.FE.FESparkInjectExt;
import com.bytedance.hybrid.spark.security.impl.service.SparkSecurityWebViewExt;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0qIT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1544590qIT extends AbstractC1541650qDj<C2205951BVh> {
    public final C1544850qIt LLIZ;
    public final SparkSecurityWebViewExt LLIZLLLIL = new SparkSecurityWebViewExt();
    public final C1544570qIR LLJ = new AbstractC2205961BVi() { // from class: X.0qIR
        public final C01GW LL = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(252));

        @Override // X.AbstractC1541670qDl
        public final AbstractC1541650qDj<?> getExtension() {
            return this.LLILLJJLI;
        }

        @Override // X.AbstractC2205961BVi
        public final void onPageFinished(WebView webView, String str) throws JSONException {
            if (((Boolean) this.LL.getValue()).booleanValue() && webView != null) {
                C1543890qHL c1543890qHL = C1543890qHL.LIZ;
                if (((Boolean) C1543890qHL.LIZJ.getValue()).booleanValue()) {
                    C1544770qIl.LIZ(webView, new C1544550qIP());
                }
            }
            super.onPageFinished(webView, str);
            this.LLILLJJLI.LLIZ.onPageFinished(webView, str);
        }

        @Override // X.AbstractC2205961BVi
        public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            int statusCode;
            WebResourceResponse webResourceResponseShouldInterceptRequest = this.LLILLJJLI.LLIZLLLIL.shouldInterceptRequest(webView, webResourceRequest);
            if (webResourceResponseShouldInterceptRequest != null) {
                return webResourceResponseShouldInterceptRequest;
            }
            if (webResourceRequest != null) {
                webResourceRequest.isForMainFrame();
            }
            WebResourceResponse webResourceResponseLIZIZ = this.LLILLJJLI.LLIZ.LIZIZ(webView, webResourceRequest);
            if (webResourceRequest != null) {
                webResourceRequest.isForMainFrame();
            }
            if (webResourceResponseLIZIZ != null) {
                return webResourceResponseLIZIZ;
            }
            WebResourceResponse webResourceResponseShouldInterceptRequest2 = super.shouldInterceptRequest(webView, webResourceRequest);
            if (webResourceRequest != null) {
                webResourceRequest.isForMainFrame();
            }
            if (webResourceResponseShouldInterceptRequest2 != null && (!Intrinsics.LJFF(webResourceResponseShouldInterceptRequest2.getMimeType(), "text/html") || ((300 <= (statusCode = webResourceResponseShouldInterceptRequest2.getStatusCode()) && statusCode < 400) || Intrinsics.LJFF(webResourceResponseShouldInterceptRequest2.getReasonPhrase(), "redirect")))) {
                return webResourceResponseShouldInterceptRequest2;
            }
            WebResourceResponse webResourceResponseLIZLLL = this.LLILLJJLI.LLIZ.LIZLLL(webView, webResourceRequest, webResourceResponseShouldInterceptRequest2);
            if (webResourceRequest != null) {
                webResourceRequest.isForMainFrame();
            }
            return webResourceResponseLIZLLL;
        }

        @Override // X.AbstractC2205961BVi
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            boolean zShouldOverrideUrlLoading;
            boolean z = false;
            if (Build.VERSION.SDK_INT >= 24) {
                zShouldOverrideUrlLoading = this.LLILLJJLI.LLIZLLLIL.shouldOverrideUrlLoading(webView, webResourceRequest);
            } else {
                zShouldOverrideUrlLoading = false;
            }
            if (webView != null && webResourceRequest != null && webResourceRequest.getUrl() != null) {
                this.LLILLJJLI.LLIZ.LJII(webView, webResourceRequest.getUrl().toString());
            }
            if (zShouldOverrideUrlLoading || super.shouldOverrideUrlLoading(webView, webResourceRequest)) {
                z = true;
            }
            if (webView != null && webResourceRequest != null && webResourceRequest.getUrl() != null) {
                C1544850qIt c1544850qIt = this.LLILLJJLI.LLIZ;
                webResourceRequest.getUrl().toString();
                c1544850qIt.getClass();
            }
            return z;
        }

        @Override // X.AbstractC2205961BVi
        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // X.AbstractC2205961BVi
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            boolean z;
            boolean zShouldOverrideUrlLoading = this.LLILLJJLI.LLIZLLLIL.shouldOverrideUrlLoading(webView, str);
            if (webView != null && str != null) {
                this.LLILLJJLI.LLIZ.LJII(webView, str);
            }
            if (!zShouldOverrideUrlLoading && !super.shouldOverrideUrlLoading(webView, str)) {
                z = false;
            } else {
                z = true;
            }
            if (webView != null && str != null) {
                this.LLILLJJLI.LLIZ.getClass();
            }
            return z;
        }

        @Override // X.AbstractC2205961BVi
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) throws JSONException {
            super.onPageStarted(webView, str, bitmap);
            this.LLILLJJLI.LLIZ.LIZ(webView, str);
            new FESparkInjectExt().onPageStarted(webView, str, bitmap);
        }
    };

    @Override // X.AbstractC1541650qDj
    public final void LIZJ() {
        LJ("onPageStarted", this.LLJ, 2000);
        LJ("shouldInterceptRequest", this.LLJ, 2000);
        LJ("shouldOverrideUrlLoading", this.LLJ, 2000);
        LJ("onPageFinished", this.LLJ, 2000);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0qIR] */
    public C1544590qIT(C1544850qIt c1544850qIt) {
        this.LLIZ = c1544850qIt;
    }
}
