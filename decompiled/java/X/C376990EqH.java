package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: X.0EqH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376990EqH extends View {
    public int LL;
    public final float LLILLJJLI;
    public final float LLILLL;
    public final Paint LLILZ;
    public final Paint LLILZIL;
    public final RectF LLILZLL;
    public final RectF LLIZ;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float fLIZIZ = (int) C497740JfY.LIZIZ(this.LLILLL);
        float fLIZIZ2 = (int) C497740JfY.LIZIZ(this.LLILLJJLI);
        float f = fLIZIZ / 2;
        this.LLIZ.set(f, f, getWidth() - f, getHeight() - f);
        this.LLILZIL.setShader(null);
        this.LLILZIL.setShadowLayer(fLIZIZ, 0.0f, 0.0f, this.LL);
        setLayerType(1, this.LLILZIL);
        this.LLILZLL.set(fLIZIZ, fLIZIZ, getWidth() - fLIZIZ, getHeight() - fLIZIZ);
        this.LLILZ.setShader(null);
        this.LLILZ.setColor(this.LL);
        canvas.drawRoundRect(this.LLILZLL, fLIZIZ2, fLIZIZ2, this.LLILZIL);
        canvas.drawRoundRect(this.LLILZLL, fLIZIZ2, fLIZIZ2, this.LLILZ);
    }

    public final void setColor(int i) {
        this.LL = i;
        invalidate();
    }

    public C376990EqH(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = -16777216;
        this.LLILLJJLI = 8.0f;
        this.LLILLL = 20.0f;
        this.LLILZ = new Paint(1);
        this.LLILZIL = new Paint(1);
        this.LLILZLL = new RectF();
        this.LLIZ = new RectF();
    }
}
