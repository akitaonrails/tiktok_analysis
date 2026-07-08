package X;

import android.os.SystemClock;

/* JADX INFO: renamed from: X.0P9N, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P9N {
    public static long LIZ;

    public static boolean LIZ() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - LIZ <= 1200) {
            return true;
        }
        LIZ = jElapsedRealtime;
        return false;
    }
}
