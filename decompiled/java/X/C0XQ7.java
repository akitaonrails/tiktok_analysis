package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.IBindService;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0XQ7, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XQ7 {
    public static volatile IAccountService LIZ;

    public static void LJ() {
        if (LIZ == null) {
            LIZ = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        }
    }

    public static IBindService LIZ() {
        LJ();
        return LIZ.LJII();
    }

    public static String LIZIZ() {
        LJ();
        return LIZ.LJ();
    }

    public static ILoginService LIZJ() {
        LJ();
        return LIZ.LIZJ();
    }

    public static InterfaceC1060510dhh LIZLLL() {
        LJ();
        return LIZ.LJIILIIL();
    }

    public static IAccountUserService LJFF() {
        LJ();
        return LIZ.LJIIJ();
    }
}
