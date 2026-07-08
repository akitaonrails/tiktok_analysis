package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rhe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C702880Rhe {
    public final long LIZ;
    public final List<String> LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C702880Rhe)) {
            return false;
        }
        C702880Rhe c702880Rhe = (C702880Rhe) obj;
        return this.LIZ == c702880Rhe.LIZ && Intrinsics.LJFF(this.LIZIZ, c702880Rhe.LIZIZ) && this.LIZJ == c702880Rhe.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ScheduledExecutePlan(executeId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", touchedSlotIds=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", scheduledOperationCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C702880Rhe(long j, List<String> list, int i) {
        this.LIZ = j;
        this.LIZIZ = list;
        this.LIZJ = i;
    }
}
