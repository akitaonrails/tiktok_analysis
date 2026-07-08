package X;

import com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.13nF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20115513nF extends IXResourceLoader {
    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final void cancelLoad() {
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final C1868620yj6 loadSync(C1868620yj6 c1868620yj6, C20116013nK c20116013nK) {
        String strK0;
        C20116013nK c20116013nK2 = new C20116013nK(0);
        c20116013nK2.LIZ(c20116013nK);
        IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
        if (iAdLandPagePreloadService == null || (strK0 = iAdLandPagePreloadService.K0("lynx_feed")) == null) {
            strK0 = "";
        }
        c20116013nK2.LIZ = strK0;
        C20116213nM c20116213nM = new C20116213nM();
        c20116213nM.setService(getService());
        return c20116213nM.loadSync(c1868620yj6, c20116013nK2);
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final void loadAsync(C1868620yj6 c1868620yj6, C20116013nK c20116013nK, Function1<? super C1868620yj6, Unit> function1, Function1<? super Throwable, Unit> function12) {
        String strK0;
        C20116013nK c20116013nK2 = new C20116013nK(0);
        c20116013nK2.LIZ(c20116013nK);
        IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
        if (iAdLandPagePreloadService == null || (strK0 = iAdLandPagePreloadService.K0("lynx_feed")) == null) {
            strK0 = "";
        }
        c20116013nK2.LIZ = strK0;
        C20116213nM c20116213nM = new C20116213nM();
        c20116213nM.setService(getService());
        c20116213nM.loadAsync(c1868620yj6, c20116013nK2, function1, function12);
    }
}
