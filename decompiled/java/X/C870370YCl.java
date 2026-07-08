package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YCl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C870370YCl {
    public final int LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final long LJ;
    public final int LJFF;
    public final String LJI;
    public final long LJII;
    public final String LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C870370YCl)) {
            return false;
        }
        C870370YCl c870370YCl = (C870370YCl) obj;
        return this.LIZ == c870370YCl.LIZ && this.LIZIZ == c870370YCl.LIZIZ && Intrinsics.LJFF(this.LIZJ, c870370YCl.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c870370YCl.LIZLLL) && this.LJ == c870370YCl.LJ && this.LJFF == c870370YCl.LJFF && Intrinsics.LJFF(this.LJI, c870370YCl.LJI) && this.LJII == c870370YCl.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c870370YCl.LJIIIIZZ);
    }

    public final int hashCode() {
        int iY2 = ((((((((((((((this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + this.LJFF) * 31) + this.LJI.hashCode()) * 31) + C786410Ut5.Y2(this.LJII)) * 31;
        String str = this.LJIIIIZZ;
        return iY2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaAvailableInfo(msgType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", msgServerId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", taskId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", displayType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", delay=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", msgSource=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", fileSource=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", availableTime=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", sourceVregion=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C870370YCl(long j, int i, String str, int i2, String str2, String str3, long j2, String str4, long j3) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = j2;
        this.LJFF = i2;
        this.LJI = str3;
        this.LJII = j3;
        this.LJIIIIZZ = str4;
    }
}
