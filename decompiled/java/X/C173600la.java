package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00la, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C173600la {
    public static final boolean LIZ(Number number) {
        if (number instanceof Long) {
            if (!Intrinsics.LJFF(number, Long.MAX_VALUE)) {
                return true;
            }
            return false;
        }
        if (number instanceof Integer) {
            if (!Intrinsics.LJFF(number, Integer.MAX_VALUE)) {
                return true;
            }
            return false;
        }
        if (number instanceof Float) {
            if (Math.abs(number.floatValue() - Float.MAX_VALUE) > 1.0E-6d) {
                return true;
            }
            return false;
        }
        if ((number instanceof Double) && Math.abs(number.doubleValue() - Double.MAX_VALUE) > 1.0E-6d) {
            return true;
        }
        return false;
    }
}
