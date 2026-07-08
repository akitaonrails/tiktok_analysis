package X;

import Y.ARunnableS135S0100000_35;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1DYT, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public class C1DYT extends C21413918rB {
    public static final /* synthetic */ int LLIZ = 0;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public final C1DYS LLILZIL;
    public final ARunnableS135S0100000_35 LLILZLL;

    public final void LJI() {
        HandlerHook.viewRemoveCallbacks(this, this.LLILZLL);
        C1DYS c1dys = this.LLILZIL;
        EnumC1159870gHx enumC1159870gHx = c1dys.LJIJ;
        EnumC1159870gHx enumC1159870gHx2 = EnumC1159870gHx.LLILLL;
        if (enumC1159870gHx != enumC1159870gHx2) {
            HandlerHook.viewRemoveCallbacks(c1dys.LIZ, c1dys.LJIIZILJ);
            Animator animator = c1dys.LJIIIZ;
            if (animator != null) {
                animator.cancel();
            }
            ValueAnimator valueAnimator = (ValueAnimator) c1dys.LJIILIIL.getValue();
            valueAnimator.start();
            c1dys.LJIIIZ = valueAnimator;
            c1dys.LJIJ = enumC1159870gHx2;
        }
    }

    public final boolean getAttachToRight() {
        return this.LLILLL;
    }

    public final boolean getCollapseDown() {
        return this.LLILLJJLI;
    }

    public final boolean getEnableUIDesignV2() {
        return this.LLILZ;
    }

    public final void LJII(boolean z) {
        C1DYS c1dys = this.LLILZIL;
        C786410Ut5.LJLLLLLL(0, c1dys.LIZ);
        if (c1dys.LIZJ || z) {
            EnumC1159870gHx enumC1159870gHx = c1dys.LJIJ;
            EnumC1159870gHx enumC1159870gHx2 = EnumC1159870gHx.LLILLJJLI;
            if (enumC1159870gHx != enumC1159870gHx2) {
                View view = c1dys.LIZ;
                C786410Ut5.LJLLLLLL(0, view);
                C786410Ut5.T4(view, 1.0f);
                c1dys.LIZLLL = c1dys.LJII;
                c1dys.LJIJ = enumC1159870gHx2;
            }
        }
    }

    @Override // X.C21413918rB, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onDraw(Canvas canvas) {
        float height = this.LLILZIL.LIZLLL * getHeight();
        if (Math.abs(height) < 1.0f) {
            super.onDraw(canvas);
            return;
        }
        canvas.save();
        if (this.LLILLL) {
            canvas.translate(0.0f, -height);
        } else {
            canvas.translate(0.0f, height);
        }
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 || action == 3) {
                    this.LLILZIL.LIZ();
                    return zOnTouchEvent;
                }
            } else {
                C1DYS c1dys = this.LLILZIL;
                if (c1dys.LJIJ == EnumC1159870gHx.LLILLJJLI) {
                    HandlerHook.viewRemoveCallbacks(c1dys.LIZ, c1dys.LJIIZILJ);
                    Animator animator = c1dys.LJIIIZ;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator valueAnimator = (ValueAnimator) c1dys.LJIILJJIL.getValue();
                    valueAnimator.setFloatValues(c1dys.LJII, c1dys.LJFF);
                    float f2 = c1dys.LIZLLL;
                    float f3 = c1dys.LJII;
                    float f4 = c1dys.LJFF;
                    if (f4 == f3) {
                        f = 0.0f;
                    } else {
                        f = (f2 - f3) / (f4 - f3);
                    }
                    c1dys.LIZIZ(valueAnimator, f);
                    c1dys.LJIIIZ = valueAnimator;
                    return zOnTouchEvent;
                }
            }
        }
        return zOnTouchEvent;
    }

    public final void setAttachToRight(boolean z) {
        this.LLILLL = z;
    }

    public final void setCollapseDown(boolean z) {
        if (this.LLILLJJLI != z) {
            this.LLILLJJLI = z;
            this.LLILZIL.LIZIZ = z;
            requestLayout();
        }
    }

    public final void setEnableDesignV2(boolean z) {
        this.LLILZ = z;
        this.LLILZIL.LIZJ = z;
    }

    public final void setEnableUIDesignV2(boolean z) {
        this.LLILZ = z;
    }

    public C1DYT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        final float fApplyDimension = TypedValue.applyDimension(1, 3.0f, getResources().getDisplayMetrics()) / 2;
        final int iLIZ = C960203pA.LIZ(R.attr.e8, getContext());
        setProgressDrawable(new Drawable(fApplyDimension, iLIZ) { // from class: X.0FF2
            public final float LIZ;
            public final Paint LIZIZ;
            public final Paint LIZJ;
            public final Path LIZLLL;
            public final RectF LJ;

            @Override // android.graphics.drawable.Drawable
            public final int getOpacity() {
                int alpha = this.LIZIZ.getAlpha();
                if (alpha != 0) {
                    return alpha != 255 ? -3 : -1;
                }
                return -2;
            }

            @Override // android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                canvas.drawPath(this.LIZLLL, this.LIZJ);
                canvas.drawPath(this.LIZLLL, this.LIZIZ);
            }

            @Override // android.graphics.drawable.Drawable
            public final void onBoundsChange(Rect rect) {
                Path path = this.LIZLLL;
                path.rewind();
                RectF rectF = this.LJ;
                int i = rect.left;
                float f = this.LIZ;
                int i2 = rect.top;
                int i3 = rect.bottom;
                rectF.set(i - f, ((i2 + i3) / 2.0f) - f, i + f, ((i2 + i3) / 2.0f) + f);
                path.arcTo(this.LJ, 90.0f, 180.0f, false);
                this.LJ.set(rect.right - (rect.height() / 2.0f), rect.top, rect.right + (rect.height() / 2.0f), rect.bottom);
                path.arcTo(this.LJ, -90.0f, 180.0f, false);
                path.close();
                path.setFillType(Path.FillType.WINDING);
            }

            @Override // android.graphics.drawable.Drawable
            public final void setAlpha(int i) {
                this.LIZIZ.setAlpha(i);
                invalidateSelf();
            }

            @Override // android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
                this.LIZIZ.setColorFilter(colorFilter);
                invalidateSelf();
            }

            {
                this.LIZ = fApplyDimension;
                Paint paint = new Paint(1);
                paint.setStyle(Paint.Style.FILL);
                paint.setColor(iLIZ);
                this.LIZIZ = paint;
                Paint paint2 = new Paint(1);
                paint2.setColor(1073741824);
                paint2.setStyle(Paint.Style.FILL_AND_STROKE);
                paint2.setMaskFilter(new BlurMaskFilter(2.236068f, BlurMaskFilter.Blur.OUTER));
                this.LIZJ = paint2;
                this.LIZLLL = new Path();
                this.LJ = new RectF();
            }
        });
        this.LLILZIL = new C1DYS(this, this.LLILLJJLI, this.LLILZ);
        this.LLILZLL = new ARunnableS135S0100000_35(this, 30);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int iMax = Math.max(getThumb().getBounds().height(), getProgressDrawable().getBounds().height());
            C1DYS c1dys = this.LLILZIL;
            float fLIZLLL = C13LZ.LIZLLL(iMax / getHeight(), 0.0f, 1.0f);
            if (c1dys.LJ != fLIZLLL) {
                c1dys.LJ = fLIZLLL;
                float f = fLIZLLL / 2.0f;
                if (c1dys.LIZIZ) {
                    c1dys.LJFF = f - 0.5f;
                    c1dys.LJI = 0.5f - f;
                    c1dys.LJII = 0.5f;
                    c1dys.LJIIIIZZ = f + 0.5f;
                    return;
                }
                c1dys.LJFF = 0.5f - f;
                c1dys.LJI = f - 0.5f;
                c1dys.LJII = -0.5f;
                c1dys.LJIIIIZZ = (-0.5f) - f;
            }
        }
    }
}
