package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService;

/* JADX INFO: renamed from: X.10Qv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19245110Qv {
    public static final C19245110Qv LIZ = new C19245110Qv();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C19246510Rj());

    public static boolean LIZ() {
        Integer numLIZJ;
        C1602860roS.LIZ.getClass();
        if (!C1602860roS.LJ()) {
            return false;
        }
        C0CBW c0cbw = C0CBW.LIZ;
        if (C0CBW.LIZIZ()) {
            return false;
        }
        INewUserDebugService iNewUserDebugService = (INewUserDebugService) PluggableExtentionKt.pluggableSpi$default(INewUserDebugService.class, false, false, false, 14, null);
        int iIntValue = (iNewUserDebugService == null || (numLIZJ = iNewUserDebugService.LIZJ()) == null) ? 0 : numLIZJ.intValue();
        return iIntValue != 0 ? iIntValue == 2 : ((Number) LIZIZ.getValue()).intValue() == 1;
    }

    public static boolean LIZIZ() {
        Integer numLIZJ;
        int iIntValue;
        C1602860roS.LIZ.getClass();
        if (!C1602860roS.LJ()) {
            return false;
        }
        C0CBW c0cbw = C0CBW.LIZ;
        if (C0CBW.LIZIZ()) {
            return false;
        }
        INewUserDebugService iNewUserDebugService = (INewUserDebugService) PluggableExtentionKt.pluggableSpi$default(INewUserDebugService.class, false, false, false, 14, null);
        return (iNewUserDebugService == null || (numLIZJ = iNewUserDebugService.LIZJ()) == null || (iIntValue = numLIZJ.intValue()) == 0) ? ((Number) LIZIZ.getValue()).intValue() == 0 : iIntValue == 1 || iIntValue == 3;
    }
}
