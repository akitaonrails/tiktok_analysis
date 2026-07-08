package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LqZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C555530LqZ implements C007G {
    public final int LIZ;
    public final long LIZIZ;
    public final InterfaceC1406105et LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C555530LqZ)) {
            return false;
        }
        C555530LqZ c555530LqZ = (C555530LqZ) obj;
        return this.LIZ == c555530LqZ.LIZ && this.LIZIZ == c555530LqZ.LIZIZ && Intrinsics.LJFF(this.LIZJ, c555530LqZ.LIZJ);
    }

    public final int hashCode() {
        int iY2 = ((this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31;
        InterfaceC1406105et interfaceC1406105et = this.LIZJ;
        return iY2 + (interfaceC1406105et == null ? 0 : interfaceC1406105et.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Progress(progress=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", remainTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", customContext=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C555530LqZ(int i, long j, InterfaceC1406105et interfaceC1406105et) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = interfaceC1406105et;
    }
}
