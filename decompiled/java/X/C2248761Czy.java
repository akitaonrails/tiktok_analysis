package X;

import android.view.View;

/* JADX INFO: renamed from: X.1Czy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2248761Czy {
    public final C1D03[] LIZ;

    public final void LIZ() {
        for (C1D03 c1d03 : this.LIZ) {
            View view = c1d03.LIZ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
        }
    }

    public final void LIZIZ() {
        View view;
        for (C1D03 c1d03 : this.LIZ) {
            if (c1d03.LJ.invoke().booleanValue() && (view = c1d03.LIZ) != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
        }
    }

    public C2248761Czy(C1D03... c1d03Arr) {
        this.LIZ = c1d03Arr;
    }
}
