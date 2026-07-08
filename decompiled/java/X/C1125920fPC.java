package X;

/* JADX INFO: renamed from: X.0fPC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1125920fPC {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubGoal(giftId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", target=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1125920fPC() {
        this(-1L, 0L, 0L);
    }

    public C1125920fPC(long j, long j2, long j3) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
    }
}
