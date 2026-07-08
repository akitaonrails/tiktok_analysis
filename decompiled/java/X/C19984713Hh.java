package X;

/* JADX INFO: renamed from: X.13Hh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19984713Hh {
    public static final <T> InterfaceC19984213Hc<T> LIZ(AbstractC19984813Hi<T> abstractC19984813Hi, InterfaceC19986313Hx interfaceC19986313Hx, String str) {
        InterfaceC19984213Hc<T> interfaceC19984213HcLIZ = abstractC19984813Hi.LIZ(interfaceC19986313Hx, str);
        if (interfaceC19984213HcLIZ != null) {
            return interfaceC19984213HcLIZ;
        }
        C13G3.LIZ(str, abstractC19984813Hi.LIZJ());
        throw null;
    }

    public static final <T> InterfaceC19984413He<T> LIZIZ(AbstractC19984813Hi<T> abstractC19984813Hi, C13HD c13hd, T t) {
        InterfaceC19984413He<T> interfaceC19984413HeLIZIZ = abstractC19984813Hi.LIZIZ(c13hd, t);
        if (interfaceC19984413HeLIZIZ == null) {
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(t.getClass());
            C13IQ<T> c13iqLIZJ = abstractC19984813Hi.LIZJ();
            String strLJI = c19719912DlLIZ.LJI();
            if (strLJI == null) {
                strLJI = String.valueOf(c19719912DlLIZ);
            }
            C13G3.LIZ(strLJI, c13iqLIZJ);
            throw null;
        }
        return interfaceC19984413HeLIZIZ;
    }
}
