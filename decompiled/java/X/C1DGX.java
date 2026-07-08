package X;

import an3.l;
import java.lang.Enum;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS271S0300000_27;

/* JADX INFO: renamed from: X.1DGX, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DGX<KEY extends Enum<KEY>> implements C1DGH {
    public final C1DGK<KEY> LIZ;
    public final C1DGV<KEY> LIZIZ;
    public final C01GW LIZJ;

    @Override // X.C1DGH
    public final Map<Class<C1DGM>, C1DGM> LIZIZ() {
        return (Map) this.LIZJ.getValue();
    }

    public C1DGX(C1DGK<KEY> c1dgk, C1DGV<KEY> c1dgv) {
        this.LIZ = c1dgk;
        this.LIZIZ = c1dgv;
        new LinkedHashMap();
        this.LIZJ = C452501pT.LIZIZ(new C1DGY(this));
    }

    @Override // X.C1DGH
    public final C1DKA LIZ(C1DGK<?> c1dgk, C1DKA c1dka, C1DKA c1dka2) {
        C1DKA c1dkaLJ;
        l<KEY> lVarLIZ = this.LIZIZ.LIZ();
        Set<? extends InterfaceC2217241BqE<C1DKA, ? extends Object>> set = (Set) ((LinkedHashMap) lVarLIZ.LJFF).get(c1dgk);
        if (set != null && !set.isEmpty()) {
            c1dkaLJ = lVarLIZ.LJ(c1dka, c1dka2, set);
        } else {
            c1dkaLJ = c1dka;
        }
        new AwS271S0300000_27(c1dka, c1dkaLJ, c1dka2, 0);
        C2219091BtD.LIZIZ();
        return c1dkaLJ;
    }
}
