package X;

import android.os.SystemClock;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.AwS4S1000100_1;

/* JADX INFO: renamed from: X.05gi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1417405gi {
    public static final C1417405gi LIZ = new C1417405gi();
    public static final boolean LIZIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "ecom_osp_payment_sdk_init_opt", true, false);
    public static boolean LIZJ;

    public static void LIZ() {
        IECommerceHostService iECommerceHostService;
        if (LIZJ) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        WebView webView = new WebView(((IApplicationDependencyService) iECommerceHostService).getApplication());
        webView.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
        webView.destroy();
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        LIZ.getClass();
        C1018703yb.LIZLLL("rd_tiktokec_warm_webview", new AwS4S1000100_1("cart", jCurrentTimeMillis2, 2));
        LIZJ = true;
    }
}
