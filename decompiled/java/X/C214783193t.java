package X;

import Y.AObjectS249S0100000_32;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.193t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214783193t extends AbstractC214786193w {
    public static final int LLJJ = 8;
    public final List<C193Z> LLJILLL;

    @Override // X.AbstractC214786193w
    public List<C19223110Ij> W1() {
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        c13dvLIZIZ.addAll(C214781193r.LIZ(this.LLJILLL, true));
        return C1697820uHc.LIZ(c13dvLIZIZ);
    }

    @Override // X.AbstractC214786193w
    public void i3() {
        G2().yg2(C193F.LIZ).LIZ(this, new AObjectS249S0100000_32(this, 3));
    }

    @Override // X.AbstractC214786193w
    public Boolean c3() {
        return Boolean.TRUE;
    }

    public C214783193t(C1DRG c1drg) {
        super(c1drg);
        this.LLJILLL = new ArrayList();
    }
}
