package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.mt.protector.impl.color.ColorProtector;

/* JADX INFO: renamed from: X.0GRe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C415560GRe extends View {
    public final Paint LL;
    public final int[] LLILLJJLI;
    public final float[] LLILLL;

    public int[] LIZ() {
        return new int[]{ColorProtector.parseColor("#00000000"), ColorProtector.parseColor("#80000000"), ColorProtector.parseColor("#b3000000"), ColorProtector.parseColor("#cc000000"), ColorProtector.parseColor("#e6000000")};
    }

    public float[] LIZIZ() {
        return new float[]{0.0f, 0.13f, 0.22f, 0.31f, 0.55f};
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.LL.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, this.LLILLJJLI, this.LLILLL, Shader.TileMode.CLAMP));
        canvas.drawPaint(this.LL);
    }

    public C415560GRe(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C415560GRe(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.LL = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.LLILLJJLI = LIZ();
        this.LLILLL = LIZIZ();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }
}
