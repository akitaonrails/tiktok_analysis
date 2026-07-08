package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0KU0, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KU0 {
    public static long LIZ;
    public static long LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static final /* synthetic */ int LJ = 0;

    public static void LIZ() {
        long j = LIZJ;
        if (j > 0) {
            long j2 = LIZIZ;
            if (j2 > 0) {
                long j3 = j - j2;
                try {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_fans_club_receive_all_join_notifications");
                    c474500IjALIZ.LJIL();
                    c474500IjALIZ.LJJII(Long.valueOf(j3), "duration");
                    c474500IjALIZ.LJJII(Long.valueOf(LIZLLL), "fans_club_level");
                    c474500IjALIZ.LIZ();
                    LIZIZ = 0L;
                    LIZJ = 0L;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }
}
