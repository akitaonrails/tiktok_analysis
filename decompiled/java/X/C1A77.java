package X;

import android.util.Pair;
import android.view.View;

/* JADX INFO: renamed from: X.1A77, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A77 {
    public final View LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public float LJIIIIZZ;
    public int LJIIIZ;
    public boolean LJIIJ;
    public float LJII = Float.MAX_VALUE;
    public boolean LJIIJJI = true;

    public final float LIZ() {
        int i;
        float f;
        float f2;
        int i2 = this.LJFF;
        if (i2 == 0 || (i = this.LIZIZ) == 0) {
            return 0.0f;
        }
        float f3 = this.LJI / i2;
        float f4 = this.LIZJ / i;
        Pair<Integer, Integer> pairLIZIZ = LIZIZ();
        int iIntValue = ((Integer) pairLIZIZ.first).intValue();
        int iIntValue2 = ((Integer) pairLIZIZ.second).intValue();
        if (f4 > f3) {
            f = this.LJFF * 1.0f;
            f2 = iIntValue;
        } else {
            f = this.LJI * 1.0f;
            f2 = iIntValue2;
        }
        return f / f2;
    }

    public final Pair<Integer, Integer> LIZIZ() {
        int i;
        int i2 = this.LIZIZ;
        if (i2 <= 0 || (i = this.LIZJ) <= 0) {
            return new Pair<>(0, 0);
        }
        int i3 = this.LJI;
        int i4 = this.LJFF;
        int i5 = (int) (i * ((i4 * 1.0f) / i2));
        if (i5 > i3) {
            i4 = (int) (i2 * ((i3 * 1.0f) / i));
        } else {
            i3 = i5;
        }
        return new Pair<>(Integer.valueOf(i4), Integer.valueOf(i3));
    }

    public final float LIZJ() {
        if (this.LJIIIZ != 2) {
            return 1.0f;
        }
        return LIZ();
    }

    public final float LIZLLL() {
        return this.LIZ.getLeft() + ((this.LIZ.getWidth() - (this.LIZ.getWidth() * this.LIZ.getScaleX())) / 2.0f) + this.LIZ.getTranslationX();
    }

    public final float LJ() {
        return this.LIZ.getTop() + ((this.LIZ.getHeight() - (this.LIZ.getHeight() * this.LIZ.getScaleY())) / 2.0f) + this.LIZ.getTranslationY();
    }

    public final void LJI(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Set TextureLayout. oldTextureLayout=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", newTextureLayout=");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LJIIIZ != i) {
            this.LJIIIZ = i;
            this.LIZ.requestLayout();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Set TextureLayout over. parentSize:");
        sbLIZ2.append(this.LJFF);
        sbLIZ2.append("*");
        sbLIZ2.append(this.LJI);
        sbLIZ2.append(", videoSize:");
        sbLIZ2.append(this.LIZIZ);
        sbLIZ2.append("*");
        sbLIZ2.append(this.LIZJ);
        sbLIZ2.append(", newScaleFactor:");
        sbLIZ2.append(LIZJ());
        sbLIZ2.append(", newScaledSize:");
        sbLIZ2.append(this.LIZLLL * LIZJ());
        sbLIZ2.append("*");
        sbLIZ2.append(this.LJ * LIZJ());
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    public C1A77(View view, InterfaceC1474480oTO interfaceC1474480oTO) {
        this.LIZ = view;
        view.getClass();
    }

    public final void LJII(int i, int i2) {
        if (this.LIZIZ != i || this.LIZJ != i2) {
            this.LIZIZ = i;
            this.LIZJ = i2;
            this.LIZLLL = 0;
            this.LJ = 0;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setVideoSize videoWidth:");
            sbLIZ.append(i);
            sbLIZ.append(" videoHeight:");
            sbLIZ.append(i2);
            C2188811AlT.LIZIZ(sbLIZ);
            this.LIZ.requestLayout();
        }
    }

    public final Pair<Integer, Integer> LJFF(int i, int i2, int i3, int i4) {
        int iIntValue;
        int iIntValue2;
        int i5;
        int i6;
        int i7;
        Pair<Integer, Integer> pair;
        float fMax;
        float fMax2;
        float fMax3;
        float fMax4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("widthMeasureSpec:");
        sbLIZ.append(View.MeasureSpec.toString(i));
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("heightMeasureSpec:");
        sbLIZ2.append(View.MeasureSpec.toString(i2));
        C2188811AlT.LIZIZ(sbLIZ2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            i3 = size;
        } else if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(i3, size);
        }
        if (mode2 == 1073741824) {
            i4 = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            i4 = Math.min(i4, size2);
        }
        this.LJFF = i3;
        this.LJI = i4;
        C786410Ut5.Jc(this.LIZ, 0.0f);
        C786410Ut5.ed(this.LIZ, 0.0f);
        float scaleX = this.LIZ.getScaleX();
        int i8 = this.LJIIIZ;
        if (i8 != 1 && (i6 = this.LIZIZ) > 0 && (i7 = this.LIZJ) > 0) {
            iIntValue = 0;
            if (i8 != -1 && i8 != 0 && i8 != 2) {
                iIntValue2 = 0;
            } else {
                if (this.LJIIJJI) {
                    pair = LIZIZ();
                    float fLIZJ = LIZJ();
                    if (Math.abs(scaleX - fLIZJ) >= 1.0E-5f) {
                        if (Float.isNaN(fLIZJ)) {
                            fMax3 = this.LJIIIIZZ;
                        } else {
                            fMax3 = Math.max(Math.min(fLIZJ, this.LJII), this.LJIIIIZZ);
                        }
                        if (Float.isNaN(fLIZJ)) {
                            fMax4 = this.LJIIIIZZ;
                        } else {
                            fMax4 = Math.max(Math.min(fLIZJ, this.LJII), this.LJIIIIZZ);
                        }
                        C786410Ut5.Ob(this.LIZ, fMax3);
                        C786410Ut5.pc(this.LIZ, fMax4);
                        scaleX = fLIZJ;
                    }
                    if (this.LJIIIZ == 2) {
                        float[] fArr = {0.0f, 0.0f};
                        if (this.LJIIJ) {
                            fArr[1] = ((-(this.LIZ.getScaleX() - 1.0f)) / 2.0f) * this.LJI;
                        }
                        float f = this.LJI;
                        float f2 = (((-(scaleX - 1.0f)) / 2.0f) * f) + fArr[1];
                        float f3 = (f * scaleX) + f2;
                        if (f2 < 2.0f && f3 > r9 - 2) {
                            C786410Ut5.Jc(this.LIZ, fArr[0]);
                            C786410Ut5.ed(this.LIZ, fArr[1]);
                        }
                    }
                } else {
                    if (i8 == 0) {
                        pair = LIZIZ();
                    } else {
                        int i9 = this.LJI;
                        float f4 = i9;
                        int i10 = this.LJFF;
                        float f5 = i10;
                        float f6 = i7;
                        float f7 = i6;
                        if (f6 / f7 > f4 / f5) {
                            i9 = (int) (f6 * ((f5 * 1.0f) / f7));
                        } else {
                            i10 = (int) (f7 * ((f4 * 1.0f) / f6));
                        }
                        pair = new Pair<>(Integer.valueOf(i10), Integer.valueOf(i9));
                    }
                    if (Float.isNaN(1.0f)) {
                        fMax = this.LJIIIIZZ;
                    } else {
                        fMax = Math.max(Math.min(1.0f, this.LJII), this.LJIIIIZZ);
                    }
                    if (Float.isNaN(1.0f)) {
                        fMax2 = this.LJIIIIZZ;
                    } else {
                        fMax2 = Math.max(Math.min(1.0f, this.LJII), this.LJIIIIZZ);
                    }
                    C786410Ut5.Ob(this.LIZ, fMax);
                    C786410Ut5.pc(this.LIZ, fMax2);
                }
                iIntValue = ((Integer) pair.first).intValue();
                iIntValue2 = ((Integer) pair.second).intValue();
            }
        } else {
            iIntValue = i3;
            iIntValue2 = i4;
        }
        int i11 = this.LIZLLL;
        if (i11 == iIntValue && (i5 = this.LJ) == iIntValue2) {
            if (this.LIZ instanceof C1A76) {
                int i12 = i11 + 1;
                int i13 = i5 + 1;
                this.LIZLLL = i12;
                this.LJ = i13;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("set dummy dimension:");
                sbLIZ3.append(i12);
                sbLIZ3.append("*");
                sbLIZ3.append(i13);
                C2188811AlT.LIZIZ(sbLIZ3);
                return new Pair<>(Integer.valueOf(i12), Integer.valueOf(i13));
            }
        } else {
            this.LIZLLL = iIntValue;
            this.LJ = iIntValue2;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("sv_size_Measure:");
            sbLIZ4.append(iIntValue);
            sbLIZ4.append("*");
            sbLIZ4.append(iIntValue2);
            sbLIZ4.append(" Parent:");
            sbLIZ4.append(i3);
            sbLIZ4.append("*");
            sbLIZ4.append(i4);
            sbLIZ4.append(" textureLayout:");
            sbLIZ4.append(this.LJIIIZ);
            sbLIZ4.append(" Video:");
            sbLIZ4.append(this.LIZIZ);
            sbLIZ4.append("*");
            sbLIZ4.append(this.LIZJ);
            sbLIZ4.append(" scaleFactor:");
            sbLIZ4.append(scaleX);
            sbLIZ4.append(" scaled_size:");
            sbLIZ4.append(iIntValue * scaleX);
            sbLIZ4.append("*");
            sbLIZ4.append(iIntValue2 * scaleX);
            C2188811AlT.LIZIZ(sbLIZ4);
        }
        return new Pair<>(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
    }
}
