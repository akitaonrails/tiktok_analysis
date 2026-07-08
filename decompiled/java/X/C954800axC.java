package X;

/* JADX INFO: renamed from: X.0axC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C954800axC {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final String LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CancelApplyJoinGroupData(targetRoomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", targetUserId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", targetChannelId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", targetGroupChannelId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C954800axC(String str, long j, long j2, long j3) {
        this(j, j2, j3, 0L, str);
    }

    public C954800axC(long j, long j2, long j3, long j4, String str) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
        this.LJ = str;
    }
}
