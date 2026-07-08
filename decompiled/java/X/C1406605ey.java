package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05ey, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1406605ey extends AbstractC1406905f1 {
    public final int LIZ;
    public final String LIZIZ;
    public final InterfaceC1406105et LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1406605ey)) {
            return false;
        }
        C1406605ey c1406605ey = (C1406605ey) obj;
        return this.LIZ == c1406605ey.LIZ && Intrinsics.LJFF(this.LIZIZ, c1406605ey.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1406605ey.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31;
        InterfaceC1406105et interfaceC1406105et = this.LIZJ;
        return iHashCode + (interfaceC1406105et == null ? 0 : interfaceC1406105et.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed(errorCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorMessage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", customContext=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1406605ey(int i, String str, InterfaceC1406105et interfaceC1406105et) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = interfaceC1406105et;
    }
}
