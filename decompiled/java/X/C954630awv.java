package X;

import com.bytedance.android.live.liveinteract.multihost.core.model.MHMessageInfo;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHPermitJoinBizContent;
import kotlin.jvm.internal.Intrinsics;
import webcast.im.JoinGroupDirectBizContent;

/* JADX INFO: renamed from: X.0awv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C954630awv extends C957630b1l {
    public final int LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final JoinGroupDirectBizContent LJFF;
    public final MHPermitJoinBizContent LJI;
    public final MHMessageInfo LJII = null;
    public final boolean LJIIIIZZ = true;
    public final Object LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C954630awv)) {
            return false;
        }
        C954630awv c954630awv = (C954630awv) obj;
        return this.LIZ == c954630awv.LIZ && this.LIZIZ == c954630awv.LIZIZ && this.LIZJ == c954630awv.LIZJ && this.LIZLLL == c954630awv.LIZLLL && this.LJ == c954630awv.LJ && Intrinsics.LJFF(this.LJFF, c954630awv.LJFF) && Intrinsics.LJFF(this.LJI, c954630awv.LJI) && Intrinsics.LJFF(this.LJII, c954630awv.LJII) && this.LJIIIIZZ == c954630awv.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c954630awv.LJIIIZ);
    }

    public final int hashCode() {
        int iY2 = ((((((((this.LIZ * 31) + this.LIZIZ) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31;
        JoinGroupDirectBizContent joinGroupDirectBizContent = this.LJFF;
        int iHashCode = (iY2 + (joinGroupDirectBizContent == null ? 0 : joinGroupDirectBizContent.hashCode())) * 31;
        MHPermitJoinBizContent mHPermitJoinBizContent = this.LJI;
        int iHashCode2 = (iHashCode + (mHPermitJoinBizContent == null ? 0 : mHPermitJoinBizContent.hashCode())) * 31;
        MHMessageInfo mHMessageInfo = this.LJII;
        int iHashCode3 = (((iHashCode2 + (mHMessageInfo == null ? 0 : mHMessageInfo.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31;
        Object obj = this.LJIIIZ;
        return iHashCode3 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MHJoinReplyMessage(joinType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", replyStatus=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", uid=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", channelId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", joinGroupDirectBizContent=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", permitJoinGroupBizContent=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", messageInfo=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", isCrossArc=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", originMessage=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C954630awv(int i, int i2, long j, long j2, long j3, JoinGroupDirectBizContent joinGroupDirectBizContent, MHPermitJoinBizContent mHPermitJoinBizContent, Object obj) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = j3;
        this.LJFF = joinGroupDirectBizContent;
        this.LJI = mHPermitJoinBizContent;
        this.LJIIIZ = obj;
    }
}
