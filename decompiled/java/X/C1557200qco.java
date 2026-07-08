package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qco, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1557200qco extends AbstractC1557160qck {
    public final AbstractC1557160qck LIZ;
    public final C1562930qm3 LIZIZ;
    public final AbstractC1557160qck LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1557200qco)) {
            return false;
        }
        C1557200qco c1557200qco = (C1557200qco) obj;
        return Intrinsics.LJFF(this.LIZ, c1557200qco.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1557200qco.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1557200qco.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Logical(left=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", op=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", right=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1557200qco(AbstractC1557160qck abstractC1557160qck, AbstractC1557160qck abstractC1557160qck2, C1562930qm3 c1562930qm3) {
        this.LIZ = abstractC1557160qck;
        this.LIZIZ = c1562930qm3;
        this.LIZJ = abstractC1557160qck2;
    }
}
