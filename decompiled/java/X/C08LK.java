package X;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08LK, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08LK {
    public final String LIZ;
    public final long LIZIZ;
    public final Double LIZJ;
    public final Double LIZLLL;
    public final Boolean LJ;
    public final Double LJFF;
    public final Double LJI;
    public final Double LJII;
    public final String LJIIIIZZ;
    public final JSONObject LJIIIZ;
    public final int LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C08LK)) {
            return false;
        }
        C08LK c08lk = (C08LK) obj;
        return Intrinsics.LJFF(this.LIZ, c08lk.LIZ) && this.LIZIZ == c08lk.LIZIZ && Intrinsics.LJFF(this.LIZJ, c08lk.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c08lk.LIZLLL) && Intrinsics.LJFF(this.LJ, c08lk.LJ) && Intrinsics.LJFF(this.LJFF, c08lk.LJFF) && Intrinsics.LJFF(this.LJI, c08lk.LJI) && Intrinsics.LJFF(this.LJII, c08lk.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c08lk.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c08lk.LJIIIZ) && this.LJIIJ == c08lk.LJIIJ;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31;
        Double d = this.LIZJ;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Boolean bool = this.LJ;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d3 = this.LJFF;
        int iHashCode5 = (iHashCode4 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.LJI;
        int iHashCode6 = (iHashCode5 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.LJII;
        int iHashCode7 = (iHashCode6 + (d5 == null ? 0 : d5.hashCode())) * 31;
        String str = this.LJIIIIZZ;
        return ((((iHashCode7 + (str != null ? str.hashCode() : 0)) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ;
    }

    public final String toString() {
        return "VideoSample(aid=" + this.LIZ + ", startTs=" + this.LIZIZ + ", duration=" + this.LIZJ + ", playTime=" + this.LIZLLL + ", finish=" + this.LJ + ", blockCount=" + this.LJFF + ", blockDuration=" + this.LJI + ", firstFrameDuration=" + this.LJII + ", contentType=" + this.LJIIIIZZ + ", raw=" + this.LJIIIZ + ", index=" + this.LJIIJ + ')';
    }

    public final Boolean LIZ(String str) {
        JSONObject jSONObject = this.LJIIIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(this.LJIIJ);
        return C08LJ.LJII(C2188811AlT.LIZIZ(sbLIZ), jSONObject);
    }

    public C08LK(String str, long j, Double d, Double d2, Boolean bool, Double d3, Double d4, Double d5, String str2, JSONObject jSONObject, int i) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = d;
        this.LIZLLL = d2;
        this.LJ = bool;
        this.LJFF = d3;
        this.LJI = d4;
        this.LJII = d5;
        this.LJIIIIZZ = str2;
        this.LJIIIZ = jSONObject;
        this.LJIIJ = i;
    }
}
