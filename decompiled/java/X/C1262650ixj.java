package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ixj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1262650ixj implements InterfaceC1262160iww {
    public final Function0<Unit> LIZ;
    public final List<InterfaceC1262660ixk> LIZIZ = new CopyOnWriteArrayList();

    public C1262650ixj(C1263480iz4 c1263480iz4) {
        this.LIZ = c1263480iz4;
    }

    @Override // X.InterfaceC1262160iww
    public final List<InterfaceC1262230ix3> LIZ(C1262150iwv c1262150iwv) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LIZIZ).iterator();
        while (it2.hasNext()) {
            c1262150iwv = new C1262150iwv(((InterfaceC1262660ixk) it2.next()).L6(c1262150iwv.LIZ), c1262150iwv.LIZIZ);
        }
        return c1262150iwv.LIZ;
    }
}
