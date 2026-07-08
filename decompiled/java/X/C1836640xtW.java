package X;

/* JADX INFO: renamed from: X.0xtW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1836640xtW {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public int LIZLLL;

    public C1836640xtW() {
        this(0);
    }

    public final long LIZ() {
        long j = (this.LIZIZ + (((long) this.LIZLLL) * this.LIZJ)) - this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("totalPlayTimeMs, totalPlayMs: ");
        sbLIZ.append(j);
        sbLIZ.append(", startPosition: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", currentPosition: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", duration: ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", loopCount: ");
        sbLIZ.append(this.LIZLLL);
        C20441214yg.LIZIZ("LiveSfvCardVideoPlayer", C2188811AlT.LIZIZ(sbLIZ));
        return j;
    }

    public C1836640xtW(int i) {
        this.LIZ = 0L;
        this.LIZIZ = 0L;
        this.LIZJ = 0L;
        this.LIZLLL = 0;
    }
}
