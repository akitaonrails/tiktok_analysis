package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xGb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1812510xGb extends AbstractC1812500xGa {
    public final AbstractC1812590xGj LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1812510xGb) && Intrinsics.LJFF(this.LIZ, ((C1812510xGb) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OpenFaqPanel(item=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1812510xGb(AbstractC1812590xGj abstractC1812590xGj) {
        this.LIZ = abstractC1812590xGj;
    }
}
