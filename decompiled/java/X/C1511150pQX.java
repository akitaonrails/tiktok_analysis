package X;

import com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService;
import com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictServiceImpl;

/* JADX INFO: renamed from: X.0pQX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1511150pQX {
    public static final ISmartPlaytimePredictService LIZ;

    static {
        ISmartPlaytimePredictService iSmartPlaytimePredictService;
        Object objLIZ = C04TD.LIZ(ISmartPlaytimePredictService.class, false);
        if (objLIZ != null) {
            iSmartPlaytimePredictService = (ISmartPlaytimePredictService) objLIZ;
        } else {
            if (C04TD.K2 == null) {
                synchronized (ISmartPlaytimePredictService.class) {
                    if (C04TD.K2 == null) {
                        C04TD.K2 = new SmartPlaytimePredictServiceImpl();
                    }
                }
            }
            iSmartPlaytimePredictService = C04TD.K2;
        }
        LIZ = iSmartPlaytimePredictService;
    }
}
