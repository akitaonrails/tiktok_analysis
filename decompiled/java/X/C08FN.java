package X;

/* JADX INFO: renamed from: X.08FN, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C08FN {
    public static /* synthetic */ long LIZ(int i, String str) {
        long j;
        long j2;
        int length = str.length();
        if (length == 0) {
            throw new NumberFormatException("empty string");
        }
        if (i < 2 || i > 36) {
            throw new NumberFormatException("illegal radix: ".concat(String.valueOf(i)));
        }
        long j3 = i;
        long j4 = 0;
        int i2 = 0;
        if (j3 < 0) {
            j = Long.MAX_VALUE < (j3 ^ Long.MIN_VALUE) ? 0L : 1L;
        } else {
            long j5 = (Long.MAX_VALUE / j3) << 1;
            j = j5 + ((long) ((((-1) - (j5 * j3)) ^ Long.MIN_VALUE) >= (j3 ^ Long.MIN_VALUE) ? 1 : 0));
        }
        if (str.charAt(0) == '+' && length > 1) {
            i2 = 1;
        }
        long j6 = 0;
        while (i2 < length) {
            int iDigit = Character.digit(str.charAt(i2), i);
            if (iDigit == -1) {
                str.toString();
                throw new NumberFormatException(str);
            }
            if (j6 >= j4 && j6 <= j) {
                if (j6 == j) {
                    if (j3 < 0) {
                        j2 = Long.MAX_VALUE < (j3 ^ Long.MIN_VALUE) ? -1L : (-1) - j3;
                    } else {
                        long j7 = (-1) - (((Long.MAX_VALUE / j3) << 1) * j3);
                        j2 = j7 - ((j7 ^ Long.MIN_VALUE) >= (j3 ^ Long.MIN_VALUE) ? j3 : 0L);
                    }
                    if (iDigit <= ((int) j2)) {
                    }
                }
                j6 = (j6 * j3) + ((long) iDigit);
                i2++;
                j4 = 0;
            }
            str.toString();
            throw new NumberFormatException("Too large for unsigned long: ".concat(str));
        }
        return j6;
    }
}
