package X;

/* JADX INFO: renamed from: X.0sVc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1629620sVc {
    public final Integer LIZ;
    public final String LIZIZ;
    public final long LIZJ;

    public C1629620sVc() {
        this(0L, 7);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StickerDownloadInfo(errorCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", totalSize=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1629620sVc(long j, int i) {
        this(null, null, (i & 4) != 0 ? 0L : j);
    }

    public C1629620sVc(Integer num, String str, long j) {
        this.LIZ = num;
        this.LIZIZ = str;
        this.LIZJ = j;
    }
}
