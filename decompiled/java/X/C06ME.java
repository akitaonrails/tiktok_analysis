package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.06ME, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06ME implements C06OA {
    public final List<C06MF> LL = new ArrayList();

    @Override // X.C06OA
    public final void LLZLI() {
        Iterator<C06MF> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
    }

    @Override // X.C06OA
    public final void LLLZIL(C06MF c06mf) {
        ((ArrayList) this.LL).remove(c06mf);
    }

    @Override // X.C06OA
    public final void l(C06MF c06mf) {
        ((ArrayList) this.LL).add(c06mf);
    }
}
