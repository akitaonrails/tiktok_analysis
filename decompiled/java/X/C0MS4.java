package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0MS4, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public class C0MS4 extends ViewPager {
    public boolean LL;

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.LL && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
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
            StringBuilder sb = new StringBuilder("cur_item:");
            sb.append(getCurrentItem());
            if (getAdapter() != null) {
                sb.append(", count:");
                sb.append(getAdapter().getCount());
            }
            C201955140j.LJ(sb.toString());
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

    public C0MS4(Context context, AttributeSet attributeSet) {
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
