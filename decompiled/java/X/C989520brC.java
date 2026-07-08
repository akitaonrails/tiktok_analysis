package X;

import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0brC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C989520brC extends C09AY implements Function0<String> {
    public C989520brC() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
        if (iAdLandPagePreloadService != null) {
            return iAdLandPagePreloadService.K0("dynamic_ad_feed");
        }
        return null;
    }
}
