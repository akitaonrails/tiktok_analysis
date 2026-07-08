package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0kwF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1338610kwF extends FrameLayout implements InterfaceC1338650kwJ, InterfaceC1354050lL9 {
    public final int LL;
    public int LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public final int[] LLILZIL;
    public final int[] LLILZLL;
    public boolean LLIZ;
    public final C1318260kPQ LLIZLLLIL;
    public InterfaceC1318530kPr LLJ;
    public final C1338620kwG LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;

    private final RecyclerView getScrollingView() {
        return null;
    }

    public final void setGetScrollingView(InterfaceC1338640kwI interfaceC1338640kwI) {
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.LLIZLLLIL.LJIIIIZZ(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.LLIZLLLIL.LIZLLL;
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.LLIZLLLIL.LJIIJJI(0);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        RecyclerView scrollingView;
        if (getScrollingView() == null || (scrollingView = getScrollingView()) == null) {
            return 0;
        }
        scrollingView.computeHorizontalScrollExtent();
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        RecyclerView scrollingView;
        if (getScrollingView() == null || (scrollingView = getScrollingView()) == null) {
            return 0;
        }
        scrollingView.computeHorizontalScrollOffset();
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        RecyclerView scrollingView;
        if (getScrollingView() == null || (scrollingView = getScrollingView()) == null) {
            return 0;
        }
        scrollingView.computeHorizontalScrollRange();
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        RecyclerView scrollingView;
        if (getScrollingView() == null || (scrollingView = getScrollingView()) == null) {
            return 0;
        }
        scrollingView.computeVerticalScrollExtent();
        return 0;
    }

    @Override // android.view.View, X.InterfaceC1354050lL9
    public final int computeVerticalScrollOffset() {
        RecyclerView scrollingView;
        if (getScrollingView() == null || (scrollingView = getScrollingView()) == null) {
            return 0;
        }
        scrollingView.computeVerticalScrollOffset();
        return 0;
    }

    @Override // android.view.View, X.InterfaceC1354050lL9
    public final int computeVerticalScrollRange() {
        RecyclerView scrollingView;
        if (getScrollingView() == null || (scrollingView = getScrollingView()) == null) {
            return 0;
        }
        scrollingView.computeVerticalScrollRange();
        return 0;
    }

    public final InterfaceC1338660kwK getiDispatchNestedPreFling() {
        return this.LLJI;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r2 = r7.getActionMasked()
            r5 = 1
            r1 = 0
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L2e
            r0 = 2
            if (r2 == r0) goto L15
            r0 = 3
            if (r2 == r0) goto L2e
        L10:
            boolean r0 = super.dispatchTouchEvent(r7)
            return r0
        L15:
            int r0 = r6.LLILLJJLI
            float r1 = LIZ(r7, r0)
            float r0 = r6.LLILLL
            float r0 = r0 - r1
            int r0 = (int) r0
            double r0 = (double) r0
            double r3 = java.lang.Math.abs(r0)
            int r0 = r6.LL
            double r1 = (double) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L10
            r6.LLJIJIL = r5
            goto L10
        L2e:
            boolean r0 = r6.LLJIJIL
            if (r0 == 0) goto L39
            boolean r0 = r6.LLJILJIL
            if (r0 == 0) goto L39
            r6.stopNestedScroll()
        L39:
            r6.LLJIJIL = r1
            r6.LLJILJIL = r1
            goto L10
        L3e:
            r6.LLJIJIL = r1
            int r0 = r7.getPointerId(r1)
            r6.LLILLJJLI = r0
            float r0 = LIZ(r7, r0)
            r6.LLILLL = r0
            r6.LLJILJIL = r1
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1338610kwF.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        if (r5 != 3) goto L9;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1338610kwF.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.LLIZLLLIL.LJIIIZ(z);
    }

    public final void setNestedScrollingParent(InterfaceC1318530kPr interfaceC1318530kPr) {
        this.LLJ = interfaceC1318530kPr;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.LLIZLLLIL.LJIIJ(i, 0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0kwG] */
    public C1338610kwF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLJJLI = -1;
        this.LLILZIL = new int[2];
        this.LLILZLL = new int[2];
        this.LLIZLLLIL = new C1318260kPQ(this);
        this.LLJI = new InterfaceC1338660kwK() { // from class: X.0kwG
        };
        setNestedScrollingEnabled(true);
        this.LL = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public static float LIZ(MotionEvent motionEvent, int i) {
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex < 0) {
            return -1.0f;
        }
        return motionEvent.getY(iFindPointerIndex);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        ViewGroup viewGroup;
        Object obj = this.LLJ;
        if ((obj instanceof ViewGroup) && (viewGroup = (ViewGroup) obj) != null) {
            return C1318330kPX.LIZIZ(viewGroup, this, f, f2);
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.LLIZLLLIL.LIZ(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.LLIZLLLIL.LIZJ(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.LLIZLLLIL.LJ(i, i2, i3, i4, iArr);
    }
}
