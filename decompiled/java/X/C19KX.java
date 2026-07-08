package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.19KX, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19KX {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19KX)) {
            return false;
        }
        C19KX c19kx = (C19KX) obj;
        return Intrinsics.LJFF(this.LIZ, c19kx.LIZ) && Intrinsics.LJFF(this.LIZIZ, c19kx.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c19kx.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c19kx.LIZLLL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LIZLLL;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdsActivityHistorySchemaParams(source=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tabs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", defaultTab=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", extraMsg=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C19KX(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }
}
