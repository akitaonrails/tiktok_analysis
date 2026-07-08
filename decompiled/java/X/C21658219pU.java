package X;

import android.view.View;

/* JADX INFO: renamed from: X.19pU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21658219pU {
    public final View LIZ;
    public boolean LIZIZ;

    public C21658219pU(View view) {
        this.LIZ = view;
    }

    public final void LIZ(boolean z, boolean z2) {
        int i = 8;
        if (z2) {
            this.LIZIZ = !z;
            View view = this.LIZ;
            if (z) {
                i = 0;
            }
            C786410Ut5.LJLLLLLL(i, view);
            return;
        }
        View view2 = this.LIZ;
        if (z && !this.LIZIZ) {
            i = 0;
        }
        C786410Ut5.LJLLLLLL(i, view2);
    }
}
