package X;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: renamed from: X.19Y6, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19Y6 implements InterfaceC1846340y9A {
    public boolean LL;
    public final /* synthetic */ C19Y3 LLILLJJLI;

    public C19Y6(C19Y3 c19y3) {
        this.LLILLJJLI = c19y3;
    }

    @Override // X.InterfaceC1846340y9A
    public final void LIZIZ(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        C19Y3 c19y3 = this.LLILLJJLI;
        if (c19y3.LLJJLIIIJLLLLLLLZ == viewPager) {
            c19y3.LJIILJJIL(pagerAdapter2, this.LL);
        }
    }
}
