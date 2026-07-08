package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;

/* JADX INFO: renamed from: X.0ei0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1099140ei0 extends C21594519fD {
    public boolean LLILLL;
    public Boolean LLILZ;
    public MotionEvent LLILZIL;

    private InterfaceC1099150ei1 getParentViewPager() {
        ViewParent parent = this;
        while (parent != null && !(parent instanceof InterfaceC1099150ei1)) {
            parent = parent.getParent();
        }
        return (InterfaceC1099150ei1) parent;
    }

    public final void LJ() {
        Boolean bool;
        if (this.LLILLL) {
            return;
        }
        C20441214yg.LIZIZ("BannerViewPager", "enableParent");
        this.LLILLL = true;
        InterfaceC1099150ei1 parentViewPager = getParentViewPager();
        if (parentViewPager == null || (bool = this.LLILZ) == null) {
            return;
        }
        bool.booleanValue();
        parentViewPager.LIZ();
        this.LLILZ = null;
    }

    public final void LIZLLL() {
        if (getChildCount() > 1 && this.LLILLL) {
            C20441214yg.LIZIZ("BannerViewPager", "disableParent");
            this.LLILLL = false;
            InterfaceC1099150ei1 parentViewPager = getParentViewPager();
            if (parentViewPager != null) {
                if (this.LLILZ == null) {
                    this.LLILZ = Boolean.valueOf(parentViewPager.LIZIZ());
                }
                parentViewPager.LIZ();
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            LIZLLL();
        } else if (motionEvent.getAction() == 2) {
            if (zOnInterceptTouchEvent) {
                LIZLLL();
            }
        } else {
            LJ();
        }
        this.LLILZIL = motionEvent;
        return zOnInterceptTouchEvent;
    }

    @Override // X.C21594519fD, androidx.viewpager.widget.ViewPager
    public void setOnPageChangeListener(InterfaceC469360Ias interfaceC469360Ias) {
        super.setOnPageChangeListener(interfaceC469360Ias);
    }

    public C1099140ei0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
