package X;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.012D, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C012D implements InterfaceC1126420fQ0 {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJFF;
    public boolean LJIIIZ;
    public boolean LJ = true;
    public final JSONObject LJI = null;
    public final JSONArray LJII = null;
    public long LJIIIIZZ = -1;
    public int LJIIJ = -1;
    public String LJIIJJI = "";

    @Override // X.InterfaceC1126420fQ0
    public final void LIZLLL() {
        this.LJIIIZ = true;
    }

    @Override // X.InterfaceC1126420fQ0
    public final void LJ() {
        this.LJ = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C012D)) {
            return false;
        }
        C012D c012d = (C012D) obj;
        return this.LIZ == c012d.LIZ && Intrinsics.LJFF(this.LIZIZ, c012d.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c012d.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c012d.LIZLLL) && this.LJ == c012d.LJ && this.LJFF == c012d.LJFF && Intrinsics.LJFF(this.LJI, c012d.LJI) && Intrinsics.LJFF(this.LJII, c012d.LJII);
    }

    public final int hashCode() {
        int iY2 = ((((((((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31;
        JSONObject jSONObject = this.LJI;
        int iHashCode = (iY2 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        JSONArray jSONArray = this.LJII;
        return iHashCode + (jSONArray != null ? jSONArray.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GiftPanelRecommendData(giftId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", starlingKey=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", starlingValue=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", shouldShowHighlightAnimation=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", needFrequencyControl=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", reasonToGiftList=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", reasonBfToGiftList=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1126420fQ0
    public final boolean LIZ() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC1126420fQ0
    public final boolean LIZIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC1126420fQ0
    public final String LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1126420fQ0
    public final long getGiftId() {
        return this.LIZ;
    }

    public C012D(long j, String str, String str2, String str3, boolean z) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJFF = z;
    }
}
