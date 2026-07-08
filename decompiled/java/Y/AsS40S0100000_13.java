package Y;

import X.AbstractC1585810rMx;
import X.C1369740lkS;
import X.C798970VVv;
import X.C800880VbK;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.image.SeaSkuImageSpecCell;

/* JADX INFO: loaded from: classes14.dex */
public class AsS40S0100000_13 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 1:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 2:
                LJJIIJ$1(this, recyclerView, i);
                break;
            default:
                super.LJJIIJ(recyclerView, i);
                break;
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        if (this.$t != 0) {
            super.LJJIIZI(recyclerView, i, i2);
        } else {
            LJJIIZI$0(this, recyclerView, i, i2);
        }
    }

    public AsS40S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJIIJ$0(AsS40S0100000_13 asS40S0100000_13, RecyclerView recyclerView, int i) {
        if (i != 0) {
            if (i != 1) {
                ((C798970VVv) asS40S0100000_13.l0).start();
                return;
            } else {
                ((C798970VVv) asS40S0100000_13.l0).start();
                C800880VbK.LIZIZ(((C798970VVv) asS40S0100000_13.l0).LIZ);
                return;
            }
        }
        ((C798970VVv) asS40S0100000_13.l0).stop();
        C800880VbK.LIZ();
    }

    public static final void LJJIIJ$1(AsS40S0100000_13 asS40S0100000_13, RecyclerView recyclerView, int i) {
        ((C1369740lkS) asS40S0100000_13.l0).LJIIJ();
    }

    public static final void LJJIIZI$0(AsS40S0100000_13 asS40S0100000_13, RecyclerView recyclerView, int i, int i2) {
        SeaSkuImageSpecCell seaSkuImageSpecCell = (SeaSkuImageSpecCell) asS40S0100000_13.l0;
        seaSkuImageSpecCell.LLJJIJIL += i;
        seaSkuImageSpecCell.V5();
    }
}
