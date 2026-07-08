package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0czF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1032950czF extends AbstractC1031660cxA {
    public final AbstractC1033120czW LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1032950czF) && Intrinsics.LJFF(this.LIZ, ((C1032950czF) obj).LIZ);
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

    public C1032950czF(AbstractC1033120czW abstractC1033120czW) {
        this.LIZ = abstractC1033120czW;
    }
}
