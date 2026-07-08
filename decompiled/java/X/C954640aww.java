package X;

import com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinBizContent;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHMessageInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aww, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C954640aww extends C957630b1l {
    public final int LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final String LJFF;
    public final MHJoinBizContent LJI;
    public final MHMessageInfo LJII;
    public final Object LJIIIIZZ;
    public final boolean LJIIIZ = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C954640aww)) {
            return false;
        }
        C954640aww c954640aww = (C954640aww) obj;
        return this.LIZ == c954640aww.LIZ && this.LIZIZ == c954640aww.LIZIZ && this.LIZJ == c954640aww.LIZJ && this.LIZLLL == c954640aww.LIZLLL && this.LJ == c954640aww.LJ && Intrinsics.LJFF(this.LJFF, c954640aww.LJFF) && Intrinsics.LJFF(this.LJI, c954640aww.LJI) && Intrinsics.LJFF(this.LJII, c954640aww.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c954640aww.LJIIIIZZ) && this.LJIIIZ == c954640aww.LJIIIZ;
    }

    public final int hashCode() {
        int iY2 = ((((((((((this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + this.LJFF.hashCode()) * 31;
        MHJoinBizContent mHJoinBizContent = this.LJI;
        int iHashCode = (iY2 + (mHJoinBizContent == null ? 0 : mHJoinBizContent.hashCode())) * 31;
        MHMessageInfo mHMessageInfo = this.LJII;
        int iHashCode2 = (iHashCode + (mHMessageInfo == null ? 0 : mHMessageInfo.hashCode())) * 31;
        Object obj = this.LJIIIIZZ;
        return ((iHashCode2 + (obj != null ? obj.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIIIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MHJoinMessage(joinType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", uid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", channelId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", groupChannelId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", linkMicId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", bizContent=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", messageInfo=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", originMessage=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", isCrossArc=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C954640aww(int i, long j, long j2, long j3, long j4, String str, MHJoinBizContent mHJoinBizContent, MHMessageInfo mHMessageInfo, Object obj) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = j3;
        this.LJ = j4;
        this.LJFF = str;
        this.LJI = mHJoinBizContent;
        this.LJII = mHMessageInfo;
        this.LJIIIIZZ = obj;
    }
}
