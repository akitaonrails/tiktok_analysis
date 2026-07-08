package X;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0wuC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1798620wuC {
    public static final C1798620wuC LIZ;
    public static final Set<InterfaceC1798630wuD> LIZIZ;
    public static int LIZJ;

    static {
        C1798620wuC c1798620wuC = new C1798620wuC();
        LIZ = c1798620wuC;
        LIZIZ = new CopyOnWriteArraySet();
        LIZJ = 2;
        c1798620wuC.LIZ(new InterfaceC1798630wuD() { // from class: X.0wuE
            @Override // X.InterfaceC1798630wuD
            public final void d(String str, String str2, Throwable th) {
            }

            @Override // X.InterfaceC1798630wuD
            public final void e(String str, String str2, Throwable th) {
            }

            @Override // X.InterfaceC1798630wuD
            public final void i(String str, String str2, Throwable th) {
            }

            @Override // X.InterfaceC1798630wuD
            public final void w(String str, String str2, Throwable th) {
            }
        });
        LIZJ = 4;
    }

    public final synchronized void LIZ(InterfaceC1798630wuD interfaceC1798630wuD) {
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) LIZIZ;
        if (!copyOnWriteArraySet.contains(interfaceC1798630wuD)) {
            copyOnWriteArraySet.add(interfaceC1798630wuD);
        }
    }

    public static void LIZIZ(String str, String str2) {
        if (LIZJ <= 3) {
            Iterator it2 = ((CopyOnWriteArraySet) LIZIZ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1798630wuD) it2.next()).d(str, str2, null);
            }
        }
    }

    public static void LIZLLL(String str, String str2) {
        if (LIZJ <= 4) {
            Iterator it2 = ((CopyOnWriteArraySet) LIZIZ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1798630wuD) it2.next()).i(str, str2, null);
            }
        }
    }

    public static void LIZJ(String str, String str2, Throwable th) {
        if (LIZJ > 6) {
            return;
        }
        Iterator it2 = ((CopyOnWriteArraySet) LIZIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1798630wuD) it2.next()).e(str, str2, th);
        }
    }

    public static void LJ(String str, String str2, Throwable th) {
        if (LIZJ > 5) {
            return;
        }
        Iterator it2 = ((CopyOnWriteArraySet) LIZIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1798630wuD) it2.next()).w(str, str2, th);
        }
    }
}
