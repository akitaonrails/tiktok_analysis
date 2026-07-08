package X;

import Y.ACListenerS161S0100000_27;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0yLu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1854240yLu {
    public static int LJIIIIZZ;
    public final View LIZ;
    public final View LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final C01GW LJII = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1342));

    public final BottomSheetBehavior<View> LIZ() {
        return (BottomSheetBehavior) this.LJII.getValue();
    }

    public final void LIZIZ() {
        View view;
        Object parent = this.LIZ.getParent();
        int height = (!(parent instanceof ViewGroup) || (view = (View) parent) == null) ? 0 : view.getHeight();
        LIZ().setPeekHeight(((C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)) + height) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(424)));
        if (this.LJ || this.LJFF) {
            View view2 = this.LIZ;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            layoutParams.height = (height - LJIIIIZZ) - this.LIZJ;
            C786410Ut5.W5(view2, layoutParams);
        }
        int iLIZ = C497820Jfg.LIZ(this.LIZ.getContext());
        if (this.LIZLLL) {
            LIZ().setPeekHeight(iLIZ);
            LIZ().setSkipCollapsed(true);
            LIZ().setHideable(true);
            LIZ().setState(5);
        }
    }

    public C1854240yLu(View view, View view2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        View view3;
        ViewGroup viewGroup;
        int iIntValue;
        this.LIZ = view;
        this.LIZIZ = view2;
        this.LIZJ = i;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = z4;
        this.LJI = z5;
        C786410Ut5.y3(view.getViewTreeObserver(), new ViewTreeObserverOnPreDrawListenerC1864760ycs(this, 4));
        BottomSheetBehavior<View> bottomSheetBehaviorLIZ = LIZ();
        bottomSheetBehaviorLIZ.setHideable(false);
        bottomSheetBehaviorLIZ.setState(4);
        bottomSheetBehaviorLIZ.setFitToContents(true);
        bottomSheetBehaviorLIZ.setSkipCollapsed(false);
        C1561220qjI.LIZ.getClass();
        if (!C1561220qjI.LIZ() && view2 != null) {
            C786410Ut5.I7(new ACListenerS161S0100000_27(this, 183), view2);
        }
        if (z) {
            ViewParent parent = view.getParent();
            if ((parent instanceof C16G0) && (viewGroup = (ViewGroup) parent) != null) {
                final View view4 = new View(view.getContext());
                C786410Ut5.W5(view4, new ViewGroup.LayoutParams(-1, -1));
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zc, view.getContext());
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                view4.setBackgroundColor(iIntValue);
                C786410Ut5.T4(view4, 0.0f);
                C786410Ut5.I7(new ACListenerS161S0100000_27(this, 182), view4);
                viewGroup.addView(view4, viewGroup.indexOfChild(view));
                view4.setClickable(false);
                LIZ().addBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.0drk
                    @Override // X.AbstractC1177930gl5
                    public final void LIZJ(View view5, float f) {
                        boolean z6;
                        View view6 = view4;
                        if (f > 0.8f) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        view6.setClickable(z6);
                        C786410Ut5.T4(view4, C13LZ.LIZLLL(f, 0.0f, 1.0f));
                    }

                    @Override // X.AbstractC1177930gl5
                    public final void LIZLLL(int i2, View view5) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                view4.setClickable(false);
                                return;
                            }
                            return;
                        }
                        view4.setClickable(true);
                    }
                });
            }
        }
        Object parent2 = view.getParent();
        if ((parent2 instanceof ViewGroup) && (view3 = (View) parent2) != null) {
            view3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1864650ych(this, 14));
        }
    }
}
