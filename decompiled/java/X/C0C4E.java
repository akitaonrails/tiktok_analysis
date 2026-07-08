package X;

import com.ss.android.ugc.aweme.config.SearchSecurityControlConfig;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0C4E, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C4E {
    public static final C0C4E LIZ = new C0C4E();

    public static boolean LIZIZ() {
        Integer numLIZLLL;
        SearchSecurityControlConfig.LIZ.getClass();
        return C1836207Hc.LIZ(SearchSecurityControlConfig.LIZ()) || ((numLIZLLL = SearchSecurityControlConfig.LIZLLL()) != null && numLIZLLL.intValue() == 0);
    }

    public static Integer LIZ(Integer num) {
        boolean z;
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService != null && iUserService.isLogin()) {
            z = true;
        } else {
            z = false;
        }
        SearchSecurityControlConfig.LIZ.getClass();
        Integer numLIZLLL = SearchSecurityControlConfig.LIZLLL();
        if ((numLIZLLL != null && numLIZLLL.intValue() == 1) || !z) {
            return 1;
        }
        return num;
    }

    public static boolean LIZJ(C0C8S c0c8s) {
        int iIntValue;
        int iIntValue2;
        int i = C0C4G.LIZ[c0c8s.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                SearchSecurityControlConfig.LIZ.getClass();
                return C1836207Hc.LIZ(SearchSecurityControlConfig.LIZ());
            }
            if (((Number) C216300sT.LIZ.getValue()).intValue() == 1) {
                SearchSecurityControlConfig.LIZ.getClass();
                Integer numLIZLLL = SearchSecurityControlConfig.LIZLLL();
                if ((numLIZLLL != null && ((iIntValue2 = numLIZLLL.intValue()) == 0 || iIntValue2 == 1)) || C1836207Hc.LIZ(SearchSecurityControlConfig.LIZ())) {
                    return true;
                }
                IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
                if ((iUserService != null && iUserService.isLogin()) || !LIZLLL(c0c8s)) {
                    return false;
                }
                return true;
            }
            SearchSecurityControlConfig.LIZ.getClass();
            if (C1836207Hc.LIZ(SearchSecurityControlConfig.LIZ())) {
                return true;
            }
            IUserService iUserService2 = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
            if ((iUserService2 != null && iUserService2.isLogin()) || !LIZLLL(c0c8s)) {
                return false;
            }
            return true;
        }
        SearchSecurityControlConfig.LIZ.getClass();
        Integer numLIZLLL2 = SearchSecurityControlConfig.LIZLLL();
        if ((numLIZLLL2 == null || ((iIntValue = numLIZLLL2.intValue()) != 0 && iIntValue != 1)) && !C1836207Hc.LIZ(SearchSecurityControlConfig.LIZ())) {
            IUserService iUserService3 = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
            if ((iUserService3 != null && iUserService3.isLogin()) || !LIZLLL(c0c8s)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean LIZLLL(C0C8S c0c8s) {
        boolean z;
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService != null && iUserService.isLogin()) {
            z = true;
        } else {
            z = false;
        }
        int i = C0C4G.LIZ[c0c8s.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 && ((Number) C216400sU.LIZ.getValue()).intValue() == 1) {
                if (!z && ((Number) C216200sS.LIZ.getValue()).intValue() != 1) {
                    return false;
                }
            } else {
                return z;
            }
        } else if (!z && ((Number) C216200sS.LIZ.getValue()).intValue() != 1) {
            return false;
        }
        return true;
    }
}
