package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0b7s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C961420b7s extends C955670ayb {
    public final String LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C961420b7s)) {
            return false;
        }
        C961420b7s c961420b7s = (C961420b7s) obj;
        return Intrinsics.LJFF(this.LJ, c961420b7s.LJ) && Intrinsics.LJFF(this.LJFF, c961420b7s.LJFF);
    }

    public final int hashCode() {
        return (this.LJ.hashCode() * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EoyBannerRound1Item(activityUrl=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", announcementStarlingKey=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C961420b7s(String str, String str2) {
        this.LJ = str;
        this.LJFF = str2;
    }
}
