package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Insets;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: X.12Pq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19751612Pq extends Drawable {
    public static final float[] LJIIIIZZ = {0.0f, 0.07f, 0.13f, 0.2f, 0.27f, 0.33f, 0.4f, 0.47f, 0.53f, 0.6f, 0.67f, 0.73f, 0.8f, 0.87f, 0.93f, 1.0f};
    public static final float[] LJIIIZ = {1.0f, 0.99f, 0.96f, 0.92f, 0.85f, 0.77f, 0.67f, 0.56f, 0.44f, 0.33f, 0.23f, 0.15f, 0.08f, 0.04f, 0.01f, 0.0f};
    public C19751512Pp LIZ;
    public RadialGradient LIZJ;
    public LinearGradient LIZLLL;
    public final Paint LIZIZ = new Paint(4);
    public final Path LJ = new Path();
    public final Path LJFF = new Path();
    public final int[] LJI = new int[17];
    public final float[] LJII = new float[17];

    @Override // android.graphics.drawable.Drawable
    @InterfaceC1294060jmO
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.LIZIZ.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.LIZIZ.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Insets getOpticalInsets() {
        Rect rect = this.LIZ.LJFF;
        if (rect == null) {
            return super.getOpticalInsets();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return Insets.of(rect);
        }
        Insets opticalInsets = super.getOpticalInsets();
        Field field = C19751712Pr.LIZ;
        if (!C19751712Pr.LJ) {
            return opticalInsets;
        }
        try {
            Field field2 = C19751712Pr.LIZ;
            if (field2 != null) {
                field2.set(opticalInsets, Integer.valueOf(rect.left));
            }
            Field field3 = C19751712Pr.LIZIZ;
            if (field3 != null) {
                field3.set(opticalInsets, Integer.valueOf(rect.top));
            }
            Field field4 = C19751712Pr.LIZJ;
            if (field4 != null) {
                field4.set(opticalInsets, Integer.valueOf(rect.right));
            }
            Field field5 = C19751712Pr.LIZLLL;
            if (field5 == null) {
                return opticalInsets;
            }
            field5.set(opticalInsets, Integer.valueOf(rect.bottom));
            return opticalInsets;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return opticalInsets;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        C19751512Pp c19751512Pp = this.LIZ;
        this.LIZ = new C19751512Pp(c19751512Pp.LIZ, c19751512Pp.LIZIZ, c19751512Pp.LIZJ, c19751512Pp.LIZLLL, c19751512Pp.LJ, c19751512Pp.LJFF);
        return this;
    }

    public final float LIZ() {
        return Math.min(Math.min(getBounds().width(), getBounds().height()) / 2.0f, this.LIZ.LIZ);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.LIZ;
    }

    public C19751612Pq(C19751512Pp c19751512Pp) {
        this.LIZ = c19751512Pp;
    }

    public final void LJ(float f) {
        C19751512Pp c19751512Pp = this.LIZ;
        if (c19751512Pp.LIZIZ == f) {
            return;
        }
        c19751512Pp.LIZIZ = f;
        this.LIZJ = null;
        invalidateSelf();
    }

    public final void LJFF(float f) {
        C19751512Pp c19751512Pp = this.LIZ;
        if (c19751512Pp.LIZJ == f) {
            return;
        }
        c19751512Pp.LIZJ = f;
        this.LIZJ = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iCenterX;
        int iCenterY;
        float f;
        int i;
        float f2;
        RadialGradient radialGradient;
        if (Color.alpha(this.LIZ.LJ) == 0) {
            return;
        }
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        canvas.save();
        if (iWidth < 0) {
            iCenterX = bounds.centerX();
        } else {
            iCenterX = bounds.left;
        }
        float f3 = iCenterX + this.LIZ.LIZIZ;
        if (iHeight < 0) {
            iCenterY = bounds.centerY();
        } else {
            iCenterY = bounds.top;
        }
        canvas.translate(f3, iCenterY + this.LIZ.LIZJ);
        if (iWidth < 0) {
            iWidth = 0;
        }
        if (iHeight < 0) {
            iHeight = 0;
        }
        float fLIZ = (int) LIZ();
        RadialGradient radialGradient2 = this.LIZJ;
        float[] fArr = LJIIIIZZ;
        float[] fArr2 = LJIIIZ;
        if (radialGradient2 == null) {
            C19751512Pp c19751512Pp = this.LIZ;
            float f4 = c19751512Pp.LIZLLL / 2.0f;
            float f5 = fLIZ + f4;
            int i2 = c19751512Pp.LJ;
            int i3 = 16777215 & i2;
            if (fLIZ < 1.0E-5f) {
                f2 = 1.0E-5f;
            } else {
                f2 = fLIZ;
            }
            float f6 = (f2 - f4) / f5;
            if (f6 <= 0.0f) {
                float f7 = 1;
                float f8 = f6 / (f6 - f7);
                int i4 = 0;
                while (true) {
                    if (fArr[i4] > f8) {
                        break;
                    }
                    i4++;
                    if (i4 >= 16) {
                        i4 = -1;
                        break;
                    }
                }
                int i5 = i4 - 1;
                float f9 = fArr[i5];
                int i6 = i5 + 1;
                float f10 = (f8 - f9) / (fArr[i6] - f9);
                float f11 = (fArr2[i5] * (f7 - f10)) + (fArr2[i6] * f10);
                C13DL.LJFF(this.LJI, i3);
                float[] fArr3 = this.LJII;
                Arrays.fill(fArr3, 0, fArr3.length, 1.0f);
                this.LJI[0] = LIZLLL(f11, i2);
                this.LJII[0] = 0.0f;
                C531650Kt9 it2 = C13LZ.LJIILJJIL(i6, 16).iterator();
                while (it2.LLILLL) {
                    int iNextInt = it2.nextInt();
                    int i7 = iNextInt - i5;
                    this.LJI[i7] = LIZLLL(fArr2[iNextInt], i2);
                    float f12 = f7 / (f7 - f8);
                    this.LJII[i7] = ((fArr[iNextInt] * f12) + f7) - f12;
                }
                radialGradient = new RadialGradient(f2, f2, f5, this.LJI, this.LJII, Shader.TileMode.CLAMP);
            } else {
                this.LJI[0] = i2;
                int i8 = 0;
                int i9 = 0;
                do {
                    i9++;
                    this.LJI[i9] = LIZLLL(fArr2[i8], i2);
                    i8++;
                } while (i8 < 16);
                this.LJII[0] = 0.0f;
                int i10 = 0;
                int i11 = 0;
                do {
                    i11++;
                    this.LJII[i11] = ((1 - f6) * fArr[i10]) + f6;
                    i10++;
                } while (i10 < 16);
                radialGradient = new RadialGradient(f2, f2, f5, this.LJI, this.LJII, Shader.TileMode.CLAMP);
            }
            this.LIZJ = radialGradient;
        }
        int i12 = (int) fLIZ;
        float f13 = this.LIZ.LIZLLL / 2.0f;
        float f14 = i12 + f13;
        this.LIZIZ.setShader(this.LIZJ);
        int iLIZIZ = C814420VxA.LIZIZ(f13);
        int i13 = -iLIZIZ;
        LIZJ(canvas, i12, f14, i13, i13, i12, i12);
        int i14 = i12 + i12 + iLIZIZ;
        canvas.translate(iWidth - r11, 0.0f);
        LIZJ(canvas, i12, f14, i12, i13, i14, i12);
        canvas.translate(0.0f, iHeight - r11);
        LIZJ(canvas, i12, f14, i12, i12, i14, i14);
        canvas.translate((-iWidth) + r11, 0.0f);
        LIZJ(canvas, i12, f14, i13, i12, i12, i14);
        canvas.translate(0.0f, (-iHeight) + r11);
        if (this.LIZLLL == null) {
            C19751512Pp c19751512Pp2 = this.LIZ;
            int i15 = c19751512Pp2.LJ;
            float f15 = c19751512Pp2.LIZLLL / 2.0f;
            ArrayList arrayList = new ArrayList(16);
            int i16 = 0;
            do {
                arrayList.add(Integer.valueOf(LIZLLL(fArr2[i16], i15)));
                i16++;
            } while (i16 < 16);
            this.LIZLLL = new LinearGradient(0.0f, f15, 0.0f, -f15, C13LP.LLII(arrayList), fArr, Shader.TileMode.CLAMP);
        }
        int iLIZIZ2 = C814420VxA.LIZIZ(this.LIZ.LIZLLL / 2.0f);
        if (this.LJ.isEmpty()) {
            LIZIZ(fLIZ, iWidth, iHeight, iLIZIZ2, this.LJ);
        }
        if (this.LJFF.isEmpty()) {
            LIZIZ(fLIZ, iHeight, iWidth, iLIZIZ2, this.LJFF);
        }
        this.LIZIZ.setShader(this.LIZLLL);
        canvas.drawPath(this.LJ, this.LIZIZ);
        if (iWidth > iHeight) {
            f = -90.0f;
        } else {
            f = 90.0f;
        }
        if (iWidth > iHeight) {
            i = iHeight;
        } else {
            i = iWidth;
        }
        float f16 = i / 2.0f;
        canvas.rotate(f, f16, f16);
        canvas.drawPath(this.LJFF, this.LIZIZ);
        if (iWidth < iHeight) {
            iWidth = iHeight;
        }
        float f18 = iWidth / 2.0f;
        canvas.rotate(f, f18, f18);
        canvas.drawPath(this.LJ, this.LIZIZ);
        canvas.rotate(f, f16, f16);
        canvas.drawPath(this.LJFF, this.LIZIZ);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            return;
        }
        C19751512Pp c19751512Pp = this.LIZ;
        Rect rect = c19751512Pp.LJFF;
        if (rect != null) {
            outline.setRoundRect(bounds.left + rect.left, bounds.top + rect.top, bounds.right - rect.right, bounds.bottom - rect.bottom, c19751512Pp.LIZ);
            outline.setAlpha(Color.alpha(this.LIZ.LJ) / 255.0f);
        } else {
            super.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.LIZ.LJFF;
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect.bottom | rect.left | rect.top | rect.right) != 0) {
                return true;
            }
            return false;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LIZIZ.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LIZIZ.setColorFilter(colorFilter);
    }

    public static int LIZLLL(float f, int i) {
        return (((int) (Color.alpha(i) * f)) << 24) | (i & 16777215);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        float fLIZ = LIZ();
        int iWidth = getBounds().width();
        int iHeight = getBounds().height();
        super.setBounds(i, i2, i3, i4);
        if (iWidth != i3 - i || iHeight != i4 - i2) {
            this.LJ.rewind();
            this.LJFF.rewind();
        }
        if (fLIZ != LIZ()) {
            this.LIZJ = null;
            this.LJ.rewind();
            this.LJFF.rewind();
        }
    }

    public static void LIZIZ(float f, int i, int i2, int i3, Path path) {
        float f2 = i;
        path.moveTo(f2 / 2.0f, i2 / 2.0f);
        path.lineTo(f, f);
        float f3 = -i3;
        path.lineTo(f, f3);
        float f4 = f2 - f;
        path.lineTo(f4, f3);
        path.lineTo(f4, f);
        path.close();
    }

    public final void LIZJ(Canvas canvas, int i, float f, int i2, int i3, int i4, int i5) {
        canvas.save();
        canvas.clipRect(i2, i3, i4, i5);
        float f2 = i;
        canvas.drawCircle(f2, f2, f, this.LIZIZ);
        canvas.restore();
    }
}
