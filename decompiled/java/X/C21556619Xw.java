package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.mt.protector.impl.collections.ListProtector;

/* JADX INFO: renamed from: X.19Xw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21556619Xw extends C21556319Xt {
    public InterfaceC1811210xEV LLLFF;

    @Override // X.C21556319Xt
    public final void LJIIJ() {
        int currentItem;
        C21556219Xs c21556219XsLJIIIIZZ;
        LJIIJJI();
        PagerAdapter pagerAdapter = this.LLJL;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i = 0; i < count; i++) {
                C21556219Xs c21556219XsLJIIIZ = LJIIIZ(this.LLJJJ);
                c21556219XsLJIIIZ.LIZIZ = this.LLJL.LJIJJLI(i);
                c21556219XsLJIIIZ.LIZ();
                LIZJ(c21556219XsLJIIIZ, false);
            }
            ViewPager viewPager = this.LLJJLIIIJLLLLLLLZ;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            if (this.LLILLJJLI == null) {
                int tabCount = getTabCount();
                for (int i2 = 0; i2 < tabCount; i2++) {
                    if (i2 != currentItem && (c21556219XsLJIIIIZZ = LJIIIIZZ(i2)) != null) {
                        int size = this.LLJJJJJIL.size();
                        while (true) {
                            size--;
                            if (size >= 0) {
                                ((InterfaceC21556819Xy) ListProtector.get(this.LLJJJJJIL, size)).LIZJ(c21556219XsLJIIIIZZ);
                            }
                        }
                    }
                }
            }
            LJIIL(LJIIIIZZ(currentItem), true);
        }
    }

    public C21556619Xw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C21556319Xt
    public final void LJIILIIL(PagerAdapter pagerAdapter, boolean z) {
        InterfaceC1811210xEV interfaceC1811210xEV;
        super.LJIILIIL(pagerAdapter, z);
        if (pagerAdapter instanceof InterfaceC1811210xEV) {
            interfaceC1811210xEV = (InterfaceC1811210xEV) pagerAdapter;
        } else {
            interfaceC1811210xEV = null;
        }
        this.LLLFF = interfaceC1811210xEV;
    }
}
