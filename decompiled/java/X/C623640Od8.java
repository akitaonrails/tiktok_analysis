package X;

import android.webkit.WebView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Od8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C623640Od8 {
    public static final void LIZ(WebView webView, int i, Object obj) {
        try {
            webView.setTag(i, obj);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
