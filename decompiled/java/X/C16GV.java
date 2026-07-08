package X;

import android.view.View;

/* JADX INFO: renamed from: X.16GV, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16GV {
    public final View LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public boolean LJFF = true;
    public boolean LJI = true;

    public final void LIZ() {
        View view = this.LIZ;
        view.offsetTopAndBottom(this.LIZLLL - (view.getTop() - this.LIZIZ));
        View view2 = this.LIZ;
        view2.offsetLeftAndRight(this.LJ - (view2.getLeft() - this.LIZJ));
    }

    public C16GV(View view) {
        this.LIZ = view;
    }

    public final boolean LIZIZ(int i) {
        if (this.LJFF && this.LIZLLL != i) {
            this.LIZLLL = i;
            LIZ();
            return true;
        }
        return false;
    }
}
