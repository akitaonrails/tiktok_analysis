package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.ui.scroll.UIScrollView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.0kPz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1318610kPz extends HorizontalScrollView implements InterfaceC1318370kPb, InterfaceC20097013kG {
    public boolean LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public final int[] LLJIJIL;
    public final int[] LLJILJIL;
    public final UIScrollView LLJILJILJ;
    public OverScroller LLJILLL;
    public VelocityTracker LLJJ;
    public C1317550kOH LLJJI;
    public C1318260kPQ LLJJIII;
    public C1318640kQ2 LLJJIJI;

    @Override // android.view.View
    public final void stopNestedScroll() {
        stopNestedScroll(0);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void computeScroll() {
        OverScroller hScroller;
        if (!this.LL || (hScroller = getHScroller()) == null) {
            super.computeScroll();
            return;
        }
        if (!hScroller.computeScrollOffset()) {
            if (this.LLJJIII.LJIIIIZZ(1)) {
                stopNestedScroll(1);
            }
            this.LLJI = 0;
            C1318640kQ2 c1318640kQ2 = this.LLJJIJI;
            if (c1318640kQ2 == null || !this.LLILLL) {
                return;
            }
            c1318640kQ2.LIZ();
            return;
        }
        int currX = hScroller.getCurrX();
        int i = currX - this.LLJI;
        if (dispatchNestedPreScroll(i, 0, this.LLJILJIL, null, 1)) {
            i -= this.LLJILJIL[0];
        }
        if (i != 0) {
            int iLJJIZ = this.LLJILJILJ.LJJIZ();
            int scrollX = getScrollX();
            int i2 = scrollX + i;
            boolean z = i2 < 0 || i2 > iLJJIZ;
            int iLIZIZ = C419990GdR.LIZIZ(i2, 0, iLJJIZ);
            if (z && !this.LLJJIII.LJIIIIZZ(1)) {
                hScroller.springBack(iLIZIZ, 0, 0, iLJJIZ, 0, 0);
            }
            super.scrollTo(iLIZIZ, getScrollY());
            int scrollX2 = getScrollX() - scrollX;
            LIZ(scrollX2, 0, i - scrollX2, 0, null, 1);
        }
        this.LLJI = currX;
        postInvalidateOnAnimation();
    }

    public OverScroller getHScroller() {
        OverScroller overScroller = this.LLJILLL;
        if (overScroller != null) {
            return overScroller;
        }
        try {
            Field declaredField = HorizontalScrollView.class.getDeclaredField("mScroller");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                if (obj instanceof OverScroller) {
                    this.LLJILLL = (OverScroller) obj;
                }
            }
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            LynxLog.e("LynxNestedHorizontalScrollView", "Failed to get mScroller of HorizontalScrollView!");
        } catch (NoSuchFieldException e2) {
            TryCatchGuardChecker.doCheck(e2);
            LynxLog.e("LynxNestedHorizontalScrollView", "Failed to get mScroller field of HorizontalScrollView!");
        }
        return this.LLJILLL;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C1317550kOH c1317550kOH = this.LLJJI;
        return c1317550kOH.LIZIZ | c1317550kOH.LIZ;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.LLJJIII.LJIIIIZZ(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.LLJJIII.LIZLLL;
    }

    public final void LIZIZ(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.LLILZ) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.LLILZIL = (int) motionEvent.getX(i);
            this.LLILZ = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.LLJJ;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView
    public void fling(int i) {
        OverScroller hScroller;
        if (this.LL && (hScroller = getHScroller()) != null) {
            if (getChildCount() > 0) {
                startNestedScroll(1, 1);
                hScroller.fling(getScrollX(), getScrollY(), i, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0, 0, 0);
                postInvalidateOnAnimation();
                this.LLJI = getScrollX();
                return;
            }
            return;
        }
        super.fling(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0119  */
    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1318610kPz.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        boolean z;
        boolean z2;
        if (!this.LL) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.LLILLL && this.LLJJIJI != null) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.LLJJ == null) {
            this.LLJJ = VelocityTracker.obtain();
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (actionMasked == 0) {
            this.LLJ = 0;
        }
        motionEventObtain.offsetLocation(this.LLJ, 0.0f);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                LIZIZ(motionEvent);
                                int iFindPointerIndex = motionEvent.findPointerIndex(this.LLILZ);
                                if (iFindPointerIndex != -1) {
                                    this.LLILZIL = (int) motionEvent.getX(iFindPointerIndex);
                                }
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.LLILZIL = (int) motionEvent.getX(actionIndex);
                            this.LLILZ = motionEvent.getPointerId(actionIndex);
                        }
                    } else {
                        int iLJJIZ = this.LLJILJILJ.LJJIZ();
                        OverScroller hScroller = getHScroller();
                        if (this.LLILLJJLI && getChildCount() > 0 && hScroller != null && hScroller.springBack(getScrollX(), getScrollY(), 0, iLJJIZ, 0, 0)) {
                            postInvalidateOnAnimation();
                        }
                        this.LLILLJJLI = false;
                        this.LLILZ = -1;
                        VelocityTracker velocityTracker = this.LLJJ;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.LLJJ = null;
                        }
                        stopNestedScroll(0);
                    }
                } else {
                    int iFindPointerIndex2 = motionEvent.findPointerIndex(this.LLILZ);
                    if (iFindPointerIndex2 != -1) {
                        int x = (int) motionEvent.getX(iFindPointerIndex2);
                        int i = this.LLILZIL - x;
                        if (dispatchNestedPreScroll(i, 0, this.LLJILJIL, this.LLJIJIL, 0)) {
                            i -= this.LLJILJIL[0];
                            motionEventObtain.offsetLocation(this.LLJIJIL[0], 0.0f);
                            this.LLJ += this.LLJIJIL[0];
                        }
                        if (!this.LLILLJJLI && Math.abs(i) > this.LLILZLL) {
                            this.LLILLJJLI = true;
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            if (i > 0) {
                                i -= this.LLILZLL;
                            } else {
                                i += this.LLILZLL;
                            }
                        }
                        if (this.LLILLJJLI) {
                            this.LLILZIL = x - this.LLJIJIL[0];
                            int iLJJIZ2 = this.LLJILJILJ.LJJIZ();
                            int scrollX = getScrollX();
                            int i2 = scrollX + i;
                            if (i2 >= 0 && i2 <= iLJJIZ2) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            int iLIZIZ = C419990GdR.LIZIZ(i2, 0, iLJJIZ2);
                            OverScroller hScroller2 = getHScroller();
                            if (z2 && !this.LLJJIII.LJIIIIZZ(1) && hScroller2 != null) {
                                hScroller2.springBack(iLIZIZ, 0, 0, iLJJIZ2, 0, 0);
                            }
                            super.scrollTo(iLIZIZ, getScrollY());
                            if (z2 && !this.LLJJIII.LJIIIIZZ(0)) {
                                this.LLJJ.clear();
                            }
                            int scrollX2 = getScrollX() - scrollX;
                            if (LIZ(scrollX2, 0, i - scrollX2, 0, this.LLJIJIL, 0)) {
                                int i3 = this.LLILZIL;
                                int i4 = this.LLJIJIL[0];
                                this.LLILZIL = i3 - i4;
                                this.LLJ += i4;
                                motionEventObtain.offsetLocation(i4, 0.0f);
                            }
                        }
                    }
                }
            } else {
                VelocityTracker velocityTracker2 = this.LLJJ;
                velocityTracker2.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT, this.LLIZLLLIL);
                int i5 = -((int) velocityTracker2.getXVelocity(this.LLILZ));
                int iLJJIZ3 = this.LLJILJILJ.LJJIZ();
                OverScroller hScroller3 = getHScroller();
                if (getChildCount() > 0) {
                    if (Math.abs(i5) > this.LLIZ) {
                        if ((getScrollX() > 0 || i5 > 0) && (getScrollX() < iLJJIZ3 || i5 < 0)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        float f = i5;
                        if (!dispatchNestedPreFling(f, 0.0f)) {
                            dispatchNestedFling(f, 0.0f, z);
                            fling(i5);
                        }
                    } else if (hScroller3 != null && hScroller3.springBack(getScrollX(), getScrollY(), 0, iLJJIZ3, 0, 0)) {
                        postInvalidateOnAnimation();
                    }
                }
                this.LLILLJJLI = false;
                this.LLILZ = -1;
                VelocityTracker velocityTracker3 = this.LLJJ;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.LLJJ = null;
                }
                stopNestedScroll(0);
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            OverScroller hScroller4 = getHScroller();
            if (hScroller4 != null) {
                boolean z3 = !hScroller4.isFinished();
                this.LLILLJJLI = z3;
                if (z3 && (parent = getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                hScroller4.abortAnimation();
            }
            this.LLILZIL = (int) motionEvent.getX();
            this.LLILZ = motionEvent.getPointerId(0);
            startNestedScroll(1, 0);
        }
        VelocityTracker velocityTracker4 = this.LLJJ;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public void setEnableNewBounce(boolean z) {
        this.LLILLL = z;
    }

    public void setEnableNewNested(boolean z) {
        this.LL = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.LLJJIII.LJIIIZ(z);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return startNestedScroll(i, 0);
    }

    @Override // X.InterfaceC20097013kG
    public final void stopNestedScroll(int i) {
        this.LLJJIII.LJIIJJI(i);
    }

    public C1318610kPz(Context context, UIScrollView uIScrollView) {
        super(context);
        this.LLILZ = -1;
        this.LLJIJIL = new int[2];
        this.LLJILJIL = new int[2];
        this.LLJILJILJ = uIScrollView;
        C1317550kOH c1317550kOH = new C1317550kOH();
        this.LLJJI = c1317550kOH;
        this.LLJJIII = new C1318260kPQ(this);
        this.LLJJIJI = new C1318640kQ2(this, false, c1317550kOH);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.LLILZLL = viewConfiguration.getScaledTouchSlop();
        this.LLIZ = viewConfiguration.getScaledMinimumFlingVelocity();
        this.LLIZLLLIL = viewConfiguration.getScaledMaximumFlingVelocity();
        setNestedScrollingEnabled(false);
    }

    public final void LIZJ(int i, int i2) {
        if (this.LL && getHScroller() != null) {
            this.LLJI = getScrollX();
        }
        super.smoothScrollTo(i, i2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.LLJJIII.LIZIZ(f, f2);
    }

    @Override // X.InterfaceC1318370kPb
    public final void onStopNestedScroll(View view, int i) {
        C1318640kQ2 c1318640kQ2;
        if (this.LLILLL && (c1318640kQ2 = this.LLJJIJI) != null) {
            c1318640kQ2.LJ(i);
        } else {
            this.LLJJI.LIZIZ(i);
            stopNestedScroll(i);
        }
    }

    @Override // X.InterfaceC20097013kG
    public final boolean startNestedScroll(int i, int i2) {
        return this.LLJJIII.LJIIJ(i, i2);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.LLJJIII.LIZ(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        C1318640kQ2 c1318640kQ2;
        if (this.LLILLL && (c1318640kQ2 = this.LLJJIJI) != null) {
            c1318640kQ2.getClass();
            return false;
        }
        return dispatchNestedPreFling(f, f2);
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
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return dispatchNestedPreScroll(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        C1318640kQ2 c1318640kQ2;
        boolean z2 = false;
        if (this.LLILLL && (c1318640kQ2 = this.LLJJIJI) != null) {
            c1318640kQ2.getClass();
            return false;
        }
        if (z) {
            return false;
        }
        int scrollX = getScrollX();
        int iLJJIZ = this.LLJILJILJ.LJJIZ();
        if ((scrollX > 0 || f > 0.0f) && (scrollX < iLJJIZ || f < 0.0f)) {
            z2 = true;
        }
        if (!dispatchNestedPreFling(f, 0.0f)) {
            dispatchNestedFling(f, 0.0f, z2);
            fling((int) f);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        dispatchNestedPreScroll(i, i2, iArr, null, 0);
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        C1318640kQ2 c1318640kQ2;
        if (this.LLILLL && (c1318640kQ2 = this.LLJJIJI) != null) {
            c1318640kQ2.LJI.LIZ(i, i2);
        } else {
            this.LLJJI.LIZ(i, i2);
            startNestedScroll(1, i2);
        }
    }

    @Override // X.InterfaceC1318370kPb
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        C1318640kQ2 c1318640kQ2;
        int i3;
        if (this.LLILLL && (c1318640kQ2 = this.LLJJIJI) != null) {
            if (c1318640kQ2.LIZ) {
                i3 = 2;
            } else {
                i3 = 1;
            }
            if ((i3 & i) == 0) {
                return false;
            }
            return true;
        }
        if ((i & 1) == 0) {
            return false;
        }
        return true;
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.LLJJIII.LIZLLL(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return LIZ(i, i2, i3, i4, iArr, 0);
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        C1318640kQ2 c1318640kQ2;
        if (this.LLILLL && (c1318640kQ2 = this.LLJJIJI) != null) {
            c1318640kQ2.LIZJ(view, i, i2, iArr, i3);
        } else {
            dispatchNestedPreScroll(i, i2, iArr, null, i3);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    public boolean LIZ(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.LLJJIII.LJFF(i, i2, i3, i4, iArr, i5);
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        C1318640kQ2 c1318640kQ2;
        if (this.LLILLL && (c1318640kQ2 = this.LLJJIJI) != null) {
            c1318640kQ2.LIZLLL(i, i2, i3, i4, i5);
            return;
        }
        int scrollX = getScrollX();
        scrollBy(i3, 0);
        int scrollX2 = getScrollX() - scrollX;
        LIZ(scrollX2, 0, i3 - scrollX2, 0, null, i5);
    }
}
