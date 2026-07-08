package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ecommerce.ug.newinstall.service.IEcUgNewInstallService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.TTMallTabRelatedUserInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CXF, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CXF {
    public static final C0CXF LIZ = new C0CXF();
    public static Boolean LIZIZ;

    public static boolean LIZ() {
        final boolean zIsLogin = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin();
        TTMallTabRelatedUserInfo tTMallTabRelatedUserInfo = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().mallTabUserInfo;
        final boolean zIsMallTabDisplay = tTMallTabRelatedUserInfo != null ? tTMallTabRelatedUserInfo.isMallTabDisplay() : false;
        final boolean z = !zIsLogin || zIsMallTabDisplay;
        if (((Boolean) C285090BFj.LJJLIIIJJI.getValue()).booleanValue()) {
            C0CN5.LIZIZ(Long.valueOf(((Number) C285090BFj.LJJLIIIJILLIZJL.getValue()).longValue()), new Runnable() { // from class: X.0CXG
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ECommerceMallTabExperiment@76c5.accountCanShowMallTab$1");
                    try {
                        C0CXF c0cxf = C0CXF.LIZ;
                        boolean z2 = z;
                        boolean z3 = zIsLogin;
                        boolean z4 = zIsMallTabDisplay;
                        c0cxf.getClass();
                        C0CXF.LJI(z2, z3, z4);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ECommerceMallTabExperiment@76c5.accountCanShowMallTab$1");
                }
            });
            return z;
        }
        LJI(z, zIsLogin, zIsMallTabDisplay);
        return z;
    }

    public static boolean LIZIZ() {
        if (C343780Ddo.LIZIZ()) {
            return C1585070rLl.LIZLLL(C1585070rLl.LIZ, EnumC1584360rKc.MALL);
        }
        C0CXC.LIZ.getClass();
        if (C0CXC.LIZ() > 0) {
            return C0CXC.LIZ() == 1;
        }
        C0CUY.LIZ.getClass();
        if (C0CUY.LIZ() == 1) {
            return true;
        }
        IEcUgNewInstallService iEcUgNewInstallService = (IEcUgNewInstallService) PluggableExtentionKt.pluggableSpi$default(IEcUgNewInstallService.class, false, false, false, 14, null);
        if (iEcUgNewInstallService == null || !iEcUgNewInstallService.LIZJ()) {
            return C0CUY.LIZ() != 0 && C1585030rLh.LIZJ();
        }
        return true;
    }

    public static boolean LIZJ() {
        if (C343780Ddo.LIZIZ()) {
            C1585070rLl c1585070rLl = C1585070rLl.LIZ;
            EnumC1584360rKc enumC1584360rKc = EnumC1584360rKc.MALL;
            c1585070rLl.getClass();
            return C1585070rLl.LJFF(enumC1584360rKc, null);
        }
        C0CXC.LIZ.getClass();
        if (C0CXC.LIZ() > 0) {
            return C0CXC.LIZ() == 2;
        }
        C0CUY.LIZ.getClass();
        return C0CUY.LIZ() == 2;
    }

    public static boolean LIZLLL() {
        if (LIZIZ() || LIZJ()) {
            return LIZ();
        }
        return false;
    }

    public static boolean LJ() {
        if (LIZIZ()) {
            return LIZ();
        }
        return false;
    }

    public static boolean LJFF() {
        if (LIZJ()) {
            return LIZ();
        }
        return false;
    }

    public static void LJI(boolean z, boolean z2, boolean z3) {
        boolean z4;
        try {
            if (!((Boolean) C07B9.LIZ.getValue()).booleanValue() || Intrinsics.LJFF(Boolean.valueOf(z), LIZIZ)) {
                return;
            }
            if (LIZIZ != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            LIZIZ = Boolean.valueOf(z);
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2469709m3(z, z2, z3, z4, null), 3);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
