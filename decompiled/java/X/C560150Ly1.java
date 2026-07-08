package X;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0Ly1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C560150Ly1 extends AbstractC1585810rMx {
    public final int LL;

    public C560150Ly1(int i) {
        this.LL = i;
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        if (i == 0 && C1322200kVm.LIZ().LJIILL()) {
            C1322200kVm.LIZ().LJIJJ();
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        int iAbs = Math.abs(i2);
        if (recyclerView.getScrollState() == 1 && iAbs < this.LL) {
            C1322200kVm.LIZ().LJIJJ();
            return;
        }
        if (recyclerView.getScrollState() == 1 && iAbs >= this.LL) {
            C1322200kVm.LIZ().LJIILLIIL();
        } else {
            if (recyclerView.getScrollState() != 2) {
                return;
            }
            C1322200kVm.LIZ().LJIILLIIL();
        }
    }
}
