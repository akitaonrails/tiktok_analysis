package X;

import androidx.viewpager.widget.PagerAdapter;

/* JADX INFO: renamed from: X.19g5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21599919g5 implements InterfaceC469360Ias {
    public final InterfaceC469360Ias LL;
    public final /* synthetic */ C21599719g3 LLILLJJLI;

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        this.LL.onPageScrollStateChanged(i);
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        PagerAdapter adapter = super/*X.19g8*/.getAdapter();
        if (this.LLILLJJLI.LJJJ() && adapter != null) {
            i = (adapter.getCount() - i) - 1;
        }
        this.LL.onPageSelected(i);
    }

    public C21599919g5(C21599719g3 c21599719g3, InterfaceC469360Ias interfaceC469360Ias) {
        this.LLILLJJLI = c21599719g3;
        this.LL = interfaceC469360Ias;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        PagerAdapter adapter = super/*X.19g8*/.getAdapter();
        if (this.LLILLJJLI.LJJJ() && adapter != null) {
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
