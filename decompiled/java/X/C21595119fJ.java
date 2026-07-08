package X;

import androidx.viewpager.widget.PagerAdapter;

/* JADX INFO: renamed from: X.19fJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21595119fJ implements InterfaceC469360Ias {
    public final InterfaceC469360Ias LL;
    public final /* synthetic */ C21594519fD LLILLJJLI;

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        this.LL.onPageScrollStateChanged(i);
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        PagerAdapter adapter = super/*androidx.viewpager.widget.ViewPager*/.getAdapter();
        if (this.LLILLJJLI.LIZJ() && adapter != null) {
            i = (adapter.getCount() - i) - 1;
        }
        this.LL.onPageSelected(i);
    }

    public C21595119fJ(C21594519fD c21594519fD, InterfaceC469360Ias interfaceC469360Ias) {
        this.LLILLJJLI = c21594519fD;
        this.LL = interfaceC469360Ias;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        int width = this.LLILLJJLI.getWidth();
        PagerAdapter adapter = super/*androidx.viewpager.widget.ViewPager*/.getAdapter();
        if (this.LLILLJJLI.LIZJ() && adapter != null) {
            int count = adapter.getCount();
            float f2 = width;
            int iLJIL = ((int) ((1.0f - adapter.LJIL(i)) * f2)) + i2;
            while (i < count && iLJIL > 0) {
                i++;
                iLJIL -= (int) (adapter.LJIL(i) * f2);
            }
            i = (count - i) - 1;
            i2 = -iLJIL;
            f = i2 / (f2 * adapter.LJIL(i));
        }
        this.LL.onPageScrolled(i, f, i2);
    }
}
