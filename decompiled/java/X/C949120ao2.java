package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ao2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C949120ao2 {
    public final String LIZ;
    public final String LIZIZ;
    public String LIZJ = null;
    public float LIZLLL = 0.0f;
    public String LJ = null;
    public boolean LJFF = false;
    public boolean LJI = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C949120ao2)) {
            return false;
        }
        C949120ao2 c949120ao2 = (C949120ao2) obj;
        return Intrinsics.LJFF(this.LIZ, c949120ao2.LIZ) && Intrinsics.LJFF(this.LIZIZ, c949120ao2.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c949120ao2.LIZJ) && Float.compare(this.LIZLLL, c949120ao2.LIZLLL) == 0 && Intrinsics.LJFF(this.LJ, c949120ao2.LJ) && this.LJFF == c949120ao2.LJFF && this.LJI == c949120ao2.LJI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResourceState(panelName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", resourceId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", effectId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", downloadProgress=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", resourcePath=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isReady=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", inProgress=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31;
        String str2 = this.LJ;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI);
    }

    public C949120ao2(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
