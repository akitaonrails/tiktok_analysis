package X;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebView;
import com.bytedance.pia.core.bridge.channel.WebViewPort;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;

/* JADX INFO: renamed from: X.1BPm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2204441BPm implements InterfaceC1530550pvp {
    public final /* synthetic */ WebViewPort LIZ;
    public final /* synthetic */ Boolean LIZIZ;

    public /* synthetic */ C2204441BPm(WebViewPort webViewPort, Boolean bool) {
        this.LIZ = webViewPort;
        this.LIZIZ = bool;
    }

    @Override // X.InterfaceC1530550pvp
    public final void accept(Object obj) {
        final WebViewPort webViewPort = this.LIZ;
        final Boolean bool = this.LIZIZ;
        final n nVar = (n) obj;
        webViewPort.getClass();
        C1287700jc8.LIZJ(new Runnable() { // from class: X.1BPQ
            @Override // java.lang.Runnable
            public final void run() {
                final WebViewPort webViewPort2 = webViewPort;
                Boolean bool2 = bool;
                n nVar2 = nVar;
                webViewPort2.getClass();
                if (!bool2.booleanValue()) {
                    try {
                        if (nVar2.LJJIJIIJIL("data")) {
                            k kVarLJJIIZ = nVar2.LJJIIZ("data");
                            kVarLJJIIZ.getClass();
                            if (kVarLJJIIZ instanceof n) {
                                nVar2.LJJIIJ("data", nVar2.LJJIIZ("data").LJIILIIL().toString());
                            }
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1BPP.LIZIZ("[Bridge] handle local message error:", th);
                    }
                }
                final String string = nVar2.toString();
                C1BPP.LJ(string);
                WebMessagePort webMessagePort = webViewPort2.LIZJ;
                if (webMessagePort != null) {
                    webMessagePort.postMessage(new WebMessage(string));
                } else {
                    C1287700jc8.LIZIZ(new Runnable() { // from class: X.13zR
                        @Override // java.lang.Runnable
                        public final void run() {
                            WebViewPort webViewPort3 = webViewPort2;
                            String str = string;
                            WebView webView = webViewPort3.LIZLLL.get();
                            if (webView != null) {
                                StringBuilder sb = new StringBuilder("(function(n){var i=window.pia_bridge,o=i&&i.onmessage;o&&\"function\"==typeof o&&o(n)})");
                                C20190913zP.LIZ(str, sb);
                                C20190913zP.LIZIZ(webView, sb.toString(), null);
                            }
                        }
                    });
                }
            }
        });
    }
}
