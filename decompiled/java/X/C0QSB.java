package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QSB, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QSB {
    public static final C0QSB LIZ = new C0QSB();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(782));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(783));

    public static boolean LIZ() {
        LocalTestApi localTestApi;
        ServiceManager serviceManager = ServiceManager.get();
        if (serviceManager != null && (localTestApi = (LocalTestApi) serviceManager.getService(LocalTestApi.class)) != null && Intrinsics.LJFF(localTestApi.getSearchDebugSwitch(), Boolean.TRUE)) {
            ((Keva) LIZIZ.getValue()).storeBoolean(LIZIZ(), false);
        }
        return !((Keva) LIZIZ.getValue()).getBoolean(LIZIZ(), false);
    }

    public static String LIZIZ() {
        String curUserId;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show_v2_");
        IAccountUserService iAccountUserService = (IAccountUserService) LIZJ.getValue();
        if (iAccountUserService == null || (curUserId = iAccountUserService.getCurUserId()) == null) {
            curUserId = "FAKE_USER";
        }
        sbLIZ.append(curUserId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
