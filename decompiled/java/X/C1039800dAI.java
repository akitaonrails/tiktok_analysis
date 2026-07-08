package X;

import android.webkit.WebSettings;
import android.webkit.WebView;

/* JADX INFO: renamed from: X.0dAI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1039800dAI {
    public final WebView LIZ;
    public final InterfaceC1054380dXo LIZIZ;
    public final C1051120dSY LIZJ;
    public final C1040060dAi LIZLLL;

    public C1039800dAI(WebView webView, InterfaceC1054380dXo interfaceC1054380dXo) {
        String userAgentString;
        C1051120dSY c1051120dSY = new C1051120dSY();
        this.LIZ = webView;
        this.LIZIZ = interfaceC1054380dXo;
        this.LIZJ = c1051120dSY;
        this.LIZLLL = new C1040060dAi(interfaceC1054380dXo);
        c1051120dSY.LIZ = webView;
        if (webView != null) {
            WebSettings settings = webView.getSettings();
            if (settings != null) {
                settings.setDomStorageEnabled(true);
            }
            C786410Ut5.te(webView, c1051120dSY);
            WebSettings settings2 = webView.getSettings();
            if (settings2 != null) {
                userAgentString = settings2.getUserAgentString();
            } else {
                userAgentString = null;
            }
            c1051120dSY.LIZIZ = userAgentString;
        }
    }
}
