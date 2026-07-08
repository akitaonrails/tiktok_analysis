package X;

import android.view.View;

/* JADX INFO: renamed from: X.16GQ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16GQ {
    public final View LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    public final void LIZ() {
        View view = this.LIZ;
        view.offsetTopAndBottom(this.LIZLLL - (view.getTop() - this.LIZIZ));
        View view2 = this.LIZ;
        view2.offsetLeftAndRight(-(view2.getLeft() - this.LIZJ));
    }

    public C16GQ(View view) {
        this.LIZ = view;
    }
}
