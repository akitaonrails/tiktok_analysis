package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Api, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191441Api {
    public final String LIZ;
    public final List<String> LIZIZ;
    public final C05XL<C1515820pY4<?>> LIZJ;
    public final C05XL<C1515820pY4<?>> LIZLLL;
    public final long LJ;
    public final EnumC994770bzf LJFF;
    public final long LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2191441Api)) {
            return false;
        }
        C2191441Api c2191441Api = (C2191441Api) obj;
        return Intrinsics.LJFF(this.LIZ, c2191441Api.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2191441Api.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2191441Api.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c2191441Api.LIZLLL) && this.LJ == c2191441Api.LJ && this.LJFF == c2191441Api.LJFF && this.LJI == c2191441Api.LJI;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        List<String> list = this.LIZIZ;
        return ((((((((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + this.LJFF.hashCode()) * 31) + C786410Ut5.Y2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CacheEntry(preloadKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", keyParams=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", deferred=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", sourceDeferred=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", expireAt=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", mode=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", preloadStartTimestamp=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2191441Api(String str, List list, C05XL c05xl, C099F c099f, long j, EnumC994770bzf enumC994770bzf, long j2) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = c05xl;
        this.LIZLLL = c099f;
        this.LJ = j;
        this.LJFF = enumC994770bzf;
        this.LJI = j2;
    }
}
