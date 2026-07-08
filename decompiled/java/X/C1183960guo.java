package X;

import com.ss.android.ugc.aweme.poi.detail.container.bottom.stable.PoiStableBottomBarComponent;
import com.ss.android.ugc.aweme.poi.detail.container.bottom.stable.PoiStableBottomBarModule;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;

/* JADX INFO: renamed from: X.0guo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1183960guo implements InterfaceC1180800gpi {
    @Override // X.InterfaceC1180970gpz
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1180800gpi
    public final C19719912Dl LJFF(BaseComponentData baseComponentData, InterfaceC1181010gq3 interfaceC1181010gq3) {
        return C13LE.LIZ(PoiStableBottomBarComponent.class);
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
    public final InterfaceC1180980gq0<PoiStableBottomBarModule> LIZIZ() {
        return new C1208890hZ1(29);
    }

    @Override // X.InterfaceC1180970gpz
    public final boolean LIZLLL(BaseComponentData baseComponentData, boolean z) {
        if (baseComponentData != null && (baseComponentData instanceof PoiStableBottomBarModule)) {
            PoiStableBottomBarModule poiStableBottomBarModule = (PoiStableBottomBarModule) baseComponentData;
            if (poiStableBottomBarModule.getServiceButton() != null || poiStableBottomBarModule.getShareInfo() != null || poiStableBottomBarModule.isCollect() != null) {
                return true;
            }
            return false;
        }
        return false;
    }
}
