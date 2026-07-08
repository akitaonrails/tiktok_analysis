package X;

import java.math.RoundingMode;

/* JADX INFO: renamed from: X.11EZ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11EZ {
    public static int LIZ(int i, int i2, RoundingMode roundingMode) {
        int i3;
        roundingMode.getClass();
        if (i2 != 0) {
            int i4 = i / i2;
            int i5 = i - (i2 * i4);
            if (i5 == 0) {
                return i4;
            }
            int i6 = ((i ^ i2) >> 31) | 1;
            switch (C19376110rH.LIZ[roundingMode.ordinal()]) {
                case 1:
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                case 2:
                    return i4;
                case 3:
                    if (i6 >= 0) {
                        return i4;
                    }
                    break;
                case 4:
                    break;
                case 5:
                    if (i6 <= 0) {
                        return i4;
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    int iAbs = Math.abs(i5);
                    int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
                    if (iAbs2 == 0) {
                        if (roundingMode != RoundingMode.HALF_UP) {
                            if (roundingMode == RoundingMode.HALF_EVEN) {
                                i3 = 1;
                            } else {
                                i3 = 0;
                            }
                            if ((i3 & i4 & 1) == 0) {
                                return i4;
                            }
                        }
                    } else if (iAbs2 <= 0) {
                        return i4;
                    }
                default:
                    throw new AssertionError();
            }
            return i4 + i6;
        }
        throw new ArithmeticException("/ by zero");
    }
}
