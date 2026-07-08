package X;

import com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService;
import com.ss.android.ugc.aweme.ml.impl.SmartFeedLoadMoreServiceImpl;

/* JADX INFO: renamed from: X.0pQH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1510990pQH {
    public static final ISmartFeedLoadMoreService LIZ;

    static {
        ISmartFeedLoadMoreService iSmartFeedLoadMoreService;
        Object objLIZ = C04TD.LIZ(ISmartFeedLoadMoreService.class, false);
        if (objLIZ != null) {
            iSmartFeedLoadMoreService = (ISmartFeedLoadMoreService) objLIZ;
        } else {
            if (C04TD.B2 == null) {
                synchronized (ISmartFeedLoadMoreService.class) {
                    if (C04TD.B2 == null) {
                        C04TD.B2 = new SmartFeedLoadMoreServiceImpl();
                    }
                }
            }
            iSmartFeedLoadMoreService = C04TD.B2;
        }
        LIZ = iSmartFeedLoadMoreService;
    }
}
