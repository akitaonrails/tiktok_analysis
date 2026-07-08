package X;

import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zdx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1903870zdx {
    public static final C1903870zdx LIZ = new C1903870zdx();
    public static volatile C1903940ze4 LIZIZ;
    public static String LIZJ;

    public static void LIZIZ() {
        C1903880zdy.LIZ.getClass();
        String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
        if (currentUserID == null || currentUserID.length() == 0 || Intrinsics.LJFF(C1903880zdy.LIZJ, currentUserID)) {
            return;
        }
        C1903880zdy.LIZJ = currentUserID;
        C1903880zdy.LIZIZ = new C1903860zdw(0);
        AFwS271S0000000_28 aFwS271S0000000_28 = AFwS271S0000000_28.get$arr$(251);
        C1903860zdw c1903860zdw = C1903880zdy.LIZIZ;
        if (c1903860zdw != null) {
            aFwS271S0000000_28.invoke(c1903860zdw);
        }
    }

    public static void LIZ() {
        String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
        if (currentUserID == null || currentUserID.length() == 0 || Intrinsics.LJFF(LIZJ, currentUserID)) {
            return;
        }
        LIZJ = currentUserID;
        LIZIZ = new C1903940ze4(null);
        AFwS271S0000000_28 aFwS271S0000000_28 = AFwS271S0000000_28.get$arr$(247);
        C1903940ze4 c1903940ze4 = LIZIZ;
        if (c1903940ze4 != null) {
            aFwS271S0000000_28.invoke(c1903940ze4);
        }
    }
}
