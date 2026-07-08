package X;

import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0pjN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1522830pjN extends AbstractC2205961BVi {
    public long LL;
    public boolean LLILLJJLI;
    public final /* synthetic */ C1524040plK LLILLL;
    public final /* synthetic */ C1524010plH LLILZ;

    @Override // X.AbstractC1541670qDl
    public final AbstractC1541650qDj<?> getExtension() {
        return this.LLILLL;
    }

    public C1522830pjN(C1524040plK c1524040plK, C1524010plH c1524010plH) {
        this.LLILLL = c1524040plK;
        this.LLILZ = c1524010plH;
    }

    @Override // X.AbstractC2205961BVi
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.LLILLJJLI = false;
    }

    @Override // X.AbstractC2205961BVi
    public final WebResourceResponse shouldInterceptRequest(final WebView webView, final WebResourceRequest webResourceRequest) {
        final long jMax = -1;
        if (this.LL != 0) {
            jMax = Math.max(System.currentTimeMillis() - this.LL, -1L);
        }
        final WebResourceResponse webResourceResponseShouldInterceptRequest = super.shouldInterceptRequest(webView, webResourceRequest);
        final C1524010plH c1524010plH = this.LLILZ;
        try {
            ExecutorService executorService = C2281108wj.LIZ;
            C2281108wj.LIZIZ(EnumC2281308wl.Sequence, true, new Runnable() { // from class: X.0pjF
                /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x0150  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x0155 A[PHI: r11
                  0x0155: PHI (r11v1 java.lang.String) = (r11v0 java.lang.String), (r11v4 java.lang.String) binds: [B:54:0x0151, B:33:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ() throws org.json.JSONException {
                    /*
                        Method dump skipped, instruction units count: 348
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1522750pjF.LIZ():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("WebRequestReportExtension$WebViewRequestClientExtension@75a.mWebViewRequestClientListenerStub$1$shouldInterceptRequest$1$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("WebRequestReportExtension$WebViewRequestClientExtension@75a.mWebViewRequestClientListenerStub$1$shouldInterceptRequest$1$1");
                }
            });
            C189200o6.m2constructorimpl(Unit.LIZ);
            return webResourceResponseShouldInterceptRequest;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return webResourceResponseShouldInterceptRequest;
        }
    }

    @Override // X.AbstractC2205961BVi
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.LLILLJJLI = true;
        this.LL = System.currentTimeMillis();
    }
}
