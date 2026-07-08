package X;

import android.webkit.WebView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.14W7, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14W7 {
    static {
        new C14W9() { // from class: X.14W8
        };
    }

    public static void LIZ(WebView webView, String str) {
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
