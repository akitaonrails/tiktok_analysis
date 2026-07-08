package X;

import m3.b;

/* JADX INFO: renamed from: X.0txJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1685230txJ {
    public static float LIZ(InterfaceC1681050tqZ interfaceC1681050tqZ, long j) {
        if (!C1682450tsp.LIZ(C1682440tso.LIZJ(j), 4294967296L)) {
            C1682410tsl.LIZIZ("Only Sp can convert to Px");
        }
        b bVar = b.LIZ;
        float fLJJ = interfaceC1681050tqZ.LJJ();
        bVar.getClass();
        if (fLJJ >= 1.03f) {
            InterfaceC1685240txK interfaceC1685240txKLIZ = b.LIZ(interfaceC1681050tqZ.LJJ());
            if (interfaceC1685240txKLIZ == null) {
                return C1682440tso.LIZLLL(j) * interfaceC1681050tqZ.LJJ();
            }
            return interfaceC1685240txKLIZ.LIZ(C1682440tso.LIZLLL(j));
        }
        return C1682440tso.LIZLLL(j) * interfaceC1681050tqZ.LJJ();
    }

    public static long LIZIZ(InterfaceC1681050tqZ interfaceC1681050tqZ, float f) {
        float fLJJ;
        b bVar = b.LIZ;
        float fLJJ2 = interfaceC1681050tqZ.LJJ();
        bVar.getClass();
        if (fLJJ2 >= 1.03f) {
            InterfaceC1685240txK interfaceC1685240txKLIZ = b.LIZ(interfaceC1681050tqZ.LJJ());
            if (interfaceC1685240txKLIZ != null) {
                fLJJ = interfaceC1685240txKLIZ.LIZIZ(f);
            } else {
                fLJJ = f / interfaceC1681050tqZ.LJJ();
            }
            return C1682430tsn.LIZLLL(fLJJ);
        }
        return C1682430tsn.LIZLLL(f / interfaceC1681050tqZ.LJJ());
    }
}
