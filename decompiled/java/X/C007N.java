package X;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.007N, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C007N implements InterfaceC1443505kv {
    public final int LIZ;
    public final Set<EnumC1450305m1> LIZIZ;
    public final Set<EnumC1450305m1> LIZJ;
    public final Map<String, Object> LIZLLL;

    public C007N() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C007N)) {
            return false;
        }
        C007N c007n = (C007N) obj;
        return this.LIZ == c007n.LIZ && Intrinsics.LJFF(this.LIZIZ, c007n.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c007n.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c007n.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FcpSelectionRuleImpl(showLimit=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", countedTypes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", constrainedTypes=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", parameters=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1443505kv
    public final Set<EnumC1450305m1> LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1443505kv
    public final Set<EnumC1450305m1> LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1443505kv
    public final int LIZJ() {
        return this.LIZ;
    }

    public C007N(int i, Set set, Set set2) {
        Map<String, Object> mapLJ = C2097608Jq.LJ();
        this.LIZ = i;
        this.LIZIZ = set;
        this.LIZJ = set2;
        this.LIZLLL = mapLJ;
    }
}
