package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wMT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777710wMT {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public C1777710wMT() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777710wMT)) {
            return false;
        }
        C1777710wMT c1777710wMT = (C1777710wMT) obj;
        return Intrinsics.LJFF(this.LIZ, c1777710wMT.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1777710wMT.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1777710wMT.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1777710wMT.LIZLLL) && Intrinsics.LJFF(this.LJ, c1777710wMT.LJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJ;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMBusinessChatLabelUIConfig(textFontKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", textColorValue=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", textColorValueDark=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", backgroundColorValue=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", backgroundColorValueDark=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777710wMT(String str, String str2, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
    }
}
