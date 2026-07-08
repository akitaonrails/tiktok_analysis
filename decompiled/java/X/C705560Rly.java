package X;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: X.0Rly, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C705560Rly {
    public static void LIZIZ(InterfaceC705570Rlz interfaceC705570Rlz) {
        Set<InterfaceC705580Rm0> anchorShowListeners = interfaceC705570Rlz.getAnchorShowListeners();
        if (anchorShowListeners != null) {
            Iterator<T> it2 = anchorShowListeners.iterator();
            while (it2.hasNext()) {
                ((InterfaceC705580Rm0) it2.next()).LJJ(interfaceC705570Rlz.LJIIL(), interfaceC705570Rlz.LIZLLL(), interfaceC705570Rlz.getAwemeId());
            }
        }
    }

    public static void LIZ(InterfaceC705570Rlz interfaceC705570Rlz, AbstractC707180Roa abstractC707180Roa) {
        Set<InterfaceC705580Rm0> anchorShowListeners = interfaceC705570Rlz.getAnchorShowListeners();
        if (anchorShowListeners != null) {
            Iterator<T> it2 = anchorShowListeners.iterator();
            while (it2.hasNext()) {
                ((InterfaceC705580Rm0) it2.next()).LJIIZILJ(interfaceC705570Rlz.LJIIL(), abstractC707180Roa, interfaceC705570Rlz.getAwemeId());
            }
        }
    }
}
