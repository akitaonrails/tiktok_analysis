package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08sz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2257908sz {
    public final String LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;
    public final Integer LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final Integer LJIIIIZZ;
    public Integer LJIIIZ;

    public C2257908sz() {
        this(null, null, null, null, null, 0, 0, 0, null, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2257908sz)) {
            return false;
        }
        C2257908sz c2257908sz = (C2257908sz) obj;
        return Intrinsics.LJFF(this.LIZ, c2257908sz.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2257908sz.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2257908sz.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c2257908sz.LIZLLL) && Intrinsics.LJFF(this.LJ, c2257908sz.LJ) && this.LJFF == c2257908sz.LJFF && this.LJI == c2257908sz.LJI && this.LJII == c2257908sz.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c2257908sz.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c2257908sz.LJIIIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.LJ;
        int iHashCode5 = (((((((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.LJFF) * 31) + this.LJI) * 31) + this.LJII) * 31;
        Integer num3 = this.LJIIIIZZ;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.LJIIIZ;
        return iHashCode6 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UEMobData(shootWay=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hasMusic=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isStory=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", understandingType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", imageCount=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", videoCount=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", livePhotoCount=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", isEditorPro=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", isAsyncUnderstanding=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2257908sz(String str, String str2, Integer num, Integer num2, String str3, int i, int i2, int i3, Integer num3, int i4) {
        str = (i4 & 1) != 0 ? null : str;
        str2 = (i4 & 2) != 0 ? null : str2;
        num = (i4 & 4) != 0 ? null : num;
        num2 = (i4 & 8) != 0 ? null : num2;
        str3 = (i4 & 16) != 0 ? null : str3;
        i = (i4 & 32) != 0 ? 0 : i;
        i2 = (i4 & 64) != 0 ? 0 : i2;
        i3 = (i4 & 128) != 0 ? 0 : i3;
        num3 = (i4 & 256) != 0 ? null : num3;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = num;
        this.LIZLLL = num2;
        this.LJ = str3;
        this.LJFF = i;
        this.LJI = i2;
        this.LJII = i3;
        this.LJIIIIZZ = num3;
        this.LJIIIZ = null;
    }
}
