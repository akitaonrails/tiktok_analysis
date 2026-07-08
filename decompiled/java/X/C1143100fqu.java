package X;

import Y.ALAdapterS13S0100000_17;
import Y.ARunnableS36S0110000_17;
import Y.AUListenerS266S0100000_17;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0fqu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1143100fqu extends View {
    public Bitmap LL;
    public Bitmap LLILLJJLI;
    public Paint LLILLL;
    public Paint LLILZ;
    public PorterDuffXfermode LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public ValueAnimator LLJ;
    public Animator.AnimatorListener LLJI;

    public final void LIZLLL() {
        Bitmap bitmap = this.LLILLJJLI;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = this.LLILLJJLI.getHeight();
            if (getMeasuredHeight() <= 0 || height <= 0 || width <= 0) {
                return;
            }
            Matrix matrix = new Matrix();
            float measuredHeight = getMeasuredHeight() / height;
            matrix.postScale(measuredHeight, measuredHeight);
            this.LLILLJJLI = Bitmap.createBitmap(this.LLILLJJLI, 0, 0, width, height, matrix, true);
        }
    }

    public final void LJFF() {
        ValueAnimator valueAnimator = this.LLJ;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.LLJ.cancel();
        }
        this.LLILZLL = this.LLIZ;
        postInvalidate();
    }

    public Bitmap getSrcBitmap() {
        return this.LL;
    }

    public final Bitmap LIZ(C1324720kZq c1324720kZq) {
        Bitmap bitmapCreateBitmap;
        if (c1324720kZq == null) {
            return null;
        }
        int measuredWidth = c1324720kZq.getMeasuredWidth();
        int measuredHeight = c1324720kZq.getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0 || (bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888)) == null) {
            return null;
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        C842150X1x.LIZIZ(canvas, c1324720kZq);
        canvas.setBitmap(null);
        this.LL = bitmapCreateBitmap;
        return bitmapCreateBitmap;
    }

    public final void LIZIZ(boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.LLIZ, this.LLIZLLLIL);
        this.LLJ = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        this.LLJ.setDuration(1000L);
        if (!z) {
            this.LLJ.setRepeatMode(1);
            this.LLJ.setRepeatCount(-1);
        }
        this.LLJ.addUpdateListener(new AUListenerS266S0100000_17(this, 38));
        this.LLJ.addListener(new ALAdapterS13S0100000_17(this, 15));
    }

    public final void LIZJ(boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.LLIZ, this.LLIZLLLIL);
        this.LLJ = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        this.LLJ.setDuration(1000L);
        if (!z) {
            this.LLJ.setRepeatMode(1);
            this.LLJ.setRepeatCount(-1);
        }
        this.LLJ.addUpdateListener(new AUListenerS266S0100000_17(this, 39));
        this.LLJ.addListener(new ALAdapterS13S0100000_17(this, 16));
    }

    public final void LJ(boolean z) {
        if (this.LL == null) {
            return;
        }
        LIZLLL();
        HandlerHook.viewPost(this, new ARunnableS36S0110000_17(this, z, 4));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        Bitmap bitmap;
        super.onDraw(canvas);
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.LLILLL, 31);
        ValueAnimator valueAnimator = this.LLJ;
        if (valueAnimator != null && valueAnimator.isRunning() && (bitmap = this.LLILLJJLI) != null) {
            canvas.drawBitmap(bitmap, this.LLILZLL, 0.0f, this.LLILLL);
        }
        if (this.LL != null && (paint = this.LLILLL) != null) {
            paint.setXfermode(this.LLILZIL);
            canvas.drawBitmap(this.LL, 0.0f, 0.0f, this.LLILLL);
            this.LLILLL.setXfermode(null);
        }
        canvas.restoreToCount(iSaveLayer);
    }

    public void setAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.LLJI = animatorListener;
    }

    public void setLightBitMap(int i) {
        this.LLILLJJLI = BitmapFactory.decodeResource(C497740JfY.LJIILJJIL(), i);
    }

    public void setSrcBitmap(Bitmap bitmap) {
        this.LL = bitmap;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public C1143100fqu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        this.LLILLL = paint;
        paint.setDither(true);
        this.LLILLL.setFilterBitmap(true);
        Paint paint2 = new Paint(1);
        this.LLILZ = paint2;
        paint2.setDither(true);
        this.LLILZ.setStyle(Paint.Style.FILL);
        this.LLILZ.setColor(-1);
        this.LLILZ.setFilterBitmap(true);
        this.LLILZIL = new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLILLJJLI = BitmapFactory.decodeResource(C497740JfY.LJIILJJIL(), R.drawable.f27);
        float f = -i;
        this.LLIZ = f;
        this.LLILZLL = f;
        this.LLIZLLLIL = i;
    }
}
