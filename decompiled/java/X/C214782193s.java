package X;

import Y.AObjectS249S0100000_32;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.193s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214782193s extends AbstractC214786193w {
    public static final int LLJJI = 8;
    public final List<C193Z> LLJILLL;
    public final List<C193Z> LLJJ;

    @Override // X.AbstractC214786193w
    public List<C19223110Ij> W1() {
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        if (!this.LLJILLL.isEmpty()) {
            c13dvLIZIZ.add(new C19223110Ij(1001, "", "", -1, false, null));
            c13dvLIZIZ.addAll(C214781193r.LIZ(this.LLJILLL, false));
            c13dvLIZIZ.add(new C19223110Ij(1002, "", "", -1, false, null));
        }
        c13dvLIZIZ.addAll(C214781193r.LIZ(this.LLJJ, false));
        return C1697820uHc.LIZ(c13dvLIZIZ);
    }

    @Override // X.AbstractC214786193w
    public void i3() {
        G2().yg2(C193I.LIZ).LIZ(this, new AObjectS249S0100000_32(this, 4));
        G2().yg2(C193F.LIZ).LIZ(this, new AObjectS249S0100000_32(this, 5));
    }

    @Override // X.AbstractC214786193w
    public Boolean c3() {
        return Boolean.FALSE;
    }

    public C214782193s(C1DRG c1drg) {
        super(c1drg);
        this.LLJILLL = new ArrayList();
        this.LLJJ = new ArrayList();
    }
}
