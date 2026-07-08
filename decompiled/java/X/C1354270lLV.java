package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0lLV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1354270lLV extends C21578619ce {
    public final Set<InterfaceC1343320l3q> LL;
    public int LLILLJJLI;

    public C1354270lLV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = new LinkedHashSet();
    }

    @Override // X.C21578619ce, android.view.View
    public final void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
        Iterator<InterfaceC1343320l3q> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(getScrollY());
        }
    }

    @Override // X.C21578619ce, android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.onOverScrolled(i, i2, z, z2);
        Iterator<InterfaceC1343320l3q> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(i2);
        }
    }

    @Override // X.C21578619ce, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.LLILLJJLI = 0;
        if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            this.LLILLJJLI = Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
    }

    @Override // X.C21578619ce, X.InterfaceC1318370kPb
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        int scrollY = getScrollY();
        if (scrollY == 0 && (i2 > 0 || !view.canScrollVertically(-1))) {
            super.onNestedPreScroll(view, i, i2, iArr, i3);
        }
        if (i2 == iArr[1]) {
            return;
        }
        if (scrollY != 0 && i2 < 0 && view.canScrollVertically(-1)) {
            return;
        }
        int i4 = i2 + scrollY;
        int i5 = this.LLILLJJLI;
        if (i4 > i5) {
            i4 = i5;
        } else if (i4 < 0) {
            i4 = 0;
        }
        int i6 = i4 - scrollY;
        if (i6 != 0) {
            scrollBy(0, i6);
            iArr[1] = i6;
        }
    }
}
