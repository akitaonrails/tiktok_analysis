package X;

/* JADX INFO: renamed from: X.0kIO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313900kIO {
    public float LIZ;
    public float LIZIZ;
    public C1314110kIj[] LIZJ;
    public float[] LIZLLL;

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float[] LIZ() {
        /*
            r11 = this;
            float[] r0 = r11.LIZLLL
            if (r0 == 0) goto L5
            return r0
        L5:
            r5 = 8
            float[] r10 = new float[r5]
            X.0kIj[] r0 = r11.LIZJ
            r8 = 4
            r4 = 0
            r6 = 0
            if (r0 != 0) goto L18
            r0 = 0
        L11:
            r10[r0] = r6
            int r0 = r0 + 1
            if (r0 >= r5) goto L43
            goto L11
        L18:
            r9 = 0
        L19:
            X.0kIj[] r0 = r11.LIZJ
            r7 = r0[r9]
            int r3 = r9 * 2
            int r2 = r3 + 1
            if (r7 == 0) goto L3e
            X.0kII r1 = r7.LIZ
            if (r1 == 0) goto L3e
            float r0 = r11.LIZ
            float r0 = r1.LIZIZ(r0)
            r10[r3] = r0
            X.0kII r1 = r7.LIZIZ
            float r0 = r11.LIZIZ
            float r0 = r1.LIZIZ(r0)
            r10[r2] = r0
        L39:
            int r9 = r9 + 1
            if (r9 >= r8) goto L43
            goto L19
        L3e:
            r10[r2] = r6
            r10[r3] = r6
            goto L39
        L43:
            r11.LIZLLL = r10
            float r0 = r11.LIZ
            boolean r0 = X.C1314000kIY.LIZ(r0, r6)
            if (r0 != 0) goto Lb1
            float r0 = r11.LIZIZ
            boolean r0 = X.C1314000kIY.LIZ(r0, r6)
            if (r0 != 0) goto Lb1
            float[] r3 = r11.LIZLLL
            r1 = r3[r4]
            r0 = 2
            r0 = r3[r0]
            float r1 = r1 + r0
            float r2 = r11.LIZ
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r0 <= 0) goto Lae
            float r6 = r2 / r1
            int r0 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r0 >= 0) goto Lae
        L6b:
            r1 = r3[r8]
            r0 = 6
            r0 = r3[r0]
            float r1 = r1 + r0
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 <= 0) goto L7b
            float r2 = r2 / r1
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto L7b
            r6 = r2
        L7b:
            r0 = 1
            r1 = r3[r0]
            r0 = 7
            r0 = r3[r0]
            float r1 = r1 + r0
            float r2 = r11.LIZIZ
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 <= 0) goto L8f
            float r1 = r2 / r1
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 >= 0) goto L8f
            r6 = r1
        L8f:
            r0 = 3
            r1 = r3[r0]
            r0 = 5
            r0 = r3[r0]
            float r1 = r1 + r0
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 <= 0) goto La0
            float r2 = r2 / r1
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto La0
            r6 = r2
        La0:
            int r0 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r0 >= 0) goto Lb1
        La4:
            r0 = r3[r4]
            float r0 = r0 * r6
            r3[r4] = r0
            int r4 = r4 + 1
            if (r4 >= r5) goto Lb1
            goto La4
        Lae:
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L6b
        Lb1:
            float[] r0 = r11.LIZLLL
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1313900kIO.LIZ():float[]");
    }

    public final boolean LIZIZ() {
        C1313840kII c1313840kII;
        C1314110kIj[] c1314110kIjArr = this.LIZJ;
        if (c1314110kIjArr != null) {
            for (C1314110kIj c1314110kIj : c1314110kIjArr) {
                if (c1314110kIj != null && (c1313840kII = c1314110kIj.LIZ) != null) {
                    if (c1313840kII.LIZ != 2 && c1313840kII.LIZIZ == 0.0f) {
                        C1313840kII c1313840kII2 = c1314110kIj.LIZIZ;
                        if (c1313840kII2.LIZ == 2 || c1313840kII2.LIZIZ != 0.0f) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean LIZJ(int i, C1314110kIj c1314110kIj) {
        if (i >= 0 && i < 4) {
            if (this.LIZJ == null) {
                this.LIZJ = new C1314110kIj[4];
            }
            if (!c1314110kIj.equals(this.LIZJ[i])) {
                this.LIZJ[i] = c1314110kIj;
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean LIZLLL(float f, float f2) {
        if (f < 0.0f || C1314570kJT.LIZ(f)) {
            f = 0.0f;
        }
        if (f2 < 0.0f || C1314570kJT.LIZ(f2)) {
            f2 = 0.0f;
        }
        if (C1314000kIY.LIZ(f, this.LIZ) && C1314000kIY.LIZ(f2, this.LIZIZ)) {
            if (this.LIZLLL == null) {
                return true;
            }
            return false;
        }
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZLLL = null;
        return true;
    }
}
