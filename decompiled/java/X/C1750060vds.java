package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vds, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1750060vds {
    public final String LIZ;
    public final String LIZIZ;
    public final C1561410qjb LIZJ;
    public final Map<String, Object> LIZLLL;
    public final Map<Class<?>, C1544630qIX<?>> LJ;
    public final Map<String, C1311220kE4> LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1750060vds)) {
            return false;
        }
        C1750060vds c1750060vds = (C1750060vds) obj;
        return Intrinsics.LJFF(this.LIZ, c1750060vds.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1750060vds.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1750060vds.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1750060vds.LIZLLL) && Intrinsics.LJFF(this.LJ, c1750060vds.LJ) && Intrinsics.LJFF(this.LJFF, c1750060vds.LJFF);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        Map<Class<?>, C1544630qIX<?>> map = this.LJ;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, C1311220kE4> map2 = this.LJFF;
        return iHashCode3 + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaContentLynxCardModel(schema=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", initData=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", params=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", globalProps=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", jsbContextHolders=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", lynxModules=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1750060vds(String str, String str2, C1561410qjb c1561410qjb, Map<String, ? extends Object> map, Map<Class<?>, ? extends C1544630qIX<?>> map2, Map<String, C1311220kE4> map3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = c1561410qjb;
        this.LIZLLL = map;
        this.LJ = map2;
        this.LJFF = map3;
    }
}
