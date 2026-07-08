package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Eyb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C382150Eyb {
    public final C382280Eyo LIZ;
    public final C382060EyS LIZIZ;
    public final C382110EyX LIZJ;

    public C382150Eyb() {
        this(null, null, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C382150Eyb)) {
            return false;
        }
        C382150Eyb c382150Eyb = (C382150Eyb) obj;
        return Intrinsics.LJFF(this.LIZ, c382150Eyb.LIZ) && Intrinsics.LJFF(this.LIZIZ, c382150Eyb.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c382150Eyb.LIZJ);
    }

    public final int hashCode() {
        C382280Eyo c382280Eyo = this.LIZ;
        int iHashCode = (c382280Eyo == null ? 0 : c382280Eyo.hashCode()) * 31;
        C382060EyS c382060EyS = this.LIZIZ;
        int iHashCode2 = (iHashCode + (c382060EyS == null ? 0 : c382060EyS.hashCode())) * 31;
        C382110EyX c382110EyX = this.LIZJ;
        return iHashCode2 + (c382110EyX != null ? c382110EyX.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GenAIQuotaRequest(i2vRequest=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", legacyRequest=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", request=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C382150Eyb(C382280Eyo c382280Eyo, C382060EyS c382060EyS, C382110EyX c382110EyX, int i) {
        c382280Eyo = (i & 1) != 0 ? null : c382280Eyo;
        c382060EyS = (i & 2) != 0 ? null : c382060EyS;
        c382110EyX = (i & 4) != 0 ? null : c382110EyX;
        this.LIZ = c382280Eyo;
        this.LIZIZ = c382060EyS;
        this.LIZJ = c382110EyX;
    }
}
