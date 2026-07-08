package X;

import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.MultiGuestSpotExtra;
import tikcast.linkmic.common.MultiGuestSpotNonSeiExtra;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0b0n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C957030b0n {
    public final long LIZ;
    public final PosIdentity LIZIZ;
    public final MultiGuestSpotExtra LIZJ;
    public final String LIZLLL;
    public final MultiGuestSpotNonSeiExtra LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C957030b0n)) {
            return false;
        }
        C957030b0n c957030b0n = (C957030b0n) obj;
        return this.LIZ == c957030b0n.LIZ && Intrinsics.LJFF(this.LIZIZ, c957030b0n.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c957030b0n.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c957030b0n.LIZLLL) && Intrinsics.LJFF(this.LJ, c957030b0n.LJ) && Intrinsics.LJFF(this.LJFF, c957030b0n.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExternalSpotInfo(spotId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", posIdentity=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", multiGuestSpotExtra=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", cohostSpotExtra=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", multiGuestSpotNonSeiExtra=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", cohostSpotNonSeiExtra=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C957030b0n(long j, PosIdentity posIdentity, String str, int i) {
        this(j, posIdentity, null, (i & 8) != 0 ? null : str, null, null);
    }

    public C957030b0n(long j, PosIdentity posIdentity, MultiGuestSpotExtra multiGuestSpotExtra, String str, MultiGuestSpotNonSeiExtra multiGuestSpotNonSeiExtra, String str2) {
        this.LIZ = j;
        this.LIZIZ = posIdentity;
        this.LIZJ = multiGuestSpotExtra;
        this.LIZLLL = str;
        this.LJ = multiGuestSpotNonSeiExtra;
        this.LJFF = str2;
    }
}
