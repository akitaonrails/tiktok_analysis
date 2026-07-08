package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0b8p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C962010b8p extends C955670ayb {
    public final String LJ;
    public final long LJFF;
    public final long LJI;
    public final long LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C962010b8p)) {
            return false;
        }
        C962010b8p c962010b8p = (C962010b8p) obj;
        return Intrinsics.LJFF(this.LJ, c962010b8p.LJ) && this.LJFF == c962010b8p.LJFF && this.LJI == c962010b8p.LJI && this.LJII == c962010b8p.LJII;
    }

    public final int hashCode() {
        return (((((this.LJ.hashCode() * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + C786410Ut5.Y2(this.LJI)) * 31) + C786410Ut5.Y2(this.LJII);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EoyBannerRound2Item(title=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C962010b8p(String str, long j, long j2, long j3) {
        this.LJ = str;
        this.LJFF = j;
        this.LJI = j2;
        this.LJII = j3;
    }
}
