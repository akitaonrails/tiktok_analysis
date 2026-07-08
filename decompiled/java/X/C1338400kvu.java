package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: renamed from: X.0kvu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1338400kvu extends RecyclerView {
    public final int[] LL;
    public int LLILLJJLI;
    public final Rect LLILLL;
    public final Queue<ViewGroup> LLILZ;
    public AbstractC1338480kw2 LLILZIL;
    public GestureDetector LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public final OverScroller LLJI;
    public RecyclerView LLJIJIL;
    public final C0IDM LLJILJIL;

    public final InterfaceC416420GUm getDownListener() {
        return null;
    }

    public final InterfaceC1338420kvw getSwipeListener() {
        return null;
    }

    public final void setDownListener(InterfaceC416420GUm interfaceC416420GUm) {
    }

    public final void setSwipeListener(InterfaceC1338420kvw interfaceC1338420kvw) {
    }

    private final RecyclerView getNestedRc() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2 = this.LLJIJIL;
        if (recyclerView2 != null && recyclerView2.isAttachedToWindow() && ((recyclerView = this.LLJIJIL) == null || recyclerView.getGlobalVisibleRect(this.LLILLL))) {
            return this.LLJIJIL;
        }
        ((LinkedList) this.LLILZ).clear();
        ((LinkedList) this.LLILZ).add(this);
        while (!this.LLILZ.isEmpty()) {
            ViewGroup viewGroup = (ViewGroup) ((LinkedList) this.LLILZ).poll();
            if (viewGroup != null) {
                for (View view : new C2500209qy(viewGroup, 18)) {
                    if ((view instanceof RecyclerView) && view.getGlobalVisibleRect(this.LLILLL)) {
                        RecyclerView recyclerView3 = (RecyclerView) view;
                        if (recyclerView3.isAttachedToWindow()) {
                            ((LinkedList) this.LLILZ).clear();
                            return recyclerView3;
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ((LinkedList) this.LLILZ).add(view);
                    }
                }
            }
        }
        ((LinkedList) this.LLILZ).clear();
        return null;
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.LLJI.computeScrollOffset()) {
            int currY = this.LLJI.getCurrY();
            int i = currY - this.LLILLJJLI;
            this.LLILLJJLI = currY;
            RecyclerView recyclerView = this.LLJIJIL;
            if (i > 0) {
                if (canScrollVertically(1)) {
                    scrollBy(0, i);
                } else if (recyclerView != null && recyclerView.canScrollVertically(1)) {
                    recyclerView.scrollBy(0, i);
                } else if (!this.LLJI.isFinished()) {
                    this.LLJI.abortAnimation();
                }
            } else if (i < 0) {
                if (recyclerView != null && recyclerView.canScrollVertically(-1)) {
                    recyclerView.scrollBy(0, i);
                } else if (canScrollVertically(-1)) {
                    scrollBy(0, i);
                } else if (!this.LLJI.isFinished()) {
                    this.LLJI.abortAnimation();
                }
            }
            invalidate();
        }
        super.computeScroll();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.LLILZLL == null) {
            this.LLILZLL = new GestureDetector(getContext(), new C21648719nx() { // from class: X.0kvv
                public float LL;
                public final int LLILLJJLI;
                public final int LLILLL;

                {
                    this.LLILLJJLI = (int) (((double) C12ES.LJIIJ(this.LLILZ.getContext())) * 0.4d);
                    this.LLILLL = ViewConfiguration.get(this.LLILZ.getContext()).getScaledTouchSlop() * 2;
                }

                @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public final boolean onDown(MotionEvent motionEvent) {
                    this.LL = motionEvent.getX();
                    this.LLILZ.LLIZ = false;
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
                    if (!this.LLILZ.LLIZLLLIL && (Math.abs(x) > this.LLILLL || Math.abs(y) > this.LLILLL)) {
                        C1338400kvu c1338400kvu = this.LLILZ;
                        if (Math.abs(x) > Math.abs(y)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c1338400kvu.LLIZ = z;
                        this.LLILZ.LLIZLLLIL = true;
                    }
                    if (!this.LLILZ.LLIZ) {
                        return false;
                    }
                    if (C13LZ.LIZLLL((this.LL - motionEvent2.getX()) / (this.LLILLJJLI - this.LLILLL), 0.0f, 1.0f) == 1.0f) {
                        z2 = true;
                    }
                    C1338400kvu c1338400kvu2 = this.LLILZ;
                    if (z2 != c1338400kvu2.LLJ) {
                        c1338400kvu2.LLJ = z2;
                        c1338400kvu2.getSwipeListener();
                    }
                    this.LLILZ.getSwipeListener();
                    this.LLILZ.LLIZ = true;
                    return true;
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLILZLL = null;
        RecyclerView recyclerView = this.LLJIJIL;
        if (recyclerView != null) {
            recyclerView.removeOnAttachStateChangeListener(this.LLJILJIL);
        }
        this.LLJIJIL = null;
    }

    public final RecyclerView getCurrentSubRecyclerView() {
        return this.LLJIJIL;
    }

    public final AbstractC1338480kw2 getFlingListener() {
        return this.LLILZIL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getActionMasked() == 0) {
            RecyclerView recyclerView = this.LLJIJIL;
            if (recyclerView != null) {
                recyclerView.removeOnAttachStateChangeListener(this.LLJILJIL);
            }
            RecyclerView nestedRc = getNestedRc();
            this.LLJIJIL = nestedRc;
            if (nestedRc != null) {
                nestedRc.addOnAttachStateChangeListener(this.LLJILJIL);
            }
            if (!this.LLJI.isFinished()) {
                this.LLJI.abortAnimation();
            }
            GestureDetector gestureDetector = this.LLILZLL;
            if (gestureDetector != null) {
                gestureDetector.onTouchEvent(motionEvent);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        if (motionEvent != null && (gestureDetector = this.LLILZLL) != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        if (motionEvent != null) {
            motionEvent.getAction();
            if (motionEvent.getAction() == 1) {
                this.LLJ = false;
                this.LLIZ = false;
                this.LLIZLLLIL = false;
            }
        }
        if (this.LLIZ) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setCurrentSubRecyclerView(RecyclerView recyclerView) {
        this.LLJIJIL = recyclerView;
    }

    public final void setFlingListener(AbstractC1338480kw2 abstractC1338480kw2) {
        this.LLILZIL = abstractC1338480kw2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void smoothScrollToPosition(int i) {
        RecyclerView nestedRc = getNestedRc();
        this.LLJIJIL = nestedRc;
        if (nestedRc != null) {
            nestedRc.scrollToPosition(0);
        }
        super.smoothScrollToPosition(i);
    }

    public C1338400kvu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        AbstractC1338480kw2 abstractC1338480kw2 = this.LLILZIL;
        if (abstractC1338480kw2 != null) {
            abstractC1338480kw2.LIZ((int) f, (int) f2);
        }
        this.LLILLJJLI = 0;
        this.LLJI.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        invalidate();
        return true;
    }

    public C1338400kvu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new int[2];
        this.LLILLL = new Rect();
        this.LLILZ = new LinkedList();
        this.LLJI = new OverScroller(context, new Interpolator() { // from class: X.0GUj
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        });
        this.LLJILJIL = new C0IDM(1);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }

    @Override // androidx.recyclerview.widget.RecyclerView, X.InterfaceC20097013kG
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        boolean z;
        int i4;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        if (i3 == 0) {
            if (i2 > 0 && !canScrollVertically(1) && (recyclerView2 = this.LLJIJIL) != null) {
                recyclerView2.scrollBy(0, i2);
                if (iArr != null) {
                    iArr[1] = i2;
                }
                z = true;
            } else {
                z = false;
                if (i2 < 0 && (recyclerView = this.LLJIJIL) != null && recyclerView.canScrollVertically(-1)) {
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
        int[] iArr3 = this.LL;
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
