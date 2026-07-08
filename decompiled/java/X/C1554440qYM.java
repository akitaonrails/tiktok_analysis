package X;

import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.minis.route.MinisRouteInterceptor;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qYM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1554440qYM implements InterfaceC586170Myt {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        switch (this.$t) {
            case 0:
                onAccountResult$0(this, i, z, i2, user);
                break;
            case 1:
                onAccountResult$1(this, i, z, i2, user);
                break;
        }
    }

    public C1554440qYM(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAccountResult$0(C1554440qYM c1554440qYM, int i, boolean z, int i2, User user) {
        AccountUserService accountUserServiceLJIIJ;
        String curUserId;
        AccountUserService accountUserServiceLJIIJ2;
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAccountResult, type:");
        sbLIZ.append(i);
        sbLIZ.append(", success:");
        sbLIZ.append(z);
        sbLIZ.append(", loginReasonType:");
        sbLIZ.append(0);
        sbLIZ.append(", user:");
        sbLIZ.append(user);
        C2188811AlT.LIZIZ(sbLIZ);
        C844470XAv.LIZ.getClass();
        C0VSJ c0vsj = new C0VSJ(C08ST.LIZ(C844470XAv.LIZ()), "minis");
        if (c0vsj.exists()) {
            C08ST.LIZIZ(c0vsj);
        }
        if (!z) {
            return;
        }
        MinisRouteInterceptor minisRouteInterceptor = (MinisRouteInterceptor) c1554440qYM.l0;
        minisRouteInterceptor.getClass();
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        String curUserId2 = null;
        if (iAccountService != null && (accountUserServiceLJIIJ2 = iAccountService.LJIIJ()) != null) {
            curUserId2 = accountUserServiceLJIIJ2.getCurUserId();
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C1547430qN3.LIZ.getClass();
                    C1547430qN3.LJJ();
                }
            } else {
                C1547430qN3.LIZ.getClass();
                C1547430qN3.LJJ();
                C1546500qLY.LJII(C1546560qLe.LIZ, C1547430qN3.LJIIIIZZ);
            }
        } else {
            IAccountService iAccountService2 = (IAccountService) ServiceManager.get().getService(IAccountService.class);
            if (iAccountService2 != null && (accountUserServiceLJIIJ = iAccountService2.LJIIJ()) != null && (curUserId = accountUserServiceLJIIJ.getCurUserId()) != null && !curUserId.equals(minisRouteInterceptor.LLILLJJLI)) {
                C1547430qN3.LIZ.getClass();
                C1547430qN3.LJJ();
            }
            C1547430qN3.LIZ.getClass();
            C1546500qLY.LJII(C1546560qLe.LIZ, C1547430qN3.LJIIIIZZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("handleAccountEventSparkReuseRegistration, old cacheUserId:");
        sbLIZ2.append(minisRouteInterceptor.LLILLJJLI);
        sbLIZ2.append(", curUserId:");
        sbLIZ2.append(curUserId2);
        C2188811AlT.LIZIZ(sbLIZ2);
        minisRouteInterceptor.LLILLJJLI = curUserId2;
    }

    public static final void onAccountResult$1(C1554440qYM c1554440qYM, int i, boolean z, int i2, User user) {
        if (i != 1 && i != 2) {
            return;
        }
        ((Function0) c1554440qYM.l0).invoke();
    }
}
