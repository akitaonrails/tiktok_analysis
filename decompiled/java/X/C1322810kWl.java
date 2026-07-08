package X;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: X.0kWl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1322810kWl {
    public static final C1322820kWm LIZ;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0kWm] */
    static {
        Unsafe unsafe = C19906212ua.LIZ;
        LIZ = new AbstractC1322830kWn() { // from class: X.0kWm
        };
    }

    public static int LIZIZ(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt < 2048) {
                i3 += (127 - cCharAt) >>> 31;
                i2++;
            } else {
                int length2 = str.length();
                while (i2 < length2) {
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new C1318010kP1(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i3) + 4294967296L));
    }

    public static /* synthetic */ int LIZ(int i, byte[] bArr, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    byte b2 = bArr[i];
                    byte b3 = bArr[i + 1];
                    if (b > -12 || b2 > -65 || b3 > -65) {
                        return -1;
                    }
                    return (b3 << 16) ^ ((b2 << 8) ^ b);
                }
                throw new AssertionError();
            }
            byte b4 = bArr[i];
            if (b > -12 || b4 > -65) {
                return -1;
            }
            return (b4 << 8) ^ b;
        }
        if (b > -12) {
            return -1;
        }
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0013 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZLLL(int r9, byte[] r10, int r11) {
        /*
            X.0kWm r0 = X.C1322810kWl.LIZ
            r0.getClass()
        L5:
            if (r9 >= r11) goto Le
            r0 = r10[r9]
            if (r0 < 0) goto Le
            int r9 = r9 + 1
            goto L5
        Le:
            r8 = 0
            if (r9 < r11) goto L13
        L11:
            r0 = 1
            return r0
        L13:
            if (r9 >= r11) goto L11
            int r7 = r9 + 1
            r6 = r10[r9]
            if (r6 >= 0) goto L7c
            r5 = -32
            r3 = -65
            if (r6 >= r5) goto L2e
            if (r7 >= r11) goto L2d
            r0 = -62
            if (r6 < r0) goto L2d
            int r9 = r7 + 1
            r0 = r10[r7]
            if (r0 <= r3) goto L13
        L2d:
            return r8
        L2e:
            r0 = -16
            if (r6 >= r0) goto L3d
            int r0 = r11 + (-1)
            if (r7 < r0) goto L46
            int r0 = LIZ(r7, r10, r11)
        L3a:
            if (r0 != 0) goto L2d
            goto L11
        L3d:
            int r0 = r11 + (-2)
            if (r7 < r0) goto L60
            int r0 = LIZ(r7, r10, r11)
            goto L3a
        L46:
            int r4 = r7 + 1
            r2 = r10[r7]
            if (r2 > r3) goto L2d
            r1 = -96
            if (r6 != r5) goto L59
            if (r2 < r1) goto L2d
        L52:
            int r9 = r4 + 1
            r0 = r10[r4]
            if (r0 <= r3) goto L13
            return r8
        L59:
            r0 = -19
            if (r6 != r0) goto L52
            if (r2 >= r1) goto L2d
            goto L52
        L60:
            int r2 = r7 + 1
            r0 = r10[r7]
            if (r0 > r3) goto L2d
            int r1 = r6 << 28
            int r0 = r0 + 112
            int r1 = r1 + r0
            int r0 = r1 >> 30
            if (r0 != 0) goto L2d
            int r1 = r2 + 1
            r0 = r10[r2]
            if (r0 > r3) goto L2d
            int r7 = r1 + 1
            r0 = r10[r1]
            if (r0 <= r3) goto L7c
            return r8
        L7c:
            r9 = r7
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1322810kWl.LIZLLL(int, byte[], int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZJ(java.lang.String r7, int r8, int r9, byte[] r10) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1322810kWl.LIZJ(java.lang.String, int, int, byte[]):int");
    }
}
