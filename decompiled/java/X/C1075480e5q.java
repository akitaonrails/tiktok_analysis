package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0e5q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1075480e5q {
    public static final C01GW<C1075480e5q> LIZIZ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C1075490e5r());
    public final ConcurrentHashMap<String, C1075520e5u> LIZ = new ConcurrentHashMap<>();

    public final InterfaceC1075470e5p LIZIZ(Class cls, String str) {
        C1075520e5u c1075520e5uLIZ = C1075530e5v.LIZ(str, this.LIZ);
        InterfaceC1075470e5p interfaceC1075470e5p = c1075520e5uLIZ.LIZ.get(cls.getName());
        if (interfaceC1075470e5p == null) {
            C1075520e5u c1075520e5uLIZ2 = C1075530e5v.LIZ("hybridkit_default_bid", this.LIZ);
            InterfaceC1075470e5p interfaceC1075470e5p2 = c1075520e5uLIZ2.LIZ.get(cls.getName());
            if (!(interfaceC1075470e5p2 instanceof InterfaceC1075470e5p)) {
                return null;
            }
            return interfaceC1075470e5p2;
        }
        return interfaceC1075470e5p;
    }

    public final void LIZ(String str, Class cls, InterfaceC1075470e5p interfaceC1075470e5p) {
        C1075520e5u c1075520e5uLIZ = C1075530e5v.LIZ(str, this.LIZ);
        String name = cls.getName();
        InterfaceC1075470e5p interfaceC1075470e5p2 = c1075520e5uLIZ.LIZ.get(name);
        if (interfaceC1075470e5p2 != null) {
            interfaceC1075470e5p2.onUnRegister();
        }
        String str2 = c1075520e5uLIZ.LIZIZ;
        if (str2 == null) {
            str2 = null;
        }
        interfaceC1075470e5p.onRegister(str2);
        c1075520e5uLIZ.LIZ.put(name, interfaceC1075470e5p);
    }
}
