package X;

import com.ss.android.ugc.aweme.ml.infra.ISmartCommonPreloadService;
import com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadServiceImpl;

/* JADX INFO: renamed from: X.0pPt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1510750pPt {
    public static final ISmartCommonPreloadService LIZ;

    static {
        ISmartCommonPreloadService iSmartCommonPreloadService;
        Object objLIZ = C04TD.LIZ(ISmartCommonPreloadService.class, false);
        if (objLIZ != null) {
            iSmartCommonPreloadService = (ISmartCommonPreloadService) objLIZ;
        } else {
            if (C04TD.I2 == null) {
                synchronized (ISmartCommonPreloadService.class) {
                    if (C04TD.I2 == null) {
                        C04TD.I2 = new SmartCommonPreloadServiceImpl();
                    }
                }
            }
            iSmartCommonPreloadService = C04TD.I2;
        }
        LIZ = iSmartCommonPreloadService;
    }
}
