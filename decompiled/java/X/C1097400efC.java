package X;

import com.bytedance.android.live.livedecision.ILiveDecisionService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0efC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1097400efC {
    public static final C1097400efC LIZ = new C1097400efC();
    public static final Map<InterfaceC1097470efJ, C1097410efD> LIZIZ = new ConcurrentHashMap();
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1097490efL());

    public static final void LIZ() {
        C1097420efE c1097420efE = (C1097420efE) LIZJ.getValue();
        synchronized (c1097420efE) {
            if (c1097420efE.LJ) {
                return;
            }
            c1097420efE.LJ = true;
            C23250099c.LIZLLL(c1097420efE.LJI, null, null, new C1096320edS(c1097420efE, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(final X.InterfaceC1097470efJ r15) {
        /*
            Method dump skipped, instruction units count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1097400efC.LIZIZ(X.0efJ):void");
    }

    public static final void LIZJ(InterfaceC1097470efJ interfaceC1097470efJ) {
        if (interfaceC1097470efJ == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZIZ;
        if (concurrentHashMap.containsKey(interfaceC1097470efJ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("existScene ");
            sbLIZ.append(interfaceC1097470efJ.getSceneKey());
            C1096330edT.LIZ("PreloadEngine", C2188811AlT.LIZIZ(sbLIZ));
            C1097410efD c1097410efD = (C1097410efD) concurrentHashMap.get(interfaceC1097470efJ);
            if (c1097410efD != null) {
                Iterator it2 = ((ArrayList) c1097410efD.LIZ).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1097480efK) it2.next()).destroy();
                }
                ((ArrayList) c1097410efD.LIZ).clear();
                c1097410efD.LIZIZ = null;
                c1097410efD.LIZJ = null;
                c1097410efD.LIZLLL = true;
                Iterator<String> it3 = c1097410efD.LJ.iterator();
                while (it3.hasNext()) {
                    ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).CW(it3.next());
                }
                c1097410efD.LJFF.clear();
            }
            ((ConcurrentHashMap) LIZIZ).remove(interfaceC1097470efJ);
        }
    }
}
