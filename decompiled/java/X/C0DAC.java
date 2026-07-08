package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DAC, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DAC extends AbstractC334700DAe {
    public final C0DAN LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0DAC) && Intrinsics.LJFF(this.LIZ, ((C0DAC) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Block(blocked=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DAC(C0DAN c0dan) {
        this.LIZ = c0dan;
    }
}
