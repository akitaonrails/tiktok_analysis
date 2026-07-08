package X;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0cVB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1014310cVB extends FrameLayout {
    public float LL;
    public float LLILLJJLI;
    public float LLILLL;
    public float LLILZ;

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        return this.LLILZ;
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        return this.LL;
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
        return this.LLILLJJLI;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        return this.LLILLL;
    }

    public C1014310cVB(Context context) {
        super(context, null, 0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C1022620cia.LIZ("FadingFrameLayout", "onDraw");
    }
}
