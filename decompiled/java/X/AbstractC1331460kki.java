package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0kki, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1331460kki extends Drawable implements InterfaceC1331120kkA, InterfaceC1331170kkF {
    public final Drawable LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public float LLILZ;
    public float[] LLJIJIL;
    public RectF LLJJI;
    public Matrix LLJJJIL;
    public Matrix LLJJJJ;
    public InterfaceC1331140kkC LLJL;
    public final Path LLILZIL = new Path();
    public boolean LLILZLL = true;
    public int LLIZ = 0;
    public final Path LLIZLLLIL = new Path();
    public final float[] LLJ = new float[8];
    public final float[] LLJI = new float[8];
    public final RectF LLJILJIL = new RectF();
    public final RectF LLJILJILJ = new RectF();
    public final RectF LLJILLL = new RectF();
    public final RectF LLJJ = new RectF();
    public final Matrix LLJJIII = new Matrix();
    public final Matrix LLJJIJI = new Matrix();
    public final Matrix LLJJIJIIJIL = new Matrix();
    public final Matrix LLJJIJIL = new Matrix();
    public final Matrix LLJJJ = new Matrix();
    public final Matrix LLJJJJJIL = new Matrix();
    public float LLJJJJLIIL = 0.0f;
    public boolean LLJJL = false;
    public boolean LLJJLIIIJLLLLLLLZ = true;

    public final void LIZ() {
        float[] fArr;
        if (this.LLJJLIIIJLLLLLLLZ) {
            this.LLIZLLLIL.reset();
            RectF rectF = this.LLJILJIL;
            float f = this.LLILZ;
            rectF.inset(f / 2.0f, f / 2.0f);
            if (this.LLILLJJLI) {
                this.LLIZLLLIL.addCircle(this.LLJILJIL.centerX(), this.LLJILJIL.centerY(), Math.min(this.LLJILJIL.width(), this.LLJILJIL.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i = 0;
                while (true) {
                    fArr = this.LLJI;
                    if (i >= fArr.length) {
                        break;
                    }
                    fArr[i] = (this.LLJ[i] + this.LLJJJJLIIL) - (this.LLILZ / 2.0f);
                    i++;
                }
                this.LLIZLLLIL.addRoundRect(this.LLJILJIL, fArr, Path.Direction.CW);
            }
            RectF rectF2 = this.LLJILJIL;
            float f2 = this.LLILZ;
            rectF2.inset((-f2) / 2.0f, (-f2) / 2.0f);
            this.LLILZIL.reset();
            float f3 = this.LLJJJJLIIL + (this.LLJJL ? this.LLILZ : 0.0f);
            this.LLJILJIL.inset(f3, f3);
            if (this.LLILLJJLI) {
                this.LLILZIL.addCircle(this.LLJILJIL.centerX(), this.LLJILJIL.centerY(), Math.min(this.LLJILJIL.width(), this.LLJILJIL.height()) / 2.0f, Path.Direction.CW);
            } else if (this.LLJJL) {
                if (this.LLJIJIL == null) {
                    this.LLJIJIL = new float[8];
                }
                for (int i2 = 0; i2 < this.LLJI.length; i2++) {
                    this.LLJIJIL[i2] = this.LLJ[i2] - this.LLILZ;
                }
                this.LLILZIL.addRoundRect(this.LLJILJIL, this.LLJIJIL, Path.Direction.CW);
            } else {
                this.LLILZIL.addRoundRect(this.LLJILJIL, this.LLJ, Path.Direction.CW);
            }
            float f4 = -f3;
            this.LLJILJIL.inset(f4, f4);
            this.LLILZIL.setFillType(Path.FillType.WINDING);
            this.LLJJLIIIJLLLLLLLZ = false;
        }
    }

    public final void LIZIZ() {
        Matrix matrix;
        InterfaceC1331140kkC interfaceC1331140kkC = this.LLJL;
        if (interfaceC1331140kkC != null) {
            interfaceC1331140kkC.LJFF(this.LLJJIJIIJIL);
            this.LLJL.LIZIZ(this.LLJILJIL);
        } else {
            this.LLJJIJIIJIL.reset();
            this.LLJILJIL.set(getBounds());
        }
        Drawable drawable = this.LL;
        if (drawable instanceof BitmapDrawable) {
            this.LLJILLL.set(0.0f, 0.0f, r4.getBitmap().getWidth(), r4.getBitmap().getHeight());
            this.LLJJ.set(((BitmapDrawable) drawable).getBounds());
        } else {
            this.LLJILLL.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
            this.LLJJ.set(this.LL.getBounds());
        }
        this.LLJJIII.setRectToRect(this.LLJILLL, this.LLJJ, Matrix.ScaleToFit.FILL);
        if (this.LLJJL) {
            RectF rectF = this.LLJJI;
            if (rectF == null) {
                this.LLJJI = new RectF(this.LLJILJIL);
            } else {
                rectF.set(this.LLJILJIL);
            }
            RectF rectF2 = this.LLJJI;
            float f = this.LLILZ;
            rectF2.inset(f, f);
            if (this.LLJJJIL == null) {
                this.LLJJJIL = new Matrix();
            }
            this.LLJJJIL.setRectToRect(this.LLJILJIL, this.LLJJI, Matrix.ScaleToFit.FILL);
        } else {
            Matrix matrix2 = this.LLJJJIL;
            if (matrix2 != null) {
                matrix2.reset();
            }
        }
        if (!this.LLJJIJIIJIL.equals(this.LLJJIJIL) || !this.LLJJIII.equals(this.LLJJIJI) || ((matrix = this.LLJJJIL) != null && !matrix.equals(this.LLJJJJ))) {
            this.LLILZLL = true;
            this.LLJJIJIIJIL.invert(this.LLJJJ);
            this.LLJJJJJIL.set(this.LLJJIJIIJIL);
            if (this.LLJJL) {
                this.LLJJJJJIL.postConcat(this.LLJJJIL);
            }
            this.LLJJJJJIL.preConcat(this.LLJJIII);
            this.LLJJIJIL.set(this.LLJJIJIIJIL);
            this.LLJJIJI.set(this.LLJJIII);
            if (this.LLJJL) {
                Matrix matrix3 = this.LLJJJJ;
                if (matrix3 == null) {
                    this.LLJJJJ = new Matrix(this.LLJJJIL);
                } else {
                    matrix3.set(this.LLJJJIL);
                }
            } else {
                Matrix matrix4 = this.LLJJJJ;
                if (matrix4 != null) {
                    matrix4.reset();
                }
            }
        }
        if (this.LLJILJIL.equals(this.LLJILJILJ)) {
            return;
        }
        this.LLJJLIIIJLLLLLLLZ = true;
        this.LLJILJILJ.set(this.LLJILJIL);
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        this.LL.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.LL.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.LL.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.LL.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.LL.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.LL.getOpacity();
    }

    public AbstractC1331460kki(Drawable drawable) {
        this.LL = drawable;
    }

    @Override // X.InterfaceC1331120kkA
    public final void LJ(float[] fArr) {
        boolean z;
        boolean z2;
        if (fArr == null) {
            Arrays.fill(this.LLJ, 0.0f);
            this.LLILLL = false;
        } else {
            if (fArr.length == 8) {
                z = true;
            } else {
                z = false;
            }
            C1322350kW1.LIZ("radii should have exactly 8 values", z);
            System.arraycopy(fArr, 0, this.LLJ, 0, 8);
            this.LLILLL = false;
            int i = 0;
            do {
                boolean z3 = this.LLILLL;
                if (fArr[i] > 0.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.LLILLL = z3 | z2;
                i++;
            } while (i < 8);
        }
        this.LLJJLIIIJLLLLLLLZ = true;
        invalidateSelf();
    }

    @Override // X.InterfaceC1331120kkA
    public final void LJII(boolean z) {
        if (this.LLJJL != z) {
            this.LLJJL = z;
            this.LLJJLIIIJLLLLLLLZ = true;
            invalidateSelf();
        }
    }

    @Override // X.InterfaceC1331120kkA
    public final void LJIIIIZZ(boolean z) {
        this.LLILLJJLI = z;
        this.LLJJLIIIJLLLLLLLZ = true;
        invalidateSelf();
    }

    @Override // X.InterfaceC1331170kkF
    public final void LJIIIZ(InterfaceC1331140kkC interfaceC1331140kkC) {
        this.LLJL = interfaceC1331140kkC;
    }

    @Override // X.InterfaceC1331120kkA
    public final void LJIIJJI(float f) {
        if (this.LLJJJJLIIL != f) {
            this.LLJJJJLIIL = f;
            this.LLJJLIIIJLLLLLLLZ = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C1336010ks3.LIZIZ();
        this.LL.draw(canvas);
        C1336010ks3.LIZIZ();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.LL.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.LL.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.LL.setColorFilter(colorFilter);
    }

    @Override // X.InterfaceC1331120kkA
    public final void setRadius(float f) {
        boolean z;
        boolean z2 = false;
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LJFF(z);
        Arrays.fill(this.LLJ, f);
        if (f != 0.0f) {
            z2 = true;
        }
        this.LLILLL = z2;
        this.LLJJLIIIJLLLLLLLZ = true;
        invalidateSelf();
    }

    @Override // X.InterfaceC1331120kkA
    public final void LJIIJ(float f, int i) {
        if (this.LLIZ != i || this.LLILZ != f) {
            this.LLIZ = i;
            this.LLILZ = f;
            this.LLJJLIIIJLLLLLLLZ = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i, PorterDuff.Mode mode) {
        this.LL.setColorFilter(i, mode);
    }
}
