package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I8s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C461720I8s {
    public static final String LIZ() {
        try {
            User currentUser = C0I0B.LJFF.LIZ().getCurrentUser();
            if (currentUser != null) {
                String secUid = currentUser.getSecUid();
                if (secUid != null) {
                    return secUid;
                }
            }
            return "";
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static final String LIZIZ() {
        try {
            String curUserId = C0I0B.LJFF.LIZ().getCurUserId();
            return curUserId == null ? "-1" : curUserId;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "-1";
        }
    }

    public static final User LIZLLL() {
        return C0I0B.LJFF.LIZ().getCurrentUser();
    }

    public static final boolean LJ() {
        return C0I0B.LJFF.LIZ().isLogin();
    }

    public static final long LIZJ() {
        Long lLJIILIIL = C2095008Iq.LJIILIIL(LIZIZ());
        if (lLJIILIIL != null) {
            return lLJIILIIL.longValue();
        }
        return -1L;
    }

    public static final boolean LJFF(long j) {
        if (j > 0 && LIZJ() == j) {
            return true;
        }
        return false;
    }

    public static final boolean LJI(String str) {
        if (C123100dR.LIZ(str) && Intrinsics.LJFF(LIZIZ(), str)) {
            return true;
        }
        return false;
    }
}
