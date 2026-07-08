package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0sff, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1635850sff implements InterfaceC1623400sLa {
    public final List<InterfaceC1635880sfi> LL = new ArrayList();
    public final List<InterfaceC1635880sfi> LLILLJJLI = new ArrayList();

    @Override // X.InterfaceC1623400sLa
    public final void LIZ(C579040MnO c579040MnO) {
        Iterator it2 = ((ArrayList) this.LL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1635880sfi) it2.next()).LIZ(c579040MnO);
        }
    }

    @Override // X.InterfaceC1623400sLa
    public final void LIZIZ(C579040MnO c579040MnO) {
        Iterator it2 = ((ArrayList) this.LL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1635880sfi) it2.next()).LIZIZ(c579040MnO);
        }
    }

    @Override // X.InterfaceC1623400sLa
    public final void LIZLLL(InterfaceC1635880sfi interfaceC1635880sfi) {
        if (!((ArrayList) this.LL).contains(interfaceC1635880sfi)) {
            ((ArrayList) this.LL).add(interfaceC1635880sfi);
        }
    }

    public final void Zf(boolean z) {
        if (z) {
            if (((ArrayList) this.LL).isEmpty()) {
                return;
            }
            for (InterfaceC1635880sfi interfaceC1635880sfi : (ArrayList) this.LL) {
                if (interfaceC1635880sfi.LJJII()) {
                    interfaceC1635880sfi.LJFF();
                    ((ArrayList) this.LLILLJJLI).add(interfaceC1635880sfi);
                }
            }
            return;
        }
        if (!this.LLILLJJLI.isEmpty()) {
            Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1635880sfi) it2.next()).LJIIJ();
            }
            ((ArrayList) this.LLILLJJLI).clear();
        }
    }
}
