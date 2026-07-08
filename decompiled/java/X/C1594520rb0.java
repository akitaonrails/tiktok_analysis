package X;

import Y.AComparatorS43S0000000_24;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.vision.IPhotoSearchService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0rb0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1594520rb0 {
    public final C1594570rb5 LIZ;
    public final List<InterfaceC1594550rb3> LIZIZ;

    public C1594520rb0() {
        C1594570rb5 c1594570rb5 = new C1594570rb5("PausePanelItemManager");
        this.LIZ = c1594570rb5;
        ArrayList arrayList = new ArrayList();
        this.LIZIZ = arrayList;
        InterfaceC1594550rb3 interfaceC1594550rb3LJ = ((IPhotoSearchService) ServiceManager.get().getService(IPhotoSearchService.class)).LJ();
        if (interfaceC1594550rb3LJ != null) {
            arrayList.add(interfaceC1594550rb3LJ);
        }
        List<String> list = C1849807Mi.LIZ;
        if (list.isEmpty()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sortItems. configValue:");
        sbLIZ.append(list);
        c1594570rb5.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        C13LP.LJLLLL(new AComparatorS43S0000000_24(0), arrayList);
    }

    public final List LIZ(C676750Qgb c676750Qgb) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) this.LIZIZ) {
            InterfaceC1594550rb3 interfaceC1594550rb3 = (InterfaceC1594550rb3) obj;
            if (arrayList.size() < 3 && interfaceC1594550rb3.LJ(c676750Qgb)) {
                z = true;
            } else {
                z = false;
            }
            C1594570rb5 c1594570rb5 = this.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getPausePanelItems. canShow:");
            sbLIZ.append(z);
            sbLIZ.append(", itemId:");
            interfaceC1594550rb3.LIZ();
            sbLIZ.append("image_search");
            c1594570rb5.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
            if (z) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
