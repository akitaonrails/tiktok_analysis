package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08Ks, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2100408Ks {
    public final long LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2100408Ks)) {
            return false;
        }
        C2100408Ks c2100408Ks = (C2100408Ks) obj;
        return this.LIZ == c2100408Ks.LIZ && this.LIZIZ == c2100408Ks.LIZIZ && Intrinsics.LJFF(this.LIZJ, c2100408Ks.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c2100408Ks.LIZLLL) && Intrinsics.LJFF(this.LJ, c2100408Ks.LJ);
    }

    public final int hashCode() {
        int iY2 = ((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        int iHashCode = (iY2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJ;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageRecord(dispatchTimeNs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", finishTimeNs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", handlerInfo=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", phase=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", stackTrace=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final long LIZ() {
        return (this.LIZIZ - this.LIZ) / ((long) 1000000);
    }

    public C2100408Ks(long j, long j2, String str, String str2, String str3) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
    }
}
