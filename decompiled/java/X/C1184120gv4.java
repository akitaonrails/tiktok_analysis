package X;

import com.ss.android.ugc.aweme.poi.activity.PoiActivityApi;
import com.ss.android.ugc.aweme.poi.detail.banner.PoiBannerCell;
import com.ss.android.ugc.aweme.poi.detail.banner.PoiBannerModel;
import com.ss.android.ugc.aweme.poi.detail.banner.PoiDetailBannerComponent;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0gv4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1184120gv4 implements InterfaceC1180800gpi, InterfaceC1181600gr0 {
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
        return C13LE.LIZ(PoiDetailBannerComponent.class);
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
    public final InterfaceC1180980gq0<PoiBannerModel> LIZIZ() {
        return new C1208890hZ1(47);
    }

    @Override // X.InterfaceC1181600gr0
    public final void LJI(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(PoiBannerCell.class);
    }

    @Override // X.InterfaceC1180970gpz
    public final boolean LIZLLL(BaseComponentData baseComponentData, boolean z) {
        PoiBannerModel poiBannerModel;
        List<PoiActivityApi.PoiBannerInfo> bannerListInfo = null;
        if ((baseComponentData instanceof PoiBannerModel) && (poiBannerModel = (PoiBannerModel) baseComponentData) != null) {
            bannerListInfo = poiBannerModel.getBannerListInfo();
        }
        if (!((ArrayList) C1194160hBG.LJ("poi_detail", bannerListInfo)).isEmpty()) {
            return true;
        }
        return false;
    }
}
