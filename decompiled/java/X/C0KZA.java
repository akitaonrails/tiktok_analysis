package X;

import Y.AUListenerS257S0100000_7;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.PathInterpolator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS621S0100000_7;

/* JADX INFO: renamed from: X.0KZA, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KZA extends View {
    public static final PathInterpolator LLJIJIL = new PathInterpolator(0.33f, 0.86f, 0.2f, 1.0f);
    public int LL;
    public final Paint LLILLJJLI;
    public final Paint LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public ValueAnimator LLIZLLLIL;
    public ValueAnimator LLJ;
    public final float LLJI;

    public final void LIZLLL() {
        ValueAnimator valueAnimator = this.LLIZLLLIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.LLJ;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLILZ = 0.2f;
        this.LLILZIL = 1.0f;
        this.LLILZLL = 0.2f;
        this.LLIZ = 1.0f;
        invalidate();
    }

    public final void LIZJ() {
        LIZLLL();
        ValueAnimator valueAnimatorLIZ = LIZ(new AwS621S0100000_7(this, 12));
        valueAnimatorLIZ.start();
        this.LLIZLLLIL = valueAnimatorLIZ;
        ValueAnimator valueAnimatorLIZ2 = LIZ(new AwS621S0100000_7(this, 13));
        valueAnimatorLIZ2.setStartDelay(650L);
        valueAnimatorLIZ2.start();
        this.LLJ = valueAnimatorLIZ2;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LIZLLL();
    }

    public static ValueAnimator LIZ(Function2 function2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(2000L);
        valueAnimatorOfFloat.setInterpolator(LLJIJIL);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS257S0100000_7(function2, 2));
        return valueAnimatorOfFloat;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        LIZIZ(width, height, this.LLILZ, this.LLILZIL, canvas, this.LLILLJJLI);
        LIZIZ(width, height, this.LLILZLL, this.LLIZ, canvas, this.LLILLL);
    }

    public final void setRingColor(int i) {
        this.LL = i;
        invalidate();
    }

    public C0KZA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = -10908429;
        this.LLILLJJLI = new Paint(1);
        this.LLILLL = new Paint(1);
        this.LLILZ = 0.2f;
        this.LLILZIL = 1.0f;
        this.LLILZLL = 0.2f;
        this.LLIZ = 1.0f;
        this.LLJI = getResources().getDisplayMetrics().density * 200.0f;
    }

    public final void LIZIZ(float f, float f2, float f3, float f4, Canvas canvas, Paint paint) {
        float f5 = (this.LLJI / 2.0f) * f3;
        if (f5 <= 0.0f) {
            return;
        }
        paint.setShader(new RadialGradient(f, f2, f5, new int[]{Color.argb(0, Color.red(this.LL), Color.green(this.LL), Color.blue(this.LL)), Color.argb((int) (f4 * 76.5f), Color.red(this.LL), Color.green(this.LL), Color.blue(this.LL))}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        canvas.drawCircle(f, f2, f5, paint);
    }
}
