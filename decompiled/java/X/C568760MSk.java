package X;

import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* JADX INFO: renamed from: X.0MSk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C568760MSk {
    public static final boolean LIZ(ShortVideoContext shortVideoContext) {
        AccountUserService accountUserServiceLJIIJ = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ();
        boolean zLIZ = C535390KzB.LIZ();
        boolean z = !shortVideoContext.LJJLL();
        boolean z2 = !shortVideoContext.LJJJJLL();
        boolean z3 = !accountUserServiceLJIIJ.LIZ();
        if (zLIZ && z && z2 && z3) {
            return true;
        }
        return false;
    }
}
