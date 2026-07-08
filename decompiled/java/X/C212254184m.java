package X;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.184m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212254184m {
    public final ArrayList<InterfaceC212261184t> LIZ = new ArrayList<>();

    public final void LIZIZ() {
        Iterator<InterfaceC212261184t> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().destroy();
        }
    }

    public final void LIZ(InterfaceC212261184t interfaceC212261184t) {
        this.LIZ.add(interfaceC212261184t);
    }
}
