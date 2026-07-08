package X;

import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.102n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191819102n {
    public static final C191819102n LIZ = new C191819102n();

    public static User LIZ() {
        return ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUser();
    }

    public static String LIZIZ() {
        AccountUserService accountUserServiceLJIIJ;
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        if (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) {
            return null;
        }
        return accountUserServiceLJIIJ.getCurUserId();
    }

    public static boolean LIZJ() {
        return ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin();
    }

    public static boolean LIZLLL() {
        C191821102p.LIZIZ().getClass();
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIL = C191880104w.LJIIL();
        Boolean boolValueOf = privacyUserSettingsV2LJIIL != null ? Boolean.valueOf(C103K.LIZ(privacyUserSettingsV2LJIIL)) : null;
        boolean zIsSecret = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUser().isSecret();
        C589830NBl c589830NBl = C589830NBl.LIZ;
        boolean zLJFF = Intrinsics.LJFF(Boolean.valueOf(zIsSecret), boolValueOf);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("fromProfile", Boolean.valueOf(zIsSecret)), new Pair("fromPrivate", boolValueOf));
        c589830NBl.getClass();
        C589830NBl.LIZ("pri_acc_val_check_tpsc", mapLJIIIIZZ, zLJFF);
        return zIsSecret;
    }

    public static IAccountService LJ() {
        return (IAccountService) ServiceManager.get().getService(IAccountService.class);
    }
}
