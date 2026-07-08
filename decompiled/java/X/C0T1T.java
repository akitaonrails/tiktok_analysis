package X;

import com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service;
import com.ss.android.ugc.aweme.ml.impl.SmartPreloadCommentV2ServiceImpl;

/* JADX INFO: renamed from: X.0T1T, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T1T {
    public static final ISmartPreloadCommentV2Service LIZ;

    static {
        ISmartPreloadCommentV2Service iSmartPreloadCommentV2Service;
        Object objLIZ = C04TD.LIZ(ISmartPreloadCommentV2Service.class, false);
        if (objLIZ != null) {
            iSmartPreloadCommentV2Service = (ISmartPreloadCommentV2Service) objLIZ;
        } else {
            if (C04TD.D2 == null) {
                synchronized (ISmartPreloadCommentV2Service.class) {
                    if (C04TD.D2 == null) {
                        C04TD.D2 = new SmartPreloadCommentV2ServiceImpl();
                    }
                }
            }
            iSmartPreloadCommentV2Service = C04TD.D2;
        }
        LIZ = iSmartPreloadCommentV2Service;
    }
}
