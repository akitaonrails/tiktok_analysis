package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.13mx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20113713mx implements InterfaceC20112813mo {
    public static volatile InterfaceC20112813mo LIZIZ = new InterfaceC20112813mo() { // from class: X.13mw
        @Override // X.InterfaceC20112813mo
        public final /* bridge */ /* synthetic */ InterfaceC20114113n1 LIZ(Class cls, String str) {
            return null;
        }

        @Override // X.InterfaceC20112813mo
        public final <T extends InterfaceC20114113n1> T LIZIZ(Class<T> cls) {
            return null;
        }

        @Override // X.InterfaceC20112813mo
        public final InterfaceC20112813mo LIZJ(Class cls, C20112713mn c20112713mn) {
            return this;
        }
    };
    public final ConcurrentHashMap<String, C20113913mz> LIZ = new ConcurrentHashMap<>();

    @Override // X.InterfaceC20112813mo
    public final <T extends InterfaceC20114113n1> T LIZIZ(Class<T> cls) {
        return (T) LIZ(cls, "default_bid");
    }

    @Override // X.InterfaceC20112813mo
    public final InterfaceC20114113n1 LIZ(Class cls, String str) {
        C20113913mz c20113913mzLIZ = C20113813my.LIZ(str, this.LIZ);
        InterfaceC20114113n1 interfaceC20114113n1 = c20113913mzLIZ.LIZ.get(cls.getName());
        if (interfaceC20114113n1 == null) {
            C20113913mz c20113913mzLIZ2 = C20113813my.LIZ("default_bid", this.LIZ);
            InterfaceC20114113n1 interfaceC20114113n12 = c20113913mzLIZ2.LIZ.get(cls.getName());
            if (!(interfaceC20114113n12 instanceof InterfaceC20114113n1)) {
                return null;
            }
            return interfaceC20114113n12;
        }
        return interfaceC20114113n1;
    }

    @Override // X.InterfaceC20112813mo
    public final InterfaceC20112813mo LIZJ(Class cls, C20112713mn c20112713mn) {
        LIZLLL(cls, c20112713mn);
        return this;
    }

    public final InterfaceC20112813mo LIZLLL(Class cls, InterfaceC20114113n1 interfaceC20114113n1) {
        C20113913mz c20113913mzLIZ = C20113813my.LIZ("default_bid", this.LIZ);
        String name = cls.getName();
        InterfaceC20114113n1 interfaceC20114113n12 = c20113913mzLIZ.LIZ.get(name);
        if (interfaceC20114113n12 != null) {
            interfaceC20114113n12.onUnRegister();
        }
        String str = c20113913mzLIZ.LIZIZ;
        if (str == null) {
            str = null;
        }
        ((C20114313n3) interfaceC20114113n1).LIZ = str;
        c20113913mzLIZ.LIZ.put(name, interfaceC20114113n1);
        return this;
    }
}
