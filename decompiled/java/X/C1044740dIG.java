package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dIG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1044740dIG {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Map<String, Object> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1044740dIG)) {
            return false;
        }
        C1044740dIG c1044740dIG = (C1044740dIG) obj;
        return Intrinsics.LJFF(this.LIZ, c1044740dIG.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1044740dIG.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1044740dIG.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1044740dIG.LIZLLL) && Intrinsics.LJFF(this.LJ, c1044740dIG.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LIZLLL.hashCode()) * 31;
        Map<String, Object> map = this.LJ;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShoppingTaskEventRequest(label=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tag=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", refer=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", awemeStruct=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", adExtra=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1044740dIG(String str, String str2, String str3, String str4, Map<String, ? extends Object> map) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = map;
    }
}
