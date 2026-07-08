package X;

import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.10Oa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19237810Oa {
    public static final C19237810Oa LIZ = new C19237810Oa();
    public static C10OZ LIZIZ = C10OZ.UNLOGIN;
    public static C19238310Of LIZJ;

    public static void LIZ() {
        C10OZ c10oz;
        AccountUserService accountUserServiceLJIIJ;
        AccountUserService accountUserServiceLJIIJ2;
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null || !accountUserServiceLJIIJ.isLogin()) {
            c10oz = C10OZ.UNLOGIN;
        } else {
            IAccountService iAccountService2 = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
            c10oz = (iAccountService2 == null || (accountUserServiceLJIIJ2 = iAccountService2.LJIIJ()) == null || !accountUserServiceLJIIJ2.isNewUser()) ? C10OZ.OLD_USER : C10OZ.NEW_USER;
        }
        LIZIZ = c10oz;
    }

    public static void LIZJ() {
        IAccountService iAccountService;
        C19238310Of c19238310Of = LIZJ;
        if (c19238310Of != null && (iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null)) != null) {
            iAccountService.LJI(c19238310Of);
        }
        LIZJ = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0Myt, X.10Of] */
    public static void LIZIZ() {
        LIZ();
        ?? r1 = new InterfaceC586170Myt() { // from class: X.10Of
            @Override // X.InterfaceC586170Myt
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                if (i == 1) {
                    C19237810Oa.LIZ.getClass();
                    C19237810Oa.LIZ();
                    C19237810Oa.LIZJ();
                }
            }
        };
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != 0) {
            iAccountService.LJIILL(r1);
        }
        LIZJ = r1;
    }
}
