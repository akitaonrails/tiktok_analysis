package X;

import java.util.Map;
import webcast.data.cohost_biz.BizJoinGroupParams;

/* JADX INFO: renamed from: X.0aws, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C954600aws {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final Long LIZLLL;
    public final long LJ;
    public final BizJoinGroupParams LJFF;
    public final InterfaceC958180b2e LJI;
    public final String LJII;
    public final Map<String, Object> LJIIIIZZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InviteGroupData(targetRoomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", targetUserId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", targetChannelId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", targetGroupChannelId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", expireTimeInSeconds=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", cohostReqExtra=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", bizCheckBlock=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", custom=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C954600aws(long j, long j2, long j3, Long l, long j4, BizJoinGroupParams bizJoinGroupParams, C956320aze c956320aze, String str, Map map) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = l;
        this.LJ = j4;
        this.LJFF = bizJoinGroupParams;
        this.LJI = c956320aze;
        this.LJII = str;
        this.LJIIIIZZ = map;
    }
}
