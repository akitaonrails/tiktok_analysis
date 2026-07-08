package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wSQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1781400wSQ {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1781400wSQ)) {
            return false;
        }
        C1781400wSQ c1781400wSQ = (C1781400wSQ) obj;
        return Intrinsics.LJFF(this.LIZ, c1781400wSQ.LIZ) && this.LIZIZ == c1781400wSQ.LIZIZ && this.LIZJ == c1781400wSQ.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1781400wSQ.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31;
        String str = this.LIZLLL;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PreparedEnvelope(encodedRaw=" + this.LIZ + ", compatSizeBytes=" + this.LIZIZ + ", envelopeType=" + this.LIZJ + ", valueString=" + this.LIZLLL + ")";
    }

    public C1781400wSQ(String str, int i, int i2, String str2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = str2;
    }
}
