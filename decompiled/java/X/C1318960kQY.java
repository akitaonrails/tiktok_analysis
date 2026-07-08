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

/* JADX INFO: renamed from: X.0kQY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1318960kQY extends C21578619ce implements InterfaceC1314720kJi {
    public C1318940kQW LL;
    public boolean LLILLJJLI;
    public C1318980kQa LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public ArrayList<InterfaceC1319020kQe> LLJIJIL;
    public InterfaceC1314130kIl LLJILJIL;
    public RunnableC1319000kQc LLJILJILJ;
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

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0kQc] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0kQW, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0kQa, android.view.View] */
    public C1318960kQY(Context context) {
        super(context);
        this.LLJJI = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        setVerticalScrollBarEnabled(false);
        setOverScrollMode(2);
        setFadingEdgeLength(0);
        setScrollContainer(false);
        this.LLJIJIL = new ArrayList<>();
        if (this.LL == null) {
            ?? r1 = new LinearLayout(getContext()) { // from class: X.0kQW
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
                    C1318960kQY c1318960kQY = this.LL;
                    setMeasuredDimension(c1318960kQY.LLIZ, c1318960kQY.LLIZLLLIL);
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
            ?? r12 = new HorizontalScrollView(context2) { // from class: X.0kQa
                @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
                public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    if (this.LL.LLILZLL) {
                        return super.onInterceptTouchEvent(motionEvent);
                    }
                    return false;
                }

                @Override // android.widget.HorizontalScrollView, android.view.View
                public final boolean onTouchEvent(MotionEvent motionEvent) {
                    C1318960kQY c1318960kQY = this.LL;
                    if (c1318960kQY.LLILZLL) {
                        c1318960kQY.LIZ(motionEvent);
                        if (motionEvent.getAction() == 0) {
                            C1318960kQY c1318960kQY2 = this.LL;
                            c1318960kQY2.LIZIZ(c1318960kQY2.LLJJIII);
                        }
                        if (motionEvent.getAction() == 1) {
                            C1318960kQY c1318960kQY3 = this.LL;
                            c1318960kQY3.LLJILLL = c1318960kQY3.getScrollY();
                            c1318960kQY3.LLJJ = c1318960kQY3.LLILLL.getScrollX();
                            HandlerHook.viewPostDelay(c1318960kQY3, c1318960kQY3.LLJILJILJ, c1318960kQY3.LLJJI);
                        }
                        return super.onTouchEvent(motionEvent);
                    }
                    return false;
                }

                @Override // android.view.View
                public final void onScrollChanged(int i, int i2, int i3, int i4) {
                    super.onScrollChanged(i, i2, i3, i4);
                    C1318960kQY c1318960kQY = this.LL;
                    if (i == c1318960kQY.LLILZIL) {
                        return;
                    }
                    if (c1318960kQY.LLJ && !c1318960kQY.LLJI) {
                        c1318960kQY.LLJI = true;
                        c1318960kQY.LIZIZ(1);
                        Iterator<InterfaceC1319020kQe> it2 = c1318960kQY.LLJIJIL.iterator();
                        while (it2.hasNext()) {
                            it2.next().LJIJJ();
                        }
                    } else {
                        c1318960kQY.LIZIZ(c1318960kQY.LLJJIII);
                        Iterator<InterfaceC1319020kQe> it3 = c1318960kQY.LLJIJIL.iterator();
                        while (it3.hasNext()) {
                            it3.next().onScrollChanged();
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
        this.LLJILJILJ = new Runnable(this) { // from class: X.0kQc
            public final WeakReference<C1318960kQY> LL;

            public final void LIZ() {
                if (this.LL.get() != null) {
                    C1318960kQY c1318960kQY = this.LL.get();
                    int scrollY = c1318960kQY.getScrollY();
                    int scrollX = c1318960kQY.LLILLL.getScrollX();
                    if (!c1318960kQY.LLILZLL ? c1318960kQY.LLJILLL - scrollY == 0 : c1318960kQY.LLJJ - scrollX == 0) {
                        c1318960kQY.LLJILLL = scrollY;
                        c1318960kQY.LLJJ = scrollX;
                        HandlerHook.viewPostDelay(c1318960kQY, this, c1318960kQY.LLJJI);
                    } else {
                        c1318960kQY.LIZIZ(0);
                        Iterator<InterfaceC1319020kQe> it2 = c1318960kQY.LLJIJIL.iterator();
                        while (it2.hasNext()) {
                            it2.next().LJIJJLI();
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ScrollCoordinatorNestedScrollView$ScrollRunnable@d76e.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ScrollCoordinatorNestedScrollView$ScrollRunnable@d76e.run");
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
            Iterator<InterfaceC1319020kQe> it2 = this.LLJIJIL.iterator();
            while (it2.hasNext()) {
                it2.next().LJIL();
            }
        }
        this.LLJI = false;
        this.LLJ = false;
    }

    public final void LIZIZ(int i) {
        this.LLJJIII = i;
        Iterator<InterfaceC1319020kQe> it2 = this.LLJIJIL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
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

    public void setOnScrollListener(InterfaceC1319020kQe interfaceC1319020kQe) {
        this.LLJIJIL.add(interfaceC1319020kQe);
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
            Iterator<InterfaceC1319020kQe> it2 = this.LLJIJIL.iterator();
            while (it2.hasNext()) {
                it2.next().LJIJJ();
            }
        } else {
            LIZIZ(this.LLJJIII);
            Iterator<InterfaceC1319020kQe> it3 = this.LLJIJIL.iterator();
            while (it3.hasNext()) {
                it3.next().onScrollChanged();
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
