package X;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: renamed from: X.19UA, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19UA implements InterfaceC1846340y9A {
    public boolean LL;
    public final /* synthetic */ C19U1 LLILLJJLI;

    public C19UA(C19U1 c19u1) {
        this.LLILLJJLI = c19u1;
    }

    @Override // X.InterfaceC1846340y9A
    public final void LIZIZ(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        C19U1 c19u1 = this.LLILLJJLI;
        if (c19u1.viewPager == viewPager) {
            c19u1.setPagerAdapter(pagerAdapter2, this.LL);
        }
    }
}
