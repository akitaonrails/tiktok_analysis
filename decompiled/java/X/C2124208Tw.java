package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08Tw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2124208Tw {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final Map<String, Object> LIZLLL;
    public final Object LJ;
    public final List<C080U> LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2124208Tw)) {
            return false;
        }
        C2124208Tw c2124208Tw = (C2124208Tw) obj;
        return Intrinsics.LJFF(this.LIZ, c2124208Tw.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2124208Tw.LIZIZ) && this.LIZJ == c2124208Tw.LIZJ && Intrinsics.LJFF(this.LIZLLL, c2124208Tw.LIZLLL) && Intrinsics.LJFF(this.LJ, c2124208Tw.LJ) && Intrinsics.LJFF(this.LJFF, c2124208Tw.LJFF);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31;
        Object obj = this.LJ;
        return ((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcLynxMultiPrefetchItem(requestKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", apiPath=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", createTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", responseExtraInfo=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", responseHeaders=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2124208Tw(String str, String str2, long j, Map<String, ? extends Object> map, Object obj, List<C080U> list) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = map;
        this.LJ = obj;
        this.LJFF = list;
    }
}
