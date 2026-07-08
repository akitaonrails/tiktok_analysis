package X;

import android.view.View;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import com.bytedance.android.monitorV2.webview.WebViewMonitorHelper;
import com.lynx.tasm.LynxView;

/* JADX INFO: renamed from: X.0dnm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1064280dnm {
    public static final void LIZ(EnumC1063300dmC enumC1063300dmC, View view, String str, String str2, int i, int i2, String str3, int i3, String str4, int i4) {
        WebView webView;
        LynxView lynxView;
        int i5 = C1063320dmE.LIZ[enumC1063300dmC.ordinal()];
        if (i5 != 1) {
            if (i5 == 2 && (view instanceof LynxView) && (lynxView = (LynxView) view) != null) {
                C1064310dnp c1064310dnp = new C1064310dnp();
                c1064310dnp.LJI = str;
                c1064310dnp.LJII = str2;
                c1064310dnp.LJIIIIZZ = i;
                c1064310dnp.LJIIIZ = i2;
                c1064310dnp.LJIIJ = str3;
                c1064310dnp.LJIILIIL = i3;
                c1064310dnp.LJIIL = str4;
                c1064310dnp.LJIIJJI = i4;
                LynxViewMonitor.Companion.getClass();
                LynxViewMonitor.INSTANCE.reportJsbFetchError(lynxView, c1064310dnp);
                return;
            }
            return;
        }
        if (!(view instanceof WebView) || (webView = (WebView) view) == null) {
            return;
        }
        C1064300dno c1064300dno = new C1064300dno();
        c1064300dno.LIZ = str;
        c1064300dno.LIZIZ = str2;
        c1064300dno.LIZJ = i;
        c1064300dno.LIZLLL = i2;
        c1064300dno.LJ = str3;
        c1064300dno.LJI = i3;
        c1064300dno.LJFF = str4;
        c1064300dno.LJII = i4;
        WebViewMonitorHelper.getInstance().handleFetchError(webView, c1064300dno);
    }
}
