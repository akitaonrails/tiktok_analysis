package X;

import com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService;
import com.ss.android.ugc.aweme.ml.infra.SmartMLSceneServiceImpl;

/* JADX INFO: renamed from: X.0pQm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1511300pQm {
    public static final ISmartMLSceneService LIZ;

    static {
        ISmartMLSceneService iSmartMLSceneService;
        Object objLIZ = C04TD.LIZ(ISmartMLSceneService.class, false);
        if (objLIZ != null) {
            iSmartMLSceneService = (ISmartMLSceneService) objLIZ;
        } else {
            if (C04TD.J2 == null) {
                synchronized (ISmartMLSceneService.class) {
                    if (C04TD.J2 == null) {
                        C04TD.J2 = new SmartMLSceneServiceImpl();
                    }
                }
            }
            iSmartMLSceneService = C04TD.J2;
        }
        LIZ = iSmartMLSceneService;
    }
}
