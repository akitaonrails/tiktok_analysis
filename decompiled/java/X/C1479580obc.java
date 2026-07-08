package X;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0obc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1479580obc {
    public final List<C2032207xg<InterfaceC1483520ohy>> LIZ = new CopyOnWriteArrayList();
    public final List<C2032207xg<InterfaceC1483520ohy>> LIZIZ = new CopyOnWriteArrayList();

    public final void LIZ(InterfaceC1483520ohy interfaceC1483520ohy) {
        if (!C1474810oTv.LJJLL().booleanValue()) {
            return;
        }
        C2032207xg c2032207xg = new C2032207xg(interfaceC1483520ohy);
        if (!((CopyOnWriteArrayList) this.LIZ).contains(c2032207xg)) {
            ((CopyOnWriteArrayList) this.LIZ).add(c2032207xg);
        }
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("addVodPlayer: ");
            sbLIZ.append(((CopyOnWriteArrayList) this.LIZ).size());
            C1481110oe5.LIZIZ("PlayerInstanceManager", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LIZIZ(InterfaceC1484830ok5 interfaceC1484830ok5) {
        if (!C1474810oTv.LJJLL().booleanValue()) {
            return;
        }
        ((CopyOnWriteArrayList) this.LIZIZ).remove(new C2032207xg(interfaceC1484830ok5));
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("removeLivePlayer: ");
            sbLIZ.append(((CopyOnWriteArrayList) this.LIZIZ).size());
            C1481110oe5.LIZIZ("PlayerInstanceManager", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LIZJ(InterfaceC1483520ohy interfaceC1483520ohy) {
        if (!C1474810oTv.LJJLL().booleanValue()) {
            return;
        }
        ((CopyOnWriteArrayList) this.LIZ).remove(new C2032207xg(interfaceC1483520ohy));
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("removeVodPlayer: ");
            sbLIZ.append(((CopyOnWriteArrayList) this.LIZ).size());
            C1481110oe5.LIZIZ("PlayerInstanceManager", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
