package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0z8L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1884270z8L {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final List<String> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1884270z8L)) {
            return false;
        }
        C1884270z8L c1884270z8L = (C1884270z8L) obj;
        return Intrinsics.LJFF(this.LIZ, c1884270z8L.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1884270z8L.LIZIZ) && this.LIZJ == c1884270z8L.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1884270z8L.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PageData(preCursor=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", nextCursor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", ids=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1884270z8L(String str, String str2, boolean z, List<String> list) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
        this.LIZLLL = list;
    }
}
