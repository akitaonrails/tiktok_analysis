package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: X.0Ehf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C371650Ehf extends View {
    public float LL;
    public float LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public final float LLILZIL;
    public final float LLILZLL;
    public final int LLIZ;
    public final Paint LLIZLLLIL;
    public final Paint LLJ;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = new Path();
        float f = this.LLILZLL;
        float f2 = this.LLILZIL;
        path.moveTo(f + f2, f + f2);
        float f3 = this.LLILZLL;
        float f4 = 2;
        float f5 = this.LLILZIL;
        path.arcTo(0.0f, 0.0f, (f3 * f4) + (f4 * f5), (f5 * f4) + (f3 * f4), 180.0f, 90.0f, false);
        float f6 = this.LLILZLL;
        float f7 = this.LLILZIL;
        path.moveTo(f6 + f7, f6 + f7);
        float f8 = this.LLILZLL;
        float f9 = this.LLILZIL;
        path.arcTo(f8, f8, f8 + (f4 * f9), f8 + (f4 * f9), 270.0f, -90.0f, false);
        canvas.drawPath(path, this.LLJ);
        float f10 = this.LLILZIL;
        float f11 = this.LLILZLL;
        canvas.drawRect(new RectF(f10 + f11, 0.0f, (this.LL - f10) - f11, f11), this.LLIZLLLIL);
        canvas.save();
        canvas.rotate(180.0f, this.LLILLL, this.LLILZ);
        float f12 = this.LLILZIL;
        float f13 = this.LLILZLL;
        canvas.drawRect(new RectF(f12 + f13, 0.0f, (this.LL - f12) - f13, f13), this.LLIZLLLIL);
        canvas.drawPath(path, this.LLJ);
        canvas.restore();
        canvas.save();
        canvas.rotate(90.0f, this.LLILLL, this.LLILZ);
        float f14 = this.LLILZIL;
        float f15 = this.LLILZLL;
        canvas.drawRect(new RectF(f14 + f15, 0.0f, (this.LLILLJJLI - f14) - f15, f15), this.LLIZLLLIL);
        canvas.drawPath(path, this.LLJ);
        canvas.restore();
        canvas.rotate(270.0f, this.LLILLL, this.LLILZ);
        float f16 = this.LLILZIL;
        float f18 = this.LLILZLL;
        canvas.drawRect(new RectF(f16 + f18, 0.0f, (this.LLILLJJLI - f16) - f18, f18), this.LLIZLLLIL);
        canvas.drawPath(path, this.LLJ);
    }

    public C371650Ehf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZIL = C11VU.LIZ(8.0f);
        this.LLILZLL = C11VU.LIZ(5.0f);
        this.LLIZ = 536870912;
        this.LLIZLLLIL = new Paint();
        this.LLJ = new Paint();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        this.LL = View.MeasureSpec.getSize(i);
        float size = View.MeasureSpec.getSize(i2);
        this.LLILLJJLI = size;
        this.LLILLL = this.LL / 2.0f;
        this.LLILZ = size / 2.0f;
        Paint paint = this.LLJ;
        paint.setAntiAlias(true);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStyle(Paint.Style.FILL);
        float f = this.LLILZLL;
        float f2 = this.LLILZIL;
        float f3 = ((f / 4) + f2) / (f2 + f);
        float f4 = this.LLILZLL;
        float f5 = this.LLILZIL;
        int i3 = this.LLIZ;
        paint.setShader(new RadialGradient(f4 + f5, f4 + f5, f4 + f5, new int[]{i3, i3, 0}, new float[]{0.0f, f3, 1.0f}, Shader.TileMode.CLAMP));
        paint.setDither(true);
        Paint paint2 = this.LLIZLLLIL;
        paint2.setAntiAlias(true);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStyle(Paint.Style.FILL);
        float f6 = this.LLILLL;
        float f7 = this.LLILZLL;
        int i4 = this.LLIZ;
        paint2.setShader(new LinearGradient(f6, f7, f6, 0.0f, new int[]{i4, i4, 0}, new float[]{0.0f, 0.25f, 1.0f}, Shader.TileMode.CLAMP));
        paint2.setDither(true);
        super.onMeasure(i, i2);
    }
}
