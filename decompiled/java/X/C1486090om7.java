package X;

import Y.AObjectS405S0100000_31;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: X.0om7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1486090om7 {
    public ViewGroup LIZ;
    public View LIZIZ;
    public boolean LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZ(EnumC452301pR.NONE, new AObjectS405S0100000_31(this, 13));
    public boolean LJ;

    public final void LIZ() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (!this.LJ && (viewGroup = this.LIZ) != null && this.LIZJ && ((Boolean) C2260271DdR.LIZIZ.getValue()).booleanValue()) {
            this.LJ = true;
            ViewParent parent = viewGroup.getParent();
            if (!(parent instanceof ViewGroup) || (viewGroup2 = (ViewGroup) parent) == null) {
                return;
            }
            View view = new View(viewGroup.getContext());
            if (viewGroup2 instanceof FrameLayout) {
                C786410Ut5.W5(view, new FrameLayout.LayoutParams(-1, -1, 17));
            } else if (viewGroup2 instanceof RelativeLayout) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(13, -1);
                C786410Ut5.W5(view, layoutParams);
            } else {
                C786410Ut5.W5(view, new ViewGroup.LayoutParams(-1, -1));
            }
            viewGroup2.addView(view);
            this.LIZIZ = view;
        }
    }
}
