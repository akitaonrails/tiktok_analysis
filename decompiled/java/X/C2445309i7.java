package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.09i7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2445309i7 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1604));
    public static long LIZIZ = -1;
    public static long LIZJ = -1;
    public static int LIZLLL = -1;
    public static final String LJ;
    public static final C01GW LJFF;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("following_suggest_button_shown_count_");
        LIZIZ().getClass();
        sbLIZ.append(((Number) C1ECA.LJIIJ.getValue()).intValue());
        LJ = C2188811AlT.LIZIZ(sbLIZ);
        LJFF = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1605));
    }

    public static C1ECA LIZIZ() {
        return (C1ECA) LIZ.getValue();
    }

    public static int LIZJ() {
        int i = LIZLLL;
        if (i != -1) {
            return i;
        }
        try {
            int i2 = LIZLLL().getInt(LJ, 0);
            LIZLLL = i2;
            return i2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                int i3 = C2187451AjH.LIZ;
                C1720106oR.LIZIZ("FollowingSuggestComponent", "getFollowingSuggestButtonShownCount error", thM5exceptionOrNullimpl);
            }
            return 0;
        }
    }

    public static Keva LIZLLL() {
        return (Keva) LJFF.getValue();
    }

    public static boolean LIZ() {
        int iLIZJ = LIZJ();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = LIZIZ;
        if (j == -1) {
            try {
                j = LIZLLL().getLong("following_suggest_button_shown_time", 0L);
                LIZIZ = j;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    int i = C2187451AjH.LIZ;
                    C1720106oR.LIZIZ("FollowingSuggestComponent", "getFollowingSuggestButtonShownTime error", thM5exceptionOrNullimpl);
                }
                j = 0;
            }
        }
        long j2 = jCurrentTimeMillis - j;
        LIZIZ().getClass();
        if (iLIZJ < ((Number) C1ECA.LJIIJ.getValue()).intValue()) {
            LIZIZ().getClass();
            return j2 > ((long) ((Number) C1ECA.LJIIIZ.getValue()).intValue());
        }
        LIZIZ().getClass();
        if (j2 <= ((Number) C1ECA.LJIIJJI.getValue()).intValue()) {
            return false;
        }
        LJI(0L);
        LJFF(0);
        return true;
    }

    public static void LJ() {
        Object c098200Yq;
        long jCurrentTimeMillis = System.currentTimeMillis();
        LIZIZ = jCurrentTimeMillis;
        try {
            LIZLLL().storeLong("following_suggest_button_shown_time", jCurrentTimeMillis);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("FollowingSuggestComponent", "saveFollowingSuggestButtonShownTime error", thM5exceptionOrNullimpl);
        }
        LJFF(LIZJ() + 1);
    }

    public static void LJFF(int i) {
        Object c098200Yq;
        LIZLLL = i;
        try {
            LIZLLL().storeInt(LJ, i);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("FollowingSuggestComponent", "saveFollowingSuggestButtonShownCount error", thM5exceptionOrNullimpl);
        }
    }

    public static void LJI(long j) {
        Object c098200Yq;
        LIZJ = j;
        try {
            LIZLLL().storeLong("following_suggest_label_shown_time", j);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("FollowingSuggestComponent", "saveFollowingSuggestLabelShownTime error", thM5exceptionOrNullimpl);
        }
    }
}
