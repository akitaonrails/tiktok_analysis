package X;

import Y.ARunnableS128S0100000_28;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0zES, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C1888060zES extends ViewPager {
    public boolean LL;

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        HandlerHook.viewPost(this, new ARunnableS128S0100000_28(this, 15));
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.LL) {
            return false;
        }
        if (getCurrentItem() == 0 && getChildCount() == 0) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LL) {
            if (getCurrentItem() == 0 && getChildCount() == 0) {
                return false;
            }
            try {
                return super.onTouchEvent(motionEvent);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    public void setScrollable(boolean z) {
        this.LL = z;
    }

    public C1888060zES(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = true;
        setLayerType(2, null);
    }
}
