package X;

import Y.AsS57S0100000_32;
import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18Z6, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18Z6 extends C1773640wFu {
    public final Scroller LLILZLL;
    public WeakReference<View> LLIZ;
    public final Map<String, WeakReference<RecyclerView>> LLIZLLLIL;
    public C20632315oP LLJ;
    public C18Z7 LLJI;
    public VelocityTracker LLJIJIL;
    public final float LLJILJIL;
    public final float LLJILJILJ;
    public final List<Function1<Integer, Unit>> LLJILLL;
    public final List<AbstractC1585810rMx> LLJJ;
    public final List<Function1<Float, Unit>> LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public final int[] LLJJIJIIJIL;
    public long LLJJIJIL;
    public MotionEvent LLJJJ;
    public int LLJJJIL;

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return i == 2;
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
        long jCurrentTimeMillis = System.currentTimeMillis();
        int currY = this.LLILZLL.getCurrY() - this.LLJJIII;
        int currX = this.LLILZLL.getCurrX() - this.LLJJIJI;
        this.LLJJIII = this.LLILZLL.getCurrY();
        this.LLJJIJI = this.LLILZLL.getCurrX();
        WeakReference<View> weakReference = this.LLIZ;
        View view = weakReference != null ? weakReference.get() : null;
        LJFF(currY, view, this.LLJJIJIIJIL);
        if (view != null) {
            int[] iArr = this.LLJJIJIIJIL;
            int i = currY - iArr[1];
            iArr[1] = 0;
            try {
                view.scrollBy(currX, i);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1768370w7P.LIZ(thM5exceptionOrNullimpl, EnumC1771210wBz.BODY_COMPUTE_SCROLL, thM5exceptionOrNullimpl.toString(), null);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
        if (!((ArrayList) this.LLJJI).isEmpty()) {
            long j = jCurrentTimeMillis - this.LLJJIJIL;
            this.LLJJIJIL = jCurrentTimeMillis;
            float fAbs = j > 0 ? Math.abs(currY / (j / 1000.0f)) : 0.0f;
            Iterator it2 = ((ArrayList) this.LLJJI).iterator();
            while (it2.hasNext()) {
                ((Function1) it2.next()).invoke(Float.valueOf(fAbs));
            }
        }
        if (currY >= 0 ? !(currY <= 0 || view == null || view.canScrollVertically(1) || canScrollVertically(1)) : !(view == null || view.canScrollVertically(-1) || canScrollVertically(-1))) {
            if (this.LLIZ != null) {
                setScrollState(0);
                this.LLIZ = null;
            }
        }
        invalidate();
    }

    public final Map<String, WeakReference<RecyclerView>> getChildRecyclerViews() {
        return this.LLIZLLLIL;
    }

    public final C18Z7 getOnBodyDrawListener() {
        return this.LLJI;
    }

    public final List<AbstractC1585810rMx> getPreScrollListeners() {
        return this.LLJJ;
    }

    public final C20632315oP getViewPager() {
        return this.LLJ;
    }

    public final MotionEvent getViewPagerMotionEvent() {
        return this.LLJJJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setScrollState(int i) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        if (this.LLJJJIL == i) {
            return;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isDebug()) {
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setScrollState = ");
            sbLIZ.append(i);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c599820Nfo.getClass();
            C599820Nfo.LIZ("scroll-santa", strLIZIZ);
        }
        this.LLJJJIL = i;
        Iterator it2 = ((ArrayList) this.LLJILLL).iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(Integer.valueOf(i));
        }
        Iterator it3 = ((ArrayList) this.LLJJ).iterator();
        while (it3.hasNext()) {
            ((AbstractC1585810rMx) it3.next()).LJJIIJ(this, i);
        }
    }

    public final void LJ(Function1<? super Integer, Unit> function1) {
        ((ArrayList) this.LLJILLL).add(function1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C18Z7 c18z7 = this.LLJI;
        if (c18z7 != null) {
            c18z7.LIZ();
        }
        super.dispatchDraw(canvas);
        C18Z7 c18z72 = this.LLJI;
        if (c18z72 != null) {
            c18z72.LIZIZ();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float yVelocity;
        if (motionEvent == null) {
            return false;
        }
        if (this.LLJIJIL == null) {
            this.LLJIJIL = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.LLJIJIL;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                VelocityTracker velocityTracker2 = this.LLJIJIL;
                if (velocityTracker2 != null) {
                    velocityTracker2.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT, this.LLJILJIL);
                }
                VelocityTracker velocityTracker3 = this.LLJIJIL;
                if (velocityTracker3 != null) {
                    yVelocity = velocityTracker3.getYVelocity();
                } else {
                    yVelocity = 0.0f;
                }
                if (Math.abs(yVelocity) < this.LLJILJILJ) {
                    setScrollState(0);
                }
                VelocityTracker velocityTracker4 = this.LLJIJIL;
                if (velocityTracker4 != null) {
                    velocityTracker4.clear();
                }
            }
        } else {
            this.LLILZLL.abortAnimation();
            this.LLIZ = null;
            this.LLJJJ = null;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r8 = super.onInterceptTouchEvent(r10)
            android.view.MotionEvent r0 = r9.LLJJJ
            r2 = 0
            if (r0 != 0) goto L36
            float r0 = r10.getRawX()
            int r7 = (int) r0
            float r0 = r10.getRawY()
            int r6 = (int) r0
            X.15oP r5 = r9.LLJ
            r4 = 2
            if (r5 == 0) goto L3a
            int[] r1 = new int[r4]
            r5.getLocationOnScreen(r1)
            r3 = r1[r2]
            r0 = 1
            r2 = r1[r0]
            int r1 = r5.getMeasuredWidth()
            int r1 = r1 + r3
            int r0 = r5.getMeasuredHeight()
            int r0 = r0 + r2
            if (r2 == 0) goto L3a
            if (r2 > r6) goto L3a
            if (r6 > r0) goto L3a
            if (r3 > r7) goto L3a
            if (r7 > r1) goto L3a
        L36:
            r9.LLJJJ = r10
        L38:
            r8 = 0
        L39:
            return r8
        L3a:
            int r0 = r10.getAction()
            if (r0 == r4) goto L39
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18Z6.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setOnBodyDrawListener(C18Z7 c18z7) {
        this.LLJI = c18z7;
    }

    public final void setViewPager(C20632315oP c20632315oP) {
        this.LLJ = c20632315oP;
    }

    public C18Z6(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C18Z6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZLL = new Scroller(context);
        this.LLIZLLLIL = new LinkedHashMap();
        this.LLJILLL = new ArrayList();
        this.LLJJ = new ArrayList();
        setItemAnimator(null);
        this.LLJILJIL = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.LLJILJILJ = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        addOnScrollListener(new AsS57S0100000_32(this, 10));
        this.LLJJI = new ArrayList();
        this.LLJJIJIIJIL = new int[2];
        this.LLJJIJIL = System.currentTimeMillis();
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }

    public final void LJFF(int i, View view, int[] iArr) {
        Float fValueOf;
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
            int i2 = i - iArr[1];
            int i3 = i + iComputeVerticalScrollOffset;
            if (i3 < 0) {
                i2 = -iComputeVerticalScrollOffset;
            }
            if (i3 > iComputeVerticalScrollRange) {
                i2 = iComputeVerticalScrollRange - iComputeVerticalScrollOffset;
                if (getStickyView() != null) {
                    View stickyView = getStickyView();
                    if (stickyView != null) {
                        fValueOf = Float.valueOf(stickyView.getTranslationY());
                    } else {
                        fValueOf = null;
                    }
                    if (Intrinsics.LIZLLL(fValueOf, 0.0f)) {
                        i2--;
                    }
                }
            }
            scrollBy(0, i2);
            iArr[1] = iArr[1] + i2;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        super.onNestedPreFling(view, f, f2);
        this.LLIZ = new WeakReference<>(view);
        this.LLILZLL.abortAnimation();
        this.LLILZLL.fling(0, getScrollY(), (int) f, (int) f2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        this.LLJJIII = getScrollY();
        this.LLJJIJI = 0;
        invalidate();
        setScrollState(2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        super.onNestedPreScroll(view, i, i2, iArr);
        setScrollState(1);
        LJFF(i2, view, iArr);
        Iterator<AbstractC1585810rMx> it2 = this.LLJJ.iterator();
        while (it2.hasNext()) {
            it2.next().LJJIIZI(this, i, i2);
        }
    }
}
