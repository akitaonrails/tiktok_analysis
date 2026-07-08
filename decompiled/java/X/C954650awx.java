package X;

import com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinBizContent;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHMessageInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0awx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C954650awx extends C957630b1l {
    public final int LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final MHJoinBizContent LJ;
    public final MHMessageInfo LJFF = null;
    public final boolean LJI = true;
    public final Object LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C954650awx)) {
            return false;
        }
        C954650awx c954650awx = (C954650awx) obj;
        return this.LIZ == c954650awx.LIZ && this.LIZIZ == c954650awx.LIZIZ && this.LIZJ == c954650awx.LIZJ && this.LIZLLL == c954650awx.LIZLLL && Intrinsics.LJFF(this.LJ, c954650awx.LJ) && Intrinsics.LJFF(this.LJFF, c954650awx.LJFF) && this.LJI == c954650awx.LJI && Intrinsics.LJFF(this.LJII, c954650awx.LJII);
    }

    public final int hashCode() {
        int iY2 = ((((((this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31;
        MHJoinBizContent mHJoinBizContent = this.LJ;
        int iHashCode = (iY2 + (mHJoinBizContent == null ? 0 : mHJoinBizContent.hashCode())) * 31;
        MHMessageInfo mHMessageInfo = this.LJFF;
        int iHashCode2 = (((iHashCode + (mHMessageInfo == null ? 0 : mHMessageInfo.hashCode())) * 31) + C786410Ut5.Z2(this.LJI)) * 31;
        Object obj = this.LJII;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MHJoinCancelMessage(joinType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", uid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", channelId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", bizContent=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", messageInfo=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isCrossArc=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", originMessage=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C954650awx(int i, long j, long j2, long j3, MHJoinBizContent mHJoinBizContent, Object obj) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = j3;
        this.LJ = mHJoinBizContent;
        this.LJII = obj;
    }
}
