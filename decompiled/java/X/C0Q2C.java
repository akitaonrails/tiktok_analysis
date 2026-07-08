package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;

/* JADX INFO: renamed from: X.0Q2C, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q2C extends ViewGroup {
    private final RotateAnimation getRotateAnim() {
        throw null;
    }

    public final C0Q2E getState() {
        throw null;
    }

    public final void setState(C0Q2E c0q2e) {
        int i = C0Q2D.LIZ[c0q2e.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            throw new C1954807lC();
        }
        throw null;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        View.MeasureSpec.makeMeasureSpec((size - paddingLeft) - paddingRight, 1073741824);
        View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        getPaddingLeft();
        getPaddingTop();
        throw null;
    }
}
