package X;

import com.ss.android.ugc.aweme.api.ICommonLogger;
import com.ss.android.ugc.aweme.common.CommonLoggerService;

/* JADX INFO: renamed from: X.04Vx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1110304Vx {
    public static final ICommonLogger LIZ() {
        Object objLIZ = C04TD.LIZ(ICommonLogger.class, false);
        if (objLIZ != null) {
            return (ICommonLogger) objLIZ;
        }
        if (C04TD.LLLLII == null) {
            synchronized (ICommonLogger.class) {
                if (C04TD.LLLLII == null) {
                    C04TD.LLLLII = new CommonLoggerService();
                }
            }
        }
        return C04TD.LLLLII;
    }
}
