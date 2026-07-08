package X;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: renamed from: X.19Xx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21556719Xx implements InterfaceC1846340y9A {
    public boolean LL;
    public final /* synthetic */ C21556319Xt LLILLJJLI;

    public C21556719Xx(C21556319Xt c21556319Xt) {
        this.LLILLJJLI = c21556319Xt;
    }

    @Override // X.InterfaceC1846340y9A
    public final void LIZIZ(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        C21556319Xt c21556319Xt = this.LLILLJJLI;
        if (c21556319Xt.LLJJLIIIJLLLLLLLZ == viewPager) {
            c21556319Xt.LJIILIIL(pagerAdapter2, this.LL);
        }
    }
}
