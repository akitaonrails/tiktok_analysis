package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: renamed from: X.0fRD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1127170fRD {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(192));
    public static volatile int LIZIZ;
    public static volatile boolean LIZJ;
    public static volatile boolean LIZLLL;

    public static Keva LIZIZ() {
        return (Keva) LIZ.getValue();
    }

    public static long LIZ() {
        return UserService.getInstance().user().getCurrentUserId();
    }

    public static int LIZJ() {
        if (LIZ() <= 0) {
            return LIZIZ;
        }
        try {
            return LIZIZ().getInt(LJ("guardian_select_count_"), 0);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return LIZIZ;
        }
    }

    public static boolean LIZLLL() {
        if (LIZ() <= 0) {
            return LIZLLL;
        }
        try {
            return LIZIZ().getBoolean(LJ("guardian_group_pinned_top_"), false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return LIZLLL;
        }
    }

    public static String LJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(LIZ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJFF(String str, boolean z) {
        if (LIZ() <= 0) {
            return;
        }
        try {
            LIZIZ().storeBoolean(LJ(str), z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
