package X;

import webcast.data.cohost_biz.BizLeaveJoinGroupParams;

/* JADX INFO: renamed from: X.0ax5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C954730ax5 {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final BizLeaveJoinGroupParams LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final int LJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LeaveGroupData(targetRoomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", targetUserId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", targetChannelId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", cohostReqExtra=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", leaveSource=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", leaveReason=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C954730ax5(long j, long j2, long j3, BizLeaveJoinGroupParams bizLeaveJoinGroupParams, String str, String str2, int i) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = bizLeaveJoinGroupParams;
        this.LJ = str;
        this.LJFF = str2;
        this.LJI = i;
    }
}
