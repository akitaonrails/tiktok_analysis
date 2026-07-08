package X;

import Y.ACListenerS161S0100000_27;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ss.android.ugc.aweme.tako.menuwindow.MenuWindowBottomSheetBehavior;
import java.util.Map;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yLe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1854080yLe {
    public final View LIZ;
    public final int LIZIZ;
    public final Map<String, String> LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 825));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1174));
    public Boolean LJFF;
    public boolean LJI;

    public final MenuWindowBottomSheetBehavior LIZ() {
        return (MenuWindowBottomSheetBehavior) this.LIZLLL.getValue();
    }

    public final void LIZIZ() {
        LIZ().setState(5);
    }

    public final void LIZJ(boolean z) {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(((double) (this.LIZIZ * 49)) + 206.5d + ((double) 12))));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)) + iLIZIZ;
        if (!Intrinsics.LJFF(this.LJFF, Boolean.valueOf(z))) {
            if (z) {
                View view = this.LIZ;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = iLIZIZ2;
                C786410Ut5.W5(view, layoutParams);
                LIZ().setPeekHeight(iLIZIZ);
                View view2 = (View) this.LJ.getValue();
                if (view2 != null) {
                    C1584506Ih.LIZIZ(view2);
                }
                View view3 = (View) this.LJ.getValue();
                if (view3 != null) {
                    C786410Ut5.ed(view3, -C418440Gaw.LIZIZ(60));
                }
                this.LJI = false;
            } else {
                View view4 = this.LIZ;
                ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                layoutParams2.height = iLIZIZ;
                C786410Ut5.W5(view4, layoutParams2);
                LIZ().setPeekHeight(iLIZIZ);
                View view5 = (View) this.LJ.getValue();
                if (view5 != null) {
                    C1584506Ih.LIZ(view5);
                }
            }
            this.LJFF = Boolean.valueOf(z);
            if (LIZ().getState() == 3) {
                LIZ().setState(4);
            }
        }
    }

    public C1854080yLe(int i, View view, Map map) {
        ViewGroup viewGroup;
        this.LIZ = view;
        this.LIZIZ = i;
        this.LIZJ = map;
        final MenuWindowBottomSheetBehavior menuWindowBottomSheetBehaviorLIZ = LIZ();
        menuWindowBottomSheetBehaviorLIZ.setHideable(true);
        menuWindowBottomSheetBehaviorLIZ.setState(5);
        menuWindowBottomSheetBehaviorLIZ.setFitToContents(true);
        menuWindowBottomSheetBehaviorLIZ.setSkipCollapsed(false);
        menuWindowBottomSheetBehaviorLIZ.addBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.0yLf
            @Override // X.AbstractC1177930gl5
            public final void LIZJ(View view2, float f) {
                if (Intrinsics.LJFF(this.LIZ.LJFF, Boolean.TRUE)) {
                    float fLIZIZ = (-C13LZ.LIZLLL(1 - f, 0.0f, 1.0f)) * C418440Gaw.LIZIZ(60);
                    View view3 = (View) this.LIZ.LJ.getValue();
                    if (view3 != null) {
                        C786410Ut5.ed(view3, fLIZIZ);
                    }
                    if (!this.LIZ.LJI && menuWindowBottomSheetBehaviorLIZ.getState() == 1) {
                        C1854080yLe c1854080yLe = this.LIZ;
                        c1854080yLe.LJI = true;
                        C1862330yYx.LJJZZIII(C1862330yYx.LIZ, c1854080yLe.LIZJ, "slide_function_show", null, null, 60);
                    }
                }
            }

            @Override // X.AbstractC1177930gl5
            public final void LIZLLL(int i2, View view2) {
                Boolean bool = this.LIZ.LJFF;
                Boolean bool2 = Boolean.TRUE;
                if (!Intrinsics.LJFF(bool, bool2) && i2 == 3) {
                    menuWindowBottomSheetBehaviorLIZ.setState(4);
                } else {
                    if (!Intrinsics.LJFF(this.LIZ.LJFF, bool2) || i2 != 4) {
                        return;
                    }
                    this.LIZ.LJI = false;
                }
            }
        });
        LIZJ(false);
        ViewParent parent = view.getParent();
        if ((parent instanceof C16G0) && (viewGroup = (ViewGroup) parent) != null) {
            final View view2 = new View(view.getContext());
            C786410Ut5.W5(view2, new ViewGroup.LayoutParams(-1, -1));
            view2.setBackgroundColor(0);
            C786410Ut5.T4(view2, 0.0f);
            C786410Ut5.I7(new ACListenerS161S0100000_27(this, 142), view2);
            viewGroup.addView(view2, viewGroup.indexOfChild(view));
            view2.setClickable(false);
            LIZ().addBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.0yLg
                @Override // X.AbstractC1177930gl5
                public final void LIZJ(View view3, float f) {
                }

                @Override // X.AbstractC1177930gl5
                public final void LIZLLL(int i2, View view3) {
                    if (i2 != 3 && i2 != 4) {
                        view2.setClickable(false);
                        C786410Ut5.T4(view2, 0.0f);
                    } else {
                        view2.setClickable(true);
                        C786410Ut5.T4(view2, 1.0f);
                    }
                }
            });
        }
    }
}
