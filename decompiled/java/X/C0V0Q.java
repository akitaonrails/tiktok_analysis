package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0V0Q, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V0Q {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0V0Q)) {
            return false;
        }
        C0V0Q c0v0q = (C0V0Q) obj;
        return Intrinsics.LJFF(this.LIZ, c0v0q.LIZ) && this.LIZIZ == c0v0q.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0v0q.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0v0q.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TransactionRef(transactionId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", apiId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", invokePhase=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", callSiteKey=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0V0Q(String str, int i, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }
}
