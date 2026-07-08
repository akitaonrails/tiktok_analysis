package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gGl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1159130gGl extends AbstractC1159090gGh {
    public final String LIZ;
    public final EnumC1612690s4J LIZIZ;
    public final C1613010s4p LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1159130gGl)) {
            return false;
        }
        C1159130gGl c1159130gGl = (C1159130gGl) obj;
        return Intrinsics.LJFF(this.LIZ, c1159130gGl.LIZ) && this.LIZIZ == c1159130gGl.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1159130gGl.LIZJ) && this.LIZLLL == c1159130gGl.LIZLLL;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        EnumC1612690s4J enumC1612690s4J = this.LIZIZ;
        int iHashCode2 = (iHashCode + (enumC1612690s4J == null ? 0 : enumC1612690s4J.hashCode())) * 31;
        C1613010s4p c1613010s4p = this.LIZJ;
        return ((iHashCode2 + (c1613010s4p != null ? c1613010s4p.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IapSuccessPendingVerification(paidContentOrderId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sourceWay=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", episodePurchaseParams=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", collectionId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1159090gGh
    public final long LIZ() {
        return this.LIZLLL;
    }

    public C1159130gGl(long j, C1613010s4p c1613010s4p, EnumC1612690s4J enumC1612690s4J, String str) {
        super(j);
        this.LIZ = str;
        this.LIZIZ = enumC1612690s4J;
        this.LIZJ = c1613010s4p;
        this.LIZLLL = j;
    }
}
