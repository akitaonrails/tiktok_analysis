package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Km5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C527270Km5 extends ViewPager {
    public boolean LL;
    public float LLILLJJLI;
    public InterfaceC525570KjL LLILLL;
    public final float LLILZ;

    public final boolean getCanScroll() {
        return this.LL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = false;
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.LLILLJJLI = motionEvent.getX();
        }
        try {
            zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            return zDispatchTouchEvent;
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return zDispatchTouchEvent;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LL && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int count;
        InterfaceC525570KjL interfaceC525570KjL;
        if (!this.LL) {
            return false;
        }
        if (motionEvent != null) {
            float x = motionEvent.getX();
            Integer numValueOf = Integer.valueOf(motionEvent.getAction());
            if (numValueOf != null) {
                if (numValueOf.intValue() == 2) {
                    if (this.LLILLJJLI == -1.0f) {
                        this.LLILLJJLI = x;
                    }
                } else if (numValueOf.intValue() == 1) {
                    PagerAdapter adapter = getAdapter();
                    if (adapter != null) {
                        count = adapter.getCount();
                    } else {
                        count = 0;
                    }
                    if (getCurrentItem() == 0 && x - this.LLILLJJLI > this.LLILZ) {
                        InterfaceC525570KjL interfaceC525570KjL2 = this.LLILLL;
                        if (interfaceC525570KjL2 != null) {
                            interfaceC525570KjL2.LIZ(true);
                        }
                    } else if (getCurrentItem() == count - 1 && this.LLILLJJLI - x > this.LLILZ && (interfaceC525570KjL = this.LLILLL) != null) {
                        interfaceC525570KjL.LIZ(false);
                    }
                }
            }
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public final void setCanScroll(boolean z) {
        this.LL = z;
    }

    public final void setGestureCallback(InterfaceC525570KjL interfaceC525570KjL) {
        this.LLILLL = interfaceC525570KjL;
    }

    public C527270Km5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = true;
        this.LLILLJJLI = -1.0f;
        this.LLILZ = C0JAI.LIZ(10.0f, context);
    }
}
