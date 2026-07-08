package X;

import com.ss.android.ugc.aweme.poi.detail.nearby.PoiDetailNearbyComponent;
import com.ss.android.ugc.aweme.poi.detail.nearby.PoiNearbyCell;
import com.ss.android.ugc.aweme.poi.detail.nearby.PoiNearbyModel;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;

/* JADX INFO: renamed from: X.0gnB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1179230gnB implements InterfaceC1180800gpi, InterfaceC1181600gr0 {
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
        return C13LE.LIZ(PoiDetailNearbyComponent.class);
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
    public final InterfaceC1180980gq0<PoiNearbyModel> LIZIZ() {
        return new C1208890hZ1(39);
    }

    @Override // X.InterfaceC1181600gr0
    public final void LJI(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(PoiNearbyCell.class);
    }

    @Override // X.InterfaceC1180970gpz
    public final boolean LIZLLL(BaseComponentData baseComponentData, boolean z) {
        PoiNearbyModel poiNearbyModel;
        if ((baseComponentData instanceof PoiNearbyModel) && (poiNearbyModel = (PoiNearbyModel) baseComponentData) != null && poiNearbyModel.hasNearbyContent$poi_release()) {
            return true;
        }
        return false;
    }
}
