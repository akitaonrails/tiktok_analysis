package X;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: renamed from: X.19YE, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19YE implements InterfaceC1846340y9A {
    public boolean LL;
    public final /* synthetic */ C19YA LLILLJJLI;

    public C19YE(C19YA c19ya) {
        this.LLILLJJLI = c19ya;
    }

    @Override // X.InterfaceC1846340y9A
    public final void LIZIZ(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        C19YA c19ya = this.LLILLJJLI;
        if (c19ya.mViewPager == viewPager) {
            c19ya.setPagerAdapter(pagerAdapter2, this.LL);
        }
    }
}
