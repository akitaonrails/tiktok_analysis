package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;

/* JADX INFO: renamed from: X.0GRm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C415640GRm extends View {
    public final Paint LL;
    public final RectF LLILLJJLI;
    public C415650GRn LLILLL;

    public final C415650GRn getGradientData() {
        return this.LLILLL;
    }

    public C415640GRm(Context context) {
        super(context);
        this.LL = new Paint(1);
        this.LLILLJJLI = new RectF();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C415650GRn c415650GRn = this.LLILLL;
        int width = getWidth();
        int height = getHeight();
        if (c415650GRn != null) {
            float f = width;
            float f2 = f / 2.0f;
            float f3 = height;
            this.LL.setShader(new LinearGradient(f2, 0.0f, f2, f3, c415650GRn.LIZ, c415650GRn.LIZIZ, Shader.TileMode.CLAMP));
            this.LLILLJJLI.set(0.0f, 0.0f, f, f3);
        }
        canvas.drawRect(this.LLILLJJLI, this.LL);
    }

    public final void setGradientData(C415650GRn c415650GRn) {
        this.LLILLL = c415650GRn;
        invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
