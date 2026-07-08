package X;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: renamed from: X.19Ug, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21547219Ug implements InterfaceC1846340y9A {
    public boolean LL;
    public final /* synthetic */ C21546719Ub LLILLJJLI;

    public C21547219Ug(C21546719Ub c21546719Ub) {
        this.LLILLJJLI = c21546719Ub;
    }

    @Override // X.InterfaceC1846340y9A
    public final void LIZIZ(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        C21546719Ub c21546719Ub = this.LLILLJJLI;
        if (c21546719Ub.LLLIIII == viewPager) {
            c21546719Ub.LJIILL(pagerAdapter2, this.LL);
        }
    }
}
