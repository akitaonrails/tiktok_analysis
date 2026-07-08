package X;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PWg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@InterfaceC1294060jmO
public final class C646200PWg {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(420));
    public static WeakReference<InterfaceC648270Pbl> LIZIZ;

    public static void LIZ() {
        InterfaceC648270Pbl interfaceC648270Pbl;
        WeakReference<InterfaceC648270Pbl> weakReference = LIZIZ;
        if (weakReference == null || (interfaceC648270Pbl = weakReference.get()) == null) {
            return;
        }
        interfaceC648270Pbl.LLJJJ();
    }

    public static void LIZIZ() {
        InterfaceC648270Pbl interfaceC648270Pbl;
        WeakReference<InterfaceC648270Pbl> weakReference = LIZIZ;
        if (weakReference == null || (interfaceC648270Pbl = weakReference.get()) == null) {
            return;
        }
        interfaceC648270Pbl.LLLLLIL();
    }

    public static InterfaceC648270Pbl LIZJ() {
        WeakReference<InterfaceC648270Pbl> weakReference = LIZIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static C646190PWf LIZLLL() {
        return (C646190PWf) LIZ.getValue();
    }

    public static void LJ(InterfaceC648350Pbt interfaceC648350Pbt) {
        Iterator it2 = ((ArrayList) LIZLLL().LIZ()).iterator();
        while (it2.hasNext()) {
            InterfaceC648270Pbl interfaceC648270Pbl = (InterfaceC648270Pbl) ((Reference) it2.next()).get();
            if (!Intrinsics.LJFF(interfaceC648270Pbl, interfaceC648350Pbt) && interfaceC648270Pbl != null) {
                interfaceC648270Pbl.LLJJJ();
            }
        }
    }

    public static void LJFF(InterfaceC648270Pbl interfaceC648270Pbl) {
        Iterator it2 = ((ArrayList) LIZLLL().LIZ()).iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(((Reference) it2.next()).get(), interfaceC648270Pbl)) {
                return;
            }
        }
        C646190PWf c646190PWfLIZLLL = LIZLLL();
        WeakReference weakReference = new WeakReference(interfaceC648270Pbl);
        synchronized (c646190PWfLIZLLL) {
            c646190PWfLIZLLL.LIZIZ = true;
            ((ArrayList) c646190PWfLIZLLL.LIZ).add(weakReference);
        }
    }

    public static void LJI(InterfaceC648270Pbl interfaceC648270Pbl) {
        for (Reference reference : (ArrayList) LIZLLL().LIZ()) {
            if (Intrinsics.LJFF(reference.get(), interfaceC648270Pbl)) {
                C646190PWf c646190PWfLIZLLL = LIZLLL();
                synchronized (c646190PWfLIZLLL) {
                    c646190PWfLIZLLL.LIZIZ = true;
                    ((ArrayList) c646190PWfLIZLLL.LIZ).remove(reference);
                }
                return;
            }
        }
    }
}
