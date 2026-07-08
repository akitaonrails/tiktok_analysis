package X;

import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.journey.IStrategyCenterService;

/* JADX INFO: renamed from: X.10V3, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10V3 {
    public static final C10V3 LIZ = new C10V3();

    public static boolean LIZ() {
        AccountUserService accountUserServiceLJIIJ;
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) {
            return false;
        }
        return accountUserServiceLJIIJ.isLogin();
    }

    public static boolean LIZIZ() {
        IStrategyCenterService iStrategyCenterService = (IStrategyCenterService) PluggableExtentionKt.pluggableSpi$default(IStrategyCenterService.class, false, false, false, 14, null);
        return (iStrategyCenterService != null ? iStrategyCenterService.LJIIIIZZ() : null) == C10OZ.NEW_USER;
    }
}
