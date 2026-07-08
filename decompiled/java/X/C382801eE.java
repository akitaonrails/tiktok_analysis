package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.01eE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C382801eE {
    public final InterfaceC497601wk LIZ;
    public final List<InterfaceC383001eG> LIZIZ;
    public final Map<AbstractC956310azd, InterfaceC382601eC> LIZJ;

    public C382801eE() {
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LIZ = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ));
        this.LIZIZ = new ArrayList();
        this.LIZJ = new LinkedHashMap();
    }

    public final void LIZ(AbstractC956310azd abstractC956310azd) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancel, config=");
        sbLIZ.append(abstractC956310azd);
        C20441214yg.LIZIZ("MultiHostTimerManagerImpl", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC382601eC interfaceC382601eC = (InterfaceC382601eC) ((LinkedHashMap) this.LIZJ).get(abstractC956310azd);
        if (interfaceC382601eC != null) {
            interfaceC382601eC.cancel();
            Iterator it2 = ((ArrayList) this.LIZIZ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC383001eG) it2.next()).LLLIIIL(abstractC956310azd);
            }
        }
    }

    public final void LIZIZ(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancelAll, shouldNotify=");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("MultiHostTimerManagerImpl", C2188811AlT.LIZIZ(sbLIZ));
        for (Map.Entry entry : ((LinkedHashMap) this.LIZJ).entrySet()) {
            AbstractC956310azd abstractC956310azd = (AbstractC956310azd) entry.getKey();
            ((InterfaceC382601eC) entry.getValue()).cancel();
            if (z) {
                Iterator it2 = ((ArrayList) this.LIZIZ).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC383001eG) it2.next()).LLLIIIL(abstractC956310azd);
                }
            }
        }
        ((LinkedHashMap) this.LIZJ).clear();
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [X.01eB, X.01eF] */
    public final void LIZJ(final AbstractC956310azd abstractC956310azd) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start, config=");
        sbLIZ.append(abstractC956310azd);
        C20441214yg.LIZIZ("MultiHostTimerManagerImpl", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZJ.containsKey(abstractC956310azd)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("start, config=");
            sbLIZ2.append(abstractC956310azd);
            sbLIZ2.append(", ignore since already started");
            C20441214yg.LIZIZ("MultiHostTimerManagerImpl", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("createTimer, config=");
        sbLIZ3.append(abstractC956310azd);
        C20441214yg.LIZIZ("MultiHostTimerManagerImpl", C2188811AlT.LIZIZ(sbLIZ3));
        InterfaceC497601wk interfaceC497601wk = this.LIZ;
        C382701eD c382701eD = new C382701eD(interfaceC497601wk);
        this.LIZJ.put(abstractC956310azd, c382701eD);
        long jLIZ = abstractC956310azd.LIZ();
        ?? r7 = new InterfaceC382501eB() { // from class: X.01eF
            @Override // X.InterfaceC382501eB
            public final void LIZ() {
                C382801eE c382801eE = this.LIZ;
                AbstractC956310azd abstractC956310azd2 = abstractC956310azd;
                Iterator it2 = ((ArrayList) c382801eE.LIZIZ).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC383001eG) it2.next()).LJJIJLIJ(abstractC956310azd2);
                }
            }

            @Override // X.InterfaceC382501eB
            public final void LIZLLL() {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("start, onFinish, config=");
                sbLIZ4.append(abstractC956310azd);
                C20441214yg.LIZIZ("MultiHostTimerManagerImpl", C2188811AlT.LIZIZ(sbLIZ4));
                this.LIZ.LIZJ.remove(abstractC956310azd);
            }

            @Override // X.InterfaceC382501eB
            public final void LJLI(long j) {
                C382801eE c382801eE = this.LIZ;
                AbstractC956310azd abstractC956310azd2 = abstractC956310azd;
                Iterator it2 = ((ArrayList) c382801eE.LIZIZ).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC383001eG) it2.next()).LLLLLILLIL(abstractC956310azd2, j);
                }
            }
        };
        long jCurrentTimeMillis = System.currentTimeMillis() + jLIZ;
        C1DFH c1dfh = C0PEM.LIZ;
        AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C382401eA(jCurrentTimeMillis, c382701eD, r7, null), 2);
        c382701eD.LIZIZ = anonymousClass0956LIZLLL;
        anonymousClass0956LIZLLL.LJII(new C5183020f((C382901eF) r7, 15));
    }

    public final void LIZLLL(InterfaceC383001eG interfaceC383001eG) {
        ((ArrayList) this.LIZIZ).add(interfaceC383001eG);
    }

    public final void LJ(InterfaceC383001eG interfaceC383001eG) {
        ((ArrayList) this.LIZIZ).remove(interfaceC383001eG);
    }
}
