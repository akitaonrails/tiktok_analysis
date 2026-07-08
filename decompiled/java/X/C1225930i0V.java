package X;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0i0V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1225930i0V extends AbstractC1225870i0P {
    public final List<C1226750i1p> LIZ;
    public final C1224630hyP LIZIZ;
    public final List<C1225950i0X> LIZJ;

    @Override // X.AbstractC1225870i0P
    public final C1224630hyP LIZ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC1225870i0P
    public final List<C1225950i0X> LIZIZ() {
        return this.LIZJ;
    }

    public C1225930i0V(EnumC1226540i1U enumC1226540i1U, List list, C1223510hwb c1223510hwb, int i) {
        C20603715jn c20603715jnLIZIZ;
        list = (i & 2) != 0 ? C13BV.INSTANCE : list;
        if ((i & 4) != 0) {
            c20603715jnLIZIZ = C1226680i1i.LIZIZ();
        } else {
            c20603715jnLIZIZ = null;
        }
        c1223510hwb = (i & 32) != 0 ? new C1223510hwb(c20603715jnLIZIZ, false, false) : c1223510hwb;
        this.LIZ = list;
        C622840Obq c622840Obq = new C622840Obq();
        c622840Obq.LJII = EnumC622850Obr.FRAGMENTS_NO_DESTROY;
        this.LIZIZ = new C1224630hyP(c622840Obq);
        this.LIZJ = Collections.singletonList(new C1225950i0X(new C1224570hyJ("see me means wrong", enumC1226540i1U.getValue()), c1223510hwb, list));
    }
}
