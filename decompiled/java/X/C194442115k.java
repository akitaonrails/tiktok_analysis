package X;

import Y.ARunnableS103S0100000_3;
import Y.ARunnableS37S0400000_29;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.115k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194442115k {
    public static final int LJIIJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
    public static final int LJIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    public static final int LJIILIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
    public final Context LIZ;
    public PopupWindow LIZIZ;
    public LinearLayout LIZJ;
    public TuxIconView LIZLLL;
    public TuxTextView LJ;
    public Function0<Unit> LJFF;
    public EnumC194437115f LJI;
    public View LJII;
    public ARunnableS37S0400000_29 LJIIIIZZ;
    public View LJIIIZ;
    public ViewOnLayoutChangeListenerC194444115m LJIIJ;

    public final void LIZIZ() {
        View view = this.LJII;
        ARunnableS37S0400000_29 aRunnableS37S0400000_29 = this.LJIIIIZZ;
        if (view != null && aRunnableS37S0400000_29 != null) {
            HandlerHook.viewRemoveCallbacks(view, aRunnableS37S0400000_29);
        }
        this.LJII = null;
        this.LJIIIIZZ = null;
        View view2 = this.LJIIIZ;
        ViewOnLayoutChangeListenerC194444115m viewOnLayoutChangeListenerC194444115m = this.LJIIJ;
        if (view2 != null && viewOnLayoutChangeListenerC194444115m != null) {
            view2.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC194444115m);
        }
        this.LJIIIZ = null;
        this.LJIIJ = null;
        PopupWindow popupWindow = this.LIZIZ;
        if (popupWindow != null && popupWindow.isShowing()) {
            LinearLayout linearLayout = this.LIZJ;
            if (linearLayout != null) {
                linearLayout.animate().cancel();
                linearLayout.animate().alpha(0.0f).setDuration(250L).setInterpolator(new C12DM()).withEndAction(new ARunnableS103S0100000_3(this, popupWindow, 117)).start();
                return;
            }
            try {
                popupWindow.dismiss();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public C194442115k(Context context) {
        this.LIZ = context;
    }

    public static Pair LIZ(View view, View view2) {
        View viewFindViewById;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int i = LJIIJJI;
        view2.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i, 1073741824));
        int measuredWidth = view2.getMeasuredWidth();
        View rootView = view.getRootView();
        if (rootView != null) {
            viewFindViewById = rootView.findViewById(R.id.czi);
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById != null && viewFindViewById.getWidth() > 0 && viewFindViewById.getHeight() > 0) {
            int[] iArr = new int[2];
            viewFindViewById.getLocationOnScreen(iArr);
            int height = iArr[1] + viewFindViewById.getHeight();
            return new Pair(Integer.valueOf(iArr[0] + ((viewFindViewById.getWidth() - measuredWidth) / 2)), Integer.valueOf(((height - LJIILIIL) - LJIIL) - i));
        }
        View rootView2 = view.getRootView();
        int[] iArr2 = new int[2];
        rootView2.getLocationOnScreen(iArr2);
        int height2 = iArr2[1] + rootView2.getHeight();
        return new Pair(Integer.valueOf(iArr2[0] + ((rootView2.getWidth() - measuredWidth) / 2)), Integer.valueOf(((height2 - LJIILIIL) - LJIIL) - i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.115m, android.view.View$OnLayoutChangeListener] */
    public final void LIZJ(final View view, final View view2, final PopupWindow popupWindow) {
        View view3 = this.LJIIIZ;
        ViewOnLayoutChangeListenerC194444115m viewOnLayoutChangeListenerC194444115m = this.LJIIJ;
        if (view3 != null && viewOnLayoutChangeListenerC194444115m != null) {
            view3.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC194444115m);
        }
        this.LJIIIZ = null;
        this.LJIIJ = null;
        if (view.isLaidOut() && !view.isLayoutRequested() && view.getWidth() > 0 && view.getHeight() > 0) {
            if (view.getParent() != null) {
                ARunnableS37S0400000_29 aRunnableS37S0400000_29 = new ARunnableS37S0400000_29(view, view2, popupWindow, this, 4);
                this.LJII = view;
                this.LJIIIIZZ = aRunnableS37S0400000_29;
                HandlerHook.viewPost(view, aRunnableS37S0400000_29);
                return;
            }
            return;
        }
        ?? r0 = new View.OnLayoutChangeListener() { // from class: X.115m
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view4, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                view4.removeOnLayoutChangeListener(this);
                C194442115k c194442115k = this;
                if (c194442115k.LJIIJ == this) {
                    c194442115k.LJIIIZ = null;
                    c194442115k.LJIIJ = null;
                }
                if (c194442115k.LIZIZ == popupWindow && view.getParent() != null) {
                    C194442115k c194442115k2 = this;
                    View view5 = view;
                    PopupWindow popupWindow2 = popupWindow;
                    View view6 = view2;
                    c194442115k2.getClass();
                    if (view5.getParent() != null) {
                        ARunnableS37S0400000_29 aRunnableS37S0400000_292 = new ARunnableS37S0400000_29(view5, view6, popupWindow2, c194442115k2, 4);
                        c194442115k2.LJII = view5;
                        c194442115k2.LJIIIIZZ = aRunnableS37S0400000_292;
                        HandlerHook.viewPost(view5, aRunnableS37S0400000_292);
                    }
                }
            }
        };
        this.LJIIIZ = view;
        this.LJIIJ = r0;
        view.addOnLayoutChangeListener(r0);
    }

    public final void LIZLLL(View view, View view2, PopupWindow popupWindow) {
        if (!view.isAttachedToWindow()) {
            return;
        }
        if (!view.isLayoutRequested() && view.getWidth() > 0 && view.getHeight() > 0) {
            Pair pairLIZ = LIZ(view, view2);
            try {
                popupWindow.update(((Number) pairLIZ.getFirst()).intValue(), ((Number) pairLIZ.getSecond()).intValue(), -1, -1);
                C189200o6.m2constructorimpl(Unit.LIZ);
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return;
            }
        }
        if (view.getParent() == null) {
            return;
        }
        HandlerHook.viewPost(view, new ARunnableS37S0400000_29(view, view2, popupWindow, this, 5));
    }
}
