package X;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.11aW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19527011aW {
    public InterfaceC1210670hbt LIZ;
    public final C19529011aq LIZIZ = new C19529011aq();

    public final void LIZ(boolean z, C19530211b2 c19530211b2, InterfaceC19526511aR interfaceC19526511aR) {
        if (interfaceC19526511aR.LIZ()) {
            return;
        }
        interfaceC19526511aR.LIZLLL();
        InterfaceC1210670hbt interfaceC1210670hbt = this.LIZ;
        if (interfaceC1210670hbt != null) {
            interfaceC1210670hbt.LIZ(z, c19530211b2, interfaceC19526511aR);
        }
    }

    public final void LIZIZ(InterfaceC19526611aS interfaceC19526611aS, InterfaceC19524311a5 interfaceC19524311a5, int i, String str, Boolean bool) {
        Iterator it2 = ((ArrayList) this.LIZIZ.LIZ).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC19529511av) it2.next()).LIZ(interfaceC19524311a5)) {
                return;
            }
        }
        InterfaceC1210670hbt interfaceC1210670hbt = this.LIZ;
        if (interfaceC1210670hbt != null) {
            interfaceC1210670hbt.LIZIZ(interfaceC19526611aS, interfaceC19524311a5.LJIILLIIL(), i, bool);
        }
    }
}
