package X;

import com.ss.android.ugc.aweme.poi.detail.nearbyv2.PoiNearbyCellV2;
import com.ss.android.ugc.aweme.poi.detail.nearbyv2.model.PoiNearbyV2Model;
import com.ss.android.ugc.aweme.poi.detail.nearbyv2.model.PoiNearbyV2Tab;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.util.List;

/* JADX INFO: renamed from: X.0gnD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1179250gnD implements InterfaceC1181600gr0 {
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
    public final InterfaceC1181340gqa LJII() {
        return null;
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1181670gr7 service() {
        return null;
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1180980gq0<PoiNearbyV2Model> LIZIZ() {
        return new C1208890hZ1(44);
    }

    @Override // X.InterfaceC1181600gr0
    public final void LJI(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(PoiNearbyCellV2.class);
    }

    @Override // X.InterfaceC1180970gpz
    public final boolean LIZLLL(BaseComponentData baseComponentData, boolean z) {
        PoiNearbyV2Model poiNearbyV2Model;
        List<PoiNearbyV2Tab> tabList;
        PoiNearbyV2Tab poiNearbyV2Tab;
        List<PoiGeneralCard> poiList;
        if (baseComponentData instanceof PoiNearbyV2Model) {
            poiNearbyV2Model = (PoiNearbyV2Model) baseComponentData;
        } else {
            poiNearbyV2Model = null;
        }
        if (poiNearbyV2Model == null || (tabList = poiNearbyV2Model.getTabList()) == null || (poiNearbyV2Tab = (PoiNearbyV2Tab) C13LP.LJJJLZIJ(0, tabList)) == null || (poiList = poiNearbyV2Tab.getPoiList()) == null || !(!poiList.isEmpty())) {
            return false;
        }
        return true;
    }
}
