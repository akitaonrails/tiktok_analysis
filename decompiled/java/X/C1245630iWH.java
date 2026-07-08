package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0iWH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1245630iWH extends FrameLayout {
    public View LL;

    public final View getScrollTarget() {
        return this.LL;
    }

    public C1245630iWH(Context context) {
        super(context, null, 0);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        View view = this.LL;
        if (view != null) {
            return view.canScrollVertically(i);
        }
        return super.canScrollVertically(i);
    }

    public final void setScrollTarget(View view) {
        this.LL = view;
    }
}
