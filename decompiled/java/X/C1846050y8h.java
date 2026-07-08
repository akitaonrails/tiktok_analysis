package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

/* JADX INFO: renamed from: X.0y8h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1846050y8h extends HorizontalScrollView {
    @Override // android.widget.HorizontalScrollView, android.view.View
    public float getLeftFadingEdgeStrength() {
        if (C497740JfY.LJJ()) {
            return super.getLeftFadingEdgeStrength();
        }
        return 0.0f;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public float getRightFadingEdgeStrength() {
        if (C497740JfY.LJJ()) {
            return 0.0f;
        }
        return super.getRightFadingEdgeStrength();
    }

    public C1846050y8h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
