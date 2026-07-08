package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0OM1, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OM1 {
    public final List<AbstractC1250290idn> LIZ = new ArrayList();
    public final List<AbstractC1250290idn> LIZIZ = new ArrayList();
    public AbstractC1250270idl LIZJ;
    public boolean LIZLLL;
    public Integer LJ;

    public final void LIZ(List list) {
        ((ArrayList) this.LIZIZ).addAll(list);
    }

    public final void LIZIZ(AbstractC1250290idn... abstractC1250290idnArr) {
        ((ArrayList) this.LIZIZ).addAll(C13LQ.LJJLL(abstractC1250290idnArr));
    }

    public final void LIZJ(int i) {
        this.LJ = Integer.valueOf(i);
    }

    public final void LIZLLL(List list) {
        ((ArrayList) this.LIZ).addAll(list);
    }

    public final void LJ(AbstractC1250290idn... abstractC1250290idnArr) {
        ((ArrayList) this.LIZ).addAll(C13LQ.LJJLL(abstractC1250290idnArr));
    }
}
