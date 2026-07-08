package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0J0X, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J0X extends FrameLayout {
    public C0J0Y LL;

    public final C0J0Y getScrollIntercept() {
        return this.LL;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        C0J0Y c0j0y = this.LL;
        if (c0j0y == null || !c0j0y.LIZ(i)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        C0J0Y c0j0y = this.LL;
        if (c0j0y == null || !c0j0y.LIZIZ(i)) {
            return false;
        }
        return true;
    }

    public final void setScrollIntercept(C0J0Y c0j0y) {
        this.LL = c0j0y;
    }

    public C0J0X(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
