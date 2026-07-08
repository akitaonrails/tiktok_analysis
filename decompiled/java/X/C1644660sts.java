package X;

import Y.ACListenerS159S0100000_25;
import android.view.View;

/* JADX INFO: renamed from: X.0sts, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1644660sts implements InterfaceC1644650str {
    public final View LIZ;
    public final View LIZIZ;
    public View.OnClickListener LIZJ;
    public boolean LIZLLL;

    @Override // X.InterfaceC1644650str
    public final boolean LIZJ() {
        View view = this.LIZ;
        if (view != null) {
            return view.isSelected();
        }
        return false;
    }

    @Override // X.InterfaceC1644650str
    public final void LIZ(boolean z) {
        View view;
        if (this.LIZLLL && (view = this.LIZ) != null) {
            view.setSelected(z);
        }
    }

    @Override // X.InterfaceC1644650str
    public final void LIZIZ(ACListenerS159S0100000_25 aCListenerS159S0100000_25) {
        this.LIZJ = aCListenerS159S0100000_25;
        if (this.LIZLLL) {
            View view = this.LIZ;
            if (view != null) {
                C786410Ut5.I7(aCListenerS159S0100000_25, view);
                return;
            }
            return;
        }
        View view2 = this.LIZ;
        if (view2 == null) {
            return;
        }
        C786410Ut5.I7(null, view2);
    }

    @Override // X.InterfaceC1644650str
    public final void setEnable(boolean z) {
        int i;
        this.LIZLLL = z;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        View view = this.LIZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(i, view);
        }
        View view2 = this.LIZIZ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(i, view2);
        }
        if (this.LIZLLL) {
            View view3 = this.LIZ;
            if (view3 != null) {
                C786410Ut5.I7(this.LIZJ, view3);
                return;
            }
            return;
        }
        View view4 = this.LIZ;
        if (view4 == null) {
            return;
        }
        C786410Ut5.I7(null, view4);
    }

    public C1644660sts(View view, View view2) {
        this.LIZ = view;
        this.LIZIZ = view2;
        if (view != null) {
            view.setSelected(false);
        }
        int i = this.LIZLLL ? 0 : 8;
        if (view != null) {
            C786410Ut5.LJLLLLLL(i, view);
        }
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(i, view2);
        }
    }
}
