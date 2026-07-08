package X;

import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import com.ss.android.ugc.aweme.poi.detail.lynx.PoiDetailLynxAssem;
import com.ss.android.ugc.aweme.poi.detail.lynx.PoiLynxCell;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.util.List;

/* JADX INFO: renamed from: X.0gs3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1182250gs3 implements InterfaceC1180800gpi, InterfaceC1181600gr0 {
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
        return C13LE.LIZ(PoiDetailLynxAssem.class);
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1181670gr7 service() {
        return null;
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1180980gq0<PoiDetailApi.PoiDetailLynxResponse> LIZIZ() {
        return new C1208890hZ1(31);
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1181340gqa LJII() {
        return new InterfaceC1181340gqa() { // from class: X.0gs4
            @Override // X.InterfaceC1181340gqa
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1181340gqa
            public final List LIZJ(InterfaceC1181010gq3 interfaceC1181010gq3) {
                return null;
            }

            @Override // X.InterfaceC1181340gqa
            public final List LIZ(BaseComponentData baseComponentData) {
                boolean z = baseComponentData instanceof PoiDetailApi.PoiDetailLynxResponse;
                return null;
            }
        };
    }

    @Override // X.InterfaceC1181600gr0
    public final void LJI(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(PoiLynxCell.class);
    }

    @Override // X.InterfaceC1180970gpz
    public final boolean LIZLLL(BaseComponentData baseComponentData, boolean z) {
        if ((baseComponentData instanceof PoiDetailApi.PoiDetailLynxResponse) && ((PoiDetailApi.PoiDetailLynxResponse) baseComponentData).hasLynxData()) {
            return true;
        }
        return false;
    }
}
