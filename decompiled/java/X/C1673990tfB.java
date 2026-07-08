package X;

/* JADX INFO: renamed from: X.0tfB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1673990tfB {
    public static final int LIZ(long j) {
        int i;
        if (Math.abs(Float.intBitsToFloat((int) (j >> 32))) >= 0.5f) {
            i = 1;
        } else {
            i = 0;
        }
        if (Math.abs(Float.intBitsToFloat((int) (j & 4294967295L))) >= 0.5f) {
            return i | 2;
        }
        return i;
    }

    public static final int LIZJ(float f) {
        double dFloor;
        if (f >= 0.0f) {
            dFloor = Math.ceil(f);
        } else {
            dFloor = Math.floor(f);
        }
        return -((int) dFloor);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C20087113if LIZLLL(X.InterfaceC1680500tpg r3) {
        /*
            X.13DR r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.LJFF
            java.lang.Object r2 = r3.LJJIL(r0)
            android.view.View r2 = (android.view.View) r2
            boolean r0 = r3.LJJIIJ(r2)
            java.lang.Object r1 = r3.LJJ()
            if (r0 != 0) goto L1b
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L23
        L1b:
            X.13if r1 = new X.13if
            r1.<init>(r2)
            r3.LJJIJIIJI(r1)
        L23:
            X.13if r1 = (X.C20087113if) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1673990tfB.LIZLLL(X.0tpg):X.13if");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a A[PHI: r1
      0x003a: PHI (r1v4 float) = (r1v3 float), (r1v5 float) binds: [B:15:0x0053, B:10:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001d A[PHI: r1
      0x001d: PHI (r1v6 float) = (r1v1 float), (r1v7 float) binds: [B:18:0x0060, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long LIZIZ(long r9, int[] r11) {
        /*
            r8 = 32
            long r0 = r9 >> r8
            int r2 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r2)
            r4 = 0
            int r1 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            r0 = 0
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 < 0) goto L56
            r0 = r11[r0]
            float r3 = (float) r0
            float r3 = r3 * r7
            float r1 = java.lang.Float.intBitsToFloat(r2)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L1e
        L1d:
            r3 = r1
        L1e:
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r5
            int r2 = (int) r9
            float r0 = java.lang.Float.intBitsToFloat(r2)
            int r1 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L49
            r0 = r11[r0]
            float r4 = (float) r0
            float r4 = r4 * r7
            float r1 = java.lang.Float.intBitsToFloat(r2)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3b
        L3a:
            r4 = r1
        L3b:
            int r0 = java.lang.Float.floatToRawIntBits(r3)
            long r2 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r4)
            long r0 = (long) r0
            long r2 = r2 << r8
            long r0 = r0 & r5
            long r0 = r0 | r2
            return r0
        L49:
            r0 = r11[r0]
            float r4 = (float) r0
            float r4 = r4 * r7
            float r1 = java.lang.Float.intBitsToFloat(r2)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L3b
            goto L3a
        L56:
            r0 = r11[r0]
            float r3 = (float) r0
            float r3 = r3 * r7
            float r1 = java.lang.Float.intBitsToFloat(r2)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L1e
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1673990tfB.LIZIZ(long, int[]):long");
    }
}
