package X;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cfp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1020910cfp {
    public final JSONObject LIZ;
    public final JSONObject LIZIZ;
    public final String LIZJ;
    public final JSONArray LIZLLL;
    public final JSONArray LJ;
    public final JSONArray LJFF;
    public final JSONArray LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1020910cfp)) {
            return false;
        }
        C1020910cfp c1020910cfp = (C1020910cfp) obj;
        return Intrinsics.LJFF(this.LIZ, c1020910cfp.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1020910cfp.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1020910cfp.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1020910cfp.LIZLLL) && Intrinsics.LJFF(this.LJ, c1020910cfp.LJ) && Intrinsics.LJFF(this.LJFF, c1020910cfp.LJFF) && Intrinsics.LJFF(this.LJI, c1020910cfp.LJI) && this.LJII == c1020910cfp.LJII && this.LJIIIIZZ == c1020910cfp.LJIIIIZZ;
    }

    public final int hashCode() {
        return (((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + C786410Ut5.Z2(this.LJII)) * 31) + C786410Ut5.Z2(this.LJIIIIZZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OneBigThreeSmallPageStaticData(currentProduct=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", renderProduct=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mainImageUrl=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", subImageList=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", picsList=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", productsIdList=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", slotJumpModelList=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", useBackupLayout=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", useTextBackup=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1020910cfp(JSONObject jSONObject, JSONObject jSONObject2, String str, JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3, JSONArray jSONArray4, boolean z, boolean z2) {
        this.LIZ = jSONObject;
        this.LIZIZ = jSONObject2;
        this.LIZJ = str;
        this.LIZLLL = jSONArray;
        this.LJ = jSONArray2;
        this.LJFF = jSONArray3;
        this.LJI = jSONArray4;
        this.LJII = z;
        this.LJIIIIZZ = z2;
    }
}
