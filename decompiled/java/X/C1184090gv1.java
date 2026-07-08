package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.experiment.SlashComponentUIPreloadExp;
import com.ss.android.ugc.aweme.mapapi.IPoiMapService;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi$PoiDiscoveryCardListResponse;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryCell;
import com.ss.android.ugc.aweme.poi.detail.discovery.mapmode.PoiDetailDiscoveryAssemV3;
import com.ss.android.ugc.aweme.poi.experiment.PoiServerConfigSettings;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0gv1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1184090gv1 implements InterfaceC1180800gpi, InterfaceC1181600gr0 {
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
        return C13LE.LIZ(PoiDetailDiscoveryAssemV3.class);
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1181670gr7 service() {
        return null;
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1180980gq0<PoiDiscoveryApi$PoiDiscoveryCardListResponse> LIZIZ() {
        return new C1208890hZ1(22);
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1181340gqa LJII() {
        if (SlashComponentUIPreloadExp.LIZ("region_discovery")) {
            return new InterfaceC1181340gqa() { // from class: X.0gv2
                @Override // X.InterfaceC1181340gqa
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC1181340gqa
                public final List LIZJ(InterfaceC1181010gq3 interfaceC1181010gq3) {
                    return null;
                }

                @Override // X.InterfaceC1181340gqa
                public final List LIZ(BaseComponentData baseComponentData) {
                    PoiDiscoveryApi$PoiDiscoveryCardListResponse poiDiscoveryApi$PoiDiscoveryCardListResponse;
                    if (PoiServerConfigSettings.LIZIZ() && (baseComponentData instanceof PoiDiscoveryApi$PoiDiscoveryCardListResponse) && (poiDiscoveryApi$PoiDiscoveryCardListResponse = (PoiDiscoveryApi$PoiDiscoveryCardListResponse) baseComponentData) != null && poiDiscoveryApi$PoiDiscoveryCardListResponse.hasDiscoveryContent$poi_release()) {
                        C0XQ7.LJ();
                        if (C0XQ7.LIZ.LJIIJ().isLogin() && ((IPoiMapService) ServiceManager.get().getService(IPoiMapService.class)).LJFF()) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new C1181330gqZ(1, 0, 16, Integer.valueOf(R.layout.e2x), 1, "poi_layout_detail_discovery_v3"));
                            return arrayList;
                        }
                    }
                    return null;
                }
            };
        }
        return null;
    }

    @Override // X.InterfaceC1181600gr0
    public final void LJI(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(PoiDiscoveryCell.class);
    }

    @Override // X.InterfaceC1180970gpz
    public final boolean LIZLLL(BaseComponentData baseComponentData, boolean z) {
        PoiDiscoveryApi$PoiDiscoveryCardListResponse poiDiscoveryApi$PoiDiscoveryCardListResponse;
        if (!PoiServerConfigSettings.LIZIZ() || !(baseComponentData instanceof PoiDiscoveryApi$PoiDiscoveryCardListResponse) || (poiDiscoveryApi$PoiDiscoveryCardListResponse = (PoiDiscoveryApi$PoiDiscoveryCardListResponse) baseComponentData) == null || !poiDiscoveryApi$PoiDiscoveryCardListResponse.hasDiscoveryContent$poi_release()) {
            return false;
        }
        C0XQ7.LJ();
        if (!C0XQ7.LIZ.LJIIJ().isLogin() || !((IPoiMapService) ServiceManager.get().getService(IPoiMapService.class)).LJFF()) {
            return false;
        }
        return true;
    }
}
