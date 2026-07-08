package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: X.0Ehh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C371670Ehh extends View {
    public final Paint LL;
    public float LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public final float LLILZIL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LL);
    }

    public C371670Ehh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(C12ES.LIZJ(3.0f, context));
        this.LL = paint;
        this.LLILZIL = C12ES.LIZJ(3.0f, context);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = i;
        this.LLILLJJLI = f / 2.0f;
        float f2 = i2;
        this.LLILLL = f2 / 2.0f;
        this.LLILZ = (Math.min(i, i2) / 2.0f) - (this.LLILZIL / 2.0f);
        this.LL.setShader(new LinearGradient(0.0f, 0.0f, f, f2, -59548, -1231723, Shader.TileMode.CLAMP));
    }
}
