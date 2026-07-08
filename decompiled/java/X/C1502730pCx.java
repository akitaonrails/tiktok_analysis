package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0pCx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1502730pCx implements InterfaceC1502740pCy {
    public final List<InterfaceC1502750pCz> LIZ;

    @Override // X.InterfaceC1502740pCy
    public final boolean check() {
        List<InterfaceC1502750pCz> list = this.LIZ;
        if ((list instanceof Collection) && ((ArrayList) list).isEmpty()) {
            return true;
        }
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            if (!((InterfaceC1502750pCz) it2.next()).check()) {
                return false;
            }
        }
        return true;
    }

    public C1502730pCx(C1502720pCw c1502720pCw) {
        this.LIZ = c1502720pCw.LIZ;
    }
}
