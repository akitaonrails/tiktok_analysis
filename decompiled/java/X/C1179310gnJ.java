package X;

import com.ss.android.ugc.aweme.poi.detail.ymal.vertical.PoiDetailYmalModule;
import com.ss.android.ugc.aweme.poi.detail.ymal.vertical.PoiVerticalInfiniteYmalAssem;
import com.ss.android.ugc.aweme.poi.detail.ymal.vertical.PoiVerticalInfiniteYmalCell;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.util.List;

/* JADX INFO: renamed from: X.0gnJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1179310gnJ implements InterfaceC1180800gpi, InterfaceC1181600gr0 {
    @Override // X.InterfaceC1180970gpz
    public final boolean LIZ() {
        return true;
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
        return C13LE.LIZ(PoiVerticalInfiniteYmalAssem.class);
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
        return new C1208890hZ1(15);
    }

    @Override // X.InterfaceC1181600gr0
    public final void LJI(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        viewOnAttachStateChangeListenerC20604515jv.LJIJ(new C1723500ux2(50004, PoiVerticalInfiniteYmalCell.class));
    }

    @Override // X.InterfaceC1180970gpz
    public final boolean LIZLLL(BaseComponentData baseComponentData, boolean z) {
        List<PoiGeneralCard> poiListV2;
        if (!(baseComponentData instanceof PoiDetailYmalModule)) {
            return false;
        }
        PoiDetailYmalModule poiDetailYmalModule = (PoiDetailYmalModule) baseComponentData;
        if ((poiDetailYmalModule.getPoiList() == null || !(!r0.isEmpty())) && ((poiListV2 = poiDetailYmalModule.getPoiListV2()) == null || !(!poiListV2.isEmpty()))) {
            return false;
        }
        return true;
    }
}
