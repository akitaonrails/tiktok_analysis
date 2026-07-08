package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0HNx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C440190HNx extends Drawable implements InterfaceC1331120kkA {
    public final float[] LL;
    public final float[] LLILLJJLI;
    public float[] LLILLL;
    public final Paint LLILZ;
    public boolean LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public int LLIZLLLIL;
    public boolean LLJ;
    public final Path LLJI;
    public final Path LLJIJIL;
    public int LLJILJIL;
    public final RectF LLJILJILJ;
    public int LLJILLL;

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void LIZ() {
        float[] fArr;
        float[] fArr2;
        this.LLJI.reset();
        this.LLJIJIL.reset();
        this.LLJILJILJ.set(getBounds());
        RectF rectF = this.LLJILJILJ;
        float f = this.LLILZLL;
        rectF.inset(f / 2.0f, f / 2.0f);
        int i = 0;
        if (this.LLILZIL) {
            this.LLJIJIL.addCircle(this.LLJILJILJ.centerX(), this.LLJILJILJ.centerY(), Math.min(this.LLJILJILJ.width(), this.LLJILJILJ.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i2 = 0;
            while (true) {
                fArr = this.LLILLJJLI;
                if (i2 >= fArr.length) {
                    break;
                }
                fArr[i2] = (this.LL[i2] + this.LLIZ) - (this.LLILZLL / 2.0f);
                i2++;
            }
            this.LLJIJIL.addRoundRect(this.LLJILJILJ, fArr, Path.Direction.CW);
        }
        RectF rectF2 = this.LLJILJILJ;
        float f2 = this.LLILZLL;
        rectF2.inset((-f2) / 2.0f, (-f2) / 2.0f);
        float f3 = this.LLIZ + (this.LLJ ? this.LLILZLL : 0.0f);
        this.LLJILJILJ.inset(f3, f3);
        if (this.LLILZIL) {
            this.LLJI.addCircle(this.LLJILJILJ.centerX(), this.LLJILJILJ.centerY(), Math.min(this.LLJILJILJ.width(), this.LLJILJILJ.height()) / 2.0f, Path.Direction.CW);
        } else if (this.LLJ) {
            if (this.LLILLL == null) {
                this.LLILLL = new float[8];
            }
            while (true) {
                fArr2 = this.LLILLL;
                if (i >= fArr2.length) {
                    break;
                }
                fArr2[i] = this.LL[i] - this.LLILZLL;
                i++;
            }
            this.LLJI.addRoundRect(this.LLJILJILJ, fArr2, Path.Direction.CW);
        } else {
            this.LLJI.addRoundRect(this.LLJILJILJ, this.LL, Path.Direction.CW);
        }
        float f4 = -f3;
        this.LLJILJILJ.inset(f4, f4);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int iLIZIZ = C1331180kkG.LIZIZ(this.LLJILJIL, this.LLJILLL) >>> 24;
        if (iLIZIZ == 255) {
            return -1;
        }
        return iLIZIZ == 0 ? -2 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.LLJILLL;
    }

    public C440190HNx(int i) {
        this.LL = new float[8];
        this.LLILLJJLI = new float[8];
        this.LLILZ = new Paint(1);
        this.LLILZIL = false;
        this.LLILZLL = 0.0f;
        this.LLIZ = 0.0f;
        this.LLIZLLLIL = 0;
        this.LLJ = false;
        this.LLJI = new Path();
        this.LLJIJIL = new Path();
        this.LLJILJIL = 0;
        this.LLJILJILJ = new RectF();
        this.LLJILLL = 255;
        if (this.LLJILJIL != i) {
            this.LLJILJIL = i;
            invalidateSelf();
        }
    }

    @Override // X.InterfaceC1331120kkA
    public final void LJ(float[] fArr) {
        boolean z;
        if (fArr == null) {
            Arrays.fill(this.LL, 0.0f);
        } else {
            if (fArr.length == 8) {
                z = true;
            } else {
                z = false;
            }
            C1322350kW1.LIZ("radii should have exactly 8 values", z);
            System.arraycopy(fArr, 0, this.LL, 0, 8);
        }
        LIZ();
        invalidateSelf();
    }

    @Override // X.InterfaceC1331120kkA
    public final void LJII(boolean z) {
        if (this.LLJ != z) {
            this.LLJ = z;
            LIZ();
            invalidateSelf();
        }
    }

    @Override // X.InterfaceC1331120kkA
    public final void LJIIIIZZ(boolean z) {
        this.LLILZIL = z;
        LIZ();
        invalidateSelf();
    }

    @Override // X.InterfaceC1331120kkA
    public final void LJIIJJI(float f) {
        if (this.LLIZ != f) {
            this.LLIZ = f;
            LIZ();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.LLILZ.setColor(C1331180kkG.LIZIZ(this.LLJILJIL, this.LLJILLL));
        this.LLILZ.setStyle(Paint.Style.FILL);
        canvas.drawPath(this.LLJI, this.LLILZ);
        if (this.LLILZLL != 0.0f) {
            this.LLILZ.setColor(C1331180kkG.LIZIZ(this.LLIZLLLIL, this.LLJILLL));
            this.LLILZ.setStyle(Paint.Style.STROKE);
            this.LLILZ.setStrokeWidth(this.LLILZLL);
            canvas.drawPath(this.LLJIJIL, this.LLILZ);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        LIZ();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.LLJILLL) {
            this.LLJILLL = i;
            invalidateSelf();
        }
    }

    @Override // X.InterfaceC1331120kkA
    public final void setRadius(float f) {
        boolean z;
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LIZ("radius should be non negative", z);
        Arrays.fill(this.LL, f);
        LIZ();
        invalidateSelf();
    }

    public C440190HNx(float f, int i) {
        this(i);
        setRadius(f);
    }

    @Override // X.InterfaceC1331120kkA
    public final void LJIIJ(float f, int i) {
        if (this.LLIZLLLIL != i) {
            this.LLIZLLLIL = i;
            invalidateSelf();
        }
        if (this.LLILZLL != f) {
            this.LLILZLL = f;
            LIZ();
            invalidateSelf();
        }
    }
}
