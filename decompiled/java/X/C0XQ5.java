package X;

import Y.ACallableS420S0100000_13;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.account.network.StandaloneAidInterceptor;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BindService;
import com.ss.android.ugc.aweme.services.LoginService;
import com.ss.android.ugc.aweme.services.PasswordService;
import com.ss.android.ugc.aweme.services.ProAccountService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0XQ5, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XQ5 {
    public static final List<InterfaceC586170Myt> LIZ = new CopyOnWriteArrayList();
    public static C0XNY LIZIZ;
    public static LoginService LIZJ;
    public static BindService LIZLLL;

    public static AccountUserService LIZ() {
        return LIZIZ.LJIIJ();
    }

    public static BindService LIZIZ() {
        if (LIZLLL == null) {
            LIZLLL = (BindService) LIZIZ.LJII();
        }
        return LIZLLL;
    }

    public static LoginService LJ() {
        if (LIZJ == null) {
            LIZJ = (LoginService) LIZIZ.LIZJ();
        }
        return LIZJ;
    }

    public static boolean LJFF() {
        return LIZIZ.LJIIJ().isLogin();
    }

    public static void LJIIIIZZ() {
        Iterator it2 = ((CopyOnWriteArrayList) LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC586170Myt) it2.next()).onAccountResult(4, true, 0, null);
        }
    }

    public static User LIZJ() {
        return LIZ().getCurUser();
    }

    public static String LIZLLL() {
        return LIZ().getCurUserId();
    }

    public static void LJI() {
        LIZ().getClass();
        C848040XOo.LIZ.getClass();
        C15O7.LIZJ(new ACallableS420S0100000_13(C848040XOo.LIZIZ, 4));
    }

    public static void LJII(User user) {
        Iterator it2 = ((CopyOnWriteArrayList) LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC586170Myt) it2.next()).onAccountResult(1, true, 0, user);
        }
    }

    public static void LJIIIZ(int i, int i2) {
        C0XNY c0xny = LIZIZ;
        if (c0xny.LJIIJ.get() != null) {
            c0xny.LJIIJ.get().notifyProgress(i, i2, "");
        }
    }

    public static void LJIIJ(User user, boolean z) {
        boolean zLJI = MethodIDManager.LJI(71776);
        Iterator it2 = ((CopyOnWriteArrayList) LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC586170Myt) it2.next()).onAccountResult(2, z, 0, user);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static void LJIIL(C0XO2 c0xo2, String str) {
        boolean z;
        AccountUserService accountUserServiceLJIIJ = LIZIZ.LJIIJ();
        StandaloneAidInterceptor.LL.getClass();
        if (StandaloneAidInterceptor.LLILLJJLI != null) {
            z = true;
        } else {
            z = false;
        }
        accountUserServiceLJIIJ.LJJLL(c0xo2, str, z);
    }

    public static void LJIIJJI(int i, int i2, Object obj) {
        C0XNY c0xny = LIZIZ;
        c0xny.getClass();
        if (i != 1 && i != 19) {
            if (i != 17 && i != 13) {
                if (c0xny.LIZJ == null) {
                    c0xny.LJII();
                }
                c0xny.LIZJ.returnResult(i, i2, obj);
                PasswordService passwordService = c0xny.LIZLLL;
                if (passwordService != null) {
                    passwordService.returnResult(i, i2, obj);
                }
                ProAccountService proAccountService = c0xny.LJ;
                if (proAccountService != null) {
                    proAccountService.returnResult(i, i2, obj);
                    return;
                }
                return;
            }
            PasswordService passwordService2 = c0xny.LIZLLL;
            if (passwordService2 == null) {
                return;
            }
            passwordService2.returnResult(i, i2, obj);
            return;
        }
        if (c0xny.LJIIJ.get() == null) {
            return;
        }
        c0xny.LJIIJ.get().returnResult(i, i2, obj);
    }
}
