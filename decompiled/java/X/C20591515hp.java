package X;

import android.os.SystemClock;

/* JADX INFO: renamed from: X.15hp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20591515hp {
    public static long LIZIZ;
    public static int LIZLLL;
    public static boolean LJ;
    public static final C20591515hp LIZ = new C20591515hp();
    public static int LIZJ = -1;

    public static void LIZ() {
        if (LIZJ == -1 || LIZIZ <= 0) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = jUptimeMillis - LIZIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(LIZJ, "fold_state");
        c2344009Gk.LIZLLL(j, "duration");
        C20684815ws.LJIILLIIL("fold_state_staytime", c2344009Gk.LIZ);
        LIZIZ = jUptimeMillis;
    }
}
