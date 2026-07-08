package X;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* JADX INFO: renamed from: X.0da7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1055810da7 implements InterfaceC1055820da8 {
    public static final C1055810da7 LIZ = new C1055810da7();
    public static InterfaceC1055820da8 LIZIZ;
    public static boolean LIZJ;

    @Override // X.InterfaceC1055820da8
    public final void LIZ(WebView webView, String str, ValueCallback<String> valueCallback, EnumC1055790da5 enumC1055790da5, AbstractC1544900qIy abstractC1544900qIy) {
        abstractC1544900qIy.LJI();
        if (LIZJ) {
            InterfaceC1055820da8 interfaceC1055820da8 = LIZIZ;
            if (interfaceC1055820da8 != null) {
                interfaceC1055820da8.LIZ(webView, str, valueCallback, enumC1055790da5, abstractC1544900qIy);
                return;
            }
            int i = C1055800da6.LIZ[enumC1055790da5.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    C786410Ut5.ue(webView, str);
                    return;
                }
                throw new C1954807lC();
            }
            webView.evaluateJavascript(str, valueCallback);
            return;
        }
        int i2 = C1055800da6.LIZ[enumC1055790da5.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                C786410Ut5.ue(webView, str);
                return;
            }
            throw new C1954807lC();
        }
        webView.evaluateJavascript(str, valueCallback);
    }
}
