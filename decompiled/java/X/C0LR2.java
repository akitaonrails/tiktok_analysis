package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LR2, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LR2 extends C0LR3 {
    public final String LIZ;
    public final List<C0LRC> LIZIZ;
    public final List<C0LRD> LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LR2)) {
            return false;
        }
        C0LR2 c0lr2 = (C0LR2) obj;
        return Intrinsics.LJFF(this.LIZ, c0lr2.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0lr2.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0lr2.LIZJ) && this.LIZLLL == c0lr2.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(outputPath=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", originalViolations=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", appliedActions=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", reused=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0LR2(List list, String str, List list2, boolean z) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = z;
    }
}
