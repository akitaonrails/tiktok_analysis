package X;

import com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM;
import kotlin.jvm.internal.AwS384S0200000_18;

/* JADX INFO: renamed from: X.0gfW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1174480gfW {
    public final PoiMapModePageVM LIZ;
    public EnumC1174570gff LIZIZ;
    public EnumC1174300gfE LIZJ;

    public final void LIZ() {
        PoiMapModePageVM poiMapModePageVM = this.LIZ;
        poiMapModePageVM.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PageVM - notifyUIStateChange() - newState: ");
        sbLIZ.append(poiMapModePageVM.LL.LIZIZ);
        sbLIZ.append("， newDataState: ");
        sbLIZ.append(poiMapModePageVM.LL.LIZJ);
        C2188811AlT.LIZIZ(sbLIZ);
        C1174480gfW c1174480gfW = poiMapModePageVM.LL;
        poiMapModePageVM.setStateImmediate(new AwS384S0200000_18(c1174480gfW.LIZIZ, c1174480gfW.LIZJ, 280));
    }

    public C1174480gfW(PoiMapModePageVM poiMapModePageVM) {
        this.LIZ = poiMapModePageVM;
    }

    public final synchronized void LIZIZ(EnumC1174300gfE enumC1174300gfE) {
        this.LIZJ = enumC1174300gfE;
        LIZ();
    }

    public final synchronized void LIZJ(EnumC1174570gff enumC1174570gff) {
        this.LIZIZ = enumC1174570gff;
        LIZ();
    }
}
