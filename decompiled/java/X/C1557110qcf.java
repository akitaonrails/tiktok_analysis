package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qcf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1557110qcf extends AbstractC1557160qck {
    public final AbstractC1557160qck LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1557110qcf) && Intrinsics.LJFF(this.LIZ, ((C1557110qcf) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Grouping(expr=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1557110qcf(AbstractC1557160qck abstractC1557160qck) {
        this.LIZ = abstractC1557160qck;
    }
}
