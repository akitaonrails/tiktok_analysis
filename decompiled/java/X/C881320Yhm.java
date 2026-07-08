package X;

/* JADX INFO: renamed from: X.0Yhm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C881320Yhm {
    public static void LIZIZ(InterfaceC882100Yj2 interfaceC882100Yj2, InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu) {
        for (AbstractC1491605sg<?> abstractC1491605sg : interfaceC882100Yj2.LJIILIIL()) {
            if (interfaceC882100Yj2.LJFF()) {
                C1490405sU<?> c1490405sU = c879540Yeu.LIZLLL.get(abstractC1491605sg);
                C1490405sU<?> c1490405sULJIIIIZZ = interfaceC882100Yj2.LJIIIIZZ(interfaceC879010Ye3, c879540Yeu, abstractC1491605sg, c1490405sU);
                if (c1490405sU == null) {
                    if (c1490405sULJIIIIZZ != null) {
                        c879540Yeu.LIZLLL.put(abstractC1491605sg, c1490405sULJIIIIZZ);
                    }
                } else if (c1490405sULJIIIIZZ == null) {
                    c879540Yeu.LIZLLL.remove(abstractC1491605sg);
                }
            } else {
                C1490405sU<?> c1490405sULJIIIIZZ2 = interfaceC882100Yj2.LJIIIIZZ(interfaceC879010Ye3, c879540Yeu, abstractC1491605sg, null);
                if (c1490405sULJIIIIZZ2 != null) {
                    c879540Yeu.LIZLLL.put(abstractC1491605sg, c1490405sULJIIIIZZ2);
                } else {
                    c879540Yeu.LIZLLL.remove(abstractC1491605sg);
                }
            }
        }
    }

    public static void LIZ(InterfaceC882100Yj2 interfaceC882100Yj2, InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, InterfaceC879770YfH interfaceC879770YfH) {
        for (AbstractC1491605sg<?> abstractC1491605sg : interfaceC882100Yj2.LJIILIIL()) {
            if (interfaceC882100Yj2.LJFF()) {
                C1490405sU<?> c1490405sU = c879540Yeu.LIZLLL.get(abstractC1491605sg);
                C1490405sU<?> c1490405sULJIILL = interfaceC882100Yj2.LJIILL(interfaceC879010Ye3, c879540Yeu, abstractC1491605sg, c1490405sU);
                if (c1490405sU == null) {
                    if (c1490405sULJIILL != null) {
                        c879540Yeu.LIZLLL.put(abstractC1491605sg, c1490405sULJIILL);
                    }
                } else if (c1490405sULJIILL == null) {
                    c879540Yeu.LIZLLL.remove(abstractC1491605sg);
                }
            } else {
                C1490405sU<?> c1490405sULJIILL2 = interfaceC882100Yj2.LJIILL(interfaceC879010Ye3, c879540Yeu, abstractC1491605sg, null);
                if (c1490405sULJIILL2 != null) {
                    c879540Yeu.LIZLLL.put(abstractC1491605sg, c1490405sULJIILL2);
                } else {
                    c879540Yeu.LIZLLL.remove(abstractC1491605sg);
                }
            }
        }
    }
}
