package X;

import android.os.SystemClock;

/* JADX INFO: renamed from: X.0aDc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C926540aDc {
    public static long LIZ;

    public static boolean LIZ() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = jUptimeMillis - LIZ;
        LIZ = jUptimeMillis;
        return j > 500;
    }
}
