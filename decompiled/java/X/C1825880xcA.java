package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xcA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1825880xcA extends AbstractC1826120xcY {
    public final C1822340xWS LIZ;
    public final InterfaceC665370Q7z LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1825880xcA)) {
            return false;
        }
        C1825880xcA c1825880xcA = (C1825880xcA) obj;
        return Intrinsics.LJFF(this.LIZ, c1825880xcA.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1825880xcA.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LIZIZ;
        return iHashCode + (interfaceC665370Q7z == null ? 0 : interfaceC665370Q7z.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DM(item=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", vScope=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1825880xcA(C1822340xWS c1822340xWS, InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LIZ = c1822340xWS;
        this.LIZIZ = interfaceC665370Q7z;
    }
}
