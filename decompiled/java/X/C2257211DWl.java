package X;

/* JADX INFO: renamed from: X.1DWl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2257211DWl {
    public final String LIZ;
    public int LIZIZ;
    public final int LIZJ;
    public final C1DXI LIZLLL = new C1DXI();

    public static boolean LJFF(int i) {
        return i == 32 || i == 10 || i == 13 || i == 9;
    }

    public final int LIZ() {
        int i = this.LIZIZ;
        int i2 = this.LIZJ;
        if (i == i2) {
            return -1;
        }
        int i3 = i + 1;
        this.LIZIZ = i3;
        if (i3 < i2) {
            return this.LIZ.charAt(i3);
        }
        return -1;
    }

    public final boolean LJ() {
        return this.LIZIZ == this.LIZJ;
    }

    public final float LJI() {
        float fLIZ = this.LIZLLL.LIZ(this.LIZIZ, this.LIZJ, this.LIZ);
        if (!Float.isNaN(fLIZ)) {
            this.LIZIZ = this.LIZLLL.LIZ;
        }
        return fLIZ;
    }

    public final void LJIIJJI() {
        while (true) {
            int i = this.LIZIZ;
            if (i >= this.LIZJ || !LJFF(this.LIZ.charAt(i))) {
                return;
            } else {
                this.LIZIZ++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0064 A[Catch: IllegalArgumentException -> 0x007f, TRY_LEAVE, TryCatch #0 {IllegalArgumentException -> 0x007f, blocks: (B:17:0x003a, B:19:0x004a, B:20:0x0053, B:22:0x005b, B:23:0x0064), top: B:29:0x003a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2257141DWe LJII() {
        /*
            r4 = this;
            float r3 = r4.LJI()
            boolean r1 = java.lang.Float.isNaN(r3)
            r0 = 0
            if (r1 == 0) goto Lc
            return r0
        Lc:
            boolean r0 = r4.LJ()
            if (r0 != 0) goto L83
            java.lang.String r1 = r4.LIZ
            int r0 = r4.LIZIZ
            char r1 = r1.charAt(r0)
            r0 = 37
            if (r1 != r0) goto L2e
            int r0 = r4.LIZIZ
            int r0 = r0 + 1
            r4.LIZIZ = r0
            X.1DWq r1 = X.EnumC2257261DWq.percent
        L26:
            if (r1 == 0) goto L83
            X.1DWe r0 = new X.1DWe
            r0.<init>(r3, r1)
            return r0
        L2e:
            int r2 = r4.LIZIZ
            int r1 = r4.LIZJ
            int r0 = r1 + (-2)
            if (r2 > r0) goto L83
            int r0 = r1 + (-3)
            if (r2 > r0) goto L64
            java.lang.String r1 = r4.LIZ     // Catch: java.lang.IllegalArgumentException -> L7f
            int r0 = r2 + 3
            java.lang.String r1 = r1.substring(r2, r0)     // Catch: java.lang.IllegalArgumentException -> L7f
            java.lang.String r0 = "rem"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.IllegalArgumentException -> L7f
            if (r0 == 0) goto L53
            int r0 = r4.LIZIZ     // Catch: java.lang.IllegalArgumentException -> L7f
            int r0 = r0 + 3
            r4.LIZIZ = r0     // Catch: java.lang.IllegalArgumentException -> L7f
            X.1DWq r1 = X.EnumC2257261DWq.rem     // Catch: java.lang.IllegalArgumentException -> L7f
            goto L26
        L53:
            java.lang.String r0 = "rpx"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.IllegalArgumentException -> L7f
            if (r0 == 0) goto L64
            int r0 = r4.LIZIZ     // Catch: java.lang.IllegalArgumentException -> L7f
            int r0 = r0 + 3
            r4.LIZIZ = r0     // Catch: java.lang.IllegalArgumentException -> L7f
            X.1DWq r1 = X.EnumC2257261DWq.rpx     // Catch: java.lang.IllegalArgumentException -> L7f
            goto L26
        L64:
            java.lang.String r2 = r4.LIZ     // Catch: java.lang.IllegalArgumentException -> L7f
            int r1 = r4.LIZIZ     // Catch: java.lang.IllegalArgumentException -> L7f
            int r0 = r1 + 2
            java.lang.String r1 = r2.substring(r1, r0)     // Catch: java.lang.IllegalArgumentException -> L7f
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.IllegalArgumentException -> L7f
            java.lang.String r0 = r1.toLowerCase(r0)     // Catch: java.lang.IllegalArgumentException -> L7f
            X.1DWq r1 = X.EnumC2257261DWq.valueOf(r0)     // Catch: java.lang.IllegalArgumentException -> L7f
            int r0 = r4.LIZIZ     // Catch: java.lang.IllegalArgumentException -> L7f
            int r0 = r0 + 2
            r4.LIZIZ = r0     // Catch: java.lang.IllegalArgumentException -> L7f
            goto L26
        L7f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L83:
            X.1DWe r1 = new X.1DWe
            X.1DWq r0 = X.EnumC2257261DWq.px
            r1.<init>(r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2257211DWl.LJII():X.1DWe");
    }

    public final String LJIIIIZZ() {
        if (LJ()) {
            return null;
        }
        char cCharAt = this.LIZ.charAt(this.LIZIZ);
        if (LJFF(cCharAt) || cCharAt == ' ') {
            return null;
        }
        int i = this.LIZIZ;
        int iLIZ = LIZ();
        while (iLIZ != -1 && iLIZ != 32 && !LJFF(iLIZ)) {
            iLIZ = LIZ();
        }
        return this.LIZ.substring(i, this.LIZIZ);
    }

    public final float LJIIIZ() {
        LJIIJ();
        float fLIZ = this.LIZLLL.LIZ(this.LIZIZ, this.LIZJ, this.LIZ);
        if (!Float.isNaN(fLIZ)) {
            this.LIZIZ = this.LIZLLL.LIZ;
        }
        return fLIZ;
    }

    public final void LJIIJ() {
        LJIIJJI();
        int i = this.LIZIZ;
        if (i != this.LIZJ && this.LIZ.charAt(i) == ',') {
            this.LIZIZ++;
            LJIIJJI();
        }
    }

    public C2257211DWl(String str) {
        String strTrim = str.trim();
        this.LIZ = strTrim;
        this.LIZJ = strTrim.length();
    }

    public final Boolean LIZIZ(Object obj) {
        if (obj == null) {
            return null;
        }
        LJIIJ();
        int i = this.LIZIZ;
        if (i == this.LIZJ) {
            return null;
        }
        char cCharAt = this.LIZ.charAt(i);
        if (cCharAt != '0' && cCharAt != '1') {
            return null;
        }
        boolean z = true;
        this.LIZIZ++;
        if (cCharAt != '1') {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final float LIZJ(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        LJIIJ();
        return LJI();
    }

    public final boolean LIZLLL(char c) {
        int i = this.LIZIZ;
        if (i < this.LIZJ && this.LIZ.charAt(i) == c) {
            this.LIZIZ++;
            return true;
        }
        return false;
    }
}
