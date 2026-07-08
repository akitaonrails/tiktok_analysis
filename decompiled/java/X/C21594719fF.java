package X;

import androidx.viewpager.widget.PagerAdapter;

/* JADX INFO: renamed from: X.19fF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21594719fF implements InterfaceC469360Ias {
    public final InterfaceC469360Ias LL;
    public final /* synthetic */ C21594319fB LLILLJJLI;

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        this.LL.onPageScrollStateChanged(i);
        C21594319fB c21594319fB = this.LLILLJJLI;
        if (c21594319fB.LLILLL && i == 0 && !c21594319fB.LIZJ() && this.LLILLJJLI.getCurrentItem() == 0 && this.LLILLJJLI.getScrollX() > 0) {
            this.LLILLJJLI.setScrollX(0);
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        PagerAdapter adapter = super/*androidx.viewpager.widget.ViewPager*/.getAdapter();
        if (this.LLILLJJLI.LIZJ() && adapter != null) {
            i = (adapter.getCount() - i) - 1;
        }
        this.LL.onPageSelected(i);
    }

    public C21594719fF(C21594319fB c21594319fB, InterfaceC469360Ias interfaceC469360Ias) {
        this.LLILLJJLI = c21594319fB;
        this.LL = interfaceC469360Ias;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        PagerAdapter adapter = super/*androidx.viewpager.widget.ViewPager*/.getAdapter();
        if (this.LLILLJJLI.LIZJ() && adapter != null) {
            if (i == adapter.getCount() - 1 && f == 0.0f) {
                i--;
                i2 = this.LLILLJJLI.getWidth();
                f = 1.0f;
            }
            this.LL.onPageScrolled((r1 - (i + 1)) - 1, 1.0f - f, this.LLILLJJLI.getWidth() - i2);
            return;
        }
        this.LL.onPageScrolled(i, f, i2);
    }
}
