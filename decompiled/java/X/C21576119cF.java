package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.HorizontalScrollView;
import android.widget.Scroller;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.ies.xelement.LynxPullRefreshView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.render.PlatformRendererContext;
import com.lynx.tasm.behavior.ui.LynxUI;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.19cF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21576119cF extends C21576919cN implements InterfaceC1311940kFE {
    public C1311970kFH LLLLZLL;
    public final /* synthetic */ LynxPullRefreshView LLLLZLLIL;

    @Override // X.InterfaceC1311940kFE
    public View getView() {
        return this;
    }

    @Override // X.C21576919cN, android.view.View
    public final void computeScroll() {
        try {
            super.computeScroll();
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            Scroller scroller = this.LLJJJJ;
            if (scroller != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("computeScroll: ");
                sbLIZ.append(scroller.timePassed());
                sbLIZ.append(',');
                sbLIZ.append(AnimationUtils.currentAnimationTimeMillis());
                LynxLog.e("LynxPullRefreshView", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    @Override // X.C21576919cN, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAttachedToWindow: ");
        sbLIZ.append(this);
        sbLIZ.append(" with content view ");
        C21560319Zh c21560319Zh = this.LLLLLJLJLL;
        sbLIZ.append(c21560319Zh != null ? c21560319Zh.LL : null);
        LynxLog.i("LynxPullRefreshView", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1311940kFE
    public C1311970kFH getRenderer() {
        return this.LLLLZLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIJJ(View view) {
        ViewGroup viewGroup;
        InterfaceC1311940kFE interfaceC1311940kFE;
        C1311970kFH renderer;
        Rect rect;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof InterfaceC1311940kFE) && (interfaceC1311940kFE = (InterfaceC1311940kFE) childAt) != null && (renderer = interfaceC1311940kFE.getRenderer()) != null && (rect = renderer.LIZ) != null) {
                    childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
                }
            }
        }
    }

    @Override // X.C21576919cN
    public final C19PU LJIILLIIL(final View view) {
        View view2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setRefreshContent to SmartRefreshLayout: ");
        sbLIZ.append(view);
        sbLIZ.append(" -> ");
        sbLIZ.append(this);
        LynxLog.i("LynxPullRefreshView", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLLLZLLIL.LLILLL) {
            super.LJIILLIIL(view);
            return this;
        }
        C21560319Zh c21560319Zh = this.LLLLLJLJLL;
        if (c21560319Zh != null && (view2 = c21560319Zh.LL) != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("remove view from SmartRefreshLayout: ");
            sbLIZ2.append(view2);
            LynxLog.i("LynxPullRefreshView", C2188811AlT.LIZIZ(sbLIZ2));
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, view2);
            removeView(view2);
        }
        final LynxPullRefreshView lynxPullRefreshView = this.LLLLZLLIL;
        this.LLLLLJLJLL = new C21560319Zh(view) { // from class: X.19Zn
            @Override // X.C21560319Zh, X.InterfaceC21560619Zk
            public final boolean LIZ() {
                View view3 = this.LLILLL;
                if (view3 == null || !this.LLIZ) {
                    return false;
                }
                if (view3.getVisibility() == 0) {
                    float f = C19ZZ.LIZIZ;
                    if (view3.canScrollVertically(-1)) {
                        return false;
                    }
                }
                return true;
            }

            @Override // X.C21560319Zh, X.InterfaceC21560619Zk
            public final boolean LJJJJI() {
                View view3 = this.LLILLL;
                if (view3 == null || !this.LLIZLLLIL) {
                    return false;
                }
                if (view3.getVisibility() == 0) {
                    float f = C19ZZ.LIZIZ;
                    if (view3.canScrollVertically(1)) {
                        return false;
                    }
                }
                return true;
            }

            @Override // X.C21560319Zh, X.InterfaceC21560619Zk
            public final void LIZIZ(MotionEvent motionEvent) {
                if (this.LL != null) {
                    PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
                    pointF.offset(-this.LL.getLeft(), -this.LL.getTop());
                    this.LLILLL = null;
                    LJIIIIZZ(pointF, this.LL);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("finish search, point = ");
                    sbLIZ3.append(pointF);
                    sbLIZ3.append(", scrollableView = ");
                    sbLIZ3.append(this.LLILLL);
                    sbLIZ3.append(", contentView = ");
                    sbLIZ3.append(this.LL);
                    LynxLog.i("LynxPullRefreshView", C2188811AlT.LIZIZ(sbLIZ3));
                    View view3 = this.LLILLL;
                    if (view3 == null) {
                        view3 = this.LL;
                    }
                    this.LLILLL = view3;
                }
            }

            public final void LJIIIIZZ(PointF pointF, View view3) {
                boolean z;
                LynxPullRefreshView lynxPullRefreshView2 = lynxPullRefreshView;
                PointF pointF2 = new PointF();
                if (view3 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view3;
                    int childCount = viewGroup.getChildCount();
                    while (childCount > 0) {
                        childCount--;
                        View childAt = viewGroup.getChildAt(childCount);
                        if (childAt.getVisibility() == 0) {
                            pointF2.x = (pointF.x + view3.getScrollX()) - childAt.getLeft();
                            pointF2.y = (pointF.y + view3.getScrollY()) - childAt.getTop();
                            if (new RectF(0.0f, 0.0f, childAt.getWidth(), childAt.getHeight()).contains(pointF2.x, pointF2.y)) {
                                LJIIIIZZ(pointF2, childAt);
                            }
                        }
                    }
                    if (C19ZZ.LIZLLL(view3) || (((view3 instanceof C21606519h9) && ((C21606519h9) view3).LJIIJJI()) || ((lynxPullRefreshView2.LLILZLL & 1) != 0 && (view3 instanceof C21578619ce)))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!(view3 instanceof ViewPager) && z && this.LLILLL == null) {
                        if ((view3 instanceof HorizontalScrollView) && (lynxPullRefreshView2.LLILZLL & 1) != 0) {
                            return;
                        }
                        this.LLILLL = view3;
                    }
                }
            }
        };
        addView(view, getChildCount(), new C19PS(-1));
        if (this.LLLLLLZZ) {
            this.LLLLLJLJLL.LJI();
            C21560319Zh c21560319Zh2 = this.LLLLLJLJLL;
            c21560319Zh2.LLJ.LIZJ = this.LLLI;
            c21560319Zh2.LJII(this.LLLLLLJ, null, null);
        }
        InterfaceC21576219cG interfaceC21576219cG = this.LLLLLILLIL;
        if (interfaceC21576219cG != null && interfaceC21576219cG.getSpinnerStyle().LIZ) {
            bringChildToFront(this.LLLLLILLIL.getView());
        }
        InterfaceC21576819cM interfaceC21576819cM = this.LLLLLJIL;
        if (interfaceC21576819cM != null && interfaceC21576819cM.getSpinnerStyle().LIZ) {
            bringChildToFront(this.LLLLLJIL.getView());
        }
        return this;
    }

    @Override // X.C21576919cN
    public final boolean LJIJI(float f) {
        boolean zLJIJI = super.LJIJI(f);
        Scroller scroller = this.LLJJJJ;
        if (scroller != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startFlingIfNeed: ");
            sbLIZ.append(f);
            sbLIZ.append(", ");
            sbLIZ.append(scroller.timePassed());
            sbLIZ.append(',');
            sbLIZ.append(AnimationUtils.currentAnimationTimeMillis());
            LynxLog.i("LynxPullRefreshView", C2188811AlT.LIZIZ(sbLIZ));
        }
        return zLJIJI;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        C1311970kFH c1311970kFH = this.LLLLZLL;
        if (c1311970kFH != null) {
            c1311970kFH.LIZ(canvas);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C1311970kFH c1311970kFH = this.LLLLZLL;
        if (c1311970kFH != null) {
            c1311970kFH.LJ(canvas);
        } else {
            super.onDraw(canvas);
        }
    }

    @Override // X.InterfaceC1311940kFE
    public void setRenderer(C1311970kFH c1311970kFH) {
        this.LLLLZLL = c1311970kFH;
    }

    public C21576119cF(Context context, LynxPullRefreshView lynxPullRefreshView) {
        this.LLLLZLLIL = lynxPullRefreshView;
        new LinkedHashMap();
        new LinkedHashMap();
        super(context);
    }

    @Override // X.InterfaceC1311940kFE
    public final C1311970kFH createRenderer(PlatformRendererContext platformRendererContext, int i) {
        return new C1311970kFH(platformRendererContext, i);
    }

    @Override // X.C21576919cN, android.view.View
    public final void onMeasure(int i, int i2) {
        TraceEvent.LIZIZ("x-refresh-view.onMeasure");
        super.onMeasure(i, i2);
        TraceEvent.LJII("x-refresh-view.onMeasure");
    }

    @Override // X.C21576919cN, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        C1311970kFH c1311970kFH = this.LLLLZLL;
        if (c1311970kFH != null) {
            c1311970kFH.LIZIZ(canvas, view);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        if (this.LLLLZLL != null) {
            canvas.restore();
        }
        return zDrawChild;
    }

    @Override // X.C21576919cN, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        LynxUI<ViewGroup> lynxUI;
        TraceEvent.LIZLLL("x-refresh-view.onLayout");
        C1311970kFH c1311970kFH = this.LLLLZLL;
        if (c1311970kFH != null && (lynxUI = c1311970kFH.LJII) != null) {
            lynxUI.measure();
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.LLLLZLL != null) {
            InterfaceC21576219cG interfaceC21576219cG = this.LLLLLILLIL;
            View view2 = null;
            if (interfaceC21576219cG != null) {
                view = interfaceC21576219cG.getView();
            } else {
                view = null;
            }
            LJIJJ(view);
            InterfaceC21576819cM interfaceC21576819cM = this.LLLLLJIL;
            if (interfaceC21576819cM != null) {
                view2 = interfaceC21576819cM.getView();
            }
            LJIJJ(view2);
        }
        TraceEvent.LJII("x-refresh-view.onLayout");
    }
}
