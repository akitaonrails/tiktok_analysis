package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04vb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1254904vb {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Map<String, Object> LJ;
    public final Map<String, Object> LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1254904vb)) {
            return false;
        }
        C1254904vb c1254904vb = (C1254904vb) obj;
        return Intrinsics.LJFF(this.LIZ, c1254904vb.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1254904vb.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1254904vb.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1254904vb.LIZLLL) && Intrinsics.LJFF(this.LJ, c1254904vb.LJ) && Intrinsics.LJFF(this.LJFF, c1254904vb.LJFF);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NormalizedRequest(domainBeforeTnc=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", domainAfterTnc=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", dynamicCdnDomain=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", sparkEventId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", networkInfo=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", featureInfo=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1254904vb(String str, String str2, String str3, String str4, Map<String, Object> map, Map<String, Object> map2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = map;
        this.LJFF = map2;
    }
}
