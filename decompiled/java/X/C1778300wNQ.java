package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wNQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1778300wNQ {
    public final EnumC20526215To LIZ;
    public final Long LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1778300wNQ)) {
            return false;
        }
        C1778300wNQ c1778300wNQ = (C1778300wNQ) obj;
        return this.LIZ == c1778300wNQ.LIZ && Intrinsics.LJFF(this.LIZIZ, c1778300wNQ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1778300wNQ.LIZJ);
    }

    public final int hashCode() {
        EnumC20526215To enumC20526215To = this.LIZ;
        int iHashCode = (enumC20526215To == null ? 0 : enumC20526215To.hashCode()) * 31;
        Long l = this.LIZIZ;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.LIZJ;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PendingContext(method=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", topicId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", interestName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1778300wNQ(EnumC20526215To enumC20526215To, Long l, String str) {
        this.LIZ = enumC20526215To;
        this.LIZIZ = l;
        this.LIZJ = str;
    }
}
