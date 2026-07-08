package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0pCv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1502710pCv {
    public final List<InterfaceC1502740pCy> LIZ;

    public final boolean LIZ() {
        List<InterfaceC1502740pCy> listLIZIZ = LIZIZ();
        if ((listLIZIZ instanceof Collection) && ((ArrayList) listLIZIZ).isEmpty()) {
            return false;
        }
        Iterator it2 = ((ArrayList) listLIZIZ).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC1502740pCy) it2.next()).check()) {
                return true;
            }
        }
        return false;
    }

    public final List<InterfaceC1502740pCy> LIZIZ() {
        return this.LIZ;
    }

    public C1502710pCv(C1502700pCu c1502700pCu) {
        this.LIZ = c1502700pCu.LIZ;
    }
}
