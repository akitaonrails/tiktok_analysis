package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0czG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1032960czG extends AbstractC1032220cy4 {
    public final AbstractC1033140czY LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1032960czG) && Intrinsics.LJFF(this.LIZ, ((C1032960czG) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failure(error=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1032960czG(AbstractC1033140czY abstractC1033140czY) {
        this.LIZ = abstractC1033140czY;
    }
}
