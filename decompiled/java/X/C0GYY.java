package X;

/* JADX INFO: renamed from: X.0GYY, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GYY {
    public static final int LIZ(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
            return i2;
        }
        if (i3 < 0) {
            if (i <= i2) {
                return i2;
            }
            int i7 = -i3;
            int i8 = i % i7;
            if (i8 < 0) {
                i8 += i7;
            }
            int i9 = i2 % i7;
            if (i9 < 0) {
                i9 += i7;
            }
            int i10 = (i8 - i9) % i7;
            if (i10 < 0) {
                i10 += i7;
            }
            return i2 + i10;
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    public static final long LIZIZ(long j, long j2, long j3) {
        if (j3 > 0) {
            if (j < j2) {
                long j4 = j2 % j3;
                if (j4 < 0) {
                    j4 += j3;
                }
                long j5 = j % j3;
                if (j5 < 0) {
                    j5 += j3;
                }
                long j6 = (j4 - j5) % j3;
                if (j6 < 0) {
                    j6 += j3;
                }
                return j2 - j6;
            }
            return j2;
        }
        if (j3 < 0) {
            if (j <= j2) {
                return j2;
            }
            long j7 = -j3;
            long j8 = j % j7;
            if (j8 < 0) {
                j8 += j7;
            }
            long j9 = j2 % j7;
            if (j9 < 0) {
                j9 += j7;
            }
            long j10 = (j8 - j9) % j7;
            if (j10 < 0) {
                j10 += j7;
            }
            return j2 + j10;
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}
