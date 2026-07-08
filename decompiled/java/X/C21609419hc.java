package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.19hc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21609419hc extends Drawable implements Animatable {
    public static final Interpolator LLJIJIL = new LinearInterpolator();
    public static final C12DM LLJILJIL = new C12DM();
    public static final int[] LLJILJILJ = {-16777216};
    public final ArrayList<Animation> LL = new ArrayList<>();
    public final C21609519hd LLILLJJLI;
    public float LLILLL;
    public final Resources LLILZ;
    public final View LLILZIL;
    public C21609619he LLILZLL;
    public float LLIZ;
    public double LLIZLLLIL;
    public double LLJ;
    public boolean LLJI;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.LLILLJJLI.LJIJJ;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.LLJ;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) this.LLIZLLLIL;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ArrayList<Animation> arrayList = this.LL;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animation animation = (Animation) ListProtector.get(arrayList, i);
            if (animation.hasStarted() && !animation.hasEnded()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        reset();
        C21609519hd c21609519hd = this.LLILLJJLI;
        float f = c21609519hd.LJ;
        c21609519hd.LJIIJJI = f;
        float f2 = c21609519hd.LJFF;
        c21609519hd.LJIIL = f2;
        c21609519hd.LJIILIIL = c21609519hd.LJI;
        if (f2 != f) {
            this.LLJI = true;
            setDuration(666L);
            this.LLILZIL.startAnimation(this.LLILZLL);
            return;
        }
        c21609519hd.LIZIZ(0);
        C21609519hd c21609519hd2 = this.LLILLJJLI;
        c21609519hd2.LJIIJJI = 0.0f;
        c21609519hd2.LJIIL = 0.0f;
        c21609519hd2.LJIILIIL = 0.0f;
        c21609519hd2.LJ = 0.0f;
        c21609519hd2.LIZ();
        c21609519hd2.LJFF = 0.0f;
        c21609519hd2.LIZ();
        c21609519hd2.LJI = 0.0f;
        c21609519hd2.LIZ();
        setDuration(1332L);
        this.LLILZIL.startAnimation(this.LLILZLL);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.LLILZIL.clearAnimation();
        this.LLILLL = 0.0f;
        invalidateSelf();
        C21609519hd c21609519hd = this.LLILLJJLI;
        if (c21609519hd.LJIILJJIL) {
            c21609519hd.LJIILJJIL = false;
            c21609519hd.LIZ();
        }
        this.LLILLJJLI.LIZIZ(0);
        C21609519hd c21609519hd2 = this.LLILLJJLI;
        c21609519hd2.LJIIJJI = 0.0f;
        c21609519hd2.LJIIL = 0.0f;
        c21609519hd2.LJIILIIL = 0.0f;
        c21609519hd2.LJ = 0.0f;
        c21609519hd2.LIZ();
        c21609519hd2.LJFF = 0.0f;
        c21609519hd2.LIZ();
        c21609519hd2.LJI = 0.0f;
        c21609519hd2.LIZ();
    }

    public final void LIZJ(int i) {
        if (i == 0) {
            LIZ(56.0d, 56.0d, 12.5d, 3.0d, 12.0f, 6.0f);
        } else {
            LIZ(40.0d, 40.0d, 8.75d, 2.5d, 10.0f, 5.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int iSave = canvas.save();
        canvas.rotate(this.LLILLL, bounds.exactCenterX(), bounds.exactCenterY());
        C21609519hd c21609519hd = this.LLILLJJLI;
        RectF rectF = c21609519hd.LIZ;
        rectF.set(bounds);
        float f = c21609519hd.LJIIIIZZ;
        rectF.inset(f, f);
        float f2 = c21609519hd.LJ;
        float f3 = c21609519hd.LJI;
        float f4 = (f2 + f3) * 360.0f;
        float f5 = ((c21609519hd.LJFF + f3) * 360.0f) - f4;
        c21609519hd.LIZIZ.setColor(c21609519hd.LJJ);
        canvas.drawArc(rectF, f4, f5, false, c21609519hd.LIZIZ);
        if (c21609519hd.LJIILJJIL) {
            Path path = c21609519hd.LJIILL;
            if (path == null) {
                Path path2 = new Path();
                c21609519hd.LJIILL = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float f6 = (((int) c21609519hd.LJIIIIZZ) / 2) * c21609519hd.LJIILLIIL;
            float fCos = (float) ((c21609519hd.LJIIZILJ * Math.cos(0.0d)) + ((double) bounds.exactCenterX()));
            float fSin = (float) ((c21609519hd.LJIIZILJ * Math.sin(0.0d)) + ((double) bounds.exactCenterY()));
            c21609519hd.LJIILL.moveTo(0.0f, 0.0f);
            c21609519hd.LJIILL.lineTo(c21609519hd.LJIJ * c21609519hd.LJIILLIIL, 0.0f);
            Path path3 = c21609519hd.LJIILL;
            float f7 = c21609519hd.LJIJ;
            float f8 = c21609519hd.LJIILLIIL;
            path3.lineTo((f7 * f8) / 2.0f, c21609519hd.LJIJI * f8);
            c21609519hd.LJIILL.offset(fCos - f6, fSin);
            c21609519hd.LJIILL.close();
            c21609519hd.LIZJ.setColor(c21609519hd.LJJ);
            canvas.rotate((f4 + f5) - 5.0f, bounds.exactCenterX(), bounds.exactCenterY());
            canvas.drawPath(c21609519hd.LJIILL, c21609519hd.LIZJ);
        }
        if (c21609519hd.LJIJJ < 255) {
            c21609519hd.LJIJJLI.setColor(c21609519hd.LJIL);
            c21609519hd.LJIJJLI.setAlpha(255 - c21609519hd.LJIJJ);
            canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), bounds.width() / 2, c21609519hd.LJIJJLI);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LLILLJJLI.LJIJJ = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C21609519hd c21609519hd = this.LLILLJJLI;
        c21609519hd.LIZIZ.setColorFilter(colorFilter);
        c21609519hd.LIZ();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.19ZY] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.19he, android.view.animation.Animation] */
    public C21609419hc(Context context, View view) {
        ?? r1 = new Drawable.Callback() { // from class: X.19ZY
            @Override // android.graphics.drawable.Drawable.Callback
            public final void invalidateDrawable(Drawable drawable) {
                this.LL.invalidateSelf();
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                this.LL.unscheduleSelf(runnable);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                this.LL.scheduleSelf(runnable, j);
            }
        };
        this.LLILZIL = view;
        this.LLILZ = context.getResources();
        final C21609519hd c21609519hd = new C21609519hd(r1);
        this.LLILLJJLI = c21609519hd;
        c21609519hd.LJIIIZ = LLJILJILJ;
        c21609519hd.LIZIZ(0);
        LIZJ(1);
        ?? r2 = new Animation() { // from class: X.19he
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                if (this.LLILLJJLI.LLJI) {
                    C21609519hd c21609519hd2 = c21609519hd;
                    C21609419hc.LIZIZ(f, c21609519hd2);
                    float fFloor = (float) (Math.floor(c21609519hd2.LJIILIIL / 0.8f) + 1.0d);
                    float radians = (float) Math.toRadians(((double) c21609519hd2.LJII) / (c21609519hd2.LJIIZILJ * 6.283185307179586d));
                    float f2 = c21609519hd2.LJIIJJI;
                    c21609519hd2.LJ = f2 + (((c21609519hd2.LJIIL - radians) - f2) * f);
                    c21609519hd2.LIZ();
                    c21609519hd2.LJFF = c21609519hd2.LJIIL;
                    c21609519hd2.LIZ();
                    float f3 = c21609519hd2.LJIILIIL;
                    c21609519hd2.LJI = f3 + ((fFloor - f3) * f);
                    c21609519hd2.LIZ();
                    return;
                }
                C21609519hd c21609519hd3 = c21609519hd;
                float radians2 = (float) Math.toRadians(((double) c21609519hd3.LJII) / (c21609519hd3.LJIIZILJ * 6.283185307179586d));
                C21609519hd c21609519hd4 = c21609519hd;
                float f4 = c21609519hd4.LJIIL;
                float f5 = c21609519hd4.LJIIJJI;
                float f6 = c21609519hd4.LJIILIIL;
                this.LLILLJJLI.getClass();
                C21609419hc.LIZIZ(f, c21609519hd4);
                if (f <= 0.5f) {
                    float interpolation = f5 + ((0.8f - radians2) * C21609419hc.LLJILJIL.getInterpolation(f / 0.5f));
                    C21609519hd c21609519hd5 = c21609519hd;
                    c21609519hd5.LJ = interpolation;
                    c21609519hd5.LIZ();
                }
                if (f > 0.5f) {
                    float interpolation2 = f4 + ((0.8f - radians2) * C21609419hc.LLJILJIL.getInterpolation((f - 0.5f) / 0.5f));
                    C21609519hd c21609519hd6 = c21609519hd;
                    c21609519hd6.LJFF = interpolation2;
                    c21609519hd6.LIZ();
                }
                C21609519hd c21609519hd7 = c21609519hd;
                c21609519hd7.LJI = f6 + (0.25f * f);
                c21609519hd7.LIZ();
                C21609419hc c21609419hc = this.LLILLJJLI;
                c21609419hc.LLILLL = (f * 216.0f) + ((c21609419hc.LLIZ / 5.0f) * 1080.0f);
                c21609419hc.invalidateSelf();
            }
        };
        r2.setRepeatCount(-1);
        r2.setRepeatMode(1);
        r2.setInterpolator(LLJIJIL);
        r2.setAnimationListener(new AnimationAnimationListenerC2189521Amc(this, c21609519hd, 1));
        this.LLILZLL = r2;
    }

    public static void LIZIZ(float f, C21609519hd c21609519hd) {
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int[] iArr = c21609519hd.LJIIIZ;
            int i = c21609519hd.LJIIJ;
            int i2 = iArr[i];
            int i3 = iArr[(i + 1) % iArr.length];
            c21609519hd.LJJ = ((((i2 >> 24) & 255) + ((int) ((((i3 >> 24) & 255) - r8) * f2))) << 24) | ((((i2 >> 16) & 255) + ((int) ((((i3 >> 16) & 255) - r7) * f2))) << 16) | ((((i2 >> 8) & 255) + ((int) ((((i3 >> 8) & 255) - r6) * f2))) << 8) | ((i2 & 255) + ((int) (f2 * ((i3 & 255) - r4))));
        }
    }

    public final void LIZ(double d, double d2, double d3, double d4, float f, float f2) {
        double dCeil;
        C21609519hd c21609519hd = this.LLILLJJLI;
        float f3 = this.LLILZ.getDisplayMetrics().density;
        double d5 = f3;
        this.LLIZLLLIL = d * d5;
        this.LLJ = d2 * d5;
        float f4 = ((float) d4) * f3;
        c21609519hd.LJII = f4;
        c21609519hd.LIZIZ.setStrokeWidth(f4);
        c21609519hd.LIZ();
        c21609519hd.LJIIZILJ = d3 * d5;
        c21609519hd.LIZIZ(0);
        c21609519hd.LJIJ = (int) (f * f3);
        c21609519hd.LJIJI = (int) (f2 * f3);
        float fMin = Math.min((int) this.LLIZLLLIL, (int) this.LLJ);
        double d6 = c21609519hd.LJIIZILJ;
        if (d6 > 0.0d && fMin >= 0.0f) {
            dCeil = ((double) (fMin / 2.0f)) - d6;
        } else {
            dCeil = Math.ceil(c21609519hd.LJII / 2.0f);
        }
        c21609519hd.LJIIIIZZ = (float) dCeil;
    }
}
