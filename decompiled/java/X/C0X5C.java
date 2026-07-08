package X;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.compliance.sandbox.webview.TTHYBRIDXHR;
import com.ss.android.ugc.aweme.compliance.sandbox.webview.WebViewInterceptReport;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0X5C, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X5C {
    public static String LIZ(WebView webView) {
        if (webView == null) {
            return null;
        }
        return (String) ((LinkedHashMap) TTHYBRIDXHR.LJI).get(Integer.valueOf(webView.hashCode()));
    }

    public static C0X5B LIZIZ(WebView webView) {
        TTHYBRIDXHR tthybridxhrLIZJ = LIZJ(webView);
        if (tthybridxhrLIZJ != null) {
            return tthybridxhrLIZJ.LJ;
        }
        return null;
    }

    public static TTHYBRIDXHR LIZJ(WebView webView) {
        try {
            Object tag = webView.getTag(R.id.web_hook_ajax);
            if (tag == null || !(tag instanceof TTHYBRIDXHR)) {
                return null;
            }
            return (TTHYBRIDXHR) tag;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
            return null;
        }
    }

    public static boolean LJ(WebView webView) {
        TTHYBRIDXHR tthybridxhrLIZJ = LIZJ(webView);
        if (tthybridxhrLIZJ != null) {
            return tthybridxhrLIZJ.LIZJ;
        }
        return false;
    }

    public static void LIZLLL(WebView webView, String str) {
        if (LIZJ(webView) == null) {
            TTHYBRIDXHR tthybridxhr = new TTHYBRIDXHR(webView);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.addJavascriptInterface(tthybridxhr, "__TTHYBRIDXHR");
            webView.addJavascriptInterface(new WebViewInterceptReport(webView), "WIReport");
            C623640Od8.LIZ(webView, R.id.web_hook_ajax, tthybridxhr);
        }
        C0X6I.LIZ.getClass();
        if (C0X6I.LIZJ(str)) {
            LJFF(webView, str, "load_url");
            if (LIZIZ(webView) == C0X5B.PLANB) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    C1276320jJm c1276320jJmTtUrlDispatch = TTNetInit.ttUrlDispatch(str);
                    TextUtils.isEmpty(c1276320jJmTtUrlDispatch.LIZIZ);
                    str = c1276320jJmTtUrlDispatch.LIZIZ;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("dispatch url cost: ");
                sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            TTHYBRIDXHR.LJI.put(Integer.valueOf(webView.hashCode()), str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(android.webkit.WebView r9, java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0X5C.LJFF(android.webkit.WebView, java.lang.String, java.lang.String):void");
    }
}
