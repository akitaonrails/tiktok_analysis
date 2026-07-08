package X;

/* JADX INFO: renamed from: X.07er, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1915507er {
    public final long LIZ;
    public final long LIZIZ;
    public final boolean LIZJ;

    public final String LIZ(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(String.valueOf(this.LIZ - j));
        sbLIZ.append(":");
        sbLIZ.append(String.valueOf(this.LIZIZ));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1915507er(boolean z, long j) {
        this.LIZ = -1L;
        this.LIZJ = true;
        this.LIZJ = z;
        this.LIZ = System.currentTimeMillis();
        this.LIZIZ = j;
    }
}
