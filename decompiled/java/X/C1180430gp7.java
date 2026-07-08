package X;

import com.ss.android.ugc.aweme.localservice.experiment.SlashComponentUIPreloadExp;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import com.ss.android.ugc.aweme.poi.detail.dishes.PoiDetailRecommendDishesAssem;
import com.ss.android.ugc.aweme.poi.detail.dishes.PoiRecommendDishesCell;
import com.ss.android.ugc.aweme.poi.detail.dishes.PoiRecommendDishesNoPicAssem;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0gp7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1180430gp7 implements InterfaceC1180800gpi, InterfaceC1181600gr0 {
    @Override // X.InterfaceC1180970gpz
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1181600gr0
    public final void LIZJ(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, C1180920gpu c1180920gpu) {
    }

    @Override // X.InterfaceC1181600gr0
    public final boolean LJ() {
        return false;
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1181670gr7 service() {
        return null;
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1180980gq0<PoiDetailApi.PoiRecommendDishesGroupInfo> LIZIZ() {
        return new C1208890hZ1(27);
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1181340gqa LJII() {
        if (SlashComponentUIPreloadExp.LIZ("poi_recommend_dish")) {
            return new InterfaceC1181340gqa() { // from class: X.0gp6
                @Override // X.InterfaceC1181340gqa
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC1181340gqa
                public final List LIZJ(InterfaceC1181010gq3 interfaceC1181010gq3) {
                    return null;
                }

                @Override // X.InterfaceC1181340gqa
                public final List LIZ(BaseComponentData baseComponentData) {
                    if (baseComponentData instanceof PoiDetailApi.PoiRecommendDishesGroupInfo) {
                        PoiDetailApi.PoiRecommendDishesGroupInfo poiRecommendDishesGroupInfo = (PoiDetailApi.PoiRecommendDishesGroupInfo) baseComponentData;
                        if (poiRecommendDishesGroupInfo.hasRecommendDishes$poi_release()) {
                            ArrayList arrayList = new ArrayList();
                            if (poiRecommendDishesGroupInfo.isNoPictureTypeRecommendDishes$poi_release()) {
                                arrayList.add(new C1181330gqZ(1, 0, 16, Integer.valueOf(R.layout.e3i), 1, "poi_layout_detail_recommend_dishes_nopic"));
                                arrayList.add(new C1181330gqZ(3, 0, 16, Integer.valueOf(R.layout.dzv), 3, "poi_detail_dishes_nopic_item_layout"));
                                return arrayList;
                            }
                            arrayList.add(new C1181330gqZ(1, 0, 16, Integer.valueOf(R.layout.e3h), 1, "poi_layout_detail_recommend_dishes"));
                            arrayList.add(new C1181330gqZ(3, 0, 16, Integer.valueOf(R.layout.dzu), 3, "poi_detail_dishes_item_layout"));
                            return arrayList;
                        }
                        return null;
                    }
                    return null;
                }
            };
        }
        return null;
    }

    @Override // X.InterfaceC1181600gr0
    public final void LJI(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(PoiRecommendDishesCell.class);
    }

    @Override // X.InterfaceC1180970gpz
    public final boolean LIZLLL(BaseComponentData baseComponentData, boolean z) {
        if ((baseComponentData instanceof PoiDetailApi.PoiRecommendDishesGroupInfo) && ((PoiDetailApi.PoiRecommendDishesGroupInfo) baseComponentData).hasRecommendDishes$poi_release()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1180800gpi
    public final C19719912Dl LJFF(BaseComponentData baseComponentData, InterfaceC1181010gq3 interfaceC1181010gq3) {
        Class cls;
        if ((baseComponentData instanceof PoiDetailApi.PoiRecommendDishesGroupInfo) && ((PoiDetailApi.PoiRecommendDishesGroupInfo) baseComponentData).isNoPictureTypeRecommendDishes$poi_release()) {
            cls = PoiRecommendDishesNoPicAssem.class;
        } else {
            cls = PoiDetailRecommendDishesAssem.class;
        }
        return C13LE.LIZ(cls);
    }
}
