package X;

import Y.ATListenerS14S0010000_20;
import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.lynx.base.log.LynxLog;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0kOA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1317480kOA extends FrameLayout implements InterfaceC1318370kPb, InterfaceC20097013kG, InterfaceC1354050lL9 {
    public static final InterpolatorC1313010kGx LLJJJJJIL = new Interpolator() { // from class: X.0kGx
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    public C1312990kGv LL;
    public boolean LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public final int[] LLJILJIL;
    public final int[] LLJILJILJ;
    public final int[] LLJILLL;
    public final int[] LLJJ;
    public final int[] LLJJI;
    public VelocityTracker LLJJIII;
    public final RunnableC1312980kGu LLJJIJI;
    public final ArrayList<InterfaceC1317570kOJ> LLJJIJIIJIL;
    public final ArrayList<InterfaceC1317560kOI> LLJJIJIL;
    public final C1317550kOH LLJJJ;
    public final C1318260kPQ LLJJJIL;
    public boolean LLJJJJ;

    public boolean LJ() {
        return false;
    }

    public void LJFF(boolean z) {
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        stopNestedScroll(0);
    }

    private int getNestedScrollAxis() {
        return this.LLILLJJLI ? 2 : 1;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        if (this.LLILLJJLI) {
            return 0;
        }
        return Math.max(0, super.computeHorizontalScrollOffset());
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        if (this.LLILLJJLI) {
            return 0;
        }
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        if (getChildCount() <= 0 || getChildAt(0) == null) {
            return width;
        }
        View childAt = getChildAt(0);
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            return width;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        return childAt.getWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin;
    }

    @Override // android.view.View, X.InterfaceC1354050lL9
    public final int computeVerticalScrollOffset() {
        if (this.LLILLJJLI) {
            return Math.max(0, super.computeVerticalScrollOffset());
        }
        return 0;
    }

    @Override // android.view.View, X.InterfaceC1354050lL9
    public final int computeVerticalScrollRange() {
        if (!this.LLILLJJLI) {
            return 0;
        }
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        if (getChildCount() <= 0 || getChildAt(0) == null) {
            return height;
        }
        View childAt = getChildAt(0);
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            return height;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        return childAt.getHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
    }

    public AbstractC1311850kF5 getCustomScrollHook() {
        RunnableC1312980kGu runnableC1312980kGu = this.LLJJIJI;
        if (runnableC1312980kGu != null) {
            return runnableC1312980kGu.LLILZLL;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C1317550kOH c1317550kOH = this.LLJJJ;
        return c1317550kOH.LIZIZ | c1317550kOH.LIZ;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.LLJJJIL.LJIIIIZZ(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.LLJJJIL.LIZLLL;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int getScrollRange() {
        int width;
        int width2;
        int paddingRight;
        if (getChildCount() <= 0 || getChildAt(0) == null) {
            return 0;
        }
        View childAt = getChildAt(0);
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            return 0;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (this.LLILLJJLI) {
            width = childAt.getHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
            width2 = getHeight() - getPaddingTop();
            paddingRight = getPaddingBottom();
        } else {
            width = childAt.getWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin;
            width2 = getWidth() - getPaddingLeft();
            paddingRight = getPaddingRight();
        }
        return Math.max(0, width - (width2 - paddingRight));
    }

    public C1317480kOA(Context context) {
        super(context, null, 0);
        this.LLILLJJLI = true;
        this.LLJI = 1;
        this.LLJIJIL = -1;
        this.LLJILJIL = new int[2];
        this.LLJILJILJ = new int[2];
        this.LLJILLL = new int[2];
        this.LLJJ = new int[2];
        this.LLJJI = new int[2];
        this.LLJJIJIIJIL = new ArrayList<>();
        this.LLJJIJIL = new ArrayList<>();
        this.LLJJJJ = false;
        this.LLJJJ = new C1317550kOH();
        this.LLJJJIL = new C1318260kPQ(this);
        this.LLJJIJI = new RunnableC1312980kGu((C1317470kO9) this);
        setNestedScrollingEnabled(true);
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.LLILLL = viewConfiguration.getScaledTouchSlop();
        this.LLILZ = viewConfiguration.getScaledMinimumFlingVelocity();
        this.LLILZIL = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public final boolean LIZ(int i) {
        int i2;
        int scrollX = getScrollX();
        if (this.LLILLJJLI) {
            i2 = 0;
        } else {
            i2 = i;
        }
        int i3 = scrollX + i2;
        int scrollY = getScrollY();
        if (!this.LLILLJJLI) {
            i = 0;
        }
        int i4 = scrollY + i;
        int scrollRange = getScrollRange();
        if (this.LLILLJJLI) {
            if (i4 <= 0 || i4 >= scrollRange) {
                return false;
            }
        } else if (i3 <= 0 || i3 >= scrollRange) {
            return false;
        }
        return true;
    }

    public final void LJI(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.LLJIJIL) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.LLJIJIL = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.LLIZLLLIL = x;
            this.LLILZLL = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.LLJ = y;
            this.LLIZ = y;
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (!this.LLILLJJLI && super.canScrollHorizontally(i)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        if (this.LLILLJJLI && super.canScrollVertically(i)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (this.LLJJIII == null) {
            this.LLJJIII = VelocityTracker.obtain();
        }
        this.LLJJIII.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                LJI(motionEvent);
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.LLJIJIL = motionEvent.getPointerId(actionIndex);
                            int x = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.LLIZLLLIL = x;
                            this.LLILZLL = x;
                            int y = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.LLJ = y;
                            this.LLIZ = y;
                        }
                    } else {
                        VelocityTracker velocityTracker = this.LLJJIII;
                        if (velocityTracker != null) {
                            velocityTracker.clear();
                        }
                        stopNestedScroll(0);
                        setScrollState(1);
                    }
                } else {
                    int i = this.LLJIJIL;
                    if (i != -1) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(i);
                        if (iFindPointerIndex < 0) {
                            return false;
                        }
                        int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        if (this.LLJI != 2) {
                            int i2 = x2 - this.LLILZLL;
                            int i3 = y2 - this.LLIZ;
                            if (this.LLILLJJLI && Math.abs(i3) > this.LLILLL && (getNestedScrollAxes() & 2) == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!this.LLILLJJLI && Math.abs(i2) > this.LLILLL && (getNestedScrollAxes() & 1) == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z || z2) {
                                this.LLIZLLLIL = x2;
                                this.LLJ = y2;
                                setScrollState(2);
                            }
                        }
                    }
                }
            } else {
                this.LLJJIII.clear();
                stopNestedScroll(0);
            }
        } else {
            this.LLJIJIL = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            this.LLIZLLLIL = x3;
            this.LLILZLL = x3;
            int y3 = (int) (motionEvent.getY() + 0.5f);
            this.LLJ = y3;
            this.LLIZ = y3;
            int i4 = this.LLJI;
            if (i4 == 3 || i4 == 4) {
                RunnableC1312980kGu runnableC1312980kGu = this.LLJJIJI;
                runnableC1312980kGu.LLILZIL.LIZIZ();
                if (!runnableC1312980kGu.LLILZIL.LIZLLL()) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    setScrollState(2);
                } else {
                    setScrollState(1);
                }
            }
            int[] iArr = this.LLJILLL;
            iArr[1] = 0;
            iArr[0] = 0;
            startNestedScroll(getNestedScrollAxis(), 0);
        }
        if (this.LLJI != 2) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0151  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r23) {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1317480kOA.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCustomScrollHook(AbstractC1311850kF5 abstractC1311850kF5) {
        RunnableC1312980kGu runnableC1312980kGu = this.LLJJIJI;
        if (runnableC1312980kGu != null) {
            runnableC1312980kGu.LLILZLL = abstractC1311850kF5;
        }
    }

    public void setEnableScroll(boolean z) {
        setOnTouchListener(new ATListenerS14S0010000_20(z, 0));
    }

    public void setIsVertical(boolean z) {
        this.LLILLJJLI = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.LLJJJIL.LJIIIZ(z);
    }

    public void setScrollState(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setScrollState: ");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(" -> ");
        sbLIZ.append(i);
        LynxLog.i("UIListContainer.NestedScrollContainerView", C2188811AlT.LIZIZ(sbLIZ));
        if (i == this.LLJI) {
            return;
        }
        if (this.LLJJJJ && i == 1) {
            return;
        }
        this.LLJI = i;
        if (i != 3 && i != 4) {
            RunnableC1312980kGu runnableC1312980kGu = this.LLJJIJI;
            HandlerHook.viewRemoveCallbacks(runnableC1312980kGu.LLIZ, runnableC1312980kGu);
            runnableC1312980kGu.LLILZIL.LIZ();
            AbstractC1311850kF5 abstractC1311850kF5 = runnableC1312980kGu.LLILZLL;
            if (abstractC1311850kF5 != null) {
                abstractC1311850kF5.LIZ();
                runnableC1312980kGu.LLILZLL = null;
            }
        }
        Iterator<InterfaceC1317570kOJ> it2 = this.LLJJIJIIJIL.iterator();
        while (it2.hasNext()) {
            it2.next().LJII(i);
        }
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return startNestedScroll(i, 0);
    }

    @Override // X.InterfaceC20097013kG
    public final void stopNestedScroll(int i) {
        this.LLJJJIL.LJIIJJI(i);
    }

    public final boolean LIZJ(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        if (this.LLILLJJLI || Math.abs(i3) < this.LLILZ) {
            i3 = 0;
        }
        if (!this.LLILLJJLI || Math.abs(i4) < this.LLILZ) {
            i4 = 0;
        }
        if (i3 == 0 && i4 == 0) {
            return false;
        }
        float f = i3;
        float f2 = i4;
        if (dispatchNestedPreFling(f, f2)) {
            return false;
        }
        dispatchNestedFling(f, f2, true);
        startNestedScroll(getNestedScrollAxis(), 1);
        int i5 = this.LLILZIL;
        int iMax = Math.max(-i5, Math.min(i3, i5));
        int i6 = this.LLILZIL;
        int iMax2 = Math.max(-i6, Math.min(i4, i6));
        RunnableC1312980kGu runnableC1312980kGu = this.LLJJIJI;
        runnableC1312980kGu.LLIZ.setScrollState(3);
        runnableC1312980kGu.LLILZLL = null;
        runnableC1312980kGu.LL = runnableC1312980kGu.LLIZ.getScrollX();
        int scrollY = runnableC1312980kGu.LLIZ.getScrollY();
        runnableC1312980kGu.LLILLJJLI = scrollY;
        runnableC1312980kGu.LLILLL = 0;
        runnableC1312980kGu.LLILZ = 0;
        C1317480kOA c1317480kOA = runnableC1312980kGu.LLIZ;
        if (c1317480kOA.LL == null) {
            float[] fArrLIZLLL = c1317480kOA.LIZLLL(runnableC1312980kGu.LL, scrollY);
            runnableC1312980kGu.LLILZIL.LIZJ(runnableC1312980kGu.LL, runnableC1312980kGu.LLILLJJLI, iMax, iMax2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, (int) fArrLIZLLL[0], (int) fArrLIZLLL[1]);
        } else {
            runnableC1312980kGu.LIZJ(iMax, iMax2);
        }
        runnableC1312980kGu.LIZLLL();
        return true;
    }

    public float[] LIZLLL(int i, int i2) {
        return new float[]{2.1474836E9f, 2.1474836E9f};
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.LLJJJIL.LIZIZ(f, f2);
    }

    @Override // X.InterfaceC1318370kPb
    public final void onStopNestedScroll(View view, int i) {
        this.LLJJJ.LIZIZ(i);
        if (i != 0 ? !(i != 1 || this.LLJI != 3) : this.LLJI == 2) {
            if (this.LL == null || !this.LLJJIJI.LIZIZ()) {
                setScrollState(1);
            }
        }
        stopNestedScroll(i);
    }

    @Override // X.InterfaceC20097013kG
    public final boolean startNestedScroll(int i, int i2) {
        return this.LLJJJIL.LJIIJ(i, i2);
    }

    public final void LJII(int i, int i2, int[] iArr) {
        int i3;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z = this.LLILLJJLI;
        if (z) {
            i3 = 0;
        } else {
            i3 = scrollRange;
        }
        int i4 = scrollX + i;
        if (i4 < 0) {
            i = -scrollX;
        } else if (i4 > i3) {
            i = i3 - scrollX;
        }
        if (!z) {
            scrollRange = 0;
        }
        int i5 = scrollY + i2;
        if (i5 < 0) {
            i2 = -scrollY;
        } else if (i5 > scrollRange) {
            i2 = scrollRange - scrollY;
        }
        if (Math.abs(i) > 0 || Math.abs(i2) > 0) {
            super.scrollTo(scrollX + i, scrollY + i2);
        }
        if (iArr != null) {
            iArr[0] = i;
            iArr[1] = i2;
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.LLJJJIL.LIZ(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        boolean zDispatchNestedPreFling = dispatchNestedPreFling(f, f2);
        if (this.LL != null && view != null && !zDispatchNestedPreFling) {
            int i = -1;
            if (this.LLILLJJLI) {
                if (f2 > 0.0f) {
                    i = 1;
                }
                if (view.canScrollVertically(i)) {
                    return false;
                }
            } else {
                if (f > 0.0f) {
                    i = 1;
                }
                if (view.canScrollHorizontally(i)) {
                    return false;
                }
            }
            LIZJ((int) f, (int) f2);
            return true;
        }
        return zDispatchNestedPreFling;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC1318530kPr
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return dispatchNestedPreScroll(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!z) {
            return LIZJ((int) f, (int) f2);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.LLJJJ.LIZ(i, i2);
        if (this.LLILLJJLI) {
            startNestedScroll(2, i2);
        } else {
            startNestedScroll(1, i2);
        }
    }

    @Override // X.InterfaceC1318370kPb
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        if (this.LLILLJJLI) {
            if ((i & 2) == 0) {
                return false;
            }
            return true;
        }
        if ((i & 1) == 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC20097013kG
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        boolean zLIZLLL = this.LLJJJIL.LIZLLL(i, i2, iArr, iArr2, i3);
        LJFF(zLIZLLL);
        return zLIZLLL;
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return LIZIZ(i, i2, i3, i4, iArr, 0);
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        dispatchNestedPreScroll(i, i2, iArr, null, i3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    public final boolean LIZIZ(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.LLJJJIL.LJFF(i, i2, i3, i4, iArr, i5);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        int scrollX;
        int i6;
        int i7;
        int i8 = i4;
        int i9 = i3;
        if (this.LL != null && i5 == 1) {
            if (this.LLILLJJLI) {
                i9 = 0;
            } else {
                i8 = 0;
            }
            LIZIZ(i9, i8, 0, 0, null, 1);
            return;
        }
        int scrollRange = getScrollRange();
        if (this.LLILLJJLI) {
            int scrollY = getScrollY();
            scrollTo(getScrollX(), C419990GdR.LIZIZ(i8 + scrollY, 0, scrollRange));
            scrollX = getScrollY() - scrollY;
        } else {
            i8 = i9;
            int scrollX2 = getScrollX();
            scrollTo(C419990GdR.LIZIZ(i9 + scrollX2, 0, scrollRange), getScrollY());
            scrollX = getScrollX() - scrollX2;
        }
        int i10 = i8 - scrollX;
        if (i8 != 0 && scrollX != 0) {
            if (i5 == 0) {
                setScrollState(2);
            } else if (i5 == 1) {
                setScrollState(3);
            }
        }
        if (this.LLILLJJLI) {
            i6 = 0;
            i7 = 0;
        } else {
            i6 = scrollX;
            scrollX = 0;
            i7 = i10;
            i10 = 0;
        }
        LIZIZ(i6, scrollX, i7, i10, null, i5);
    }
}
