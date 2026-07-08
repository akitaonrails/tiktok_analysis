package X;

import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS240S0000000_9;

/* JADX INFO: renamed from: X.0NbB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C596950NbB {
    public static final CopyOnWriteArrayList<WeakReference<InterfaceC596980NbE>> LIZ = new CopyOnWriteArrayList<>();

    public static void LIZ(InterfaceC596980NbE interfaceC596980NbE) {
        CopyOnWriteArrayList<WeakReference<InterfaceC596980NbE>> copyOnWriteArrayList = LIZ;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator<WeakReference<InterfaceC596980NbE>> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                if (it2.next().get() == interfaceC596980NbE) {
                    return;
                }
            }
        }
        CopyOnWriteArrayList<WeakReference<InterfaceC596980NbE>> copyOnWriteArrayList2 = LIZ;
        copyOnWriteArrayList2.add(new WeakReference<>(interfaceC596980NbE));
        C19719612Di.LJJIIJ(copyOnWriteArrayList2, AFwS240S0000000_9.get$arr$(819), true);
        C596970NbD.LIZIZ.LIZ(EnumC1733330vCt.EC_LIVE_BILLBOARD_DISPLAY, new InterfaceC596980NbE() { // from class: X.0NbC
            @Override // X.InterfaceC596980NbE
            public final void LJ(C1525630pnt c1525630pnt) {
                Iterator<WeakReference<InterfaceC596980NbE>> it3 = C596950NbB.LIZ.iterator();
                while (it3.hasNext()) {
                    InterfaceC596980NbE interfaceC596980NbE2 = it3.next().get();
                    if (interfaceC596980NbE2 != null) {
                        interfaceC596980NbE2.LJ(c1525630pnt);
                    }
                }
            }
        });
    }
}
