package X;

import android.content.Context;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14B3, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14B3 {
    public static final /* synthetic */ int LJ = 0;
    public InterfaceC20220614Aa LIZ;
    public Context LIZIZ;
    public C14C8 LIZJ;
    public WebKitView LIZLLL;

    static {
        new WeakReference(null);
    }

    public final void LIZ() {
        try {
            WebKitView webKitView = this.LIZLLL;
            if (webKitView == null) {
                return;
            }
            WebSettings settings = webKitView.getSettings();
            settings.setLoadWithOverviewMode(true);
            settings.setDomStorageEnabled(true);
            settings.setAppCacheEnabled(false);
            settings.setUseWideViewPort(true);
            settings.setSupportZoom(false);
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setLoadsImagesAutomatically(true);
            settings.setDefaultTextEncodingName("utf-8");
            settings.setCacheMode(2);
            settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
            settings.setTextZoom(100);
            AnonymousClass1490 anonymousClass1490 = C1498550p6D.LIZ.LIZ;
            if (anonymousClass1490 != null && anonymousClass1490.LIZ.equals("boe")) {
                settings.setMixedContentMode(0);
            }
            try {
                webKitView.setOverScrollMode(2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                th.getMessage();
            }
            webKitView.setScrollContainer(false);
            webKitView.setHorizontalScrollBarEnabled(false);
            webKitView.setVerticalScrollBarEnabled(false);
            if (C20221514Aj.LIZ()) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
            webKitView.setWebChromeClient(new WebChromeClient() { // from class: X.14BA
                @Override // android.webkit.WebChromeClient
                public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                    if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("JS Error: ");
                        sbLIZ.append((Object) consoleMessage.message());
                        sbLIZ.append(" -- From line ");
                        sbLIZ.append(consoleMessage.lineNumber());
                        sbLIZ.append(" of ");
                        sbLIZ.append((Object) consoleMessage.sourceId());
                        C202179148z.LJ(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    if (C20221514Aj.LIZ()) {
                        Intrinsics.LJIIJJI(consoleMessage.message(), "onConsoleMessage: ");
                        return super.onConsoleMessage(consoleMessage);
                    }
                    return true;
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20221514Aj.LIZIZ();
        }
    }

    public C14B3(String str) {
    }
}
