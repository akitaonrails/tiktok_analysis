package X;

/* JADX INFO: renamed from: X.0YTP, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YTP {
    public static final C054G LIZ;

    static {
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        LIZ = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ.LLIILII()));
    }

    public static void LIZ(C0YTK c0ytk) {
        if (c0ytk != null) {
            C0YMW c0ymw = C0YMW.newBuilder().LIZ;
            c0ymw.code = -1041;
            c0ymw.statusMsg = "IMSDK proxy unavailable";
            c0ytk.LJII(null, null, c0ymw);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0YTO] */
    public static C0YTO LIZIZ(final C0YTK c0ytk, InterfaceC497601wk interfaceC497601wk, C0YTJ c0ytj, boolean z, int i) {
        final AbstractC2238408pq abstractC2238408pqLLIILII;
        final boolean z2 = z;
        final C0YTJ c0ytj2 = c0ytj;
        final InterfaceC497601wk interfaceC497601wk2 = interfaceC497601wk;
        if ((i & 1) != 0) {
            interfaceC497601wk2 = LIZ;
        }
        if ((i & 2) != 0) {
            c0ytj2 = C0YTJ.STARTED;
        }
        if ((i & 4) != 0) {
            C1DFH c1dfh = C0PEM.LIZ;
            abstractC2238408pqLLIILII = C2107308Nj.LIZ.LLIILII();
        } else {
            abstractC2238408pqLLIILII = null;
        }
        final boolean z3 = false;
        if ((i & 16) != 0) {
            z2 = false;
        }
        return new C0YOY() { // from class: X.0YTO
            @Override // X.C0YOY
            public final void onEvent(InterfaceC873750YPl interfaceC873750YPl) {
                if (interfaceC873750YPl instanceof C0YQY) {
                    C23250099c.LIZLLL(interfaceC497601wk2, abstractC2238408pqLLIILII, null, new C0YTL(c0ytj2, c0ytk, interfaceC873750YPl, null), 2);
                    return;
                }
                if (interfaceC873750YPl instanceof C0YPL) {
                    InterfaceC497601wk interfaceC497601wk3 = interfaceC497601wk2;
                    C23250099c.LIZLLL(interfaceC497601wk3, abstractC2238408pqLLIILII, null, new C0YTN(c0ytk, interfaceC873750YPl, null, interfaceC497601wk3, z2, z3), 2);
                } else {
                    if (!(interfaceC873750YPl instanceof C0YQ0)) {
                        return;
                    }
                    InterfaceC497601wk interfaceC497601wk4 = interfaceC497601wk2;
                    C23250099c.LIZLLL(interfaceC497601wk4, abstractC2238408pqLLIILII, null, new C0YTM(c0ytk, interfaceC873750YPl, null, interfaceC497601wk4, z2, z3), 2);
                }
            }
        };
    }
}
