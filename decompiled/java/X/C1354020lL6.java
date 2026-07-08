package X;

import Y.ARunnableS121S0100000_21;
import Y.AfS190S0100000_21;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0lL6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1354020lL6 extends ViewOnAttachStateChangeListenerC20604515jv {
    public C11LS LLILZ;
    public final View LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public int LLJ;

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final void LJJIFFI() {
        C1344030l4z.LIZJ("InteractionBubbleList", "[startAutoScroll]");
        this.LLIZLLLIL = false;
        C11LS c11ls = this.LLILZ;
        if (c11ls == null || c11ls.isDisposed()) {
            int visibility = getVisibility();
            setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, this);
            if (this.LLILZLL) {
                smoothScrollBy(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)), C1619980sG4.LIZLLL(), OppoPermissionPopupMaskDelayExp.DEFAULT);
                this.LLILZLL = false;
            }
            this.LLILZ = (C11LS) new C19490611Ng(C11NN.LJII(1600L, TimeUnit.MILLISECONDS)).LJIIJ(C1701940uOG.LIZIZ()).LJIIL(new AfS190S0100000_21(this, 1));
        }
    }

    public final void LJJII() {
        C1344030l4z.LIZJ("InteractionBubbleList", "[stopAutoScroll]");
        this.LLIZLLLIL = true;
    }

    public final void LJJI() {
        LJJII();
        scrollToPosition(0);
        C1351950lHl.LJIJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(104)), this.LLILZIL);
        this.LLIZ = false;
        this.LLILZLL = true;
        this.LLIZLLLIL = false;
        getState().LJFF(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C11LS c11ls = this.LLILZ;
        if (c11ls != null) {
            c11ls.dispose();
        }
        this.LLILZ = null;
    }

    public final int getCaptionFlag() {
        return this.LLJ;
    }

    public final boolean getReachEnd() {
        return this.LLIZ;
    }

    public final boolean getStopFlag() {
        return this.LLIZLLLIL;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (getScrollState() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (motionEvent.getActionMasked() == 0 && z) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return false;
    }

    public final void setCaptionFlag(int i) {
        this.LLJ = i;
    }

    public final void setNewTurn(boolean z) {
        this.LLILZLL = z;
    }

    public final void setReachEnd(boolean z) {
        this.LLIZ = z;
    }

    public final void setStopFlag(boolean z) {
        this.LLIZLLLIL = z;
    }

    public C1354020lL6(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1354020lL6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZLL = true;
        addItemDecoration(new C366620EYy(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 1));
        setHasFixedSize(true);
        C1352940lJM c1352940lJM = C1352940lJM.LIZIZ;
        View viewLIZ = c1352940lJM.LIZ(R.layout.ctk, context, null, this);
        this.LLILZIL = viewLIZ;
        LJ(0, viewLIZ);
        LIZLLL(c1352940lJM.LIZ(R.layout.ctk, context, null, this));
        setItemAnimator(null);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        int position;
        super.onScrollChanged(i, i2, i3, i4);
        int iLJIIIIZZ = getState().LJIIIIZZ() + this.LLJ;
        if (iLJIIIIZZ >= 0) {
            int i5 = 0;
            while (true) {
                View childAt = getChildAt(i5);
                if (childAt != null) {
                    float top = childAt.getTop();
                    float f = 0.0f;
                    if (top <= 0.0f) {
                        C786410Ut5.LJLLLLLL(4, childAt);
                    } else {
                        int position2 = -1;
                        if (top <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56))) {
                            C786410Ut5.LJLLLLLL(0, childAt);
                            float fLIZIZ = (top - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))) / (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                            if (fLIZIZ >= 0.0f) {
                                f = fLIZIZ;
                            }
                            C786410Ut5.T4(childAt, f);
                            RecyclerView.LayoutManager layoutManager = getLayoutManager();
                            if (layoutManager != null) {
                                position2 = layoutManager.getPosition(childAt);
                            }
                            if ((position2 - getHeaderCount()) + 1 == getState().LJIIIIZZ() && !this.LLIZ) {
                                this.LLIZ = true;
                                HandlerHook.viewPostDelay(this, new ARunnableS121S0100000_21(this, 136), 1600L);
                            }
                        } else if (top <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(168)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56))) {
                            C786410Ut5.LJLLLLLL(0, childAt);
                            C786410Ut5.T4(childAt, 1.0f);
                        } else if (top <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(168))) {
                            C786410Ut5.LJLLLLLL(0, childAt);
                            float fLIZIZ2 = (((C814420VxA.LIZIZ(C418440Gaw.LIZIZ(168)) - top) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))) / C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                            if (fLIZIZ2 >= 0.0f) {
                                f = fLIZIZ2;
                            }
                            C786410Ut5.T4(childAt, f);
                            RecyclerView.LayoutManager layoutManager2 = getLayoutManager();
                            if (layoutManager2 != null && (position = layoutManager2.getPosition(childAt)) >= 1 && position > getState().LJIIIIZZ()) {
                                getState().LJIIIIZZ();
                            }
                        } else {
                            C786410Ut5.LJLLLLLL(4, childAt);
                            C786410Ut5.T4(childAt, 0.0f);
                            return;
                        }
                    }
                }
                if (i5 != iLJIIIIZZ) {
                    i5++;
                } else {
                    return;
                }
            }
        }
    }
}
