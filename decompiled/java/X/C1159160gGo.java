package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gGo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1159160gGo {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Boolean LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1159160gGo)) {
            return false;
        }
        C1159160gGo c1159160gGo = (C1159160gGo) obj;
        return Intrinsics.LJFF(this.LIZ, c1159160gGo.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1159160gGo.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1159160gGo.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1159160gGo.LIZLLL) && Intrinsics.LJFF(this.LJ, c1159160gGo.LJ) && Intrinsics.LJFF(this.LJFF, c1159160gGo.LJFF) && Intrinsics.LJFF(this.LJI, c1159160gGo.LJI) && Intrinsics.LJFF(this.LJII, c1159160gGo.LJII);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.LJ;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJFF;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJI;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJII;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileItemTrackEventData(enterFrom=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tabName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", subTabName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isDrama=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", collectionId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", groupId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", authorId=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1159160gGo(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = bool;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = str6;
        this.LJII = str7;
    }
}
