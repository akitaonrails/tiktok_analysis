package X;

import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.videolist.limited.PoiLimitedVideoListAssem;
import com.ss.android.ugc.aweme.poi.detail.videolist.limited.PoiLimitedVideoListComponentCell;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;

/* JADX INFO: renamed from: X.0gwv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1185270gwv implements InterfaceC1180800gpi, InterfaceC1181600gr0 {
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
        return C13LE.LIZ(PoiLimitedVideoListAssem.class);
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1181340gqa LJII() {
        return null;
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1180980gq0<PoiListApi.PoiMergedListResponse> LIZIZ() {
        return new C1208890hZ1(46);
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1181670gr7 service() {
        return new C1185120gwg();
    }

    @Override // X.InterfaceC1181600gr0
    public final void LJI(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        viewOnAttachStateChangeListenerC20604515jv.LJIJ(new C1723500ux2(50001, PoiLimitedVideoListComponentCell.class));
    }

    @Override // X.InterfaceC1180970gpz
    public final boolean LIZLLL(BaseComponentData baseComponentData, boolean z) {
        PoiListApi.PoiMergedListResponse poiMergedListResponse;
        if ((baseComponentData instanceof PoiListApi.PoiMergedListResponse) && (poiMergedListResponse = (PoiListApi.PoiMergedListResponse) baseComponentData) != null && poiMergedListResponse.hasMergedList$poi_release()) {
            return true;
        }
        return false;
    }
}
