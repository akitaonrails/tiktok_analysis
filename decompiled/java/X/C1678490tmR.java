package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tmR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1678490tmR {
    public final AbstractC1669390tXl LIZ;
    public final AbstractC1669390tXl LIZIZ;
    public final AbstractC1669390tXl LIZJ;

    public C1678490tmR() {
        this(0);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Shapes(small=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", medium=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", large=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1678490tmR(int i) {
        C1669400tXm c1669400tXmLIZIZ = C1669050tXD.LIZIZ(4);
        C1669400tXm c1669400tXmLIZIZ2 = C1669050tXD.LIZIZ(4);
        C1669400tXm c1669400tXmLIZIZ3 = C1669050tXD.LIZIZ(0);
        this.LIZ = c1669400tXmLIZIZ;
        this.LIZIZ = c1669400tXmLIZIZ2;
        this.LIZJ = c1669400tXmLIZIZ3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1678490tmR)) {
            return false;
        }
        C1678490tmR c1678490tmR = (C1678490tmR) obj;
        if (Intrinsics.LJFF(this.LIZ, c1678490tmR.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1678490tmR.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1678490tmR.LIZJ)) {
            return true;
        }
        return false;
    }
}
