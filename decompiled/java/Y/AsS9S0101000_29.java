package Y;

import X.AbstractC1585810rMx;
import X.C19564111gV;
import X.C1AH6;
import X.InterfaceC19564911gd;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes30.dex */
public class AsS9S0101000_29 extends AbstractC1585810rMx {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 0:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 1:
                LJJIIJ$1(this, recyclerView, i);
                break;
            default:
                super.LJJIIJ(recyclerView, i);
                break;
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        if (1 - this.$t != 0) {
            super.LJJIIZI(recyclerView, i, i2);
        } else {
            LJJIIZI$0(this, recyclerView, i, i2);
        }
    }

    public AsS9S0101000_29(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }

    public static final void LJJIIJ$0(AsS9S0101000_29 asS9S0101000_29, RecyclerView recyclerView, int i) {
        View view;
        if (i != 0) {
            return;
        }
        recyclerView.removeOnScrollListener(asS9S0101000_29);
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(asS9S0101000_29.i1);
        if (viewHolderFindViewHolderForAdapterPosition != null && (view = viewHolderFindViewHolderForAdapterPosition.itemView) != null) {
            ((C1AH6) asS9S0101000_29.l0).LJIIIZ(view);
        }
    }

    public static final void LJJIIJ$1(AsS9S0101000_29 asS9S0101000_29, RecyclerView recyclerView, int i) {
        InterfaceC19564911gd interfaceC19564911gd = ((C19564111gV) asS9S0101000_29.l0).LLJIJIL;
        if (interfaceC19564911gd != null) {
            interfaceC19564911gd.LIZ(recyclerView, asS9S0101000_29.i1, i);
        }
    }

    public static final void LJJIIZI$0(AsS9S0101000_29 asS9S0101000_29, RecyclerView recyclerView, int i, int i2) {
        InterfaceC19564911gd interfaceC19564911gd = ((C19564111gV) asS9S0101000_29.l0).LLJIJIL;
        if (interfaceC19564911gd != null) {
            interfaceC19564911gd.LLFF(recyclerView, asS9S0101000_29.i1, i2);
        }
    }
}
