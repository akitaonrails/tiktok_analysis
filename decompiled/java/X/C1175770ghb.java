package X;

import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailPageVM;
import kotlin.jvm.internal.AwS384S0200000_18;

/* JADX INFO: renamed from: X.0ghb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1175770ghb {
    public final PoiMapDetailPageVM LIZ;
    public EnumC1175790ghd LIZIZ;
    public EnumC1176320giU LIZJ;

    public final void LIZ() {
        PoiMapDetailPageVM poiMapDetailPageVM = this.LIZ;
        poiMapDetailPageVM.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PageVM - notifyUIStateChange() - newState: ");
        sbLIZ.append(poiMapDetailPageVM.LL.LIZIZ);
        sbLIZ.append("， newDataState: ");
        sbLIZ.append(poiMapDetailPageVM.LL.LIZJ);
        C2188811AlT.LIZIZ(sbLIZ);
        C1175770ghb c1175770ghb = poiMapDetailPageVM.LL;
        poiMapDetailPageVM.setStateImmediate(new AwS384S0200000_18(c1175770ghb.LIZIZ, c1175770ghb.LIZJ, 223));
    }

    public C1175770ghb(PoiMapDetailPageVM poiMapDetailPageVM) {
        this.LIZ = poiMapDetailPageVM;
    }

    public final synchronized void LIZJ(EnumC1176320giU enumC1176320giU) {
        this.LIZJ = enumC1176320giU;
        LIZ();
    }

    public final synchronized void LIZLLL(EnumC1175790ghd enumC1175790ghd) {
        this.LIZIZ = enumC1175790ghd;
        LIZ();
    }

    public final void LIZIZ(C1175770ghb c1175770ghb, boolean z) {
        EnumC1176320giU enumC1176320giU = this.LIZJ;
        if (enumC1176320giU != null) {
            enumC1176320giU.onPoiListDataStart(c1175770ghb, z);
        }
    }
}
