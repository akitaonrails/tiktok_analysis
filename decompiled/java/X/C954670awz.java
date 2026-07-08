package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0awz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C954670awz {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final String LJ;
    public final Map<String, Object> LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CancelInviteJoinGroupData(targetRoomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", targetUserId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", targetChannelId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", targetGroupChannelId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", custom=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C954670awz(long j, long j2, long j3, long j4, String str, Map<String, ? extends Object> map) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
        this.LJ = str;
        this.LJFF = map;
    }
}
