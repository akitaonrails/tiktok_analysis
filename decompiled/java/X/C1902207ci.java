package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07ci, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1902207ci implements C07ZG {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final InterfaceC1406105et LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1902207ci)) {
            return false;
        }
        C1902207ci c1902207ci = (C1902207ci) obj;
        return Intrinsics.LJFF(this.LIZ, c1902207ci.LIZ) && this.LIZIZ == c1902207ci.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1902207ci.LIZJ) && this.LIZLLL == c1902207ci.LIZLLL && Intrinsics.LJFF(this.LJ, c1902207ci.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31;
        InterfaceC1406105et interfaceC1406105et = this.LJ;
        return iHashCode + (interfaceC1406105et == null ? 0 : interfaceC1406105et.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed(workflowId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorMessage=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", happenTimeMs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", customContext=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C07ZG
    public final String LIZ() {
        return this.LIZ;
    }

    public C1902207ci(String str, int i, String str2, long j, InterfaceC1406105et interfaceC1406105et) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.LIZLLL = j;
        this.LJ = interfaceC1406105et;
    }
}
