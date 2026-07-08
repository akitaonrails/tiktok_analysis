package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.191D, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C191D extends C191E {
    public final List<C191E> LJ;

    public C191D() {
        super(0);
        this.LJ = new ArrayList();
    }

    @Override // X.C191E
    public final void LIZIZ(float f) {
        Iterator it2 = ((ArrayList) this.LJ).iterator();
        while (it2.hasNext()) {
            ((C191E) it2.next()).LIZIZ(f);
        }
    }
}
