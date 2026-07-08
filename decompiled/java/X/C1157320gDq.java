package X;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0gDq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157320gDq {
    public final EnumC1709240ua2 LIZIZ;
    public final EnumC994640bzS LIZJ;
    public final boolean LIZLLL;
    public final boolean LJFF;
    public final C1157270gDl LIZ = C1157290gDn.LIZ;
    public final JSONObject LJ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157320gDq)) {
            return false;
        }
        C1157320gDq c1157320gDq = (C1157320gDq) obj;
        return Intrinsics.LJFF(this.LIZ, c1157320gDq.LIZ) && this.LIZIZ == c1157320gDq.LIZIZ && this.LIZJ == c1157320gDq.LIZJ && this.LIZLLL == c1157320gDq.LIZLLL && Intrinsics.LJFF(this.LJ, c1157320gDq.LJ) && this.LJFF == c1157320gDq.LJFF;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        JSONObject jSONObject = this.LJ;
        return ((iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31) + C786410Ut5.Z2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CashierDynamicConfig(uiConfig=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", theme=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", recListRenderMode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", legacyMode=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", preRiskParams=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", showViewAll=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1157320gDq(EnumC1709240ua2 enumC1709240ua2, EnumC994640bzS enumC994640bzS, boolean z, boolean z2) {
        this.LIZIZ = enumC1709240ua2;
        this.LIZJ = enumC994640bzS;
        this.LIZLLL = z;
        this.LJFF = z2;
    }
}
