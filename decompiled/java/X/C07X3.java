package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07X3, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07X3 {
    public final C07X2 LIZ;
    public final C1200104ml LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07X3)) {
            return false;
        }
        C07X3 c07x3 = (C07X3) obj;
        return Intrinsics.LJFF(this.LIZ, c07x3.LIZ) && Intrinsics.LJFF(this.LIZIZ, c07x3.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlotExecutionPlanWithDiagnostics(plan=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", diagnostics=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07X3(C07X2 c07x2, C1200104ml c1200104ml) {
        this.LIZ = c07x2;
        this.LIZIZ = c1200104ml;
    }
}
