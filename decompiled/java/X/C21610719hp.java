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

/* JADX INFO: renamed from: X.19hp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21610719hp extends Drawable implements Animatable {
    public static final Interpolator LLJIJIL = new LinearInterpolator();
    public static final C12DM LLJILJIL = new C12DM();
    public static final int[] LLJILJILJ = {-16777216};
    public final ArrayList<Animation> LL = new ArrayList<>();
    public final C21610819hq LLILLJJLI;
    public float LLILLL;
    public final Resources LLILZ;
    public final View LLILZIL;
    public C21610919hr LLILZLL;
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
        C21610819hq c21610819hq = this.LLILLJJLI;
        float f = c21610819hq.LJ;
        c21610819hq.LJIIJJI = f;
        float f2 = c21610819hq.LJFF;
        c21610819hq.LJIIL = f2;
        c21610819hq.LJIILIIL = c21610819hq.LJI;
        if (f2 != f) {
            this.LLJI = true;
            setDuration(666L);
            this.LLILZIL.startAnimation(this.LLILZLL);
            return;
        }
        c21610819hq.LIZIZ(0);
        C21610819hq c21610819hq2 = this.LLILLJJLI;
        c21610819hq2.LJIIJJI = 0.0f;
        c21610819hq2.LJIIL = 0.0f;
        c21610819hq2.LJIILIIL = 0.0f;
        c21610819hq2.LJ = 0.0f;
        c21610819hq2.LIZ();
        c21610819hq2.LJFF = 0.0f;
        c21610819hq2.LIZ();
        c21610819hq2.LJI = 0.0f;
        c21610819hq2.LIZ();
        setDuration(1332L);
        this.LLILZIL.startAnimation(this.LLILZLL);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.LLILZIL.clearAnimation();
        this.LLILLL = 0.0f;
        invalidateSelf();
        C21610819hq c21610819hq = this.LLILLJJLI;
        if (c21610819hq.LJIILJJIL) {
            c21610819hq.LJIILJJIL = false;
            c21610819hq.LIZ();
        }
        this.LLILLJJLI.LIZIZ(0);
        C21610819hq c21610819hq2 = this.LLILLJJLI;
        c21610819hq2.LJIIJJI = 0.0f;
        c21610819hq2.LJIIL = 0.0f;
        c21610819hq2.LJIILIIL = 0.0f;
        c21610819hq2.LJ = 0.0f;
        c21610819hq2.LIZ();
        c21610819hq2.LJFF = 0.0f;
        c21610819hq2.LIZ();
        c21610819hq2.LJI = 0.0f;
        c21610819hq2.LIZ();
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
        C21610819hq c21610819hq = this.LLILLJJLI;
        RectF rectF = c21610819hq.LIZ;
        rectF.set(bounds);
        float f = c21610819hq.LJIIIIZZ;
        rectF.inset(f, f);
        float f2 = c21610819hq.LJ;
        float f3 = c21610819hq.LJI;
        float f4 = (f2 + f3) * 360.0f;
        float f5 = ((c21610819hq.LJFF + f3) * 360.0f) - f4;
        c21610819hq.LIZIZ.setColor(c21610819hq.LJJ);
        canvas.drawArc(rectF, f4, f5, false, c21610819hq.LIZIZ);
        if (c21610819hq.LJIILJJIL) {
            Path path = c21610819hq.LJIILL;
            if (path == null) {
                Path path2 = new Path();
                c21610819hq.LJIILL = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float f6 = (((int) c21610819hq.LJIIIIZZ) / 2) * c21610819hq.LJIILLIIL;
            float fCos = (float) ((c21610819hq.LJIIZILJ * Math.cos(0.0d)) + ((double) bounds.exactCenterX()));
            float fSin = (float) ((c21610819hq.LJIIZILJ * Math.sin(0.0d)) + ((double) bounds.exactCenterY()));
            c21610819hq.LJIILL.moveTo(0.0f, 0.0f);
            c21610819hq.LJIILL.lineTo(c21610819hq.LJIJ * c21610819hq.LJIILLIIL, 0.0f);
            Path path3 = c21610819hq.LJIILL;
            float f7 = c21610819hq.LJIJ;
            float f8 = c21610819hq.LJIILLIIL;
            path3.lineTo((f7 * f8) / 2.0f, c21610819hq.LJIJI * f8);
            c21610819hq.LJIILL.offset(fCos - f6, fSin);
            c21610819hq.LJIILL.close();
            c21610819hq.LIZJ.setColor(c21610819hq.LJJ);
            canvas.rotate((f4 + f5) - 5.0f, bounds.exactCenterX(), bounds.exactCenterY());
            canvas.drawPath(c21610819hq.LJIILL, c21610819hq.LIZJ);
        }
        if (c21610819hq.LJIJJ < 255) {
            c21610819hq.LJIJJLI.setColor(c21610819hq.LJIL);
            c21610819hq.LJIJJLI.setAlpha(255 - c21610819hq.LJIJJ);
            canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), bounds.width() / 2, c21610819hq.LJIJJLI);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LLILLJJLI.LJIJJ = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C21610819hq c21610819hq = this.LLILLJJLI;
        c21610819hq.LIZIZ.setColorFilter(colorFilter);
        c21610819hq.LIZ();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.19ZX] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.19hr, android.view.animation.Animation] */
    public C21610719hp(Context context, View view) {
        ?? r1 = new Drawable.Callback() { // from class: X.19ZX
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
        final C21610819hq c21610819hq = new C21610819hq(r1);
        this.LLILLJJLI = c21610819hq;
        c21610819hq.LJIIIZ = LLJILJILJ;
        c21610819hq.LIZIZ(0);
        LIZJ(1);
        ?? r12 = new Animation() { // from class: X.19hr
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                if (this.LLILLJJLI.LLJI) {
                    C21610819hq c21610819hq2 = c21610819hq;
                    C21610719hp.LIZIZ(f, c21610819hq2);
                    float fFloor = (float) (Math.floor(c21610819hq2.LJIILIIL / 0.8f) + 1.0d);
                    float radians = (float) Math.toRadians(((double) c21610819hq2.LJII) / (c21610819hq2.LJIIZILJ * 6.283185307179586d));
                    float f2 = c21610819hq2.LJIIJJI;
                    c21610819hq2.LJ = f2 + (((c21610819hq2.LJIIL - radians) - f2) * f);
                    c21610819hq2.LIZ();
                    c21610819hq2.LJFF = c21610819hq2.LJIIL;
                    c21610819hq2.LIZ();
                    float f3 = c21610819hq2.LJIILIIL;
                    c21610819hq2.LJI = f3 + ((fFloor - f3) * f);
                    c21610819hq2.LIZ();
                    return;
                }
                C21610819hq c21610819hq3 = c21610819hq;
                float radians2 = (float) Math.toRadians(((double) c21610819hq3.LJII) / (c21610819hq3.LJIIZILJ * 6.283185307179586d));
                C21610819hq c21610819hq4 = c21610819hq;
                float f4 = c21610819hq4.LJIIL;
                float f5 = c21610819hq4.LJIIJJI;
                float f6 = c21610819hq4.LJIILIIL;
                this.LLILLJJLI.getClass();
                C21610719hp.LIZIZ(f, c21610819hq4);
                if (f <= 0.5f) {
                    float interpolation = f5 + ((0.8f - radians2) * C21610719hp.LLJILJIL.getInterpolation(f / 0.5f));
                    C21610819hq c21610819hq5 = c21610819hq;
                    c21610819hq5.LJ = interpolation;
                    c21610819hq5.LIZ();
                }
                if (f > 0.5f) {
                    float interpolation2 = f4 + ((0.8f - radians2) * C21610719hp.LLJILJIL.getInterpolation((f - 0.5f) / 0.5f));
                    C21610819hq c21610819hq6 = c21610819hq;
                    c21610819hq6.LJFF = interpolation2;
                    c21610819hq6.LIZ();
                }
                C21610819hq c21610819hq7 = c21610819hq;
                c21610819hq7.LJI = f6 + (0.25f * f);
                c21610819hq7.LIZ();
                C21610719hp c21610719hp = this.LLILLJJLI;
                c21610719hp.LLILLL = (f * 216.0f) + ((c21610719hp.LLIZ / 5.0f) * 1080.0f);
                c21610719hp.invalidateSelf();
            }
        };
        r12.setRepeatCount(-1);
        r12.setRepeatMode(1);
        r12.setInterpolator(LLJIJIL);
        r12.setAnimationListener(new Animation.AnimationListener() { // from class: X.19hu
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
                C21610819hq c21610819hq2 = c21610819hq;
                c21610819hq2.LJIIJJI = c21610819hq2.LJ;
                c21610819hq2.LJIIL = c21610819hq2.LJFF;
                c21610819hq2.LJIILIIL = c21610819hq2.LJI;
                c21610819hq2.LIZIZ((c21610819hq2.LJIIJ + 1) % c21610819hq2.LJIIIZ.length);
                C21610819hq c21610819hq3 = c21610819hq;
                c21610819hq3.LJ = c21610819hq3.LJFF;
                c21610819hq3.LIZ();
                C21610719hp c21610719hp = this.LIZIZ;
                if (c21610719hp.LLJI) {
                    c21610719hp.LLJI = false;
                    animation.setDuration(1332L);
                    C21610819hq c21610819hq4 = c21610819hq;
                    if (c21610819hq4.LJIILJJIL) {
                        c21610819hq4.LJIILJJIL = false;
                        c21610819hq4.LIZ();
                        return;
                    }
                    return;
                }
                c21610719hp.LLIZ = (c21610719hp.LLIZ + 1.0f) % 5.0f;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
                this.LIZIZ.LLIZ = 0.0f;
            }
        });
        this.LLILZLL = r12;
    }

    public static void LIZIZ(float f, C21610819hq c21610819hq) {
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int[] iArr = c21610819hq.LJIIIZ;
            int i = c21610819hq.LJIIJ;
            int i2 = iArr[i];
            int i3 = iArr[(i + 1) % iArr.length];
            c21610819hq.LJJ = ((((i2 >> 24) & 255) + ((int) ((((i3 >> 24) & 255) - r8) * f2))) << 24) | ((((i2 >> 16) & 255) + ((int) ((((i3 >> 16) & 255) - r7) * f2))) << 16) | ((((i2 >> 8) & 255) + ((int) ((((i3 >> 8) & 255) - r6) * f2))) << 8) | ((i2 & 255) + ((int) (f2 * ((i3 & 255) - r4))));
        }
    }

    public final void LIZ(double d, double d2, double d3, double d4, float f, float f2) {
        double dCeil;
        C21610819hq c21610819hq = this.LLILLJJLI;
        float f3 = this.LLILZ.getDisplayMetrics().density;
        double d5 = f3;
        this.LLIZLLLIL = d * d5;
        this.LLJ = d2 * d5;
        float f4 = ((float) d4) * f3;
        c21610819hq.LJII = f4;
        c21610819hq.LIZIZ.setStrokeWidth(f4);
        c21610819hq.LIZ();
        c21610819hq.LJIIZILJ = d3 * d5;
        c21610819hq.LIZIZ(0);
        c21610819hq.LJIJ = (int) (f * f3);
        c21610819hq.LJIJI = (int) (f2 * f3);
        float fMin = Math.min((int) this.LLIZLLLIL, (int) this.LLJ);
        double d6 = c21610819hq.LJIIZILJ;
        if (d6 > 0.0d && fMin >= 0.0f) {
            dCeil = ((double) (fMin / 2.0f)) - d6;
        } else {
            dCeil = Math.ceil(c21610819hq.LJII / 2.0f);
        }
        c21610819hq.LJIIIIZZ = (float) dCeil;
    }
}
