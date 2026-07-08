package X;

import android.os.SystemClock;

/* JADX INFO: renamed from: X.0WSN, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WSN {
    public static boolean LIZ(float f) {
        if (f <= 0.0f) {
            return false;
        }
        if (f < 1.0f && SystemClock.elapsedRealtimeNanos() % ((long) 100000) >= f * 100000) {
            return false;
        }
        return true;
    }
}
