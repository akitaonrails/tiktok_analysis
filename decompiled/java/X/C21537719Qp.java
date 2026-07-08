package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: X.19Qp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21537719Qp extends RelativeLayout {
    public boolean LL;

    public final boolean getForbidContainerScroll() {
        return this.LL;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.LL) {
            return true;
        }
        return super.canScrollHorizontally(i);
    }

    public final void setForbidContainerScroll(boolean z) {
        this.LL = z;
    }

    public C21537719Qp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
