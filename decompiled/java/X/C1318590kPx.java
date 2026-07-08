package X;

import Y.ATListenerS14S0010000_20;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.render.PlatformRendererContext;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.scroll.UIScrollView;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0kPx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1318590kPx extends C1318620kQ0 implements InterfaceC1314720kJi, InterfaceC1311940kFE {
    public boolean LLJILJIL;
    public Boolean LLJILJILJ;
    public Boolean LLJILLL;
    public final UIScrollView LLJJ;
    public C1318660kQ4 LLJJI;
    public boolean LLJJIII;
    public C1318600kPy LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public ArrayList<InterfaceC1318670kQ5> LLJJJJLIIL;
    public InterfaceC1314130kIl LLJJL;
    public C1311970kFH LLJJLIIIJLLLLLLLZ;
    public final RunnableC1318630kQ1 LLJL;
    public int LLJLIL;
    public int LLJLILLLLZIIL;
    public final Rect LLJLL;
    public RunnableC1318650kQ3 LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public int LLJZIJLIL;
    public int LLL;
    public boolean LLLF;
    public boolean LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public int LLLI;
    public int LLLII;
    public Rect LLLIIII;

    @Override // X.InterfaceC1311940kFE
    public View getView() {
        return this;
    }

    public final boolean LJ() {
        return this.LLJJ.isEnableNewGesture() && !this.LLJJ.mIncludeNativeGesture;
    }

    public final void LJIIIIZZ() {
        ArrayList<InterfaceC1318670kQ5> arrayList = this.LLJJJJLIIL;
        if (arrayList != null) {
            for (InterfaceC1318670kQ5 interfaceC1318670kQ5 : arrayList) {
                if (interfaceC1318670kQ5 != null) {
                    interfaceC1318670kQ5.LJIJJ();
                }
            }
        }
        LJFF((this.LLJJJIL || this.LLLFFI) ? 1 : 3);
        this.LLJLIL = getScrollY();
        this.LLJLILLLLZIIL = this.LLJJIJI.getScrollX();
        HandlerHook.viewPostDelay(this, this.LLJL, 100L);
    }

    public int getOrientation() {
        return getOrientation();
    }

    public int getRealScrollX() {
        return this.LLJJJ ? this.LLJJIJI.getScrollX() : getScrollX();
    }

    public int getRealScrollY() {
        return this.LLJJJ ? this.LLJJIJI.getScrollY() : getScrollY();
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        if (this.LLJJIII) {
            C786410Ut5.LJJJJJL(this.LLJJI);
        } else {
            super.removeAllViews();
            this.LLJJIII = true;
        }
    }

    @Override // X.C1318620kQ0, android.widget.ScrollView, android.view.View
    public final void computeScroll() {
        C1311400kEM gestureArenaManager;
        super.computeScroll();
        UIScrollView uIScrollView = this.LLJJ;
        if (uIScrollView != null) {
            if (uIScrollView.LLJJJ != -1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("computeScroll: apply mPendingScrollToIndex when computing scroll ");
                sbLIZ.append(this.LLJJ.LLJJJ);
                LynxLog.i("LynxUIScrollView", C2188811AlT.LIZIZ(sbLIZ));
                setScrollToIndex(this.LLJJ.LLJJJ);
                this.LLJJ.LLJJJ = -1;
            }
            this.LLJJ.LJJJI();
            if (!this.LLJJ.isEnableNewGesture() || (gestureArenaManager = this.LLJJ.getGestureArenaManager()) == null) {
                return;
            }
            gestureArenaManager.LIZ();
        }
    }

    public int getContentHeight() {
        return this.LLJJJJJIL;
    }

    public int getContentWidth() {
        return this.LLJJJJ;
    }

    public C1318600kPy getHScrollView() {
        return this.LLJJIJI;
    }

    public LinearLayout getLinearLayout() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC1311940kFE
    public C1311970kFH getRenderer() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public static void LIZJ(View view) {
        Field declaredField;
        try {
            if (view instanceof HorizontalScrollView) {
                declaredField = HorizontalScrollView.class.getDeclaredField("mScroller");
            } else {
                if (view instanceof ScrollView) {
                    declaredField = ScrollView.class.getDeclaredField("mScroller");
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("did not find mScroller in ");
                sbLIZ.append(view.getClass().getName());
                LynxLog.w("AndroidScrollView", C2188811AlT.LIZIZ(sbLIZ));
            }
            if (declaredField != null) {
                declaredField.setAccessible(true);
                OverScroller overScroller = (OverScroller) declaredField.get(view);
                if (!overScroller.isFinished()) {
                    overScroller.abortAnimation();
                    return;
                }
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("did not find mScroller in ");
            sbLIZ2.append(view.getClass().getName());
            LynxLog.w("AndroidScrollView", C2188811AlT.LIZIZ(sbLIZ2));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LynxLog.w("AndroidScrollView", th.getMessage());
        }
    }

    public final boolean LIZLLL(MotionEvent motionEvent) {
        Boolean bool;
        if (this.LLJJ.isEnableNewGesture() && (bool = this.LLJILJILJ) != null && !bool.booleanValue() && motionEvent.getActionMasked() != 0) {
            return true;
        }
        return false;
    }

    public final void LJFF(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notifyStateChange ");
        sbLIZ.append(this.LLLI);
        sbLIZ.append(" -> ");
        sbLIZ.append(i);
        LynxLog.i("LynxUIScrollView", C2188811AlT.LIZIZ(sbLIZ));
        int i2 = this.LLLI;
        if (i2 != i) {
            this.LLLII = i2;
            this.LLLI = i;
            LJIIIZ(i);
        }
    }

    public final void LJIIIZ(int i) {
        ArrayList<InterfaceC1318670kQ5> arrayList = this.LLJJJJLIIL;
        if (arrayList != null) {
            for (InterfaceC1318670kQ5 interfaceC1318670kQ5 : arrayList) {
                if (interfaceC1318670kQ5 != null) {
                    interfaceC1318670kQ5.LIZ(i);
                }
            }
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public final void addView(View view) {
        if (this.LLJJIII) {
            addView(view);
        } else {
            super.addView(view);
            this.LLJJIII = true;
        }
    }

    @Override // X.InterfaceC1314720kJi
    public final void bindDrawChildHook(InterfaceC1314130kIl interfaceC1314130kIl) {
        this.LLJJL = interfaceC1314130kIl;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        if (this.LLJJ.isEnableNewGesture()) {
            return super.canScrollVertically(i);
        }
        if ((!this.LLLFZ || this.LLJJJ) && !super.canScrollVertically(i)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.ScrollView
    public final int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        if (!this.LLJZ) {
            return super.computeScrollDeltaToGetChildRectOnScreen(rect);
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int iWidth;
        int iHeight;
        if (this.LLJJLIIIJLLLLLLLZ != null) {
            super.dispatchDraw(canvas);
            this.LLJJLIIIJLLLLLLLZ.LIZ(canvas);
            return;
        }
        Drawable background = getBackground();
        if (background instanceof BackgroundDrawable) {
            BackgroundDrawable backgroundDrawable = (BackgroundDrawable) background;
            RectF rectFLIZIZ = backgroundDrawable.LIZIZ();
            C1313900kIO c1313900kIO = backgroundDrawable.LJJII;
            Rect bounds = this.LLLIIII;
            if (bounds == null) {
                bounds = background.getBounds();
            }
            Path path = new Path();
            float f = bounds.left + rectFLIZIZ.left;
            float f2 = bounds.top + rectFLIZIZ.top;
            int i = this.LLJJIJIIJIL;
            RectF rectF = new RectF(f, f2 + i, bounds.right - rectFLIZIZ.right, (bounds.bottom - rectFLIZIZ.bottom) + i);
            if (c1313900kIO == null) {
                path.addRect(rectF, Path.Direction.CW);
            } else {
                path.addRoundRect(rectF, C1312750kGX.LIZJ(c1313900kIO.LIZ(), rectFLIZIZ, 1.0f), Path.Direction.CW);
            }
            int iSave = canvas.save();
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
            return;
        }
        if (getParent() instanceof ViewGroup) {
            getParent();
            if (getClipBounds() == null) {
                Rect rect = this.LLJLL;
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int scrollX2 = getScrollX();
                Rect rect2 = this.LLLIIII;
                if (rect2 == null) {
                    iWidth = getWidth();
                } else {
                    iWidth = rect2.width();
                }
                int i2 = scrollX2 + iWidth;
                int scrollY2 = getScrollY();
                Rect rect3 = this.LLLIIII;
                if (rect3 == null) {
                    iHeight = getHeight();
                } else {
                    iHeight = rect3.height();
                }
                rect.set(scrollX, scrollY, i2, scrollY2 + iHeight);
                canvas.clipRect(this.LLJLL);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (C788530UwV.LIZ("dispatchScrollViewTouchEvent")) {
            C2188191AkT.LIZLLL();
        }
        if (this.LLJJ.isEnableNewGesture()) {
            if (Boolean.FALSE.equals(this.LLJILJILJ)) {
                return true;
            }
            if (motionEvent.getActionMasked() == 2 && this.LLJILJILJ != null && !this.LLJILJIL) {
                motionEvent.setAction(0);
                this.LLJILJIL = true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // X.C1318620kQ0, android.widget.ScrollView
    public final void fling(int i) {
        super.fling(i);
        if (this.LLLI == 1) {
            LJFF(2);
        }
        ArrayList<InterfaceC1318670kQ5> arrayList = this.LLJJJJLIIL;
        if (arrayList != null) {
            for (InterfaceC1318670kQ5 interfaceC1318670kQ5 : arrayList) {
                if (interfaceC1318670kQ5 != null) {
                    interfaceC1318670kQ5.LIZJ();
                }
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.LLJJLIIIJLLLLLLLZ != null) {
            this.LLJJLIIIJLLLLLLLZ.LJ(canvas);
        } else {
            super.onDraw(canvas);
        }
    }

    @Override // X.C1318620kQ0, android.widget.ScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LLJJJ) {
            return false;
        }
        if (this.LLJIJIL) {
            return true;
        }
        if (this.LLJJ.LLJJ) {
            requestDisallowInterceptTouchEvent(true);
        }
        if (LJ() || LIZLLL(motionEvent)) {
            return false;
        }
        if (this.LLJJ.isEnableNewGesture() && this.LLJILLL != null && this.LLJILLL.booleanValue()) {
            return this.LLJILLL.booleanValue();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // X.C1318620kQ0, android.widget.ScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (this.LLJJJ || this.LLJI || LJ()) {
            return false;
        }
        if (LIZLLL(motionEvent)) {
            if (motionEvent.getActionMasked() == 1) {
                this.LLJJJIL = false;
            }
            return false;
        }
        if (this.LLJJ.isEnableNewGesture() && this.LLJILLL != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (motionEvent.getActionMasked() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            } else {
                if (motionEvent.getActionMasked() == 2) {
                    getParent().requestDisallowInterceptTouchEvent(this.LLJILLL.booleanValue());
                    boolean zBooleanValue = this.LLJILLL.booleanValue();
                    if (!this.LLJILLL.booleanValue()) {
                        return super.onTouchEvent(motionEvent);
                    }
                    return zBooleanValue;
                }
                if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
                    this.LLJILLL = null;
                }
            }
        }
        if (motionEvent.getAction() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LLLFFI = z2;
        try {
            try {
                boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 1) {
                    this.LLJJJIL = false;
                    this.LLLFFI = false;
                    this.LLJJ.LJJJJIZL();
                    stopNestedScroll(0);
                } else {
                    if (motionEvent.getAction() == 0) {
                        this.LLJJJIL = true;
                        this.LLJJ.LJJJJI(this.LLLI);
                        return zOnTouchEvent;
                    }
                    if (motionEvent.getAction() == 3) {
                        this.LLLFFI = false;
                        stopNestedScroll(0);
                        return zOnTouchEvent;
                    }
                }
                return zOnTouchEvent;
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AndroidScrollView onTouchEvent: ");
                sbLIZ.append(motionEvent.getAction());
                sbLIZ.append(", ");
                sbLIZ.append(e.getMessage());
                LynxLog.e("LynxUIScrollView", C2188811AlT.LIZIZ(sbLIZ));
                if (motionEvent.getAction() == 1) {
                    this.LLJJJIL = false;
                    this.LLLFFI = false;
                    this.LLJJ.LJJJJIZL();
                    stopNestedScroll(0);
                } else {
                    if (motionEvent.getAction() == 0) {
                        this.LLJJJIL = true;
                        this.LLJJ.LJJJJI(this.LLLI);
                        return false;
                    }
                    if (motionEvent.getAction() == 3) {
                        this.LLLFFI = false;
                        stopNestedScroll(0);
                        return false;
                    }
                }
                return false;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (motionEvent.getAction() == 1) {
                this.LLJJJIL = false;
                this.LLLFFI = false;
                this.LLJJ.LJJJJIZL();
                stopNestedScroll(0);
            } else {
                if (motionEvent.getAction() == 0) {
                    this.LLJJJIL = true;
                    this.LLJJ.LJJJJI(this.LLLI);
                    return false;
                }
                if (motionEvent.getAction() == 3) {
                    this.LLLFFI = false;
                    stopNestedScroll(0);
                    return false;
                }
            }
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.LLJJIII) {
            C786410Ut5.LJJL(view, this.LLJJI);
        } else {
            super.removeView(view);
            this.LLJJIII = true;
        }
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        if (this.LLJJIII) {
            C786410Ut5.LJJLJ(i, this.LLJJI);
        } else {
            super.removeViewAt(i);
            this.LLJJIII = true;
        }
    }

    public void setBlockDescendantFocusability(boolean z) {
        this.LLJZ = z;
    }

    @Override // android.view.View
    public void setClipBounds(Rect rect) {
        this.LLLIIII = rect;
    }

    public void setEnableScroll(boolean z) {
        ATListenerS14S0010000_20 aTListenerS14S0010000_20 = new ATListenerS14S0010000_20(z, 1);
        this.LLJJIJI.setOnTouchListener(aTListenerS14S0010000_20);
        setOnTouchListener(aTListenerS14S0010000_20);
    }

    public void setForbidFlingFocusChange(boolean z) {
        this.LLLFF = z;
    }

    public void setForceCanScroll(boolean z) {
        this.LLLFZ = z;
    }

    public void setOnScrollListener(InterfaceC1318670kQ5 interfaceC1318670kQ5) {
        if (this.LLJJJJLIIL == null) {
            this.LLJJJJLIIL = new ArrayList<>();
        }
        if (interfaceC1318670kQ5 != null) {
            this.LLJJJJLIIL.add(interfaceC1318670kQ5);
        }
    }

    public void setOrientation(int i) {
        if (i == 0) {
            setOrientation(0);
            this.LLJJJ = true;
        } else {
            if (i != 1) {
                return;
            }
            setOrientation(1);
            this.LLJJJ = false;
        }
    }

    @Override // X.InterfaceC1311940kFE
    public void setRenderer(C1311970kFH c1311970kFH) {
        this.LLJJLIIIJLLLLLLLZ = c1311970kFH;
    }

    public void setScrollBarEnable(boolean z) {
        setVerticalScrollBarEnabled(z);
    }

    public void setScrollToIndex(int i) {
        int childCount;
        int left;
        UIScrollView uIScrollView = this.LLJJ;
        if (uIScrollView != null && (childCount = uIScrollView.getChildCount()) != 0 && i >= 0 && i < childCount && this.LLJJ.getChildAt(i) != null) {
            if (this.LLJJJ) {
                int scrollY = this.LLJJIJI.getScrollY();
                this.LLJJIJI.getScrollX();
                LynxBaseUI childAt = this.LLJJ.getChildAt(i);
                if (getLayoutDirection() == 1) {
                    left = (childAt.getLeft() + childAt.getWidth()) - this.LLJJ.getWidth();
                } else {
                    left = childAt.getLeft();
                }
                LJII(left, scrollY, false);
                return;
            }
            LJII(getScrollX(), this.LLJJ.getChildAt(i).getTop(), false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0kQ1] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0kQ4, android.widget.LinearLayout] */
    public C1318590kPx(Context context, UIScrollView uIScrollView) {
        super(context, uIScrollView);
        this.LLJILJIL = true;
        this.LLJJ = uIScrollView;
        setVerticalScrollBarEnabled(false);
        setOverScrollMode(2);
        setFadingEdgeLength(0);
        setScrollContainer(false);
        this.LLJLL = new Rect();
        this.LLJJJJLIIL = new ArrayList<>();
        if (this.LLJJI == null) {
            final Context context2 = getContext();
            ?? r1 = new LinearLayout(context2) { // from class: X.0kQ4
                @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                }

                @Override // android.view.View
                public final boolean canScrollHorizontally(int i) {
                    if (this.LL.LLJJ.isEnableNewGesture()) {
                        return super.canScrollHorizontally(i);
                    }
                    C1318590kPx c1318590kPx = this.LL;
                    if ((!c1318590kPx.LLLFZ || !c1318590kPx.LLJJJ) && !super.canScrollHorizontally(i)) {
                        return false;
                    }
                    return true;
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void dispatchDraw(Canvas canvas) {
                    InterfaceC1314130kIl interfaceC1314130kIl = this.LL.LLJJL;
                    if (interfaceC1314130kIl != null) {
                        interfaceC1314130kIl.beforeDispatchDraw(canvas);
                    }
                    super.dispatchDraw(canvas);
                    InterfaceC1314130kIl interfaceC1314130kIl2 = this.LL.LLJJL;
                    if (interfaceC1314130kIl2 != null) {
                        interfaceC1314130kIl2.afterDispatchDraw(canvas);
                    }
                }

                @Override // android.widget.LinearLayout, android.view.View
                public final void onMeasure(int i, int i2) {
                    C1318590kPx c1318590kPx = this.LL;
                    setMeasuredDimension(c1318590kPx.LLJJJJ, c1318590kPx.LLJJJJJIL);
                }

                @Override // android.view.ViewGroup
                public final boolean drawChild(Canvas canvas, View view, long j) {
                    boolean zDrawChild;
                    Rect rectBeforeDrawChild;
                    InterfaceC1314130kIl interfaceC1314130kIl = this.LL.LLJJL;
                    if (interfaceC1314130kIl != null && (rectBeforeDrawChild = interfaceC1314130kIl.beforeDrawChild(canvas, view, j)) != null) {
                        canvas.save();
                        canvas.clipRect(rectBeforeDrawChild);
                        zDrawChild = super.drawChild(canvas, view, j);
                        canvas.restore();
                    } else {
                        zDrawChild = super.drawChild(canvas, view, j);
                    }
                    InterfaceC1314130kIl interfaceC1314130kIl2 = this.LL.LLJJL;
                    if (interfaceC1314130kIl2 != null) {
                        interfaceC1314130kIl2.afterDrawChild(canvas, view, j);
                    }
                    return zDrawChild;
                }
            };
            this.LLJJI = r1;
            r1.setOrientation(1);
            setWillNotDraw(true);
            setFocusableInTouchMode(true);
            C1318600kPy c1318600kPy = new C1318600kPy(this, getContext(), uIScrollView);
            this.LLJJIJI = c1318600kPy;
            c1318600kPy.setOverScrollMode(2);
            this.LLJJIJI.setFadingEdgeLength(0);
            this.LLJJIJI.setWillNotDraw(true);
            this.LLJJIJI.addView(this.LLJJI, new FrameLayout.LayoutParams(-1, -1));
            addView(this.LLJJIJI, new FrameLayout.LayoutParams(-2, -2));
        }
        this.LLJL = new Runnable(this) { // from class: X.0kQ1
            public final WeakReference<C1318590kPx> LL;

            public final void LIZ() {
                if (this.LL.get() != null) {
                    C1318590kPx c1318590kPx = this.LL.get();
                    int scrollY = c1318590kPx.getScrollY();
                    int scrollX = c1318590kPx.LLJJIJI.getScrollX();
                    boolean z = !c1318590kPx.LLJJJ ? c1318590kPx.LLJLIL - scrollY != 0 : c1318590kPx.LLJLILLLLZIIL - scrollX != 0;
                    if (c1318590kPx.LLJJJIL || !z) {
                        c1318590kPx.LLJLIL = scrollY;
                        c1318590kPx.LLJLILLLLZIIL = scrollX;
                        HandlerHook.viewPostDelay(c1318590kPx, this, 100L);
                        return;
                    }
                    c1318590kPx.LJFF(0);
                    ArrayList<InterfaceC1318670kQ5> arrayList = c1318590kPx.LLJJJJLIIL;
                    if (arrayList != null) {
                        for (InterfaceC1318670kQ5 interfaceC1318670kQ5 : arrayList) {
                            if (interfaceC1318670kQ5 != null) {
                                interfaceC1318670kQ5.LJIJJLI();
                            }
                        }
                    }
                    c1318590kPx.LLJJ.LJJJJIZL();
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AndroidScrollView$ScrollerEndDetectionTask@cd71.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AndroidScrollView$ScrollerEndDetectionTask@cd71.run");
            }

            {
                this.LL = new WeakReference<>(this);
            }
        };
    }

    public final void LJI(int i, int i2) {
        int iLJJJJZI = this.LLJJ.LJJJJZI(i, i2, 0, 0);
        UIScrollView uIScrollView = this.LLJJ;
        if (uIScrollView.LLILZIL && (iLJJJJZI & 2) != 0) {
            uIScrollView.LJJJJJL(getScrollX(), getScrollY(), getScrollX(), getScrollY(), "scrolltoloweredge");
        }
        UIScrollView uIScrollView2 = this.LLJJ;
        if (uIScrollView2.LLILLL && (iLJJJJZI & 1) != 0) {
            uIScrollView2.LJJJJJL(getScrollX(), getScrollY(), getScrollX(), getScrollY(), "scrolltoupperedge");
        }
        UIScrollView uIScrollView3 = this.LLJJ;
        if (uIScrollView3.LLILZLL && (iLJJJJZI & 1) == 0 && (iLJJJJZI & 2) == 0) {
            uIScrollView3.LJJJJJL(getScrollX(), getScrollY(), getScrollX(), getScrollY(), "scrolltonormalstate");
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        if (this.LLJJIII) {
            addView(view, i);
        } else {
            super.addView(view, i);
            this.LLJJIII = true;
        }
    }

    @Override // X.InterfaceC1311940kFE
    public final C1311970kFH createRenderer(PlatformRendererContext platformRendererContext, int i) {
        return new C1311970kFH(platformRendererContext, i);
    }

    @Override // X.C1318620kQ0, android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        boolean zDispatchNestedPreFling = super.dispatchNestedPreFling(f, f2);
        if (zDispatchNestedPreFling) {
            LJIIIZ(4);
        }
        return zDispatchNestedPreFling;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (this.LLJJIII) {
            addView(view, layoutParams);
        } else {
            super.addView(view, layoutParams);
            this.LLJJIII = true;
        }
    }

    public final void LJII(int i, int i2, boolean z) {
        if (this.LLJJIJIL == i && this.LLJJIJIIJIL == i2) {
            return;
        }
        if (z) {
            if (this.LLJJJ) {
                this.LLJJIJI.setSmoothScrollingEnabled(true);
                this.LLJJIJI.LIZJ(i, i2);
                return;
            } else {
                setSmoothScrollingEnabled(true);
                LIZIZ(i, i2);
                return;
            }
        }
        if (this.LLJJJ) {
            LIZJ(this.LLJJIJI);
            this.LLJJIJI.scrollTo(i, i2);
        } else {
            LIZJ(this);
            scrollTo(i, i2);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        if (this.LLJJIII) {
            addView(view, i, i2);
        } else {
            super.addView(view, i, i2);
            this.LLJJIII = true;
        }
    }

    @Override // X.C1318620kQ0, android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        boolean zDispatchNestedFling = super.dispatchNestedFling(f, f2, z);
        if (zDispatchNestedFling) {
            LJIIIZ(4);
        }
        return zDispatchNestedFling;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        C1311970kFH c1311970kFH = this.LLJJLIIIJLLLLLLLZ;
        if (c1311970kFH != null) {
            c1311970kFH.LIZIZ(canvas, view);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        C1311970kFH c1311970kFH2 = this.LLJJLIIIJLLLLLLLZ;
        if (c1311970kFH2 != null) {
            c1311970kFH2.getClass();
            canvas.restore();
        }
        return zDrawChild;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.LLJJIII) {
            addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
            this.LLJJIII = true;
        }
    }

    @Override // X.C1318620kQ0, android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        boolean zDispatchNestedPreScroll = super.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        if (zDispatchNestedPreScroll) {
            LJIIIZ(4);
        }
        return zDispatchNestedPreScroll;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (i2 == this.LLJJIJIIJIL) {
            return;
        }
        this.LLJJIJIIJIL = getScrollY();
        if (this.LLLI == 0) {
            LJIIIIZZ();
        }
        ArrayList<InterfaceC1318670kQ5> arrayList = this.LLJJJJLIIL;
        if (arrayList != null) {
            for (InterfaceC1318670kQ5 interfaceC1318670kQ5 : arrayList) {
                if (interfaceC1318670kQ5 != null) {
                    interfaceC1318670kQ5.onScrollChanged(i, i2, i3, i4);
                }
            }
        }
        if (!this.LLJJJIL && !this.LLJLLL) {
            this.LLJJ.LJJJJIZL();
        }
        LJI(i, i2);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        setPadding(i, i2, i3, i4);
    }

    @Override // X.C1318620kQ0, X.InterfaceC20097013kG
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        boolean zDispatchNestedPreScroll = super.dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
        if (zDispatchNestedPreScroll) {
            LJIIIZ(4);
        }
        return zDispatchNestedPreScroll;
    }

    @Override // X.C1318620kQ0, android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        boolean zDispatchNestedScroll = super.dispatchNestedScroll(i, i2, i3, i4, iArr);
        if (zDispatchNestedScroll) {
            LJIIIZ(4);
        }
        return zDispatchNestedScroll;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        LynxUI<ViewGroup> lynxUI;
        C1311970kFH c1311970kFH = this.LLJJLIIIJLLLLLLLZ;
        if (c1311970kFH != null && (lynxUI = c1311970kFH.LJII) != null) {
            lynxUI.measure();
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.LLJJLIIIJLLLLLLLZ != null && this.LLJJI != null) {
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                if (childAt instanceof InterfaceC1311940kFE) {
                    Rect rect = ((InterfaceC1311940kFE) childAt).getRenderer().LIZ;
                    childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
                }
            }
        }
        if (!this.LLJJJ) {
            int i6 = this.LLJ.LJFF;
            if (this.LLILZIL && i6 > 0 && i6 != getScrollY()) {
                LJII(getScrollX(), i6, false);
            }
        }
    }

    @Override // X.C1318620kQ0
    public final boolean LIZ(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        boolean zLIZ = super.LIZ(i, i2, i3, i4, iArr, i5);
        if (zLIZ) {
            LJIIIZ(4);
        }
        return zLIZ;
    }
}
