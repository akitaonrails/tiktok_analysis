package X;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: renamed from: X.0y8k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1846080y8k implements InterfaceC1846340y9A {
    public boolean LL;
    public final /* synthetic */ C1846060y8i LLILLJJLI;

    public C1846080y8k(C1846060y8i c1846060y8i) {
        this.LLILLJJLI = c1846060y8i;
    }

    @Override // X.InterfaceC1846340y9A
    public final void LIZIZ(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        if (this.LLILLJJLI.getViewPager() == viewPager) {
            this.LLILLJJLI.LJIIZILJ(pagerAdapter2, this.LL);
        }
    }
}
