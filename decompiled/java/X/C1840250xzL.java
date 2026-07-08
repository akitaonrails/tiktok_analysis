package X;

import Y.ALAdapterS22S0100000_27;
import Y.AUListenerS275S0100000_27;
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

/* JADX INFO: renamed from: X.0xzL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1840250xzL extends View {
    public Paint LL;
    public boolean LLILLJJLI;
    public ValueAnimator LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public float LLILZLL;
    public RectF LLIZ;
    public Bitmap LLIZLLLIL;
    public Bitmap LLJ;
    public float LLJI;
    public Context LLJIJIL;
    public boolean LLJILJIL;
    public float LLJILJILJ;
    public int LLJILLL;

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final void LIZIZ() {
        ValueAnimator valueAnimator = this.LLILLL;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            this.LLILLL.cancel();
        }
        this.LLJILJIL = false;
        if (Math.abs(this.LLJI - 0.25f) < Float.MIN_NORMAL) {
            return;
        }
        this.LLJI = 0.25f;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(0.25f);
        postInvalidate();
    }

    public final void LIZJ() {
        if (Math.abs(this.LLJI - 1.0f) < Float.MIN_NORMAL || this.LLILLJJLI) {
            return;
        }
        this.LLILLJJLI = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.25f, 1.0f);
        this.LLILLL = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.setEvaluator(new FloatEvaluator());
            this.LLILLL.setDuration(300L);
            this.LLILLL.addUpdateListener(new AUListenerS275S0100000_27(this, 5));
            this.LLILLL.addListener(new ALAdapterS22S0100000_27(this, 2));
            this.LLILLL.setStartDelay(300L);
            this.LLILLL.start();
        }
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
        Bitmap bitmap;
        boolean z;
        boolean z2;
        if (this.LLIZ == null) {
            return;
        }
        int color = -16777216;
        if (this.LLJILJIL) {
            if (this.LLJ == null) {
                int width = getWidth();
                int height = getHeight();
                RectF rectF = this.LLIZ;
                Context context = this.LLJIJIL;
                if (context != null) {
                    color = context.getResources().getColor(R.color.fw);
                }
                if (this.LLILZIL == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.LLJ = LIZ(width, height, rectF, color, z2, true);
            }
            bitmap = this.LLJ;
        } else {
            if (this.LLIZLLLIL == null) {
                int width2 = getWidth();
                int height2 = getHeight();
                RectF rectF2 = this.LLIZ;
                Context context2 = this.LLJIJIL;
                if (context2 != null) {
                    color = context2.getResources().getColor(R.color.fw);
                }
                if (this.LLILZIL == 1) {
                    z = true;
                } else {
                    z = false;
                }
                this.LLIZLLLIL = LIZ(width2, height2, rectF2, color, z, false);
            }
            bitmap = this.LLIZLLLIL;
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.LL);
    }

    public void setTopOffset(int i) {
        this.LLJILLL = i;
    }

    public C1840250xzL(Context context, AttributeSet attributeSet) {
        float f;
        super(context, attributeSet);
        this.LLILZLL = 0.5625f;
        this.LLJILLL = -1;
        this.LLJIJIL = context;
        Paint paint = new Paint();
        this.LL = paint;
        paint.setAntiAlias(true);
        if (context != null) {
            f = (context.getResources().getDisplayMetrics().density * 16.0f) + 0.5f;
        } else {
            f = 0.0f;
        }
        this.LLILZ = (int) f;
        this.LLJI = 0.25f;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(0.25f);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int width = (int) ((getWidth() - (this.LLILZ * 2)) * this.LLILZLL);
        int iMax = this.LLJILLL;
        if (iMax < 0) {
            iMax = Math.max(0, (getHeight() - width) / 2);
        }
        this.LLIZ = new RectF(this.LLILZ, iMax, r0 + r7, iMax + width);
    }

    public final Bitmap LIZ(int i, int i2, RectF rectF, int i3, boolean z, boolean z2) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(i3);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        if (z) {
            canvas.drawOval(rectF, paint);
            return bitmapCreateBitmap;
        }
        if (z2) {
            float f = this.LLJILJILJ;
            canvas.drawRoundRect(rectF, f, f, paint);
            return bitmapCreateBitmap;
        }
        canvas.drawRect(rectF, paint);
        Paint paint2 = new Paint();
        paint2.setColor(getResources().getColor(R.color.aas));
        paint2.setAlpha(125);
        paint2.setStrokeWidth(1.0f);
        float f2 = rectF.top;
        float f3 = rectF.bottom - f2;
        float f4 = f2 + (f3 / 3.0f);
        float f5 = f2 + ((f3 * 2.0f) / 3.0f);
        float f6 = rectF.left;
        float f7 = rectF.right;
        float f8 = f7 - f6;
        float f9 = f6 + (f8 / 3.0f);
        float f10 = f6 + ((f8 * 2.0f) / 3.0f);
        canvas.drawLine(f6, f4, f7, f4, paint2);
        canvas.drawLine(rectF.left, f5, rectF.right, f5, paint2);
        canvas.drawLine(f9, rectF.top, f9, rectF.bottom, paint2);
        canvas.drawLine(f10, rectF.top, f10, rectF.bottom, paint2);
        Paint paint3 = new Paint();
        paint3.setColor(getResources().getColor(R.color.aas));
        paint3.setStrokeWidth(C497740JfY.LIZIZ(1.0f));
        float f11 = rectF.left;
        canvas.drawLine(f11, rectF.bottom, f11, rectF.top, paint3);
        float f12 = rectF.right;
        canvas.drawLine(f12, rectF.bottom, f12, rectF.top, paint3);
        float f13 = rectF.left;
        float f14 = rectF.top;
        canvas.drawLine(f13, f14, rectF.right, f14, paint3);
        float f15 = rectF.left;
        float f16 = rectF.bottom;
        canvas.drawLine(f15, f16, rectF.right, f16, paint3);
        Paint paint4 = new Paint();
        float fLIZIZ = C497740JfY.LIZIZ(3.0f);
        paint4.setColor(getResources().getColor(R.color.aas));
        paint4.setStrokeWidth(fLIZIZ);
        float f18 = rectF.left - 2.0f;
        float f19 = rectF.top;
        float f20 = fLIZIZ - 2.0f;
        canvas.drawLine(f18, f19 + 98.0f, f18, f19 - f20, paint4);
        float f21 = rectF.top - 2.0f;
        float f22 = rectF.left;
        canvas.drawLine(f22 - 2.0f, f21, f22 + 98.0f, f21, paint4);
        float f23 = rectF.right + 2.0f;
        float f24 = rectF.top;
        canvas.drawLine(f23, f24 + 98.0f, f23, f24 - f20, paint4);
        float f25 = rectF.top - 2.0f;
        float f26 = rectF.right;
        canvas.drawLine(f26 + 2.0f, f25, f26 - 98.0f, f25, paint4);
        float f27 = rectF.left - 2.0f;
        float f28 = rectF.bottom;
        float f29 = f20 - 1.0f;
        canvas.drawLine(f27, f28 - 98.0f, f27, f28 + f29, paint4);
        float f30 = rectF.bottom + 2.0f;
        float f31 = rectF.left;
        canvas.drawLine(f31 - 2.0f, f30, f31 + 98.0f, f30, paint4);
        float f32 = rectF.right + 2.0f;
        float f33 = rectF.bottom;
        canvas.drawLine(f32, f33 + f29, f32, f33 - 98.0f, paint4);
        float f34 = rectF.bottom + 2.0f;
        float f35 = rectF.right;
        canvas.drawLine(f35 + 2.0f, f34, f35 - 98.0f, f34, paint4);
        return bitmapCreateBitmap;
    }
}
