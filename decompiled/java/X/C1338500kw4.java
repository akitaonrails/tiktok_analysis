package X;

import Y.ARunnableS106S0100000_6;
import Y.ARunnableS31S0101000_20;
import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kw4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1338500kw4 extends AbstractC1086560eNi {
    public static final /* synthetic */ int LLJJJ = 0;
    public final int[] LLILZ;
    public int LLILZIL;
    public final Rect LLILZLL;
    public final Queue<ViewGroup> LLIZ;
    public AbstractC1338480kw2 LLIZLLLIL;
    public GestureDetector LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public final OverScroller LLJILLL;
    public RecyclerView LLJJ;
    public final C0IDM LLJJI;
    public float LLJJIII;
    public float LLJJIJI;
    public InterfaceC1338530kw7 LLJJIJIIJIL;
    public InterfaceC1338540kw8 LLJJIJIL;

    public final void LJJII() {
        RecyclerView recyclerView = this.LLJJ;
        if (recyclerView != null) {
            if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                recyclerView.scrollToPosition(0);
            } else {
                HandlerHook.viewPost(this, new ARunnableS106S0100000_6((Object) recyclerView, 49));
            }
        }
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.LLJILLL.computeScrollOffset()) {
            int currY = this.LLJILLL.getCurrY();
            int i = currY - this.LLILZIL;
            this.LLILZIL = currY;
            RecyclerView recyclerView = this.LLJJ;
            if (i > 0) {
                if (canScrollVertically(1)) {
                    scrollBy(0, i);
                } else if (recyclerView != null && recyclerView.canScrollVertically(1)) {
                    recyclerView.scrollBy(0, i);
                } else if (!this.LLJILLL.isFinished()) {
                    this.LLJILLL.abortAnimation();
                }
            } else if (i < 0) {
                if (recyclerView != null && recyclerView.canScrollVertically(-1)) {
                    recyclerView.scrollBy(0, i);
                } else if (canScrollVertically(-1)) {
                    scrollBy(0, i);
                } else if (!this.LLJILLL.isFinished()) {
                    this.LLJILLL.abortAnimation();
                }
            }
            invalidate();
        }
        super.computeScroll();
    }

    public final RecyclerView getNestedRc() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2 = this.LLJJ;
        if (recyclerView2 != null && recyclerView2.isAttachedToWindow() && ((recyclerView = this.LLJJ) == null || recyclerView.getGlobalVisibleRect(this.LLILZLL))) {
            return this.LLJJ;
        }
        ((LinkedList) this.LLIZ).clear();
        ((LinkedList) this.LLIZ).add(this);
        while (!this.LLIZ.isEmpty()) {
            ViewGroup viewGroup = (ViewGroup) ((LinkedList) this.LLIZ).poll();
            if (viewGroup != null) {
                for (View view : new C2500209qy(viewGroup, 6)) {
                    if ((view instanceof RecyclerView) && view.getGlobalVisibleRect(this.LLILZLL)) {
                        RecyclerView recyclerView3 = (RecyclerView) view;
                        if (recyclerView3.isAttachedToWindow()) {
                            ((LinkedList) this.LLIZ).clear();
                            return recyclerView3;
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ((LinkedList) this.LLIZ).add(view);
                    }
                }
            }
        }
        ((LinkedList) this.LLIZ).clear();
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_left_swipe_to_enter_shop", true, false) && this.LLJ == null) {
            this.LLJ = new GestureDetector(getContext(), new C21648719nx() { // from class: X.0kw5
                public float LL;
                public final int LLILLJJLI = (int) (((double) C958103op.LIZLLL()) * 0.4d);
                public final int LLILLL;

                {
                    this.LLILLL = ViewConfiguration.get(this.LLILZ.getContext()).getScaledTouchSlop() * 2;
                }

                @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public final boolean onDown(MotionEvent motionEvent) {
                    this.LL = motionEvent.getX();
                    C1338500kw4 c1338500kw4 = this.LLILZ;
                    c1338500kw4.LLJI = false;
                    c1338500kw4.LLJIJIL = false;
                    return true;
                }

                @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    boolean z;
                    boolean z2 = false;
                    if (motionEvent == null) {
                        return false;
                    }
                    float x = motionEvent2.getX() - motionEvent.getX();
                    float y = motionEvent2.getY() - motionEvent.getY();
                    if (!this.LLILZ.LLJIJIL && (Math.abs(x) > this.LLILLL || Math.abs(y) > this.LLILLL)) {
                        C1338500kw4 c1338500kw4 = this.LLILZ;
                        if (Math.abs(x) > Math.abs(y) * 1.35f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c1338500kw4.LLJI = z;
                        this.LLILZ.LLJIJIL = true;
                    }
                    if (!this.LLILZ.LLJI) {
                        return false;
                    }
                    float fLIZLLL = C13LZ.LIZLLL((this.LL - motionEvent2.getX()) / (this.LLILLJJLI - this.LLILLL), 0.0f, 1.0f);
                    if (fLIZLLL == 1.0f) {
                        z2 = true;
                    }
                    C1338500kw4 c1338500kw42 = this.LLILZ;
                    if (z2 != c1338500kw42.LLJILJIL) {
                        c1338500kw42.LLJILJIL = z2;
                        InterfaceC1338530kw7 swipeListener = c1338500kw42.getSwipeListener();
                        if (swipeListener != null) {
                            swipeListener.LIZJ(this.LLILZ.LLJILJIL);
                        }
                    }
                    InterfaceC1338530kw7 swipeListener2 = this.LLILZ.getSwipeListener();
                    if (swipeListener2 != null) {
                        swipeListener2.LIZ(fLIZLLL);
                    }
                    return true;
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJ = null;
        if (C0BA5.LIZ()) {
            RecyclerView recyclerView = this.LLJJ;
            if (recyclerView != null) {
                recyclerView.removeOnAttachStateChangeListener(this.LLJJI);
            }
            this.LLJJ = null;
        }
    }

    public final RecyclerView getCurrentSubRecyclerView() {
        return this.LLJJ;
    }

    public final InterfaceC1338540kw8 getDownListener() {
        return this.LLJJIJIL;
    }

    public final float getDownX() {
        return this.LLJJIII;
    }

    public final float getDownY() {
        return this.LLJJIJI;
    }

    public final AbstractC1338480kw2 getFlingListener() {
        return this.LLIZLLLIL;
    }

    public final InterfaceC1338530kw7 getSwipeListener() {
        return this.LLJJIJIIJIL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        if (motionEvent != null && motionEvent.getActionMasked() == 0) {
            if (C0BA5.LIZ() && (recyclerView2 = this.LLJJ) != null) {
                recyclerView2.removeOnAttachStateChangeListener(this.LLJJI);
            }
            this.LLJJ = getNestedRc();
            if (C0BA5.LIZ() && (recyclerView = this.LLJJ) != null) {
                recyclerView.addOnAttachStateChangeListener(this.LLJJI);
            }
            if (!this.LLJILLL.isFinished()) {
                this.LLJILLL.abortAnimation();
            }
            GestureDetector gestureDetector = this.LLJ;
            if (gestureDetector != null) {
                gestureDetector.onTouchEvent(motionEvent);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            r0.getClass()
            java.lang.String r0 = "ec_pdp_carousel_swipe_conflict_fix"
            r2 = 1
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r2)
            if (r0 != 0) goto L15
            boolean r0 = super.onInterceptTouchEvent(r5)
            return r0
        L15:
            kotlin.jvm.internal.AwS550S0100000_6 r1 = new kotlin.jvm.internal.AwS550S0100000_6
            r0 = 71
            r1.<init>(r4, r0)
            X.01GW r3 = X.C452501pT.LIZIZ(r1)
            int r1 = r5.getActionMasked()
            if (r1 == 0) goto L69
            if (r1 == r2) goto L66
            r0 = 2
            if (r1 == r0) goto L33
            r0 = 3
            if (r1 == r0) goto L66
        L2e:
            boolean r0 = super.onInterceptTouchEvent(r5)
            return r0
        L33:
            boolean r0 = r4.LLJILJILJ
            if (r0 != 0) goto L2e
            float r2 = r5.getX()
            float r0 = r4.LLJJIII
            float r2 = r2 - r0
            float r1 = r5.getY()
            float r0 = r4.LLJJIJI
            float r1 = r1 - r0
            float r2 = java.lang.Math.abs(r2)
            float r1 = java.lang.Math.abs(r1)
            java.lang.Object r0 = r3.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L2e
            r0 = 1065437102(0x3f8147ae, float:1.01)
            float r1 = r1 * r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2e
            r0 = 0
            return r0
        L66:
            r4.LLJILJILJ = r2
            goto L2e
        L69:
            float r0 = r5.getX()
            r4.LLJJIII = r0
            float r0 = r5.getY()
            r4.LLJJIJI = r0
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1338500kw4.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L9
            android.view.GestureDetector r0 = r4.LLJ
            if (r0 == 0) goto L9
            r0.onTouchEvent(r5)
        L9:
            r3 = 1
            r2 = 0
            if (r5 == 0) goto L31
            int r0 = r5.getAction()
            if (r0 != 0) goto L1c
            X.0kw8 r0 = r4.LLJJIJIL
            if (r0 == 0) goto L1a
            r0.LIZ()
        L1a:
            if (r5 == 0) goto L31
        L1c:
            int r0 = r5.getAction()
            if (r0 != r3) goto L31
            X.0kw7 r1 = r4.LLJJIJIIJIL
            if (r1 == 0) goto L2b
            boolean r0 = r4.LLJILJIL
            r1.LIZIZ(r0)
        L2b:
            r4.LLJILJIL = r2
            r4.LLJI = r2
            r4.LLJIJIL = r2
        L31:
            boolean r0 = r4.LLJI
            if (r0 == 0) goto L36
            return r3
        L36:
            boolean r0 = super.onTouchEvent(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1338500kw4.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setCurrentSubRecyclerView(RecyclerView recyclerView) {
        this.LLJJ = recyclerView;
    }

    public final void setDownListener(InterfaceC1338540kw8 interfaceC1338540kw8) {
        this.LLJJIJIL = interfaceC1338540kw8;
    }

    public final void setDownX(float f) {
        this.LLJJIII = f;
    }

    public final void setDownY(float f) {
        this.LLJJIJI = f;
    }

    public final void setFlingListener(AbstractC1338480kw2 abstractC1338480kw2) {
        this.LLIZLLLIL = abstractC1338480kw2;
    }

    public final void setSwipeListener(InterfaceC1338530kw7 interfaceC1338530kw7) {
        this.LLJJIJIIJIL = interfaceC1338530kw7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void smoothScrollToPosition(int i) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            this.LLJJ = getNestedRc();
            LJJII();
            super.smoothScrollToPosition(i);
            return;
        }
        HandlerHook.viewPost(this, new ARunnableS31S0101000_20(i, this, 2));
    }

    public C1338500kw4(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LJJIII(int i, final int i2) {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && layoutManager != null) {
            stopScroll();
            stopNestedScroll();
            if (!this.LLJILLL.isFinished()) {
                this.LLJILLL.abortAnimation();
                this.LLILZIL = 0;
            }
            final Context context = getContext();
            C21674119s3 c21674119s3 = new C21674119s3(context) { // from class: X.0kw6
                @Override // X.C21674119s3
                public final int LJIILL() {
                    return -1;
                }

                @Override // X.C21674119s3
                public final int LJIIIIZZ(int i3, int i4, int i5, int i6, int i7) {
                    return (i5 - i3) + i2;
                }
            };
            c21674119s3.LIZ = i;
            layoutManager.startSmoothScroll(c21674119s3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        AbstractC1338480kw2 abstractC1338480kw2 = this.LLIZLLLIL;
        if (abstractC1338480kw2 != null) {
            abstractC1338480kw2.LIZ((int) f, (int) f2);
        }
        this.LLILZIL = 0;
        this.LLJILLL.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        invalidate();
        return true;
    }

    public C1338500kw4(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZ = new int[2];
        this.LLILZLL = new Rect();
        this.LLIZ = new LinkedList();
        this.LLJILJILJ = true;
        this.LLJILLL = new OverScroller(context, new Interpolator() { // from class: X.0GUl
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        });
        this.LLJJI = new C0IDM(3);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }

    @Override // androidx.recyclerview.widget.RecyclerView, X.InterfaceC20097013kG
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        boolean z;
        int i4;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        if (i3 == 0) {
            if (i2 > 0 && !canScrollVertically(1) && (recyclerView2 = this.LLJJ) != null) {
                recyclerView2.scrollBy(0, i2);
                if (iArr != null) {
                    iArr[1] = i2;
                }
                z = true;
            } else {
                z = false;
                if (i2 < 0 && (recyclerView = this.LLJJ) != null && recyclerView.canScrollVertically(-1)) {
                    recyclerView.scrollBy(0, i2);
                    if (iArr != null) {
                        iArr[1] = i2;
                    }
                    z = true;
                }
            }
        } else {
            z = false;
        }
        int[] iArr3 = this.LLILZ;
        if (iArr != null) {
            i4 = iArr[1];
        } else {
            i4 = 0;
        }
        boolean zDispatchNestedPreScroll = super.dispatchNestedPreScroll(i, i2 - i4, iArr3, iArr2, i3);
        if (iArr != null) {
            iArr[1] = iArr[1] + iArr3[1];
        }
        if (z || zDispatchNestedPreScroll) {
            return true;
        }
        return false;
    }
}
