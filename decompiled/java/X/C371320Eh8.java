package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0Eh8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C371320Eh8 extends FrameLayout {
    public int LL;
    public boolean LLILLJJLI;
    public final Paint LLILLL;
    public LinearGradient LLILZ;

    public final boolean getFadeEnabled() {
        return this.LLILLJJLI;
    }

    public final int getFadeHeightPx() {
        return this.LL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.LLILLJJLI && this.LL > 0 && getWidth() > 0 && getHeight() > 0) {
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            super.dispatchDraw(canvas);
            float height = getHeight() - this.LL;
            if (height < 0.0f) {
                height = 0.0f;
            }
            LinearGradient linearGradient = this.LLILZ;
            if (linearGradient == null) {
                linearGradient = new LinearGradient(0.0f, height, 0.0f, getHeight(), new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.LLILZ = linearGradient;
            }
            this.LLILLL.setShader(linearGradient);
            canvas.drawRect(0.0f, height, getWidth(), getHeight(), this.LLILLL);
            this.LLILLL.setShader(null);
            canvas.restoreToCount(iSaveLayer);
            return;
        }
        super.dispatchDraw(canvas);
    }

    public final void setFadeEnabled(boolean z) {
        if (this.LLILLJJLI == z) {
            return;
        }
        this.LLILLJJLI = z;
        setLayerType(z ? 1 : 0, null);
        invalidate();
    }

    public final void setFadeHeightPx(int i) {
        this.LL = i;
        this.LLILZ = null;
        invalidate();
    }

    public C371320Eh8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.LLILLL = paint;
    }
}
