package X;

/* JADX INFO: renamed from: X.0bC1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C963990bC1 {
    public final long LIZ;
    public final long LIZIZ;
    public final int LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BattleRejectRequest(channelId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", battleId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", inviteType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", scene=");
        sbLIZ.append(1);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C963990bC1(long j, long j2, int i) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = i;
    }
}
