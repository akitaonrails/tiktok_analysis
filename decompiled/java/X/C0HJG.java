package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0HJG, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HJG extends FrameLayout {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final Path LL;
    public final C0HJH LLILLJJLI;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C0HJG.class, "radius", "getRadius()F", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217371BqR};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float getRadius() {
        C0HJH c0hjh = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
        return ((Number) c0hjh.LLILLJJLI).floatValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.clipPath(this.LL);
        super.dispatchDraw(canvas);
    }

    public final void setRadius(float f) {
        this.LLILLJJLI.setValue(this, LLILLL[0], Float.valueOf(f));
    }

    public C0HJG(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new Path();
        this.LLILLJJLI = C0HJI.LIZ(this, Float.valueOf(0.0f));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LL.addRoundRect(new RectF(0.0f, 0.0f, i, i2), getRadius(), getRadius(), Path.Direction.CW);
    }
}
