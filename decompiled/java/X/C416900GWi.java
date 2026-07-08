package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.bytedance.tux.drawable.TuxIconDrawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0GWi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416900GWi extends Drawable {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public TuxIconDrawable LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public String LJII = "";
    public float LJIIIIZZ;
    public float LJIIIZ;
    public final C444890HcV LJIIJ;
    public final Path LJIIJJI;
    public final RectF LJIIL;
    public final Matrix LJIILIIL;
    public float LJIILJJIL;

    @Override // android.graphics.drawable.Drawable
    @InterfaceC1294060jmO
    public final int getOpacity() {
        return -1;
    }

    public final void LIZ() {
        if (this.LJ == 2) {
            this.LJI = 44;
            this.LJFF = 44;
            return;
        }
        int length = this.LJII.length();
        if (length == 0) {
            int i = this.LIZJ;
            this.LJI = i;
            this.LJFF = i;
        } else if (length == 1) {
            this.LJI = (int) Math.ceil(this.LJIILJJIL);
            this.LJFF = (int) Math.ceil(this.LJIILJJIL);
        } else {
            this.LJFF = (int) Math.ceil(this.LJIILJJIL);
            this.LJI = (int) Math.ceil((((double) this.LJIILJJIL) * 0.6666666666666666d) + ((double) this.LJIIJ.measureText(this.LJII)));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.LJIIJ.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.LJIIJ.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.LJFF;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.LJI;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.LJFF;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.LJI;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.translate(this.LJIIIIZZ, this.LJIIIZ);
        if (this.LJ == 2) {
            TuxIconDrawable tuxIconDrawable = this.LIZLLL;
            if (tuxIconDrawable != null) {
                this.LJIIJ.setColor(this.LIZIZ);
                canvas.drawCircle(22.0f, 22.0f, 22.0f, this.LJIIJ);
                canvas.save();
                canvas.translate(8.799999f, 8.799999f);
                canvas.scale(0.6f, 0.6f);
                tuxIconDrawable.setBounds(0, 0, 44, 44);
                tuxIconDrawable.LJFF(this.LIZ);
                tuxIconDrawable.draw(canvas);
                canvas.restore();
            }
        } else {
            int length = this.LJII.length();
            if (length != 0) {
                if (length != 1) {
                    float fMeasureText = this.LJIIJ.measureText(this.LJII);
                    float f = this.LJIILJJIL;
                    float f2 = (float) ((((double) f) * 0.6666666666666666d) + ((double) fMeasureText));
                    float f3 = 2;
                    float f4 = f / f3;
                    this.LJIIJ.setColor(this.LIZIZ);
                    this.LJIIJJI.reset();
                    this.LJIIJJI.moveTo(f4, 0.0f);
                    this.LJIIJJI.lineTo(f2 - f4, 0.0f);
                    RectF rectF = this.LJIIL;
                    float f5 = f4 * f3;
                    rectF.left = f2 - f5;
                    rectF.top = 0.0f;
                    rectF.right = f2;
                    rectF.bottom = f5;
                    this.LJIIJJI.arcTo(rectF, -90.0f, 180.0f, false);
                    this.LJIIJJI.lineTo(f4, this.LJIILJJIL);
                    RectF rectF2 = this.LJIIL;
                    rectF2.left = 0.0f;
                    rectF2.top = 0.0f;
                    rectF2.right = f5;
                    rectF2.bottom = f5;
                    this.LJIIJJI.arcTo(rectF2, 90.0f, 180.0f, false);
                    this.LJIIJJI.close();
                    canvas.drawPath(this.LJIIJJI, this.LJIIJ);
                    this.LJIIJJI.reset();
                    this.LJIIJ.setColor(this.LIZ);
                    C444890HcV c444890HcV = this.LJIIJ;
                    String str = this.LJII;
                    c444890HcV.getTextPath(str, 0, str.length(), 0.0f, 0.0f, this.LJIIJJI);
                    this.LJIIJJI.computeBounds(this.LJIIL, true);
                    float fHeight = (this.LJIILJJIL - this.LJIIL.height()) / f3;
                    float fWidth = (f2 - this.LJIIL.width()) / f3;
                    this.LJIILIIL.reset();
                    Matrix matrix = this.LJIILIIL;
                    RectF rectF3 = this.LJIIL;
                    matrix.setTranslate(fWidth - rectF3.left, fHeight - rectF3.top);
                    this.LJIIJJI.transform(this.LJIILIIL);
                    canvas.drawPath(this.LJIIJJI, this.LJIIJ);
                } else {
                    float f6 = 2;
                    float f7 = this.LJIILJJIL / f6;
                    this.LJIIJ.setColor(this.LIZIZ);
                    canvas.drawCircle(f7, f7, f7, this.LJIIJ);
                    this.LJIIJ.setColor(this.LIZ);
                    C444890HcV c444890HcV2 = this.LJIIJ;
                    String str2 = this.LJII;
                    c444890HcV2.getTextPath(str2, 0, str2.length(), 0.0f, 0.0f, this.LJIIJJI);
                    this.LJIIJJI.computeBounds(this.LJIIL, true);
                    float fHeight2 = (this.LJIILJJIL - this.LJIIL.height()) / f6;
                    float fWidth2 = (this.LJIILJJIL - this.LJIIL.width()) / f6;
                    if (Intrinsics.LJFF(this.LJII, "1")) {
                        fWidth2 *= 0.9f;
                    }
                    this.LJIILIIL.reset();
                    Matrix matrix2 = this.LJIILIIL;
                    RectF rectF4 = this.LJIIL;
                    matrix2.setTranslate(fWidth2 - rectF4.left, fHeight2 - rectF4.top);
                    this.LJIIJJI.transform(this.LJIILIIL);
                    this.LJIIJ.setColor(this.LIZ);
                    canvas.drawPath(this.LJIIJJI, this.LJIIJ);
                }
            } else {
                float f8 = this.LIZJ / 2;
                this.LJIIJ.setColor(this.LIZIZ);
                canvas.drawCircle(f8, f8, f8, this.LJIIJ);
            }
        }
        canvas.translate(-this.LJIIIIZZ, -this.LJIIIZ);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LJIIJ.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LJIIJ.setColorFilter(colorFilter);
    }

    public C416900GWi(int i, int i2, int i3, int i4) {
        this.LIZ = i2;
        this.LIZIZ = i3;
        this.LIZJ = i4;
        C444890HcV c444890HcV = new C444890HcV();
        this.LJIIJ = c444890HcV;
        this.LJIIJJI = new Path();
        this.LJIIL = new RectF();
        this.LJIILIIL = new Matrix();
        c444890HcV.setAntiAlias(true);
        c444890HcV.LIZ(i);
        this.LJIILJJIL = (c444890HcV.getFontMetrics().descent - c444890HcV.getFontMetrics().ascent) + C418440Gaw.LIZIZ(3);
    }
}
