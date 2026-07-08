package X;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: renamed from: X.0y8t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1846170y8t implements InterfaceC1846340y9A {
    public boolean LL;
    public final /* synthetic */ C1846140y8q LLILLJJLI;

    public C1846170y8t(C1846140y8q c1846140y8q) {
        this.LLILLJJLI = c1846140y8q;
    }

    @Override // X.InterfaceC1846340y9A
    public final void LIZIZ(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        if (this.LLILLJJLI.getViewPager() == viewPager) {
            this.LLILLJJLI.LJIIJJI(pagerAdapter2, this.LL);
        }
    }
}
