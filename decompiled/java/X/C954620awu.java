package X;

import webcast.data.cohost_biz.BizPermitJoinGroupParams;

/* JADX INFO: renamed from: X.0awu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C954620awu {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final int LJ;
    public final BizPermitJoinGroupParams LJFF;
    public final String LJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReplyInviteGroupData(targetRoomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", targetUserId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", targetChannelId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", targetGroupChannelId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", replyStatus=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", cohostReqExtra=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C954620awu(long j, long j2, long j3, int i, BizPermitJoinGroupParams bizPermitJoinGroupParams, String str) {
        this(j, j2, j3, 0L, i, bizPermitJoinGroupParams, str);
    }

    public C954620awu(long j, long j2, long j3, long j4, int i, BizPermitJoinGroupParams bizPermitJoinGroupParams, String str) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
        this.LJ = i;
        this.LJFF = bizPermitJoinGroupParams;
        this.LJI = str;
    }
}
