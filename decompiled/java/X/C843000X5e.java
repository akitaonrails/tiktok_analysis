package X;

import android.webkit.WebView;
import com.bytedance.lynx.hybrid.ttp.TTHYBRIDXHR;
import com.bytedance.lynx.hybrid.ttp.WIReport;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0X5e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C843000X5e {
    public final C843170X5v LIZ = new Object() { // from class: X.0X5v
    };
    public final C843160X5u LIZIZ = new Object() { // from class: X.0X5u
    };
    public final C843180X5w LIZJ = new Object() { // from class: X.0X5w
    };

    public final void LIZ(WebView webView, String str) {
        if (str != null) {
            getClass();
            if (C843060X5k.LIZIZ(str)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("injectJSB on loadurl, url: ");
                sbLIZ.append(str);
                C843070X5l.LIZJ(6, C2188811AlT.LIZIZ(sbLIZ), null, null);
                if (C843010X5f.LJ(webView) == null) {
                    TTHYBRIDXHR tthybridxhr = new TTHYBRIDXHR(webView);
                    webView.getSettings().setJavaScriptEnabled(true);
                    webView.addJavascriptInterface(tthybridxhr, "__TTHYBRIDXHR");
                    webView.addJavascriptInterface(new WIReport(webView), "WIReport");
                    try {
                        webView.setTag(R.id.yws, tthybridxhr);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
            if (C843060X5k.LIZIZ(str)) {
                C843010X5f.LJI(webView, str, C0X5X.SCENE_LOAD_URL);
                C843010X5f.LIZ.put(Integer.valueOf(webView.hashCode()), str);
                try {
                    webView.setTag(R.id.ywt, C0X5I.ON_LOAD_URL);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
                C843070X5l.LIZJ(6, "webView load state, on load url", null, null);
            }
            getClass();
            getClass();
        }
    }
}
