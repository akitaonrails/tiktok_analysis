package X;

import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ecommerce.search.bubble.aftersearch.EcSearchQuery;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0QaW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C672980QaW implements InterfaceC586170Myt {
    public static final C672980QaW LL = new C672980QaW();
    public static final C054G LLILLJJLI = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public static C672990QaX LLILLL;
    public static EcSearchQuery LLILZ;

    public static final void LIZ() {
        AccountUserService accountUserServiceLJIIJ = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ();
        LLILLL = new C672990QaX(accountUserServiceLJIIJ.isLogin() ? accountUserServiceLJIIJ.getCurUserId() : "FAKE_USER");
        C23250099c.LIZLLL(LLILLJJLI, null, null, new C672970QaV(null), 3);
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        LIZ();
    }
}
