package X;

import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi$PoiDiscoveryCardListResponseV2;
import com.ss.android.ugc.aweme.poi.detail.map.PoiBackgroundMapComponent;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0guu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1184020guu implements InterfaceC1180800gpi {
    @Override // X.InterfaceC1180970gpz
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1180800gpi
    public final C19719912Dl LJFF(BaseComponentData baseComponentData, InterfaceC1181010gq3 interfaceC1181010gq3) {
        return C13LE.LIZ(PoiBackgroundMapComponent.class);
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
    public final InterfaceC1180980gq0<?> LIZIZ() {
        return new C1208890hZ1(14);
    }

    @Override // X.InterfaceC1180970gpz
    public final boolean LIZLLL(BaseComponentData baseComponentData, boolean z) {
        if (((baseComponentData instanceof PoiListApi.PoiDetailResponse) && Intrinsics.LJFF(((PoiListApi.PoiDetailResponse) baseComponentData).getHaveBackgroundTopMap(), Boolean.TRUE)) || (baseComponentData instanceof PoiDiscoveryApi$PoiDiscoveryCardListResponseV2)) {
            return true;
        }
        return false;
    }
}
