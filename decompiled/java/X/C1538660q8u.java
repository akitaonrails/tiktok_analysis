package X;

import android.view.View;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import com.bytedance.android.monitorV2.webview.WebViewMonitorHelper;
import com.lynx.tasm.LynxView;

/* JADX INFO: renamed from: X.0q8u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1538660q8u {
    public static void LIZ(View view, C1520350pfN c1520350pfN) {
        if (view instanceof WebView) {
            WebViewMonitorHelper.getInstance().customReport((WebView) view, c1520350pfN);
        } else if (view instanceof LynxView) {
            LynxViewMonitor.Companion.getClass();
            LynxViewMonitor.INSTANCE.reportCustom((LynxView) view, c1520350pfN);
        } else {
            C1520380pfQ.LIZ.getClass();
            C1520380pfQ.LIZ(c1520350pfN);
        }
    }
}
