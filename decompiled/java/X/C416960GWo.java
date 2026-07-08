package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0GWo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416960GWo extends FrameLayout {
    public static final int LL = C439101nJ.LIZ(3);
    public static final int LLILLJJLI = C439101nJ.LIZ(7);

    public final int getInnerRingInitialColor() {
        return 0;
    }

    public final int getShadowLayerAlpha() {
        return Color.alpha(0);
    }

    public final int getRingModeWidthDiff() {
        return LLILLJJLI - LL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onDrawForeground(Canvas canvas) {
        super.onDrawForeground(canvas);
    }

    public C416960GWo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
