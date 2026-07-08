package X;

import Y.AsS57S0100000_32;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
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

/* JADX INFO: renamed from: X.18Z8, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18Z8 extends ViewOnAttachStateChangeListenerC20604515jv implements InterfaceC1318370kPb, InterfaceC1318440kPi {
    public MotionEvent LLILZ;
    public Set<AbstractC1585810rMx> LLILZIL;
    public final Scroller LLILZLL;
    public WeakReference<View> LLIZ;
    public int LLIZLLLIL;
    public final int[] LLJ;
    public VelocityTracker LLJI;
    public final float LLJIJIL;
    public final float LLJILJIL;
    public float LLJILJILJ;
    public float LLJILLL;
    public int LLJJ;
    public boolean LLJJI;
    public final List<Function0<Unit>> LLJJIII;

    public C18Z8(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public final void LJJIFFI() {
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        C1161970gLL.LIZIZ();
    }

    public final void LJJII() {
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        C1161970gLL.LIZIZ();
    }

    @Override // android.view.View
    public final void computeScroll() {
        Object c098200Yq;
        super.computeScroll();
        if (!this.LLILZLL.computeScrollOffset()) {
            if (this.LLIZ != null) {
                setScrollState(0);
                this.LLIZ = null;
                return;
            }
            return;
        }
        int currY = this.LLILZLL.getCurrY() - this.LLIZLLLIL;
        this.LLIZLLLIL = this.LLILZLL.getCurrY();
        WeakReference<View> weakReference = this.LLIZ;
        View view = weakReference != null ? weakReference.get() : null;
        int[] iArr = this.LLJ;
        iArr[1] = 0;
        LJJIII(currY, view, iArr);
        if (view != null) {
            int[] iArr2 = this.LLJ;
            int i = currY - iArr2[1];
            iArr2[1] = 0;
            try {
                view.scrollBy(0, i);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
        if (currY >= 0 ? !(currY <= 0 || view == null || view.canScrollVertically(1) || canScrollVertically(1)) : !(view == null || view.canScrollVertically(-1) || canScrollVertically(-1))) {
            if (this.LLIZ != null) {
                setScrollState(0);
                this.LLIZ = null;
            }
        }
        invalidate();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void stopScroll() {
        LJJII();
        super.stopScroll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setScrollState(int i) {
        boolean z;
        if (this.LLJJ == i) {
            return;
        }
        this.LLJJ = i;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        this.LLJJI = z;
        if (i == 0 && (!this.LLJJIII.isEmpty())) {
            ArrayList arrayList = new ArrayList(this.LLJJIII);
            ((ArrayList) this.LLJJIII).clear();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((Function0) it2.next()).invoke();
            }
        }
        Set<AbstractC1585810rMx> set = this.LLILZIL;
        if (set != null) {
            Iterator<AbstractC1585810rMx> it3 = set.iterator();
            while (it3.hasNext()) {
                it3.next().LJJIIJ(this, i);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void addOnScrollListener(AbstractC1585810rMx abstractC1585810rMx) {
        if (this.LLILZIL == null) {
            this.LLILZIL = new LinkedHashSet();
        }
        Set<AbstractC1585810rMx> set = this.LLILZIL;
        if (set != null) {
            set.add(abstractC1585810rMx);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float yVelocity;
        boolean zDispatchTouchEvent = false;
        if (motionEvent == null) {
            return false;
        }
        if (this.LLJI == null) {
            this.LLJI = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.LLJI;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                VelocityTracker velocityTracker2 = this.LLJI;
                if (velocityTracker2 != null) {
                    velocityTracker2.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT, this.LLJIJIL);
                }
                VelocityTracker velocityTracker3 = this.LLJI;
                if (velocityTracker3 != null) {
                    yVelocity = velocityTracker3.getYVelocity();
                } else {
                    yVelocity = 0.0f;
                }
                if (Math.abs(yVelocity) < this.LLJILJIL) {
                    setScrollState(0);
                }
                VelocityTracker velocityTracker4 = this.LLJI;
                if (velocityTracker4 != null) {
                    velocityTracker4.clear();
                }
                this.LLILZ = null;
            }
        } else {
            this.LLILZLL.abortAnimation();
            this.LLIZ = null;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.LLILZ = null;
        }
        try {
            zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        new AwS131S0110000_13(motionEvent, zDispatchTouchEvent, 0);
        LJJII();
        return zDispatchTouchEvent;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2 && Math.abs(motionEvent.getX() - this.LLJILJILJ) > Math.abs(motionEvent.getY() - this.LLJILLL)) {
                LJJIFFI();
                return false;
            }
        } else {
            this.LLILZLL.abortAnimation();
            this.LLIZ = null;
            stopScroll();
            this.LLJILJILJ = motionEvent.getX();
            this.LLJILLL = motionEvent.getY();
        }
        if (this.LLILZ == null) {
            motionEvent.getRawX();
            motionEvent.getRawY();
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.LLILZ = null;
            }
            boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            new AwS56S0010000_13(zOnInterceptTouchEvent, 0);
            LJJIFFI();
            return zOnInterceptTouchEvent;
        }
        this.LLILZ = motionEvent;
        super.onInterceptTouchEvent(motionEvent);
        LJJIFFI();
        return false;
    }

    public final void setScrollDy(int i) {
        Set<AbstractC1585810rMx> set = this.LLILZIL;
        if (set != null) {
            Iterator<AbstractC1585810rMx> it2 = set.iterator();
            while (it2.hasNext()) {
                it2.next().LJJIIZI(this, 0, i);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, X.InterfaceC20097013kG
    public final void stopNestedScroll(int i) {
        LJJII();
        super.stopNestedScroll(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean fling(int i, int i2) {
        new AwS22S0002000_13(i, i2, 0);
        LJJIFFI();
        return super.fling(i, i2);
    }

    @Override // X.InterfaceC1318370kPb
    public final void onStopNestedScroll(View view, int i) {
        new AwS153S0101000_13(i, view, 1);
        LJJIFFI();
    }

    public C18Z8(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZLL = new Scroller(context);
        this.LLJ = new int[2];
        this.LLJIJIL = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.LLJILJIL = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        setItemAnimator(null);
        super.addOnScrollListener(new AsS57S0100000_32(this, 9));
        this.LLJJIII = new ArrayList();
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }

    public final void LJJIII(int i, View view, int[] iArr) {
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
            new AwS4S0103000_32(i, iComputeVerticalScrollOffset, iComputeVerticalScrollRange, iArr, 1);
            C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
            C1161970gLL.LIZIZ();
            C118300cf c118300cf = new C118300cf();
            c118300cf.element = i - iArr[1];
            int i2 = i + iComputeVerticalScrollOffset;
            if (i2 < 0) {
                c118300cf.element = -iComputeVerticalScrollOffset;
                new AwS548S0100000_4(c118300cf, 505);
                LJJII();
            }
            if (i2 > iComputeVerticalScrollRange) {
                c118300cf.element = iComputeVerticalScrollRange - iComputeVerticalScrollOffset;
                new AwS548S0100000_4(c118300cf, 506);
                LJJII();
            }
            nestedScrollBy(0, c118300cf.element);
            iArr[1] = iArr[1] + c118300cf.element;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        new AwS12S0100002_13(f, f2, view, 0);
        LJJII();
        super.onNestedPreFling(view, f, f2);
        this.LLIZ = new WeakReference<>(view);
        this.LLILZLL.abortAnimation();
        this.LLILZLL.fling(0, getScrollY(), (int) f, (int) f2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        this.LLIZLLLIL = getScrollY();
        invalidate();
        setScrollState(2);
        return true;
    }

    public /* synthetic */ C18Z8(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        new AwS0S0110002_13(view, f, f2, z, 0);
        LJJII();
        return super.onNestedFling(view, f, f2, z);
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        new AwS33S0202000_32(view, view2, i, i2, 0);
        LJJIFFI();
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
        new AwS3S0212000_32(i, i2, view, view2, z, 0);
        LJJIFFI();
        return z;
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        new AwS6S0203000_32(view, i, i2, iArr, i3, 0);
        LJJIFFI();
        LJJIII(i2, view, iArr);
        new AwS46S0102000_32(i, i2, iArr, 0);
        LJJIFFI();
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        LJJIFFI();
    }

    @Override // X.InterfaceC1318440kPi
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        LJJIII(i4, view, iArr);
        new AwS4S0203000_13(view, i2, i4, iArr, i5, 0);
        LJJIFFI();
    }
}
