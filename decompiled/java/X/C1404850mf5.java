package X;

/* JADX INFO: renamed from: X.0mf5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1404850mf5 {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final int LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProcessData(uploadWaitClickPublishTimeMs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", uploadWaitSyntheticTimeMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", uploadOffsetSizeWhenSyntheticEnd=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", toUploadSizeWhenSyntheticEnd=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", uploadFileSizeB=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", smartSliceSize=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1404850mf5(long j, long j2, long j3, long j4, long j5, int i) {
        j = (i & 1) != 0 ? -1L : j;
        j2 = (i & 2) != 0 ? -1L : j2;
        j3 = (i & 4) != 0 ? -1L : j3;
        j4 = (i & 8) != 0 ? -1L : j4;
        j5 = (i & 16) != 0 ? -1L : j5;
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
        this.LJ = j5;
        this.LJFF = 0;
    }
}
