package X;

import com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService;
import com.ss.android.ugc.aweme.ml.impl.SmartFeedAdUIServiceImpl;

/* JADX INFO: renamed from: X.0pQW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1511140pQW {
    public static final ISmartFeedAdUIService LIZ;

    static {
        ISmartFeedAdUIService iSmartFeedAdUIService;
        Object objLIZ = C04TD.LIZ(ISmartFeedAdUIService.class, false);
        if (objLIZ != null) {
            iSmartFeedAdUIService = (ISmartFeedAdUIService) objLIZ;
        } else {
            if (C04TD.A2 == null) {
                synchronized (ISmartFeedAdUIService.class) {
                    if (C04TD.A2 == null) {
                        C04TD.A2 = new SmartFeedAdUIServiceImpl();
                    }
                }
            }
            iSmartFeedAdUIService = C04TD.A2;
        }
        LIZ = iSmartFeedAdUIService;
    }
}
