package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0Epr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376730Epr extends FrameLayout {
    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        return 0.5f;
    }

    public C376730Epr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setWillNotDraw(false);
        setFadingEdgeLength((int) C497740JfY.LIZIZ(64.0f));
    }
}
