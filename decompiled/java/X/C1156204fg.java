package X;

import com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService;
import com.ss.android.ugc.aweme.ml.infra.SmartClassifyServiceImpl;

/* JADX INFO: renamed from: X.04fg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1156204fg {
    public static final ISmartClassifyService LIZ;

    static {
        ISmartClassifyService iSmartClassifyService;
        Object objLIZ = C04TD.LIZ(ISmartClassifyService.class, false);
        if (objLIZ != null) {
            iSmartClassifyService = (ISmartClassifyService) objLIZ;
        } else {
            if (C04TD.H2 == null) {
                synchronized (ISmartClassifyService.class) {
                    if (C04TD.H2 == null) {
                        C04TD.H2 = new SmartClassifyServiceImpl();
                    }
                }
            }
            iSmartClassifyService = C04TD.H2;
        }
        LIZ = iSmartClassifyService;
    }
}
