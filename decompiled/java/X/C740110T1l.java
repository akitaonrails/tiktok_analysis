package X;

import com.ss.android.ugc.aweme.ml.api.ISmartPreloadProfileV2Service;
import com.ss.android.ugc.aweme.ml.impl.SmartPreloadProfileV2ServiceImpl;

/* JADX INFO: renamed from: X.0T1l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C740110T1l {
    public static final ISmartPreloadProfileV2Service LIZ;

    static {
        ISmartPreloadProfileV2Service iSmartPreloadProfileV2Service;
        Object objLIZ = C04TD.LIZ(ISmartPreloadProfileV2Service.class, false);
        if (objLIZ != null) {
            iSmartPreloadProfileV2Service = (ISmartPreloadProfileV2Service) objLIZ;
        } else {
            if (C04TD.E2 == null) {
                synchronized (ISmartPreloadProfileV2Service.class) {
                    if (C04TD.E2 == null) {
                        C04TD.E2 = new SmartPreloadProfileV2ServiceImpl();
                    }
                }
            }
            iSmartPreloadProfileV2Service = C04TD.E2;
        }
        LIZ = iSmartPreloadProfileV2Service;
    }
}
