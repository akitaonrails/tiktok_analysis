package X;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;

/* JADX INFO: renamed from: X.13Bq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19970013Bq {
    public static final String LIZ(long j) {
        CharsKt__CharJVMKt.checkRadix(16);
        return C1385770mAJ.LIZIZ(16, j);
    }

    public static final String LIZIZ(byte b) {
        CharsKt__CharJVMKt.checkRadix(16);
        return Integer.toString(b & 255, 16);
    }

    public static final String LIZJ(int i) {
        CharsKt__CharJVMKt.checkRadix(16);
        return C1385770mAJ.LIZIZ(16, ((long) i) & 4294967295L);
    }

    public static final C1507240pKE LIZLLL(String str) {
        int i;
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (Intrinsics.LJI(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int i3 = 119304647;
        int i4 = 119304647;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            int i5 = i2 ^ Integer.MIN_VALUE;
            if (Integer.compare(i5, i4 ^ Integer.MIN_VALUE) > 0) {
                if (i4 == i3) {
                    i4 = (int) ((((long) (-1)) & 4294967295L) / (((long) 10) & 4294967295L));
                    if (Integer.compare(i5, i4 ^ Integer.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            int i6 = i2 * 10;
            i2 = i6 + iDigit;
            if (Integer.compare(i2 ^ Integer.MIN_VALUE, i6 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i++;
            i3 = 119304647;
        }
        return new C1507240pKE(i2);
    }

    public static final C19969813Bo LJ(String str) {
        int i;
        int i2 = 10;
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length != 0) {
            char cCharAt = str.charAt(0);
            int i3 = 1;
            if (Intrinsics.LJI(cCharAt, 48) < 0) {
                if (length != 1 && cCharAt == '+') {
                    i = 1;
                } else {
                    return null;
                }
            } else {
                i = 0;
            }
            long j = 10;
            long j2 = 0;
            long j3 = 0;
            long j4 = 512409557603043100L;
            while (i < length) {
                int iDigit = Character.digit((int) str.charAt(i), i2);
                if (iDigit >= 0) {
                    long j5 = j3 ^ Long.MIN_VALUE;
                    if (Long.compare(j5, j4 ^ Long.MIN_VALUE) > 0) {
                        if (j4 == 512409557603043100L) {
                            if (j < j2) {
                                if (Long.MAX_VALUE < (j ^ Long.MIN_VALUE)) {
                                    j4 = 0;
                                } else {
                                    j4 = 1;
                                }
                            } else {
                                long j6 = (Long.MAX_VALUE / j) << i3;
                                if ((((-1) - (j6 * j)) ^ Long.MIN_VALUE) < (j ^ Long.MIN_VALUE)) {
                                    i3 = 0;
                                }
                                j4 = j6 + ((long) i3);
                            }
                            if (Long.compare(j5, j4 ^ Long.MIN_VALUE) > 0) {
                                return null;
                            }
                        } else {
                            return null;
                        }
                    }
                    long j7 = j3 * j;
                    long j8 = (((long) iDigit) & 4294967295L) + j7;
                    if (Long.compare(j8 ^ Long.MIN_VALUE, j7 ^ Long.MIN_VALUE) < 0) {
                        return null;
                    }
                    i++;
                    j3 = j8;
                    i2 = 10;
                    i3 = 1;
                    j2 = 0;
                } else {
                    return null;
                }
            }
            return new C19969813Bo(j3);
        }
        return null;
    }
}
