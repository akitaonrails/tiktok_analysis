package X;

import android.content.Context;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: X.0kG6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1312480kG6 {
    public static final float LJIILLIIL = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final float[] LJIIZILJ = new float[101];
    public static final float[] LJIJ = new float[101];
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public float LJFF;
    public float LJI;
    public long LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIL;
    public final float LJIILL;
    public final float LJIILIIL = ViewConfiguration.getScrollFriction();
    public int LJIILJJIL = 0;
    public boolean LJIIJJI = true;

    public final boolean LIZIZ() {
        int i = this.LJIILJJIL;
        if (i == 0) {
            int i2 = this.LJIIIIZZ;
            if (i2 >= this.LJIIIZ) {
                return false;
            }
            this.LIZJ = this.LIZIZ;
            int i3 = this.LIZLLL;
            this.LIZ = i3;
            this.LIZIZ = i3;
            int i4 = (int) this.LJFF;
            this.LJ = i4;
            this.LJI = i4 > 0 ? -2000.0f : 2000.0f;
            this.LJII += (long) i2;
            LIZLLL();
        } else {
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                this.LJII += (long) this.LJIIIIZZ;
                LJ(this.LIZLLL, this.LIZ);
            }
        }
        LJFF();
        return true;
    }

    public final void LIZLLL() {
        int i = this.LJ;
        float f = i * i;
        float fAbs = f / (Math.abs(this.LJI) * 2.0f);
        float fSignum = Math.signum(this.LJ);
        int i2 = this.LJIIL;
        if (fAbs > i2) {
            this.LJI = ((-fSignum) * f) / (i2 * 2.0f);
            fAbs = i2;
        }
        this.LJIIL = (int) fAbs;
        this.LJIILJJIL = 2;
        int i3 = this.LIZ;
        int i4 = this.LJ;
        if (i4 <= 0) {
            fAbs = -fAbs;
        }
        this.LIZLLL = i3 + ((int) fAbs);
        this.LJIIIIZZ = -((int) ((i4 * 1000.0f) / this.LJI));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJFF() {
        /*
            r11 = this;
            long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r2 = r11.LJII
            long r0 = r0 - r2
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r7 = 0
            r5 = 1
            if (r2 != 0) goto L15
            int r0 = r11.LJIIIIZZ
            if (r0 <= 0) goto L14
            r7 = 1
        L14:
            return r7
        L15:
            int r6 = r11.LJIIIIZZ
            long r3 = (long) r6
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L1d
            return r7
        L1d:
            int r3 = r11.LJIILJJIL
            r10 = 1148846080(0x447a0000, float:1000.0)
            if (r3 == 0) goto L6f
            r9 = 1073741824(0x40000000, float:2.0)
            if (r3 == r5) goto L4c
            r2 = 2
            if (r3 != r2) goto La2
            float r4 = (float) r0
            float r4 = r4 / r10
            int r3 = r11.LJ
            float r2 = (float) r3
            float r1 = r11.LJI
            float r0 = r1 * r4
            float r2 = r2 + r0
            r11.LJFF = r2
            float r0 = (float) r3
            float r0 = r0 * r4
            float r1 = r1 * r4
            float r1 = r1 * r4
            float r1 = r1 / r9
            float r0 = r0 + r1
            double r3 = (double) r0
        L3d:
            int r0 = r11.LIZIZ
            r11.LIZJ = r0
            int r6 = r11.LIZ
            long r1 = java.lang.Math.round(r3)
            int r0 = (int) r1
            int r6 = r6 + r0
            r11.LIZIZ = r6
            return r5
        L4c:
            float r8 = (float) r0
            float r0 = (float) r6
            float r8 = r8 / r0
            float r7 = r8 * r8
            int r0 = r11.LJ
            float r0 = (float) r0
            float r6 = java.lang.Math.signum(r0)
            int r2 = r11.LJIIL
            float r1 = (float) r2
            float r1 = r1 * r6
            r0 = 1077936128(0x40400000, float:3.0)
            float r0 = r0 * r7
            float r9 = r9 * r8
            float r9 = r9 * r7
            float r0 = r0 - r9
            float r1 = r1 * r0
            double r3 = (double) r1
            float r0 = (float) r2
            float r6 = r6 * r0
            r0 = 1086324736(0x40c00000, float:6.0)
            float r6 = r6 * r0
            float r0 = -r8
            float r0 = r0 + r7
            float r6 = r6 * r0
            r11.LJFF = r6
            goto L3d
        L6f:
            float r8 = (float) r0
            int r6 = r11.LJIIIZ
            float r0 = (float) r6
            float r8 = r8 / r0
            r7 = 1120403456(0x42c80000, float:100.0)
            float r0 = r8 * r7
            int r3 = (int) r0
            if (r3 < 0) goto La2
            r0 = 100
            if (r3 >= r0) goto L9e
            float r4 = (float) r3
            float r4 = r4 / r7
            int r2 = r3 + 1
            float r1 = (float) r2
            float r1 = r1 / r7
            float[] r0 = X.C1312480kG6.LJIIZILJ
            r3 = r0[r3]
            r2 = r0[r2]
            float r2 = r2 - r3
            float r1 = r1 - r4
            float r2 = r2 / r1
            float r8 = r8 - r4
            float r8 = r8 * r2
            float r3 = r3 + r8
        L91:
            int r1 = r11.LJIIJ
            float r0 = (float) r1
            float r3 = r3 * r0
            double r3 = (double) r3
            float r0 = (float) r1
            float r2 = r2 * r0
            float r0 = (float) r6
            float r2 = r2 / r0
            float r2 = r2 * r10
            r11.LJFF = r2
            goto L3d
        L9e:
            r3 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            goto L91
        La2:
            r3 = 0
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1312480kG6.LJFF():boolean");
    }

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11 = 0.0f;
        float f12 = 0.0f;
        for (int i = 0; i < 100; i++) {
            float f13 = i / 100.0f;
            float f14 = 1.0f;
            while (true) {
                f = 2.0f;
                f2 = ((f14 - f11) / 2.0f) + f11;
                f3 = 3.0f;
                f4 = 1.0f - f2;
                f5 = f2 * 3.0f * f4;
                f6 = f2 * f2 * f2;
                float f15 = (((f4 * 0.175f) + (f2 * 0.35000002f)) * f5) + f6;
                if (Math.abs(f15 - f13) < 1.0E-5d) {
                    break;
                } else if (f15 > f13) {
                    f14 = f2;
                } else {
                    f11 = f2;
                }
            }
            LJIIZILJ[i] = (f5 * ((f4 * 0.5f) + f2)) + f6;
            float f16 = 1.0f;
            while (true) {
                f7 = ((f16 - f12) / f) + f12;
                f8 = 1.0f - f7;
                f9 = f7 * f3 * f8;
                f10 = f7 * f7 * f7;
                float f18 = (((f8 * 0.5f) + f7) * f9) + f10;
                if (Math.abs(f18 - f13) < 1.0E-5d) {
                    break;
                }
                if (f18 > f13) {
                    f16 = f7;
                } else {
                    f12 = f7;
                }
                f = 2.0f;
                f3 = 3.0f;
            }
            LJIJ[i] = (f9 * ((f8 * 0.175f) + (f7 * 0.35000002f))) + f10;
        }
        float[] fArr = LJIIZILJ;
        LJIJ[100] = 1.0f;
        fArr[100] = 1.0f;
    }

    public C1312480kG6(Context context) {
        this.LJIILL = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
    }

    public final void LJ(int i, int i2) {
        float f;
        this.LJIIJJI = false;
        this.LJIILJJIL = 1;
        this.LIZJ = this.LIZIZ;
        this.LIZ = i;
        this.LIZIZ = i;
        this.LIZLLL = i2;
        int i3 = i - i2;
        if (i3 > 0) {
            f = -2000.0f;
        } else {
            f = 2000.0f;
        }
        this.LJI = f;
        this.LJ = -i3;
        this.LJIIL = Math.abs(i3);
        this.LJIIIIZZ = (int) (Math.sqrt((((double) i3) * (-2.0d)) / ((double) this.LJI)) * 1000.0d);
    }

    public final void LIZ(int i, int i2, int i3) {
        float fAbs = Math.abs((i3 - i) / (i2 - i));
        int i4 = (int) (fAbs * 100.0f);
        if (i4 < 100) {
            float f = i4 / 100.0f;
            int i5 = i4 + 1;
            float[] fArr = LJIJ;
            float f2 = fArr[i4];
            this.LJIIIIZZ = (int) (this.LJIIIIZZ * (f2 + (((fAbs - f) / ((i5 / 100.0f) - f)) * (fArr[i5] - f2))));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(int r18, int r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1312480kG6.LIZJ(int, int, int, int, int, int):void");
    }
}
