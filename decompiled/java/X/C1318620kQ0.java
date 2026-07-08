package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.ui.scroll.UIScrollView;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.0kQ0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1318620kQ0 extends ScrollView implements InterfaceC1318370kPb, InterfaceC20097013kG {
    public final C1317550kOH LL;
    public final C1318260kPQ LLILLJJLI;
    public final UIScrollView LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;
    public final int[] LLIZ;
    public OverScroller LLIZLLLIL;
    public final C1318640kQ2 LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;

    public void setPanInterceptAncestors(boolean z) {
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        stopNestedScroll(0);
    }

    @Override // android.widget.ScrollView, android.view.View
    public void computeScroll() {
        OverScroller vScroller;
        if (!this.LLILZ || (vScroller = getVScroller()) == null) {
            super.computeScroll();
            return;
        }
        if (!vScroller.computeScrollOffset()) {
            if (this.LLILLJJLI.LJIIIIZZ(1)) {
                stopNestedScroll(1);
            }
            this.LLILZLL = 0;
            C1318640kQ2 c1318640kQ2 = this.LLJ;
            if (c1318640kQ2 == null || !this.LLILZIL) {
                return;
            }
            c1318640kQ2.LIZ();
            return;
        }
        int currY = vScroller.getCurrY();
        int i = currY - this.LLILZLL;
        if (dispatchNestedPreScroll(0, i, this.LLIZ, null, 1)) {
            i -= this.LLIZ[1];
        }
        if (i != 0) {
            int iLJJIZ = this.LLILLL.LJJIZ();
            int scrollY = getScrollY();
            int i2 = scrollY + i;
            boolean z = i2 < 0 || i2 > iLJJIZ;
            int iLIZIZ = C419990GdR.LIZIZ(i2, 0, iLJJIZ);
            if (z && !this.LLILLJJLI.LJIIIIZZ(1)) {
                vScroller.springBack(0, iLIZIZ, 0, 0, 0, iLJJIZ);
            }
            super.scrollTo(getScrollX(), iLIZIZ);
            int scrollY2 = getScrollY() - scrollY;
            LIZ(0, scrollY2, 0, i - scrollY2, null, 1);
        }
        this.LLILZLL = currY;
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C1317550kOH c1317550kOH = this.LL;
        return c1317550kOH.LIZIZ | c1317550kOH.LIZ;
    }

    public OverScroller getVScroller() {
        OverScroller overScroller = this.LLIZLLLIL;
        if (overScroller != null) {
            return overScroller;
        }
        try {
            Field declaredField = ScrollView.class.getDeclaredField("mScroller");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                if (obj instanceof OverScroller) {
                    this.LLIZLLLIL = (OverScroller) obj;
                }
            }
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            LynxLog.e("LynxNestedScrollView", "Failed to get mScroller of ScrollView!");
        } catch (NoSuchFieldException e2) {
            TryCatchGuardChecker.doCheck(e2);
            LynxLog.e("LynxNestedScrollView", "Failed to get mScroller field of ScrollView!");
        }
        return this.LLIZLLLIL;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.LLILLJJLI.LJIIIIZZ(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.LLILLJJLI.LIZLLL;
    }

    @Override // android.widget.ScrollView
    public void fling(int i) {
        OverScroller vScroller;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fling with vel = ");
        sbLIZ.append(i);
        LynxLog.i("LynxNestedScrollView", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLILZ && (vScroller = getVScroller()) != null) {
            if (getChildCount() > 0) {
                startNestedScroll(2, 1);
                vScroller.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
                postInvalidateOnAnimation();
                this.LLILZLL = getScrollY();
                return;
            }
            return;
        }
        super.fling(i);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C1318640kQ2 c1318640kQ2;
        if (this.LLILZIL && (c1318640kQ2 = this.LLJ) != null) {
            return c1318640kQ2.LIZIZ();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C1318640kQ2 c1318640kQ2;
        if (this.LLILZIL && (c1318640kQ2 = this.LLJ) != null) {
            c1318640kQ2.getClass();
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setEnableNewBounce(boolean z) {
        this.LLILZIL = z;
    }

    public void setEnableNewNested(boolean z) {
        this.LLILZ = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.LLILLJJLI.LJIIIZ(z);
    }

    public void setPanInterceptDescendants(boolean z) {
        this.LLJIJIL = z;
    }

    public void setPanInterceptSelf(boolean z) {
        this.LLJI = z;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return startNestedScroll(i, 0);
    }

    @Override // X.InterfaceC20097013kG
    public final void stopNestedScroll(int i) {
        this.LLILLJJLI.LJIIJJI(i);
    }

    public C1318620kQ0(Context context, UIScrollView uIScrollView) {
        super(context);
        this.LLIZ = new int[2];
        this.LLILLL = uIScrollView;
        C1317550kOH c1317550kOH = new C1317550kOH();
        this.LL = c1317550kOH;
        this.LLILLJJLI = new C1318260kPQ(this);
        this.LLJ = new C1318640kQ2(this, true, c1317550kOH);
        setNestedScrollingEnabled(true);
    }

    public final void LIZIZ(int i, int i2) {
        if (this.LLILZ && getVScroller() != null) {
            this.LLILZLL = getScrollY();
        }
        super.smoothScrollTo(i, i2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.LLILLJJLI.LIZIZ(f, f2);
    }

    @Override // X.InterfaceC1318370kPb
    public final void onStopNestedScroll(View view, int i) {
        C1318640kQ2 c1318640kQ2;
        if (this.LLILZIL && (c1318640kQ2 = this.LLJ) != null) {
            c1318640kQ2.LJ(i);
        } else {
            this.LL.LIZIZ(i);
            stopNestedScroll(i);
        }
    }

    @Override // X.InterfaceC20097013kG
    public final boolean startNestedScroll(int i, int i2) {
        return this.LLILLJJLI.LJIIJ(i, i2);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.LLILLJJLI.LIZ(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        C1318640kQ2 c1318640kQ2;
        if (this.LLILZIL && (c1318640kQ2 = this.LLJ) != null) {
            c1318640kQ2.getClass();
            return false;
        }
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent, X.InterfaceC1318530kPr
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return dispatchNestedPreScroll(i, i2, iArr, iArr2, 0);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        C1318640kQ2 c1318640kQ2;
        boolean z2 = false;
        if (this.LLILZIL && (c1318640kQ2 = this.LLJ) != null) {
            c1318640kQ2.getClass();
            return false;
        }
        if (z) {
            return false;
        }
        int scrollY = getScrollY();
        int iLJJIZ = this.LLILLL.LJJIZ();
        if ((scrollY > 0 || f2 > 0.0f) && (scrollY < iLJJIZ || f2 < 0.0f)) {
            z2 = true;
        }
        if (!dispatchNestedPreFling(0.0f, f2)) {
            dispatchNestedFling(0.0f, f2, z2);
            fling((int) f2);
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
        if (this.LLILZIL && (c1318640kQ2 = this.LLJ) != null) {
            c1318640kQ2.LJI.LIZ(i, i2);
        } else {
            this.LL.LIZ(i, i2);
            startNestedScroll(2, i2);
        }
    }

    @Override // X.InterfaceC1318370kPb
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        C1318640kQ2 c1318640kQ2;
        int i3 = 2;
        if (this.LLILZIL && (c1318640kQ2 = this.LLJ) != null) {
            if (!c1318640kQ2.LIZ) {
                i3 = 1;
            }
            if ((i & i3) != 0) {
                return true;
            }
            return false;
        }
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.LLILLJJLI.LIZLLL(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return LIZ(i, i2, i3, i4, iArr, 0);
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        C1318640kQ2 c1318640kQ2;
        if (this.LLILZIL && (c1318640kQ2 = this.LLJ) != null) {
            c1318640kQ2.LIZJ(view, i, i2, iArr, i3);
        } else {
            dispatchNestedPreScroll(i, i2, iArr, null, i3);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    public boolean LIZ(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.LLILLJJLI.LJFF(i, i2, i3, i4, iArr, i5);
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        C1318640kQ2 c1318640kQ2;
        if (this.LLILZIL && (c1318640kQ2 = this.LLJ) != null) {
            c1318640kQ2.LIZLLL(i, i2, i3, i4, i5);
            return;
        }
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        LIZ(0, scrollY2, 0, i4 - scrollY2, null, i5);
    }
}
