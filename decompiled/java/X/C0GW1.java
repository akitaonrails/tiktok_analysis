package X;

import Y.AUListenerS256S0100000_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GW1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GW1 extends View {
    public final int LL;
    public final Paint LLILLJJLI;
    public final int LLILLL;
    public final float[] LLILZ;
    public final float LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public final ValueAnimator LLIZLLLIL;

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.LLIZLLLIL.cancel();
        super.onDetachedFromWindow();
    }

    public final void LIZ() {
        int height = getHeight();
        if (height <= 0) {
            return;
        }
        float f = height / 2.0f;
        float f2 = this.LLIZ / 2.0f;
        if (f2 > f) {
            f2 = f;
        }
        int i = this.LL & 16777215;
        this.LLILLJJLI.setShader(new LinearGradient(0.0f, f - f2, 0.0f, f + f2, new int[]{i, this.LL, i}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLIZLLLIL.start();
    }

    public final float getBandHeight() {
        return this.LLIZ;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.LLILZLL <= 0.0f) {
            return;
        }
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f = this.LLILZIL;
        float f2 = this.LLILZLL;
        if (f > f2) {
            f = f2;
        }
        for (float f3 : this.LLILZ) {
            float f4 = ((this.LLILZLL - f) * f3) + f;
            this.LLILLJJLI.setAlpha(C13LZ.LJ((int) (255 * (1.0f - f3)), 0, 255));
            canvas.drawCircle(width, height, f4, this.LLILLJJLI);
        }
    }

    public final void setBandHeight(float f) {
        this.LLIZ = f;
        LIZ();
        invalidate();
    }

    public C0GW1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int iLIZIZ = C20736316Cj.LIZIZ(R.attr.evm, getRootView().getContext());
        this.LL = iLIZIZ;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2.0f * getResources().getDisplayMetrics().density);
        paint.setColor(iLIZIZ);
        this.LLILLJJLI = paint;
        this.LLILLL = 3;
        float[] fArr = new float[3];
        int i = 0;
        do {
            fArr[i] = i / this.LLILLL;
            i++;
        } while (i < 3);
        this.LLILZ = fArr;
        this.LLILZIL = 40.0f * getResources().getDisplayMetrics().density;
        this.LLIZ = 191.0f * getResources().getDisplayMetrics().density;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(1800L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(this, 8));
        this.LLIZLLLIL = valueAnimatorOfFloat;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLILZLL = i / 2.0f;
        LIZ();
    }
}
