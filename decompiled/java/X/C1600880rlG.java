package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IResumeBannerService;

/* JADX INFO: renamed from: X.0rlG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1600880rlG {
    public static final /* synthetic */ C1600880rlG LIZ = new C1600880rlG();

    public static IResumeBannerService LIZ() {
        IResumeBannerService iResumeBannerService = (IResumeBannerService) PluggableExtentionKt.pluggableSpi$default(IResumeBannerService.class, false, false, false, 14, null);
        if (iResumeBannerService == null) {
            return new IResumeBannerService.DowngradeInstance();
        }
        iResumeBannerService.isEnable();
        return new IResumeBannerService.DowngradeInstance();
    }
}
