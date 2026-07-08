package X;

import android.view.View;

/* JADX INFO: renamed from: X.1ETB, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1ETB {
    public final C1ETA LIZ;
    public final C1ETC LIZIZ = new C1ETC();

    public C1ETB(C1ETA c1eta) {
        this.LIZ = c1eta;
    }

    public final boolean LIZIZ(View view) {
        C1ETC c1etc = this.LIZIZ;
        int iLIZLLL = this.LIZ.LIZLLL();
        int iLIZIZ = this.LIZ.LIZIZ();
        int iLIZJ = this.LIZ.LIZJ(view);
        int iLIZ = this.LIZ.LIZ(view);
        c1etc.LIZIZ = iLIZLLL;
        c1etc.LIZJ = iLIZIZ;
        c1etc.LIZLLL = iLIZJ;
        c1etc.LJ = iLIZ;
        C1ETC c1etc2 = this.LIZIZ;
        c1etc2.LIZ = 24579;
        return c1etc2.LIZ();
    }

    public final View LIZ(int i, int i2, int i3, int i4) {
        int i5;
        int iLIZLLL = this.LIZ.LIZLLL();
        int iLIZIZ = this.LIZ.LIZIZ();
        if (i2 > i) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view = null;
        while (i != i2) {
            View childAt = this.LIZ.getChildAt(i);
            int iLIZJ = this.LIZ.LIZJ(childAt);
            int iLIZ = this.LIZ.LIZ(childAt);
            C1ETC c1etc = this.LIZIZ;
            c1etc.LIZIZ = iLIZLLL;
            c1etc.LIZJ = iLIZIZ;
            c1etc.LIZLLL = iLIZJ;
            c1etc.LJ = iLIZ;
            if (i3 != 0) {
                c1etc.LIZ = i3;
                if (c1etc.LIZ()) {
                    return childAt;
                }
            }
            if (i4 != 0) {
                C1ETC c1etc2 = this.LIZIZ;
                c1etc2.LIZ = i4;
                if (c1etc2.LIZ()) {
                    view = childAt;
                }
            }
            i += i5;
        }
        return view;
    }
}
