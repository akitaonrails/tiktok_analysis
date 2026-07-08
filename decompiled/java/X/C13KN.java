package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;

/* JADX INFO: renamed from: X.13KN, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13KN {
    public static final boolean LIZ = !"little".equals(System.getProperty("sun.cpu.endian"));
    public static final C13KN LIZIZ = new C13KN();

    public static long LJ(int i, long j) {
        if (i == 0) {
            return j;
        }
        return (j << (64 - i)) | (j >>> i);
    }

    public static BigInteger LIZJ(String str) {
        long j;
        long j2;
        long j3;
        long j4;
        String str2 = str;
        if (str2 == null) {
            str2 = "NULL";
        }
        LIZIZ.getClass();
        try {
            byte[] bytes = str2.getBytes("UTF-8");
            int length = bytes.length;
            long jLIZLLL = -7286425919675154353L;
            int i = 0;
            if (length <= 32) {
                if (length <= 16) {
                    int length2 = bytes.length;
                    if (length2 >= 8) {
                        j2 = ((long) (length2 * 2)) - 7286425919675154353L;
                        long jLIZIZ = LIZIZ(0, bytes) - 7286425919675154353L;
                        long jLIZIZ2 = LIZIZ(length2 - 8, bytes);
                        long jLJ = (LJ(37, jLIZIZ2) * j2) + jLIZIZ;
                        long jLJ2 = (LJ(25, jLIZIZ) + jLIZIZ2) * j2;
                        long j5 = (jLJ ^ jLJ2) * j2;
                        j3 = ((j5 ^ (j5 >>> 47)) ^ jLJ2) * j2;
                        j4 = j3 >>> 47;
                    } else if (length2 >= 4) {
                        long j6 = ((long) (length2 * 2)) - 7286425919675154353L;
                        long jLIZ = ((((long) LIZ(0, bytes)) & 4294967295L) << 3) + ((long) length2);
                        long jLIZ2 = ((long) LIZ(length2 - 4, bytes)) & 4294967295L;
                        long j7 = (jLIZ ^ jLIZ2) * j6;
                        long j8 = (jLIZ2 ^ (j7 ^ (j7 >>> 47))) * j6;
                        jLIZLLL = (j8 ^ (j8 >>> 47)) * j6;
                    } else if (length2 > 0) {
                        long j9 = (((long) (length2 + ((bytes[length2 - 1] & 255) << 2))) * (-4348849565147123417L)) ^ (((long) ((bytes[0] & 255) + ((bytes[length2 >>> 1] & 255) << 8))) * (-7286425919675154353L));
                        jLIZLLL = (-7286425919675154353L) * (j9 ^ (j9 >>> 47));
                    }
                } else {
                    int length3 = bytes.length;
                    j2 = ((long) (length3 * 2)) - 7286425919675154353L;
                    long jLIZIZ3 = LIZIZ(0, bytes) * (-5435081209227447693L);
                    long jLIZIZ4 = LIZIZ(8, bytes);
                    long jLIZIZ5 = LIZIZ(length3 - 8, bytes) * j2;
                    long jLJ3 = LJ(43, jLIZIZ3 + jLIZIZ4) + LJ(30, jLIZIZ5) + (LIZIZ(length3 - 16, bytes) * (-7286425919675154353L));
                    long jLJ4 = jLIZIZ3 + LJ(18, jLIZIZ4 - 7286425919675154353L) + jLIZIZ5;
                    long j10 = (jLJ3 ^ jLJ4) * j2;
                    j3 = ((j10 ^ (j10 >>> 47)) ^ jLJ4) * j2;
                    j4 = j3 >>> 47;
                }
                jLIZLLL = (j3 ^ j4) * j2;
            } else if (length <= 64) {
                int length4 = bytes.length;
                long j11 = ((long) (length4 * 2)) - 7286425919675154353L;
                long jLIZIZ6 = LIZIZ(0, bytes) * (-7286425919675154353L);
                long jLIZIZ7 = LIZIZ(8, bytes);
                long jLIZIZ8 = LIZIZ(length4 - 24, bytes);
                long jLIZIZ9 = LIZIZ(length4 - 32, bytes);
                long jLIZIZ10 = LIZIZ(16, bytes) * (-7286425919675154353L);
                long jLIZIZ11 = LIZIZ(24, bytes) * 9;
                long jLIZIZ12 = LIZIZ(length4 - 8, bytes);
                long jLIZIZ13 = LIZIZ(length4 - 16, bytes) * j11;
                long j12 = jLIZIZ6 + jLIZIZ12;
                long jLJ5 = LJ(43, j12) + ((LJ(30, jLIZIZ7) + jLIZIZ8) * 9);
                long j13 = (j12 ^ jLIZIZ9) + jLIZIZ11 + 1;
                long jReverseBytes = Long.reverseBytes((jLJ5 + j13) * j11) + jLIZIZ13;
                long j14 = jLIZIZ10 + jLIZIZ11;
                long jLJ6 = LJ(42, j14) + jLIZIZ8;
                long j15 = j14 + jLIZIZ8;
                long jReverseBytes2 = ((j15 + Long.reverseBytes(((jLJ6 + j15) * j11) + ((Long.reverseBytes((j13 + jReverseBytes) * j11) + jLIZIZ12) * j11)) + jLIZIZ7) * j11) + jLIZIZ9 + jLIZIZ13;
                long j16 = (jReverseBytes2 >>> 47) ^ jReverseBytes2;
                Long.signum(j16);
                jLIZLLL = (j16 * j11) + jLJ6;
            } else {
                long jLIZIZ14 = LIZIZ(length - 40, bytes);
                long jLIZIZ15 = LIZIZ(length - 16, bytes) + LIZIZ(length - 56, bytes);
                long j17 = length;
                long jLIZLLL2 = LIZLLL(LIZIZ(length - 48, bytes) + j17, LIZIZ(length - 24, bytes));
                C13KP c13kpLJFF = LJFF(length - 64, j17, jLIZLLL2, bytes);
                C13KP c13kpLJFF2 = LJFF(length - 32, jLIZIZ15 - 5435081209227447693L, jLIZIZ14, bytes);
                long jLIZIZ16 = (jLIZIZ14 * (-5435081209227447693L)) + LIZIZ(0, bytes);
                int i2 = (length - 1) & (-64);
                while (true) {
                    long jLJ7 = LJ(37, jLIZIZ16 + jLIZIZ15 + c13kpLJFF.LIZ + LIZIZ(i + 8, bytes)) * (-5435081209227447693L);
                    long jLJ8 = LJ(42, jLIZIZ15 + c13kpLJFF.LIZIZ + LIZIZ(i + 48, bytes)) * (-5435081209227447693L);
                    j = c13kpLJFF2.LIZIZ ^ jLJ7;
                    jLIZIZ15 = jLJ8 + c13kpLJFF.LIZ + LIZIZ(i + 40, bytes);
                    jLIZIZ16 = LJ(33, jLIZLLL2 + c13kpLJFF2.LIZ) * (-5435081209227447693L);
                    c13kpLJFF = LJFF(i, c13kpLJFF.LIZIZ * (-5435081209227447693L), c13kpLJFF2.LIZ + j, bytes);
                    c13kpLJFF2 = LJFF(i + 32, jLIZIZ16 + c13kpLJFF2.LIZIZ, jLIZIZ15 + LIZIZ(i + 16, bytes), bytes);
                    i += 64;
                    i2 -= 64;
                    if (i2 == 0) {
                        break;
                    }
                    jLIZLLL2 = j;
                }
                long jLIZLLL3 = LIZLLL(c13kpLJFF.LIZ, c13kpLJFF2.LIZ);
                long j18 = jLIZIZ15 ^ (jLIZIZ15 >>> 47);
                Long.signum(j18);
                jLIZLLL = LIZLLL(jLIZLLL3 + (j18 * (-5435081209227447693L)) + j, LIZLLL(c13kpLJFF.LIZIZ, c13kpLJFF2.LIZIZ) + jLIZIZ16);
            }
            if (jLIZLLL >= 0) {
                return BigInteger.valueOf(jLIZLLL);
            }
            return BigInteger.valueOf(jLIZLLL & Long.MAX_VALUE).add(BigInteger.valueOf(Long.MAX_VALUE)).add(BigInteger.valueOf(1L));
        } catch (UnsupportedEncodingException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    public static int LIZ(int i, byte[] bArr) {
        C13KO c13ko = new C13KO(4, LIZ);
        int i2 = 0;
        while (true) {
            int i3 = c13ko.LIZJ;
            int i4 = c13ko.LIZ;
            if (i3 < i4) {
                if (!c13ko.LIZIZ) {
                    c13ko.LIZJ = i3 + 1;
                } else {
                    c13ko.LIZJ = i3 + 1;
                    i3 = (i4 - 1) - i3;
                }
                i2 |= (bArr[i3 + i] & 255) << (i3 * 8);
            } else {
                return i2;
            }
        }
    }

    public static long LIZIZ(int i, byte[] bArr) {
        C13KO c13ko = new C13KO(8, LIZ);
        long j = 0;
        while (true) {
            int i2 = c13ko.LIZJ;
            int i3 = c13ko.LIZ;
            if (i2 < i3) {
                if (!c13ko.LIZIZ) {
                    c13ko.LIZJ = i2 + 1;
                } else {
                    c13ko.LIZJ = i2 + 1;
                    i2 = (i3 - 1) - i2;
                }
                j |= (((long) bArr[i2 + i]) & 255) << (i2 * 8);
            } else {
                return j;
            }
        }
    }

    public static long LIZLLL(long j, long j2) {
        long j3 = (j ^ j2) * (-7070675565921424023L);
        long j4 = ((j3 ^ (j3 >>> 47)) ^ j2) * (-7070675565921424023L);
        return (j4 ^ (j4 >>> 47)) * (-7070675565921424023L);
    }

    public static C13KP LJFF(int i, long j, long j2, byte[] bArr) {
        long jLIZIZ = LIZIZ(i, bArr);
        long jLIZIZ2 = LIZIZ(i + 8, bArr);
        long jLIZIZ3 = LIZIZ(i + 16, bArr);
        long jLIZIZ4 = LIZIZ(i + 24, bArr);
        long j3 = j + jLIZIZ;
        long j4 = jLIZIZ2 + j3 + jLIZIZ3;
        return new C13KP(j4 + jLIZIZ4, LJ(21, j2 + j3 + jLIZIZ4) + LJ(44, j4) + j3);
    }
}
