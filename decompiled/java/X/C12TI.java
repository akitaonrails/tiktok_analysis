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
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.12TI, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12TI extends ConstraintLayout implements C12TK {
    public final C01GW LL;
    public final int LLILLJJLI;
    public final float LLILLL;
    public final float LLILZ;
    public boolean LLILZIL;
    public C21573919bt LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public EnumC1090580eUC LLJI;
    public C12TE LLJIJIL;
    public VelocityTracker LLJILJIL;
    public boolean LLJILJILJ;
    public View.OnClickListener LLJILLL;
    public boolean LLJJ;
    public Function1<? super Integer, Unit> LLJJI;
    public final C01GW LLJJIII;
    public float LLJJIJI;

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    private final Runnable getFingerStopRunner() {
        return (Runnable) this.LLJJIII.getValue();
    }

    private final OverScroller getScrollerX() {
        return (OverScroller) this.LL.getValue();
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (!getScrollerX().isFinished() && getScrollerX().computeScrollOffset() && !C444960Hcc.LIZIZ()) {
            e0(getScrollerX().getCurrX(), this.LLJJ);
            postInvalidateOnAnimation();
        } else if (this.LLJI == EnumC1090580eUC.SETTLING) {
            setScrollState(EnumC1090580eUC.IDLE);
        }
    }

    public final int getChildScrollX() {
        int childCount = getChildCount();
        int iMax = 0;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof C12TH) && childAt != null) {
                iMax = !C444960Hcc.LIZIZ() ? Math.max(iMax, childAt.getScrollX()) : Math.max(iMax, -childAt.getScrollX());
            }
        }
        return iMax;
    }

    public final int getRealScrollX() {
        int childCount = getChildCount();
        int iMax = 0;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof C12TH) && childAt != null) {
                iMax = Math.max(iMax, childAt.getScrollX());
            }
        }
        return iMax;
    }

    public final C21573919bt getScaleGestureDetector() {
        return this.LLILZLL;
    }

    private final void setScrollState(EnumC1090580eUC enumC1090580eUC) {
        if (this.LLJI == enumC1090580eUC) {
            return;
        }
        this.LLJI = enumC1090580eUC;
        int childScrollX = getChildScrollX();
        C12TE c12te = this.LLJIJIL;
        if (c12te != null) {
            c12te.LIZ(childScrollX, enumC1090580eUC);
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
        if ((motionEvent.getAction() == 2 && this.LLJI == EnumC1090580eUC.DRAGGING) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2) {
                float x = motionEvent.getX() - this.LLIZLLLIL;
                if (Math.abs(x) >= Math.abs(motionEvent.getY() - this.LLJ) && this.LLILLJJLI <= Math.abs(x)) {
                    setScrollState(EnumC1090580eUC.DRAGGING);
                }
            }
        } else {
            this.LLIZLLLIL = motionEvent.getX();
            this.LLJ = motionEvent.getY();
            this.LLIZ = motionEvent.getX();
            if (!getScrollerX().isFinished()) {
                getScrollerX().abortAnimation();
            }
        }
        if (this.LLJI != EnumC1090580eUC.DRAGGING) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        EnumC1090580eUC enumC1090580eUC;
        C12TH c12th;
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getPointerCount() >= 2) {
            C21573919bt c21573919bt = this.LLILZLL;
            if (c21573919bt != null) {
                c21573919bt.LIZJ(motionEvent, this);
            }
            return true;
        }
        VelocityTracker velocityTrackerObtain = this.LLJILJIL;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.LLJILJIL = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            boolean z = false;
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        setFromUser(false);
                        VelocityTracker velocityTracker = this.LLJILJIL;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                        }
                        this.LLJILJIL = null;
                        setScrollState(EnumC1090580eUC.IDLE);
                    }
                    return true;
                }
                EnumC1090580eUC enumC1090580eUC2 = this.LLJI;
                EnumC1090580eUC enumC1090580eUC3 = EnumC1090580eUC.DRAGGING;
                if (enumC1090580eUC2 == enumC1090580eUC3) {
                    setFromUser(true);
                    LJIIZILJ(true, (int) (this.LLIZ - motionEvent.getX()), 0, false, false);
                } else {
                    float x = motionEvent.getX() - this.LLIZLLLIL;
                    if (Math.abs(x) >= Math.abs(motionEvent.getY() - this.LLJ) && this.LLILLJJLI <= Math.abs(x)) {
                        setScrollState(enumC1090580eUC3);
                    }
                }
                float x2 = motionEvent.getX();
                this.LLIZ = x2;
                if (Math.abs(this.LLJJIJI - x2) >= 1.0f) {
                    this.LLJJIJI = this.LLIZ;
                    if (getHandler() != null) {
                        HandlerHook.viewRemoveCallbacks(this, getFingerStopRunner());
                        HandlerHook.viewPostDelay(this, getFingerStopRunner(), 96L);
                    }
                }
                if (this.LLJI != enumC1090580eUC3) {
                    z = true;
                }
                this.LLJILJILJ = z;
                return true;
            }
            setFromUser(false);
            if (this.LLJI == EnumC1090580eUC.DRAGGING) {
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
                    enumC1090580eUC = EnumC1090580eUC.IDLE;
                } else {
                    int i = (int) f2;
                    int childCount = getChildCount();
                    int iMax = 0;
                    int iMax2 = 0;
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = getChildAt(i2);
                        if ((childAt instanceof C12TH) && (c12th = (C12TH) childAt) != null) {
                            iMax2 = Math.max(iMax2, c12th.getMaxScrollX());
                            iMax = Math.max(iMax, c12th.getScrollX());
                        }
                    }
                    getScrollerX().fling(iMax, 0, i, 0, 0, iMax2, 0, 0);
                    postInvalidateOnAnimation();
                    enumC1090580eUC = EnumC1090580eUC.SETTLING;
                }
                setScrollState(enumC1090580eUC);
            } else if (this.LLJILJILJ) {
                View.OnClickListener onClickListener = this.LLJILLL;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                setScrollState(EnumC1090580eUC.IDLE);
            }
            VelocityTracker velocityTracker2 = this.LLJILJIL;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
            }
            this.LLJILJIL = null;
            return true;
        }
        this.LLJILJILJ = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            VelocityTracker velocityTracker = this.LLJILJIL;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.LLJILJIL = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setFingerStopListener(Function1<? super Integer, Unit> function1) {
        this.LLJJI = function1;
    }

    public void setFromUser(boolean z) {
        C12TH c12th;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof C12TH) && (c12th = (C12TH) childAt) != null) {
                c12th.setFromUser(z);
            }
        }
    }

    public final void setOnBlankClickListener(View.OnClickListener onClickListener) {
        C12TH c12th;
        this.LLJILLL = onClickListener;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof C12TH) && (c12th = (C12TH) childAt) != null) {
                c12th.setOnBlankClickListener$tools_camera_edit_release(onClickListener);
            }
        }
    }

    public final void setOnScrollStateChangeListener(C12TE c12te) {
        this.LLJIJIL = c12te;
    }

    public final void setScaleGestureDetector(C21573919bt c21573919bt) {
        this.LLILZLL = c21573919bt;
    }

    public final void setTimelineScale(float f) {
        C12TH c12th;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof C12TH) && (c12th = (C12TH) childAt) != null) {
                c12th.setTimelineScale(f);
            }
        }
    }

    public C12TI(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void e0(int i, boolean z) {
        C12TH c12th;
        this.LLJJ = z;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((childAt instanceof C12TH) && (c12th = (C12TH) childAt) != null) {
                c12th.LJI(z, i, c12th.getScrollY(), false, false);
            }
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        LJIIZILJ(false, i, i2, false, false);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        e0(i, false);
    }

    public C12TI(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setFocusable(true);
        setDescendantFocusability(262144);
        setVerticalScrollBarEnabled(false);
        setVerticalFadingEdgeEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setHorizontalFadingEdgeEnabled(false);
        this.LL = C452501pT.LIZIZ(new AwS573S0100000_29(context, 212));
        this.LLILLJJLI = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LLILLL = r1.getScaledMinimumFlingVelocity();
        this.LLILZ = r1.getScaledMaximumFlingVelocity();
        this.LLJI = EnumC1090580eUC.IDLE;
        this.LLJJ = true;
        this.LLJJIII = C452501pT.LIZIZ(new AwS556S0100000_12(this, 610));
        this.LLJJIJI = -1.0f;
    }

    @Override // X.C12TK
    public final void LJIIZILJ(boolean z, int i, int i2, boolean z2, boolean z3) {
        C12TH c12th;
        this.LLJJ = z;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((childAt instanceof C12TH) && (c12th = (C12TH) childAt) != null) {
                c12th.LLILLJJLI = z;
                c12th.LJI(z, c12th.getScrollX() + i, c12th.getScrollY() + i2, z2, z3);
            }
        }
    }
}
