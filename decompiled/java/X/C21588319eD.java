package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.19eD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21588319eD extends FrameLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C21588219eC LLILZ;
    public final C01GW LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public final Map<View, Function1<Integer, Boolean>> LLJIJIL;
    public View LLJILJIL;
    public Function0<Boolean> LLJILJILJ;
    public Function0<Boolean> LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public Function1<? super Boolean, Unit> LLJJIJI;
    public Function1<? super Boolean, Unit> LLJJIJIIJIL;
    public Function0<Unit> LLJJIJIL;
    public Function0<Boolean> LLJJJ;
    public Function0<Unit> LLJJJIL;
    public View LLJJJJ;

    private final float getScaledTouchSlop() {
        return ((Number) this.LLILZIL.getValue()).floatValue();
    }

    public final float getBoundaryOffsetX() {
        return ((Number) this.LLILLJJLI.getValue()).floatValue();
    }

    public final float getBoundaryOffsetY() {
        return ((Number) this.LLILLL.getValue()).floatValue();
    }

    public final C21586019dq getDragHelper() {
        return (C21586019dq) this.LL.getValue();
    }

    public final boolean getEnableDrag() {
        return this.LLJJIII && !this.LLJJI;
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (getDragHelper().LJIIIIZZ()) {
            invalidate();
        }
    }

    public final View getDraggableChildView() {
        return this.LLJJJJ;
    }

    public final Function0<Boolean> getEnableDragDown() {
        return this.LLJILLL;
    }

    public final Function0<Boolean> getEnableDragRight() {
        return this.LLJILJILJ;
    }

    public final Function0<Boolean> getEnableSwipeUp() {
        return this.LLJJJ;
    }

    public final boolean getEnableTransform() {
        return this.LLJJ;
    }

    public final boolean getForceDisableDrag() {
        return this.LLJJI;
    }

    public final Function1<Boolean, Unit> getOnDragEnd() {
        return this.LLJJIJIIJIL;
    }

    public final Function1<Boolean, Unit> getOnDragStart() {
        return this.LLJJIJI;
    }

    public final Function0<Unit> getOnExit() {
        return this.LLJJJIL;
    }

    public final Function0<Unit> getOnSwipeUp() {
        return this.LLJJIJIL;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Function0<Unit> function0;
        boolean z;
        boolean z2;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        boolean z3;
        boolean z4;
        Function1 function1;
        Boolean bool;
        Function1 function12;
        Boolean bool2;
        if (!getEnableDrag()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        Object obj = null;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        this.LLJI = false;
                        this.LLIZLLLIL = false;
                        this.LLJ = false;
                        this.LLJILJIL = null;
                    }
                } else if (!this.LLJ) {
                    float rawX = motionEvent.getRawX() - this.LLILZLL;
                    float rawY = motionEvent.getRawY() - this.LLIZ;
                    float fAbs = Math.abs(rawX);
                    float fAbs2 = Math.abs(rawY);
                    if (!C426750GoL.LIZLLL(getContext()) ? !(rawX <= getScaledTouchSlop() || fAbs <= fAbs2) : !(rawX >= (-getScaledTouchSlop()) || fAbs <= fAbs2)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (rawY > getScaledTouchSlop() && fAbs2 > fAbs) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    View view = this.LLJILJIL;
                    if (view != null && (function12 = (Function1) ((LinkedHashMap) this.LLJIJIL).get(view)) != null && (bool2 = (Boolean) function12.invoke(1)) != null) {
                        zBooleanValue = bool2.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    View view2 = this.LLJILJIL;
                    if (view2 != null && (function1 = (Function1) ((LinkedHashMap) this.LLJIJIL).get(view2)) != null && (bool = (Boolean) function1.invoke(2)) != null) {
                        zBooleanValue2 = bool.booleanValue();
                    } else {
                        zBooleanValue2 = false;
                    }
                    if (z && this.LLJILJILJ.invoke().booleanValue() && !zBooleanValue) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z2 && this.LLJILLL.invoke().booleanValue() && !zBooleanValue2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z3 && !z4) {
                        if (rawY < (-getScaledTouchSlop()) && fAbs2 > fAbs && this.LLJJJ.invoke().booleanValue()) {
                            this.LLJI = true;
                        }
                    } else {
                        this.LLIZLLLIL = true;
                        this.LLJ = true;
                    }
                }
            } else {
                if (this.LLJI && (function0 = this.LLJJIJIL) != null) {
                    function0.invoke();
                }
                this.LLJI = false;
                this.LLIZLLLIL = false;
                this.LLJ = false;
                this.LLJILJIL = null;
            }
        } else {
            this.LLILZLL = motionEvent.getRawX();
            this.LLIZ = motionEvent.getRawY();
            this.LLIZLLLIL = false;
            this.LLJ = false;
            this.LLJI = false;
            Iterator it2 = ((LinkedHashMap) this.LLJIJIL).keySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                View view3 = (View) next;
                int i = (int) this.LLILZLL;
                int i2 = (int) this.LLIZ;
                if (view3 != null) {
                    int[] iArr = new int[2];
                    view3.getLocationOnScreen(iArr);
                    int i3 = iArr[0];
                    int i4 = iArr[1];
                    int measuredWidth = view3.getMeasuredWidth() + i3;
                    int measuredHeight = view3.getMeasuredHeight() + i4;
                    if (i4 <= i2 && i2 <= measuredHeight && i3 <= i && i <= measuredWidth) {
                        obj = next;
                        break;
                    }
                }
            }
            this.LLJILJIL = (View) obj;
        }
        if (getDragHelper().LJIJJ(motionEvent)) {
            if (this.LLIZLLLIL || this.LLJ) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            getDragHelper().LJIILIIL(motionEvent);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return true;
        }
    }

    public final void setDraggableChildView(View view) {
        this.LLJJJJ = view;
    }

    public final void setEnableDrag(boolean z) {
        this.LLJJIII = z;
    }

    public final void setEnableDragDown(Function0<Boolean> function0) {
        this.LLJILLL = function0;
    }

    public final void setEnableDragRight(Function0<Boolean> function0) {
        this.LLJILJILJ = function0;
    }

    public final void setEnableSwipeUp(Function0<Boolean> function0) {
        this.LLJJJ = function0;
    }

    public final void setEnableTransform(boolean z) {
        this.LLJJ = z;
    }

    public final void setForceDisableDrag(boolean z) {
        this.LLJJI = z;
    }

    public final void setOnDragEnd(Function1<? super Boolean, Unit> function1) {
        this.LLJJIJIIJIL = function1;
    }

    public final void setOnDragStart(Function1<? super Boolean, Unit> function1) {
        this.LLJJIJI = function1;
    }

    public final void setOnExit(Function0<Unit> function0) {
        this.LLJJJIL = function0;
    }

    public final void setOnSwipeUp(Function0<Unit> function0) {
        this.LLJJIJIL = function0;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.19eC] */
    public C21588319eD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2181));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS577S0100000_33(context, 2179));
        this.LLILLL = C452501pT.LIZIZ(new AwS577S0100000_33(context, 2180));
        this.LLILZ = new AbstractC21586119dr() { // from class: X.19eC
            @Override // X.AbstractC21586119dr
            public final boolean tryCaptureView(View view, int i) {
                return true;
            }

            @Override // X.AbstractC21586119dr
            public final int getViewHorizontalDragRange(View view) {
                return view.getWidth();
            }

            @Override // X.AbstractC21586119dr
            public final int getViewVerticalDragRange(View view) {
                return view.getHeight();
            }

            @Override // X.AbstractC21586119dr
            public final void onViewCaptured(View view, int i) {
                this.LIZ.requestDisallowInterceptTouchEvent(true);
                Function1<Boolean, Unit> onDragStart = this.LIZ.getOnDragStart();
                if (onDragStart != null) {
                    onDragStart.invoke(Boolean.valueOf(this.LIZ.getEnableTransform()));
                }
            }

            @Override // X.AbstractC21586119dr
            public final int clampViewPositionHorizontal(View view, int i, int i2) {
                if (!this.LIZ.LLJ) {
                    return view.getLeft();
                }
                return i;
            }

            @Override // X.AbstractC21586119dr
            public final int clampViewPositionVertical(View view, int i, int i2) {
                if (!this.LIZ.LLJ) {
                    return view.getTop();
                }
                return i;
            }

            @Override // X.AbstractC21586119dr
            public final void onViewReleased(View view, float f, float f2) {
                boolean z;
                boolean z2;
                boolean z3;
                int left = view.getLeft();
                int top = view.getTop();
                boolean z4 = true;
                if (Math.abs(left) > this.LIZ.getBoundaryOffsetX()) {
                    z = true;
                } else {
                    z = false;
                }
                if (Math.abs(top) > this.LIZ.getBoundaryOffsetY()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (Math.abs(f) > 400.0f) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (Math.abs(f2) <= 400.0f) {
                    z4 = false;
                }
                if (!z && !z2 && !z3 && !z4) {
                    this.LIZ.getDragHelper().LJIJI(0, 0);
                    this.LIZ.invalidate();
                    if (this.LIZ.getEnableTransform()) {
                        view.animate().alpha(1.0f).setDuration(200L).start();
                    }
                    Function1<Boolean, Unit> onDragEnd = this.LIZ.getOnDragEnd();
                    if (onDragEnd != null) {
                        onDragEnd.invoke(Boolean.valueOf(this.LIZ.getEnableTransform()));
                    }
                } else {
                    if (((Boolean) C0AI4.LIZ.getValue()).booleanValue()) {
                        this.LIZ.getClass();
                        int left2 = view.getLeft();
                        int top2 = view.getTop();
                        if (left2 != 0 || top2 != 0) {
                            C786410Ut5.Jc(view, view.getTranslationX() + left2);
                            C786410Ut5.ed(view, view.getTranslationY() + top2);
                            view.offsetLeftAndRight(-left2);
                            view.offsetTopAndBottom(-top2);
                        }
                    }
                    Function0<Unit> onExit = this.LIZ.getOnExit();
                    if (onExit != null) {
                        onExit.invoke();
                    }
                }
                this.LIZ.requestDisallowInterceptTouchEvent(false);
            }

            @Override // X.AbstractC21586119dr
            public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
                float fMin = 1 - ((float) Math.min(Math.hypot(i, i2) / ((double) this.LIZ.getHeight()), 0.3d));
                if (this.LIZ.getEnableTransform()) {
                    C786410Ut5.Ob(view, fMin);
                    C786410Ut5.pc(view, fMin);
                    C786410Ut5.T4(view, fMin);
                }
            }
        };
        this.LLILZIL = C452501pT.LIZIZ(new AwS577S0100000_33(context, 2182));
        this.LLJIJIL = new LinkedHashMap();
        this.LLJILJILJ = AFwS224S0000000_33.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        this.LLJILLL = AFwS224S0000000_33.get$arr$(299);
        this.LLJJ = true;
        this.LLJJIII = true;
        this.LLJJJ = AFwS224S0000000_33.get$arr$(301);
    }
}
