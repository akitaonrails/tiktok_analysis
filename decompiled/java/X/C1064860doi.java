package X;

import android.webkit.WebView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.seclink.ISecLinkService;

/* JADX INFO: renamed from: X.0doi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1064860doi implements InterfaceC822590WOr {
    public static final C1064860doi LIZ = new C1064860doi();

    public static boolean LIZIZ(WebView webView) {
        return ((ISecLinkService) ServiceManager.get().getService(ISecLinkService.class)).LIZJ(webView);
    }

    public static boolean LIZJ(WebView webView) {
        return ((ISecLinkService) ServiceManager.get().getService(ISecLinkService.class)).goBack(webView);
    }

    public static boolean LIZLLL(WebView webView, String str) {
        Boolean boolLIZLLL = ((ISecLinkService) ServiceManager.get().getService(ISecLinkService.class)).LIZLLL(webView, str);
        if (boolLIZLLL != null) {
            return boolLIZLLL.booleanValue();
        }
        return false;
    }

    @Override // X.InterfaceC822590WOr
    public final String onLoadUrl(WebView webView, String str) {
        return ((ISecLinkService) ServiceManager.get().getService(ISecLinkService.class)).onLoadUrl(webView, str);
    }
}
