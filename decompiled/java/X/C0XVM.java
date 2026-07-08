package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.IAccountMainModuleService;
import java.util.List;

/* JADX INFO: renamed from: X.0XVM, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XVM {
    public static int LIZ(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        String string = bundle.getString("previous_uid");
        String curUserId = C0XQ5.LIZ().getCurUserId();
        C0XQ5.LIZ();
        boolean zLJJIJL = AbstractC848400XPy.LJJIJL(string);
        C0XQ5.LIZ();
        boolean zLJJIJL2 = AbstractC848400XPy.LJJIJL(curUserId);
        if (zLJJIJL) {
            if (!zLJJIJL2) {
                return 0;
            }
            return 2;
        }
        if (!zLJJIJL2) {
            return 1;
        }
        return 2;
    }

    public static C15O7 LIZIZ(Bundle bundle, C0XVT c0xvt, boolean z, final boolean z2) {
        C0XVP c0xvp;
        C15O7<Bundle> c15o7LIZIZ;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        if (bundle == null) {
            bundle = new Bundle();
        }
        List<InterfaceC586170Myt> list = C0XQ5.LIZ;
        C0XVQ c0xvqLIZIZ = ((IAccountMainModuleService) C0XPY.LIZIZ(IAccountMainModuleService.class)).LIZIZ();
        final int iLIZ = LIZ(bundle);
        if (iLIZ == 0) {
            c0xvqLIZIZ.getClass();
            c15o7LIZIZ = C19276710bF.LIZ(bundle);
        } else if (iLIZ == 1) {
            c15o7LIZIZ = C0XVQ.LIZ(bundle, Boolean.valueOf(z));
        } else {
            C0XVR c0xvr = new C0XVR(bundle, false);
            if (c0xvt instanceof C0XVP) {
                c0xvp = (C0XVP) c0xvt;
            } else {
                c0xvp = null;
            }
            c0xvqLIZIZ.getClass();
            c15o7LIZIZ = C19276710bF.LIZIZ(bundle, c0xvp, c0xvr);
        }
        C1440005kM.LIZ(new C486550J6f(iLIZ));
        return c15o7LIZIZ.LJIILLIIL(new InterfaceC2385309Wh() { // from class: X.0XUe
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                String str;
                int i = iLIZ;
                boolean z3 = z2;
                long j = jCurrentTimeMillis;
                C1C7U.LIZ("AfterLoginUtils@61d4.updateContextRelatedToCurrentUser$1L");
                C0XQ5.LJ().uploadAccountNum(true);
                if (i == 2) {
                    str = "logout";
                } else if (z3) {
                    str = "switch_account";
                } else {
                    str = "login";
                }
                C0XVC.LIZ(Long.valueOf(j), "UpdateUserContextHook", str);
                Object objLJIIL = c15o7.LJIIL();
                C1C7U.LIZIZ("AfterLoginUtils@61d4.updateContextRelatedToCurrentUser$1L");
                return objLJIIL;
            }
        });
    }
}
