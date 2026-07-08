package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0UfG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C777840UfG {
    public static InterfaceC778270Ufx LIZ;
    public static final ArrayList<C09AE> LIZIZ = new ArrayList<>();
    public static final ConcurrentHashMap<EnumC777480Ueg, Set<InterfaceC777850UfH>> LIZJ = new ConcurrentHashMap<>();

    public static void LJFF() {
        LIZ = null;
        Iterator<C09AE> it2 = LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(null);
        }
        LIZIZ.clear();
        LIZJ.clear();
    }

    public static void LIZIZ(EnumC777480Ueg enumC777480Ueg) {
        InterfaceC778270Ufx interfaceC778270Ufx = LIZ;
        if (interfaceC778270Ufx != null) {
            interfaceC778270Ufx.LJIIIIZZ(new C777860UfI(enumC777480Ueg, null));
        }
    }

    public static void LJII(AbstractC777950UfR abstractC777950UfR) {
        InterfaceC778270Ufx interfaceC778270Ufx = LIZ;
        if (interfaceC778270Ufx != null) {
            interfaceC778270Ufx.LJFF(abstractC777950UfR);
        }
    }

    public static void LIZ(EnumC777480Ueg enumC777480Ueg, InterfaceC777850UfH interfaceC777850UfH) {
        ConcurrentHashMap<EnumC777480Ueg, Set<InterfaceC777850UfH>> concurrentHashMap = LIZJ;
        Set<InterfaceC777850UfH> copyOnWriteArraySet = concurrentHashMap.get(enumC777480Ueg);
        if (copyOnWriteArraySet == null) {
            copyOnWriteArraySet = new CopyOnWriteArraySet<>();
            concurrentHashMap.put(enumC777480Ueg, copyOnWriteArraySet);
        }
        copyOnWriteArraySet.add(interfaceC777850UfH);
    }

    public static void LIZJ(EnumC777480Ueg enumC777480Ueg, String str) {
        InterfaceC778270Ufx interfaceC778270Ufx = LIZ;
        if (interfaceC778270Ufx != null) {
            interfaceC778270Ufx.LJIIIIZZ(new C777860UfI(enumC777480Ueg, str));
        }
    }

    public static void LJ(AbstractC777950UfR abstractC777950UfR, EnumC778130Ufj enumC778130Ufj) {
        Set<InterfaceC777850UfH> set;
        if (abstractC777950UfR != null && (set = LIZJ.get(abstractC777950UfR.LJ())) != null) {
            Iterator<T> it2 = set.iterator();
            while (it2.hasNext()) {
                ((InterfaceC777850UfH) it2.next()).LJII(abstractC777950UfR, enumC778130Ufj);
            }
        }
    }

    public static void LJI(EnumC777480Ueg enumC777480Ueg, InterfaceC777850UfH interfaceC777850UfH) {
        Set<InterfaceC777850UfH> set = LIZJ.get(enumC777480Ueg);
        if (set != null && !set.isEmpty()) {
            set.remove(interfaceC777850UfH);
        }
    }

    public static void LIZLLL(EnumC777480Ueg enumC777480Ueg, String str, long j) {
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        LIZIZ.add(C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C777830UfF(j, enumC777480Ueg, str, null), 2));
    }
}
