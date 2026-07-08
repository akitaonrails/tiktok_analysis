package X;

import Y.AUListenerS256S0100000_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GVw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C416780GVw extends View {
    public Paint LL;
    public int LLILLJJLI;
    public int LLILLL;
    public final Matrix LLILZ;
    public Bitmap LLILZIL;
    public float LLILZLL;
    public ValueAnimator LLIZ;
    public final long LLIZLLLIL;

    private ValueAnimator.AnimatorUpdateListener getUpdateListener() {
        return new AUListenerS256S0100000_6(this, 14);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LLIZ.isRunning()) {
            this.LLIZ.cancel();
        }
        this.LLILZ.reset();
        this.LLILZ.setTranslate(0.0f, -this.LLILZLL);
        this.LLILZ.preScale(1.0f, 1.0f);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.LLILZIL;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, this.LLILZ, this.LL);
        }
    }

    public C416780GVw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZ = new Matrix();
        this.LLILZLL = 0.0f;
        this.LLIZLLLIL = 2000L;
        this.LLILZIL = BitmapFactory.decodeResource(getResources(), R.drawable.cqm);
        Paint paint = new Paint(1);
        this.LL = paint;
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        Bitmap bitmap = this.LLILZIL;
        if (bitmap != null && i > 0 && i2 > 0) {
            int width = bitmap.getWidth();
            int i5 = this.LLILLJJLI;
            if (width != i5) {
                Bitmap bitmap2 = this.LLILZIL;
                int height = bitmap2.getHeight();
                int width2 = bitmap2.getWidth();
                int height2 = bitmap2.getHeight();
                float fMin = Math.min(height / height2, i5 / width2);
                Matrix matrix = new Matrix();
                matrix.postScale(fMin, fMin);
                this.LLILZIL = Bitmap.createBitmap(bitmap2, 0, 0, width2, height2, matrix, true);
            }
            this.LLILZLL = this.LLILZIL.getHeight();
            this.LLILZ.reset();
            this.LLILZ.setTranslate(0.0f, -this.LLILZLL);
            this.LLILZ.preScale(1.0f, 1.0f);
            ValueAnimator valueAnimator = this.LLIZ;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.LLIZ.cancel();
            }
            float f = this.LLILZLL;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(-f, this.LLILLL + f);
            this.LLIZ = valueAnimatorOfFloat;
            if (valueAnimatorOfFloat != null) {
                valueAnimatorOfFloat.setDuration(this.LLIZLLLIL);
                this.LLIZ.setRepeatCount(-1);
                this.LLIZ.setRepeatMode(1);
                this.LLIZ.addUpdateListener(getUpdateListener());
                this.LLIZ.start();
            }
        }
    }
}
