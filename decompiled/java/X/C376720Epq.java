package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0Epq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376720Epq extends FrameLayout {
    public final Paint LL;
    public final Paint LLILLJJLI;
    public final RectF LLILLL;
    public final RectF LLILZ;
    public final float LLILZIL;
    public final int[] LLILZLL;
    public final float[] LLIZ;
    public final float LLIZLLLIL;
    public final float LLJ;
    public final float LLJI;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = this.LLILZ;
        float f = this.LLJ;
        canvas.drawRoundRect(rectF, f, f, this.LLILLJJLI);
        super.dispatchDraw(canvas);
        RectF rectF2 = this.LLILLL;
        float f2 = this.LLJ;
        canvas.drawRoundRect(rectF2, f2, f2, this.LL);
    }

    public C376720Epq(Context context, AttributeSet attributeSet) {
        float f;
        super(context, attributeSet);
        this.LL = new Paint(1);
        this.LLILLJJLI = new Paint(1);
        this.LLILLL = new RectF();
        this.LLILZ = new RectF();
        if (C426750GoL.LIZLLL(context)) {
            f = 245.0f;
        } else {
            f = 115.0f;
        }
        this.LLILZIL = f;
        setBackgroundColor(0);
        this.LLILZLL = new int[]{9943285, 446150901, -6833931, 446150901};
        this.LLIZ = new float[]{0.0f, 0.05f, 0.5f, 1.0f};
        this.LLIZLLLIL = C497740JfY.LIZIZ(1);
        this.LLJ = C497740JfY.LIZIZ(4);
        this.LLJI = C497740JfY.LIZIZ(12);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        RectF rectF = this.LLILLL;
        float f = this.LLIZLLLIL;
        float f2 = i;
        float f3 = i2;
        rectF.set(f, f, f2 - f, f3 - f);
        this.LLILZ.set(0.0f, f3 - this.LLJI, f2, f3);
        float f4 = f3 / 2.0f;
        LinearGradient linearGradient = new LinearGradient(0.0f, f4, f2, f4, this.LLILZLL, this.LLIZ, Shader.TileMode.CLAMP);
        Matrix matrix = new Matrix();
        matrix.postRotate(this.LLILZIL, getWidth() / 2.0f, getHeight() / 2.0f);
        linearGradient.setLocalMatrix(matrix);
        this.LL.setShader(linearGradient);
        this.LL.setStyle(Paint.Style.STROKE);
        this.LL.setStrokeWidth(this.LLIZLLLIL);
        LinearGradient linearGradient2 = new LinearGradient(f2 / 2.0f, f3 - this.LLJI, f2 / 2, f3, new int[]{0, 641420740}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.LLILLJJLI.setStyle(Paint.Style.FILL);
        this.LLILLJJLI.setShader(linearGradient2);
    }
}
