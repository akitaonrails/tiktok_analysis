package X;

import com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService;
import com.ss.android.ugc.aweme.ml.feature.SmartDataTrackerServiceImpl;

/* JADX INFO: renamed from: X.0pSA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1512160pSA {
    public static final ISmartDataTrackerService LIZ;

    static {
        ISmartDataTrackerService iSmartDataTrackerService;
        Object objLIZ = C04TD.LIZ(ISmartDataTrackerService.class, false);
        if (objLIZ != null) {
            iSmartDataTrackerService = (ISmartDataTrackerService) objLIZ;
        } else {
            if (C04TD.x2 == null) {
                synchronized (ISmartDataTrackerService.class) {
                    if (C04TD.x2 == null) {
                        C04TD.x2 = new SmartDataTrackerServiceImpl();
                    }
                }
            }
            iSmartDataTrackerService = C04TD.x2;
        }
        LIZ = iSmartDataTrackerService;
    }
}
