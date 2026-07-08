package X;

import com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService;
import com.ss.android.ugc.aweme.ml.impl.SmartFeedPreloadServiceImpl;

/* JADX INFO: renamed from: X.0pHT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1505530pHT {
    public static final ISmartFeedPreloadService LIZ;

    static {
        ISmartFeedPreloadService iSmartFeedPreloadService;
        Object objLIZ = C04TD.LIZ(ISmartFeedPreloadService.class, false);
        if (objLIZ != null) {
            iSmartFeedPreloadService = (ISmartFeedPreloadService) objLIZ;
        } else {
            if (C04TD.C2 == null) {
                synchronized (ISmartFeedPreloadService.class) {
                    if (C04TD.C2 == null) {
                        C04TD.C2 = new SmartFeedPreloadServiceImpl();
                    }
                }
            }
            iSmartFeedPreloadService = C04TD.C2;
        }
        LIZ = iSmartFeedPreloadService;
    }
}
