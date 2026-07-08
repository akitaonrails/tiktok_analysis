package X;

import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15AI, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15AI {
    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends InterfaceC20476615Am> void LIZ(C15AJ<T> c15aj) {
        ViewGroup viewGroup;
        if (c15aj instanceof View) {
            if (Intrinsics.LJFF(((View) c15aj).getParent(), c15aj.getRoot())) {
                return;
            }
            View view = (View) c15aj;
            if (view.getParent() != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("addToParent parent is not null, geniusId:");
                sbLIZ.append(c15aj.getGeniusId());
                C20441214yg.LIZIZ("GeniusView", C2188811AlT.LIZIZ(sbLIZ));
                ViewParent parent = view.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    C786410Ut5.LJJJLZIJ(view, viewGroup);
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("addToParent parent geniusId:");
            sbLIZ2.append(c15aj.getGeniusId());
            C20441214yg.LIZIZ("GeniusView", C2188811AlT.LIZIZ(sbLIZ2));
            c15aj.getRoot().addView(view);
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("geniusId:");
        sbLIZ3.append(c15aj.getGeniusId());
        sbLIZ3.append(" geniusView's impl isn't support please check!");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends InterfaceC20476615Am> void LJII(C15AJ<T> c15aj) {
        View view;
        if ((c15aj instanceof View) && (view = (View) c15aj) != null) {
            c15aj.LLIIL(view);
        }
    }

    public static <T extends InterfaceC20476615Am> ViewGroup.LayoutParams LIZIZ(C15AJ<T> c15aj, Rect rect) {
        ViewGroup root = c15aj.getRoot();
        if (root instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.setMarginStart(rect.left);
            layoutParams.topMargin = rect.top;
            layoutParams.setMarginEnd(rect.right);
            layoutParams.bottomMargin = rect.bottom;
            return layoutParams;
        }
        if (root instanceof LinearLayout) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.setMarginStart(rect.left);
            layoutParams2.topMargin = rect.top;
            layoutParams2.setMarginEnd(rect.right);
            layoutParams2.bottomMargin = rect.bottom;
            return layoutParams2;
        }
        if (root instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(10);
            layoutParams3.addRule(20);
            layoutParams3.setMarginStart(rect.left);
            layoutParams3.topMargin = rect.top;
            layoutParams3.setMarginEnd(rect.right);
            layoutParams3.bottomMargin = rect.bottom;
            return layoutParams3;
        }
        if (root instanceof ConstraintLayout) {
            C19ME c19me = new C19ME(-2, -2);
            c19me.startToStart = 0;
            c19me.topToTop = 0;
            c19me.setMarginStart(rect.left);
            ((ViewGroup.MarginLayoutParams) c19me).topMargin = rect.top;
            c19me.setMarginEnd(rect.right);
            ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = rect.bottom;
            return c19me;
        }
        throw new IllegalArgumentException("rootView's type isn't support yet!");
    }

    public static void LIZLLL(ObjectAnimator objectAnimator, C15AK c15ak) {
        objectAnimator.setStartDelay(c15ak.LIZ);
        objectAnimator.setDuration(c15ak.LIZIZ);
        objectAnimator.setInterpolator(c15ak.LIZJ);
    }

    public static <T extends InterfaceC20476615Am> void LJ(C15AJ<T> c15aj, T t) {
        c15aj.setGeniusModel(t);
        c15aj.LLLZZIL(t, "init", true, null);
    }

    public static <T extends InterfaceC20476615Am> void LJFF(C15AJ<T> c15aj, String str) {
        if (!C958370b2x.LIZJ()) {
            C20441214yg.LIZIZ(c15aj.getTag(), str);
        }
    }

    public static <T extends InterfaceC20476615Am> void LJIIIIZZ(C15AJ<T> c15aj, View view) {
        ViewGroup viewGroup;
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            Integer numValueOf = Integer.valueOf(viewGroup.indexOfChild(view));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("removeFromParent indexOfChild:");
            sbLIZ.append(numValueOf);
            sbLIZ.append(" parent:");
            sbLIZ.append(view.getParent());
            c15aj.log(C2188811AlT.LIZIZ(sbLIZ));
            if (numValueOf.intValue() >= 0 && numValueOf.intValue() < viewGroup.getChildCount()) {
                C786410Ut5.LJJLJLI(view, viewGroup);
            }
        }
    }

    public static <T extends InterfaceC20476615Am> void LJI(C15AJ<T> c15aj, T t, String str, Function2<? super Boolean, ? super String, Unit> function2) {
        c15aj.setGeniusModel(t);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateGeniusMode geniusModel:");
        sbLIZ.append(t);
        sbLIZ.append(" source:");
        sbLIZ.append(str);
        c15aj.log(C2188811AlT.LIZIZ(sbLIZ));
        c15aj.LLLZZIL(t, str, false, function2);
    }

    public static <T extends InterfaceC20476615Am> void LJIIIZ(C15AJ<T> c15aj, List<? extends C15AK<? extends C15A8>> list, T t, Function2<? super Boolean, ? super String, Unit> function2) {
        if (list.isEmpty() && t == null) {
            throw new IllegalArgumentException("animations and model must one be not null!");
        }
        c15aj.g();
        if (!list.isEmpty()) {
            if (!c15aj.LLZZLLIL()) {
                if (function2 != null) {
                    function2.invoke(Boolean.TRUE, "disable animation");
                    return;
                }
                return;
            }
            c15aj.LLJJIJIL(list, t, function2);
            return;
        }
        if (t != null) {
            c15aj.LLJLILLLLZIIL(t, "not animation", function2);
        }
    }

    public static <T extends InterfaceC20476615Am> void LJIIJ(C15AJ<T> c15aj, T t, String str, boolean z, Function2<? super Boolean, ? super String, Unit> function2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateByGeniusModel onlyInit:");
        sbLIZ.append(z);
        sbLIZ.append(" source:");
        sbLIZ.append(str);
        sbLIZ.append(" zorder:");
        sbLIZ.append(t.getLocation().LJII);
        sbLIZ.append(" geniusModel:");
        sbLIZ.append(t);
        c15aj.log(C2188811AlT.LIZIZ(sbLIZ));
        if (function2 != null) {
            function2.invoke(Boolean.TRUE, null);
        }
    }
}
