package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qcl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1557170qcl extends AbstractC1557160qck {
    public final AbstractC1557160qck LIZ;
    public final C1562930qm3 LIZIZ;
    public final AbstractC1557160qck LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1557170qcl)) {
            return false;
        }
        C1557170qcl c1557170qcl = (C1557170qcl) obj;
        return Intrinsics.LJFF(this.LIZ, c1557170qcl.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1557170qcl.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1557170qcl.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Call(obj=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", name=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", arg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1557170qcl(AbstractC1557160qck abstractC1557160qck, AbstractC1557160qck abstractC1557160qck2, C1562930qm3 c1562930qm3) {
        this.LIZ = abstractC1557160qck;
        this.LIZIZ = c1562930qm3;
        this.LIZJ = abstractC1557160qck2;
    }
}
