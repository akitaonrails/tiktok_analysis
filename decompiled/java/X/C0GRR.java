package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GRR, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GRR extends View {
    public final Paint LL;
    public int[] LLILLJJLI;
    public final float[] LLILLL;
    public final float LLILZ;
    public final RectF LLILZIL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.LLILZIL;
        float f = this.LLILZ;
        float f2 = 2;
        rectF.set(f / f2, f / f2, getWidth() - (this.LLILZ / f2), getHeight() - (this.LLILZ / f2));
        canvas.drawOval(this.LLILZIL, this.LL);
    }

    public final void setGradientColors(int[] iArr) {
        this.LLILLJJLI = iArr;
        this.LL.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), getHeight(), this.LLILLJJLI, this.LLILLL, Shader.TileMode.CLAMP));
        invalidate();
        C20441214yg.LJIIIZ("redesign", "setGradientColors");
    }

    public C0GRR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.LL = paint;
        this.LLILLJJLI = new int[]{C497740JfY.LJFF(R.color.ac4), C497740JfY.LJFF(R.color.ac4)};
        this.LLILLL = new float[]{0.0f, 1.0f};
        float fLIZIZ = (int) C497740JfY.LIZIZ(1.0f);
        this.LLILZ = fLIZIZ;
        this.LLILZIL = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(fLIZIZ);
        paint.setAntiAlias(true);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.LL.setShader(new LinearGradient(0.0f, 0.0f, i, i2, this.LLILLJJLI, this.LLILLL, Shader.TileMode.CLAMP));
    }
}
