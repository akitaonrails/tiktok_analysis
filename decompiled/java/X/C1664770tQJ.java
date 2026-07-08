package X;

import java.util.LinkedHashSet;

/* JADX INFO: renamed from: X.0tQJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1664770tQJ {
    public static LinkedHashSet<InterfaceC1664730tQF> LIZ;

    public static final C1664750tQH LIZ(C1DRG c1drg, Class cls, String str) {
        AbstractC1664760tQI abstractC1664760tQILJIILIIL = c1drg.LJIILIIL(str, cls);
        if (abstractC1664760tQILJIILIIL != null) {
            return new C1664750tQH(abstractC1664760tQILJIILIIL, cls);
        }
        throw new C1664780tQK(C786410Ut5.j4("Dependency not registered %s \n ObjectContainer dependency hierarchy: %s", new Object[]{new C1287930jcV(str, cls).LIZ(), c1drg.LIZIZ()}));
    }

    public static final C1664740tQG LIZIZ(C1DRG c1drg, Class cls, String str) {
        return new C1664740tQG(c1drg.LJIILIIL(str, cls), cls);
    }
}
