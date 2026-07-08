package X;

import android.view.View;

/* JADX INFO: renamed from: X.0suD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1644870suD implements InterfaceC1644700stw {
    public final View LIZ;
    public View.OnClickListener LIZIZ;
    public boolean LIZJ;

    public C1644870suD(View view) {
        int i;
        this.LIZ = view;
        if (this.LIZJ) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
    }

    @Override // X.InterfaceC1644700stw
    public final void LIZ(View.OnClickListener onClickListener) {
        this.LIZIZ = onClickListener;
        if (this.LIZJ) {
            C786410Ut5.I7(onClickListener, this.LIZ);
        } else {
            C786410Ut5.I7(null, this.LIZ);
        }
    }

    @Override // X.InterfaceC1644700stw
    public final void setEnable(boolean z) {
        int i;
        this.LIZJ = z;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, this.LIZ);
        if (this.LIZJ) {
            C786410Ut5.I7(this.LIZIZ, this.LIZ);
        } else {
            C786410Ut5.I7(null, this.LIZ);
        }
    }
}
