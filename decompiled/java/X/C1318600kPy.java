package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.ui.scroll.UIScrollView;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0kPy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1318600kPy extends C1318610kPz {
    public final /* synthetic */ C1318590kPx LLJJIJIIJIL;

    @Override // android.widget.HorizontalScrollView
    public final int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        if (!this.LLJJIJIIJIL.LLJZ) {
            return super.computeScrollDeltaToGetChildRectOnScreen(rect);
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.LLJJIJIIJIL.LLJJ.isEnableNewGesture()) {
            if (Boolean.FALSE.equals(this.LLJJIJIIJIL.LLJILJILJ)) {
                return true;
            }
            if (motionEvent.getActionMasked() == 2) {
                C1318590kPx c1318590kPx = this.LLJJIJIIJIL;
                if (c1318590kPx.LLJILJILJ != null && !c1318590kPx.LLJILJIL) {
                    motionEvent.setAction(0);
                    this.LLJJIJIIJIL.LLJILJIL = true;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // X.C1318610kPz, android.widget.HorizontalScrollView
    public final void fling(int i) {
        C1318590kPx c1318590kPx = this.LLJJIJIIJIL;
        if (c1318590kPx.LLLI == 1) {
            c1318590kPx.LJFF(2);
        }
        ArrayList<InterfaceC1318670kQ5> arrayList = this.LLJJIJIIJIL.LLJJJJLIIL;
        if (arrayList != null) {
            for (InterfaceC1318670kQ5 interfaceC1318670kQ5 : arrayList) {
                if (interfaceC1318670kQ5 != null) {
                    interfaceC1318670kQ5.LIZJ();
                }
            }
        }
        if (this.LLJJIJIIJIL.LLLFF && !this.LL) {
            try {
                Field declaredField = HorizontalScrollView.class.getDeclaredField("mScroller");
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                    OverScroller overScroller = (OverScroller) declaredField.get(this);
                    if (overScroller != null) {
                        if (getChildCount() > 0) {
                            int width = (getWidth() - getPaddingRight()) - getPaddingLeft();
                            overScroller.fling(getScrollX(), getScrollY(), i, 0, 0, Math.max(0, getChildAt(0).getWidth() - width), 0, 0, width / 2, 0);
                            postInvalidateOnAnimation();
                            return;
                        }
                        return;
                    }
                    throw new Exception("failed to get mScroller in HorizontalScrollView");
                }
                throw new Exception("can not find mScroller field in HorizontalScrollView");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LynxLog.w("AndroidScrollView", th.getMessage());
                super.fling(i);
                return;
            }
        }
        super.fling(i);
    }

    @Override // X.C1318610kPz, android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C1318590kPx c1318590kPx = this.LLJJIJIIJIL;
        if (!c1318590kPx.LLJJJ) {
            return false;
        }
        if (c1318590kPx.LLJIJIL) {
            return true;
        }
        if (c1318590kPx.LIZLLL(motionEvent) || this.LLJJIJIIJIL.LJ()) {
            return false;
        }
        C1318590kPx c1318590kPx2 = this.LLJJIJIIJIL;
        if (c1318590kPx2.LLJJ.isEnableNewGesture() && c1318590kPx2.LLJILLL != null && c1318590kPx2.LLJILLL.booleanValue()) {
            return this.LLJJIJIIJIL.LLJILLL.booleanValue();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // X.C1318610kPz, android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        C1318590kPx c1318590kPx = this.LLJJIJIIJIL;
        if (!c1318590kPx.LLJJJ || c1318590kPx.LLJI || c1318590kPx.LJ()) {
            return false;
        }
        C1318590kPx c1318590kPx2 = this.LLJJIJIIJIL;
        if (c1318590kPx2.LIZLLL(motionEvent)) {
            if (motionEvent.getActionMasked() == 1) {
                c1318590kPx2.LLJJJIL = false;
            }
            return false;
        }
        C1318590kPx c1318590kPx3 = this.LLJJIJIIJIL;
        if (c1318590kPx3.LLJJ.isEnableNewGesture() && c1318590kPx3.LLJILLL != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (motionEvent.getActionMasked() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            } else {
                if (motionEvent.getActionMasked() == 2) {
                    getParent().requestDisallowInterceptTouchEvent(this.LLJJIJIIJIL.LLJILLL.booleanValue());
                    boolean zBooleanValue = this.LLJJIJIIJIL.LLJILLL.booleanValue();
                    if (!this.LLJJIJIIJIL.LLJILLL.booleanValue()) {
                        return super.onTouchEvent(motionEvent);
                    }
                    return zBooleanValue;
                }
                if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
                    this.LLJJIJIIJIL.LLJILLL = null;
                }
            }
        }
        C1318590kPx c1318590kPx4 = this.LLJJIJIIJIL;
        if (motionEvent.getAction() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        c1318590kPx4.LLLFFI = z2;
        if (motionEvent.getAction() == 1) {
            C1318590kPx c1318590kPx5 = this.LLJJIJIIJIL;
            c1318590kPx5.LLJJJIL = false;
            c1318590kPx5.LLLFFI = false;
            c1318590kPx5.LLJJ.LJJJJIZL();
        } else if (motionEvent.getAction() == 0) {
            C1318590kPx c1318590kPx6 = this.LLJJIJIIJIL;
            c1318590kPx6.LLJJJIL = true;
            c1318590kPx6.LLJJ.LJJJJI(c1318590kPx6.LLLI);
        } else if (motionEvent.getAction() == 3) {
            this.LLJJIJIIJIL.LLLFFI = false;
        }
        try {
            try {
                return super.onTouchEvent(motionEvent);
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("CustomHorizontalScrollView onTouchEvent: ");
                sbLIZ.append(motionEvent.getAction());
                sbLIZ.append(", ");
                sbLIZ.append(e.getMessage());
                LynxLog.e("LynxUIScrollView", C2188811AlT.LIZIZ(sbLIZ));
                return false;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    @Override // X.C1318610kPz, android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        boolean zDispatchNestedPreFling = super.dispatchNestedPreFling(f, f2);
        if (zDispatchNestedPreFling) {
            this.LLJJIJIIJIL.LJIIIZ(4);
        }
        return zDispatchNestedPreFling;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1318600kPy(C1318590kPx c1318590kPx, Context context, UIScrollView uIScrollView) {
        super(context, uIScrollView);
        this.LLJJIJIIJIL = c1318590kPx;
    }

    @Override // X.C1318610kPz, android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        boolean zDispatchNestedFling = super.dispatchNestedFling(f, f2, z);
        if (zDispatchNestedFling) {
            this.LLJJIJIIJIL.LJIIIZ(4);
        }
        return zDispatchNestedFling;
    }

    @Override // X.C1318610kPz, android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        boolean zDispatchNestedPreScroll = super.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        if (zDispatchNestedPreScroll) {
            this.LLJJIJIIJIL.LJIIIZ(4);
        }
        return zDispatchNestedPreScroll;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C1318590kPx c1318590kPx = this.LLJJIJIIJIL;
        if (i == c1318590kPx.LLJJIJIL) {
            return;
        }
        c1318590kPx.LLJJIJIL = getScrollX();
        C1318590kPx c1318590kPx2 = this.LLJJIJIIJIL;
        if (c1318590kPx2.LLLI == 0) {
            c1318590kPx2.LJIIIIZZ();
        }
        ArrayList<InterfaceC1318670kQ5> arrayList = this.LLJJIJIIJIL.LLJJJJLIIL;
        if (arrayList != null) {
            for (InterfaceC1318670kQ5 interfaceC1318670kQ5 : arrayList) {
                if (interfaceC1318670kQ5 != null) {
                    interfaceC1318670kQ5.onScrollChanged(i, i2, i3, i4);
                }
            }
        }
        C1318590kPx c1318590kPx3 = this.LLJJIJIIJIL;
        if (!c1318590kPx3.LLJJJIL && !c1318590kPx3.LLJLLL) {
            c1318590kPx3.LLJJ.LJJJJIZL();
        }
    }

    @Override // X.C1318610kPz, X.InterfaceC20097013kG
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        boolean zDispatchNestedPreScroll = super.dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
        if (zDispatchNestedPreScroll) {
            this.LLJJIJIIJIL.LJIIIZ(4);
        }
        return zDispatchNestedPreScroll;
    }

    @Override // X.C1318610kPz, android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        boolean zDispatchNestedScroll = super.dispatchNestedScroll(i, i2, i3, i4, iArr);
        if (zDispatchNestedScroll) {
            this.LLJJIJIIJIL.LJIIIZ(4);
        }
        return zDispatchNestedScroll;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
        /*
            r5 = this;
            int r4 = r5.getScrollX()
            super.onLayout(r6, r7, r8, r9, r10)
            X.0kPx r0 = r5.LLJJIJIIJIL
            boolean r0 = r0.LLJJJ
            if (r0 != 0) goto Le
            return
        Le:
            int r0 = r5.getChildCount()
            r2 = 0
            if (r0 <= 0) goto L9b
            android.view.View r0 = r5.getChildAt(r2)
            int r1 = r0.getMeasuredWidth()
        L1d:
            int r9 = r9 - r7
            int r0 = r5.getPaddingLeft()
            int r9 = r9 - r0
            int r0 = r5.getPaddingRight()
            int r9 = r9 - r0
            int r1 = r1 - r9
            int r3 = java.lang.Math.max(r2, r1)
            X.0kPx r0 = r5.LLJJIJIIJIL
            boolean r0 = r0.LLLF
            r1 = 1
            if (r0 == 0) goto L68
            int r0 = r5.getLayoutDirection()
            if (r0 != r1) goto L66
            r0 = r3
        L3b:
            r5.setScrollX(r0)
            X.0kPx r1 = r5.LLJJIJIIJIL
            r1.LLLF = r2
            int r0 = r5.getScrollX()
            r1.LLJJIJIL = r0
        L48:
            X.0kPx r0 = r5.LLJJIJIIJIL
            r0.LLL = r3
            X.0kQ2 r0 = r5.LLJJIJI
            int r3 = r0.LJFF
            boolean r0 = r5.LLILLL
            if (r0 == 0) goto L65
            if (r3 <= 0) goto L65
            int r0 = r5.getScrollX()
            if (r3 == r0) goto L65
            X.0kPx r1 = r5.LLJJIJIIJIL
            int r0 = r5.getScrollY()
            r1.LJII(r3, r0, r2)
        L65:
            return
        L66:
            r0 = 0
            goto L3b
        L68:
            int r0 = r5.getLayoutDirection()
            if (r0 != r1) goto L48
            boolean r0 = r5.isLaidOut()
            if (r0 != 0) goto L88
            X.0kPx r1 = r5.LLJJIJIIJIL
            int r0 = r1.LLL
            if (r0 != r3) goto L88
            int r0 = r1.LLJJIJIL
            r5.setScrollX(r0)
        L7f:
            X.0kPx r1 = r5.LLJJIJIIJIL
            int r0 = r5.getScrollX()
            r1.LLJJIJIL = r0
            goto L48
        L88:
            X.0kPx r0 = r5.LLJJIJIIJIL
            int r0 = r0.LLL
            if (r0 == r3) goto L7f
            if (r0 < 0) goto L7f
            int r0 = r3 - r0
            int r4 = r4 + r0
            int r0 = X.C419990GdR.LIZIZ(r4, r2, r3)
            r5.setScrollX(r0)
            goto L7f
        L9b:
            r1 = 0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1318600kPy.onLayout(boolean, int, int, int, int):void");
    }

    @Override // X.C1318610kPz
    public final boolean LIZ(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        boolean zLIZ = super.LIZ(i, i2, i3, i4, iArr, i5);
        if (zLIZ) {
            this.LLJJIJIIJIL.LJIIIZ(4);
        }
        return zLIZ;
    }
}
