package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qcn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1557190qcn extends AbstractC1557160qck {
    public final AbstractC1557160qck LIZ;
    public final C1562930qm3 LIZIZ;
    public final AbstractC1557160qck LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1557190qcn)) {
            return false;
        }
        C1557190qcn c1557190qcn = (C1557190qcn) obj;
        return Intrinsics.LJFF(this.LIZ, c1557190qcn.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1557190qcn.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1557190qcn.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Binary(left=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", op=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", right=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1557190qcn(AbstractC1557160qck abstractC1557160qck, AbstractC1557160qck abstractC1557160qck2, C1562930qm3 c1562930qm3) {
        this.LIZ = abstractC1557160qck;
        this.LIZIZ = c1562930qm3;
        this.LIZJ = abstractC1557160qck2;
    }
}
