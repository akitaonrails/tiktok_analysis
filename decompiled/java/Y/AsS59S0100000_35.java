package Y;

import X.AbstractC1585810rMx;
import X.C1DWH;
import X.InterfaceC652740Piy;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.utils.SearchNestedAutoplayCardHelper;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.searchbrand.autoplay.SearchAdBrandZoneNestedAutoplayCardHelper;

/* JADX INFO: loaded from: classes36.dex */
public class AsS59S0100000_35 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;

    public static final void LJJIIZI$1(AsS59S0100000_35 asS59S0100000_35, RecyclerView recyclerView, int i, int i2) {
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 0:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 1:
                LJJIIJ$1(this, recyclerView, i);
                break;
            case 2:
                LJJIIJ$2(this, recyclerView, i);
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
            case 2:
                LJJIIZI$2(this, recyclerView, i, i2);
                break;
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
        }
    }

    public AsS59S0100000_35(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJIIJ$0(AsS59S0100000_35 asS59S0100000_35, RecyclerView recyclerView, int i) {
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility;
        SearchNestedAutoplayCardHelper searchNestedAutoplayCardHelper = (SearchNestedAutoplayCardHelper) asS59S0100000_35.l0;
        InterfaceC652740Piy interfaceC652740PiyLIZIZ = searchNestedAutoplayCardHelper.LLILLL.LIZIZ(recyclerView, i, searchNestedAutoplayCardHelper.LIZIZ().keySet());
        if (interfaceC652740PiyLIZIZ != null && (searchServiceCenter$AutoPlayAbility = ((SearchNestedAutoplayCardHelper) asS59S0100000_35.l0).LIZIZ().get(interfaceC652740PiyLIZIZ)) != null) {
            ((SearchNestedAutoplayCardHelper) asS59S0100000_35.l0).LIZLLL(searchServiceCenter$AutoPlayAbility);
        }
    }

    public static final void LJJIIJ$1(AsS59S0100000_35 asS59S0100000_35, RecyclerView recyclerView, int i) {
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility;
        SearchNestedAutoplayCardHelper searchNestedAutoplayCardHelper = (SearchNestedAutoplayCardHelper) asS59S0100000_35.l0;
        InterfaceC652740Piy interfaceC652740PiyLJI = searchNestedAutoplayCardHelper.LLILLL.LJI(i, searchNestedAutoplayCardHelper.LL, false, searchNestedAutoplayCardHelper.LLILZLL, searchNestedAutoplayCardHelper.LIZIZ().keySet());
        if (interfaceC652740PiyLJI != null && (searchServiceCenter$AutoPlayAbility = ((SearchNestedAutoplayCardHelper) asS59S0100000_35.l0).LIZIZ().get(interfaceC652740PiyLJI)) != null) {
            ((SearchNestedAutoplayCardHelper) asS59S0100000_35.l0).LIZLLL(searchServiceCenter$AutoPlayAbility);
        }
    }

    public static final void LJJIIJ$2(AsS59S0100000_35 asS59S0100000_35, RecyclerView recyclerView, int i) {
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility;
        SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper = (SearchAdBrandZoneNestedAutoplayCardHelper) asS59S0100000_35.l0;
        InterfaceC652740Piy interfaceC652740PiyLIZIZ = searchAdBrandZoneNestedAutoplayCardHelper.LLILLL.LIZIZ(recyclerView, i, searchAdBrandZoneNestedAutoplayCardHelper.LIZIZ().keySet());
        if (interfaceC652740PiyLIZIZ != null && (searchServiceCenter$AutoPlayAbility = ((SearchAdBrandZoneNestedAutoplayCardHelper) asS59S0100000_35.l0).LIZIZ().get(interfaceC652740PiyLIZIZ)) != null) {
            ((SearchAdBrandZoneNestedAutoplayCardHelper) asS59S0100000_35.l0).LIZLLL(searchServiceCenter$AutoPlayAbility);
        }
    }

    public static final void LJJIIZI$0(AsS59S0100000_35 asS59S0100000_35, RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        SearchNestedAutoplayCardHelper searchNestedAutoplayCardHelper = (SearchNestedAutoplayCardHelper) asS59S0100000_35.l0;
        if (searchNestedAutoplayCardHelper.LLILZLL) {
            C1DWH c1dwh = searchNestedAutoplayCardHelper.LLILLL;
            searchNestedAutoplayCardHelper.LIZIZ().keySet();
            c1dwh.LIZ();
        }
    }

    public static final void LJJIIZI$2(AsS59S0100000_35 asS59S0100000_35, RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        SearchAdBrandZoneNestedAutoplayCardHelper searchAdBrandZoneNestedAutoplayCardHelper = (SearchAdBrandZoneNestedAutoplayCardHelper) asS59S0100000_35.l0;
        if (searchAdBrandZoneNestedAutoplayCardHelper.LLIZ) {
            C1DWH c1dwh = searchAdBrandZoneNestedAutoplayCardHelper.LLILLL;
            searchAdBrandZoneNestedAutoplayCardHelper.LIZIZ().keySet();
            c1dwh.LIZ();
        }
    }
}
