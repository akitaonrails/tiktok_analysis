package X;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: renamed from: X.0y92, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1846260y92 implements InterfaceC1846340y9A {
    public boolean LL;
    public final /* synthetic */ C1846220y8y LLILLJJLI;

    public C1846260y92(C1846220y8y c1846220y8y) {
        this.LLILLJJLI = c1846220y8y;
    }

    @Override // X.InterfaceC1846340y9A
    public final void LIZIZ(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        if (this.LLILLJJLI.getViewPager() == viewPager) {
            this.LLILLJJLI.LJIILJJIL(pagerAdapter2, this.LL);
        }
    }
}
