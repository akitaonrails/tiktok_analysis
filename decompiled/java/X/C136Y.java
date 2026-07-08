package X;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: renamed from: X.136Y, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C136Y {
    public static final byte[] LIZJ;
    public static final byte[] LIZ = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};
    public static final byte[] LIZIZ = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};
    public static final byte[] LIZLLL = new byte[128];
    public static final Charset LJ = StandardCharsets.ISO_8859_1;

    public static boolean LIZLLL(char c) {
        if (c != ' ') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    public static boolean LJ(char c) {
        if (c != ' ') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    static {
        byte[] bArr = new byte[128];
        LIZJ = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = LIZ;
            if (i2 >= bArr2.length) {
                break;
            }
            byte b = bArr2[i2];
            if (b > 0) {
                LIZJ[b] = (byte) i2;
            }
            i2++;
        }
        Arrays.fill(LIZLLL, (byte) -1);
        while (true) {
            byte[] bArr3 = LIZIZ;
            if (i >= bArr3.length) {
                return;
            }
            byte b2 = bArr3[i];
            if (b2 > 0) {
                LIZLLL[b2] = (byte) i;
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000d A[LOOP:0: B:7:0x000b->B:8:0x000d, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(byte[] r12, int r13, int r14, java.lang.StringBuilder r15) {
        /*
            r0 = 1
            if (r13 != r0) goto L18
            if (r14 != 0) goto L18
            r0 = 913(0x391, float:1.28E-42)
            r15.append(r0)
        La:
            r6 = 0
        Lb:
            if (r6 >= r13) goto L5f
            r0 = r12[r6]
            r0 = r0 & 255(0xff, float:3.57E-43)
            char r0 = (char) r0
            r15.append(r0)
            int r6 = r6 + 1
            goto Lb
        L18:
            int r0 = r13 % 6
            if (r0 != 0) goto L59
            r0 = 924(0x39c, float:1.295E-42)
            r15.append(r0)
        L21:
            r5 = 6
            if (r13 < r5) goto La
            r4 = 5
            char[] r3 = new char[r4]
            r6 = 0
        L28:
            int r0 = r13 - r6
            if (r0 < r5) goto Lb
            r10 = 0
            r2 = 0
        L2f:
            r0 = 8
            long r10 = r10 << r0
            int r0 = r6 + r2
            r0 = r12[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            long r0 = (long) r0
            long r10 = r10 + r0
            int r2 = r2 + 1
            if (r2 < r5) goto L2f
            r9 = 0
        L3f:
            r7 = 900(0x384, double:4.447E-321)
            long r1 = r10 % r7
            int r0 = (int) r1
            char r0 = (char) r0
            r3[r9] = r0
            long r10 = r10 / r7
            int r9 = r9 + 1
            if (r9 < r4) goto L3f
            r1 = 4
        L4d:
            char r0 = r3[r1]
            r15.append(r0)
            int r1 = r1 + (-1)
            if (r1 >= 0) goto L4d
            int r6 = r6 + 6
            goto L28
        L59:
            r0 = 901(0x385, float:1.263E-42)
            r15.append(r0)
            goto L21
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136Y.LIZ(byte[], int, int, java.lang.StringBuilder):void");
    }

    public static void LIZIZ(int i, int i2, String str, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i2 / 3) + 1);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(0L);
        int i3 = 0;
        while (i3 < i2) {
            sb2.setLength(0);
            int iMin = Math.min(44, i2 - i3);
            StringBuilder sb3 = new StringBuilder("1");
            int i4 = i + i3;
            sb3.append(str.substring(i4, i4 + iMin));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(bigIntegerValueOf).intValue());
                bigInteger = bigInteger.divide(bigIntegerValueOf);
            } while (!bigInteger.equals(bigIntegerValueOf2));
            int length = sb2.length();
            while (true) {
                length--;
                if (length >= 0) {
                    sb.append(sb2.charAt(length));
                }
            }
            i3 += iMin;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x002d A[EDGE_INSN: B:70:0x002d->B:12:0x002d BREAK  A[LOOP:0: B:3:0x0008->B:93:0x0008], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0008 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZJ(java.lang.CharSequence r13, int r14, int r15, java.lang.StringBuilder r16, int r17) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136Y.LIZJ(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }
}
