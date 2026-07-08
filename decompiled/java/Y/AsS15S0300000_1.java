package Y;

import X.AbstractC1585810rMx;
import X.C10517049j;
import X.C1748720vbi;
import X.C719302rP;
import X.C958103op;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.aggregation.USAggregationOrderCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.aggregation.USCombineAggregationOrderCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS115S1100000_1;

/* JADX INFO: loaded from: classes2.dex */
public class AsS15S0300000_1 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
        switch (this.$t) {
            case 0:
                LJJIIZI$0(this, recyclerView, i, i2);
                break;
            case 1:
                LJJIIZI$1(this, recyclerView, i, i2);
                break;
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
        }
    }

    public static final void LJJIIJ$0(AsS15S0300000_1 asS15S0300000_1, RecyclerView recyclerView, int i) {
        if (i == 0) {
            if (Math.abs(((USCombineAggregationOrderCell) asS15S0300000_1.l0).LLJI) > C958103op.LJ) {
                int i2 = ((USCombineAggregationOrderCell) asS15S0300000_1.l0).LLJI;
                if (i2 < 0) {
                    C1748720vbi.LIZLLL((RecyclerView) asS15S0300000_1.l1, new C10517049j(), new AwS115S1100000_1("less", (C719302rP) asS15S0300000_1.l2, 6));
                    return;
                } else {
                    if (i2 <= 0) {
                        return;
                    }
                    C1748720vbi.LIZLLL((RecyclerView) asS15S0300000_1.l1, new C10517049j(), new AwS115S1100000_1("more", (C719302rP) asS15S0300000_1.l2, 6));
                    return;
                }
            }
            return;
        }
        ((USCombineAggregationOrderCell) asS15S0300000_1.l0).LLJI = 0;
    }

    public static final void LJJIIJ$1(AsS15S0300000_1 asS15S0300000_1, RecyclerView recyclerView, int i) {
        if (i == 0) {
            if (Math.abs(((USAggregationOrderCell) asS15S0300000_1.l0).LLJJ) > C958103op.LJ) {
                int i2 = ((USAggregationOrderCell) asS15S0300000_1.l0).LLJJ;
                if (i2 < 0) {
                    C1748720vbi.LIZLLL(((View) asS15S0300000_1.l1).findViewById(R.id.us_order_submit_aggregation_order_image_list), new C10517049j(), new AwS115S1100000_1("less", (C719302rP) asS15S0300000_1.l2, 7));
                    return;
                } else {
                    if (i2 <= 0) {
                        return;
                    }
                    C1748720vbi.LIZLLL(((View) asS15S0300000_1.l1).findViewById(R.id.us_order_submit_aggregation_order_image_list), new C10517049j(), new AwS115S1100000_1("more", (C719302rP) asS15S0300000_1.l2, 7));
                    return;
                }
            }
            return;
        }
        ((USAggregationOrderCell) asS15S0300000_1.l0).LLJJ = 0;
    }

    public AsS15S0300000_1(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }

    public static final void LJJIIZI$0(AsS15S0300000_1 asS15S0300000_1, RecyclerView recyclerView, int i, int i2) {
        ((USCombineAggregationOrderCell) asS15S0300000_1.l0).LLJI += i;
    }

    public static final void LJJIIZI$1(AsS15S0300000_1 asS15S0300000_1, RecyclerView recyclerView, int i, int i2) {
        ((USAggregationOrderCell) asS15S0300000_1.l0).LLJJ += i;
    }
}
