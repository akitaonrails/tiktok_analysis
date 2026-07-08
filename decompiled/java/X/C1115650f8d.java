package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0f8d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1115650f8d extends C21594519fD {
    public boolean LLILLL;

    public C1115650f8d(Context context) {
        super(context);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.LLILLL && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (this.LLILLL) {
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

    public final void setNoScroll(boolean z) {
        this.LLILLL = z;
    }

    public C1115650f8d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
