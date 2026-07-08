package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nwV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1454090nwV {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;

    public C1454090nwV() {
        this(null, null, null, null, null, null, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1454090nwV)) {
            return false;
        }
        C1454090nwV c1454090nwV = (C1454090nwV) obj;
        return Intrinsics.LJFF(this.LIZ, c1454090nwV.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1454090nwV.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1454090nwV.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1454090nwV.LIZLLL) && Intrinsics.LJFF(this.LJ, c1454090nwV.LJ) && Intrinsics.LJFF(this.LJFF, c1454090nwV.LJFF) && Intrinsics.LJFF(this.LJI, c1454090nwV.LJI) && Intrinsics.LJFF(this.LJII, c1454090nwV.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1454090nwV.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1454090nwV.LJIIIZ);
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
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJFF;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LJI;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LJII;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.LJIIIIZZ;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.LJIIIZ;
        return iHashCode9 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AICoverTemplateSwitchMobParams(functionType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", toCoverId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", fromCoverId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", toTemplateId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", fromTemplateId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", toGenStatus=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", fromGenStatus=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", toTemplateStyle=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", fromTemplateStyle=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1454090nwV(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        str4 = (i & 8) != 0 ? null : str4;
        str5 = (i & 64) != 0 ? null : str5;
        str6 = (i & 128) != 0 ? null : str6;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = str5;
        this.LJII = str6;
        this.LJIIIIZZ = null;
        this.LJIIIZ = null;
    }
}
