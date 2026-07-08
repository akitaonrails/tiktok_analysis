package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I5R, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I5R {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Boolean LIZLLL;
    public final boolean LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0I5R)) {
            return false;
        }
        C0I5R c0i5r = (C0I5R) obj;
        return Intrinsics.LJFF(this.LIZ, c0i5r.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0i5r.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0i5r.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0i5r.LIZLLL) && this.LJ == c0i5r.LJ && Intrinsics.LJFF(this.LJFF, c0i5r.LJFF);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.LIZLLL;
        int iHashCode4 = (((iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        String str4 = this.LJFF;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuotedVideoData(aid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", uid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", secUid=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isStory=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", fromNudgeMsg=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", quotedScene=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0I5R(String str, String str2, Boolean bool) {
        this(bool, str, str2, null, false);
    }

    public C0I5R(Boolean bool, String str, String str2, String str3, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = null;
        this.LIZLLL = bool;
        this.LJ = z;
        this.LJFF = str3;
    }
}
