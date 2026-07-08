package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07cj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1902307cj {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final InterfaceC1406105et LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1902307cj)) {
            return false;
        }
        C1902307cj c1902307cj = (C1902307cj) obj;
        return Intrinsics.LJFF(this.LIZ, c1902307cj.LIZ) && this.LIZIZ == c1902307cj.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1902307cj.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1902307cj.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31;
        InterfaceC1406105et interfaceC1406105et = this.LIZLLL;
        return iHashCode + (interfaceC1406105et == null ? 0 : interfaceC1406105et.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NodeSkippedFailedMsg(nodeId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorMessage=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", customContext=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1902307cj(String str, int i, String str2, InterfaceC1406105et interfaceC1406105et) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.LIZLLL = interfaceC1406105et;
    }
}
