package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xcF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1825930xcF extends AbstractC1826120xcY {
    public final C1822340xWS LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1825930xcF) && Intrinsics.LJFF(this.LIZ, ((C1825930xcF) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Email(item=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1825930xcF(C1822340xWS c1822340xWS) {
        this.LIZ = c1822340xWS;
    }
}
