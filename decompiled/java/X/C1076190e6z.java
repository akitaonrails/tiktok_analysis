package X;

import com.ss.android.ugc.aweme.poi.revisit.vm.PoiRevisitViewModel;
import kotlin.jvm.internal.AwS375S0200000_9;

/* JADX INFO: renamed from: X.0e6z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1076190e6z {
    public final PoiRevisitViewModel LIZ;
    public EnumC1177720gkk LIZIZ;
    public EnumC1076160e6w LIZJ;

    public final void LIZ() {
        PoiRevisitViewModel poiRevisitViewModel = this.LIZ;
        poiRevisitViewModel.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notifyStateChange newState: ");
        sbLIZ.append(poiRevisitViewModel.LL.LIZIZ);
        sbLIZ.append("， newDataState: ");
        sbLIZ.append(poiRevisitViewModel.LL.LIZJ);
        C2188811AlT.LIZIZ(sbLIZ);
        C1076190e6z c1076190e6z = poiRevisitViewModel.LL;
        poiRevisitViewModel.setStateImmediate(new AwS375S0200000_9(c1076190e6z.LIZIZ, c1076190e6z.LIZJ, 117));
    }

    public C1076190e6z(PoiRevisitViewModel poiRevisitViewModel) {
        this.LIZ = poiRevisitViewModel;
    }

    public final synchronized void LIZIZ(EnumC1177720gkk enumC1177720gkk) {
        this.LIZIZ = enumC1177720gkk;
        LIZ();
    }
}
