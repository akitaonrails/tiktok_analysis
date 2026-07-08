package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior;

/* JADX INFO: renamed from: X.0so6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1641080so6 {
    public final ViewPagerBottomSheetBehavior<View> LIZ;
    public final C11RK<EnumC1641580sou> LIZIZ = new C11RK<>();

    public final C19475711Hn LIZ() {
        C11RK<EnumC1641580sou> c11rk = this.LIZIZ;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    public C1641080so6(View view, ViewPager viewPager, boolean z) {
        C16G1 c16g1;
        if (z) {
            ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior = new ViewPagerBottomSheetBehavior<>(view.getContext());
            this.LIZ = viewPagerBottomSheetBehavior;
            viewPagerBottomSheetBehavior.setPeekHeight(0);
            viewPagerBottomSheetBehavior.setHideable(true);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof C16G1) && (c16g1 = (C16G1) layoutParams) != null) {
                c16g1.LIZIZ(viewPagerBottomSheetBehavior);
            }
            viewPagerBottomSheetBehavior.setupViewPager(viewPager);
            viewPagerBottomSheetBehavior.setBottomSheetCallback(new C16BV() { // from class: X.0snp
                @Override // X.C16BV
                public final void LIZIZ(View view2, float f) {
                }

                @Override // X.C16BV
                public final void LIZJ(int i, View view2) {
                    if (i != 1) {
                        if (i == 4) {
                            this.LIZ.LIZIZ.onNext(EnumC1641580sou.CLOSE);
                            return;
                        }
                        return;
                    }
                    this.LIZ.LIZIZ.onNext(EnumC1641580sou.DRAGGING);
                }
            });
            return;
        }
        this.LIZ = null;
    }
}
