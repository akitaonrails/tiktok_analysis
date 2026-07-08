package X;

/* JADX INFO: renamed from: X.0aZb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C940170aZb {
    public long LIZ;
    public long LIZIZ = 0;
    public long LIZJ = 0;

    public final long LIZ() {
        long j = this.LIZIZ;
        if (j > 0) {
            long j2 = this.LIZ;
            if (j2 > 0) {
                if (j >= j2) {
                    return j - j2;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getFirstSeiToSetupDuration error as firstSeiTs:");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(" is smaller than enterTs:");
                sbLIZ.append(this.LIZ);
                C20441214yg.LIZIZ("FeedPreviewLogInfo", C2188811AlT.LIZIZ(sbLIZ));
                return -1L;
            }
        }
        return -1L;
    }

    public final long LIZIZ() {
        long j = this.LIZJ;
        if (j > 0) {
            long j2 = this.LIZ;
            if (j2 > 0) {
                if (j >= j2) {
                    return j - j2;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getMountToSetupDuration error as firstLayoutPipeEnd:");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(" is smaller than enterTs:");
                sbLIZ.append(this.LIZ);
                C20441214yg.LIZIZ("FeedPreviewLogInfo", C2188811AlT.LIZIZ(sbLIZ));
                return -1L;
            }
        }
        return -1L;
    }

    public C940170aZb(long j) {
        this.LIZ = j;
    }
}
