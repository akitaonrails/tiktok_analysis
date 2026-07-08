package Y;

import X.AbstractC1585810rMx;
import X.C1185430gxB;
import X.C1185610gxT;
import X.C1558520qew;
import X.InterfaceC665370Q7z;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.dishes.PoiDetailRecommendDishesAssem;
import com.ss.android.ugc.aweme.poi.detail.dishes.PoiRecommendDishesNoPicAssem;
import com.ss.android.ugc.aweme.poi.recommendfeature.list.component.list.PoiRecommendFeatureListAssem;

/* JADX INFO: loaded from: classes19.dex */
public class AsS7S0101000_18 extends AbstractC1585810rMx {
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
                this.i1 = i;
                break;
            case 1:
                this.i1 = i;
                break;
            case 2:
                this.i1 = i2;
                break;
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
        }
    }

    public AsS7S0101000_18(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJIIJ$0(AsS7S0101000_18 asS7S0101000_18, RecyclerView recyclerView, int i) {
        String collectInfo;
        if (i != 0) {
            return;
        }
        if (asS7S0101000_18.i1 != 0) {
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            String poiId = ((C1185610gxT) ((PoiDetailRecommendDishesAssem) asS7S0101000_18.l0).mp()).getPoiId();
            ((PoiDetailRecommendDishesAssem) asS7S0101000_18.l0).mp().getClass();
            PoiListApi.PoiDetailResponse poiDetailResponseLp = ((PoiDetailRecommendDishesAssem) asS7S0101000_18.l0).lp();
            if (poiDetailResponseLp != null) {
                collectInfo = poiDetailResponseLp.getCollectInfo();
            } else {
                collectInfo = null;
            }
            String strGp = ((PoiDetailRecommendDishesAssem) asS7S0101000_18.l0).Gp();
            boolean zFp = ((PoiDetailRecommendDishesAssem) asS7S0101000_18.l0).Fp();
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((PoiDetailRecommendDishesAssem) asS7S0101000_18.l0);
            PageFinder pageFinder = (PageFinder) ((PoiDetailRecommendDishesAssem) asS7S0101000_18.l0).LLJLILLLLZIIL.getValue();
            c1185430gxB.getClass();
            C1185430gxB.LJJLIIIJJIZ(poiId, collectInfo, strGp, zFp, interfaceC665370Q7zLJIIL, pageFinder);
        }
        asS7S0101000_18.i1 = 0;
    }

    public static final void LJJIIJ$1(AsS7S0101000_18 asS7S0101000_18, RecyclerView recyclerView, int i) {
        String collectInfo;
        if (i != 0) {
            return;
        }
        if (asS7S0101000_18.i1 != 0) {
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            String poiId = ((C1185610gxT) ((PoiRecommendDishesNoPicAssem) asS7S0101000_18.l0).mp()).getPoiId();
            ((PoiRecommendDishesNoPicAssem) asS7S0101000_18.l0).mp().getClass();
            PoiListApi.PoiDetailResponse poiDetailResponseLp = ((PoiRecommendDishesNoPicAssem) asS7S0101000_18.l0).lp();
            if (poiDetailResponseLp != null) {
                collectInfo = poiDetailResponseLp.getCollectInfo();
            } else {
                collectInfo = null;
            }
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((PoiRecommendDishesNoPicAssem) asS7S0101000_18.l0);
            PageFinder pageFinder = (PageFinder) ((PoiRecommendDishesNoPicAssem) asS7S0101000_18.l0).LLJLIL.getValue();
            c1185430gxB.getClass();
            C1185430gxB.LJJLIIIJJIZ(poiId, collectInfo, "dishes", false, interfaceC665370Q7zLJIIL, pageFinder);
        }
        asS7S0101000_18.i1 = 0;
    }

    public static final void LJJIIJ$2(AsS7S0101000_18 asS7S0101000_18, RecyclerView recyclerView, int i) {
        if (i != 0) {
            return;
        }
        if (asS7S0101000_18.i1 != 0) {
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((PoiRecommendFeatureListAssem) asS7S0101000_18.l0);
            PageFinder pageFinderVia = PageFinder.via(((PoiRecommendFeatureListAssem) asS7S0101000_18.l0).getContentView());
            c1185430gxB.getClass();
            C1185430gxB.LJJLIIIJL(pageFinderVia, interfaceC665370Q7zLJIIL);
        }
        asS7S0101000_18.i1 = 0;
    }
}
