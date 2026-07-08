package X;

import Y.AAListenerS279S0200000_33;
import Y.AUListenerS235S0200000_33;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: X.19dE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21582219dE extends Drawable implements Animatable {
    public static final Interpolator LLIZ = new LinearInterpolator();
    public static final C12DM LLIZLLLIL = new C12DM();
    public static final int[] LLJ = {-16777216};
    public final C21582319dF LL;
    public float LLILLJJLI;
    public final Resources LLILLL;
    public Animator LLILZ;
    public float LLILZIL;
    public boolean LLILZLL;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.LL.LJIJI;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.LLILZ.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.LLILZ.cancel();
        C21582319dF c21582319dF = this.LL;
        float f = c21582319dF.LJ;
        c21582319dF.LJIIJ = f;
        float f2 = c21582319dF.LJFF;
        c21582319dF.LJIIJJI = f2;
        c21582319dF.LJIIL = c21582319dF.LJI;
        if (f2 != f) {
            this.LLILZLL = true;
            this.LLILZ.setDuration(666L);
            this.LLILZ.start();
            return;
        }
        c21582319dF.LIZ(0);
        C21582319dF c21582319dF2 = this.LL;
        c21582319dF2.LJIIJ = 0.0f;
        c21582319dF2.LJIIJJI = 0.0f;
        c21582319dF2.LJIIL = 0.0f;
        c21582319dF2.LJ = 0.0f;
        c21582319dF2.LJFF = 0.0f;
        c21582319dF2.LJI = 0.0f;
        this.LLILZ.setDuration(1332L);
        this.LLILZ.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.LLILZ.cancel();
        this.LLILLJJLI = 0.0f;
        C21582319dF c21582319dF = this.LL;
        if (c21582319dF.LJIILIIL) {
            c21582319dF.LJIILIIL = false;
        }
        c21582319dF.LIZ(0);
        C21582319dF c21582319dF2 = this.LL;
        c21582319dF2.LJIIJ = 0.0f;
        c21582319dF2.LJIIJJI = 0.0f;
        c21582319dF2.LJIIL = 0.0f;
        c21582319dF2.LJ = 0.0f;
        c21582319dF2.LJFF = 0.0f;
        c21582319dF2.LJI = 0.0f;
        invalidateSelf();
    }

    public C21582219dE(Context context) {
        context.getClass();
        this.LLILLL = context.getResources();
        C21582319dF c21582319dF = new C21582319dF();
        this.LL = c21582319dF;
        c21582319dF.LJIIIIZZ = LLJ;
        c21582319dF.LIZ(0);
        c21582319dF.LJII = 2.5f;
        c21582319dF.LIZIZ.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS235S0200000_33(c21582319dF, this, 8));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(LLIZ);
        valueAnimatorOfFloat.addListener(new AAListenerS279S0200000_33(c21582319dF, this, 4));
        this.LLILZ = valueAnimatorOfFloat;
    }

    public final void LIZJ(int i) {
        if (i == 0) {
            LIZIZ(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            LIZIZ(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.LLILLJJLI, bounds.exactCenterX(), bounds.exactCenterY());
        C21582319dF c21582319dF = this.LL;
        RectF rectF = c21582319dF.LIZ;
        float f = c21582319dF.LJIILLIIL;
        float fMin = (c21582319dF.LJII / 2.0f) + f;
        if (f <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((c21582319dF.LJIIZILJ * c21582319dF.LJIILL) / 2.0f, c21582319dF.LJII / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f2 = c21582319dF.LJ;
        float f3 = c21582319dF.LJI;
        float f4 = (f2 + f3) * 360.0f;
        float f5 = ((c21582319dF.LJFF + f3) * 360.0f) - f4;
        c21582319dF.LIZIZ.setColor(c21582319dF.LJIJJ);
        c21582319dF.LIZIZ.setAlpha(c21582319dF.LJIJI);
        float f6 = c21582319dF.LJII / 2.0f;
        rectF.inset(f6, f6);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, c21582319dF.LIZLLL);
        float f7 = -f6;
        rectF.inset(f7, f7);
        canvas.drawArc(rectF, f4, f5, false, c21582319dF.LIZIZ);
        if (c21582319dF.LJIILIIL) {
            Path path = c21582319dF.LJIILJJIL;
            if (path == null) {
                Path path2 = new Path();
                c21582319dF.LJIILJJIL = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f8 = (c21582319dF.LJIIZILJ * c21582319dF.LJIILL) / 2.0f;
            c21582319dF.LJIILJJIL.moveTo(0.0f, 0.0f);
            c21582319dF.LJIILJJIL.lineTo(c21582319dF.LJIIZILJ * c21582319dF.LJIILL, 0.0f);
            Path path3 = c21582319dF.LJIILJJIL;
            float f9 = c21582319dF.LJIIZILJ;
            float f10 = c21582319dF.LJIILL;
            path3.lineTo((f9 * f10) / 2.0f, c21582319dF.LJIJ * f10);
            c21582319dF.LJIILJJIL.offset((fMin2 + rectF.centerX()) - f8, rectF.centerY() + (c21582319dF.LJII / 2.0f));
            c21582319dF.LJIILJJIL.close();
            c21582319dF.LIZJ.setColor(c21582319dF.LJIJJ);
            c21582319dF.LIZJ.setAlpha(c21582319dF.LJIJI);
            canvas.save();
            canvas.rotate(f4 + f5, rectF.centerX(), rectF.centerY());
            canvas.drawPath(c21582319dF.LJIILJJIL, c21582319dF.LIZJ);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LL.LJIJI = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LL.LIZIZ.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public static void LIZLLL(float f, C21582319dF c21582319dF) {
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int[] iArr = c21582319dF.LJIIIIZZ;
            int i = c21582319dF.LJIIIZ;
            int i2 = iArr[i];
            int i3 = iArr[(i + 1) % iArr.length];
            c21582319dF.LJIJJ = ((((i2 >> 24) & 255) + ((int) ((((i3 >> 24) & 255) - r8) * f2))) << 24) | ((((i2 >> 16) & 255) + ((int) ((((i3 >> 16) & 255) - r7) * f2))) << 16) | ((((i2 >> 8) & 255) + ((int) ((((i3 >> 8) & 255) - r6) * f2))) << 8) | ((i2 & 255) + ((int) (f2 * ((i3 & 255) - r4))));
            return;
        }
        c21582319dF.LJIJJ = c21582319dF.LJIIIIZZ[c21582319dF.LJIIIZ];
    }

    public final void LIZ(float f, C21582319dF c21582319dF, boolean z) {
        float interpolation;
        float interpolation2;
        if (this.LLILZLL) {
            LIZLLL(f, c21582319dF);
            float fFloor = (float) (Math.floor(c21582319dF.LJIIL / 0.8f) + 1.0d);
            float f2 = c21582319dF.LJIIJ;
            float f3 = c21582319dF.LJIIJJI;
            c21582319dF.LJ = f2 + (((f3 - 0.01f) - f2) * f);
            c21582319dF.LJFF = f3;
            float f4 = c21582319dF.LJIIL;
            c21582319dF.LJI = f4 + ((fFloor - f4) * f);
            return;
        }
        if (f == 1.0f && !z) {
            return;
        }
        float f5 = c21582319dF.LJIIL;
        if (f < 0.5f) {
            interpolation2 = c21582319dF.LJIIJ;
            interpolation = (LLIZLLLIL.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation2;
        } else {
            interpolation = c21582319dF.LJIIJ + 0.79f;
            interpolation2 = interpolation - (((1.0f - LLIZLLLIL.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
        }
        float f6 = f5 + (0.20999998f * f);
        float f7 = (f + this.LLILZIL) * 216.0f;
        c21582319dF.LJ = interpolation2;
        c21582319dF.LJFF = interpolation;
        c21582319dF.LJI = f6;
        this.LLILLJJLI = f7;
    }

    public final void LIZIZ(float f, float f2, float f3, float f4) {
        C21582319dF c21582319dF = this.LL;
        float f5 = this.LLILLL.getDisplayMetrics().density;
        float f6 = f2 * f5;
        c21582319dF.LJII = f6;
        c21582319dF.LIZIZ.setStrokeWidth(f6);
        c21582319dF.LJIILLIIL = f * f5;
        c21582319dF.LIZ(0);
        c21582319dF.LJIIZILJ = (int) (f3 * f5);
        c21582319dF.LJIJ = (int) (f4 * f5);
    }
}
