package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.0hmG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1217100hmG {
    public static Keva LIZ() {
        AccountUserService accountUserServiceLJIIJ = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ();
        if (!accountUserServiceLJIIJ.isLogin()) {
            return null;
        }
        String curUserId = accountUserServiceLJIIJ.getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("repo_tt_push_settings_");
        sbLIZ.append(curUserId);
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static String LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("current_settings__");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZJ(final String str) {
        AccountUserService accountUserServiceLJIIJ = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ();
        if (!accountUserServiceLJIIJ.isLogin()) {
            return;
        }
        final String curUserId = accountUserServiceLJIIJ.getCurUserId();
        final Keva kevaLIZ = LIZ();
        if (kevaLIZ != null) {
            C15O7.LIZJ(new Callable() { // from class: X.0hmH
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Keva keva = kevaLIZ;
                    String str2 = curUserId;
                    String str3 = str;
                    C1C7U.LIZ("SettingsHelper@b3c7.updatePushSettingsCache$1L");
                    keva.storeString(C1217100hmG.LIZIZ(str2), str3);
                    C1C7U.LIZIZ("SettingsHelper@b3c7.updatePushSettingsCache$1L");
                    return null;
                }
            });
        }
    }
}
