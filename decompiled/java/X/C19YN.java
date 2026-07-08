package X;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: renamed from: X.19YN, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19YN implements InterfaceC1846340y9A {
    public boolean LL;
    public final /* synthetic */ C19YK LLILLJJLI;

    public C19YN(C19YK c19yk) {
        this.LLILLJJLI = c19yk;
    }

    @Override // X.InterfaceC1846340y9A
    public final void LIZIZ(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        C19YK c19yk = this.LLILLJJLI;
        if (c19yk.LLJL == viewPager) {
            c19yk.LJIIL(pagerAdapter2, this.LL);
        }
    }
}
