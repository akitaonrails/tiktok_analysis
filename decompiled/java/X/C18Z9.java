package X;

import Y.AsS57S0100000_32;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AwS0S0110002_13;
import kotlin.jvm.internal.AwS12S0100002_13;
import kotlin.jvm.internal.AwS131S0110000_13;
import kotlin.jvm.internal.AwS153S0101000_13;
import kotlin.jvm.internal.AwS22S0002000_13;
import kotlin.jvm.internal.AwS33S0202000_32;
import kotlin.jvm.internal.AwS3S0212000_32;
import kotlin.jvm.internal.AwS46S0102000_32;
import kotlin.jvm.internal.AwS4S0103000_32;
import kotlin.jvm.internal.AwS4S0203000_13;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS56S0010000_13;
import kotlin.jvm.internal.AwS6S0203000_32;

/* JADX INFO: renamed from: X.18Z9, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18Z9 extends ViewOnAttachStateChangeListenerC20604515jv implements InterfaceC1318370kPb, InterfaceC1318440kPi {
    public RecyclerView LLILZ;
    public MotionEvent LLILZIL;
    public Set<AbstractC1585810rMx> LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public int LLJ;
    public int LLJI;

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void stopScroll() {
        super.stopScroll();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void addOnScrollListener(AbstractC1585810rMx abstractC1585810rMx) {
        if (this.LLILZLL == null) {
            this.LLILZLL = new LinkedHashSet();
        }
        Set<AbstractC1585810rMx> set = this.LLILZLL;
        if (set != null) {
            set.add(abstractC1585810rMx);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean zDispatchTouchEvent;
        if (motionEvent != null && motionEvent.getAction() == 1) {
            z = true;
        } else {
            z = false;
        }
        View viewFindChildViewUnder = null;
        if (z || (motionEvent != null && motionEvent.getAction() == 3)) {
            this.LLILZIL = null;
        }
        try {
            zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zDispatchTouchEvent = false;
        }
        new AwS56S0010000_13(zDispatchTouchEvent, 4);
        if (motionEvent != null) {
            viewFindChildViewUnder = findChildViewUnder(motionEvent.getX(), motionEvent.getY());
        }
        if ((viewFindChildViewUnder instanceof C338990DQr) && zDispatchTouchEvent) {
            return false;
        }
        new AwS131S0110000_13(motionEvent, zDispatchTouchEvent, 1);
        return zDispatchTouchEvent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r7 <= r1) goto L22;
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
            r3 = 2
            r8 = 0
            if (r0 == 0) goto L25
            if (r0 != r3) goto L3b
            float r1 = r10.getX()
            float r0 = r9.LLIZ
            float r1 = r1 - r0
            float r2 = java.lang.Math.abs(r1)
            float r1 = r10.getY()
            float r0 = r9.LLIZLLLIL
            float r1 = r1 - r0
            float r0 = java.lang.Math.abs(r1)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L3b
            return r8
        L25:
            androidx.recyclerview.widget.RecyclerView r0 = r9.LLILZ
            if (r0 == 0) goto L2c
            r0.stopScroll()
        L2c:
            r9.stopScroll()
            float r0 = r10.getX()
            r9.LLIZ = r0
            float r0 = r10.getY()
            r9.LLIZLLLIL = r0
        L3b:
            android.view.MotionEvent r0 = r9.LLILZIL
            if (r0 != 0) goto L6b
            float r0 = r10.getRawX()
            int r7 = (int) r0
            float r0 = r10.getRawY()
            int r6 = (int) r0
            androidx.recyclerview.widget.RecyclerView r5 = r9.LLILZ
            r4 = 1
            if (r5 == 0) goto L71
            int[] r0 = new int[r3]
            r5.getLocationOnScreen(r0)
            r3 = r0[r8]
            r2 = r0[r4]
            int r1 = r5.getMeasuredWidth()
            int r1 = r1 + r3
            int r0 = r5.getMeasuredHeight()
            int r0 = r0 + r2
            if (r2 == 0) goto L71
            if (r2 > r6) goto L71
            if (r6 > r0) goto L71
            if (r3 > r7) goto L71
            if (r7 > r1) goto L71
        L6b:
            r9.LLILZIL = r10
            super.onInterceptTouchEvent(r10)
            return r8
        L71:
            int r0 = r10.getAction()
            if (r0 == r4) goto L7e
            int r1 = r10.getAction()
            r0 = 3
            if (r1 != r0) goto L81
        L7e:
            r0 = 0
            r9.LLILZIL = r0
        L81:
            boolean r2 = super.onInterceptTouchEvent(r10)
            kotlin.jvm.internal.AwS56S0010000_13 r1 = new kotlin.jvm.internal.AwS56S0010000_13
            r0 = 5
            r1.<init>(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18Z9.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setScrollDy(int i) {
        Set<AbstractC1585810rMx> set = this.LLILZLL;
        if (set != null) {
            Iterator<AbstractC1585810rMx> it2 = set.iterator();
            while (it2.hasNext()) {
                it2.next().LJJIIZI(this, 0, i);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, X.InterfaceC20097013kG
    public final void stopNestedScroll(int i) {
        super.stopNestedScroll(i);
    }

    public C18Z9(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LJJIFFI(int i, boolean z) {
        if (z) {
            if (i == 0 && this.LLJI == 2) {
                return;
            }
        } else {
            this.LLJI = i;
        }
        if (this.LLJ == i) {
            return;
        }
        this.LLJ = i;
        Set<AbstractC1585810rMx> set = this.LLILZLL;
        if (set != null) {
            Iterator<AbstractC1585810rMx> it2 = set.iterator();
            while (it2.hasNext()) {
                it2.next().LJJIIJ(this, i);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean fling(int i, int i2) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView.LayoutManager layoutManager;
        new AwS22S0002000_13(i, i2, 3);
        if (i2 > 0 && (recyclerView = this.LLILZ) != null && recyclerView.getChildCount() > 0 && (recyclerView2 = this.LLILZ) != null && recyclerView2.isAttachedToWindow() && (layoutManager = getLayoutManager()) != null && layoutManager.canScrollVertically()) {
            RecyclerView recyclerView3 = this.LLILZ;
            if (recyclerView3 != null) {
                return recyclerView3.fling(i, i2);
            }
            return super.fling(i, i2);
        }
        return super.fling(i, i2);
    }

    @Override // X.InterfaceC1318370kPb
    public final void onStopNestedScroll(View view, int i) {
        new AwS153S0101000_13(i, view, 2);
    }

    public C18Z9(Context context, AttributeSet attributeSet, int i) {
        AbstractC21674919sB abstractC21674919sB;
        super(context, attributeSet, i);
        super.addOnScrollListener(new AsS57S0100000_32(this, 0));
        AbstractC21673719rz itemAnimator = getItemAnimator();
        if ((itemAnimator instanceof AbstractC21674919sB) && (abstractC21674919sB = (AbstractC21674919sB) itemAnimator) != null) {
            abstractC21674919sB.LLIZ = false;
        }
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }

    public final void LJJI(int i, View view, int[] iArr) {
        if (i != 0 && iArr[1] != i) {
            if (i < 0) {
                if (view == null || view.canScrollVertically(-1)) {
                    return;
                }
            } else if (!canScrollVertically(1)) {
                return;
            }
            int iComputeVerticalScrollOffset = computeVerticalScrollOffset();
            int iComputeVerticalScrollRange = computeVerticalScrollRange() - computeVerticalScrollExtent();
            new AwS4S0103000_32(i, iComputeVerticalScrollOffset, iComputeVerticalScrollRange, iArr, 0);
            C118300cf c118300cf = new C118300cf();
            c118300cf.element = i - iArr[1];
            int i2 = i + iComputeVerticalScrollOffset;
            if (i2 < 0) {
                c118300cf.element = -iComputeVerticalScrollOffset;
                new AwS548S0100000_4(c118300cf, 13);
            }
            if (i2 > iComputeVerticalScrollRange) {
                c118300cf.element = iComputeVerticalScrollRange - iComputeVerticalScrollOffset;
                new AwS548S0100000_4(c118300cf, 14);
            }
            nestedScrollBy(0, c118300cf.element);
            iArr[1] = iArr[1] + c118300cf.element;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        RecyclerView recyclerView;
        new AwS12S0100002_13(f, f2, view, 1);
        if (f2 >= 0.0f || ((recyclerView = this.LLILZ) != null && recyclerView.canScrollVertically(-1))) {
            return super.onNestedPreFling(view, f, f2);
        }
        fling((int) f, (int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        new AwS0S0110002_13(view, f, f2, z, 1);
        return super.onNestedFling(view, f, f2, z);
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        new AwS33S0202000_32(view, view2, i, i2, 2);
        onNestedScrollAccepted(view, view2, i);
    }

    @Override // X.InterfaceC1318370kPb
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        boolean z;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        new AwS3S0212000_32(i, i2, view, view2, z, 1);
        return z;
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        new AwS6S0203000_32(view, i, i2, iArr, i3, 1);
        LJJI(i2, view, iArr);
        new AwS46S0102000_32(i, i2, iArr, 4);
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // X.InterfaceC1318440kPi
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        LJJI(i4, view, iArr);
        new AwS4S0203000_13(view, i2, i4, iArr, i5, 1);
    }
}
