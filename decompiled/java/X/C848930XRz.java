package X;

import android.webkit.WebView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0XRz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C848930XRz {
    static {
        new C0XS1() { // from class: X.0XS0
        };
    }

    public static void LIZ(WebView webView, String str) {
        if (webView != null) {
            if (str != null && str.startsWith("javascript:")) {
                try {
                    webView.evaluateJavascript(str, null);
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            try {
                C786410Ut5.ue(webView, str);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
    }
}
