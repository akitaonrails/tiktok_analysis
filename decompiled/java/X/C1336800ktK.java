package X;

import android.content.Context;
import android.view.MotionEvent;
import androidx.viewpager.widget.PagerAdapter;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0ktK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1336800ktK extends C1336790ktJ {
    public boolean LLJ;
    public InterfaceC1336810ktL LLJI;
    public boolean LLJIJIL;

    @Override // android.view.View
    public final boolean performClick() {
        return super.performClick();
    }

    public final boolean getMForceCanScroll() {
        return this.LLJIJIL;
    }

    public final boolean getMPagerChangeAnimation() {
        return this.LLJ;
    }

    public final InterfaceC1336810ktL getMTouchHandler() {
        return this.LLJI;
    }

    public C1336800ktK(Context context) {
        new LinkedHashMap();
        super(context);
        this.LLJ = true;
        setOverScrollMode(2);
    }

    @Override // X.C1336790ktJ, androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.LLJIJIL) {
            return true;
        }
        return super.canScrollHorizontally(i);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getMAllowHorizontalGesture()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getActionMasked())) != null && numValueOf.intValue() == 1) {
            super.performClick();
        }
        if (getMAllowHorizontalGesture()) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            InterfaceC1336810ktL interfaceC1336810ktL = this.LLJI;
            if (interfaceC1336810ktL != null) {
                interfaceC1336810ktL.LLJZ(motionEvent);
            }
            return zOnTouchEvent;
        }
        InterfaceC1336820ktM mInterceptTouchEventListener = getMInterceptTouchEventListener();
        if (mInterceptTouchEventListener != null) {
            mInterceptTouchEventListener.LIZ();
            return false;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && this.LLIZ) {
            i = (adapter.getCount() - i) - 1;
        }
        super.setCurrentItem(i, this.LLJ);
    }

    public final void setMForceCanScroll(boolean z) {
        this.LLJIJIL = z;
    }

    public final void setMPagerChangeAnimation(boolean z) {
        this.LLJ = z;
    }

    public final void setMTouchHandler(InterfaceC1336810ktL interfaceC1336810ktL) {
        this.LLJI = interfaceC1336810ktL;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void setCurrentItem(int i, boolean z) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && this.LLIZ) {
            i = (adapter.getCount() - i) - 1;
        }
        super.setCurrentItem(i, z);
    }
}
