package X;

import androidx.viewpager.widget.PagerAdapter;
import java.util.HashMap;

/* JADX INFO: renamed from: X.19fE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21594619fE implements InterfaceC469360Ias {
    public final InterfaceC469360Ias LL;
    public final /* synthetic */ C21594419fC LLILLJJLI;

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        this.LL.onPageScrollStateChanged(i);
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        PagerAdapter adapter = super/*androidx.viewpager.widget.ViewPager*/.getAdapter();
        if (this.LLILLJJLI.LIZJ() && adapter != null) {
            i = (adapter.getCount() - i) - 1;
        }
        this.LL.onPageSelected(i);
    }

    public C21594619fE(C21594419fC c21594419fC, InterfaceC469360Ias interfaceC469360Ias) {
        this.LLILLJJLI = c21594419fC;
        this.LL = interfaceC469360Ias;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        if (Float.isNaN(f)) {
            HashMap map = new HashMap();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i);
            sbLIZ.append("");
            map.put("position", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(0.0f);
            sbLIZ2.append("");
            map.put("offset", C2188811AlT.LIZIZ(sbLIZ2));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(i2);
            sbLIZ3.append("");
            map.put("offsetPixels", C2188811AlT.LIZIZ(sbLIZ3));
            C1AF0.LIZLLL("RtlViewPager_pageScroll_crash", map);
            f = 0.0f;
        }
        PagerAdapter adapter = super/*androidx.viewpager.widget.ViewPager*/.getAdapter();
        if (this.LLILLJJLI.LIZJ() && adapter != null) {
            if (i == adapter.getCount() - 1 && f == 0.0f) {
                i--;
                i2 = this.LLILLJJLI.getWidth();
                f = 1.0f;
            }
            this.LL.onPageScrolled((r1 - (i + 1)) - 1, 1.0f - f, this.LLILLJJLI.getWidth() - i2);
            return;
        }
        this.LL.onPageScrolled(i, f, i2);
    }
}
