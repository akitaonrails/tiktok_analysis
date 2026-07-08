package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GSW, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GSW extends View {
    public float LL;
    public final RectF LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public Paint LLILZIL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.LLILZIL;
        if (paint != null) {
            RectF rectF = this.LLILLJJLI;
            float f = this.LLILLL;
            canvas.drawArc(rectF, f, this.LLILZ - f, false, paint);
        }
    }

    public final void setEndPointAngle(float f) {
        this.LLILZ = f;
        invalidate();
    }

    public final void setStartPointAngle(float f) {
        this.LLILLL = f;
        invalidate();
    }

    public final void setStrokeWidth(float f) {
        this.LL = f;
        Paint paint = this.LLILZIL;
        if (paint != null) {
            paint.setStrokeWidth(f);
        }
    }

    public C0GSW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = new RectF();
        this.LLILZ = 180.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LiveCircleView);
        this.LL = typedArrayObtainStyledAttributes.getDimension(R$styleable.LiveCircleView_live_strokeWidth, C12ES.LIZJ(2.0f, context));
        typedArrayObtainStyledAttributes.recycle();
        int iLIZIZ = C20736316Cj.LIZIZ(R.attr.c8n, getContext());
        int iLIZIZ2 = C20736316Cj.LIZIZ(R.attr.c8m, getContext());
        Paint paint = new Paint();
        paint.setShader(new LinearGradient(0.0f, 0.0f, 100.0f, 100.0f, iLIZIZ, iLIZIZ2, Shader.TileMode.MIRROR));
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.LL);
        this.LLILZIL = paint;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LLILLJJLI.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
    }
}
