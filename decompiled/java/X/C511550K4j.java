package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K4j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C511550K4j {
    public final String LIZ;
    public final List<C0JK4> LIZIZ;
    public final C0K50 LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C511550K4j)) {
            return false;
        }
        C511550K4j c511550K4j = (C511550K4j) obj;
        return Intrinsics.LJFF(this.LIZ, c511550K4j.LIZ) && Intrinsics.LJFF(this.LIZIZ, c511550K4j.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c511550K4j.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PgcSchemaRouteSpec(path=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", paramList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", delegate=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C511550K4j(String str, List<C0JK4> list, C0K50 c0k50) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = c0k50;
    }
}
