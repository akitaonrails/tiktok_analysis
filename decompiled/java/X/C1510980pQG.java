package X;

import com.ss.android.ugc.aweme.ml.api.IPitayaFeatureCenterService;
import com.ss.android.ugc.aweme.ml.feature.pitaya.PitayaFeatureCenterServiceImpl;

/* JADX INFO: renamed from: X.0pQG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1510980pQG {
    public static final IPitayaFeatureCenterService LIZ;

    static {
        IPitayaFeatureCenterService iPitayaFeatureCenterService;
        Object objLIZ = C04TD.LIZ(IPitayaFeatureCenterService.class, false);
        if (objLIZ != null) {
            iPitayaFeatureCenterService = (IPitayaFeatureCenterService) objLIZ;
        } else {
            if (C04TD.y2 == null) {
                synchronized (IPitayaFeatureCenterService.class) {
                    if (C04TD.y2 == null) {
                        C04TD.y2 = new PitayaFeatureCenterServiceImpl();
                    }
                }
            }
            iPitayaFeatureCenterService = C04TD.y2;
        }
        LIZ = iPitayaFeatureCenterService;
    }
}
