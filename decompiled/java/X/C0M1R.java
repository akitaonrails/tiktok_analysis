package X;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M1R, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M1R {
    public final Set<String> LIZ;
    public final int LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0M1R)) {
            return false;
        }
        C0M1R c0m1r = (C0M1R) obj;
        return Intrinsics.LJFF(this.LIZ, c0m1r.LIZ) && this.LIZIZ == c0m1r.LIZIZ && this.LIZJ == c0m1r.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeleteConfirmState(ids=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", deleteCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", freeUpSpace=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0M1R(int i, long j, Set set) {
        this.LIZ = set;
        this.LIZIZ = i;
        this.LIZJ = j;
    }
}
