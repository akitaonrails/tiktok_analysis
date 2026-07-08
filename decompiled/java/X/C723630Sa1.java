package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sa1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C723630Sa1 extends C723430SZh {
    public final Class<?> LIZJ;
    public final Boolean LIZLLL;
    public final Boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C723630Sa1)) {
            return false;
        }
        C723630Sa1 c723630Sa1 = (C723630Sa1) obj;
        return Intrinsics.LJFF(this.LIZJ, c723630Sa1.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c723630Sa1.LIZLLL) && Intrinsics.LJFF(this.LJ, c723630Sa1.LJ);
    }

    public final int hashCode() {
        Class<?> cls = this.LIZJ;
        int iHashCode = (cls == null ? 0 : cls.hashCode()) * 31;
        Boolean bool = this.LIZLLL;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LJ;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AssemDslPerformanceParams(host=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isReused=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isLazy=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C723630Sa1(Class cls) {
        Boolean bool = Boolean.FALSE;
        this(cls, bool, bool);
    }

    public C723630Sa1(Class<?> cls, Boolean bool, Boolean bool2) {
        this.LIZJ = cls;
        this.LIZLLL = bool;
        this.LJ = bool2;
    }
}
