package X;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0eXb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092690eXb {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final C1092680eXa LIZLLL;
    public final JSONObject LJ;
    public final C1092740eXg LJFF;
    public final C1092730eXf LJI;
    public final C1092710eXd LJII;
    public final JSONObject LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1092690eXb)) {
            return false;
        }
        C1092690eXb c1092690eXb = (C1092690eXb) obj;
        return Intrinsics.LJFF(this.LIZ, c1092690eXb.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1092690eXb.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1092690eXb.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1092690eXb.LIZLLL) && Intrinsics.LJFF(this.LJ, c1092690eXb.LJ) && Intrinsics.LJFF(this.LJFF, c1092690eXb.LJFF) && Intrinsics.LJFF(this.LJI, c1092690eXb.LJI) && Intrinsics.LJFF(this.LJII, c1092690eXb.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1092690eXb.LJIIIIZZ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C1092680eXa c1092680eXa = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (c1092680eXa == null ? 0 : c1092680eXa.hashCode())) * 31;
        JSONObject jSONObject = this.LJ;
        int iHashCode4 = (iHashCode3 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        C1092740eXg c1092740eXg = this.LJFF;
        int iHashCode5 = (iHashCode4 + (c1092740eXg == null ? 0 : c1092740eXg.hashCode())) * 31;
        C1092730eXf c1092730eXf = this.LJI;
        int iHashCode6 = (iHashCode5 + (c1092730eXf == null ? 0 : c1092730eXf.hashCode())) * 31;
        C1092710eXd c1092710eXd = this.LJII;
        return ((iHashCode6 + (c1092710eXd != null ? c1092710eXd.hashCode() : 0)) * 31) + this.LJIIIIZZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FanClubGuideTouchPointConfig(bizType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bizScene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bizSceneType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", contentConfiguration=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", interactionConfiguration=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", frequencyConfiguration=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", triggerConfiguration=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", businessDependencyConfiguration=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", raw=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1092690eXb(String str, String str2, String str3, C1092680eXa c1092680eXa, JSONObject jSONObject, C1092740eXg c1092740eXg, C1092730eXf c1092730eXf, C1092710eXd c1092710eXd, JSONObject jSONObject2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = c1092680eXa;
        this.LJ = jSONObject;
        this.LJFF = c1092740eXg;
        this.LJI = c1092730eXf;
        this.LJII = c1092710eXd;
        this.LJIIIIZZ = jSONObject2;
    }
}
