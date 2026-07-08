package X;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: renamed from: X.0hEQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1196120hEQ implements InterfaceC469360Ias {
    public final /* synthetic */ C1196110hEP LL;

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public C1196120hEQ(C1196110hEP c1196110hEP) {
        this.LL = c1196110hEP;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        PagerAdapter adapter;
        PagerAdapter adapter2;
        ViewPager viewPager = this.LL.LLJJJJ;
        if (viewPager != null && viewPager.getAdapter() != null) {
            ViewPager viewPager2 = this.LL.LLJJJJ;
            int count = 0;
            if (viewPager2 != null && (adapter = viewPager2.getAdapter()) != null && adapter.getCount() > 0) {
                C1196110hEP c1196110hEP = this.LL;
                ViewPager viewPager3 = c1196110hEP.LLJJJJ;
                if (viewPager3 != null && (adapter2 = viewPager3.getAdapter()) != null) {
                    count = adapter2.getCount();
                }
                c1196110hEP.LJJJJJ(i, count);
            }
        }
    }
}
