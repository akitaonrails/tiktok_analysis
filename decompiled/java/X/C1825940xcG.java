package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xcG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1825940xcG extends AbstractC1826120xcY {
    public final C1822340xWS LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1825940xcG) && Intrinsics.LJFF(this.LIZ, ((C1825940xcG) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Phone(item=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1825940xcG(C1822340xWS c1822340xWS) {
        this.LIZ = c1822340xWS;
    }
}
