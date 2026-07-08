package X;

import java.util.List;

/* JADX INFO: renamed from: X.0V7c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C792540V7c {
    public boolean LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public long LJIIIIZZ;
    public List<String> LJIIIZ;
    public List<String> LJIIJ;
    public List<String> LJIIJJI;
    public boolean LJIIL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DiskConfig{isEnable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", diskThresholdBytes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", folderThresholdBytes=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", fileThresholdBytes=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", reportMaxCount=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", reportMaxOutdatedCount=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", reportMaxTopCount=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", reportExceptionDirMaxCount=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", outdatedIntervalMs=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", customRelativePaths=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", ignoredRelativePaths=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", complianceRelativePaths=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", isSample=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
