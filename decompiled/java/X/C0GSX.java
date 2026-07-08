package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GSX, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0GSX extends View {
    public float LL;
    public int LLILLJJLI;
    public int LLILLL;
    public float LLILZ;
    public Paint LLILZIL;
    public boolean LLILZLL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL);
    }

    public void setIsBorder(boolean z) {
        this.LLILZLL = z;
    }

    public void setStrokeWidth(float f) {
        this.LL = f;
        this.LLILZIL.setStrokeWidth(f);
    }

    public C0GSX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LiveCircleView);
        this.LL = typedArrayObtainStyledAttributes.getDimension(R$styleable.LiveCircleView_live_strokeWidth, C12ES.LIZJ(2.0f, context));
        typedArrayObtainStyledAttributes.recycle();
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 100.0f, 100.0f, C20736316Cj.LIZIZ(R.attr.c8n, getContext()), C20736316Cj.LIZIZ(R.attr.c8m, getContext()), Shader.TileMode.MIRROR);
        Paint paint = new Paint();
        this.LLILZIL = paint;
        paint.setShader(linearGradient);
        this.LLILZIL.setAntiAlias(true);
        this.LLILZIL.setDither(true);
        this.LLILZIL.setStyle(Paint.Style.STROKE);
        this.LLILZIL.setStrokeWidth(this.LL);
    }

    public final void LIZ(int i, int i2) {
        this.LLILZIL.setShader(new LinearGradient(0.0f, 0.0f, 100.0f, 100.0f, i, i2, Shader.TileMode.MIRROR));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LLILLJJLI = getMeasuredWidth() / 2;
        this.LLILLL = getMeasuredHeight() / 2;
        if (this.LLILZLL) {
            this.LLILZ = this.LLILLJJLI - (this.LL / 2.0f);
        } else {
            this.LLILZ = this.LLILLJJLI - getPaddingBottom();
        }
    }
}
