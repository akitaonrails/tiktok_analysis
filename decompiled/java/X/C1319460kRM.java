package X;

import Y.ARunnableS7S0102000_20;
import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.OverScroller;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import com.lynx.base.log.LynxLog;
import com.lynx.xelement.scroll.coordinator.LynxUIScrollCoordinator;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kRM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1319460kRM extends AbstractC1319290kR5<C1319360kRC> implements InterfaceC20097013kG {
    public final LynxUIScrollCoordinator LLJLLIL;
    public float LLJLLL;
    public float LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public boolean LLLFF;
    public Boolean LLLFFI;
    public Boolean LLLFZ;
    public final C1318260kPQ LLLI;
    public VelocityTracker LLLII;
    public final OverScroller LLLIIII;
    public int LLLIIIIL;
    public int LLLIIIL;
    public final int[] LLLIIL;
    public final int[] LLLIILIL;
    public final int[] LLLIL;
    public Method LLLILZ;

    @Override // X.AbstractC1319290kR5
    public int getLayoutResId() {
        return R.layout.es_;
    }

    public final void LJJ() {
        this.LLLIIIIL++;
        if (this.LLLIIII.isFinished()) {
            return;
        }
        this.LLLIIII.forceFinished(true);
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.LLL && this.LLLIIII.computeScrollOffset()) {
            postOnAnimation(new ARunnableS7S0102000_20(this.LLLIIIIL, this, this.LLLIIII.getCurrY() - getAppBarLayoutView().getTopAndBottomOffset(), 5));
            postInvalidateOnAnimation();
        }
        super.computeScroll();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.LLL ? this.LLLI.LJIIIIZZ(0) : super.hasNestedScrollingParent();
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.LLLI.LIZLLL;
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        if (this.LLL) {
            stopNestedScroll(0);
        }
    }

    public C21543519Sv getCollapsingToolbarLayout() {
        return getCollapsingToolbar();
    }

    @Override // android.view.View
    public final boolean performClick() {
        return super.performClick();
    }

    public final int LJIJJLI(int i) {
        C16G1 c16g1;
        C16GU c16gu;
        ViewGroup.LayoutParams layoutParams = getAppBarLayoutView().getLayoutParams();
        if (layoutParams instanceof C16G1) {
            c16g1 = (C16G1) layoutParams;
        } else {
            c16g1 = null;
        }
        if (c16g1 == null) {
            return 0;
        }
        C16BC c16bc = c16g1.LIZ;
        if (!(c16bc instanceof AppBarLayout$Behavior) || (c16gu = (C16GU) c16bc) == null) {
            return 0;
        }
        int topAndBottomOffset = c16gu.getTopAndBottomOffset();
        int iLJ = C13LZ.LJ(topAndBottomOffset - i, -getAppBarLayoutView().getTotalScrollRange(), 0);
        if (iLJ == topAndBottomOffset) {
            return 0;
        }
        c16gu.setTopAndBottomOffset(iLJ);
        try {
            if (this.LLLILZ == null) {
                Method declaredMethod = getAppBarLayoutView().getClass().getSuperclass().getSuperclass().getDeclaredMethod("dispatchOffsetUpdates", Integer.TYPE);
                this.LLLILZ = declaredMethod;
                if (declaredMethod != null) {
                    declaredMethod.setAccessible(true);
                }
            }
            Method method = this.LLLILZ;
            if (method != null) {
                method.invoke(getAppBarLayoutView(), Integer.valueOf(getAppBarLayoutView().getTopAndBottomOffset()));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dispatchOffsetUpdate fail, offset is");
            sbLIZ.append(getAppBarLayoutView().getTopAndBottomOffset());
            LynxLog.e("ScrollCoordinatorLayout", C2188811AlT.LIZIZ(sbLIZ));
            this.LLLILZ = null;
        }
        return topAndBottomOffset - iLJ;
    }

    public final boolean LJIL(MotionEvent motionEvent) {
        Boolean bool;
        if (!this.LLJLLIL.isEnableNewGesture() || (bool = this.LLLFFI) == null || bool.booleanValue() || (motionEvent != null && motionEvent.getActionMasked() == 0)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.LLJLLIL.isEnableNewGesture()) {
            Boolean bool = this.LLLFFI;
            if (bool != null && Intrinsics.LJFF(bool, Boolean.FALSE)) {
                return true;
            }
            if (this.LLLFFI != null && !this.LLLFF) {
                if (motionEvent != null) {
                    motionEvent.setAction(0);
                }
                this.LLLFF = true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // X.C16G0, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        if ((this.LLJLLIL.isEnableNewGesture() && !this.LLJLLIL.mIncludeNativeGesture) || LJIL(motionEvent)) {
            return false;
        }
        if (this.LLJLLIL.isEnableNewGesture() && this.LLLFZ != null && Intrinsics.LJFF(this.LLLFZ, Boolean.TRUE)) {
            return Intrinsics.LJFF(this.LLLFZ, Boolean.TRUE);
        }
        this.LLJZIJLIL = false;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (numValueOf.intValue() == 0) {
                this.LLJLLL = motionEvent.getX();
                this.LLJZ = motionEvent.getY();
                LJJ();
                if (this.LLL) {
                    this.LLLIIIL = (int) (motionEvent.getY() + 0.5f);
                    startNestedScroll(2, 0);
                }
            } else if (numValueOf.intValue() == 1) {
                this.LLJLLL = motionEvent.getX();
                this.LLJZ = motionEvent.getY();
            } else if (numValueOf.intValue() == 2 && !getScrollEnabledFlag()) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.LLJLLL) >= Math.abs(y - this.LLJZ)) {
                    this.LLJLLL = x;
                    this.LLJZ = y;
                    this.LLJZIJLIL = false;
                } else {
                    this.LLJZIJLIL = true;
                }
            }
        }
        if (!getScrollEnabledFlag()) {
            return this.LLJZIJLIL;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // X.C16G0, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean zOnTouchEvent;
        float yVelocity;
        Integer numValueOf;
        if (LJIL(motionEvent)) {
            return false;
        }
        if (this.LLJLLIL.isEnableNewGesture() && this.LLLFZ != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getActionMasked())) != null) {
            if (numValueOf.intValue() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            } else {
                if (numValueOf.intValue() == 2) {
                    getParent().requestDisallowInterceptTouchEvent(this.LLJZIJLIL);
                    Boolean bool = this.LLLFZ;
                    Boolean bool2 = Boolean.TRUE;
                    boolean zLJFF = Intrinsics.LJFF(bool, bool2);
                    if (!Intrinsics.LJFF(this.LLLFZ, bool2)) {
                        return super.onTouchEvent(motionEvent);
                    }
                    return zLJFF;
                }
                if (numValueOf.intValue() == 1 || numValueOf.intValue() == 3) {
                    this.LLLFZ = null;
                }
            }
        }
        if (!getScrollEnabledFlag()) {
            return false;
        }
        if (!this.LLL) {
            zOnTouchEvent = super.onTouchEvent(motionEvent);
        } else {
            zOnTouchEvent = true;
        }
        if (motionEvent == null) {
            return true;
        }
        if (this.LLL) {
            if (this.LLLII == null) {
                this.LLLII = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker = this.LLLII;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
        int y = (int) (motionEvent.getY() + 0.5f);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3 && this.LLL) {
                        stopNestedScroll(0);
                        VelocityTracker velocityTracker2 = this.LLLII;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                        }
                        this.LLLII = null;
                    }
                } else {
                    int i = this.LLLIIIL - y;
                    if (!this.LLLF && Math.abs(i) > ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                        this.LLLF = true;
                        if (this.LLL) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.LLL && this.LLLF) {
                        int i2 = i;
                        if (dispatchNestedPreScroll(0, i2, this.LLLIILIL, this.LLLIIL, 0)) {
                            i2 -= this.LLLIILIL[1];
                            int[] iArr = this.LLLIL;
                            int i3 = iArr[0];
                            int[] iArr2 = this.LLLIIL;
                            iArr[0] = i3 + iArr2[0];
                            iArr[1] = iArr[1] + iArr2[1];
                        }
                        this.LLLIIIL = y - this.LLLIIL[1];
                        int iLJIJJLI = LJIJJLI(i2);
                        if (this.LLLI.LJFF(0, iLJIJJLI, 0, i2 - iLJIJJLI, this.LLLIIL, 0)) {
                            int i4 = this.LLLIIIL;
                            int[] iArr3 = this.LLLIIL;
                            int i5 = iArr3[1];
                            this.LLLIIIL = i4 - i5;
                            int[] iArr4 = this.LLLIL;
                            iArr4[0] = iArr4[0] + iArr3[0];
                            iArr4[1] = iArr4[1] + i5;
                            return zOnTouchEvent;
                        }
                    }
                }
            } else {
                if (this.LLL && this.LLLF) {
                    VelocityTracker velocityTracker3 = this.LLLII;
                    if (velocityTracker3 != null) {
                        velocityTracker3.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT);
                    }
                    VelocityTracker velocityTracker4 = this.LLLII;
                    if (velocityTracker4 != null) {
                        yVelocity = velocityTracker4.getYVelocity();
                    } else {
                        yVelocity = 0.0f;
                    }
                    if (Math.abs(yVelocity) > ViewConfiguration.get(getContext()).getScaledMinimumFlingVelocity()) {
                        int topAndBottomOffset = getAppBarLayoutView().getTopAndBottomOffset();
                        int totalScrollRange = getAppBarLayoutView().getTotalScrollRange();
                        this.LLLIIIIL++;
                        this.LLLIIII.fling(0, topAndBottomOffset, 0, (int) yVelocity, 0, 0, -totalScrollRange, 0);
                        postInvalidateOnAnimation();
                    }
                }
                if (!this.LLLF) {
                    super.performClick();
                }
                if (this.LLL) {
                    stopNestedScroll(0);
                    VelocityTracker velocityTracker5 = this.LLLII;
                    if (velocityTracker5 != null) {
                        velocityTracker5.recycle();
                    }
                    this.LLLII = null;
                    return zOnTouchEvent;
                }
            }
        } else {
            LJJ();
            this.LLLIIIL = y;
            this.LLLF = false;
            int[] iArr5 = this.LLLIL;
            iArr5[0] = 0;
            iArr5[1] = 0;
            if (this.LLL) {
                VelocityTracker velocityTracker6 = this.LLLII;
                if (velocityTracker6 == null) {
                    this.LLLII = VelocityTracker.obtain();
                } else {
                    velocityTracker6.clear();
                }
                startNestedScroll(2, 0);
                return zOnTouchEvent;
            }
        }
        return zOnTouchEvent;
    }

    public final void setConsumeGesture(boolean z) {
        this.LLLFFI = Boolean.valueOf(z);
        if (z) {
            this.LLLFF = false;
        }
    }

    public final void setInterceptGesture(boolean z) {
        this.LLLFZ = Boolean.valueOf(z);
    }

    public final void setNestedScrollAsChild(boolean z) {
        this.LLL = z;
        setNestedScrollingEnabled(z);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.LLLI.LJIIIZ(z);
    }

    @Override // X.AbstractC1319290kR5
    public void setScrollEnabled(boolean z) {
        setScrollEnabledFlag(z);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        if (this.LLL) {
            return startNestedScroll(i, 0);
        }
        return super.startNestedScroll(i);
    }

    @Override // X.InterfaceC20097013kG
    public final void stopNestedScroll(int i) {
        this.LLLI.LJIIJJI(i);
    }

    public C1319460kRM(Context context, LynxUIScrollCoordinator lynxUIScrollCoordinator) {
        new LinkedHashMap();
        super(context);
        this.LLJLLIL = lynxUIScrollCoordinator;
        this.LLLFF = true;
        this.LLLI = new C1318260kPQ(this);
        this.LLLIIII = new OverScroller(context);
        this.LLLIIL = new int[2];
        this.LLLIILIL = new int[2];
        this.LLLIL = new int[2];
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        if (this.LLL) {
            return this.LLLI.LIZIZ(f, f2);
        }
        return super.dispatchNestedPreFling(f, f2);
    }

    @Override // X.InterfaceC20097013kG
    public final boolean startNestedScroll(int i, int i2) {
        return this.LLLI.LJIIJ(i, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        if (this.LLL) {
            return this.LLLI.LIZ(f, f2, z);
        }
        return super.dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        if (this.LLL) {
            return dispatchNestedPreScroll(i, i2, iArr, iArr2, 0);
        }
        return super.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    @Override // X.C16G0, android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (this.LLL) {
            int[] iArr2 = {0, 0};
            super.onNestedPreScroll(view, i, i2, iArr2);
            int[] iArr3 = {0, 0};
            dispatchNestedPreScroll(i, i2, iArr3, null);
            iArr[0] = iArr2[0] + iArr3[0];
            iArr[1] = iArr2[1] + iArr3[1];
            return;
        }
        super.onNestedPreScroll(view, i, i2, iArr);
    }

    @Override // X.C16G0, X.InterfaceC1318370kPb
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        boolean zOnStartNestedScroll = super.onStartNestedScroll(view, view2, i, i2);
        if (!this.LLL) {
            return zOnStartNestedScroll;
        }
        if (((i & 2) != 0 && startNestedScroll(i)) || zOnStartNestedScroll) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC20097013kG
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.LLLI.LIZLLL(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        if (this.LLL) {
            return this.LLLI.LJFF(i, i2, i3, i4, iArr, 0);
        }
        return super.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    @Override // X.C16G0, X.InterfaceC1318370kPb
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (this.LLL) {
            int[] iArr2 = {0, 0};
            super.onNestedPreScroll(view, i, i2, iArr2, i3);
            int[] iArr3 = {0, 0};
            dispatchNestedPreScroll(i, i2, iArr3, null);
            iArr[0] = iArr2[0] + iArr3[0];
            iArr[1] = iArr2[1] + iArr3[1];
            return;
        }
        super.onNestedPreScroll(view, i, i2, iArr, i3);
    }

    @Override // X.C16G0, android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        super.onNestedScroll(view, i, i2, i3, i4);
        if (this.LLL && getAppBarLayoutView().getTopAndBottomOffset() == 0) {
            dispatchNestedScroll(i, i2, i3, i4, null);
        }
    }

    @Override // X.C16G0, X.InterfaceC1318370kPb
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        super.onNestedScroll(view, i, i2, i3, i4, i5);
        if (this.LLL && getAppBarLayoutView().getTopAndBottomOffset() == 0) {
            this.LLLI.LJFF(i, i2, i3, i4, null, i5);
        }
    }
}
