package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.behavior.render.PlatformRendererContext;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.list.container.ListContainerProxy;
import com.lynx.tasm.behavior.ui.list.container.UIListContainer;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: X.0kO9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1317470kO9 extends C1317480kOA implements InterfaceC1314720kJi, InterfaceC1311940kFE {
    public UIListContainer LLJJJJLIIL;
    public C1317490kOB LLJJL;
    public Boolean LLJJLIIIJLLLLLLLZ;
    public Boolean LLJL;
    public boolean LLJLIL;
    public InterfaceC1314130kIl LLJLILLLLZIIL;
    public boolean LLJLL;
    public int LLJLLIL;
    public int LLJLLL;
    public int LLJZ;
    public int LLJZIJLIL;
    public int LLL;
    public int LLLF;
    public Boolean LLLFF;
    public boolean LLLFFI;
    public ViewTreeObserverOnPreDrawListenerC1317500kOC LLLFZ;
    public RunnableC742540TAu LLLI;
    public boolean LLLII;
    public final ArrayDeque<Runnable> LLLIIII;
    public boolean LLLIIIIL;
    public int LLLIIIL;
    public int LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public boolean LLLILZ;
    public boolean LLLILZJ;
    public float LLLILZLLLI;
    public C1311970kFH LLLIZZ;

    @Override // X.InterfaceC1311940kFE
    public View getView() {
        return this;
    }

    public void setPanInterceptAncestors(boolean z) {
    }

    @Override // X.C1317480kOA
    public final boolean LJ() {
        UIListContainer uIListContainer = this.LLJJJJLIIL;
        if (uIListContainer == null) {
            return false;
        }
        return uIListContainer.isRtl();
    }

    public final void LJIIJ() {
        if (this.LLLII) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("force doWorkEndDrawTraversal, this.hashCode=");
            sbLIZ.append(hashCode());
            LynxLog.d("ListContainerView", C2188811AlT.LIZIZ(sbLIZ));
            RunnableC742540TAu runnableC742540TAu = this.LLLI;
            if (runnableC742540TAu != null) {
                HandlerHook.viewRemoveCallbacks(this, runnableC742540TAu);
            }
            LJIIIZ();
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        C1317490kOB c1317490kOB = this.LLJJL;
        if (c1317490kOB != null) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1317490kOB, null);
            c1317490kOB.removeAllViews();
        }
    }

    public final void LJIIIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doWorkEndDrawTraversal, this.hashCode=");
        sbLIZ.append(hashCode());
        LynxLog.d("ListContainerView", C2188811AlT.LIZIZ(sbLIZ));
        this.LLLII = false;
        this.LLLFFI = false;
        if (this.LLLIIII.isEmpty()) {
            return;
        }
        ArrayDeque arrayDeque = new ArrayDeque(this.LLLIIII);
        this.LLLIIII.clear();
        while (!arrayDeque.isEmpty()) {
            Runnable runnable = (Runnable) arrayDeque.poll();
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Exception occurred while running pending draw task: ");
                    sbLIZ2.append(e);
                    LynxLog.e("ListContainerView", C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        }
    }

    public final void LJIIL() {
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (this.LLLFZ == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        ViewTreeObserverOnPreDrawListenerC1317500kOC viewTreeObserverOnPreDrawListenerC1317500kOC = this.LLLFZ;
        viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1317500kOC);
        C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnPreDrawListenerC1317500kOC, ViewTreeObserver.OnPreDrawListener.class);
        this.LLLFZ = null;
    }

    @Override // android.view.View
    public final void computeScroll() {
        C1311400kEM gestureArenaManager;
        super.computeScroll();
        UIListContainer uIListContainer = this.LLJJJJLIIL;
        if (uIListContainer == null || !uIListContainer.isEnableNewGesture() || (gestureArenaManager = this.LLJJJJLIIL.getGestureArenaManager()) == null) {
            return;
        }
        gestureArenaManager.LIZ();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0kOC] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAttachedToWindow: this.hashCode=");
        sbLIZ.append(hashCode());
        sbLIZ.append(", ui = ");
        sbLIZ.append(this.LLJJJJLIIL);
        LynxLog.i("ListContainerView", C2188811AlT.LIZIZ(sbLIZ));
        super.onAttachedToWindow();
        if (Boolean.TRUE.equals(this.LLLFF)) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (this.LLLFZ == null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
                this.LLLFZ = new ViewTreeObserver.OnPreDrawListener(this) { // from class: X.0kOC
                    public final WeakReference<C1317470kO9> LL;

                    /* JADX WARN: Type inference failed for: r0v7, types: [X.0TAu] */
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public final boolean onPreDraw() {
                        C1317470kO9 c1317470kO9 = this.LL.get();
                        if (c1317470kO9 != null) {
                            c1317470kO9.LJIIJ();
                            c1317470kO9.LLLFFI = true;
                            if (c1317470kO9.LLLI == null) {
                                c1317470kO9.LLLI = new Runnable(c1317470kO9) { // from class: X.0TAu
                                    public final WeakReference<C1317470kO9> LL;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean zLIZ;
                                        C1C7U.LIZ("ListContainerView$EndDrawTraversalRunnable@cb97.run");
                                        try {
                                            C1317470kO9 c1317470kO92 = this.LL.get();
                                            if (c1317470kO92 != null) {
                                                c1317470kO92.LJIIIZ();
                                            }
                                        } finally {
                                            if (!zLIZ) {
                                            }
                                        }
                                        C1C7U.LIZIZ("ListContainerView$EndDrawTraversalRunnable@cb97.run");
                                    }

                                    {
                                        this.LL = new WeakReference<>(c1317470kO9);
                                    }
                                };
                            }
                            if (!c1317470kO9.LLLII) {
                                c1317470kO9.LLLII = true;
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("post EndDrawTraversalRunnable, this.hashCode=");
                                sbLIZ2.append(c1317470kO9.hashCode());
                                LynxLog.d("ListContainerView", C2188811AlT.LIZIZ(sbLIZ2));
                                HandlerHook.viewPost(c1317470kO9, c1317470kO9.LLLI);
                            }
                        }
                        return true;
                    }

                    {
                        this.LL = new WeakReference<>(this);
                    }
                };
                ViewTreeObserverOnPreDrawListenerC1317500kOC viewTreeObserverOnPreDrawListenerC1317500kOC = this.LLLFZ;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1317500kOC);
                C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnPreDrawListenerC1317500kOC, ViewTreeObserver.OnPreDrawListener.class);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDetachedFromWindow: this.hashCode=");
        sbLIZ.append(hashCode());
        sbLIZ.append(", ui = ");
        sbLIZ.append(this.LLJJJJLIIL);
        LynxLog.i("ListContainerView", C2188811AlT.LIZIZ(sbLIZ));
        if (Boolean.TRUE.equals(this.LLLFF)) {
            LJIIL();
        }
        super.onDetachedFromWindow();
    }

    public LinearLayout getLinearLayout() {
        return this.LLJJL;
    }

    @Override // X.InterfaceC1311940kFE
    public C1311970kFH getRenderer() {
        return this.LLLIZZ;
    }

    @Override // X.C1317480kOA
    public final void LJFF(boolean z) {
        UIListContainer uIListContainer = this.LLJJJJLIIL;
        if (uIListContainer != null && z) {
            uIListContainer.recognizeGesturere();
        }
    }

    public final int LJIIIIZZ(float f) {
        return (int) Math.max((this.LLJLLIL - f) - this.LLJJJJLIIL.getWidth(), 0.0f);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        C1317490kOB c1317490kOB = this.LLJJL;
        if (c1317490kOB != null) {
            if (c1317490kOB == view) {
                super.addView(c1317490kOB);
            } else {
                c1317490kOB.addView(view);
            }
        }
    }

    @Override // X.InterfaceC1314720kJi
    public final void bindDrawChildHook(InterfaceC1314130kIl interfaceC1314130kIl) {
        this.LLJLILLLLZIIL = interfaceC1314130kIl;
    }

    @Override // X.C1317480kOA, android.view.View
    public final boolean canScrollHorizontally(int i) {
        if ((!this.LLLIILIL || this.LLJLL) && !super.canScrollHorizontally(i)) {
            return false;
        }
        return true;
    }

    @Override // X.C1317480kOA, android.view.View
    public final boolean canScrollVertically(int i) {
        if ((!this.LLLIILIL || !this.LLJLL) && !super.canScrollVertically(i)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        C1311970kFH c1311970kFH = this.LLLIZZ;
        if (c1311970kFH != null) {
            c1311970kFH.LIZ(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        UIListContainer uIListContainer = this.LLJJJJLIIL;
        if (uIListContainer == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (uIListContainer.isEnableNewGesture()) {
            if (Boolean.FALSE.equals(this.LLJJLIIIJLLLLLLLZ)) {
                return true;
            }
            if (motionEvent.getActionMasked() == 2 && this.LLJJLIIIJLLLLLLLZ != null && !this.LLJLIL) {
                motionEvent.setAction(0);
                this.LLJLIL = true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.LLLIZZ != null) {
            this.LLLIZZ.LJ(canvas);
        } else {
            super.onDraw(canvas);
        }
    }

    @Override // X.C1317480kOA, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Boolean bool;
        UIListContainer uIListContainer = this.LLJJJJLIIL;
        if (uIListContainer == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (this.LLLILZ) {
            return true;
        }
        if (uIListContainer.isEnableNewGesture() && !this.LLJJJJLIIL.mIncludeNativeGesture) {
            return false;
        }
        if (this.LLJJJJLIIL.isEnableNewGesture() && (bool = this.LLJJLIIIJLLLLLLLZ) != null && !bool.booleanValue() && motionEvent.getActionMasked() != 0) {
            return false;
        }
        if (this.LLJJJJLIIL.isEnableNewGesture() && this.LLJL != null && this.LLJL.booleanValue()) {
            return this.LLJL.booleanValue();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // X.C1317480kOA, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Boolean bool;
        UIListContainer uIListContainer = this.LLJJJJLIIL;
        if (uIListContainer == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.LLLIL) {
            return false;
        }
        if (uIListContainer.isEnableNewGesture() && !this.LLJJJJLIIL.mIncludeNativeGesture) {
            return false;
        }
        if (this.LLJJJJLIIL.isEnableNewGesture() && (bool = this.LLJJLIIIJLLLLLLLZ) != null && !bool.booleanValue() && motionEvent.getActionMasked() != 0) {
            return false;
        }
        if (this.LLJJJJLIIL.isEnableNewGesture() && this.LLJL != null) {
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            } else {
                if (motionEvent.getAction() == 2) {
                    getParent().requestDisallowInterceptTouchEvent(this.LLJL.booleanValue());
                    boolean zBooleanValue = this.LLJL.booleanValue();
                    if (!this.LLJL.booleanValue()) {
                        return super.onTouchEvent(motionEvent);
                    }
                    return zBooleanValue;
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.LLJL = null;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        C1317490kOB c1317490kOB = this.LLJJL;
        if (c1317490kOB != null) {
            if (c1317490kOB == view) {
                super.removeView(c1317490kOB);
            } else {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1317490kOB, view);
                c1317490kOB.removeView(view);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        C1317490kOB c1317490kOB = this.LLJJL;
        if (c1317490kOB != null) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1317490kOB, null);
            c1317490kOB.removeViewAt(i);
        }
    }

    public void setForceCanScroll(boolean z) {
        this.LLLIILIL = z;
    }

    public void setMaxFlingDistanceRatio(float f) {
        this.LLLILZLLLI = f;
    }

    public void setOrientation(int i) {
        boolean z;
        int i2 = 0;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LLJLL = z;
        setIsVertical(z);
        C1317490kOB c1317490kOB = this.LLJJL;
        if (c1317490kOB != null) {
            if (i == 1) {
                i2 = 1;
            }
            c1317490kOB.setOrientation(i2);
        }
    }

    public void setPanInterceptDescendants(boolean z) {
        this.LLLILZ = z;
    }

    public void setPanInterceptSelf(boolean z) {
        this.LLLIL = z;
    }

    @Override // X.InterfaceC1311940kFE
    public void setRenderer(C1311970kFH c1311970kFH) {
        this.LLLIZZ = c1311970kFH;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0kOB] */
    public C1317470kO9(Context context, UIListContainer uIListContainer) {
        super(context);
        this.LLJLIL = true;
        this.LLJLL = true;
        this.LLLIIII = new ArrayDeque<>();
        this.LLLIIIIL = false;
        this.LLLIILIL = false;
        this.LLLIL = false;
        this.LLLILZ = false;
        this.LLLILZJ = false;
        this.LLLILZLLLI = -1.0f;
        this.LLJJJJLIIL = uIListContainer;
        if (this.LLJJL == null) {
            final Context context2 = getContext();
            this.LLJJL = new LinearLayout(context2) { // from class: X.0kOB
                @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void dispatchDraw(Canvas canvas) {
                    InterfaceC1314130kIl interfaceC1314130kIl = this.LL.LLJLILLLLZIIL;
                    if (interfaceC1314130kIl != null) {
                        interfaceC1314130kIl.beforeDispatchDraw(canvas);
                    }
                    super.dispatchDraw(canvas);
                    InterfaceC1314130kIl interfaceC1314130kIl2 = this.LL.LLJLILLLLZIIL;
                    if (interfaceC1314130kIl2 != null) {
                        interfaceC1314130kIl2.afterDispatchDraw(canvas);
                    }
                }

                @Override // android.widget.LinearLayout, android.view.View
                public final void onMeasure(int i, int i2) {
                    C1317470kO9 c1317470kO9 = this.LL;
                    UIListContainer uIListContainer2 = c1317470kO9.LLJJJJLIIL;
                    if (uIListContainer2 == null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("CustomLinearLayout$$onMeasure: mUiListContainer is null: ");
                        sbLIZ.append(this);
                        sbLIZ.append(", ");
                        sbLIZ.append(this.LL);
                        LynxLog.e("ListContainerView", C2188811AlT.LIZIZ(sbLIZ));
                        setMeasuredDimension(0, 0);
                        return;
                    }
                    int width = c1317470kO9.LLJLLIL;
                    if (width <= 0) {
                        width = uIListContainer2.getWidth();
                    }
                    C1317470kO9 c1317470kO92 = this.LL;
                    int height = c1317470kO92.LLJLLL;
                    if (height <= 0) {
                        height = c1317470kO92.LLJJJJLIIL.getHeight();
                    }
                    setMeasuredDimension(width, height);
                }

                @Override // android.view.ViewGroup
                public final boolean drawChild(Canvas canvas, View view, long j) {
                    boolean zDrawChild;
                    Rect rectBeforeDrawChild;
                    InterfaceC1314130kIl interfaceC1314130kIl = this.LL.LLJLILLLLZIIL;
                    if (interfaceC1314130kIl != null && (rectBeforeDrawChild = interfaceC1314130kIl.beforeDrawChild(canvas, view, j)) != null) {
                        canvas.save();
                        canvas.clipRect(rectBeforeDrawChild);
                        zDrawChild = super.drawChild(canvas, view, j);
                        canvas.restore();
                    } else {
                        zDrawChild = super.drawChild(canvas, view, j);
                    }
                    InterfaceC1314130kIl interfaceC1314130kIl2 = this.LL.LLJLILLLLZIIL;
                    if (interfaceC1314130kIl2 != null) {
                        interfaceC1314130kIl2.afterDrawChild(canvas, view, j);
                    }
                    return zDrawChild;
                }
            };
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Create CustomLinearLayout: ");
            sbLIZ.append(this.LLJJL);
            sbLIZ.append(", this.hashCode=");
            sbLIZ.append(hashCode());
            LynxLog.i("ListContainerView", C2188811AlT.LIZIZ(sbLIZ));
        }
        setOrientation(1);
        setWillNotDraw(true);
        setFocusableInTouchMode(true);
        addView(this.LLJJL, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // X.C1317480kOA
    public final float[] LIZLLL(int i, int i2) {
        float f;
        int width;
        float f2;
        float f3 = this.LLLILZLLLI;
        if (f3 > 0.0f) {
            boolean z = this.LLJLL;
            if (z) {
                f = i2;
            } else {
                f = i;
            }
            float f4 = Float.MAX_VALUE;
            if (f3 == Float.MAX_VALUE) {
                C1317540kOG c1317540kOGLJIIJJI = LJIIJJI(f, true);
                C1317540kOG c1317540kOGLJIIJJI2 = LJIIJJI(f, false);
                if (c1317540kOGLJIIJJI.LIZ) {
                    f2 = c1317540kOGLJIIJJI.LIZIZ - f;
                } else {
                    f2 = Float.MAX_VALUE;
                }
                if (c1317540kOGLJIIJJI2.LIZ) {
                    f4 = f - c1317540kOGLJIIJJI2.LIZIZ;
                }
            } else {
                if (z) {
                    width = getHeight();
                } else {
                    width = getWidth();
                }
                f2 = f3 * width;
                f4 = f2;
            }
            return new float[]{f2, f4};
        }
        return super.LIZLLL(i, i2);
    }

    public final C1317540kOG LJIIJJI(float f, boolean z) {
        int i;
        float x;
        int i2;
        int width;
        int width2;
        float x2;
        int width3;
        if (getChildCount() > 0 && (getChildAt(0) instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) getChildAt(0);
            if (viewGroup.getChildCount() == 0) {
                return new C1317540kOG(f, true);
            }
            float f2 = 0.0f;
            if (z) {
                if (this.LLJLL) {
                    i2 = this.LLLF;
                    width = viewGroup.getHeight();
                } else {
                    i2 = this.LLJZIJLIL;
                    width = viewGroup.getWidth();
                }
                if (this.LLJLL) {
                    width2 = getHeight();
                } else {
                    width2 = getWidth();
                }
                float f3 = Float.MIN_VALUE;
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    if (this.LLJLL) {
                        x2 = childAt.getY();
                        width3 = childAt.getHeight();
                    } else {
                        x2 = childAt.getX();
                        width3 = childAt.getWidth();
                    }
                    float f4 = x2 + width3;
                    if (f3 < f4) {
                        f3 = f4;
                    }
                }
                float f5 = width;
                if (C1314000kIY.LIZ(i2 + f3, f5)) {
                    if (this.LLJJJIL.LJIIIIZZ(1)) {
                        return new C1317540kOG(0.0f, false);
                    }
                    f3 = f5;
                }
                return new C1317540kOG(f3 - width2, true);
            }
            if (this.LLJLL) {
                i = this.LLL;
            } else {
                i = this.LLJZ;
            }
            float f6 = Float.MAX_VALUE;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                View childAt2 = viewGroup.getChildAt(i4);
                if (this.LLJLL) {
                    x = childAt2.getY();
                } else {
                    x = childAt2.getX();
                }
                if (f6 > x) {
                    f6 = x;
                }
            }
            if (C1314000kIY.LIZ(f6 - i, 0.0f)) {
                if (this.LLJJJIL.LJIIIIZZ(1)) {
                    return new C1317540kOG(0.0f, false);
                }
            } else {
                f2 = f6;
            }
            return new C1317540kOG(f2, true);
        }
        return new C1317540kOG(f, true);
    }

    public final void LJIILIIL(int i, int i2) {
        if (this.LLJLLIL != i || this.LLJLLL != i2) {
            this.LLJLLL = i2;
            this.LLJLLIL = i;
            C1317490kOB c1317490kOB = this.LLJJL;
            if (c1317490kOB != null) {
                c1317490kOB.requestLayout();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        C1317490kOB c1317490kOB = this.LLJJL;
        if (c1317490kOB != null) {
            if (c1317490kOB == view) {
                super.addView(c1317490kOB, i);
            } else {
                c1317490kOB.addView(view, i);
            }
        }
    }

    @Override // X.InterfaceC1311940kFE
    public final C1311970kFH createRenderer(PlatformRendererContext platformRendererContext, int i) {
        return new C1311970kFH(platformRendererContext, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        C1317490kOB c1317490kOB = this.LLJJL;
        if (c1317490kOB != null) {
            if (c1317490kOB == view) {
                super.addView(c1317490kOB, layoutParams);
            } else {
                c1317490kOB.addView(view, layoutParams);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        C1317490kOB c1317490kOB = this.LLJJL;
        if (c1317490kOB != null) {
            if (c1317490kOB == view) {
                super.addView(c1317490kOB, i, i2);
            } else {
                c1317490kOB.addView(view, i, i2);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        C1311970kFH c1311970kFH = this.LLLIZZ;
        if (c1311970kFH != null) {
            c1311970kFH.LIZIZ(canvas, view);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        C1311970kFH c1311970kFH2 = this.LLLIZZ;
        if (c1311970kFH2 != null) {
            c1311970kFH2.getClass();
            canvas.restore();
        }
        return zDrawChild;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        C1317490kOB c1317490kOB = this.LLJJL;
        if (c1317490kOB != null) {
            if (c1317490kOB == view) {
                super.addView(c1317490kOB, i, layoutParams);
            } else {
                c1317490kOB.addView(view, i, layoutParams);
            }
        }
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        UIListContainer uIListContainer;
        int iLJIIIIZZ;
        super.onScrollChanged(i, i2, i3, i4);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onScrollChanged: ");
        sbLIZ.append(i4);
        sbLIZ.append(" -> ");
        sbLIZ.append(i2);
        sbLIZ.append(", ");
        sbLIZ.append(i3);
        sbLIZ.append(" -> ");
        sbLIZ.append(i);
        LynxLog.i("ListContainerView", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLLIIIIL && (uIListContainer = this.LLJJJJLIIL) != null && uIListContainer.mContext != null) {
            this.LLLIIL = i2;
            if (uIListContainer.isRtl()) {
                iLJIIIIZZ = LJIIIIZZ(i);
            } else {
                iLJIIIIZZ = i;
            }
            this.LLLIIIL = iLJIIIIZZ;
            UIListContainer uIListContainer2 = this.LLJJJJLIIL;
            ListContainerProxy listContainerProxy = uIListContainer2.LLJLILLLLZIIL;
            if (listContainerProxy != null) {
                float f = i2;
                listContainerProxy.LIZIZ(this.LLLIIIL, f, i, f, uIListContainer2.getSign());
            } else {
                C1311860kF6 c1311860kF6 = uIListContainer2.mContext.LLJ;
                if (c1311860kF6 == null) {
                    LynxLog.e("ListContainerView", "onScrollChanged: listNodeInfoFetcher is nullptr");
                    return;
                }
                int sign = uIListContainer2.getSign();
                float f2 = this.LLLIIIL;
                float f3 = i2;
                float f4 = i;
                LynxTemplateRender lynxTemplateRender = c1311860kF6.LIZ;
                if (lynxTemplateRender != null) {
                    lynxTemplateRender.LJJLIIIJLLLLLLLZ(f2, f3, f4, f3, sign);
                }
            }
            UIListContainer uIListContainer3 = this.LLJJJJLIIL;
            if (uIListContainer3 != null) {
                uIListContainer3.LJJJJL();
                this.LLJJJJLIIL.LJJJJ();
                for (InterfaceC1317560kOI interfaceC1317560kOI : this.LLJJIJIL) {
                    if (this.LLJJJJLIIL.isRtl()) {
                        LJIIIIZZ(i3);
                    }
                    interfaceC1317560kOI.LIZ();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        LynxUI<ViewGroup> lynxUI;
        C1311970kFH c1311970kFH = this.LLLIZZ;
        if (c1311970kFH != null && (lynxUI = c1311970kFH.LJII) != null) {
            lynxUI.measure();
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.LLLIZZ != null && this.LLJJL != null) {
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                if (childAt instanceof InterfaceC1311940kFE) {
                    Rect rect = ((InterfaceC1311940kFE) childAt).getRenderer().LIZ;
                    childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
                }
            }
        }
    }

    @Override // X.C1317480kOA, X.InterfaceC1318370kPb
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        boolean z = true;
        if (i5 != 1) {
            z = false;
        }
        this.LLLILZJ = z;
        super.onNestedScroll(view, i, i2, i3, i4, i5);
        this.LLLILZJ = false;
    }
}
