package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Ecs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368680Ecs extends ConstraintLayout implements InterfaceC369180Edg {
    public final C01GW LL;
    public final int LLILLJJLI;
    public final float LLILLL;
    public final float LLILZ;
    public boolean LLILZIL;
    public C21573919bt LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public C0E6I LLJI;
    public boolean LLJIJIL;
    public final ArrayList<C0EGA> LLJILJIL;
    public VelocityTracker LLJILJILJ;
    public boolean LLJILLL;
    public View.OnClickListener LLJJ;
    public boolean LLJJI;
    public Function1<? super Integer, Unit> LLJJIII;
    public Function0<Unit> LLJJIJI;
    public Function0<Unit> LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public float LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public Function1<? super Integer, Unit> LLJJJJJIL;
    public final C01GW LLJJJJLIIL;

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    private final Runnable getFingerStopRunner() {
        return (Runnable) this.LLJJIJIL.getValue();
    }

    private final OverScroller getScrollerX() {
        return (OverScroller) this.LL.getValue();
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (!getScrollerX().isFinished() && getScrollerX().computeScrollOffset()) {
            e0(this, getScrollerX().getCurrX(), this.LLJJI, false, 4);
            postInvalidateOnAnimation();
        } else if (this.LLJI == C0E6I.SETTLING) {
            setScrollState(C0E6I.IDLE);
            this.LLJIJIL = false;
        }
    }

    public final int getChildScrollX() {
        int childCount = getChildCount();
        int iMin = 0;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof AbstractC368670Ecr) && childAt != null) {
                boolean zBooleanValue = ((Boolean) this.LLJJJJLIIL.getValue()).booleanValue();
                int scrollX = childAt.getScrollX();
                iMin = zBooleanValue ? Math.min(iMin, scrollX) : Math.max(iMin, scrollX);
            }
        }
        return iMin;
    }

    public final int getRealScrollX() {
        return getChildScrollX();
    }

    public final void h0() {
        if (getScrollerX().isFinished()) {
            return;
        }
        getScrollerX().abortAnimation();
    }

    public final C21573919bt getScaleGestureDetector() {
        return this.LLILZLL;
    }

    public final C0E6I getTrackScrollState() {
        return this.LLJI;
    }

    private final void setScrollState(C0E6I c0e6i) {
        if (this.LLJI == c0e6i) {
            return;
        }
        this.LLJI = c0e6i;
        int childScrollX = getChildScrollX();
        Iterator<C0EGA> it2 = this.LLJILJIL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(c0e6i, childScrollX);
        }
    }

    @Override // X.InterfaceC369180Edg
    public final void LJLLILLLL(int i) {
        if (i == 0) {
            return;
        }
        this.LLJJI = false;
        this.LLJIJIL = true;
        setScrollState(C0E6I.SETTLING);
        getScrollerX().startScroll(getChildScrollX(), 0, i, 0);
        postInvalidateOnAnimation();
    }

    @Override // X.InterfaceC369180Edg
    public final void LLILIL(int i) {
        AbstractC368670Ecr abstractC368670Ecr;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((childAt instanceof AbstractC368670Ecr) && (abstractC368670Ecr = (AbstractC368670Ecr) childAt) != null && abstractC368670Ecr.LLIZ != i) {
                abstractC368670Ecr.LLIZ = i;
            }
        }
    }

    public final void i0(long j) {
        AbstractC368670Ecr abstractC368670Ecr;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof AbstractC368670Ecr) && (abstractC368670Ecr = (AbstractC368670Ecr) childAt) != null) {
                abstractC368670Ecr.LLILZIL = j;
                abstractC368670Ecr.LLILZLL = (int) (j * abstractC368670Ecr.LLIZLLLIL);
                abstractC368670Ecr.LLIZ = 0;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent.getPointerCount() >= 2) {
            z = true;
        } else {
            z = false;
        }
        this.LLILZIL = z;
        if (motionEvent.getActionMasked() == 5) {
            C21573919bt c21573919bt = this.LLILZLL;
            if (c21573919bt != null) {
                c21573919bt.LIZJ(motionEvent, this);
            }
            return true;
        }
        if (this.LLILZIL) {
            return true;
        }
        if ((motionEvent.getAction() == 2 && this.LLJI == C0E6I.DRAGGING) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2) {
                float x = motionEvent.getX() - this.LLIZLLLIL;
                if (Math.abs(x) >= Math.abs(motionEvent.getY() - this.LLJ) && this.LLILLJJLI <= Math.abs(x)) {
                    setScrollState(C0E6I.DRAGGING);
                }
            }
        } else {
            this.LLIZLLLIL = motionEvent.getX();
            this.LLJ = motionEvent.getY();
            this.LLIZ = motionEvent.getX();
            h0();
        }
        if (this.LLJI != C0E6I.DRAGGING) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0E6I c0e6i;
        AbstractC368670Ecr abstractC368670Ecr;
        Function0<Unit> function0;
        Function0<Unit> function02;
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.LLJJJJ) {
            return true;
        }
        if (motionEvent.getPointerCount() >= 2) {
            C21573919bt c21573919bt = this.LLILZLL;
            if (c21573919bt != null) {
                c21573919bt.LIZJ(motionEvent, this);
            }
            return true;
        }
        VelocityTracker velocityTrackerObtain = this.LLJILJILJ;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.LLJILJILJ = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        int action = motionEvent.getAction();
        boolean z = false;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        VelocityTracker velocityTracker = this.LLJILJILJ;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                        }
                        this.LLJILJILJ = null;
                        setScrollState(C0E6I.IDLE);
                        Function0<Unit> function03 = this.LLJJIJI;
                        if (function03 != null) {
                            function03.invoke();
                        }
                    }
                    return true;
                }
                C0E6I c0e6i2 = this.LLJI;
                C0E6I c0e6i3 = C0E6I.DRAGGING;
                if (c0e6i2 == c0e6i3) {
                    LJIIZILJ(true, (int) (this.LLIZ - motionEvent.getX()), 0, false, false);
                } else {
                    float x = motionEvent.getX() - this.LLIZLLLIL;
                    if (Math.abs(x) >= Math.abs(motionEvent.getY() - this.LLJ) && this.LLILLJJLI <= Math.abs(x)) {
                        setScrollState(c0e6i3);
                    }
                }
                float x2 = motionEvent.getX();
                this.LLIZ = x2;
                if (Math.abs(this.LLJJJ - x2) >= 1.0f) {
                    this.LLJJJIL = true;
                    this.LLJJJ = this.LLIZ;
                    if (getHandler() != null) {
                        HandlerHook.viewRemoveCallbacks(this, getFingerStopRunner());
                        HandlerHook.viewPostDelay(this, getFingerStopRunner(), 96L);
                    }
                }
                if (this.LLJI != c0e6i3) {
                    z = true;
                }
                this.LLJILLL = z;
                return true;
            }
            if (this.LLJJJIL && (function02 = this.LLJJIJIIJIL) != null) {
                function02.invoke();
            }
            if (this.LLJI == C0E6I.DRAGGING) {
                velocityTrackerObtain.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT, this.LLILZ);
                float xVelocity = velocityTrackerObtain.getXVelocity();
                if (Math.abs(xVelocity) < this.LLILLL) {
                    xVelocity = 0.0f;
                } else {
                    float fAbs = Math.abs(xVelocity);
                    float f = this.LLILZ;
                    if (fAbs > f) {
                        if (xVelocity > 0.0f) {
                            xVelocity = f;
                        } else {
                            xVelocity = -f;
                        }
                    }
                }
                float f2 = -xVelocity;
                if (f2 == 0.0f) {
                    c0e6i = C0E6I.IDLE;
                } else {
                    int i = (int) f2;
                    Function1<? super Integer, Unit> function1 = this.LLJJJJJIL;
                    if (function1 != null) {
                        function1.invoke(Integer.valueOf(i));
                    }
                    int childScrollX = getChildScrollX();
                    int childCount = getChildCount();
                    int iMax = 0;
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = getChildAt(i2);
                        if ((childAt instanceof AbstractC368670Ecr) && (abstractC368670Ecr = (AbstractC368670Ecr) childAt) != null) {
                            iMax = Math.max(iMax, abstractC368670Ecr.getMaxScrollX());
                        }
                    }
                    if (((Boolean) this.LLJJJJLIIL.getValue()).booleanValue()) {
                        getScrollerX().fling(childScrollX, 0, i, 0, -iMax, 0, 0, 0);
                    } else {
                        getScrollerX().fling(childScrollX, 0, i, 0, 0, iMax, 0, 0);
                    }
                    postInvalidateOnAnimation();
                    c0e6i = C0E6I.SETTLING;
                }
                setScrollState(c0e6i);
                if (this.LLJI == C0E6I.IDLE && (function0 = this.LLJJIJI) != null) {
                    function0.invoke();
                }
            } else if (this.LLJILLL) {
                View.OnClickListener onClickListener = this.LLJJ;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                setScrollState(C0E6I.IDLE);
            }
            VelocityTracker velocityTracker2 = this.LLJILJILJ;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
            }
            this.LLJILJILJ = null;
            return true;
        }
        this.LLJJJIL = false;
        this.LLJILLL = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            VelocityTracker velocityTracker = this.LLJILJILJ;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.LLJILJILJ = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setFingerAndTrackStopListener(Function0<Unit> function0) {
        this.LLJJIJI = function0;
    }

    public final void setFingerStopListener(Function1<? super Integer, Unit> function1) {
        this.LLJJIII = function1;
    }

    public final void setFingerUpAfterMovedListener(Function0<Unit> function0) {
        this.LLJJIJIIJIL = function0;
    }

    public final void setHorizontalFlingListener(Function1<? super Integer, Unit> function1) {
        this.LLJJJJJIL = function1;
    }

    public final void setOnBlankClickListener(View.OnClickListener onClickListener) {
        AbstractC368670Ecr abstractC368670Ecr;
        this.LLJJ = onClickListener;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof AbstractC368670Ecr) && (abstractC368670Ecr = (AbstractC368670Ecr) childAt) != null) {
                abstractC368670Ecr.setOnBlankClickListener$editor_trackpanel_release(onClickListener);
            }
        }
    }

    public final void setScaleGestureDetector(C21573919bt c21573919bt) {
        this.LLILZLL = c21573919bt;
    }

    public final void setSmoothScrolling$editor_trackpanel_release(boolean z) {
        this.LLJIJIL = z;
    }

    public final void setTimelineScale(float f) {
        AbstractC368670Ecr abstractC368670Ecr;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof AbstractC368670Ecr) && (abstractC368670Ecr = (AbstractC368670Ecr) childAt) != null) {
                abstractC368670Ecr.setTimelineScale(f);
            }
        }
    }

    public C368680Ecs(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        LJIIZILJ(false, i, i2, false, false);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        e0(this, i, false, false, 4);
    }

    public C368680Ecs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setFocusable(true);
        setDescendantFocusability(262144);
        setVerticalScrollBarEnabled(false);
        setVerticalFadingEdgeEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setHorizontalFadingEdgeEnabled(false);
        this.LL = C452501pT.LIZIZ(new AwS549S0100000_5(context, 973));
        this.LLILLJJLI = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LLILLL = r1.getScaledMinimumFlingVelocity();
        this.LLILZ = r1.getScaledMaximumFlingVelocity();
        this.LLJI = C0E6I.IDLE;
        this.LLJILJIL = new ArrayList<>();
        this.LLJJI = true;
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 971));
        this.LLJJJ = -1.0f;
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS549S0100000_5(context, 972));
    }

    public static void e0(C368680Ecs c368680Ecs, int i, boolean z, boolean z2, int i2) {
        AbstractC368670Ecr abstractC368670Ecr;
        boolean z3 = z2;
        boolean z4 = z;
        if ((i2 & 2) != 0) {
            z4 = false;
        }
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        c368680Ecs.LLJJI = z4;
        if (z3) {
            c368680Ecs.h0();
        }
        int childCount = c368680Ecs.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = c368680Ecs.getChildAt(i3);
            if ((childAt instanceof AbstractC368670Ecr) && (abstractC368670Ecr = (AbstractC368670Ecr) childAt) != null) {
                AbstractC368670Ecr.LIZJ(abstractC368670Ecr, i, abstractC368670Ecr.getScrollY(), z4, false, false, z3, 24);
            }
        }
    }

    @Override // X.InterfaceC369180Edg
    public final void LJIIZILJ(boolean z, int i, int i2, boolean z2, boolean z3) {
        AbstractC368670Ecr abstractC368670Ecr;
        this.LLJJI = z;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((childAt instanceof AbstractC368670Ecr) && (abstractC368670Ecr = (AbstractC368670Ecr) childAt) != null) {
                abstractC368670Ecr.LLILLJJLI = z;
                AbstractC368670Ecr.LIZJ(abstractC368670Ecr, abstractC368670Ecr.getScrollX() + i, abstractC368670Ecr.getScrollY() + i2, z, z2, z3, false, 32);
            }
        }
    }
}
