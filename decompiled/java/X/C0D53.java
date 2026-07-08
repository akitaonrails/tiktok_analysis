package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D53, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D53 {
    public static final /* synthetic */ int LJII = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Map<String, String> LJ;
    public final String LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D53)) {
            return false;
        }
        C0D53 c0d53 = (C0D53) obj;
        return Intrinsics.LJFF(this.LIZ, c0d53.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0d53.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0d53.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0d53.LIZLLL) && Intrinsics.LJFF(this.LJ, c0d53.LJ) && Intrinsics.LJFF(this.LJFF, c0d53.LJFF) && Intrinsics.LJFF(this.LJI, c0d53.LJI);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31;
        String str2 = this.LJFF;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJI;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TrackingContext(cid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", creativeId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", logExtra=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", orderId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", passThrough=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", externalUpId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", externalVariantId=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0D53(String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = map;
        this.LJFF = str5;
        this.LJI = str6;
    }
}
