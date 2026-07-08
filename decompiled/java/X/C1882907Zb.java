package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Zb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1882907Zb {
    public final boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1882907Zb)) {
            return false;
        }
        C1882907Zb c1882907Zb = (C1882907Zb) obj;
        return this.LIZ == c1882907Zb.LIZ && Intrinsics.LJFF(this.LIZIZ, c1882907Zb.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1882907Zb.LIZJ);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        String str = this.LIZIZ;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomSchemaData(isV3=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", params=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1882907Zb(boolean z, String str, String str2) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
