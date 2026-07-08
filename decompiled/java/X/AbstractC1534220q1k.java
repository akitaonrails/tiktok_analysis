package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: renamed from: X.0q1k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1534220q1k<Type> {
    public final Class<Type> LIZ;
    public InterfaceC1535380q3c LIZIZ;
    public InterfaceC1535280q3S LIZJ;
    public Type LIZLLL;

    public AbstractC1534220q1k() {
        throw null;
    }

    public abstract AbstractC1534220q1k<Type> LIZ(C1533790q13 c1533790q13);

    public Integer LIZIZ() {
        return null;
    }

    public abstract void LIZJ();

    public final AbstractC1534220q1k<Type> LIZLLL(C1533790q13 c1533790q13, boolean z) {
        Object c098200Yq;
        InterfaceC1535380q3c interfaceC1535380q3c;
        if (!z && (interfaceC1535380q3c = this.LIZIZ) != null && !interfaceC1535380q3c.isValid()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("data ");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(" is invalid");
            C1535250q3P c1535250q3P = new C1535250q3P("Data", "tryClone", C2188811AlT.LIZIZ(sbLIZ), null, null, false, null, 120);
            C1534250q1n.LIZ.LJIIJ(new AwS567S0100000_23(c1535250q3P, 44));
            c1533790q13.LJIILIIL(c1535250q3P);
            return null;
        }
        InterfaceC1535280q3S interfaceC1535280q3S = this.LIZJ;
        if (interfaceC1535280q3S != null && !interfaceC1535280q3S.LIZ(c1533790q13)) {
            return null;
        }
        try {
            c098200Yq = LIZ(c1533790q13);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        AbstractC1534220q1k<Type> abstractC1534220q1k = (AbstractC1534220q1k) c098200Yq;
        if (abstractC1534220q1k != null) {
            abstractC1534220q1k.LIZIZ = this.LIZIZ;
            abstractC1534220q1k.LIZJ = this.LIZJ;
            return abstractC1534220q1k;
        }
        C1535250q3P c1535250q3P2 = new C1535250q3P("Data", "tryClone", "data " + this.LIZ + ", " + getClass().getName() + " is not cloned", null, null, false, null, 120);
        C1534250q1n.LIZ.LJIIJ(new AwS567S0100000_23(c1535250q3P2, 43));
        c1533790q13.LJIILIIL(c1535250q3P2);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC1534220q1k(Object obj, Class cls, C1534890q2p c1534890q2p, int i) {
        c1534890q2p = (i & 4) != 0 ? null : c1534890q2p;
        this.LIZ = cls;
        this.LIZIZ = c1534890q2p;
        this.LIZJ = null;
        this.LIZLLL = obj;
    }
}
