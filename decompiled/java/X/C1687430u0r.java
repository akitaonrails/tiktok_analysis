package X;

import java.util.Collection;
import jkp.j;

/* JADX INFO: renamed from: X.0u0r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1687430u0r {
    public static final <T> InterfaceC1665500tRU<T> LIZ(Iterable<? extends T> iterable) {
        InterfaceC1665500tRU<T> interfaceC1665500tRU;
        if (!(iterable instanceof InterfaceC1665500tRU) || (interfaceC1665500tRU = (InterfaceC1665500tRU) iterable) == null) {
            return LIZJ(iterable);
        }
        return interfaceC1665500tRU;
    }

    public static final <T> InterfaceC1664410tPj<T> LIZIZ(Iterable<? extends T> iterable) {
        InterfaceC1687450u0t interfaceC1687450u0t;
        C19970913Bz c19970913BzBuild;
        InterfaceC1664410tPj<T> interfaceC1664410tPj;
        if (!(iterable instanceof InterfaceC1664410tPj) || (interfaceC1664410tPj = (InterfaceC1664410tPj) iterable) == null) {
            if (!(iterable instanceof InterfaceC1687450u0t) || (interfaceC1687450u0t = (InterfaceC1687450u0t) iterable) == null || (c19970913BzBuild = interfaceC1687450u0t.build()) == null) {
                C19970913Bz c19970913Bz = C19970913Bz.LLILZIL;
                if (iterable instanceof Collection) {
                    return c19970913Bz.LJ((Collection) iterable);
                }
                c19970913Bz.getClass();
                C13C0 c13c0 = new C13C0(c19970913Bz);
                C19719612Di.LJJI(iterable, c13c0);
                return c13c0.build();
            }
            return c19970913BzBuild;
        }
        return interfaceC1664410tPj;
    }

    public static final <T> InterfaceC1664360tPe<T> LIZJ(Iterable<? extends T> iterable) {
        InterfaceC1687440u0s interfaceC1687440u0s;
        InterfaceC1664360tPe<T> interfaceC1664360tPeBuild;
        InterfaceC1664360tPe<T> interfaceC1664360tPe;
        if (!(iterable instanceof InterfaceC1664360tPe) || (interfaceC1664360tPe = (InterfaceC1664360tPe) iterable) == null) {
            if (!(iterable instanceof InterfaceC1687440u0s) || (interfaceC1687440u0s = (InterfaceC1687440u0s) iterable) == null || (interfaceC1664360tPeBuild = interfaceC1687440u0s.build()) == null) {
                j jVar = j.LLILLL;
                if (iterable instanceof Collection) {
                    return jVar.LJ((Collection) iterable);
                }
                C19974813Dm c19974813DmBuilder = jVar.builder();
                C19719612Di.LJJI(iterable, c19974813DmBuilder);
                return c19974813DmBuilder.build();
            }
            return interfaceC1664360tPeBuild;
        }
        return interfaceC1664360tPe;
    }
}
