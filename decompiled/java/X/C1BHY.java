package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.u;

/* JADX INFO: renamed from: X.1BHY, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public abstract class C1BHY extends WebViewClient {
    public SparkThirdContext LIZ;
    public C1B2O LIZIZ;

    @InterfaceC1294060jmO
    public final boolean LIZ(WebView webView, String str) {
        C2202271BHd c2202271BHd;
        SparkThirdContext sparkThirdContext = this.LIZ;
        if (sparkThirdContext != null && (c2202271BHd = sparkThirdContext.webViewClient) != null && c2202271BHd.LJFF(webView, str)) {
            return true;
        }
        if (webView == null) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        if (str == null) {
            return super.shouldOverrideUrlLoading(webView, (String) null);
        }
        return LIZIZ(UriProtector.parse(str), webView);
    }

    public final boolean LIZIZ(Uri uri, WebView webView) {
        String string;
        boolean z;
        InterfaceC2202321BHi interfaceC2202321BHi;
        InterfaceC1052610dUx interfaceC1052610dUx;
        try {
            string = uri.toString();
            C1BHO c1bho = C1554300qY8.LIZ;
            if (c1bho == null || !c1bho.LJII(string)) {
                z = false;
            } else {
                z = true;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return false;
        }
        if (z) {
            SparkThirdContext sparkThirdContext = this.LIZ;
            if (sparkThirdContext == null || (interfaceC1052610dUx = sparkThirdContext.redirect) == null) {
                return false;
            }
            interfaceC1052610dUx.LIZ(webView.getContext(), string);
            return true;
        }
        if (u.LJJIIJZLJL(string, "http", true)) {
            C1B2O c1b2o = this.LIZIZ;
            if (c1b2o != null) {
                c1b2o.LIZ(string);
            }
            return false;
        }
        SparkThirdContext sparkThirdContext2 = this.LIZ;
        if (sparkThirdContext2 != null && (interfaceC2202321BHi = sparkThirdContext2.antiJump) != null && !interfaceC2202321BHi.LIZ(webView.getContext(), string)) {
            return true;
        }
        if (!u.LJJIIJZLJL(string, "market://", false) && !u.LJJIIJZLJL(string, "intent://", false)) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(UriProtector.parse(string));
                intent.setFlags(268435456);
                intent.addCategory("android.intent.category.BROWSABLE");
                intent.putExtra("pns.sandbox.dataflow_id", 1207969291);
                Context context = webView.getContext();
                if (context != null) {
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                    C1701330uNH.LIZ(intent, context);
                    C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyMf71DPq0mQCv9PFyHMkyqC1a3lHjjAphFW+srA+EfRw21HT0wyPrcqQ553WfgDGyWE2FM", null));
                    return true;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            return true;
        }
        try {
            Intent uri2 = Intent.parseUri(string, 1);
            uri2.addFlags(268435456);
            if (C0W14.LIZ(webView.getContext(), uri2)) {
                uri2.putExtra("pns.sandbox.dataflow_id", 1207969291);
                Context context2 = webView.getContext();
                if (context2 != null) {
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context2, uri2, "Context_startActivity_1");
                    C1701330uNH.LIZ(uri2, context2);
                    C2204961BRm.LJJJJJL(context2, uri2, new C0WZX("dzBzEgAjS8/YVFkiQFyMf71DPq0mQCv9PFyHMkyqC1a3lHjjAphFW+srA+EfRw21HT0wyPrcqQ553WfgDGyWE2FM", null));
                    return true;
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        return true;
        TryCatchGuardChecker.doCheck(th);
        C189200o6.m2constructorimpl(new C098200Yq(th));
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        C2202271BHd c2202271BHd;
        SparkThirdContext sparkThirdContext = this.LIZ;
        if (sparkThirdContext != null && (c2202271BHd = sparkThirdContext.webViewClient) != null) {
            c2202271BHd.LIZLLL(webView, webResourceRequest);
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        C2202271BHd c2202271BHd;
        SparkThirdContext sparkThirdContext = this.LIZ;
        if (sparkThirdContext != null && (c2202271BHd = sparkThirdContext.webViewClient) != null && c2202271BHd.LJ(webView, webResourceRequest)) {
            return true;
        }
        if (webView == null) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
            return LIZIZ(webResourceRequest.getUrl(), webView);
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        C2202271BHd c2202271BHd;
        SparkThirdContext sparkThirdContext = this.LIZ;
        if (sparkThirdContext != null && (c2202271BHd = sparkThirdContext.webViewClient) != null) {
            c2202271BHd.LIZJ(str);
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (C794280VDu.LIZ(webView, "seclink")) {
            return LIZ(webView, str);
        }
        C1064860doi.LIZ.getClass();
        if (C1064860doi.LIZLLL(webView, str)) {
            return true;
        }
        return LIZ(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        C2202271BHd c2202271BHd;
        SparkThirdContext sparkThirdContext = this.LIZ;
        if (sparkThirdContext != null && (c2202271BHd = sparkThirdContext.webViewClient) != null) {
            c2202271BHd.LIZ(webView, str);
        }
        super.doUpdateVisitedHistory(webView, str, z);
    }
}
