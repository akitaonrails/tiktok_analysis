package X;

import com.ss.android.ugc.aweme.ml.api.IMLDataCenterService;
import com.ss.android.ugc.aweme.ml.feature.MLDataCenterServiceImpl;

/* JADX INFO: renamed from: X.05Px, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1349505Px {
    public static final IMLDataCenterService LIZ;

    static {
        IMLDataCenterService iMLDataCenterService;
        Object objLIZ = C04TD.LIZ(IMLDataCenterService.class, false);
        if (objLIZ != null) {
            iMLDataCenterService = (IMLDataCenterService) objLIZ;
        } else {
            if (C04TD.v2 == null) {
                synchronized (IMLDataCenterService.class) {
                    if (C04TD.v2 == null) {
                        C04TD.v2 = new MLDataCenterServiceImpl();
                    }
                }
            }
            iMLDataCenterService = C04TD.v2;
        }
        LIZ = iMLDataCenterService;
    }
}
