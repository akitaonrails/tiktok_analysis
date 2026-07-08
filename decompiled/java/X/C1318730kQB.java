package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0kQB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1318730kQB extends C21578619ce implements InterfaceC1314720kJi {
    public C1318710kQ9 LL;
    public boolean LLILLJJLI;
    public C1318740kQC LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public ArrayList<InterfaceC1318760kQE> LLJIJIL;
    public InterfaceC1314130kIl LLJILJIL;
    public RunnableC1318750kQD LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public final int LLJJI;
    public int LLJJIII;

    public final void finalize() throws Throwable {
        HandlerHook.viewRemoveCallbacks(this, this.LLJILJILJ);
        super.finalize();
    }

    public int getOrientation() {
        return getOrientation();
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        if (this.LLILLJJLI) {
            C786410Ut5.LJJJJJL(this.LL);
        } else {
            super.removeAllViews();
            this.LLILLJJLI = true;
        }
    }

    public int getContentHeight() {
        return this.LLIZLLLIL;
    }

    public int getContentWidth() {
        return this.LLIZ;
    }

    public HorizontalScrollView getHScrollView() {
        return this.LLILLL;
    }

    public LinearLayout getLinearLayout() {
        return this.LL;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0kQD] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0kQ9, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0kQC, android.view.View] */
    public C1318730kQB(Context context) {
        super(context);
        this.LLJJI = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        setVerticalScrollBarEnabled(false);
        setOverScrollMode(2);
        setFadingEdgeLength(0);
        setScrollContainer(false);
        this.LLJIJIL = new ArrayList<>();
        if (this.LL == null) {
            ?? r1 = new LinearLayout(getContext()) { // from class: X.0kQ9
                @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void dispatchDraw(Canvas canvas) {
                    InterfaceC1314130kIl interfaceC1314130kIl = this.LL.LLJILJIL;
                    if (interfaceC1314130kIl != null) {
                        interfaceC1314130kIl.beforeDispatchDraw(canvas);
                    }
                    super.dispatchDraw(canvas);
                    InterfaceC1314130kIl interfaceC1314130kIl2 = this.LL.LLJILJIL;
                    if (interfaceC1314130kIl2 != null) {
                        interfaceC1314130kIl2.afterDispatchDraw(canvas);
                    }
                }

                @Override // android.widget.LinearLayout, android.view.View
                public final void onMeasure(int i, int i2) {
                    C1318730kQB c1318730kQB = this.LL;
                    setMeasuredDimension(c1318730kQB.LLIZ, c1318730kQB.LLIZLLLIL);
                }

                @Override // android.view.ViewGroup
                public final boolean drawChild(Canvas canvas, View view, long j) {
                    InterfaceC1314130kIl interfaceC1314130kIl = this.LL.LLJILJIL;
                    if (interfaceC1314130kIl != null) {
                        interfaceC1314130kIl.beforeDrawChild(canvas, view, j);
                    }
                    boolean zDrawChild = super.drawChild(canvas, view, j);
                    InterfaceC1314130kIl interfaceC1314130kIl2 = this.LL.LLJILJIL;
                    if (interfaceC1314130kIl2 != null) {
                        interfaceC1314130kIl2.afterDrawChild(canvas, view, j);
                    }
                    return zDrawChild;
                }
            };
            this.LL = r1;
            r1.setOrientation(1);
            setWillNotDraw(true);
            final Context context2 = getContext();
            ?? r12 = new HorizontalScrollView(context2) { // from class: X.0kQC
                @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
                public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    if (this.LL.LLILZLL) {
                        return super.onInterceptTouchEvent(motionEvent);
                    }
                    return false;
                }

                @Override // android.widget.HorizontalScrollView, android.view.View
                public final boolean onTouchEvent(MotionEvent motionEvent) {
                    C1318730kQB c1318730kQB = this.LL;
                    if (c1318730kQB.LLILZLL) {
                        c1318730kQB.LIZ(motionEvent);
                        if (motionEvent.getAction() == 0) {
                            C1318730kQB c1318730kQB2 = this.LL;
                            c1318730kQB2.LIZIZ(c1318730kQB2.LLJJIII);
                        }
                        if (motionEvent.getAction() == 1) {
                            C1318730kQB c1318730kQB3 = this.LL;
                            c1318730kQB3.LLJILLL = c1318730kQB3.getScrollY();
                            c1318730kQB3.LLJJ = c1318730kQB3.LLILLL.getScrollX();
                            HandlerHook.viewPostDelay(c1318730kQB3, c1318730kQB3.LLJILJILJ, c1318730kQB3.LLJJI);
                        }
                        return super.onTouchEvent(motionEvent);
                    }
                    return false;
                }

                @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
                public final void onMeasure(int i, int i2) {
                    super.onMeasure(i, i2);
                }

                @Override // android.view.View
                public final void onScrollChanged(int i, int i2, int i3, int i4) {
                    super.onScrollChanged(i, i2, i3, i4);
                    C1318730kQB c1318730kQB = this.LL;
                    if (i == c1318730kQB.LLILZIL) {
                        return;
                    }
                    if (c1318730kQB.LLJ && !c1318730kQB.LLJI) {
                        c1318730kQB.LLJI = true;
                        c1318730kQB.LIZIZ(1);
                        Iterator<InterfaceC1318760kQE> it2 = c1318730kQB.LLJIJIL.iterator();
                        while (it2.hasNext()) {
                            it2.next().LJIJJ();
                        }
                    } else {
                        c1318730kQB.LIZIZ(c1318730kQB.LLJJIII);
                        Iterator<InterfaceC1318760kQE> it3 = c1318730kQB.LLJIJIL.iterator();
                        while (it3.hasNext()) {
                            it3.next().onScrollChanged(i, i2, i3, i4);
                        }
                    }
                    if (this.LL.LLILZIL != getScrollX()) {
                        this.LL.LLILZIL = getScrollX();
                    }
                }
            };
            this.LLILLL = r12;
            r12.setHorizontalScrollBarEnabled(false);
            setOverScrollMode(2);
            setFadingEdgeLength(0);
            setWillNotDraw(true);
            addView(this.LL, new FrameLayout.LayoutParams(-1, -1));
            addView(this.LLILLL, new FrameLayout.LayoutParams(-2, -2));
        }
        this.LLJILJILJ = new Runnable(this) { // from class: X.0kQD
            public final WeakReference<C1318730kQB> LL;

            public final void LIZ() {
                if (this.LL.get() != null) {
                    C1318730kQB c1318730kQB = this.LL.get();
                    int scrollY = c1318730kQB.getScrollY();
                    int scrollX = c1318730kQB.LLILLL.getScrollX();
                    if (!c1318730kQB.LLILZLL ? c1318730kQB.LLJILLL - scrollY == 0 : c1318730kQB.LLJJ - scrollX == 0) {
                        c1318730kQB.LLJILLL = scrollY;
                        c1318730kQB.LLJJ = scrollX;
                        HandlerHook.viewPostDelay(c1318730kQB, this, c1318730kQB.LLJJI);
                    } else {
                        c1318730kQB.LIZIZ(0);
                        Iterator<InterfaceC1318760kQE> it2 = c1318730kQB.LLJIJIL.iterator();
                        while (it2.hasNext()) {
                            it2.next().LJIJJLI();
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AndroidNestedScrollView$ScrollRunnable@56f6.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AndroidNestedScrollView$ScrollRunnable@56f6.run");
            }

            {
                this.LL = new WeakReference<>(this);
            }
        };
    }

    public final void LIZ(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.LLJ = true;
            return;
        }
        if (motionEvent.getAction() != 1) {
            return;
        }
        if (this.LLJI) {
            LIZIZ(2);
            Iterator<InterfaceC1318760kQE> it2 = this.LLJIJIL.iterator();
            while (it2.hasNext()) {
                it2.next().LJIL();
            }
        }
        this.LLJI = false;
        this.LLJ = false;
    }

    public final void LIZIZ(int i) {
        this.LLJJIII = i;
        Iterator<InterfaceC1318760kQE> it2 = this.LLJIJIL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(i);
        }
    }

    @Override // X.C21578619ce, android.view.ViewGroup
    public final void addView(View view) {
        if (this.LLILLJJLI) {
            addView(view);
        } else {
            super.addView(view);
            this.LLILLJJLI = true;
        }
    }

    @Override // X.InterfaceC1314720kJi
    public final void bindDrawChildHook(InterfaceC1314130kIl interfaceC1314130kIl) {
        this.LLJILJIL = interfaceC1314130kIl;
    }

    @Override // X.C21578619ce, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.LLILZLL) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // X.C21578619ce, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.LLILZLL) {
            LIZ(motionEvent);
            if (motionEvent.getAction() == 0) {
                LIZIZ(this.LLJJIII);
            }
            if (motionEvent.getAction() == 1) {
                this.LLJILLL = getScrollY();
                this.LLJJ = getScrollX();
                HandlerHook.viewPostDelay(this, this.LLJILJILJ, this.LLJJI);
            }
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.LLILLJJLI) {
            C786410Ut5.LJJL(view, this.LL);
        } else {
            super.removeView(view);
            this.LLILLJJLI = true;
        }
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        if (this.LLILLJJLI) {
            C786410Ut5.LJJLJ(i, this.LL);
        } else {
            super.removeViewAt(i);
            this.LLILLJJLI = true;
        }
    }

    public void setOnScrollListener(InterfaceC1318760kQE interfaceC1318760kQE) {
        this.LLJIJIL.add(interfaceC1318760kQE);
    }

    public void setOrientation(int i) {
        if (i == 0) {
            setOrientation(0);
            this.LLILZLL = true;
        } else {
            if (i != 1) {
                return;
            }
            setOrientation(1);
            this.LLILZLL = false;
        }
    }

    public void setScrollBarEnable(boolean z) {
        setVerticalScrollBarEnabled(z);
        setHorizontalScrollBarEnabled(z);
    }

    @Override // X.C21578619ce, android.view.ViewGroup
    public final void addView(View view, int i) {
        if (this.LLILLJJLI) {
            addView(view, i);
        } else {
            super.addView(view, i);
            this.LLILLJJLI = true;
        }
    }

    @Override // X.C21578619ce, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (this.LLILLJJLI) {
            addView(view, layoutParams);
        } else {
            super.addView(view, layoutParams);
            this.LLILLJJLI = true;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        if (this.LLILLJJLI) {
            addView(view, i, i2);
        } else {
            super.addView(view, i, i2);
            this.LLILLJJLI = true;
        }
    }

    @Override // X.C21578619ce, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.LLILLJJLI) {
            addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
            this.LLILLJJLI = true;
        }
    }

    @Override // X.C21578619ce, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (i2 == this.LLILZ) {
            return;
        }
        if (this.LLJ && !this.LLJI) {
            this.LLJI = true;
            LIZIZ(1);
            Iterator<InterfaceC1318760kQE> it2 = this.LLJIJIL.iterator();
            while (it2.hasNext()) {
                it2.next().LJIJJ();
            }
        } else {
            LIZIZ(this.LLJJIII);
            Iterator<InterfaceC1318760kQE> it3 = this.LLJIJIL.iterator();
            while (it3.hasNext()) {
                it3.next().onScrollChanged(i, i2, i3, i4);
            }
        }
        if (this.LLILZ != getScrollY()) {
            this.LLILZ = getScrollY();
        }
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        setPadding(i, i2, i3, i4);
    }
}
