package X;

import com.ss.android.ugc.aweme.localservice.experiment.SlashComponentUIPreloadExp;
import com.ss.android.ugc.aweme.poi.detail.ymal.vertical.PoiDetailYmalModule;
import com.ss.android.ugc.aweme.poi.detail.ymal.vertical.PoiVerticalLimitedYmalAssem;
import com.ss.android.ugc.aweme.poi.detail.ymal.vertical.PoiVerticalLimitedYmalCell;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0gp3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1180390gp3 implements InterfaceC1180800gpi, InterfaceC1181600gr0 {
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

    @Override // X.InterfaceC1180800gpi
    public final C19719912Dl LJFF(BaseComponentData baseComponentData, InterfaceC1181010gq3 interfaceC1181010gq3) {
        return C13LE.LIZ(PoiVerticalLimitedYmalAssem.class);
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1181670gr7 service() {
        return null;
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1180980gq0<?> LIZIZ() {
        return new C1208890hZ1(16);
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1181340gqa LJII() {
        if (SlashComponentUIPreloadExp.LIZ("poi_vertical_limited_ymal")) {
            return new InterfaceC1181340gqa() { // from class: X.0gp4
                @Override // X.InterfaceC1181340gqa
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC1181340gqa
                public final List LIZJ(InterfaceC1181010gq3 interfaceC1181010gq3) {
                    return null;
                }

                @Override // X.InterfaceC1181340gqa
                public final List LIZ(BaseComponentData baseComponentData) {
                    List<PoiDiscoveryCard> poiList;
                    if ((baseComponentData instanceof PoiDetailYmalModule) && (poiList = ((PoiDetailYmalModule) baseComponentData).getPoiList()) != null && (!poiList.isEmpty())) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new C1181330gqZ(1, 0, 16, Integer.valueOf(R.layout.e3o), 1, "poi_layout_detail_vertical_limited_ymal"));
                        arrayList.add(new C1181330gqZ(3, 0, 16, Integer.valueOf(R.layout.e10), 3, "poi_detail_dishes_nopic_item_layout"));
                        return arrayList;
                    }
                    return null;
                }
            };
        }
        return null;
    }

    @Override // X.InterfaceC1181600gr0
    public final void LJI(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        viewOnAttachStateChangeListenerC20604515jv.LJIJ(new C1723500ux2(50003, PoiVerticalLimitedYmalCell.class));
    }

    @Override // X.InterfaceC1180970gpz
    public final boolean LIZLLL(BaseComponentData baseComponentData, boolean z) {
        List<PoiDiscoveryCard> poiList;
        if (!(baseComponentData instanceof PoiDetailYmalModule) || (poiList = ((PoiDetailYmalModule) baseComponentData).getPoiList()) == null || !(!poiList.isEmpty())) {
            return false;
        }
        return true;
    }
}
