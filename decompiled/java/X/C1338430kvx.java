package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: renamed from: X.0kvx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1338430kvx extends RecyclerView {
    public final int[] LL;
    public int LLILLJJLI;
    public final Rect LLILLL;
    public final Queue<ViewGroup> LLILZ;
    public AbstractC1338480kw2 LLILZIL;
    public final OverScroller LLILZLL;
    public RecyclerView LLIZ;
    public final C0IDM LLIZLLLIL;
    public InterfaceC1338440kvy LLJ;

    private final RecyclerView getNestedRc() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2 = this.LLIZ;
        if (recyclerView2 != null && recyclerView2.isAttachedToWindow() && ((recyclerView = this.LLIZ) == null || recyclerView.getGlobalVisibleRect(this.LLILLL))) {
            return this.LLIZ;
        }
        ((LinkedList) this.LLILZ).clear();
        ((LinkedList) this.LLILZ).add(this);
        while (!this.LLILZ.isEmpty()) {
            ViewGroup viewGroup = (ViewGroup) ((LinkedList) this.LLILZ).poll();
            if (viewGroup != null) {
                for (View view : new C2500209qy(viewGroup, 5)) {
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
        if (this.LLILZLL.computeScrollOffset()) {
            int currY = this.LLILZLL.getCurrY();
            int i = currY - this.LLILLJJLI;
            this.LLILLJJLI = currY;
            RecyclerView recyclerView = this.LLIZ;
            if (i > 0) {
                if (canScrollVertically(1)) {
                    scrollBy(0, i);
                } else if (recyclerView != null && recyclerView.canScrollVertically(1)) {
                    recyclerView.scrollBy(0, i);
                } else if (!this.LLILZLL.isFinished()) {
                    this.LLILZLL.abortAnimation();
                }
            } else if (i < 0) {
                if (recyclerView != null && recyclerView.canScrollVertically(-1)) {
                    recyclerView.scrollBy(0, i);
                } else if (canScrollVertically(-1)) {
                    scrollBy(0, i);
                } else if (!this.LLILZLL.isFinished()) {
                    this.LLILZLL.abortAnimation();
                }
            }
            invalidate();
        }
        super.computeScroll();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (C0BA5.LIZ()) {
            RecyclerView recyclerView = this.LLIZ;
            if (recyclerView != null) {
                recyclerView.removeOnAttachStateChangeListener(this.LLIZLLLIL);
            }
            this.LLIZ = null;
        }
    }

    public final RecyclerView getCurrentSubRecyclerView() {
        return this.LLIZ;
    }

    public final InterfaceC1338440kvy getDownListener() {
        return this.LLJ;
    }

    public final AbstractC1338480kw2 getMFlingListener() {
        return this.LLILZIL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        if (motionEvent != null && motionEvent.getActionMasked() == 0) {
            if (C0BA5.LIZ() && (recyclerView2 = this.LLIZ) != null) {
                recyclerView2.removeOnAttachStateChangeListener(this.LLIZLLLIL);
            }
            this.LLIZ = getNestedRc();
            if (C0BA5.LIZ() && (recyclerView = this.LLIZ) != null) {
                recyclerView.addOnAttachStateChangeListener(this.LLIZLLLIL);
            }
            if (!this.LLILZLL.isFinished()) {
                this.LLILZLL.abortAnimation();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC1338440kvy interfaceC1338440kvy;
        if (motionEvent != null && motionEvent.getAction() == 0 && (interfaceC1338440kvy = this.LLJ) != null) {
            interfaceC1338440kvy.LIZ();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setCurrentSubRecyclerView(RecyclerView recyclerView) {
        this.LLIZ = recyclerView;
    }

    public final void setDownListener(InterfaceC1338440kvy interfaceC1338440kvy) {
        this.LLJ = interfaceC1338440kvy;
    }

    public final void setMFlingListener(AbstractC1338480kw2 abstractC1338480kw2) {
        this.LLILZIL = abstractC1338480kw2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void smoothScrollToPosition(int i) {
        RecyclerView nestedRc = getNestedRc();
        this.LLIZ = nestedRc;
        if (nestedRc != null) {
            nestedRc.scrollToPosition(0);
        }
        super.smoothScrollToPosition(i);
    }

    public C1338430kvx(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        AbstractC1338480kw2 abstractC1338480kw2 = this.LLILZIL;
        if (abstractC1338480kw2 != null) {
            abstractC1338480kw2.LIZ((int) f, (int) f2);
        }
        this.LLILLJJLI = 0;
        this.LLILZLL.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        invalidate();
        return true;
    }

    public C1338430kvx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new int[2];
        this.LLILLL = new Rect();
        this.LLILZ = new LinkedList();
        this.LLILZLL = new OverScroller(context, new Interpolator() { // from class: X.0GUk
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        });
        this.LLIZLLLIL = new C0IDM(2);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }

    @Override // androidx.recyclerview.widget.RecyclerView, X.InterfaceC20097013kG
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        boolean z;
        int i4;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        if (i3 == 0) {
            if (i2 > 0 && !canScrollVertically(1) && (recyclerView2 = this.LLIZ) != null) {
                recyclerView2.scrollBy(0, i2);
                if (iArr != null) {
                    iArr[1] = i2;
                }
                z = true;
            } else {
                z = false;
                if (i2 < 0 && (recyclerView = this.LLIZ) != null && recyclerView.canScrollVertically(-1)) {
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
