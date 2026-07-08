package X;

import Y.ARunnableS129S0100000_29;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.19cp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC21579719cp extends FrameLayout {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public OverScroller LLILZLL;
    public VelocityTracker LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public double LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public float LLJJ;
    public float LLJJI;
    public final C01GW LLJJIII;
    public C21580019cs LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;

    public abstract void LIZ(boolean z);

    public abstract void LIZLLL(MotionEvent motionEvent);

    public abstract void LJ(double d, double d2);

    public abstract void LJFF();

    public void LJI() {
    }

    public abstract void LJIIIIZZ();

    public abstract void LJIIIZ();

    public void LJIIJ() {
    }

    public abstract void LJIIJJI();

    public abstract void LJIIL();

    @Override // android.view.View
    public final void computeScroll() {
        if (!this.LLJJIJIL && !this.LLJJIJIIJIL) {
            LJIIJ();
        }
        if (getMScroller().computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = getMScroller().getCurrX();
            int currY = getMScroller().getCurrY();
            int scrollRange = getScrollRange();
            if (scrollX != currX || scrollY != currY) {
                getOverScrollMode();
                overScrollBy(currX - scrollX, currY - scrollY, scrollX, scrollY, scrollRange, 0, this.LLILZIL, 0, false);
                onScrollChanged(getScrollX(), getScrollY(), scrollX, scrollY);
            }
        }
        this.LLJJIJIL = false;
        LJI();
    }

    public abstract int getChildTotalWidth();

    public abstract int getScrollRange();

    public final void setScrolling(boolean z) {
    }

    public final ValueAnimator getAutoScrollAnimator() {
        return (ValueAnimator) this.LLJJIII.getValue();
    }

    public final OverScroller getMScroller() {
        OverScroller overScroller = this.LLILZLL;
        if (overScroller != null) {
            return overScroller;
        }
        return null;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        this.LLJJIJIL = true;
    }

    public final boolean getCanHandleTouchEv() {
        return this.LLJILLL;
    }

    public final boolean getIgNoScroll() {
        return this.LLJJIJIL;
    }

    public final int getLastMotionX() {
        return this.LLJ;
    }

    public final boolean getSuperIgNo() {
        return this.LLJJIJIIJIL;
    }

    public final C21580019cs getTouchBlockEvent() {
        return this.LLJJIJI;
    }

    public final float getTrackX() {
        return this.LLJJ;
    }

    public final float getTrackY() {
        return this.LLJJI;
    }

    public static double LIZIZ(MotionEvent motionEvent) {
        float fAbs = Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
        float fAbs2 = Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
        double dSqrt = Math.sqrt((fAbs * fAbs) + (fAbs2 * fAbs2));
        if (dSqrt < 200.0d) {
            return 200.0d;
        }
        return dSqrt;
    }

    public final void LIZJ(int i) {
        if (i < 0) {
            i = 0;
        }
        if (i > getScrollRange()) {
            i = getScrollRange();
        }
        this.LLJJIJIL = true;
        scrollTo(i, 0);
    }

    public final void LJII(MotionEvent motionEvent) {
        int i;
        int action = (motionEvent.getAction() & 65280) >> 8;
        motionEvent.getPointerId(action);
        if (action == 0) {
            i = 1;
        } else {
            i = 0;
        }
        this.LLJ = (int) motionEvent.getX(i);
        this.LLIZLLLIL = motionEvent.getPointerId(i);
        VelocityTracker velocityTracker = this.LLIZ;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        super.addView(view);
        this.LLJJIJIL = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a9  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC21579719cp.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0163  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r26) {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC21579719cp.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.LLJJIJIIJIL = true;
            HandlerHook.viewPostDelay(this, new ARunnableS129S0100000_29(this, 83), 100L);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        super.removeView(view);
        this.LLJJIJIL = true;
    }

    public final void setCanHandleTouchEv(boolean z) {
        this.LLJILLL = z;
    }

    public final void setIgNoScroll(boolean z) {
        this.LLJJIJIL = z;
    }

    public final void setMScroller(OverScroller overScroller) {
        this.LLILZLL = overScroller;
    }

    public final void setSuperIgNo(boolean z) {
        this.LLJJIJIIJIL = z;
    }

    public void setTouchBlock(EnumC21579919cr enumC21579919cr) {
        this.LLJJIJI.LIZ = enumC21579919cr;
        int i = C21579819cq.LIZ[enumC21579919cr.ordinal()];
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            if (i == 5) {
                getAutoScrollAnimator().cancel();
                return;
            }
            throw new C1954807lC();
        }
        getAutoScrollAnimator().start();
    }

    public final void setTouchBlockEvent(C21580019cs c21580019cs) {
        this.LLJJIJI = c21580019cs;
    }

    public final void setTrackX(float f) {
        this.LLJJ = f;
    }

    public final void setTrackY(float f) {
        this.LLJJI = f;
    }

    public AbstractC21579719cp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLIZLLLIL = -1;
        this.LLJILLL = true;
        this.LLJJIII = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3798));
        this.LLJJIJI = new C21580019cs(EnumC21579919cr.Null);
        setLayoutMode(1);
        setMScroller(new OverScroller(getContext()));
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.LL = viewConfiguration.getScaledTouchSlop();
        this.LLILLJJLI = viewConfiguration.getScaledMinimumFlingVelocity();
        this.LLILLL = viewConfiguration.getScaledMaximumFlingVelocity();
        this.LLILZ = viewConfiguration.getScaledOverscrollDistance();
        this.LLILZIL = viewConfiguration.getScaledOverflingDistance();
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        if (!getMScroller().isFinished()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            setScrollX(i);
            setScrollY(i2);
            onScrollChanged(getScrollX(), getScrollY(), scrollX, scrollY);
            if (z) {
                getMScroller().springBack(getScrollX(), getScrollY(), 0, getScrollRange(), 0, 0);
                return;
            }
            return;
        }
        super.scrollTo(i, i2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z) {
            this.LLJJIJIL = true;
        }
    }
}
