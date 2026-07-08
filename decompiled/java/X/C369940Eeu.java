package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0Eeu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C369940Eeu extends FrameLayout {
    public final Path LL;
    public float LLILLJJLI;

    public final float getCornerRadius() {
        return this.LLILLJJLI;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        this.LL.reset();
        RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        Path path = this.LL;
        float f = this.LLILLJJLI;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(this.LL);
        super.dispatchDraw(canvas);
    }

    public final void setCornerRadius(float f) {
        this.LLILLJJLI = f;
    }

    public C369940Eeu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = new Path();
        this.LLILLJJLI = C418440Gaw.LIZIZ(16);
    }
}
