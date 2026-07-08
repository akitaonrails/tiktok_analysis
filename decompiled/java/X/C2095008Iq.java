package X;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;

/* JADX INFO: renamed from: X.08Iq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2095008Iq extends C2327809Ae {
    public static final void LJIIIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Invalid number format: '");
        sbLIZ.append(str);
        sbLIZ.append('\'');
        throw new NumberFormatException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Integer LJIIJJI(String str) {
        return LJIIJ(10, str);
    }

    public static final Long LJIILIIL(String str) {
        return LJIIL(10, str);
    }

    public static final Integer LJIIJ(int i, String str) {
        boolean z;
        int i2;
        int i3;
        CharsKt__CharJVMKt.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char cCharAt = str.charAt(0);
        int i5 = -2147483647;
        if (Intrinsics.LJI(cCharAt, 48) < 0) {
            i2 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt != '+') {
                if (cCharAt != '-') {
                    return null;
                }
                i5 = Integer.MIN_VALUE;
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
            i2 = 0;
        }
        int i6 = -59652323;
        while (i2 < length) {
            int iDigit = Character.digit((int) str.charAt(i2), i);
            if (iDigit < 0) {
                return null;
            }
            if ((i4 < i6 && (i6 != -59652323 || i4 < (i6 = i5 / i))) || (i3 = i4 * i) < i5 + iDigit) {
                return null;
            }
            i4 = i3 - iDigit;
            i2++;
        }
        if (z) {
            return Integer.valueOf(i4);
        }
        return Integer.valueOf(-i4);
    }

    public static final Long LJIIL(int i, String str) {
        boolean z;
        CharsKt__CharJVMKt.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (Intrinsics.LJI(cCharAt, 48) < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt != '+') {
                if (cCharAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i2 = 1;
            } else {
                z = false;
                i2 = 1;
            }
        } else {
            z = false;
        }
        long j2 = -256204778801521550L;
        long j3 = 0;
        long j4 = -256204778801521550L;
        while (i2 < length) {
            int iDigit = Character.digit((int) str.charAt(i2), i);
            if (iDigit < 0) {
                return null;
            }
            if (j3 < j4) {
                if (j4 == j2) {
                    j4 = j / ((long) i);
                    if (j3 < j4) {
                    }
                }
                return null;
            }
            long j5 = j3 * ((long) i);
            long j6 = iDigit;
            if (j5 < j + j6) {
                return null;
            }
            j3 = j5 - j6;
            i2++;
            j2 = -256204778801521550L;
        }
        if (z) {
            return Long.valueOf(j3);
        }
        return Long.valueOf(-j3);
    }
}
