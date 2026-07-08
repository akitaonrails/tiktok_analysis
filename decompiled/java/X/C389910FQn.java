package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: renamed from: X.0FQn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C389910FQn {
    public Rect LIZ = new Rect();
    public final RectF LIZIZ = new RectF();
    public RectF LIZJ = new RectF();
    public final Matrix LIZLLL = new Matrix();
    public final Matrix LJ = new Matrix();

    public final RectF LIZIZ() {
        this.LIZIZ.set(this.LIZ);
        return this.LIZIZ;
    }

    public final Rect LIZ(Rect rect, EnumC389840FQg enumC389840FQg) {
        this.LIZ = rect;
        int i = C389860FQi.LIZ[enumC389840FQg.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        float[] fArr = {LIZIZ().left, LIZIZ().bottom, LIZIZ().right, LIZIZ().bottom};
                        this.LIZLLL.mapPoints(fArr);
                        float f = fArr[1];
                        float f2 = this.LIZJ.bottom;
                        if (f > f2) {
                            float[] fArr2 = {fArr[0], f2};
                            this.LJ.mapPoints(fArr2);
                            this.LIZ.bottom = (int) fArr2[1];
                        }
                        float f3 = fArr[3];
                        float f4 = this.LIZJ.bottom;
                        if (f3 > f4) {
                            float[] fArr3 = {fArr[2], f4};
                            this.LJ.mapPoints(fArr3);
                            Rect rect2 = this.LIZ;
                            rect2.bottom = Math.min(rect2.bottom, (int) fArr3[1]);
                        }
                        float f5 = fArr[0];
                        float f6 = this.LIZJ.left;
                        if (f5 < f6) {
                            float[] fArr4 = {f6, fArr[1] - (f6 - f5)};
                            this.LJ.mapPoints(fArr4);
                            Rect rect3 = this.LIZ;
                            rect3.bottom = Math.min(rect3.bottom, (int) fArr4[1]);
                        }
                        float f7 = fArr[2];
                        float f8 = this.LIZJ.right;
                        if (f7 > f8) {
                            float[] fArr5 = {f8, fArr[3] - (f7 - f8)};
                            this.LJ.mapPoints(fArr5);
                            Rect rect4 = this.LIZ;
                            rect4.bottom = Math.min(rect4.bottom, (int) fArr5[1]);
                        }
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    float[] fArr6 = {LIZIZ().right, LIZIZ().top, LIZIZ().right, LIZIZ().bottom};
                    this.LIZLLL.mapPoints(fArr6);
                    float f9 = fArr6[0];
                    float f10 = this.LIZJ.right;
                    if (f9 > f10) {
                        float[] fArr7 = {f10, fArr6[1]};
                        this.LJ.mapPoints(fArr7);
                        this.LIZ.right = (int) fArr7[0];
                    }
                    float f11 = fArr6[2];
                    float f12 = this.LIZJ.right;
                    if (f11 > f12) {
                        float[] fArr8 = {f12, fArr6[3]};
                        this.LJ.mapPoints(fArr8);
                        Rect rect5 = this.LIZ;
                        rect5.right = Math.min(rect5.right, (int) fArr8[0]);
                    }
                    float f13 = fArr6[1];
                    float f14 = this.LIZJ.top;
                    if (f13 < f14) {
                        float[] fArr9 = {fArr6[0] - (f14 - f13), f14};
                        this.LJ.mapPoints(fArr9);
                        Rect rect6 = this.LIZ;
                        rect6.right = Math.min(rect6.right, (int) fArr9[0]);
                    }
                    float f15 = fArr6[3];
                    float f16 = this.LIZJ.bottom;
                    if (f15 > f16) {
                        float[] fArr10 = {fArr6[2] - (f15 - f16), f16};
                        this.LJ.mapPoints(fArr10);
                        Rect rect7 = this.LIZ;
                        rect7.right = Math.min(rect7.right, (int) fArr10[0]);
                    }
                }
            } else {
                float[] fArr11 = {LIZIZ().left, LIZIZ().top, LIZIZ().right, LIZIZ().top};
                this.LIZLLL.mapPoints(fArr11);
                float f18 = fArr11[1];
                float f19 = this.LIZJ.top;
                if (f18 < f19) {
                    float[] fArr12 = {fArr11[0], f19};
                    this.LJ.mapPoints(fArr12);
                    this.LIZ.top = (int) fArr12[1];
                }
                float f20 = fArr11[3];
                float f21 = this.LIZJ.top;
                if (f20 < f21) {
                    float[] fArr13 = {fArr11[2], f21};
                    this.LJ.mapPoints(fArr13);
                    Rect rect8 = this.LIZ;
                    rect8.top = Math.max(rect8.top, (int) fArr13[1]);
                }
                float f22 = fArr11[0];
                float f23 = this.LIZJ.left;
                if (f22 < f23) {
                    float[] fArr14 = {f23, fArr11[1] + (f23 - f22)};
                    this.LJ.mapPoints(fArr14);
                    Rect rect9 = this.LIZ;
                    rect9.top = Math.max(rect9.top, (int) fArr14[1]);
                }
                float f24 = fArr11[2];
                float f25 = this.LIZJ.right;
                if (f24 > f25) {
                    float[] fArr15 = {f25, fArr11[3] + (f24 - f25)};
                    this.LJ.mapPoints(fArr15);
                    Rect rect10 = this.LIZ;
                    rect10.top = Math.max(rect10.top, (int) fArr15[1]);
                }
            }
        } else {
            float[] fArr16 = {LIZIZ().left, LIZIZ().top, LIZIZ().left, LIZIZ().bottom};
            this.LIZLLL.mapPoints(fArr16);
            float f26 = fArr16[0];
            float f27 = this.LIZJ.left;
            if (f26 < f27) {
                float[] fArr17 = {f27, fArr16[1]};
                this.LJ.mapPoints(fArr17);
                this.LIZ.left = (int) fArr17[0];
            }
            float f28 = fArr16[2];
            float f29 = this.LIZJ.left;
            if (f28 < f29) {
                float[] fArr18 = {f29, fArr16[3]};
                this.LJ.mapPoints(fArr18);
                Rect rect11 = this.LIZ;
                rect11.left = Math.max(rect11.left, (int) fArr18[0]);
            }
            float f30 = fArr16[1];
            float f31 = this.LIZJ.top;
            if (f30 < f31) {
                float[] fArr19 = {fArr16[0] + (f31 - f30), f31};
                this.LJ.mapPoints(fArr19);
                Rect rect12 = this.LIZ;
                rect12.left = Math.max(rect12.left, (int) fArr19[0]);
            }
            float f32 = fArr16[3];
            float f33 = this.LIZJ.bottom;
            if (f32 > f33) {
                float[] fArr20 = {fArr16[2] + (f32 - f33), f33};
                this.LJ.mapPoints(fArr20);
                Rect rect13 = this.LIZ;
                rect13.left = Math.max(rect13.left, (int) fArr20[0]);
            }
        }
        return this.LIZ;
    }
}
