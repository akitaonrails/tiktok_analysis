package X;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: renamed from: X.0y8f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1846030y8f implements InterfaceC1846340y9A {
    public boolean LL;
    public final /* synthetic */ C1846010y8d LLILLJJLI;

    public C1846030y8f(C1846010y8d c1846010y8d) {
        this.LLILLJJLI = c1846010y8d;
    }

    @Override // X.InterfaceC1846340y9A
    public final void LIZIZ(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        if (this.LLILLJJLI.getViewPager() == viewPager) {
            this.LLILLJJLI.LJII(pagerAdapter2, this.LL);
        }
    }
}
