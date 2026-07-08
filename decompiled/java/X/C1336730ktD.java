package X;

import android.content.Context;
import android.view.MotionEvent;
import androidx.viewpager.widget.PagerAdapter;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0ktD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1336730ktD extends C1336770ktH {
    public boolean LLJ;
    public InterfaceC1336720ktC LLJI;
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

    public final InterfaceC1336720ktC getMTouchHandler() {
        return this.LLJI;
    }

    public C1336730ktD(Context context) {
        new LinkedHashMap();
        super(context);
        this.LLJ = true;
        setOverScrollMode(2);
    }

    @Override // X.C1336770ktH, androidx.viewpager.widget.ViewPager, android.view.View
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
        boolean zOnTouchEvent;
        Integer numValueOf;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getActionMasked())) != null && numValueOf.intValue() == 1) {
            super.performClick();
        }
        if (getMAllowHorizontalGesture()) {
            zOnTouchEvent = super.onTouchEvent(motionEvent);
            InterfaceC1336720ktC interfaceC1336720ktC = this.LLJI;
            if (interfaceC1336720ktC != null) {
                interfaceC1336720ktC.LLJZ(motionEvent);
            }
        } else {
            InterfaceC1336750ktF mInterceptTouchEventListener = getMInterceptTouchEventListener();
            zOnTouchEvent = false;
            if (mInterceptTouchEventListener != null) {
                mInterceptTouchEventListener.LIZ(false);
                return false;
            }
        }
        return zOnTouchEvent;
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

    public final void setMTouchHandler(InterfaceC1336720ktC interfaceC1336720ktC) {
        this.LLJI = interfaceC1336720ktC;
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
