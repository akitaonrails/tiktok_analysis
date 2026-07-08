package X;

/* JADX INFO: renamed from: X.0YjA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C882180YjA {
    public static void LIZ(InterfaceC882190YjB interfaceC882190YjB, InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu) {
        for (AbstractC886530YqB<?, ?> abstractC886530YqB : interfaceC882190YjB.LIZJ()) {
            if (interfaceC882190YjB.LJFF()) {
                C882270YjJ<?, ?> c882270YjJ = c879540Yeu.LJ.get(abstractC886530YqB);
                C882270YjJ<?, ?> c882270YjJLJ = interfaceC882190YjB.LJ(interfaceC879010Ye3, c879540Yeu, abstractC886530YqB, c882270YjJ);
                if (c882270YjJ == null) {
                    if (c882270YjJLJ != null) {
                        c879540Yeu.LJ.put(abstractC886530YqB, c882270YjJLJ);
                    }
                } else if (c882270YjJLJ == null) {
                    c879540Yeu.LJ.remove(abstractC886530YqB);
                }
            } else {
                C882270YjJ<?, ?> c882270YjJLJ2 = interfaceC882190YjB.LJ(interfaceC879010Ye3, c879540Yeu, abstractC886530YqB, null);
                if (c882270YjJLJ2 != null) {
                    c879540Yeu.LJ.put(abstractC886530YqB, c882270YjJLJ2);
                } else {
                    c879540Yeu.LJ.remove(abstractC886530YqB);
                }
            }
        }
    }
}
