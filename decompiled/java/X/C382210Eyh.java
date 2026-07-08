package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Eyh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C382210Eyh {
    public final Integer LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final List<String> LJI;

    public C382210Eyh() {
        this(null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C382210Eyh)) {
            return false;
        }
        C382210Eyh c382210Eyh = (C382210Eyh) obj;
        return Intrinsics.LJFF(this.LIZ, c382210Eyh.LIZ) && Intrinsics.LJFF(this.LIZIZ, c382210Eyh.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c382210Eyh.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c382210Eyh.LIZLLL) && Intrinsics.LJFF(this.LJ, c382210Eyh.LJ) && Intrinsics.LJFF(this.LJFF, c382210Eyh.LJFF) && Intrinsics.LJFF(this.LJI, c382210Eyh.LJI);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJ;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJFF;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list = this.LJI;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditorProAIGCReportModel(biz=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", input=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", promptText=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", promptImage=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", videoId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", imageId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", reportReasons=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C382210Eyh(Integer num, String str, String str2, String str3, String str4, String str5, List<String> list) {
        this.LIZ = num;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = list;
    }
}
