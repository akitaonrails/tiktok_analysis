package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0TQX, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public abstract class C0TQX extends AbstractC1585810rMx {
    public boolean LL;

    public abstract void LJJIJIIJIL();

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (i == 0 && linearLayoutManager != null) {
            Integer numValueOf = Integer.valueOf(linearLayoutManager.findLastCompletelyVisibleItemPosition());
            Integer numValueOf2 = Integer.valueOf(linearLayoutManager.getItemCount());
            if (numValueOf != null && numValueOf2 != null && this.LL && numValueOf.intValue() <= numValueOf2.intValue() + 10) {
                LJJIJIIJIL();
            }
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        this.LL = z;
    }
}
