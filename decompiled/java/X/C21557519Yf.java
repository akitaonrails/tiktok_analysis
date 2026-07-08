package X;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: renamed from: X.19Yf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21557519Yf implements InterfaceC1846340y9A {
    public boolean LL;
    public final /* synthetic */ C19YU LLILLJJLI;

    public C21557519Yf(C19YU c19yu) {
        this.LLILLJJLI = c19yu;
    }

    @Override // X.InterfaceC1846340y9A
    public final void LIZIZ(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        C19YU c19yu = this.LLILLJJLI;
        if (c19yu.LLJJJJ == viewPager) {
            c19yu.LJIILJJIL(pagerAdapter2, this.LL);
        }
    }
}
