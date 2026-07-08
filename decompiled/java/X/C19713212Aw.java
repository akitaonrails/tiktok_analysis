package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.RotateAnimation;
import com.ss.android.ugc.aweme.app.R$styleable;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.12Aw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19713212Aw extends View {
    public final float LL;
    public final float LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public final Paint LLILZIL;
    public RectF LLILZLL;
    public final C01GW LLIZ;

    public C19713212Aw(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LIZIZ() {
        this.LLILZ = true;
        if (this.LLILLL) {
            LIZ();
        }
    }

    public final void LIZJ() {
        this.LLILZ = false;
        clearAnimation();
    }

    private final RotateAnimation getRotateAnim() {
        return (RotateAnimation) this.LLIZ.getValue();
    }

    public final void LIZ() {
        if (!getRotateAnim().hasStarted() || getRotateAnim().hasEnded()) {
            startAnimation(getRotateAnim());
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLILLL = true;
        if (this.LLILZ) {
            LIZ();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLILLL = false;
        clearAnimation();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.LLILZLL == null) {
            float f = this.LL / 2;
            this.LLILZLL = new RectF(getPaddingStart() + f, getPaddingTop() + f, (getWidth() - getPaddingEnd()) - f, (getHeight() - getPaddingBottom()) - f);
        }
        canvas.drawArc(this.LLILZLL, 0.0f, this.LLILLJJLI, false, this.LLILZIL);
    }

    public final void setLineWidth(float f) {
        this.LLILZIL.setStrokeWidth(f);
    }

    public final void setLoadingColor(int i) {
        this.LLILZIL.setColor(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C19713212Aw(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        this.LLILZIL = paint;
        this.LLIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(252));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LoadingCircleView);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.LoadingCircleView_circleColor, -16777216);
        float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LoadingCircleView_lineWidth, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(5.0d))));
        this.LL = dimensionPixelSize;
        this.LLILLJJLI = typedArrayObtainStyledAttributes.getFloat(R$styleable.LoadingCircleView_sweepAngle, 300.0f);
        typedArrayObtainStyledAttributes.recycle();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setLoadingColor(color);
        setLineWidth(dimensionPixelSize);
    }
}
