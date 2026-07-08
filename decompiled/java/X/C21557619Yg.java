package X;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: renamed from: X.19Yg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21557619Yg implements InterfaceC1846340y9A {
    public boolean LL;
    public final /* synthetic */ C19YY LLILLJJLI;

    public C21557619Yg(C19YY c19yy) {
        this.LLILLJJLI = c19yy;
    }

    @Override // X.InterfaceC1846340y9A
    public final void LIZIZ(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        C19YY c19yy = this.LLILLJJLI;
        if (c19yy.LLJJJJ == viewPager) {
            c19yy.LJIILL(pagerAdapter2, this.LL);
        }
    }
}
