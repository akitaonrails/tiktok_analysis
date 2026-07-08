package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.11Tq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19507211Tq {
    public final String LIZ;
    public final char[] LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final byte[] LJI;
    public final boolean LJII;

    public final String toString() {
        return this.LIZ;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.LIZIZ) + (true != this.LJII ? 1237 : 1231);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C19507211Tq) {
            C19507211Tq c19507211Tq = (C19507211Tq) obj;
            if (this.LJII == c19507211Tq.LJII && Arrays.equals(this.LIZIZ, c19507211Tq.LIZIZ)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C19507211Tq(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            if (c < 128) {
                if (bArr[c] == -1) {
                    bArr[c] = (byte) i;
                } else {
                    throw new IllegalArgumentException(C08KQ.LIZ("Duplicate character: %s", Character.valueOf(c)));
                }
            } else {
                throw new IllegalArgumentException(C08KQ.LIZ("Non-ASCII character: %s", Character.valueOf(c)));
            }
        }
        this(str, cArr, bArr, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0065 A[LOOP:0: B:18:0x0061->B:20:0x0065, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C19507211Tq(java.lang.String r7, char[] r8, byte[] r9, boolean r10) {
        /*
            r6 = this;
            r6.<init>()
            r6.LIZ = r7
            r8.getClass()
            r6.LIZIZ = r8
            int r5 = r8.length     // Catch: java.lang.ArithmeticException -> L7c
            java.math.RoundingMode r0 = java.math.RoundingMode.UNNECESSARY     // Catch: java.lang.ArithmeticException -> L7c
            if (r5 <= 0) goto L74
            int[] r1 = X.C19376110rH.LIZ     // Catch: java.lang.ArithmeticException -> L7c
            int r0 = r0.ordinal()     // Catch: java.lang.ArithmeticException -> L7c
            r0 = r1[r0]     // Catch: java.lang.ArithmeticException -> L7c
            r4 = 1
            r3 = 0
            switch(r0) {
                case 1: goto L3a;
                case 2: goto L47;
                case 3: goto L47;
                case 4: goto L31;
                case 5: goto L31;
                case 6: goto L22;
                case 7: goto L22;
                case 8: goto L22;
                default: goto L1c;
            }     // Catch: java.lang.ArithmeticException -> L7c
        L1c:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.ArithmeticException -> L7c
            r0.<init>()     // Catch: java.lang.ArithmeticException -> L7c
            throw r0     // Catch: java.lang.ArithmeticException -> L7c
        L22:
            int r1 = java.lang.Integer.numberOfLeadingZeros(r5)     // Catch: java.lang.ArithmeticException -> L7c
            r0 = -1257966797(0xffffffffb504f333, float:-4.9527733E-7)
            int r0 = r0 >>> r1
            int r2 = 31 - r1
            int r0 = r0 - r5
            int r0 = r0 >>> 31
            int r2 = r2 + r0
            goto L4d
        L31:
            int r0 = r5 + (-1)
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)     // Catch: java.lang.ArithmeticException -> L7c
            int r2 = 32 - r0
            goto L4d
        L3a:
            int r0 = r5 + (-1)
            r0 = r0 & r5
            if (r0 == 0) goto L47
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException     // Catch: java.lang.ArithmeticException -> L7c
            java.lang.String r0 = "mode was UNNECESSARY, but rounding was necessary"
            r1.<init>(r0)     // Catch: java.lang.ArithmeticException -> L7c
            throw r1     // Catch: java.lang.ArithmeticException -> L7c
        L47:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r5)     // Catch: java.lang.ArithmeticException -> L7c
            int r2 = 31 - r0
        L4d:
            r6.LIZLLL = r2     // Catch: java.lang.ArithmeticException -> L7c
            int r1 = java.lang.Integer.numberOfTrailingZeros(r2)
            int r0 = 3 - r1
            int r4 = r4 << r0
            r6.LJ = r4
            int r2 = r2 >> r1
            r6.LJFF = r2
            int r0 = r5 + (-1)
            r6.LIZJ = r0
            r6.LJI = r9
        L61:
            int r0 = r6.LJFF
            if (r3 >= r0) goto L71
            int r2 = r3 * 8
            int r1 = r6.LIZLLL
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            X.C11EZ.LIZ(r2, r1, r0)
            int r3 = r3 + 1
            goto L61
        L71:
            r6.LJII = r10
            return
        L74:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.ArithmeticException -> L7c
            java.lang.String r0 = "x (0) must be > 0"
            r1.<init>(r0)     // Catch: java.lang.ArithmeticException -> L7c
            throw r1     // Catch: java.lang.ArithmeticException -> L7c
        L7c:
            r4 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r4)
            int r3 = r8.length
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Illegal alphabet length "
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r2.<init>(r0, r4)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19507211Tq.<init>(java.lang.String, char[], byte[], boolean):void");
    }
}
