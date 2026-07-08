package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: renamed from: X.0EhC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C371360EhC extends View {
    public final Paint LL;
    public final Paint LLILLJJLI;
    public final RectF LLILLL;
    public final RectF LLILZ;
    public float LLILZIL;
    public final float LLILZLL;

    public final void LIZ() {
        this.LL.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.LLILZLL, new int[]{771751936, 0}, (float[]) null, Shader.TileMode.CLAMP));
        this.LLILLL.set(0.0f, 0.0f, getWidth(), this.LLILZLL);
        this.LLILLJJLI.setShader(new LinearGradient(0.0f, getHeight(), 0.0f, getHeight() - this.LLILZIL, new int[]{771751936, 0}, (float[]) null, Shader.TileMode.CLAMP));
        this.LLILZ.set(0.0f, getHeight() - this.LLILZIL, getWidth(), getHeight());
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(this.LLILLL, this.LL);
        canvas.drawRect(this.LLILZ, this.LLILLJJLI);
    }

    public C371360EhC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new Paint(1);
        this.LLILLJJLI = new Paint(1);
        this.LLILLL = new RectF();
        this.LLILZ = new RectF();
        this.LLILZIL = TypedValue.applyDimension(3, 242.0f, getResources().getDisplayMetrics());
        this.LLILZLL = TypedValue.applyDimension(3, 136.0f, getResources().getDisplayMetrics());
        LIZ();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LIZ();
    }
}
