package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DAB, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DAB extends AbstractC334700DAe {
    public final C334570D9r LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0DAB) && Intrinsics.LJFF(this.LIZ, ((C0DAB) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Allow(input=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DAB(C334570D9r c334570D9r) {
        this.LIZ = c334570D9r;
    }
}
