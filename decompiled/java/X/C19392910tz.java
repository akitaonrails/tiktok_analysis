package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.10tz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19392910tz implements InterfaceC497601wk {
    public final AbstractC2238408pq LL;
    public final List<C09AE> LLILLJJLI;

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LL;
    }

    public C19392910tz(final AbstractC19391210ti abstractC19391210ti) {
        C1DFH c1dfh = C0PEM.LIZ;
        this.LL = C2107308Nj.LIZ;
        this.LLILLJJLI = new ArrayList();
        ((ArrayList) abstractC19391210ti.LJI).add(new InterfaceC19391310tj() { // from class: X.10ty
            @Override // X.InterfaceC19391310tj
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC19391310tj
            public final void LIZ() {
                for (C09AE c09ae : (ArrayList) this.LIZ.LLILLJJLI) {
                    if (c09ae.isActive()) {
                        c09ae.LIZIZ(null);
                    }
                }
                ((ArrayList) abstractC19391210ti.LJI).remove(this);
            }
        });
    }
}
