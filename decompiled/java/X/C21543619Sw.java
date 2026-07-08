package X;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.19Sw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21543619Sw {
    public final View LIZ;
    public boolean LIZIZ;
    public float LIZJ;
    public final Rect LIZLLL;
    public final Rect LJ;
    public final RectF LJFF;
    public ColorStateList LJIIJ;
    public ColorStateList LJIIJJI;
    public float LJIIL;
    public float LJIILIIL;
    public float LJIILJJIL;
    public float LJIILL;
    public float LJIILLIIL;
    public float LJIIZILJ;
    public Typeface LJIJ;
    public Typeface LJIJI;
    public Typeface LJIJJ;
    public C19TC LJIJJLI;
    public C19TC LJIL;
    public CharSequence LJJ;
    public CharSequence LJJI;
    public boolean LJJIFFI;
    public Bitmap LJJII;
    public float LJJIII;
    public float LJJIIJ;
    public int[] LJJIIJZLJL;
    public boolean LJJIIZ;
    public final TextPaint LJJIIZI;
    public final TextPaint LJJIJ;
    public TimeInterpolator LJJIJIIJI;
    public TimeInterpolator LJJIJIIJIL;
    public float LJJIJIL;
    public float LJJIJL;
    public float LJJIJLIJ;
    public ColorStateList LJJIL;
    public float LJJIZ;
    public float LJJJ;
    public float LJJJI;
    public ColorStateList LJJJIL;
    public float LJJJJ;
    public float LJJJJI;
    public StaticLayout LJJJJIZL;
    public float LJJJJJ;
    public float LJJJJJL;
    public float LJJJJL;
    public CharSequence LJJJJLI;
    public int LJI = 16;
    public int LJII = 16;
    public float LJIIIIZZ = 15.0f;
    public float LJIIIZ = 15.0f;
    public int LJJJJLL = 1;

    public final float LIZIZ() {
        if (this.LJJ == null) {
            return 0.0f;
        }
        TextPaint textPaint = this.LJJIJ;
        textPaint.setTextSize(this.LJIIIZ);
        textPaint.setTypeface(this.LJIJ);
        textPaint.setLetterSpacing(this.LJJJJ);
        TextPaint textPaint2 = this.LJJIJ;
        CharSequence charSequence = this.LJJ;
        return textPaint2.measureText(charSequence, 0, charSequence.length());
    }

    public final float LJFF() {
        TextPaint textPaint = this.LJJIJ;
        textPaint.setTextSize(this.LJIIIZ);
        textPaint.setTypeface(this.LJIJ);
        textPaint.setLetterSpacing(this.LJJJJ);
        return -this.LJJIJ.ascent();
    }

    public final void LJIIIIZZ() {
        this.LIZIZ = this.LJ.width() > 0 && this.LJ.height() > 0 && this.LIZLLL.width() > 0 && this.LIZLLL.height() > 0;
    }

    public final void LJIIIZ() {
        StaticLayout staticLayout;
        if (this.LIZ.getHeight() <= 0 || this.LIZ.getWidth() <= 0) {
            return;
        }
        float f = this.LJJIIJ;
        LIZLLL(this.LJIIIZ);
        CharSequence charSequence = this.LJJI;
        if (charSequence != null && (staticLayout = this.LJJJJIZL) != null) {
            this.LJJJJLI = TextUtils.ellipsize(charSequence, this.LJJIIZI, staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.LJJJJLI;
        float fMeasureText = charSequence2 != null ? this.LJJIIZI.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        int absoluteGravity = Gravity.getAbsoluteGravity(this.LJII, this.LJJIFFI ? 1 : 0);
        int i = absoluteGravity & 112;
        if (i == 48) {
            this.LJIILIIL = this.LJ.top;
        } else if (i != 80) {
            this.LJIILIIL = this.LJ.centerY() - ((this.LJJIIZI.descent() - this.LJJIIZI.ascent()) / 2.0f);
        } else {
            this.LJIILIIL = this.LJ.bottom + this.LJJIIZI.ascent();
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.LJIILL = this.LJ.centerX() - (fMeasureText / 2.0f);
        } else if (i2 != 5) {
            this.LJIILL = this.LJ.left;
        } else {
            this.LJIILL = this.LJ.right - fMeasureText;
        }
        LIZLLL(this.LJIIIIZZ);
        float height = this.LJJJJIZL != null ? r0.getHeight() : 0.0f;
        CharSequence charSequence3 = this.LJJI;
        float fMeasureText2 = charSequence3 != null ? this.LJJIIZI.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        StaticLayout staticLayout2 = this.LJJJJIZL;
        if (staticLayout2 != null && this.LJJJJLL > 1 && !this.LJJIFFI) {
            fMeasureText2 = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.LJJJJIZL;
        this.LJJJJL = staticLayout3 != null ? staticLayout3.getLineLeft(0) : 0.0f;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.LJI, this.LJJIFFI ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        if (i3 == 48) {
            this.LJIIL = this.LIZLLL.top;
        } else if (i3 != 80) {
            this.LJIIL = this.LIZLLL.centerY() - (height / 2.0f);
        } else {
            this.LJIIL = (this.LIZLLL.bottom - height) + this.LJJIIZI.descent();
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.LJIILJJIL = this.LIZLLL.centerX() - (fMeasureText2 / 2.0f);
        } else if (i4 != 5) {
            this.LJIILJJIL = this.LIZLLL.left;
        } else {
            this.LJIILJJIL = this.LIZLLL.right - fMeasureText2;
        }
        Bitmap bitmap = this.LJJII;
        if (bitmap != null) {
            C786410Ut5.LJJJJ(bitmap);
            this.LJJII = null;
        }
        LJIILJJIL(f);
        float f2 = this.LIZJ;
        this.LJFF.left = LJII(this.LIZLLL.left, this.LJ.left, f2, this.LJJIJIIJI);
        this.LJFF.top = LJII(this.LJIIL, this.LJIILIIL, f2, this.LJJIJIIJI);
        this.LJFF.right = LJII(this.LIZLLL.right, this.LJ.right, f2, this.LJJIJIIJI);
        this.LJFF.bottom = LJII(this.LIZLLL.bottom, this.LJ.bottom, f2, this.LJJIJIIJI);
        this.LJIILLIIL = LJII(this.LJIILJJIL, this.LJIILL, f2, this.LJJIJIIJI);
        this.LJIIZILJ = LJII(this.LJIIL, this.LJIILIIL, f2, this.LJJIJIIJI);
        LJIILJJIL(LJII(this.LJIIIIZZ, this.LJIIIZ, f2, this.LJJIJIIJIL));
        C12DM c12dm = C194V.LIZIZ;
        this.LJJJJJ = 1.0f - LJII(0.0f, 1.0f, 1.0f - f2, c12dm);
        this.LIZ.postInvalidateOnAnimation();
        this.LJJJJJL = LJII(1.0f, 0.0f, f2, c12dm);
        this.LIZ.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.LJIIJJI;
        ColorStateList colorStateList2 = this.LJIIJ;
        if (colorStateList != colorStateList2) {
            this.LJJIIZI.setColor(LIZ(f2, LJI(colorStateList2), LJI(this.LJIIJJI)));
        } else {
            this.LJJIIZI.setColor(LJI(colorStateList));
        }
        float f3 = this.LJJJJ;
        float f4 = this.LJJJJI;
        if (f3 != f4) {
            this.LJJIIZI.setLetterSpacing(LJII(f4, f3, f2, c12dm));
        } else {
            this.LJJIIZI.setLetterSpacing(f3);
        }
        this.LJJIIZI.setShadowLayer(LJII(this.LJJIZ, this.LJJIJIL, f2, null), LJII(this.LJJJ, this.LJJIJL, f2, null), LJII(this.LJJJI, this.LJJIJLIJ, f2, null), LIZ(f2, LJI(this.LJJJIL), LJI(this.LJJIL)));
        this.LIZ.postInvalidateOnAnimation();
    }

    public C21543619Sw(View view) {
        this.LIZ = view;
        TextPaint textPaint = new TextPaint(129);
        this.LJJIIZI = textPaint;
        this.LJJIJ = new TextPaint(textPaint);
        this.LJ = new Rect();
        this.LIZLLL = new Rect();
        this.LJFF = new RectF();
    }

    public final boolean LIZJ(CharSequence charSequence) {
        C21626719kP c21626719kP;
        if (this.LIZ.getLayoutDirection() == 1) {
            c21626719kP = C21626919kR.LIZLLL;
        } else {
            c21626719kP = C21626919kR.LIZJ;
        }
        return c21626719kP.LIZ(charSequence.length(), charSequence);
    }

    public final void LIZLLL(float f) {
        boolean z;
        float f2;
        boolean z2;
        boolean z3;
        StaticLayout staticLayoutLIZ;
        if (this.LJJ == null) {
            return;
        }
        float fWidth = this.LJ.width();
        float fWidth2 = this.LIZLLL.width();
        int i = 1;
        if (Math.abs(f - this.LJIIIZ) < 0.001f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f2 = this.LJIIIZ;
            this.LJJIII = 1.0f;
            Typeface typeface = this.LJIJJ;
            Typeface typeface2 = this.LJIJ;
            if (typeface != typeface2) {
                this.LJIJJ = typeface2;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            f2 = this.LJIIIIZZ;
            Typeface typeface3 = this.LJIJJ;
            Typeface typeface4 = this.LJIJI;
            if (typeface3 != typeface4) {
                this.LJIJJ = typeface4;
                z2 = true;
            } else {
                z2 = false;
            }
            if (Math.abs(f - f2) < 0.001f) {
                this.LJJIII = 1.0f;
            } else {
                this.LJJIII = f / this.LJIIIIZZ;
            }
            float f3 = this.LJIIIZ / this.LJIIIIZZ;
            fWidth = fWidth2 * f3 > fWidth ? Math.min(fWidth / f3, fWidth2) : fWidth2;
        }
        if (fWidth > 0.0f) {
            if (this.LJJIIJ == f2 && !this.LJJIIZ && !z2) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.LJJIIJ = f2;
            this.LJJIIZ = false;
        }
        if (this.LJJI == null || z2) {
            this.LJJIIZI.setTextSize(this.LJJIIJ);
            this.LJJIIZI.setTypeface(this.LJIJJ);
            TextPaint textPaint = this.LJJIIZI;
            if (this.LJJIII != 1.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            textPaint.setLinearText(z3);
            boolean zLIZJ = LIZJ(this.LJJ);
            this.LJJIFFI = zLIZJ;
            int i2 = this.LJJJJLL;
            if (i2 > 1 && !zLIZJ) {
                i = i2;
            }
            try {
                C21409018qO c21409018qO = new C21409018qO((int) fWidth, this.LJJIIZI, this.LJJ);
                c21409018qO.LJIIIIZZ = TextUtils.TruncateAt.END;
                c21409018qO.LJII = zLIZJ;
                c21409018qO.LJ = Layout.Alignment.ALIGN_NORMAL;
                c21409018qO.LJI = false;
                c21409018qO.LJFF = i;
                staticLayoutLIZ = c21409018qO.LIZ();
            } catch (C21409118qP e) {
                TryCatchGuardChecker.doCheck(e);
                staticLayoutLIZ = null;
            }
            staticLayoutLIZ.getClass();
            this.LJJJJIZL = staticLayoutLIZ;
            this.LJJI = staticLayoutLIZ.getText();
        }
    }

    public final void LJ(Canvas canvas) {
        int iSave = canvas.save();
        if (this.LJJI != null && this.LIZIZ) {
            float lineLeft = (this.LJIILLIIL + this.LJJJJIZL.getLineLeft(0)) - (this.LJJJJL * 2.0f);
            this.LJJIIZI.setTextSize(this.LJJIIJ);
            float f = this.LJIILLIIL;
            float f2 = this.LJIIZILJ;
            float f3 = this.LJJIII;
            if (f3 != 1.0f) {
                canvas.scale(f3, f3, f, f2);
            }
            if (this.LJJJJLL > 1 && !this.LJJIFFI) {
                int alpha = this.LJJIIZI.getAlpha();
                canvas.translate(lineLeft, f2);
                float f4 = alpha;
                this.LJJIIZI.setAlpha((int) (this.LJJJJJL * f4));
                this.LJJJJIZL.draw(canvas);
                this.LJJIIZI.setAlpha((int) (this.LJJJJJ * f4));
                int lineBaseline = this.LJJJJIZL.getLineBaseline(0);
                CharSequence charSequence = this.LJJJJLI;
                float f5 = lineBaseline;
                canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f5, this.LJJIIZI);
                String strTrim = this.LJJJJLI.toString().trim();
                if (strTrim.endsWith("…")) {
                    strTrim = strTrim.substring(0, strTrim.length() - 1);
                }
                this.LJJIIZI.setAlpha(alpha);
                canvas.drawText(strTrim, 0, Math.min(this.LJJJJIZL.getLineEnd(0), strTrim.length()), 0.0f, f5, (Paint) this.LJJIIZI);
            } else {
                canvas.translate(f, f2);
                this.LJJJJIZL.draw(canvas);
            }
            canvas.restoreToCount(iSave);
        }
    }

    public final int LJI(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.LJJIIJZLJL;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final void LJIIJ(int i) {
        C19Q9 c19q9 = new C19Q9(this.LIZ.getContext(), i);
        ColorStateList colorStateList = c19q9.LIZ;
        if (colorStateList != null) {
            this.LJIIJJI = colorStateList;
        }
        float f = c19q9.LJIIJ;
        if (f != 0.0f) {
            this.LJIIIZ = f;
        }
        ColorStateList colorStateList2 = c19q9.LIZIZ;
        if (colorStateList2 != null) {
            this.LJJIL = colorStateList2;
        }
        this.LJJIJL = c19q9.LJFF;
        this.LJJIJLIJ = c19q9.LJI;
        this.LJJIJIL = c19q9.LJII;
        this.LJJJJ = c19q9.LJIIIZ;
        C19TC c19tc = this.LJIL;
        if (c19tc != null) {
            c19tc.LIZJ = true;
        }
        C19TD c19td = new C19TD() { // from class: X.19T5
            @Override // X.C19TD
            public final void LIZ(Typeface typeface) {
                C21543619Sw c21543619Sw = this.LIZ;
                C19TC c19tc2 = c21543619Sw.LJIL;
                if (c19tc2 != null) {
                    c19tc2.LIZJ = true;
                }
                if (c21543619Sw.LJIJ != typeface) {
                    c21543619Sw.LJIJ = typeface;
                    c21543619Sw.LJIIIZ();
                }
            }
        };
        c19q9.LIZ();
        this.LJIL = new C19TC(c19td, c19q9.LJIILIIL);
        c19q9.LIZIZ(this.LIZ.getContext(), this.LJIL);
        LJIIIZ();
    }

    public final void LJIIJJI(ColorStateList colorStateList) {
        if (this.LJIIJJI != colorStateList) {
            this.LJIIJJI = colorStateList;
            LJIIIZ();
        }
    }

    public final void LJIIL(int i) {
        C19Q9 c19q9 = new C19Q9(this.LIZ.getContext(), i);
        ColorStateList colorStateList = c19q9.LIZ;
        if (colorStateList != null) {
            this.LJIIJ = colorStateList;
        }
        float f = c19q9.LJIIJ;
        if (f != 0.0f) {
            this.LJIIIIZZ = f;
        }
        ColorStateList colorStateList2 = c19q9.LIZIZ;
        if (colorStateList2 != null) {
            this.LJJJIL = colorStateList2;
        }
        this.LJJJ = c19q9.LJFF;
        this.LJJJI = c19q9.LJI;
        this.LJJIZ = c19q9.LJII;
        this.LJJJJI = c19q9.LJIIIZ;
        C19TC c19tc = this.LJIJJLI;
        if (c19tc != null) {
            c19tc.LIZJ = true;
        }
        C19TD c19td = new C19TD() { // from class: X.19T6
            @Override // X.C19TD
            public final void LIZ(Typeface typeface) {
                C21543619Sw c21543619Sw = this.LIZ;
                C19TC c19tc2 = c21543619Sw.LJIJJLI;
                if (c19tc2 != null) {
                    c19tc2.LIZJ = true;
                }
                if (c21543619Sw.LJIJI != typeface) {
                    c21543619Sw.LJIJI = typeface;
                    c21543619Sw.LJIIIZ();
                }
            }
        };
        c19q9.LIZ();
        this.LJIJJLI = new C19TC(c19td, c19q9.LJIILIIL);
        c19q9.LIZIZ(this.LIZ.getContext(), this.LJIJJLI);
        LJIIIZ();
    }

    public final void LJIILIIL(float f) {
        float fLIZ = C419990GdR.LIZ(f, 0.0f, 1.0f);
        if (fLIZ != this.LIZJ) {
            this.LIZJ = fLIZ;
            this.LJFF.left = LJII(this.LIZLLL.left, this.LJ.left, fLIZ, this.LJJIJIIJI);
            this.LJFF.top = LJII(this.LJIIL, this.LJIILIIL, fLIZ, this.LJJIJIIJI);
            this.LJFF.right = LJII(this.LIZLLL.right, this.LJ.right, fLIZ, this.LJJIJIIJI);
            this.LJFF.bottom = LJII(this.LIZLLL.bottom, this.LJ.bottom, fLIZ, this.LJJIJIIJI);
            this.LJIILLIIL = LJII(this.LJIILJJIL, this.LJIILL, fLIZ, this.LJJIJIIJI);
            this.LJIIZILJ = LJII(this.LJIIL, this.LJIILIIL, fLIZ, this.LJJIJIIJI);
            LJIILJJIL(LJII(this.LJIIIIZZ, this.LJIIIZ, fLIZ, this.LJJIJIIJIL));
            C12DM c12dm = C194V.LIZIZ;
            this.LJJJJJ = 1.0f - LJII(0.0f, 1.0f, 1.0f - fLIZ, c12dm);
            this.LIZ.postInvalidateOnAnimation();
            this.LJJJJJL = LJII(1.0f, 0.0f, fLIZ, c12dm);
            this.LIZ.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.LJIIJJI;
            ColorStateList colorStateList2 = this.LJIIJ;
            if (colorStateList != colorStateList2) {
                this.LJJIIZI.setColor(LIZ(fLIZ, LJI(colorStateList2), LJI(this.LJIIJJI)));
            } else {
                this.LJJIIZI.setColor(LJI(colorStateList));
            }
            float f2 = this.LJJJJ;
            float f3 = this.LJJJJI;
            if (f2 != f3) {
                this.LJJIIZI.setLetterSpacing(LJII(f3, f2, fLIZ, c12dm));
            } else {
                this.LJJIIZI.setLetterSpacing(f2);
            }
            this.LJJIIZI.setShadowLayer(LJII(this.LJJIZ, this.LJJIJIL, fLIZ, null), LJII(this.LJJJ, this.LJJIJL, fLIZ, null), LJII(this.LJJJI, this.LJJIJLIJ, fLIZ, null), LIZ(fLIZ, LJI(this.LJJJIL), LJI(this.LJJIL)));
            this.LIZ.postInvalidateOnAnimation();
        }
    }

    public final void LJIILJJIL(float f) {
        LIZLLL(f);
        this.LIZ.postInvalidateOnAnimation();
    }

    public final boolean LJIILL(int[] iArr) {
        ColorStateList colorStateList;
        this.LJJIIJZLJL = iArr;
        ColorStateList colorStateList2 = this.LJIIJJI;
        if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = this.LJIIJ) == null || !colorStateList.isStateful())) {
            return false;
        }
        LJIIIZ();
        return true;
    }

    public static int LIZ(float f, int i, int i2) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), (int) ((Color.red(i) * f2) + (Color.red(i2) * f)), (int) ((Color.green(i) * f2) + (Color.green(i2) * f)), (int) ((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    public static float LJII(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        TimeInterpolator timeInterpolator2 = C194V.LIZ;
        return f + (f3 * (f2 - f));
    }
}
