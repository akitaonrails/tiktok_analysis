package X;

import android.content.Context;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0lzT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1379050lzT extends AbstractC1585810rMx {
    public final int LL;

    public C1379050lzT(Context context) {
        this.LL = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // X.AbstractC1585810rMx
    public void LJJIIJ(RecyclerView recyclerView, int i) {
        if (i == 0) {
            C1322200kVm.LIZ().LJIJJ();
        }
    }

    @Override // X.AbstractC1585810rMx
    public void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
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
