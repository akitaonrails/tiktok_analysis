package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0s1D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1610770s1D extends View {
    public static final /* synthetic */ int LLJI = 0;
    public Paint LL;
    public float LLILLJJLI;
    public float LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public int LLIZLLLIL;
    public Paint LLJ;

    public C1610770s1D(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LL);
        canvas.drawCircle(this.LLILZ, this.LLILZIL, this.LLIZ, this.LLJ);
    }

    public void setFraction(float f) {
        this.LLIZ = this.LLILZLL + (this.LLIZLLLIL * f);
        this.LLJ.setStrokeWidth(this.LLILLJJLI * (1.0f - f));
        postInvalidate();
    }

    public void setInnerStrokeWidth(int i) {
        float f = i;
        this.LLILLL = f;
        this.LL.setStrokeWidth(f);
        postInvalidate();
    }

    public void setSize(float f) {
        this.LLIZ = f;
        postInvalidate();
    }

    public void setSizeScale(float f) {
        this.LLIZ = this.LLILZLL * f;
        postInvalidate();
    }

    public void setStrokeWide(float f) {
        this.LLJ.setStrokeWidth(this.LLILLJJLI * (1.0f - f));
        postInvalidate();
    }

    public void setStrokeWidth(int i) {
        float f = i;
        this.LLILLJJLI = f;
        this.LLJ.setStrokeWidth(f);
        postInvalidate();
    }

    public C1610770s1D(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LIZ(int i, int i2) {
        float f = 100;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, f, f, i, i2, Shader.TileMode.MIRROR);
        this.LL.setShader(linearGradient);
        this.LLJ.setShader(linearGradient);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LLILZ = getMeasuredWidth() / 2;
        this.LLILZIL = getMeasuredHeight() / 2;
        float measuredHeight = (getMeasuredHeight() / 2) - getPaddingBottom();
        this.LLILZLL = measuredHeight;
        this.LLIZ = measuredHeight;
        this.LLIZLLLIL = getPaddingBottom();
    }

    public C1610770s1D(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LiveCircleView);
        this.LLILLJJLI = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.LiveCircleView_live_strokeWidth, C12ES.LIZJ(1.5f, context));
        typedArrayObtainStyledAttributes.recycle();
        this.LL = new Paint();
        if (!C295310Bhp.LIZ()) {
            this.LL.setShader(new LinearGradient(0.0f, 0.0f, 100.0f, 100.0f, ColorProtector.parseColor("#FF1764"), ColorProtector.parseColor("#ED3495"), Shader.TileMode.MIRROR));
        }
        this.LL.setAntiAlias(true);
        this.LL.setDither(true);
        this.LL.setStyle(Paint.Style.STROKE);
        Paint paint = this.LL;
        float f = this.LLILLL;
        paint.setStrokeWidth(f == 0.0f ? C12ES.LIZJ(1.0f, context) : f);
        Paint paint2 = new Paint(this.LL);
        this.LLJ = paint2;
        paint2.setStrokeWidth(this.LLILLJJLI);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (C295310Bhp.LIZ()) {
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, i, i2, ColorProtector.parseColor("#FF1764"), ColorProtector.parseColor("#ED3495"), Shader.TileMode.CLAMP);
            this.LL.setShader(linearGradient);
            this.LLJ.setShader(linearGradient);
        }
    }

    public final void LIZIZ(int i, int i2, int i3, int i4, int i5) {
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, i4, i5, new int[]{i, i2, i3}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.LL.setShader(linearGradient);
        this.LLJ.setShader(linearGradient);
    }
}
