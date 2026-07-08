package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.16np, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C20883516np extends AbstractC21144517op {
    @Override // X.AbstractC21144517op
    public final View LJIILIIL(final Context context, final AttributeSet attributeSet) {
        return new ViewPager(context, attributeSet) { // from class: X.0MR1
            public C0MR0<?> LL;

            @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                try {
                    return super.onInterceptTouchEvent(motionEvent);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return false;
                }
            }

            @Override // androidx.viewpager.widget.ViewPager, android.view.View
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                try {
                    return super.onTouchEvent(motionEvent);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return false;
                }
            }

            @Override // androidx.viewpager.widget.ViewPager
            public void setAdapter(PagerAdapter pagerAdapter) {
                C0MR0<?> c0mr0;
                super.setAdapter(pagerAdapter);
                if (pagerAdapter instanceof C0MR0) {
                    c0mr0 = (C0MR0) pagerAdapter;
                } else {
                    c0mr0 = null;
                }
                this.LL = c0mr0;
            }

            @Override // androidx.viewpager.widget.ViewPager
            public final void onPageScrolled(int i, float f, int i2) {
                if (this.LL == null) {
                    super.onPageScrolled(i, f, i2);
                    return;
                }
                if (getCurrentItem() == i) {
                    int i3 = i + 1;
                    if (0.1f < f && this.LL.LLILLJJLI.get(i3) != null) {
                        this.LL.getClass();
                        this.LL.LJJIJIL(i3, this);
                        this.LL.LJIJI(this);
                    }
                } else if (getCurrentItem() > i && 0.1f < 1.0f - f && this.LL.LLILLJJLI.get(i) != null) {
                    this.LL.getClass();
                    this.LL.LJJIJIL(i, this);
                    this.LL.LJIJI(this);
                }
                super.onPageScrolled(i, f, i2);
            }

            @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
            public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                if ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight() > 0) {
                    super.onLayout(z, i, i2, i3, i4);
                    return;
                }
                C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ignore onLayout:");
                sbLIZ.append(getMeasuredWidth());
                C201955140j.LJIJI(c533790Kwb, C2188811AlT.LIZIZ(sbLIZ));
            }
        };
    }
}
