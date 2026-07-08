package X;

import android.os.SystemClock;

/* JADX INFO: renamed from: X.136y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199578136y {
    public static final C199578136y LIZ = new C199578136y();
    public static long LIZIZ;
    public static long LIZJ;
    public static volatile long LIZLLL;
    public static int LJ;

    public final synchronized void LIZ(int i) {
        if (LIZLLL == 0) {
            LIZLLL = SystemClock.elapsedRealtime();
            LJ = i;
        }
    }
}
