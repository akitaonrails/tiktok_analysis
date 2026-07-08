package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01KL, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01KL {
    public final long LIZ;
    public final long LIZIZ;
    public final List<Long> LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C01KL)) {
            return false;
        }
        C01KL c01kl = (C01KL) obj;
        return this.LIZ == c01kl.LIZ && this.LIZIZ == c01kl.LIZIZ && Intrinsics.LJFF(this.LIZJ, c01kl.LIZJ) && this.LIZLLL == c01kl.LIZLLL;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RefreshRequest(roomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", anchorId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", giftIds=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", version=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C01KL(long j, long j2, long j3, List list) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = list;
        this.LIZLLL = j3;
    }
}
