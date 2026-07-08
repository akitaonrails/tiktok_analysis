package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0KmA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C527320KmA extends ViewPager {
    public boolean LL;

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.LL && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (this.LL) {
                return false;
            }
            if (!super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            getCurrentItem();
            PagerAdapter adapter = getAdapter();
            if (adapter != null) {
                adapter.getCount();
            }
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        super.setCurrentItem(i, false);
    }

    public final void setNoScroll(boolean z) {
        this.LL = z;
    }

    public C527320KmA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = true;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void setCurrentItem(int i, boolean z) {
        super.setCurrentItem(i, z);
    }
}
