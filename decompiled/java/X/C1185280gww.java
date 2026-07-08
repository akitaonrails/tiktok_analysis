package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.experiment.SlashComponentUIPreloadExp;
import com.ss.android.ugc.aweme.poi.anchor.model.PoiAnchorExtra;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.slash.PoiDetailSlashFragment;
import com.ss.android.ugc.aweme.poi.detail.videolist.PoiVideoListCell;
import com.ss.android.ugc.aweme.poi.detail.videolist.container.PoiDetailPostContainerAssem;
import com.ss.android.ugc.aweme.poi.experiment.PoiDetailVideoListAutoPlayExp;
import com.ss.android.ugc.aweme.poi.experiment.PoiPostOptExp;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0gww, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1185280gww implements InterfaceC1180800gpi, InterfaceC1181600gr0 {
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
        return C13LE.LIZ(PoiDetailPostContainerAssem.class);
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1180980gq0<PoiListApi.PoiMergedListResponse> LIZIZ() {
        return new C1208890hZ1(37);
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1181340gqa LJII() {
        if (SlashComponentUIPreloadExp.LIZ("poi_merged_list") || SlashComponentUIPreloadExp.LIZ("poi_video_list")) {
            return new InterfaceC1181340gqa() { // from class: X.0gwx
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
                    C1185410gx9 c1185410gx9;
                    PoiAnchorExtra poiAnchorExtra;
                    ArrayList arrayList = new ArrayList();
                    if (interfaceC1181010gq3 instanceof PoiDetailSlashFragment) {
                        try {
                            C1173300gdc<C1185600gxS> c1173300gdcQr0 = ((PoiDetailSlashFragment) interfaceC1181010gq3).qr0();
                            String str = null;
                            if (c1173300gdcQr0 != null) {
                                c1185600gxS = c1173300gdcQr0.LIZ;
                            } else {
                                c1185600gxS = null;
                            }
                            if (c1185600gxS != null && (c1185410gx9 = c1185600gxS.LJFF) != null && (poiAnchorExtra = c1185410gx9.getPoiAnchorExtra()) != null) {
                                str = poiAnchorExtra.typeLevel;
                            }
                            EnumC1184730gw3.Companion.getClass();
                            if (C1184920gwM.LIZ(str, false) == EnumC1184730gw3.REGIONAL) {
                                PoiPostOptExp.LIZ.getClass();
                                if (PoiPostOptExp.LIZIZ(str)) {
                                    arrayList.add(new C1181330gqZ(9, 0, 16, Integer.valueOf(R.layout.e0u), 4, "poi_detail_post_cell_waterfall"));
                                } else {
                                    PoiDetailVideoListAutoPlayExp.LIZ.getClass();
                                    if (PoiDetailVideoListAutoPlayExp.LIZIZ(str)) {
                                        arrayList.add(new C1181330gqZ(9, 0, 16, Integer.valueOf(R.layout.e11), 4, "poi_detail_video_cell_two_column"));
                                    }
                                }
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

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1181670gr7 service() {
        return new C1185120gwg();
    }

    @Override // X.InterfaceC1181600gr0
    public final void LJI(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        viewOnAttachStateChangeListenerC20604515jv.LJIJ(new C1723500ux2(50002, PoiVideoListCell.class));
    }

    @Override // X.InterfaceC1180970gpz
    public final boolean LIZLLL(BaseComponentData baseComponentData, boolean z) {
        PoiListApi.PoiMergedListResponse poiMergedListResponse;
        if (baseComponentData instanceof PoiListApi.PoiMergedListResponse) {
            poiMergedListResponse = (PoiListApi.PoiMergedListResponse) baseComponentData;
        } else {
            poiMergedListResponse = null;
        }
        if ((poiMergedListResponse != null && poiMergedListResponse.hasMergedList$poi_release()) || z) {
            return true;
        }
        return false;
    }
}
