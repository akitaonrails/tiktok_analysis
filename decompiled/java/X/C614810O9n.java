package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O9n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C614810O9n implements C0O35 {
    public final String LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C614810O9n)) {
            return false;
        }
        C614810O9n c614810O9n = (C614810O9n) obj;
        return Intrinsics.LJFF(this.LIZ, c614810O9n.LIZ) && this.LIZIZ == c614810O9n.LIZIZ && Intrinsics.LJFF(this.LIZJ, c614810O9n.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c614810O9n.LIZLLL) && Intrinsics.LJFF(this.LJ, c614810O9n.LJ) && Intrinsics.LJFF(this.LJFF, c614810O9n.LJFF);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiCollectState(poiId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isCollected=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", poiName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", poiAddress=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", callScene=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", id=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0O35
    public final String LIZ() {
        return this.LJ;
    }

    @Override // X.C0O35
    public final String getId() {
        return this.LJFF;
    }

    public C614810O9n(String str, String str2, String str3, String str4, String str5, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
    }
}
