package X;

import com.ss.android.ugc.aweme.ml.api.IMLCommonService;
import com.ss.android.ugc.aweme.ml.common.MLCommonServiceImpl;

/* JADX INFO: renamed from: X.0NAL, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NAL {
    public static final IMLCommonService LIZ;

    static {
        IMLCommonService iMLCommonService;
        Object objLIZ = C04TD.LIZ(IMLCommonService.class, false);
        if (objLIZ != null) {
            iMLCommonService = (IMLCommonService) objLIZ;
        } else {
            if (C04TD.t2 == null) {
                synchronized (IMLCommonService.class) {
                    if (C04TD.t2 == null) {
                        C04TD.t2 = new MLCommonServiceImpl();
                    }
                }
            }
            iMLCommonService = C04TD.t2;
        }
        LIZ = iMLCommonService;
    }
}
