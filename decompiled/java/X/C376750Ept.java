package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0Ept, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376750Ept extends FrameLayout {
    public static final float LLILZ = (int) C497740JfY.LIZIZ(12.0f);
    public boolean LL;
    public final Paint LLILLJJLI;
    public final RectF LLILLL;

    public final boolean getShowBottomFade() {
        return this.LL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        super.dispatchDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        float f = LLILZ;
        float f2 = height / 2.0f;
        if (f > f2) {
            f = f2;
        }
        float paddingBottom = getPaddingBottom();
        if (this.LL) {
            float f3 = height - paddingBottom;
            float f4 = f3 - f;
            this.LLILLJJLI.setShader(new LinearGradient(0.0f, f4, 0.0f, f3, 0, -16777216, Shader.TileMode.CLAMP));
            this.LLILLL.set(0.0f, f4, width, f3);
            canvas.drawRect(this.LLILLL, this.LLILLJJLI);
        }
        canvas.restoreToCount(iSaveLayer);
    }

    public final void setShowBottomFade(boolean z) {
        this.LL = z;
        invalidate();
    }

    public C376750Ept(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.LLILLJJLI = paint;
        this.LLILLL = new RectF();
    }
}
