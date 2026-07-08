package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mapapi.IPoiMapService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0gjd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1177030gjd {
    public static final C1177030gjd LIZ = new C1177030gjd();

    public static List LIZ(List list, C1177960gl8 c1177960gl8) {
        InterfaceC1177070gjh interfaceC1177070gjhLIZJ = ((IPoiMapService) ServiceManager.get().getService(IPoiMapService.class)).LIZJ(10.0f);
        if (list != null) {
            ArrayList<C1177080gji> arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(interfaceC1177070gjhLIZJ.LIZ((C1177960gl8) it2.next()));
            }
            C1177080gji c1177080gjiLIZ = interfaceC1177070gjhLIZJ.LIZ(c1177960gl8);
            double d = 0.0d;
            double d2 = 0.0d;
            double dMax = 0.0d;
            double dMax2 = 0.0d;
            double d3 = 0.0d;
            double d4 = 0.0d;
            for (C1177080gji c1177080gji : arrayList) {
                dMax = Math.max(dMax, Math.abs(c1177080gji.LIZ - c1177080gjiLIZ.LIZ));
                dMax2 = Math.max(dMax2, Math.abs(c1177080gji.LIZIZ - c1177080gjiLIZ.LIZIZ));
                double d5 = c1177080gjiLIZ.LIZ;
                d = d5 + dMax;
                double d6 = c1177080gjiLIZ.LIZIZ;
                d3 = d6 + dMax2;
                d2 = d5 - dMax;
                d4 = d6 - dMax2;
            }
            if (d >= d2 && d3 >= d4) {
                return C1697810uHb.LJIIJJI(interfaceC1177070gjhLIZJ.LIZIZ(new C1177080gji(d, d3)), interfaceC1177070gjhLIZJ.LIZIZ(new C1177080gji(d2, d4)));
            }
            return null;
        }
        return null;
    }
}
