package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.experiment.SlashComponentUIPreloadExp;
import com.ss.android.ugc.aweme.poi.anchor.model.PoiAnchorExtra;
import com.ss.android.ugc.aweme.poi.detail.container.model.OwnerInfoModel;
import com.ss.android.ugc.aweme.poi.detail.container.slash.PoiDetailSlashFragment;
import com.ss.android.ugc.aweme.poi.detail.reviews.PoiDetailReviewsAssem;
import com.ss.android.ugc.aweme.poi.detail.reviews.PoiReviewsCell;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0gvY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1184420gvY implements InterfaceC1180800gpi, InterfaceC1181600gr0 {
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
        return C13LE.LIZ(PoiDetailReviewsAssem.class);
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1181670gr7 service() {
        return null;
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1180980gq0<PoiReviewsApi.PoiReviewListResponse> LIZIZ() {
        return new C1208890hZ1(32);
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1181340gqa LJII() {
        if (SlashComponentUIPreloadExp.LIZ("poi_review")) {
            return new InterfaceC1181340gqa() { // from class: X.0gvX
                @Override // X.InterfaceC1181340gqa
                public final List LIZ(BaseComponentData baseComponentData) {
                    return null;
                }

                @Override // X.InterfaceC1181340gqa
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC1181340gqa
                public final List LIZJ(InterfaceC1181010gq3 interfaceC1181010gq3) {
                    C1185600gxS c1185600gxS;
                    String str;
                    boolean z;
                    C1185410gx9 c1185410gx9;
                    PoiAnchorExtra poiAnchorExtra;
                    C1185410gx9 c1185410gx92;
                    PoiAnchorExtra poiAnchorExtra2;
                    ArrayList arrayList = new ArrayList();
                    if (interfaceC1181010gq3 instanceof PoiDetailSlashFragment) {
                        try {
                            C1173300gdc<C1185600gxS> c1173300gdcQr0 = ((PoiDetailSlashFragment) interfaceC1181010gq3).qr0();
                            OwnerInfoModel ownerInfoModel = null;
                            if (c1173300gdcQr0 != null) {
                                c1185600gxS = c1173300gdcQr0.LIZ;
                            } else {
                                c1185600gxS = null;
                            }
                            if (c1185600gxS != null && (c1185410gx92 = c1185600gxS.LJFF) != null && (poiAnchorExtra2 = c1185410gx92.getPoiAnchorExtra()) != null) {
                                str = poiAnchorExtra2.typeLevel;
                            } else {
                                str = null;
                            }
                            if (c1185600gxS != null && (c1185410gx9 = c1185600gxS.LJFF) != null && (poiAnchorExtra = c1185410gx9.getPoiAnchorExtra()) != null) {
                                ownerInfoModel = poiAnchorExtra.ownerInfo;
                            }
                            boolean z2 = false;
                            if (ownerInfoModel != null && C123100dR.LIZ(ownerInfoModel.uid)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            EnumC1184730gw3.Companion.getClass();
                            EnumC1184730gw3 enumC1184730gw3LIZ = C1184920gwM.LIZ(str, z);
                            if (((Number) C1183070gtN.LIZ.getValue()).intValue() >= 1) {
                                z2 = true;
                            }
                            if (z2 && C1183070gtN.LIZ(enumC1184730gw3LIZ)) {
                                arrayList.add(new C1181330gqZ(1, 0, 16, Integer.valueOf(R.layout.e3j), 1, "poi_layout_detail_reviews"));
                                arrayList.add(new C1181330gqZ(3, 0, 16, Integer.valueOf(R.layout.e1w), 3, "poi_item_review_cell"));
                            }
                            C189200o6.m2constructorimpl(Unit.LIZ);
                            return arrayList;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                        }
                    }
                    return arrayList;
                }
            };
        }
        return null;
    }

    @Override // X.InterfaceC1181600gr0
    public final void LJI(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(PoiReviewsCell.class);
    }

    @Override // X.InterfaceC1180970gpz
    public final boolean LIZLLL(BaseComponentData baseComponentData, boolean z) {
        PoiReviewsApi.PoiReviewListResponse poiReviewListResponse;
        if (!C297460BlI.LIZ() || !(baseComponentData instanceof PoiReviewsApi.PoiReviewListResponse) || (poiReviewListResponse = (PoiReviewsApi.PoiReviewListResponse) baseComponentData) == null || !poiReviewListResponse.hasReviewsContent$poi_release()) {
            return false;
        }
        return true;
    }
}
