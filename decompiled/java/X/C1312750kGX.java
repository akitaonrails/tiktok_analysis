package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: renamed from: X.0kGX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1312750kGX {
    public RectF LIZ;
    public float[] LIZIZ;
    public Path LIZJ;
    public boolean LIZLLL;

    public C1312750kGX() {
    }

    public static boolean LIZ(float[] fArr) {
        for (int i = 2; i <= 6; i += 2) {
            float f = fArr[i] - fArr[0];
            if (f <= 1.0E-4f && f >= -1.0E-4f) {
                float f2 = fArr[i + 1] - fArr[1];
                if (f2 <= 1.0E-4f && f2 >= -1.0E-4f) {
                }
            }
            return false;
        }
        return true;
    }

    public final void LIZIZ(Canvas canvas, Paint paint) {
        if (this.LIZLLL) {
            RectF rectF = this.LIZ;
            float[] fArr = this.LIZIZ;
            canvas.drawRoundRect(rectF, fArr[0], fArr[1], paint);
            return;
        }
        canvas.drawPath(this.LIZJ, paint);
    }

    public C1312750kGX(C1312720kGU c1312720kGU, C1312720kGU c1312720kGU2, EnumC1312770kGZ enumC1312770kGZ) {
        boolean z;
        Rect rectLIZ = c1312720kGU.LIZ();
        float[] fArr = c1312720kGU.LIZIZ;
        RectF rectF = c1312720kGU2.LIZ;
        float f = rectF.left;
        RectF rectF2 = c1312720kGU.LIZ;
        RectF rectF3 = new RectF(f - rectF2.left, rectF.top - rectF2.top, rectF2.right - rectF.right, rectF2.bottom - rectF.bottom);
        float fLIZJ = enumC1312770kGZ.LIZJ();
        if (enumC1312770kGZ == EnumC1312770kGZ.CENTER) {
            z = true;
        } else {
            z = false;
        }
        LIZLLL(rectLIZ, fArr, rectF3, fLIZJ, z);
    }

    public static float[] LIZJ(float[] fArr, RectF rectF, float f) {
        return new float[]{Math.max(fArr[0] - (rectF.left * f), 0.0f), Math.max(fArr[1] - (rectF.top * f), 0.0f), Math.max(fArr[2] - (rectF.right * f), 0.0f), Math.max(fArr[3] - (rectF.top * f), 0.0f), Math.max(fArr[4] - (rectF.right * f), 0.0f), Math.max(fArr[5] - (rectF.bottom * f), 0.0f), Math.max(fArr[6] - (rectF.left * f), 0.0f), Math.max(fArr[7] - (rectF.bottom * f), 0.0f)};
    }

    public final void LIZLLL(Rect rect, float[] fArr, RectF rectF, float f, boolean z) {
        float[] fArrLIZJ;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        if (this.LIZ == null) {
            this.LIZ = new RectF();
        }
        RectF rectF2 = this.LIZ;
        rectF2.left = rect.left + (rectF.left * f);
        rectF2.top = rect.top + (rectF.top * f);
        rectF2.right = rect.right - (rectF.right * f);
        rectF2.bottom = rect.bottom - (rectF.bottom * f);
        if (z) {
            fArrLIZJ = new float[8];
            float f9 = fArr[0];
            float f10 = rectF.left;
            float f11 = f9 - (f10 * f);
            float f12 = 0.0f;
            if (f10 > 0.0f) {
                f2 = f9 / f10;
            } else {
                f2 = 0.0f;
            }
            fArrLIZJ[0] = Math.max(f11, f2);
            float f13 = fArr[1];
            float f14 = rectF.top;
            float f15 = f13 - (f14 * f);
            if (f14 > 0.0f) {
                f3 = f13 / f14;
            } else {
                f3 = 0.0f;
            }
            fArrLIZJ[1] = Math.max(f15, f3);
            float f16 = fArr[2];
            float f18 = rectF.right;
            float f19 = f16 - (f18 * f);
            if (f18 > 0.0f) {
                f4 = f16 / f18;
            } else {
                f4 = 0.0f;
            }
            fArrLIZJ[2] = Math.max(f19, f4);
            float f20 = fArr[3];
            float f21 = rectF.top;
            float f22 = f20 - (f21 * f);
            if (f21 > 0.0f) {
                f5 = f20 / f21;
            } else {
                f5 = 0.0f;
            }
            fArrLIZJ[3] = Math.max(f22, f5);
            float f23 = fArr[4];
            float f24 = rectF.right;
            float f25 = f23 - (f24 * f);
            if (f24 > 0.0f) {
                f6 = f23 / f24;
            } else {
                f6 = 0.0f;
            }
            fArrLIZJ[4] = Math.max(f25, f6);
            float f26 = fArr[5];
            float f27 = rectF.bottom;
            float f28 = f26 - (f27 * f);
            if (f27 > 0.0f) {
                f7 = f26 / f27;
            } else {
                f7 = 0.0f;
            }
            fArrLIZJ[5] = Math.max(f28, f7);
            float f29 = fArr[6];
            float f30 = rectF.left;
            float f31 = f29 - (f30 * f);
            if (f30 > 0.0f) {
                f8 = f29 / f30;
            } else {
                f8 = 0.0f;
            }
            fArrLIZJ[6] = Math.max(f31, f8);
            float f32 = fArr[7];
            float f33 = rectF.bottom;
            float f34 = f32 - (f * f33);
            if (f33 > 0.0f) {
                f12 = f32 / f33;
            }
            fArrLIZJ[7] = Math.max(f34, f12);
        } else {
            fArrLIZJ = LIZJ(fArr, rectF, f);
        }
        this.LIZIZ = fArrLIZJ;
        this.LIZLLL = LIZ(fArrLIZJ);
        Path path = this.LIZJ;
        if (path == null) {
            this.LIZJ = new Path();
        } else {
            path.reset();
        }
        this.LIZJ.addRoundRect(this.LIZ, this.LIZIZ, Path.Direction.CW);
    }
}
