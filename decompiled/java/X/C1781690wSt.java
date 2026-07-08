package X;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wSt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1781690wSt {
    public final String LIZ;
    public final int LIZIZ;
    public final Long LIZJ;
    public final String LIZLLL;
    public final Integer LJ;
    public final String LJFF;
    public final Long LJI;
    public final JSONObject LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1781690wSt)) {
            return false;
        }
        C1781690wSt c1781690wSt = (C1781690wSt) obj;
        return Intrinsics.LJFF(this.LIZ, c1781690wSt.LIZ) && this.LIZIZ == c1781690wSt.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1781690wSt.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1781690wSt.LIZLLL) && Intrinsics.LJFF(this.LJ, c1781690wSt.LJ) && Intrinsics.LJFF(this.LJFF, c1781690wSt.LJFF) && Intrinsics.LJFF(this.LJI, c1781690wSt.LJI) && Intrinsics.LJFF(this.LJII, c1781690wSt.LJII);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ) * 31;
        Long l = this.LIZJ;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.LJ;
        int iHashCode4 = (((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31) + this.LJFF.hashCode()) * 31;
        Long l2 = this.LJI;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        JSONObject jSONObject = this.LJII;
        return iHashCode5 + (jSONObject != null ? jSONObject.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaLiveLynxCardData(roomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cardType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", popCardId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", cardHeightDp=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", cardData=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", requestTime=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", timeInfo=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1781690wSt(String str, int i, Long l, String str2, Integer num, String str3, Long l2, JSONObject jSONObject) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = l;
        this.LIZLLL = str2;
        this.LJ = num;
        this.LJFF = str3;
        this.LJI = l2;
        this.LJII = jSONObject;
    }
}
