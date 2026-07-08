package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0vPk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1741300vPk implements InterfaceC1741330vPn {
    public final List<InterfaceC1741330vPn> LIZ = new ArrayList();

    @Override // X.InterfaceC1741330vPn
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1741330vPn
    public final void LIZJ() {
    }

    @Override // X.InterfaceC1741330vPn
    public final void LIZ(C1741260vPg c1741260vPg) {
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1741330vPn) it2.next()).LIZ(c1741260vPg);
        }
    }
}
