package X;

import Y.ALAdapterS16S0100000_20;
import Y.AUListenerS269S0100000_20;
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
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ksw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1336560ksw extends View {
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

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final void LIZ() {
        if (Math.abs(this.LLJ - 0.85f) < Float.MIN_NORMAL || this.LLILLJJLI) {
            return;
        }
        this.LLILLJJLI = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.5f, 0.85f);
        this.LLILLL = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.setEvaluator(new FloatEvaluator());
            this.LLILLL.setDuration(300L);
            this.LLILLL.addUpdateListener(new AUListenerS269S0100000_20(this, 1));
            this.LLILLL.addListener(new ALAdapterS16S0100000_20(this, 0));
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
        int color;
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
                color = context.getResources().getColor(R.color.a6r);
            } else {
                color = ColorProtector.parseColor("#d9161823");
            }
            if (this.LLILZIL == 1) {
                z = true;
            } else {
                z = false;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_4444);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            canvas2.drawColor(color);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            if (z) {
                canvas2.drawOval(rectF, paint);
            } else {
                canvas2.drawRect(rectF, paint);
                Paint paint2 = new Paint();
                paint2.setColor(getResources().getColor(R.color.aas));
                paint2.setAlpha(125);
                paint2.setStrokeWidth(1.0f);
                float f = rectF.top;
                float f2 = rectF.bottom - f;
                float f3 = f + (f2 / 3.0f);
                float f4 = f + ((f2 * 2.0f) / 3.0f);
                float f5 = rectF.left;
                float f6 = rectF.right;
                float f7 = f6 - f5;
                float f8 = f5 + (f7 / 3.0f);
                float f9 = f5 + ((f7 * 2.0f) / 3.0f);
                canvas2.drawLine(f5, f3, f6, f3, paint2);
                canvas2.drawLine(rectF.left, f4, rectF.right, f4, paint2);
                canvas2.drawLine(f8, rectF.top, f8, rectF.bottom, paint2);
                canvas2.drawLine(f9, rectF.top, f9, rectF.bottom, paint2);
                Paint paint3 = new Paint();
                paint3.setColor(getResources().getColor(R.color.aas));
                paint3.setStrokeWidth(2.0f);
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
                Paint paint4 = new Paint();
                paint4.setColor(getResources().getColor(R.color.aas));
                paint4.setStrokeWidth(3.0f);
                float f16 = rectF.left - 2.0f;
                float f18 = rectF.top;
                canvas2.drawLine(f16, f18 + 98.0f, f16, f18 - 2.0f, paint4);
                float f19 = rectF.top - 2.0f;
                float f20 = rectF.left;
                canvas2.drawLine(f20 - 2.0f, f19, f20 + 98.0f, f19, paint4);
                float f21 = rectF.right + 2.0f;
                float f22 = rectF.top;
                canvas2.drawLine(f21, f22 + 98.0f, f21, f22 - 2.0f, paint4);
                float f23 = rectF.top - 2.0f;
                float f24 = rectF.right;
                canvas2.drawLine(f24 + 2.0f, f23, f24 - 98.0f, f23, paint4);
                float f25 = rectF.left - 2.0f;
                float f26 = rectF.bottom;
                canvas2.drawLine(f25, f26 - 98.0f, f25, f26 + 2.0f, paint4);
                float f27 = rectF.bottom + 2.0f;
                float f28 = rectF.left;
                canvas2.drawLine(f28 - 2.0f, f27, f28 + 98.0f, f27, paint4);
                float f29 = rectF.right + 2.0f;
                float f30 = rectF.bottom;
                canvas2.drawLine(f29, f30 + 2.0f, f29, f30 - 98.0f, paint4);
                float f31 = rectF.bottom + 2.0f;
                float f32 = rectF.right;
                canvas2.drawLine(f32 + 2.0f, f31, f32 - 98.0f, f31, paint4);
            }
            this.LLIZLLLIL = bitmapCreateBitmap;
        }
        canvas.drawBitmap(this.LLIZLLLIL, 0.0f, 0.0f, this.LL);
    }

    public void setTopOffset(int i) {
        this.LLJIJIL = i;
    }

    public C1336560ksw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZLL = 0.5625f;
        this.LLJIJIL = -1;
        this.LLJI = context;
        Paint paint = new Paint();
        this.LL = paint;
        paint.setAntiAlias(true);
        this.LLILZ = (int) C497740JfY.LIZIZ(16.0f);
        this.LLJ = 0.5f;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(0.5f);
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
