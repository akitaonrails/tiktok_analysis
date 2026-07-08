package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;

/* JADX INFO: renamed from: X.0Jdc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C496540Jdc implements InterfaceC469360Ias {
    public final /* synthetic */ C1846060y8i LL;
    public final /* synthetic */ HorizontalScrollView LLILLJJLI;

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
    }

    public C496540Jdc(C1846060y8i c1846060y8i, HorizontalScrollView horizontalScrollView) {
        this.LL = c1846060y8i;
        this.LLILLJJLI = horizontalScrollView;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        ViewGroup viewGroup;
        int width;
        int i3;
        View childAt = this.LL.getChildAt(0);
        if ((childAt instanceof ViewGroup) && (viewGroup = (ViewGroup) childAt) != null) {
            View childAt2 = viewGroup.getChildAt(i);
            int i4 = i + 1;
            if (i4 >= viewGroup.getChildCount()) {
                width = 0;
            } else {
                width = viewGroup.getChildAt(i4).getWidth();
            }
            int left = ((this.LL.getLeft() + childAt2.getLeft()) + (childAt2.getWidth() / 2)) - (this.LLILLJJLI.getWidth() / 2);
            int width2 = (int) ((childAt2.getWidth() + width) * 0.5f * f);
            if (C426750GoL.LJ(this.LL)) {
                i3 = left - width2;
            } else {
                i3 = left + width2;
            }
            this.LLILLJJLI.scrollTo(i3, 0);
        }
    }
}
