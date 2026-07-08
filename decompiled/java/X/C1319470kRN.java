package X;

import Y.ARunnableS7S0102000_20;
import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.OverScroller;
import com.bytedance.ies.xelement.viewpager.foldview.LynxFoldViewNG;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import com.lynx.base.log.LynxLog;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kRN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1319470kRN extends AbstractC1319300kR6<C1319350kRB> implements InterfaceC20097013kG {
    public final LynxFoldViewNG LLJLLL;
    public float LLJZ;
    public float LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public boolean LLLFF;
    public boolean LLLFFI;
    public Boolean LLLFZ;
    public Boolean LLLI;
    public final C1318260kPQ LLLII;
    public VelocityTracker LLLIIII;
    public final OverScroller LLLIIIIL;
    public int LLLIIIL;
    public int LLLIIL;
    public final int[] LLLIILIL;
    public final int[] LLLIL;
    public final int[] LLLILZ;
    public Method LLLILZJ;

    @Override // X.AbstractC1319300kR6
    public int getLayoutIntRes() {
        return R.layout.ibl;
    }

    public final void LJJ() {
        this.LLLIIIL++;
        if (this.LLLIIIIL.isFinished()) {
            return;
        }
        this.LLLIIIIL.forceFinished(true);
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.LLLF && this.LLLIIIIL.computeScrollOffset()) {
            postOnAnimation(new ARunnableS7S0102000_20(this.LLLIIIL, this, this.LLLIIIIL.getCurrY() - getMAppBarLayout().getTopAndBottomOffset(), 4));
            postInvalidateOnAnimation();
        }
        super.computeScroll();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.LLLF ? this.LLLII.LJIIIIZZ(0) : super.hasNestedScrollingParent();
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.LLLII.LIZLLL;
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        if (this.LLLF) {
            stopNestedScroll(0);
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        return super.performClick();
    }

    public final LynxFoldViewNG getMFoldview() {
        return this.LLJLLL;
    }

    public final boolean LJIJJLI(MotionEvent motionEvent) {
        Boolean bool;
        if (!this.LLJLLL.isEnableNewGesture() || (bool = this.LLLFZ) == null || bool.booleanValue() || (motionEvent != null && motionEvent.getActionMasked() == 0)) {
            return false;
        }
        return true;
    }

    public final int LJIL(int i) {
        C16G1 c16g1;
        C16GU c16gu;
        ViewGroup.LayoutParams layoutParams = getMAppBarLayout().getLayoutParams();
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
        int iLJ = C13LZ.LJ(topAndBottomOffset - i, -getMAppBarLayout().getTotalScrollRange(), 0);
        if (iLJ == topAndBottomOffset) {
            return 0;
        }
        c16gu.setTopAndBottomOffset(iLJ);
        try {
            if (this.LLLILZJ == null) {
                Method declaredMethod = getMAppBarLayout().getClass().getSuperclass().getSuperclass().getDeclaredMethod("dispatchOffsetUpdates", Integer.TYPE);
                this.LLLILZJ = declaredMethod;
                if (declaredMethod != null) {
                    declaredMethod.setAccessible(true);
                }
            }
            Method method = this.LLLILZJ;
            if (method != null) {
                method.invoke(getMAppBarLayout(), Integer.valueOf(getMAppBarLayout().getTopAndBottomOffset()));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dispatchOffsetUpdate fail, offset is");
            sbLIZ.append(getMAppBarLayout().getTopAndBottomOffset());
            LynxLog.e("FoldViewLayoutNG", C2188811AlT.LIZIZ(sbLIZ));
            this.LLLILZJ = null;
        }
        return topAndBottomOffset - iLJ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.LLJLLL.isEnableNewGesture()) {
            Boolean bool = this.LLLFZ;
            if (bool != null && Intrinsics.LJFF(bool, Boolean.FALSE)) {
                return true;
            }
            if (this.LLLFZ != null && !this.LLLFFI) {
                if (motionEvent != null) {
                    motionEvent.setAction(0);
                }
                this.LLLFFI = true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // X.C16G0, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        if ((this.LLJLLL.isEnableNewGesture() && !this.LLJLLL.mIncludeNativeGesture) || LJIJJLI(motionEvent)) {
            return false;
        }
        if (this.LLJLLL.isEnableNewGesture() && this.LLLI != null && this.LLLI.booleanValue()) {
            return this.LLLI.booleanValue();
        }
        this.LLL = false;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (numValueOf.intValue() == 0) {
                this.LLJZ = motionEvent.getX();
                this.LLJZIJLIL = motionEvent.getY();
                LJJ();
                if (this.LLLF) {
                    this.LLLIIL = (int) (motionEvent.getY() + 0.5f);
                    startNestedScroll(2, 0);
                }
            } else if (numValueOf.intValue() == 1) {
                this.LLJZ = motionEvent.getX();
                this.LLJZIJLIL = motionEvent.getY();
            } else if (numValueOf.intValue() == 2 && !getMScrollEnable()) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.LLJZ) >= Math.abs(y - this.LLJZIJLIL)) {
                    this.LLJZ = x;
                    this.LLJZIJLIL = y;
                    this.LLL = false;
                } else {
                    this.LLL = true;
                }
            }
        }
        if (!getMScrollEnable()) {
            return this.LLL;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // X.C16G0, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean zOnTouchEvent;
        float yVelocity;
        if (LJIJJLI(motionEvent)) {
            return false;
        }
        if (this.LLJLLL.isEnableNewGesture() && this.LLLI != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && motionEvent != null) {
            if (motionEvent.getActionMasked() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            } else {
                if (motionEvent.getActionMasked() == 2) {
                    getParent().requestDisallowInterceptTouchEvent(this.LLL);
                    boolean zBooleanValue = this.LLLI.booleanValue();
                    if (!this.LLLI.booleanValue()) {
                        return super.onTouchEvent(motionEvent);
                    }
                    return zBooleanValue;
                }
                if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
                    this.LLLI = null;
                }
            }
        }
        if (!getMScrollEnable()) {
            return false;
        }
        if (!this.LLLF) {
            zOnTouchEvent = super.onTouchEvent(motionEvent);
        } else {
            zOnTouchEvent = true;
        }
        if (motionEvent == null) {
            return true;
        }
        if (this.LLLF) {
            if (this.LLLIIII == null) {
                this.LLLIIII = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker = this.LLLIIII;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
        int y = (int) (motionEvent.getY() + 0.5f);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3 && this.LLLF) {
                        stopNestedScroll(0);
                        VelocityTracker velocityTracker2 = this.LLLIIII;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                        }
                        this.LLLIIII = null;
                    }
                } else {
                    int i = this.LLLIIL - y;
                    if (!this.LLLFF && Math.abs(i) > ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                        this.LLLFF = true;
                        if (this.LLLF) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.LLLF && this.LLLFF) {
                        int i2 = i;
                        if (dispatchNestedPreScroll(0, i2, this.LLLIL, this.LLLIILIL, 0)) {
                            i2 -= this.LLLIL[1];
                            int[] iArr = this.LLLILZ;
                            int i3 = iArr[0];
                            int[] iArr2 = this.LLLIILIL;
                            iArr[0] = i3 + iArr2[0];
                            iArr[1] = iArr[1] + iArr2[1];
                        }
                        this.LLLIIL = y - this.LLLIILIL[1];
                        int iLJIL = LJIL(i2);
                        if (this.LLLII.LJFF(0, iLJIL, 0, i2 - iLJIL, this.LLLIILIL, 0)) {
                            int i4 = this.LLLIIL;
                            int[] iArr3 = this.LLLIILIL;
                            int i5 = iArr3[1];
                            this.LLLIIL = i4 - i5;
                            int[] iArr4 = this.LLLILZ;
                            iArr4[0] = iArr4[0] + iArr3[0];
                            iArr4[1] = iArr4[1] + i5;
                            return zOnTouchEvent;
                        }
                    }
                }
            } else {
                if (this.LLLF && this.LLLFF) {
                    VelocityTracker velocityTracker3 = this.LLLIIII;
                    if (velocityTracker3 != null) {
                        velocityTracker3.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT);
                    }
                    VelocityTracker velocityTracker4 = this.LLLIIII;
                    if (velocityTracker4 != null) {
                        yVelocity = velocityTracker4.getYVelocity();
                    } else {
                        yVelocity = 0.0f;
                    }
                    if (Math.abs(yVelocity) > ViewConfiguration.get(getContext()).getScaledMinimumFlingVelocity()) {
                        int topAndBottomOffset = getMAppBarLayout().getTopAndBottomOffset();
                        int totalScrollRange = getMAppBarLayout().getTotalScrollRange();
                        this.LLLIIIL++;
                        this.LLLIIIIL.fling(0, topAndBottomOffset, 0, (int) yVelocity, 0, 0, -totalScrollRange, 0);
                        postInvalidateOnAnimation();
                    }
                }
                if (!this.LLLFF) {
                    super.performClick();
                }
                if (this.LLLF) {
                    stopNestedScroll(0);
                    VelocityTracker velocityTracker5 = this.LLLIIII;
                    if (velocityTracker5 != null) {
                        velocityTracker5.recycle();
                    }
                    this.LLLIIII = null;
                    return zOnTouchEvent;
                }
            }
        } else {
            LJJ();
            this.LLLIIL = y;
            this.LLLFF = false;
            int[] iArr5 = this.LLLILZ;
            iArr5[0] = 0;
            iArr5[1] = 0;
            if (this.LLLF) {
                VelocityTracker velocityTracker6 = this.LLLIIII;
                if (velocityTracker6 == null) {
                    this.LLLIIII = VelocityTracker.obtain();
                } else {
                    velocityTracker6.clear();
                }
                startNestedScroll(2, 0);
                return zOnTouchEvent;
            }
        }
        return zOnTouchEvent;
    }

    public final void setNestedScrollAsChild(boolean z) {
        this.LLLF = z;
        setNestedScrollingEnabled(z);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.LLLII.LJIIIZ(z);
    }

    @Override // X.AbstractC1319300kR6
    public void setScrollEnable(boolean z) {
        setMScrollEnable(z);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        if (this.LLLF) {
            return startNestedScroll(i, 0);
        }
        return super.startNestedScroll(i);
    }

    @Override // X.InterfaceC20097013kG
    public final void stopNestedScroll(int i) {
        this.LLLII.LJIIJJI(i);
    }

    public C1319470kRN(Context context, LynxFoldViewNG lynxFoldViewNG) {
        new LinkedHashMap();
        super(context);
        this.LLJLLL = lynxFoldViewNG;
        this.LLLFFI = true;
        this.LLLII = new C1318260kPQ(this);
        this.LLLIIIIL = new OverScroller(context);
        this.LLLIILIL = new int[2];
        this.LLLIL = new int[2];
        this.LLLILZ = new int[2];
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        if (this.LLLF) {
            return this.LLLII.LIZIZ(f, f2);
        }
        return super.dispatchNestedPreFling(f, f2);
    }

    @Override // X.InterfaceC20097013kG
    public final boolean startNestedScroll(int i, int i2) {
        return this.LLLII.LJIIJ(i, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        if (this.LLLF) {
            return this.LLLII.LIZ(f, f2, z);
        }
        return super.dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        if (this.LLLF) {
            return dispatchNestedPreScroll(i, i2, iArr, iArr2, 0);
        }
        return super.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    @Override // X.C16G0, android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (this.LLLF) {
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
        if (!this.LLLF) {
            return zOnStartNestedScroll;
        }
        if (((i & 2) != 0 && startNestedScroll(i)) || zOnStartNestedScroll) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC20097013kG
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.LLLII.LIZLLL(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        if (this.LLLF) {
            return this.LLLII.LJFF(i, i2, i3, i4, iArr, 0);
        }
        return super.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    @Override // X.C16G0, X.InterfaceC1318370kPb
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (this.LLLF) {
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
        if (this.LLLF && getMAppBarLayout().getTopAndBottomOffset() == 0) {
            dispatchNestedScroll(i, i2, i3, i4, null);
        }
    }

    @Override // X.C16G0, X.InterfaceC1318370kPb
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        super.onNestedScroll(view, i, i2, i3, i4, i5);
        if (this.LLLF && getMAppBarLayout().getTopAndBottomOffset() == 0) {
            this.LLLII.LJFF(i, i2, i3, i4, null, i5);
        }
    }
}
