package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: renamed from: X.12P3, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12P3 extends Drawable {
    public int LIZLLL;
    public float[] LJI;
    public final Paint LJII;
    public Shader LJIIIIZZ;
    public EnumC197015126j LJIIIZ;
    public C12KQ LJIIJ;
    public float LJIIJJI;
    public float LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public final C12P7 LIZ = new Drawable.ConstantState(this) { // from class: X.12P7
        public final C12P3 LIZ;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return this.LIZ;
        }

        {
            this.LIZ = this;
        }
    };
    public int LIZIZ = -1;
    public int LIZJ = -1;
    public float LJ = 1.0f;
    public float LJFF = 1.0f;

    @Override // android.graphics.drawable.Drawable
    @InterfaceC1294060jmO
    public final int getOpacity() {
        return -3;
    }

    public final int LIZ() {
        int i = this.LJIILJJIL;
        return i <= 0 ? getBounds().height() : i;
    }

    public final int LIZIZ() {
        int i = this.LJIILIIL;
        return i <= 0 ? getBounds().width() : i;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (Build.VERSION.SDK_INT <= 23) {
            return this.LIZ;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.12P7] */
    public C12P3() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        this.LJII = paint;
        this.LJIIIZ = EnumC197015126j.LINEAR;
        this.LJIIJ = C12KQ.VERTICAL;
        this.LJIIL = 1.0f;
        this.LJIILIIL = -1;
        this.LJIILJJIL = -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.LIZJ;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.LIZIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014 A[PHI: r1
      0x0014: PHI (r1v1 float) = (r1v0 float), (r1v2 float) binds: [B:5:0x000c, B:7:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(float r3) {
        /*
            r2 = this;
            float r0 = r2.LJIIJJI
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L1a
            r0 = 0
            r2.LJIIIIZZ = r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L14
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L15
        L14:
            r3 = r1
        L15:
            r2.LJIIJJI = r3
            r2.invalidateSelf()
        L1a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12P3.LIZJ(float):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014 A[PHI: r1
      0x0014: PHI (r1v1 float) = (r1v0 float), (r1v2 float) binds: [B:5:0x000c, B:7:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(float r3) {
        /*
            r2 = this;
            float r0 = r2.LJIIL
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L1a
            r0 = 0
            r2.LJIIIIZZ = r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L14
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L15
        L14:
            r3 = r1
        L15:
            r2.LJIIL = r3
            r2.invalidateSelf()
        L1a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12P3.LIZLLL(float):void");
    }

    public final void LJ(int i) {
        this.LJ = ((i >> 24) & 255) / 255.0f;
        this.LIZLLL = (i & 16777215) | (((int) 255.0f) << 24);
        invalidateSelf();
    }

    public final void LJFF(EnumC197015126j enumC197015126j) {
        float f;
        float fFloatValue;
        if (this.LJIIIZ != enumC197015126j) {
            this.LJIIIIZZ = null;
            if (enumC197015126j != EnumC197015126j.LINEAR) {
                float[] fArr = new float[20];
                C12P6 c12p6 = new C12P6(enumC197015126j.getX0(), enumC197015126j.getY0(), enumC197015126j.getX1(), enumC197015126j.getY1());
                int i = 0;
                do {
                    float f2 = i / 19;
                    float f3 = 0.0f;
                    if (f2 > 0.0f) {
                        float f4 = 1.0f;
                        if (f2 < 1.0f) {
                            while (true) {
                                f = (f3 + f4) / 2;
                                if (c12p6.LJ.containsKey(Float.valueOf(f))) {
                                    fFloatValue = c12p6.LJ.get(Float.valueOf(f)).floatValue();
                                } else {
                                    float f5 = 3;
                                    float f6 = 1 - f;
                                    fFloatValue = (c12p6.LIZ * f5 * f6 * f6 * f) + (f5 * c12p6.LIZJ * f6 * f * f) + (f * f * f);
                                    c12p6.LJ.put(Float.valueOf(f), Float.valueOf(fFloatValue));
                                }
                                if (Math.abs(f2 - fFloatValue) < 0.001f) {
                                    break;
                                } else if (fFloatValue < f2) {
                                    f3 = f;
                                } else {
                                    f4 = f;
                                }
                            }
                            float f7 = 3;
                            float f8 = 1 - f;
                            f2 = (c12p6.LIZIZ * f7 * f8 * f8 * f) + (f7 * c12p6.LIZLLL * f8 * f * f) + (f * f * f);
                        }
                    }
                    fArr[i] = f2;
                    i++;
                } while (i < 20);
                this.LJI = fArr;
            }
            this.LJIIIZ = enumC197015126j;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fWidth;
        float fHeight;
        Shader linearGradient;
        float fWidth2;
        float fHeight2;
        int iWidth = getBounds().width();
        int iHeight = getBounds().height();
        if (LIZIZ() > 0 && LIZ() > 0) {
            setBounds(getBounds().left + ((iWidth - LIZIZ()) / 2), getBounds().top + ((iHeight - LIZ()) / 2), getBounds().left + ((iWidth + LIZIZ()) / 2), getBounds().top + ((iHeight + LIZ()) / 2));
        } else {
            setBounds(getBounds().left, getBounds().top, getBounds().left + iWidth, getBounds().top + iHeight);
        }
        if (this.LJIIIIZZ == null) {
            float f = this.LJ * this.LJFF;
            if (this.LJIIIZ == EnumC197015126j.LINEAR) {
                int i = this.LIZLLL;
                int i2 = (((int) ((this.LJIIJJI * f) * 255.0f)) << 24) | (i & 16777215);
                int i3 = (((int) ((this.LJIIL * f) * 255.0f)) << 24) | (i & 16777215);
                C12KQ c12kq = this.LJIIJ;
                C12KQ c12kq2 = C12KQ.VERTICAL;
                if (c12kq != c12kq2 && c12kq != C12KQ.HORIZONTAL) {
                    float fMin = Math.min(getBounds().width(), getBounds().height()) / 2.0f;
                    linearGradient = new RadialGradient(fMin, fMin, fMin, i2, i3, Shader.TileMode.CLAMP);
                } else {
                    if (c12kq == c12kq2) {
                        fWidth2 = 0.0f;
                    } else {
                        fWidth2 = getBounds().width();
                    }
                    if (this.LJIIJ == c12kq2) {
                        fHeight2 = getBounds().height();
                    } else {
                        fHeight2 = 0.0f;
                    }
                    linearGradient = new LinearGradient(0.0f, 0.0f, fWidth2, fHeight2, i2, i3, Shader.TileMode.CLAMP);
                }
            } else {
                int[] iArr = new int[20];
                float f2 = this.LJIIL - this.LJIIJJI;
                int i4 = 0;
                do {
                    float f3 = this.LJIIJJI;
                    float[] fArr = this.LJI;
                    if (fArr == null) {
                        fArr = null;
                    }
                    iArr[i4] = (((int) (((f3 + (fArr[i4] * f2)) * f) * 255.0f)) << 24) | (this.LIZLLL & 16777215);
                    i4++;
                } while (i4 < 20);
                C12KQ c12kq3 = this.LJIIJ;
                C12KQ c12kq4 = C12KQ.VERTICAL;
                if (c12kq3 != c12kq4 && c12kq3 != C12KQ.HORIZONTAL) {
                    float fMin2 = Math.min(getBounds().width(), getBounds().height()) / 2.0f;
                    linearGradient = new RadialGradient(fMin2, fMin2, fMin2, iArr, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    if (c12kq3 == c12kq4) {
                        fWidth = 0.0f;
                    } else {
                        fWidth = getBounds().width();
                    }
                    if (this.LJIIJ == c12kq4) {
                        fHeight = getBounds().height();
                    } else {
                        fHeight = 0.0f;
                    }
                    linearGradient = new LinearGradient(0.0f, 0.0f, fWidth, fHeight, iArr, (float[]) null, Shader.TileMode.CLAMP);
                }
            }
            this.LJIIIIZZ = linearGradient;
            this.LJII.setShader(linearGradient);
        }
        Rect rect = new Rect(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        C12KQ c12kq5 = this.LJIIJ;
        if (c12kq5 != C12KQ.VERTICAL && c12kq5 != C12KQ.HORIZONTAL) {
            int iWidth2 = getBounds().width();
            int iHeight2 = getBounds().height();
            float fMin3 = Math.min(iWidth2, iHeight2);
            float f4 = fMin3 / 2.0f;
            if (iWidth2 != iHeight2 && iWidth2 > 0 && iHeight2 > 0 && f4 > 0.0f) {
                float f5 = iWidth2;
                float f6 = iHeight2;
                canvas.scale(f5 / fMin3, f6 / fMin3);
                canvas.drawCircle(getBounds().left + f4, getBounds().top + f4, f4, this.LJII);
                canvas.scale(fMin3 / f5, fMin3 / f6);
                return;
            }
            canvas.drawCircle(getBounds().left + f4, getBounds().top + f4, f4, this.LJII);
            return;
        }
        canvas.drawRect(rect, this.LJII);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.LJIIIIZZ = null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LJFF = i / 255.0f;
        this.LJIIIIZZ = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LJII.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
