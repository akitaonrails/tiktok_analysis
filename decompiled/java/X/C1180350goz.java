package X;

import com.ss.android.ugc.aweme.localservice.experiment.SlashComponentUIPreloadExp;
import com.ss.android.ugc.aweme.poi.detail.charts.PoiChartsCell;
import com.ss.android.ugc.aweme.poi.detail.charts.PoiDetailChartsAssem;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0goz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1180350goz implements InterfaceC1180800gpi, InterfaceC1181600gr0 {
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
        return C13LE.LIZ(PoiDetailChartsAssem.class);
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1181670gr7 service() {
        return null;
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1180980gq0<PoiDetailApi.ChartsBasicData> LIZIZ() {
        return new C1208890hZ1(41);
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1181340gqa LJII() {
        if (SlashComponentUIPreloadExp.LIZ("poi_charts_card") || SlashComponentUIPreloadExp.LIZ("poi_tab_charts")) {
            return new InterfaceC1181340gqa() { // from class: X.0gp0
                @Override // X.InterfaceC1181340gqa
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC1181340gqa
                public final List LIZJ(InterfaceC1181010gq3 interfaceC1181010gq3) {
                    return null;
                }

                @Override // X.InterfaceC1181340gqa
                public final List LIZ(BaseComponentData baseComponentData) {
                    if ((baseComponentData instanceof PoiDetailApi.ChartsBasicData) && ((PoiDetailApi.ChartsBasicData) baseComponentData).hasChartsBasicData$poi_release()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new C1181330gqZ(1, 0, 16, Integer.valueOf(R.layout.e2n), 1, "poi_layout_detail_charts"));
                        arrayList.add(new C1181330gqZ(8, 0, 16, Integer.valueOf(R.layout.dzj), 8, "poi_detail_charts_cell"));
                        return arrayList;
                    }
                    return null;
                }
            };
        }
        return null;
    }

    @Override // X.InterfaceC1181600gr0
    public final void LJI(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        viewOnAttachStateChangeListenerC20604515jv.LJIJ(new C1723500ux2(50011, PoiChartsCell.class));
    }

    @Override // X.InterfaceC1180970gpz
    public final boolean LIZLLL(BaseComponentData baseComponentData, boolean z) {
        if ((baseComponentData instanceof PoiDetailApi.ChartsBasicData) && ((PoiDetailApi.ChartsBasicData) baseComponentData).hasChartsBasicData$poi_release()) {
            return true;
        }
        return false;
    }
}
