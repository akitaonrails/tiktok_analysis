package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0q1x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1534350q1x extends AbstractC1534220q1k<C1534110q1Z> {
    @Override // X.AbstractC1534220q1k
    public final AbstractC1534220q1k<C1534110q1Z> LIZ(C1533790q13 c1533790q13) {
        return this;
    }

    @Override // X.AbstractC1534220q1k
    public final void LIZJ() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1534220q1k
    public final Integer LIZIZ() {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf((int) ((C1534110q1Z) this.LIZLLL).LIZJ.length());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (Integer) c098200Yq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CDNCache, path: ");
        sbLIZ.append(((C1534110q1Z) this.LIZLLL).LIZJ.getAbsolutePath());
        sbLIZ.append(", url: ");
        sbLIZ.append(((C1534110q1Z) this.LIZLLL).LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0q2p] */
    public C1534350q1x(final C1534110q1Z c1534110q1Z) {
        super(c1534110q1Z, C1534110q1Z.class, new InterfaceC1535380q3c() { // from class: X.0q2p
            @Override // X.InterfaceC1535380q3c
            public final boolean isValid() {
                return !c1534110q1Z.LIZLLL() && c1534110q1Z.LIZ();
            }
        }, 8);
    }
}
