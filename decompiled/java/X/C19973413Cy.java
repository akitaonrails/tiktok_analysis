package X;

/* JADX INFO: renamed from: X.13Cy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19973413Cy {
    public static final Object LIZ(C13D2 c13d2, C13DN c13dn) {
        Object objLIZ = c13d2.get(c13dn);
        if (objLIZ == null) {
            objLIZ = c13dn.LIZ();
        }
        return ((InterfaceC19973313Cx) objLIZ).readValue(c13d2);
    }

    public static final C13D2 LIZIZ(C13DO<?>[] c13doArr, C13D2 c13d2, C13D2 c13d22) {
        C19971913Cj c19971913Cj = C19971913Cj.LLILZIL;
        c19971913Cj.getClass();
        C19971813Ci c19971813Ci = new C19971813Ci(c19971913Cj);
        for (C13DO<?> c13do : c13doArr) {
            AbstractC19973513Cz<?> abstractC19973513Cz = c13do.LIZ;
            if (c13do.LJII || !c13d2.containsKey(abstractC19973513Cz)) {
                c19971813Ci.put(abstractC19973513Cz, abstractC19973513Cz.LIZIZ(c13do, (InterfaceC19973313Cx) c13d22.get(abstractC19973513Cz)));
            }
        }
        return c19971813Ci.build();
    }
}
