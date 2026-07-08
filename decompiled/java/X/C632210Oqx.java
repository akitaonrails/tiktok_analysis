package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Oqx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C632210Oqx {
    public static final C632210Oqx LIZ = new C632210Oqx();

    public static String LIZIZ() {
        IAccountService iAccountService;
        AccountUserService accountUserServiceLJIIJ;
        String curSecUserId;
        ServiceManager serviceManager = ServiceManager.get();
        return (serviceManager == null || (iAccountService = (IAccountService) serviceManager.getService(IAccountService.class)) == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null || (curSecUserId = accountUserServiceLJIIJ.getCurSecUserId()) == null) ? "" : curSecUserId;
    }

    public static User LIZJ() {
        IAccountService iAccountService;
        AccountUserService accountUserServiceLJIIJ;
        ServiceManager serviceManager = ServiceManager.get();
        if (serviceManager == null || (iAccountService = (IAccountService) serviceManager.getService(IAccountService.class)) == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) {
            return null;
        }
        return accountUserServiceLJIIJ.getCurUser();
    }

    public static String LIZLLL() {
        IAccountService iAccountService;
        AccountUserService accountUserServiceLJIIJ;
        ServiceManager serviceManager = ServiceManager.get();
        if (serviceManager == null || (iAccountService = (IAccountService) serviceManager.getService(IAccountService.class)) == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) {
            return null;
        }
        return accountUserServiceLJIIJ.getCurUserId();
    }

    public static boolean LJFF() {
        IAccountService iAccountService;
        AccountUserService accountUserServiceLJIIJ;
        ServiceManager serviceManager = ServiceManager.get();
        return (serviceManager == null || (iAccountService = (IAccountService) serviceManager.getService(IAccountService.class)) == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null || accountUserServiceLJIIJ.getCurUser().getAccountType() != 3) ? false : true;
    }

    public static boolean LJI() {
        IAccountService iAccountService;
        AccountUserService accountUserServiceLJIIJ;
        ServiceManager serviceManager = ServiceManager.get();
        return (serviceManager == null || (iAccountService = (IAccountService) serviceManager.getService(IAccountService.class)) == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null || !accountUserServiceLJIIJ.LIZ()) ? false : true;
    }

    public static boolean LJII() {
        IAccountService iAccountService;
        AccountUserService accountUserServiceLJIIJ;
        ServiceManager serviceManager = ServiceManager.get();
        return (serviceManager == null || (iAccountService = (IAccountService) serviceManager.getService(IAccountService.class)) == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null || !accountUserServiceLJIIJ.isLogin()) ? false : true;
    }

    public static boolean LJIIIZ() {
        IAccountService iAccountService;
        AccountUserService accountUserServiceLJIIJ;
        ServiceManager serviceManager = ServiceManager.get();
        return (serviceManager == null || (iAccountService = (IAccountService) serviceManager.getService(IAccountService.class)) == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null || accountUserServiceLJIIJ.LIZ()) ? false : true;
    }

    public static boolean LJIIJ() {
        return LJIIIZ() && !LJFF();
    }

    public static UrlModel LIZ(User user) {
        if (user == null) {
            return null;
        }
        if (user.getAvatarThumb() != null) {
            return user.getAvatarThumb();
        }
        if (user.getAvatarMedium() != null) {
            return user.getAvatarMedium();
        }
        if (user.getAvatarLarger() == null) {
            return null;
        }
        C2344809Gs.LIZ(new IllegalStateException("Your avatar image is too large !"));
        return user.getAvatarLarger();
    }

    public static String LJ(User user) {
        if (user == null) {
            return "";
        }
        if (TextUtils.isEmpty(user.getUniqueId())) {
            if (user.getShortId() == null) {
                return "";
            }
            return user.getShortId();
        }
        return user.getUniqueId();
    }

    public static boolean LJIIIIZZ(User user) {
        if (user != null) {
            return Intrinsics.LJFF(user.getUid(), ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID());
        }
        return false;
    }
}
