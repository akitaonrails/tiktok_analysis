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

/* JADX INFO: renamed from: X.0ksx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1336570ksx extends View {
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
        if (valueAnimatorOfFloat == null) {
            return;
        }
        valueAnimatorOfFloat.setEvaluator(new FloatEvaluator());
        this.LLILLL.setDuration(300L);
        this.LLILLL.addUpdateListener(new AUListenerS269S0100000_20(this, 2));
        this.LLILLL.addListener(new ALAdapterS16S0100000_20(this, 1));
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
            }
            this.LLIZLLLIL = bitmapCreateBitmap;
        }
        canvas.drawBitmap(this.LLIZLLLIL, 0.0f, 0.0f, this.LL);
    }

    public void setTopOffset(int i) {
        this.LLJIJIL = i;
    }

    public C1336570ksx(Context context, AttributeSet attributeSet) {
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
