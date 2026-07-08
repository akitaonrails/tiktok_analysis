package X;

import com.ss.android.ugc.aweme.poi.detail.reviews.PoiDetailWriteReviewAssem;
import com.ss.android.ugc.aweme.poi.detail.reviews.PoiWriteReviewsCell;
import com.ss.android.ugc.aweme.poi.detail.reviews.v2.PoiDetailWriteReviewAssemV2;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h02, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1187200h02 implements InterfaceC1180800gpi, InterfaceC1181600gr0 {
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
    public final InterfaceC1180980gq0<PoiReviewsApi.PoiWriteReviewResponse> LIZIZ() {
        return new C1208890hZ1(33);
    }

    @Override // X.InterfaceC1181600gr0
    public final void LJI(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(PoiWriteReviewsCell.class);
    }

    @Override // X.InterfaceC1180970gpz
    public final boolean LIZLLL(BaseComponentData baseComponentData, boolean z) {
        if ((C289330BVr.LIZ() != 1 && C289330BVr.LIZ() != 2 && C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_common_write_review_entrance", true) != 2) || baseComponentData == null || !(baseComponentData instanceof PoiReviewsApi.PoiWriteReviewResponse)) {
            return false;
        }
        PoiReviewsApi.PoiWriteReviewResponse poiWriteReviewResponse = (PoiReviewsApi.PoiWriteReviewResponse) baseComponentData;
        Boolean eligible = poiWriteReviewResponse.getEligible();
        Boolean bool = Boolean.TRUE;
        if (!Intrinsics.LJFF(eligible, bool) && !Intrinsics.LJFF(poiWriteReviewResponse.getNeedEvent(), bool)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1180800gpi
    public final C19719912Dl LJFF(BaseComponentData baseComponentData, InterfaceC1181010gq3 interfaceC1181010gq3) {
        Class cls;
        String str;
        int iHashCode;
        if ((baseComponentData instanceof BaseComponentData) && baseComponentData != null && (str = baseComponentData.instanceId) != null && ((iHashCode = str.hashCode()) == -974787853 ? str.equals("poi_write_review_entrance_v2") : iHashCode == 1450848081 ? str.equals("poi_write_review_entrance_v2_above") : iHashCode == 1451857893 && str.equals("poi_write_review_entrance_v2_below"))) {
            cls = PoiDetailWriteReviewAssemV2.class;
        } else {
            cls = PoiDetailWriteReviewAssem.class;
        }
        return C13LE.LIZ(cls);
    }
}
