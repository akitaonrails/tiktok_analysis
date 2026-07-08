package X;

import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizLeaveParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a8k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C923520a8k {
    public final String LIZ;
    public final long LIZIZ = 0;
    public final BizLeaveParams LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C923520a8k)) {
            return false;
        }
        C923520a8k c923520a8k = (C923520a8k) obj;
        return Intrinsics.LJFF(this.LIZ, c923520a8k.LIZ) && this.LIZIZ == c923520a8k.LIZIZ && Intrinsics.LJFF(this.LIZJ, c923520a8k.LIZJ) && this.LIZLLL == c923520a8k.LIZLLL;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31;
        BizLeaveParams bizLeaveParams = this.LIZJ;
        return ((iHashCode + (bizLeaveParams == null ? 0 : bizLeaveParams.hashCode())) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LeaveChannelParam(leaveSource=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", notSuggestToUid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bizLeaveParams=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", leaveReason=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C923520a8k(String str, BizLeaveParams bizLeaveParams, int i) {
        this.LIZ = str;
        this.LIZJ = bizLeaveParams;
        this.LIZLLL = i;
    }
}
