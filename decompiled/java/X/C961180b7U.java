package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0b7U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C961180b7U extends C955670ayb {
    public final String LJ;
    public final long LJFF;
    public final long LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C961180b7U)) {
            return false;
        }
        C961180b7U c961180b7U = (C961180b7U) obj;
        return Intrinsics.LJFF(this.LJ, c961180b7U.LJ) && this.LJFF == c961180b7U.LJFF && this.LJI == c961180b7U.LJI;
    }

    public final int hashCode() {
        return (((this.LJ.hashCode() * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + C786410Ut5.Y2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EoyBannerRound2WarmUpItem(title=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C961180b7U(String str, long j, long j2) {
        this.LJ = str;
        this.LJFF = j;
        this.LJI = j2;
    }
}
