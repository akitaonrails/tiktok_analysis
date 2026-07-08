package X;

import Y.AsS50S0100000_24;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3ScrollSpeedConfig;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0rkc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1600480rkc extends C1582240rHC implements InterfaceC1318370kPb, InterfaceC1318440kPi {
    public RecyclerView LLIZLLLIL;
    public MotionEvent LLJ;
    public Set<AbstractC1585810rMx> LLJI;
    public float LLJIJIL;
    public float LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;

    @Override // X.InterfaceC1318370kPb
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // X.InterfaceC1318370kPb
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // X.InterfaceC1318370kPb
    public final void onStopNestedScroll(View view, int i) {
    }

    private final Set<AbstractC1585810rMx> getOrCreateScrollListenerSet() {
        Set<AbstractC1585810rMx> set = this.LLJI;
        if (set != null) {
            return set;
        }
        Set<AbstractC1585810rMx> copyOnWriteArraySet = ((FriendsV3ScrollSpeedConfig) C1582220rHA.LIZIZ.getValue()).enableScrollAwarePageCount ? new CopyOnWriteArraySet<>() : new LinkedHashSet<>();
        this.LLJI = copyOnWriteArraySet;
        return copyOnWriteArraySet;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void stopScroll() {
        RecyclerView recyclerView = this.LLIZLLLIL;
        if (recyclerView != null) {
            recyclerView.stopScroll();
        }
        super.stopScroll();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public int getScrollState() {
        return this.LLJILJILJ;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void addOnScrollListener(AbstractC1585810rMx abstractC1585810rMx) {
        getOrCreateScrollListenerSet().add(abstractC1585810rMx);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.LLJ = null;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        if (r6 <= (r2 + r3.getMeasuredWidth())) goto L24;
     */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            int r0 = r10.getAction()
            r5 = 2
            r8 = 0
            if (r0 == 0) goto L25
            if (r0 != r5) goto L3b
            float r1 = r10.getX()
            float r0 = r9.LLJIJIL
            float r1 = r1 - r0
            float r2 = java.lang.Math.abs(r1)
            float r1 = r10.getY()
            float r0 = r9.LLJILJIL
            float r1 = r1 - r0
            float r0 = java.lang.Math.abs(r1)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L3b
            return r8
        L25:
            androidx.recyclerview.widget.RecyclerView r0 = r9.LLIZLLLIL
            if (r0 == 0) goto L2c
            r0.stopScroll()
        L2c:
            r9.stopScroll()
            float r0 = r10.getX()
            r9.LLJIJIL = r0
            float r0 = r10.getY()
            r9.LLJILJIL = r0
        L3b:
            android.view.MotionEvent r0 = r9.LLJ
            r7 = 1
            if (r0 != 0) goto L6b
            float r0 = r10.getRawX()
            int r6 = (int) r0
            float r0 = r10.getRawY()
            int r4 = (int) r0
            androidx.recyclerview.widget.RecyclerView r3 = r9.LLIZLLLIL
            if (r3 == 0) goto L71
            int[] r0 = new int[r5]
            r3.getLocationOnScreen(r0)
            r2 = r0[r8]
            r1 = r0[r7]
            if (r1 == 0) goto L71
            if (r1 > r4) goto L71
            int r0 = r3.getMeasuredHeight()
            int r1 = r1 + r0
            if (r4 > r1) goto L71
            if (r2 > r6) goto L71
            int r0 = r3.getMeasuredWidth()
            int r2 = r2 + r0
            if (r6 > r2) goto L71
        L6b:
            r9.LLJ = r10
            super.onInterceptTouchEvent(r10)
            return r8
        L71:
            int r0 = r10.getAction()
            if (r0 == r7) goto L7e
            int r1 = r10.getAction()
            r0 = 3
            if (r1 != r0) goto L81
        L7e:
            r0 = 0
            r9.LLJ = r0
        L81:
            boolean r0 = super.onInterceptTouchEvent(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1600480rkc.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void removeOnScrollListener(AbstractC1585810rMx abstractC1585810rMx) {
        Set<AbstractC1585810rMx> set = this.LLJI;
        if (!((FriendsV3ScrollSpeedConfig) C1582220rHA.LIZIZ.getValue()).enableScrollAwarePageCount || set == null || !set.remove(abstractC1585810rMx)) {
            super.removeOnScrollListener(abstractC1585810rMx);
        }
    }

    public final void setScrollDy(int i) {
        Set<AbstractC1585810rMx> set = this.LLJI;
        if (set != null) {
            Iterator<AbstractC1585810rMx> it2 = set.iterator();
            while (it2.hasNext()) {
                it2.next().LJJIIZI(this, 0, i);
            }
        }
    }

    public C1600480rkc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0017 A[PHI: r0
      0x0017: PHI (r0v2 int) = (r0v1 int), (r0v1 int), (r0v8 int), (r0v8 int) binds: [B:8:0x000e, B:9:0x0010, B:11:0x0013, B:12:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIFFI(int r5, boolean r6) {
        /*
            r4 = this;
            if (r6 == 0) goto L1f
            r4.LLJJ = r5
        L4:
            androidx.recyclerview.widget.RecyclerView r0 = r4.LLIZLLLIL
            r3 = 0
            if (r0 == 0) goto L1d
            int r2 = r4.LLJJ
        Lb:
            int r1 = r4.LLJILLL
            r0 = 1
            if (r1 == r0) goto L17
            if (r2 == r0) goto L17
            r0 = 2
            if (r1 == r0) goto L17
            if (r2 != r0) goto L18
        L17:
            r3 = r0
        L18:
            int r0 = r4.LLJILJILJ
            if (r0 != r3) goto L22
            return
        L1d:
            r2 = 0
            goto Lb
        L1f:
            r4.LLJILLL = r5
            goto L4
        L22:
            r4.LLJILJILJ = r3
            java.util.Set<X.0rMx> r0 = r4.LLJI
            if (r0 == 0) goto L3c
            java.util.Iterator r1 = r0.iterator()
        L2c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r1.next()
            X.0rMx r0 = (X.AbstractC1585810rMx) r0
            r0.LJJIIJ(r4, r3)
            goto L2c
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1600480rkc.LJJIFFI(int, boolean):void");
    }

    @Override // X.C1582240rHC, androidx.recyclerview.widget.RecyclerView
    public final boolean fling(int i, int i2) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView.LayoutManager layoutManager;
        if (i2 > 0 && (recyclerView = this.LLIZLLLIL) != null && recyclerView.getChildCount() > 0 && (recyclerView2 = this.LLIZLLLIL) != null && recyclerView2.isAttachedToWindow() && (layoutManager = getLayoutManager()) != null && layoutManager.canScrollVertically()) {
            RecyclerView recyclerView3 = this.LLIZLLLIL;
            if (recyclerView3 != null) {
                return recyclerView3.fling(i, i2);
            }
            return super.fling(i, i2);
        }
        return super.fling(i, i2);
    }

    public C1600480rkc(Context context, AttributeSet attributeSet, int i) {
        AbstractC21674919sB abstractC21674919sB;
        super(context, attributeSet, i);
        super.addOnScrollListener(new AsS50S0100000_24(this, 7));
        AbstractC21673719rz itemAnimator = getItemAnimator();
        if ((itemAnimator instanceof AbstractC21674919sB) && (abstractC21674919sB = (AbstractC21674919sB) itemAnimator) != null) {
            abstractC21674919sB.LLIZ = false;
        }
        C14K9.LJIJI(this, true);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJI(int r8, android.view.View r9, int[] r10) {
        /*
            r7 = this;
            if (r8 == 0) goto L30
            r6 = 1
            r0 = r10[r6]
            if (r0 == r8) goto L30
            androidx.recyclerview.widget.RecyclerView r1 = r7.LLIZLLLIL
            r0 = -1
            if (r1 == 0) goto L50
            boolean r0 = r1.canScrollVertically(r0)
        L10:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L14:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r5 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            boolean r1 = r7.canScrollVertically(r6)
            int r4 = r7.computeVerticalScrollOffset()
            int r3 = r7.computeVerticalScrollRange()
            int r0 = r7.computeVerticalScrollExtent()
            int r3 = r3 - r0
            r2 = 0
            if (r8 >= 0) goto L31
            if (r5 == 0) goto L3b
        L30:
            return
        L31:
            if (r1 == 0) goto L30
            int r1 = r3 - r4
            int r0 = r7.computeVerticalScrollExtent()
            if (r1 == r0) goto L30
        L3b:
            r0 = r10[r6]
            int r1 = r8 - r0
            int r8 = r8 + r4
            if (r8 >= 0) goto L43
            int r1 = -r4
        L43:
            if (r8 <= r3) goto L47
            int r1 = r3 - r4
        L47:
            r7.nestedScrollBy(r2, r1)
            r0 = r10[r6]
            int r0 = r0 + r1
            r10[r6] = r0
            return
        L50:
            if (r9 == 0) goto L57
            boolean r0 = r9.canScrollVertically(r0)
            goto L10
        L57:
            r1 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1600480rkc.LJJI(int, android.view.View, int[]):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        boolean z;
        RecyclerView recyclerView = this.LLIZLLLIL;
        if (recyclerView != null && recyclerView.canScrollVertically(-1)) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !z;
        if (f2 < 0.0f && z2) {
            fling((int) f, (int) f2);
            return true;
        }
        return super.onNestedPreFling(view, f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return super.onNestedFling(view, f, f2, z);
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        onNestedScrollAccepted(view, view2, i);
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        LJJI(i2, view, iArr);
    }

    @Override // X.InterfaceC1318440kPi
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        LJJI(i4, view, iArr);
    }
}
