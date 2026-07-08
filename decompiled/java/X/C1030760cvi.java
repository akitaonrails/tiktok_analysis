package X;

import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0cvi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1030760cvi {
    public static void LIZ(int i, String str) {
        ISplashAdService iSplashAdService;
        if (!C288590BSv.LIZ() || (iSplashAdService = (ISplashAdService) ServiceManager.get().getService(ISplashAdService.class)) == null) {
            return;
        }
        iSplashAdService.LJIIJJI(i, str, null, C1030680cva.LJ);
    }

    public static void LIZIZ(int i, String str, String str2) {
        ISplashAdService iSplashAdService;
        if (!C288590BSv.LIZ() || (iSplashAdService = (ISplashAdService) ServiceManager.get().getService(ISplashAdService.class)) == null) {
            return;
        }
        iSplashAdService.LJIIJJI(i, str, str2, C1030680cva.LJ);
    }
}
