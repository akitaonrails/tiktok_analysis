package X;

import Y.AUListenerS256S0100000_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GYI, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GYI extends View {
    public Paint LL;
    public RectF LLILLJJLI;
    public Paint LLILLL;
    public RectF LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.LLILZ;
        int i = this.LLILZIL;
        float f = this.LLIZ;
        int i2 = this.LLILZLL;
        rectF.set((i / 2.0f) - f, (i2 / 2.0f) - f, (i / 2.0f) + f, (i2 / 2.0f) + f);
        Paint paint = this.LLILLL;
        if (paint != null) {
            canvas.drawArc(this.LLILZ, 0.0f, 360.0f, false, paint);
        }
        RectF rectF2 = this.LLILLJJLI;
        int i3 = this.LLILZIL;
        float f2 = this.LLIZ;
        int i4 = this.LLILZLL;
        rectF2.set((i3 / 2.0f) - f2, (i4 / 2.0f) - f2, (i3 / 2.0f) + f2, (i4 / 2.0f) + f2);
        float f3 = (this.LLIZLLLIL / this.LLJILJIL) * 360;
        Paint paint2 = this.LL;
        if (paint2 != null) {
            canvas.drawArc(this.LLILLJJLI, -90.0f, f3, false, paint2);
        }
    }

    public final void setProgress(float f) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.LLIZLLLIL, f);
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(this, 178));
        valueAnimatorOfFloat.start();
    }

    public final void setProgressWithoutAnimation(float f) {
        this.LLIZLLLIL = f;
    }

    public C0GYI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = new RectF();
        this.LLILZ = new RectF();
        this.LLJILJIL = 100;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LiveCircleProgress);
        this.LLIZ = typedArrayObtainStyledAttributes.getDimension(R$styleable.LiveCircleProgress_view_radius, (int) C497740JfY.LIZIZ(63.0f));
        this.LLJI = typedArrayObtainStyledAttributes.getColor(R$styleable.LiveCircleProgress_solid_bg_color, C497740JfY.LIZLLL(R.attr.c60, context));
        this.LLJIJIL = typedArrayObtainStyledAttributes.getColor(R$styleable.LiveCircleProgress_solid_color, C497740JfY.LIZLLL(R.attr.eu5, context));
        this.LLJ = typedArrayObtainStyledAttributes.getDimension(R$styleable.LiveCircleProgress_stroke_width, (int) C497740JfY.LIZIZ(6.5f));
        this.LLJILJIL = typedArrayObtainStyledAttributes.getInteger(R$styleable.LiveCircleProgress_maxProgress, 100);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(this.LLJ);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setDither(true);
        paint.setColor(this.LLJIJIL);
        this.LL = paint;
        this.LLILLJJLI = new RectF();
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(this.LLJ);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setDither(true);
        paint2.setColor(this.LLJI);
        this.LLILLL = paint2;
        this.LLILZ = new RectF();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LLILZIL = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.LLILZLL = size;
        int i3 = this.LLILZIL;
        if (i3 <= size) {
            size = i3;
        }
        float f = size / 2.0f;
        float f2 = this.LLIZ;
        float f3 = this.LLJ;
        if (f2 + f3 > f) {
            this.LLIZ = f - f3;
        }
    }
}
