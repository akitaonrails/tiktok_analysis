package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0kWo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1322840kWo extends C1331050kk3 implements InterfaceC1331120kkA {
    public final EnumC1322860kWq LLILZIL;
    public final RectF LLILZLL;
    public RectF LLIZ;
    public Matrix LLIZLLLIL;
    public final float[] LLJ;
    public final float[] LLJI;
    public final Paint LLJIJIL;
    public boolean LLJILJIL;
    public float LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public float LLJJI;
    public boolean LLJJIII;
    public final Path LLJJIJI;
    public final Path LLJJIJIIJIL;
    public final RectF LLJJIJIL;

    public final void LJIILJJIL() {
        float[] fArr;
        this.LLJJIJI.reset();
        this.LLJJIJIIJIL.reset();
        this.LLJJIJIL.set(getBounds());
        RectF rectF = this.LLJJIJIL;
        float f = this.LLJJI;
        rectF.inset(f, f);
        this.LLJJIJI.addRect(this.LLJJIJIL, Path.Direction.CW);
        if (this.LLJILJIL) {
            this.LLJJIJI.addCircle(this.LLJJIJIL.centerX(), this.LLJJIJIL.centerY(), Math.min(this.LLJJIJIL.width(), this.LLJJIJIL.height()) / 2.0f, Path.Direction.CW);
        } else {
            this.LLJJIJI.addRoundRect(this.LLJJIJIL, this.LLJ, Path.Direction.CW);
        }
        RectF rectF2 = this.LLJJIJIL;
        float f2 = this.LLJJI;
        rectF2.inset(-f2, -f2);
        RectF rectF3 = this.LLJJIJIL;
        float f3 = this.LLJILJILJ;
        rectF3.inset(f3 / 2.0f, f3 / 2.0f);
        if (this.LLJILJIL) {
            this.LLJJIJIIJIL.addCircle(this.LLJJIJIL.centerX(), this.LLJJIJIL.centerY(), Math.min(this.LLJJIJIL.width(), this.LLJJIJIL.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i = 0;
            while (true) {
                fArr = this.LLJI;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = (this.LLJ[i] + this.LLJJI) - (this.LLJILJILJ / 2.0f);
                i++;
            }
            this.LLJJIJIIJIL.addRoundRect(this.LLJJIJIL, fArr, Path.Direction.CW);
        }
        RectF rectF4 = this.LLJJIJIL;
        float f4 = this.LLJILJILJ;
        rectF4.inset((-f4) / 2.0f, (-f4) / 2.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1322840kWo(Drawable drawable) {
        super(drawable);
        drawable.getClass();
        this.LLILZIL = EnumC1322860kWq.OVERLAY_COLOR;
        this.LLILZLL = new RectF();
        this.LLJ = new float[8];
        this.LLJI = new float[8];
        this.LLJIJIL = new Paint(1);
        this.LLJILJIL = false;
        this.LLJILJILJ = 0.0f;
        this.LLJILLL = 0;
        this.LLJJ = 0;
        this.LLJJI = 0.0f;
        this.LLJJIII = false;
        this.LLJJIJI = new Path();
        this.LLJJIJIIJIL = new Path();
        this.LLJJIJIL = new RectF();
    }

    @Override // X.InterfaceC1331120kkA
    public final void LJ(float[] fArr) {
        boolean z;
        if (fArr == null) {
            Arrays.fill(this.LLJ, 0.0f);
        } else {
            if (fArr.length == 8) {
                z = true;
            } else {
                z = false;
            }
            C1322350kW1.LIZ("radii should have exactly 8 values", z);
            System.arraycopy(fArr, 0, this.LLJ, 0, 8);
        }
        LJIILJJIL();
        invalidateSelf();
    }

    @Override // X.InterfaceC1331120kkA
    public final void LJII(boolean z) {
        this.LLJJIII = z;
        LJIILJJIL();
        invalidateSelf();
    }

    @Override // X.InterfaceC1331120kkA
    public final void LJIIIIZZ(boolean z) {
        this.LLJILJIL = z;
        LJIILJJIL();
        invalidateSelf();
    }

    @Override // X.InterfaceC1331120kkA
    public final void LJIIJJI(float f) {
        this.LLJJI = f;
        LJIILJJIL();
        invalidateSelf();
    }

    @Override // X.C1331050kk3, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.LLILZLL.set(getBounds());
        int i = C1322850kWp.LIZ[this.LLILZIL.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (this.LLJJIII) {
                    RectF rectF = this.LLIZ;
                    if (rectF == null) {
                        this.LLIZ = new RectF(this.LLILZLL);
                        this.LLIZLLLIL = new Matrix();
                    } else {
                        rectF.set(this.LLILZLL);
                    }
                    RectF rectF2 = this.LLIZ;
                    float f = this.LLJILJILJ;
                    rectF2.inset(f, f);
                    this.LLIZLLLIL.setRectToRect(this.LLILZLL, this.LLIZ, Matrix.ScaleToFit.FILL);
                    int iSave = canvas.save();
                    canvas.clipRect(this.LLILZLL);
                    canvas.concat(this.LLIZLLLIL);
                    super.draw(canvas);
                    canvas.restoreToCount(iSave);
                } else {
                    super.draw(canvas);
                }
                this.LLJIJIL.setStyle(Paint.Style.FILL);
                this.LLJIJIL.setColor(this.LLJJ);
                this.LLJIJIL.setStrokeWidth(0.0f);
                this.LLJJIJI.setFillType(Path.FillType.EVEN_ODD);
                canvas.drawPath(this.LLJJIJI, this.LLJIJIL);
                if (this.LLJILJIL) {
                    float fWidth = ((this.LLILZLL.width() - this.LLILZLL.height()) + this.LLJILJILJ) / 2.0f;
                    float fHeight = ((this.LLILZLL.height() - this.LLILZLL.width()) + this.LLJILJILJ) / 2.0f;
                    if (fWidth > 0.0f) {
                        RectF rectF3 = this.LLILZLL;
                        float f2 = rectF3.left;
                        canvas.drawRect(f2, rectF3.top, f2 + fWidth, rectF3.bottom, this.LLJIJIL);
                        RectF rectF4 = this.LLILZLL;
                        float f3 = rectF4.right;
                        canvas.drawRect(f3 - fWidth, rectF4.top, f3, rectF4.bottom, this.LLJIJIL);
                    }
                    if (fHeight > 0.0f) {
                        RectF rectF5 = this.LLILZLL;
                        float f4 = rectF5.left;
                        float f5 = rectF5.top;
                        canvas.drawRect(f4, f5, rectF5.right, f5 + fHeight, this.LLJIJIL);
                        RectF rectF6 = this.LLILZLL;
                        float f6 = rectF6.left;
                        float f7 = rectF6.bottom;
                        canvas.drawRect(f6, f7 - fHeight, rectF6.right, f7, this.LLJIJIL);
                    }
                }
            }
        } else {
            int iSave2 = canvas.save();
            this.LLJJIJI.setFillType(Path.FillType.EVEN_ODD);
            canvas.clipPath(this.LLJJIJI);
            super.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        if (this.LLJILLL != 0) {
            this.LLJIJIL.setStyle(Paint.Style.STROKE);
            this.LLJIJIL.setColor(this.LLJILLL);
            this.LLJIJIL.setStrokeWidth(this.LLJILJILJ);
            this.LLJJIJI.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.LLJJIJIIJIL, this.LLJIJIL);
        }
    }

    @Override // X.C1331050kk3, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        LJIILJJIL();
    }

    @Override // X.InterfaceC1331120kkA
    public final void setRadius(float f) {
        Arrays.fill(this.LLJ, 0.0f);
        LJIILJJIL();
        invalidateSelf();
    }

    @Override // X.InterfaceC1331120kkA
    public final void LJIIJ(float f, int i) {
        this.LLJILLL = i;
        this.LLJILJILJ = f;
        LJIILJJIL();
        invalidateSelf();
    }
}
