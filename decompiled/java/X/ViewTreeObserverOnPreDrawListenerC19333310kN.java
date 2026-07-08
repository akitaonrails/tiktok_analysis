package X;

import Y.ARunnableS33S0201000_28;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.notification.v2.MergedNotificationFragment;
import kotlin.Pair;

/* JADX INFO: renamed from: X.10kN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class ViewTreeObserverOnPreDrawListenerC19333310kN implements ViewTreeObserver.OnPreDrawListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.$t) {
            case 0:
                return onPreDraw$0(this);
            case 1:
                return onPreDraw$1(this);
            default:
                return false;
        }
    }

    public static final boolean onPreDraw$0(ViewTreeObserverOnPreDrawListenerC19333310kN viewTreeObserverOnPreDrawListenerC19333310kN) {
        int currentItem;
        HorizontalScrollView horizontalScrollView;
        C786410Ut5.D3(((View) viewTreeObserverOnPreDrawListenerC19333310kN.l0).getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC19333310kN);
        C20632315oP c20632315oP = ((MergedNotificationFragment) viewTreeObserverOnPreDrawListenerC19333310kN.l1).LLJ;
        if (c20632315oP != null) {
            currentItem = c20632315oP.getCurrentItem();
        } else {
            currentItem = 0;
        }
        C1902420zbc c1902420zbc = ((MergedNotificationFragment) viewTreeObserverOnPreDrawListenerC19333310kN.l1).LLJJJJJIL;
        if (c1902420zbc != null && (horizontalScrollView = c1902420zbc.LJIIJ) != null && horizontalScrollView.getWidth() > 0) {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
            Pair<Integer, Boolean> pairLIZ = C1902420zbc.LIZ(c1902420zbc, iLIZIZ, horizontalScrollView, iLIZIZ2, false);
            int iIntValue = pairLIZ.getFirst().intValue();
            if (pairLIZ.getSecond().booleanValue()) {
                horizontalScrollView.setFillViewport(true);
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("adjustTabLayout: large fits, totalTabs=");
                sbLIZ.append(iIntValue);
                C1720106oR.LJI("MergedTabBarHelper", C2188811AlT.LIZIZ(sbLIZ));
            } else {
                Pair<Integer, Boolean> pairLIZ2 = C1902420zbc.LIZ(c1902420zbc, iLIZIZ, horizontalScrollView, iLIZIZ2, true);
                int iIntValue2 = pairLIZ2.getFirst().intValue();
                if (pairLIZ2.getSecond().booleanValue()) {
                    horizontalScrollView.setFillViewport(true);
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("adjustTabLayout: small fits, totalTabs=");
                    sbLIZ2.append(iIntValue2);
                    C1720106oR.LJI("MergedTabBarHelper", C2188811AlT.LIZIZ(sbLIZ2));
                } else {
                    horizontalScrollView.setFillViewport(false);
                    c1902420zbc.LJIIL = true;
                    int iLIZIZ3 = c1902420zbc.LIZIZ(c1902420zbc.LIZJ());
                    int i3 = iLIZIZ + iLIZIZ3;
                    HorizontalScrollView horizontalScrollView2 = c1902420zbc.LJIIJ;
                    if (horizontalScrollView2 != null) {
                        horizontalScrollView2.setPaddingRelative(i3, horizontalScrollView2.getPaddingTop(), i3, horizontalScrollView2.getPaddingBottom());
                    }
                    int i4 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("adjustTabLayout: enable scroll, totalTabs=");
                    sbLIZ3.append(iIntValue2);
                    sbLIZ3.append(", scrollWidth=");
                    sbLIZ3.append(horizontalScrollView.getWidth());
                    sbLIZ3.append(", extraPadding=");
                    sbLIZ3.append(iLIZIZ3);
                    C1720106oR.LJI("MergedTabBarHelper", C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
        }
        View view = (View) viewTreeObserverOnPreDrawListenerC19333310kN.l0;
        HandlerHook.viewPost(view, new ARunnableS33S0201000_28(view, (MergedNotificationFragment) viewTreeObserverOnPreDrawListenerC19333310kN.l1, currentItem, 1));
        return true;
    }

    public static final boolean onPreDraw$1(ViewTreeObserverOnPreDrawListenerC19333310kN viewTreeObserverOnPreDrawListenerC19333310kN) {
        Object parent;
        View view;
        View view2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        ViewParent parent2 = ((C19310610gi) viewTreeObserverOnPreDrawListenerC19333310kN.l0).LL.getParent();
        if (parent2 != null) {
            parent = parent2.getParent();
        } else {
            parent = null;
        }
        if (parent instanceof View) {
            view = (View) parent;
        } else {
            view = null;
        }
        if (view != null) {
            int measuredHeight = view.getMeasuredHeight();
            Object parent3 = ((C19310610gi) viewTreeObserverOnPreDrawListenerC19333310kN.l0).LL.getParent();
            if ((parent3 instanceof View) && (view2 = (View) parent3) != null) {
                int measuredHeight2 = view2.getMeasuredHeight();
                C786410Ut5.D3(((C19310610gi) viewTreeObserverOnPreDrawListenerC19333310kN.l0).LL.getViewTreeObserver(), (ViewTreeObserver.OnPreDrawListener) ((C259800zU) viewTreeObserverOnPreDrawListenerC19333310kN.l1).element);
                int i3 = measuredHeight - measuredHeight2;
                ViewGroup.LayoutParams layoutParams = ((C19310610gi) viewTreeObserverOnPreDrawListenerC19333310kN.l0).LLILLJJLI.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = null;
                }
                if (marginLayoutParams != null) {
                    i = marginLayoutParams.topMargin;
                } else {
                    i = 0;
                }
                int i4 = i3 + i;
                ViewGroup.LayoutParams layoutParams2 = ((C19310610gi) viewTreeObserverOnPreDrawListenerC19333310kN.l0).LLILLL.getLayoutParams();
                if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    i2 = marginLayoutParams4.bottomMargin;
                } else {
                    i2 = 0;
                }
                int iLIZIZ = (i4 + i2) / 2;
                if (iLIZIZ < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                }
                ViewGroup.LayoutParams layoutParams3 = ((C19310610gi) viewTreeObserverOnPreDrawListenerC19333310kN.l0).LLILLJJLI.getLayoutParams();
                if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                    marginLayoutParams3.topMargin = iLIZIZ;
                }
                ViewGroup.LayoutParams layoutParams4 = ((C19310610gi) viewTreeObserverOnPreDrawListenerC19333310kN.l0).LLILLL.getLayoutParams();
                if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                    marginLayoutParams2.bottomMargin = iLIZIZ;
                }
                ((C19310610gi) viewTreeObserverOnPreDrawListenerC19333310kN.l0).LLILLJJLI.requestLayout();
                return false;
            }
        }
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC19333310kN(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
