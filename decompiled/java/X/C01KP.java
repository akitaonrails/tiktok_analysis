package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01KP, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01KP {
    public final long LIZ;
    public final long LIZIZ;
    public final List<Long> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C01KP)) {
            return false;
        }
        C01KP c01kp = (C01KP) obj;
        return this.LIZ == c01kp.LIZ && this.LIZIZ == c01kp.LIZIZ && Intrinsics.LJFF(this.LIZJ, c01kp.LIZJ);
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CampaignProgressRefreshRequest(roomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", anchorId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", giftIds=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C01KP(List list, long j, long j2) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = list;
    }
}
