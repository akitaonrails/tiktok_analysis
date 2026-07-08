package X;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0yBX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1847810yBX {
    public final LinkedList<String> LIZ = new LinkedList<>();
    public final ReadWriteLock LIZIZ = new ReentrantReadWriteLock();

    public final List<String> LIZ() {
        int iLJIIIIZZ;
        InterfaceC1846560y9W interfaceC1846560y9WLIZ = C1847660yBI.LIZ();
        if (interfaceC1846560y9WLIZ != null) {
            iLJIIIIZZ = interfaceC1846560y9WLIZ.LJIIIIZZ();
            if (iLJIIIIZZ > 0) {
            }
            return C13BV.INSTANCE;
        }
        iLJIIIIZZ = 5;
        if (this.LIZ.size() > 0) {
            List<String> listLLIIII = C13LP.LLIIII(this.LIZ.subList(0, Math.min(iLJIIIIZZ, this.LIZ.size())));
            if (C1847960yBm.LJIIIIZZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getMultiRefer:::require size = ");
                sbLIZ.append(iLJIIIIZZ);
                sbLIZ.append(", multirefer: ");
                sbLIZ.append(listLLIIII);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            return listLLIIII;
        }
        return C13BV.INSTANCE;
    }

    public final void LIZIZ(String str) {
        int i = 0;
        if (str == null || str.length() == 0) {
            this.LIZ.clear();
            return;
        }
        while (i < this.LIZ.size() && !u.LJIJI(str, this.LIZ.get(i), true)) {
            i++;
        }
        if (i >= this.LIZ.size()) {
            this.LIZ.add(str);
            return;
        }
        for (int iLJIIJ = C1697810uHb.LJIIJ(this.LIZ); iLJIIJ > i; iLJIIJ--) {
            this.LIZ.remove(iLJIIJ);
        }
    }
}
