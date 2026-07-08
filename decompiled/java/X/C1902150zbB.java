package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.view.GameHeaderScrollView$SavedState;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zbB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1902150zbB extends C1884370z8V {
    public int LLIZLLLIL;
    public ValueAnimator LLJ;
    public InterfaceC1902160zbC LLJI;
    public float LLJIJIL;
    public float LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public Boolean LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;

    public static /* synthetic */ void getState$annotations() {
    }

    @Override // X.C1884370z8V
    public final int LIZJ() {
        return getChildAt(0).getMeasuredHeight();
    }

    private final int getCollapseOffset() {
        return ((Number) this.LLJJI.getValue()).intValue();
    }

    private final int getExpandOffset() {
        return ((Number) this.LLJJIII.getValue()).intValue();
    }

    private final int getScreenHeight() {
        return ((Number) this.LLJJIJI.getValue()).intValue();
    }

    private final ArrayList<InterfaceC1884610z8t> getSlideListeners() {
        return (ArrayList) this.LLJJIJIIJIL.getValue();
    }

    public final int getCollapseHeight() {
        InterfaceC1902160zbC interfaceC1902160zbC = this.LLJI;
        if (interfaceC1902160zbC == null) {
            return 0;
        }
        if (!interfaceC1902160zbC.tk()) {
            return getExpandHeight();
        }
        return getCollapseOffset() + (getScreenHeight() - interfaceC1902160zbC.getExpandedHeight());
    }

    public final int getExpandHeight() {
        InterfaceC1902160zbC interfaceC1902160zbC = this.LLJI;
        return interfaceC1902160zbC != null ? (getScreenHeight() - interfaceC1902160zbC.getCollapsedHeight()) + getExpandOffset() : getScreenHeight();
    }

    @Override // X.C21578619ce, android.view.View
    public final Parcelable onSaveInstanceState() {
        GameHeaderScrollView$SavedState gameHeaderScrollView$SavedState = new GameHeaderScrollView$SavedState(super.onSaveInstanceState());
        gameHeaderScrollView$SavedState.state = this.LLIZLLLIL;
        return gameHeaderScrollView$SavedState;
    }

    private final void setState(int i) {
        boolean z = true;
        if (i != 1) {
            if (i != 3) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("set invalid state: ");
                sbLIZ.append(i);
                sbLIZ.append(", must be STATE_IDLE, STATE_EXPANDED or STATE_COLLAPSED ");
                C20441214yg.LJIIL("GameResourceScrollView", C2188811AlT.LIZIZ(sbLIZ));
                ValueAnimator valueAnimator = this.LLJ;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            } else {
                setScrollY(getCollapseHeight());
            }
        } else {
            setScrollY(getExpandHeight());
        }
        if (i == this.LLIZLLLIL) {
            z = false;
        }
        this.LLIZLLLIL = i;
        if (z) {
            LJI(i);
        }
    }

    public final void LJ(C1884580z8q c1884580z8q) {
        getSlideListeners().add(c1884580z8q);
    }

    public final void LJFF(int i) {
        InterfaceC1902160zbC interfaceC1902160zbC = this.LLJI;
        if (interfaceC1902160zbC != null) {
            interfaceC1902160zbC.Og(i);
        }
        Iterator<InterfaceC1884610z8t> it2 = getSlideListeners().iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(i, getScreenHeight() - getExpandHeight());
        }
    }

    public final void LJI(int i) {
        InterfaceC1902160zbC interfaceC1902160zbC = this.LLJI;
        if (interfaceC1902160zbC != null) {
            interfaceC1902160zbC.LJJJJJ(i);
        }
    }

    public final void LJII(C1884580z8q c1884580z8q) {
        getSlideListeners().remove(c1884580z8q);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        if (i < 0) {
            if (getScrollY() > getExpandHeight()) {
                return true;
            }
            return false;
        }
        return super.canScrollVertically(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0102, code lost:
    
        if (r0 < r1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015e, code lost:
    
        if (r0 < r1) goto L73;
     */
    @Override // X.C1884370z8V, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1902150zbB.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // X.C21578619ce
    public final void fling(int i) {
        InterfaceC1902160zbC interfaceC1902160zbC = this.LLJI;
        if (interfaceC1902160zbC != null && interfaceC1902160zbC.tk() && i < 0 && getScrollY() >= getExpandHeight()) {
            return;
        }
        super.fling(i);
    }

    @Override // X.C21578619ce, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof GameHeaderScrollView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        GameHeaderScrollView$SavedState gameHeaderScrollView$SavedState = (GameHeaderScrollView$SavedState) parcelable;
        super.onRestoreInstanceState(gameHeaderScrollView$SavedState.mSuperState);
        setState(gameHeaderScrollView$SavedState.state);
    }

    @Override // X.C21578619ce, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.LLJILJILJ || C13LQ.LJJIJIIJI(Integer.valueOf(this.LLIZLLLIL), new Integer[]{0, 2, 5}) >= 0) {
            return true;
        }
        if (motionEvent.getAction() == 2 && Intrinsics.LJFF(this.LLJJ, Boolean.FALSE)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setGameHeaderView(InterfaceC1902160zbC interfaceC1902160zbC) {
        int state;
        this.LLJI = interfaceC1902160zbC;
        if (interfaceC1902160zbC != null) {
            state = interfaceC1902160zbC.getState();
        } else {
            state = this.LLIZLLLIL;
        }
        setState(state);
    }

    public final void setScrollEnabled(boolean z) {
        this.LLJILJILJ = z;
    }

    public C1902150zbB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLIZLLLIL = 1;
        this.LLJILJILJ = true;
        this.LLJILLL = true;
        this.LLJJI = C452501pT.LIZIZ(new C1884690z91());
        this.LLJJIII = C452501pT.LIZIZ(new C1884700z92());
        this.LLJJIJI = C452501pT.LIZIZ(new C1884680z90(context));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new C1891290zJf());
        setPaddingRelative(getPaddingStart(), getScreenHeight(), getPaddingEnd(), getPaddingBottom());
        setClipToPadding(false);
    }

    @Override // X.C21578619ce, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.mFillViewport && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = ((getMeasuredHeight() - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        InterfaceC1902160zbC interfaceC1902160zbC = this.LLJI;
        if ((interfaceC1902160zbC == null || !interfaceC1902160zbC.tk()) && i2 < 0 && (i2 = Math.max(getCollapseHeight() - getScrollY(), i2)) > 0) {
            i2 = 0;
        }
        super.scrollBy(i, i2);
    }

    @Override // X.C21578619ce, android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        InterfaceC1902160zbC interfaceC1902160zbC = this.LLJI;
        if (interfaceC1902160zbC == null || !interfaceC1902160zbC.tk()) {
            i2 = Math.max(getCollapseHeight(), i2);
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    @Override // X.C1884370z8V, X.C21578619ce, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        boolean z;
        InterfaceC1902160zbC interfaceC1902160zbC;
        if (i2 >= 0 && i2 <= getCollapseHeight() && (interfaceC1902160zbC = this.LLJI) != null && interfaceC1902160zbC.sk()) {
            if (this.LLIZLLLIL != 4) {
                this.LLIZLLLIL = 4;
                LJI(4);
            }
            InterfaceC1902160zbC interfaceC1902160zbC2 = this.LLJI;
            if (interfaceC1902160zbC2 != null) {
                interfaceC1902160zbC2.uk(getCollapseHeight() - getScrollY());
            }
        } else {
            int collapseHeight = getCollapseHeight() + 1;
            if (i2 <= getExpandHeight() && collapseHeight <= i2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (this.LLIZLLLIL == 6) {
                    setState(1);
                    LJFF(0);
                }
            } else if (i2 > getExpandHeight()) {
                setState(6);
                LJFF(i2 - getExpandHeight());
            } else if (i2 == getExpandHeight() && this.LLIZLLLIL == 6) {
                setState(1);
                LJFF(0);
            }
        }
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // X.C21578619ce, X.InterfaceC1318440kPi
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (!canScrollVertically(i4)) {
            return;
        }
        super.onNestedScroll(view, i, i2, i3, i4, i5, iArr);
    }
}
