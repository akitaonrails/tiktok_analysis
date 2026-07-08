package X;

/* JADX INFO: renamed from: X.0tsk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1682400tsk {
    public static long LIZJ(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (i2 < 0) {
            z2 = false;
        }
        if (!(z2 & z)) {
            C1682410tsl.LIZ("width and height must be >= 0");
        }
        return C1682390tsj.LJII(i, i, i2, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long LIZ(int r6, int r7, int r8, int r9) {
        /*
            r5 = 262142(0x3fffe, float:3.67339E-40)
            int r4 = java.lang.Math.min(r8, r5)
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r9 != r3) goto L3a
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lf:
            r1 = r4
        L10:
            r0 = 8191(0x1fff, float:1.1478E-41)
            if (r1 < r0) goto L1b
            r0 = 32767(0x7fff, float:4.5916E-41)
            if (r1 >= r0) goto L2a
            r5 = 65534(0xfffe, float:9.1833E-41)
        L1b:
            if (r7 == r3) goto L21
            int r3 = java.lang.Math.min(r5, r7)
        L21:
            int r0 = java.lang.Math.min(r5, r6)
            long r0 = X.C1682390tsj.LIZ(r0, r3, r4, r2)
            return r0
        L2a:
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r1 >= r0) goto L32
            r5 = 32766(0x7ffe, float:4.5915E-41)
            goto L1b
        L32:
            r0 = 262143(0x3ffff, float:3.6734E-40)
            if (r1 >= r0) goto L42
            r5 = 8190(0x1ffe, float:1.1477E-41)
            goto L1b
        L3a:
            int r2 = java.lang.Math.min(r9, r5)
            if (r2 == r3) goto Lf
            r1 = r2
            goto L10
        L42:
            X.C1682390tsj.LJIIJ(r1)
            X.08jB r0 = new X.08jB
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1682400tsk.LIZ(int, int, int, int):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long LIZIZ(int r6, int r7, int r8, int r9) {
        /*
            r5 = 262142(0x3fffe, float:3.67339E-40)
            int r4 = java.lang.Math.min(r6, r5)
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r7 != r3) goto L3a
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lf:
            r1 = r4
        L10:
            r0 = 8191(0x1fff, float:1.1478E-41)
            if (r1 < r0) goto L1b
            r0 = 32767(0x7fff, float:4.5916E-41)
            if (r1 >= r0) goto L2a
            r5 = 65534(0xfffe, float:9.1833E-41)
        L1b:
            if (r9 == r3) goto L21
            int r3 = java.lang.Math.min(r5, r9)
        L21:
            int r0 = java.lang.Math.min(r5, r8)
            long r0 = X.C1682390tsj.LIZ(r4, r2, r0, r3)
            return r0
        L2a:
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r1 >= r0) goto L32
            r5 = 32766(0x7ffe, float:4.5915E-41)
            goto L1b
        L32:
            r0 = 262143(0x3ffff, float:3.6734E-40)
            if (r1 >= r0) goto L42
            r5 = 8190(0x1ffe, float:1.1477E-41)
            goto L1b
        L3a:
            int r2 = java.lang.Math.min(r7, r5)
            if (r2 == r3) goto Lf
            r1 = r2
            goto L10
        L42:
            X.C1682390tsj.LJIIJ(r1)
            X.08jB r0 = new X.08jB
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1682400tsk.LIZIZ(int, int, int, int):long");
    }
}
