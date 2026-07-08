package X;

import com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.feed.PoiRecommendFeatureDetailFeedAssemPowerCell;
import com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.feed.PoiRecommendFeatureDetailFeedModule;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;

/* JADX INFO: renamed from: X.0gto, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1183340gto implements InterfaceC1181600gr0 {
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

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1181340gqa LJII() {
        return null;
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1181670gr7 service() {
        return null;
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1180980gq0<PoiRecommendFeatureDetailFeedModule> LIZIZ() {
        return new C1208890hZ1(49);
    }

    @Override // X.InterfaceC1181600gr0
    public final void LJI(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(PoiRecommendFeatureDetailFeedAssemPowerCell.class);
    }

    @Override // X.InterfaceC1180970gpz
    public final boolean LIZLLL(BaseComponentData baseComponentData, boolean z) {
        return baseComponentData instanceof PoiRecommendFeatureDetailFeedModule;
    }
}
