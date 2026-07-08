package X;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hAO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1193620hAO {
    public final String LIZ;
    public final String LIZIZ;
    public final JSONObject LIZJ;
    public final C1193050h9T LIZLLL;
    public final C335850DEp LJ;
    public final C1195240hD0 LJFF;
    public final boolean LJI;
    public final String LJII;

    public C1193620hAO() {
        this(null, null, null, null, null, false, null, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1193620hAO)) {
            return false;
        }
        C1193620hAO c1193620hAO = (C1193620hAO) obj;
        return Intrinsics.LJFF(this.LIZ, c1193620hAO.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1193620hAO.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1193620hAO.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1193620hAO.LIZLLL) && Intrinsics.LJFF(this.LJ, c1193620hAO.LJ) && Intrinsics.LJFF(this.LJFF, c1193620hAO.LJFF) && this.LJI == c1193620hAO.LJI && Intrinsics.LJFF(this.LJII, c1193620hAO.LJII);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        JSONObject jSONObject = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        C1193050h9T c1193050h9T = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (c1193050h9T == null ? 0 : c1193050h9T.hashCode())) * 31;
        C335850DEp c335850DEp = this.LJ;
        int iHashCode5 = (iHashCode4 + (c335850DEp == null ? 0 : c335850DEp.hashCode())) * 31;
        C1195240hD0 c1195240hD0 = this.LJFF;
        int iHashCode6 = (((iHashCode5 + (c1195240hD0 == null ? 0 : c1195240hD0.hashCode())) * 31) + C786410Ut5.Z2(this.LJI)) * 31;
        String str3 = this.LJII;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CashierRelevantData(displayPricingPlanId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", paymentPricingPlanId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", policy=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", placeOrderButtonInfo=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", paymentReadyInfo=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", paymentMethodDisplayInfo=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", hasAgreementData=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", selectionHandle=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1193620hAO(String str, String str2, C1193050h9T c1193050h9T, C335850DEp c335850DEp, C1195240hD0 c1195240hD0, boolean z, String str3, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        c1193050h9T = (i & 8) != 0 ? null : c1193050h9T;
        c335850DEp = (i & 16) != 0 ? null : c335850DEp;
        c1195240hD0 = (i & 32) != 0 ? null : c1195240hD0;
        z = (i & 64) != 0 ? false : z;
        str3 = (i & 128) != 0 ? null : str3;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = null;
        this.LIZLLL = c1193050h9T;
        this.LJ = c335850DEp;
        this.LJFF = c1195240hD0;
        this.LJI = z;
        this.LJII = str3;
    }
}
