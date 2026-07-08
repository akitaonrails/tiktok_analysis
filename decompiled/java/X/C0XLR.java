package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0XLR, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XLR {
    public static final char[] LIZ = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String LIZIZ(String str, boolean z, String str2, boolean z2) {
        return LIZ(str, 0, str.length(), str2, false, z, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(int r8, int r9, java.lang.String r10, boolean r11) {
        /*
            r6 = r8
        L1:
            if (r6 >= r9) goto L5f
            char r0 = r10.charAt(r6)
            r5 = 43
            r4 = 37
            if (r0 == r4) goto L11
            if (r0 != r5) goto L57
            if (r11 == 0) goto L57
        L11:
            X.0p3D r3 = new X.0p3D
            r3.<init>()
            r3.LJLJI(r8, r6, r10)
        L19:
            if (r6 >= r9) goto L5a
            int r7 = r10.codePointAt(r6)
            if (r7 != r4) goto L49
            int r8 = r6 + 2
            if (r8 >= r9) goto L53
            int r0 = r6 + 1
            char r0 = r10.charAt(r0)
            int r2 = xlp.c.LJI(r0)
            char r0 = r10.charAt(r8)
            int r1 = xlp.c.LJI(r0)
            r0 = -1
            if (r2 == r0) goto L53
            if (r1 == r0) goto L53
            int r0 = r2 << 4
            int r0 = r0 + r1
            r3.LJJJZ(r0)
            r6 = r8
        L43:
            int r0 = java.lang.Character.charCount(r7)
            int r6 = r6 + r0
            goto L19
        L49:
            if (r7 != r5) goto L53
            if (r11 == 0) goto L53
            r0 = 32
            r3.LJJJZ(r0)
            goto L43
        L53:
            r3.LJLJL(r7)
            goto L43
        L57:
            int r6 = r6 + 1
            goto L1
        L5a:
            java.lang.String r0 = r3.LJJIZ()
            return r0
        L5f:
            java.lang.String r0 = r10.substring(r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XLR.LIZJ(int, int, java.lang.String, boolean):java.lang.String");
    }

    public static String LIZ(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3) {
        String str3;
        int iCharCount = i;
        while (iCharCount < i2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && z3) || str2.indexOf(iCodePointAt) != -1 || ((iCodePointAt == 37 && !z) || (iCodePointAt == 43 && z2)))) {
                C1496690p3D c1496690p3D = new C1496690p3D();
                c1496690p3D.LJLJI(i, iCharCount, str);
                C1496690p3D c1496690p3D2 = null;
                while (iCharCount < i2) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z2) {
                            if (z) {
                                str3 = "+";
                            } else {
                                str3 = "%2B";
                            }
                            c1496690p3D.LJLJJLL(str3);
                        } else if (iCodePointAt2 >= 32 && iCodePointAt2 != 127 && ((iCodePointAt2 < 128 || !z3) && str2.indexOf(iCodePointAt2) == -1 && (iCodePointAt2 != 37 || z))) {
                            c1496690p3D.LJLJL(iCodePointAt2);
                        } else {
                            if (c1496690p3D2 == null) {
                                c1496690p3D2 = new C1496690p3D();
                            }
                            c1496690p3D2.LJLJL(iCodePointAt2);
                            while (!c1496690p3D2.LJJJJLL()) {
                                try {
                                    int i3 = c1496690p3D2.readByte() & 255;
                                    c1496690p3D.LJJJZ(37);
                                    char[] cArr = LIZ;
                                    c1496690p3D.LJJJZ(cArr[(i3 >> 4) & 15]);
                                    c1496690p3D.LJJJZ(cArr[i3 & 15]);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw new RuntimeException(th);
                                }
                            }
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                }
                return c1496690p3D.LJJIZ();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i, i2);
    }
}
