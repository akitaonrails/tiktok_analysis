package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import u4.q0;

/* JADX INFO: renamed from: X.0kRW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1319560kRW extends C16G0 implements InterfaceC20097013kG {
    public Function0<Unit> LLJJL;
    public Function0<Unit> LLJJLIIIJLLLLLLLZ;
    public C1318260kPQ LLJL;
    public InterfaceC1631620sYq<? super View, ? super Float, ? super Float, Boolean> LLJLIL;
    public boolean LLJLILLLLZIIL;

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        C1318260kPQ c1318260kPQ = this.LLJL;
        if (c1318260kPQ == null) {
            c1318260kPQ = null;
        }
        return c1318260kPQ.LIZLLL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Function0<Unit> function0;
        if (motionEvent != null && motionEvent.getAction() == 0 && (function0 = this.LLJJLIIIJLLLLLLLZ) != null) {
            function0.invoke();
        }
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (motionEvent != null && motionEvent.getActionMasked() == 0 && zDispatchTouchEvent && this.LLJLILLLLZIIL) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return zDispatchTouchEvent;
    }

    public final void setActionDownCallBack(Function0<Unit> function0) {
        this.LLJJLIIIJLLLLLLLZ = function0;
    }

    public final void setIsIntercept(boolean z) {
        this.LLJLILLLLZIIL = z;
    }

    public final void setNeedInterceptScroll(InterfaceC1631620sYq<? super View, ? super Float, ? super Float, Boolean> interfaceC1631620sYq) {
        this.LLJLIL = interfaceC1631620sYq;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C1318260kPQ c1318260kPQ = this.LLJL;
        if (c1318260kPQ == null) {
            c1318260kPQ = null;
        }
        c1318260kPQ.LJIIIZ(z);
    }

    public final void setStopScrollAction(Function0<Unit> function0) {
        this.LLJJL = function0;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        C1318260kPQ c1318260kPQ = this.LLJL;
        if (c1318260kPQ == null) {
            c1318260kPQ = null;
        }
        return c1318260kPQ.LJIIJ(i, 0);
    }

    @Override // X.InterfaceC20097013kG
    public final void stopNestedScroll(int i) {
        C1318260kPQ c1318260kPQ = this.LLJL;
        if (c1318260kPQ == null) {
            c1318260kPQ = null;
        }
        c1318260kPQ.LJIIJJI(i);
    }

    public C1319560kRW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C1318260kPQ c1318260kPQ = new C1318260kPQ(this);
        this.LLJL = c1318260kPQ;
        c1318260kPQ.LJIIIZ(true);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        C1318260kPQ c1318260kPQ = this.LLJL;
        if (c1318260kPQ == null) {
            c1318260kPQ = null;
        }
        return c1318260kPQ.LIZIZ(f, f2);
    }

    @Override // X.C16G0, X.InterfaceC1318370kPb
    public final void onStopNestedScroll(View view, int i) {
        Function0<Unit> function0;
        super.onStopNestedScroll(view, i);
        if ((view instanceof C21578619ce) && (function0 = this.LLJJL) != null) {
            function0.invoke();
        }
        stopNestedScroll(i);
    }

    @Override // X.InterfaceC20097013kG
    public final boolean startNestedScroll(int i, int i2) {
        C1318260kPQ c1318260kPQ = this.LLJL;
        if (c1318260kPQ == null) {
            c1318260kPQ = null;
        }
        return c1318260kPQ.LJIIJ(i, i2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        C1318260kPQ c1318260kPQ = this.LLJL;
        if (c1318260kPQ == null) {
            c1318260kPQ = null;
        }
        return c1318260kPQ.LIZ(f, f2, z);
    }

    @Override // X.C16G0, android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        boolean zOnNestedPreFling = super.onNestedPreFling(view, f, f2);
        InterfaceC1631620sYq<? super View, ? super Float, ? super Float, Boolean> interfaceC1631620sYq = this.LLJLIL;
        if (((interfaceC1631620sYq == null || !interfaceC1631620sYq.invoke(view, Float.valueOf(f), Float.valueOf(f2)).booleanValue()) && dispatchNestedPreFling(f, f2)) || zOnNestedPreFling) {
            return true;
        }
        return false;
    }

    @Override // X.C16G0, android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        boolean zOnNestedFling = super.onNestedFling(view, f, f2, z);
        InterfaceC1631620sYq<? super View, ? super Float, ? super Float, Boolean> interfaceC1631620sYq = this.LLJLIL;
        if (((interfaceC1631620sYq == null || !interfaceC1631620sYq.invoke(view, Float.valueOf(f), Float.valueOf(f2)).booleanValue()) && dispatchNestedFling(f, f2, z)) || zOnNestedFling) {
            return true;
        }
        return false;
    }

    @Override // X.C16G0, android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        int[] iArr2 = new int[2];
        InterfaceC1631620sYq<? super View, ? super Float, ? super Float, Boolean> interfaceC1631620sYq = this.LLJLIL;
        if (interfaceC1631620sYq == null || !interfaceC1631620sYq.invoke(view, Float.valueOf(i), Float.valueOf(i2)).booleanValue()) {
            dispatchNestedPreScroll(i, i2, iArr2, null);
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
            iArr2[0] = 0;
            iArr2[1] = 0;
        }
        super.onNestedPreScroll(view, i - iArr[0], i2 - iArr[1], iArr2);
        iArr[0] = iArr[0] + iArr2[0];
        iArr[1] = iArr[1] + iArr2[1];
    }

    @Override // X.C16G0, X.InterfaceC1318370kPb
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            stopNestedScroll(1);
            q0.LJJIII(1, view);
        }
        boolean zOnStartNestedScroll = super.onStartNestedScroll(view, view2, i, i2);
        if (startNestedScroll(i, i2) || zOnStartNestedScroll) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC20097013kG
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        C1318260kPQ c1318260kPQ = this.LLJL;
        if (c1318260kPQ == null) {
            c1318260kPQ = null;
        }
        return c1318260kPQ.LIZLLL(i, i2, iArr, null, i3);
    }

    @Override // X.C16G0, X.InterfaceC1318370kPb
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        int[] iArr2 = new int[2];
        InterfaceC1631620sYq<? super View, ? super Float, ? super Float, Boolean> interfaceC1631620sYq = this.LLJLIL;
        if (interfaceC1631620sYq == null || !interfaceC1631620sYq.invoke(view, Float.valueOf(i), Float.valueOf(i2)).booleanValue()) {
            dispatchNestedPreScroll(i, i2, iArr2, null, i3);
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
            iArr2[0] = 0;
            iArr2[1] = 0;
        }
        super.onNestedPreScroll(view, i - iArr[0], i2 - iArr[1], iArr2, i3);
        iArr[0] = iArr[0] + iArr2[0];
        iArr[1] = iArr[1] + iArr2[1];
    }

    @Override // X.C16G0, android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int[] iArr = {i, i};
        view.getLocationInWindow(iArr);
        int i5 = iArr[0];
        int i6 = iArr[1];
        super.onNestedScroll(view, i, i2, i3, i4);
        view.getLocationInWindow(iArr);
        int i7 = iArr[0] - i5;
        int i8 = iArr[1] - i6;
        dispatchNestedScroll(i, i2, i3 + i7, i4 + i8, null);
    }

    @Override // X.C16G0, X.InterfaceC1318370kPb
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        int[] iArr = {i, i};
        view.getLocationInWindow(iArr);
        int i6 = iArr[0];
        int i7 = iArr[1];
        super.onNestedScroll(view, i, i2, i3, i4, i5);
        view.getLocationInWindow(iArr);
        int i8 = iArr[0] - i6;
        int i9 = iArr[1] - i7;
        int i10 = i3 + i8;
        int i11 = i4 + i9;
        C1318260kPQ c1318260kPQ = this.LLJL;
        if (c1318260kPQ == null) {
            c1318260kPQ = null;
        }
        c1318260kPQ.LJFF(i, i2, i10, i11, null, i5);
    }
}
