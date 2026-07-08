package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0xsg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1836120xsg extends View {
    public Paint LL;
    public boolean LLILLJJLI;
    public ValueAnimator LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public float LLILZLL;
    public RectF LLIZ;
    public Bitmap LLIZLLLIL;
    public float LLJ;
    public Context LLJI;
    public int LLJIJIL;
    public final C1831710xlZ LLJILJIL;
    public final C1831810xlj LLJILJILJ;

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final void LIZ() {
        if (Math.abs(this.LLJ - 0.5f) < Float.MIN_NORMAL || this.LLILLJJLI) {
            return;
        }
        this.LLILLJJLI = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.25f, 0.5f);
        this.LLILLL = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat == null) {
            return;
        }
        valueAnimatorOfFloat.setEvaluator(new FloatEvaluator());
        this.LLILLL.setDuration(300L);
        this.LLILLL.addUpdateListener(this.LLJILJIL);
        this.LLILLL.addListener(this.LLJILJILJ);
        this.LLILLL.setStartDelay(300L);
        this.LLILLL.start();
    }

    public Rect getVisibleRect() {
        Rect rect = new Rect();
        RectF rectF = this.LLIZ;
        if (rectF != null) {
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        return rect;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iLIZIZ;
        boolean z;
        if (this.LLIZ == null) {
            return;
        }
        if (this.LLIZLLLIL == null) {
            int width = getWidth();
            int height = getHeight();
            RectF rectF = this.LLIZ;
            Context context = this.LLJI;
            if (context != null) {
                iLIZIZ = C20736316Cj.LIZIZ(R.attr.exg, context);
            } else {
                iLIZIZ = -16777216;
            }
            if (this.LLILZIL == 1) {
                z = true;
            } else {
                z = false;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_4444);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            canvas2.drawColor(iLIZIZ);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            if (z) {
                canvas2.drawOval(rectF, paint);
            } else {
                canvas2.drawRect(rectF, paint);
                Paint paint2 = new Paint();
                paint2.setColor(C20736316Cj.LIZIZ(R.attr.exp, getContext()));
                paint2.setAlpha(125);
                paint2.setStrokeWidth(1.0f);
                float f = rectF.top;
                float f2 = rectF.bottom - f;
                float f3 = f + (f2 / 3.0f);
                float f4 = f + ((f2 * 2.0f) / 3.0f);
                float f5 = rectF.left;
                float f6 = rectF.right;
                float f7 = f6 - f5;
                float f8 = (f7 / 3.0f) + f5;
                float f9 = f5 + ((f7 * 2.0f) / 3.0f);
                canvas2.drawLine(f5, f3, f6, f3, paint2);
                canvas2.drawLine(rectF.left, f4, rectF.right, f4, paint2);
                canvas2.drawLine(f8, rectF.top, f8, rectF.bottom, paint2);
                canvas2.drawLine(f9, rectF.top, f9, rectF.bottom, paint2);
                Paint paint3 = new Paint();
                paint3.setColor(C20736316Cj.LIZIZ(R.attr.exp, getContext()));
                paint3.setStrokeWidth(C497740JfY.LIZIZ(1.0f));
                float f10 = rectF.left;
                canvas2.drawLine(f10, rectF.bottom, f10, rectF.top, paint3);
                float f11 = rectF.right;
                canvas2.drawLine(f11, rectF.bottom, f11, rectF.top, paint3);
                float f12 = rectF.left;
                float f13 = rectF.top;
                canvas2.drawLine(f12, f13, rectF.right, f13, paint3);
                float f14 = rectF.left;
                float f15 = rectF.bottom;
                canvas2.drawLine(f14, f15, rectF.right, f15, paint3);
            }
            this.LLIZLLLIL = bitmapCreateBitmap;
        }
        canvas.drawBitmap(this.LLIZLLLIL, 0.0f, 0.0f, this.LL);
    }

    public void setTopOffset(int i) {
        this.LLJIJIL = i;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0xlZ] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0xlj] */
    public C1836120xsg(Context context, AttributeSet attributeSet) {
        float f;
        super(context, attributeSet);
        this.LLILZLL = 0.5625f;
        this.LLJIJIL = -1;
        this.LLJILJIL = new ValueAnimator.AnimatorUpdateListener() { // from class: X.0xlZ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.LL.LLJ = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C1836120xsg c1836120xsg = this.LL;
                float f2 = c1836120xsg.LLJ;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1836120xsg);
                c1836120xsg.setAlpha(f2);
                this.LL.getClass();
            }
        };
        this.LLJILJILJ = new AnimatorListenerAdapter() { // from class: X.0xlj
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                C1836120xsg c1836120xsg = this.LL;
                c1836120xsg.LLJ = 0.5f;
                c1836120xsg.LLILLJJLI = false;
            }
        };
        this.LLJI = context;
        Paint paint = new Paint();
        this.LL = paint;
        paint.setAntiAlias(true);
        if (context != null) {
            f = (context.getResources().getDisplayMetrics().density * 16.0f) + 0.5f;
        } else {
            f = 0.0f;
        }
        this.LLILZ = (int) f;
        this.LLJ = 0.25f;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(0.25f);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int width = (int) ((getWidth() - (this.LLILZ * 2)) * this.LLILZLL);
        int iMax = this.LLJIJIL;
        if (iMax < 0) {
            iMax = Math.max(0, (getHeight() - width) / 2);
        }
        this.LLIZ = new RectF(this.LLILZ, iMax, r0 + r7, iMax + width);
    }
}
