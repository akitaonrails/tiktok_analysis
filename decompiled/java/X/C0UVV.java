package X;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0UVV, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UVV extends AbstractC1585810rMx {
    public final int LL;

    public C0UVV(int i) {
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
