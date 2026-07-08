package X;

/* JADX INFO: renamed from: X.0VxA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C814420VxA extends C814430VxB {
    public static final int LIZ(double d) {
        if (!Double.isNaN(d)) {
            if (d > 2.147483647E9d) {
                return Integer.MAX_VALUE;
            }
            if (d < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static final int LIZIZ(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static final long LIZJ(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }
}
