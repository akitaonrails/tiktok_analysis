package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0EaZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367250EaZ extends FrameLayout {
    public final float[] LL;
    public final Path LLILLJJLI;
    public final RectF LLILLL;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.clipPath(this.LLILLJJLI);
        super.dispatchDraw(canvas);
    }

    public C367250EaZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new float[]{C418440Gaw.LIZIZ(18), C418440Gaw.LIZIZ(18), C418440Gaw.LIZIZ(18), C418440Gaw.LIZIZ(18), C418440Gaw.LIZIZ(18), C418440Gaw.LIZIZ(18), C418440Gaw.LIZIZ(18), C418440Gaw.LIZIZ(18)};
        this.LLILLJJLI = new Path();
        this.LLILLL = new RectF();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLILLL.set(0.0f, 0.0f, getWidth(), getHeight());
        this.LLILLJJLI.reset();
        this.LLILLJJLI.addRoundRect(this.LLILLL, this.LL, Path.Direction.CW);
        invalidate();
    }
}
