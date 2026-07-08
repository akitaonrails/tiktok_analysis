package X;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0DrZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C352310DrZ {
    public static final float LIZIZ(long j) {
        return j / 1000000;
    }

    public static final int LIZ(long j) {
        return (int) TimeUnit.MICROSECONDS.toMillis(j);
    }

    public static final long LIZJ(int i) {
        return TimeUnit.MILLISECONDS.toMicros(i);
    }

    public static final long LIZLLL(long j) {
        return TimeUnit.MILLISECONDS.toMicros(j);
    }
}
