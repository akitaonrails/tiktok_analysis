package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RjJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703910RjJ {
    public final long LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final Function0<Unit> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C703910RjJ)) {
            return false;
        }
        C703910RjJ c703910RjJ = (C703910RjJ) obj;
        return this.LIZ == c703910RjJ.LIZ && this.LIZIZ == c703910RjJ.LIZIZ && Intrinsics.LJFF(this.LIZJ, c703910RjJ.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c703910RjJ.LIZLLL);
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31;
        String str = this.LIZJ;
        return ((iY2 + (str == null ? 0 : str.hashCode())) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PendingTask(generation=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enqueueTimeMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", dedupeKey=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", task=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C703910RjJ(long j, long j2, String str, Function0<Unit> function0) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = str;
        this.LIZLLL = function0;
    }
}
