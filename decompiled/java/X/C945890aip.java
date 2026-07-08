package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aip, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C945890aip extends AbstractC942990ae9 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C945890aip)) {
            return false;
        }
        C945890aip c945890aip = (C945890aip) obj;
        return Intrinsics.LJFF(this.LIZ, c945890aip.LIZ) && Intrinsics.LJFF(this.LIZIZ, c945890aip.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c945890aip.LIZJ) && this.LIZLLL == c945890aip.LIZLLL && Intrinsics.LJFF(this.LJ, c945890aip.LJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31;
        String str4 = this.LJ;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AigcWallpaperResult(picUrl=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", keyword=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", contextKeywords=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", downloadProgress=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", targetFilePath=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C945890aip(String str, String str2, String str3, long j, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = j;
        this.LJ = str4;
    }
}
