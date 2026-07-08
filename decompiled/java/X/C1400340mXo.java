package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0mXo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1400340mXo implements InterfaceC461710I8r {
    public final ConcurrentHashMap<Integer, WeakReference<InterfaceC586170Myt>> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Integer, WeakReference<InterfaceC427710Gpt>> LIZIZ = new ConcurrentHashMap<>();

    public static final String LJFF() {
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null) {
            return iAccountService.LJIIIIZZ();
        }
        return null;
    }

    public static final String LJI() {
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null) {
            return iAccountService.getStoreRegionUpperCase();
        }
        return null;
    }

    @Override // X.InterfaceC461710I8r
    public final boolean LIZIZ() {
        IAccountUserService iAccountUserService = (IAccountUserService) PluggableExtentionKt.pluggableSpi$default(IAccountUserService.class, false, false, false, 14, null);
        return iAccountUserService != null && iAccountUserService.LIZIZ();
    }

    @Override // X.InterfaceC461710I8r
    public final String getCurSecUserId() {
        IAccountUserService iAccountUserService = (IAccountUserService) PluggableExtentionKt.pluggableSpi$default(IAccountUserService.class, false, false, false, 14, null);
        if (iAccountUserService != null) {
            return iAccountUserService.getCurSecUserId();
        }
        return null;
    }

    @Override // X.InterfaceC461710I8r
    public final String getCurUserId() {
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService != null) {
            return iUserService.getCurrentUserID();
        }
        return null;
    }

    @Override // X.InterfaceC461710I8r
    public final User getCurrentUser() {
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService != null) {
            return iUserService.getCurrentUser();
        }
        return null;
    }

    @Override // X.InterfaceC461710I8r
    public final boolean isLogin() {
        IAccountUserService iAccountUserService = (IAccountUserService) PluggableExtentionKt.pluggableSpi$default(IAccountUserService.class, false, false, false, 14, null);
        return iAccountUserService != null && iAccountUserService.isLogin();
    }

    public static final void LJIIIIZZ(Context context) {
        C0XPD.LIZIZ(C1388190mED.LIZ(context), "chat_list", "button", null, null);
    }

    @Override // X.InterfaceC461710I8r
    public final void LIZ(InterfaceC908170Zjz interfaceC908170Zjz) {
        InterfaceC586170Myt interfaceC586170Myt;
        IAccountService iAccountService;
        int iHashCode = interfaceC908170Zjz.hashCode();
        WeakReference<InterfaceC586170Myt> weakReference = this.LIZ.get(Integer.valueOf(iHashCode));
        if (weakReference != null && (interfaceC586170Myt = weakReference.get()) != null && (iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null)) != null) {
            iAccountService.LJI(interfaceC586170Myt);
        }
        this.LIZ.remove(Integer.valueOf(iHashCode));
    }

    @Override // X.InterfaceC461710I8r
    public final boolean LIZJ(String str) {
        IAccountUserService iAccountUserService = (IAccountUserService) PluggableExtentionKt.pluggableSpi$default(IAccountUserService.class, false, false, false, 14, null);
        if (iAccountUserService == null || !iAccountUserService.LIZJ(str)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC461710I8r
    public final void LIZLLL(InterfaceC908170Zjz interfaceC908170Zjz) {
        LIZ(interfaceC908170Zjz);
        final WeakReference weakReference = new WeakReference(interfaceC908170Zjz);
        InterfaceC586170Myt interfaceC586170Myt = new InterfaceC586170Myt() { // from class: X.0Zjy
            @Override // X.InterfaceC586170Myt
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                InterfaceC908170Zjz interfaceC908170Zjz2 = weakReference.get();
                if (interfaceC908170Zjz2 != null) {
                    interfaceC908170Zjz2.onAccountResult(i, z, 0, user);
                }
            }
        };
        this.LIZ.put(Integer.valueOf(interfaceC908170Zjz.hashCode()), new WeakReference<>(interfaceC586170Myt));
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null) {
            iAccountService.LJIILL(interfaceC586170Myt);
        }
    }

    public final void LJ(InterfaceC1400360mXq interfaceC1400360mXq) {
        LJII(interfaceC1400360mXq);
        final WeakReference weakReference = new WeakReference(interfaceC1400360mXq);
        InterfaceC427710Gpt interfaceC427710Gpt = new InterfaceC427710Gpt() { // from class: X.0mXp
            @Override // X.InterfaceC427710Gpt
            public final void LLLLLLZZ(int i, User user, User user2) {
                InterfaceC1400360mXq interfaceC1400360mXq2 = weakReference.get();
                if (interfaceC1400360mXq2 != null) {
                    interfaceC1400360mXq2.LLLLLLZZ(i, user, user2);
                }
            }
        };
        this.LIZIZ.put(Integer.valueOf(interfaceC1400360mXq.hashCode()), new WeakReference<>(interfaceC427710Gpt));
        IAccountUserService iAccountUserService = (IAccountUserService) PluggableExtentionKt.pluggableSpi$default(IAccountUserService.class, false, false, false, 14, null);
        if (iAccountUserService != null) {
            iAccountUserService.LJJIFFI(interfaceC427710Gpt);
        }
    }

    public final void LJII(InterfaceC1400360mXq interfaceC1400360mXq) {
        InterfaceC427710Gpt interfaceC427710Gpt;
        IAccountUserService iAccountUserService;
        int iHashCode = interfaceC1400360mXq.hashCode();
        WeakReference<InterfaceC427710Gpt> weakReference = this.LIZIZ.get(Integer.valueOf(iHashCode));
        if (weakReference != null && (interfaceC427710Gpt = weakReference.get()) != null && (iAccountUserService = (IAccountUserService) PluggableExtentionKt.pluggableSpi$default(IAccountUserService.class, false, false, false, 14, null)) != null) {
            iAccountUserService.LJIILLIIL(interfaceC427710Gpt);
        }
        this.LIZIZ.remove(Integer.valueOf(iHashCode));
    }

    public static final void LJIIIZ(Context context, String str) {
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            ILoginService iLoginServiceLIZJ = C0XQ7.LIZJ();
            C0XQS c0xqs = new C0XQS();
            c0xqs.LIZ = activityLIZ;
            c0xqs.LIZIZ = str;
            iLoginServiceLIZJ.showLoginView(new C0XQT(c0xqs));
        }
    }

    public static final void LJIIJ(C19EG c19eg, C15486064m c15486064m) {
        ILoginService iLoginServiceLIZJ = C0XQ7.LIZJ();
        C0XQS c0xqs = new C0XQS();
        c0xqs.LIZ = c19eg;
        c0xqs.LJ = new C1768606wG(c15486064m, 2);
        iLoginServiceLIZJ.showLoginAndRegisterView(new C0XQT(c0xqs));
    }
}
