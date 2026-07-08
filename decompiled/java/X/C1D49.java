package X;

/* JADX INFO: renamed from: X.1D49, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D49 {
    public C1D46 LIZ;
    public String LIZJ;
    public String LIZLLL;
    public EnumC2249801D3y LJ;
    public boolean LJFF;
    public String LJI;
    public EnumC1277260jLI LJIIL;
    public boolean LJIJI;
    public String LJIJJLI;
    public int LJIL;
    public long LJJIFFI;
    public EnumC804650VhP LJJIIJZLJL;
    public int LJJIIZI;
    public int LIZIZ = -1;
    public int LJII = -1;
    public long LJIIIIZZ = -1;
    public long LJIIIZ = -1;
    public C0UWQ LJIIJ = C0UWQ.DEFAULT;
    public EnumC783720Uok LJIIJJI = EnumC783720Uok.DEFAULT;
    public EnumC1283150jUn LJIILIIL = EnumC1283150jUn.DEFAULT;
    public int LJIILJJIL = -1;
    public int LJIILL = -1;
    public int LJIILLIIL = -1;
    public int LJIIZILJ = -1;
    public int LJIJ = -1;
    public int LJIJJ = -1;
    public String LJJ = "";
    public int LJJI = -1;
    public int LJJII = -1;
    public double LJJIII = -1.0d;
    public String LJJIIJ = "";
    public String LJJIIZ = "default";
    public String LJJIJ = "";

    public final int LIZ() {
        int i = this.LJJI;
        return i > -1 ? i : this.LIZIZ;
    }

    public final int LIZIZ() {
        EnumC2249951D4n enumC2249951D4n;
        EnumC2178851APb enumC2178851APb;
        EnumC1283150jUn enumC1283150jUn = this.LJIILIIL;
        if (enumC1283150jUn == EnumC1283150jUn.GAME) {
            C1D46 c1d46 = this.LIZ;
            if (c1d46 == null || (enumC2178851APb = c1d46.LIZLLL) == null) {
                return -1;
            }
            return enumC2178851APb.level();
        }
        if (enumC1283150jUn != EnumC1283150jUn.STAGE) {
            return -2;
        }
        C1D46 c1d462 = this.LIZ;
        if (c1d462 == null || (enumC2249951D4n = c1d462.LIZ) == null) {
            return -1;
        }
        return enumC2249951D4n.level();
    }

    public final String LIZJ() {
        return this.LJIILIIL == EnumC1283150jUn.GAME ? this.LJIJJLI : this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BwProbeResult{videoQualityLevel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", netSpeed=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", msg='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('\'');
        sbLIZ.append(", stageResolutionText='");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('\'');
        sbLIZ.append(", type=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isProbeRunning=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", definitionTypeSourceReportState='");
        sbLIZ.append(this.LJI);
        sbLIZ.append('\'');
        sbLIZ.append(", serverRecommendLevel=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", startProbeTs=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", resultCallBackTs=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", finishResultGrade=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", origin=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", probeEngine=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(", business=");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append(", finishResultStatus=");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append(", finishResultErrorCode=");
        sbLIZ.append(this.LJIILL);
        sbLIZ.append(", runningResultStatus=");
        sbLIZ.append(this.LJIILLIIL);
        sbLIZ.append(", runningResultErrorCode=");
        sbLIZ.append(this.LJIIZILJ);
        sbLIZ.append(", bwProtocol=");
        sbLIZ.append(this.LJIJ);
        sbLIZ.append(", isPusherSucceed=");
        sbLIZ.append(this.LJIJI);
        sbLIZ.append(", pusherLevel=");
        sbLIZ.append(this.LJIJJ);
        sbLIZ.append(", gameResolutionText='");
        sbLIZ.append(this.LJIJJLI);
        sbLIZ.append('\'');
        sbLIZ.append(", ioCacheStatus=");
        sbLIZ.append(this.LJIL);
        sbLIZ.append(", speedReportState='");
        sbLIZ.append(this.LJJ);
        sbLIZ.append('\'');
        sbLIZ.append(", postProcessedNetSpeed=");
        sbLIZ.append(this.LJJI);
        sbLIZ.append(", probeDuration=");
        sbLIZ.append(this.LJJIFFI);
        sbLIZ.append(", probeRttAvg=");
        sbLIZ.append(this.LJJII);
        sbLIZ.append(", probeLossRateAvg=");
        sbLIZ.append(this.LJJIII);
        sbLIZ.append(", probeId='");
        sbLIZ.append(this.LJJIIJ);
        sbLIZ.append('\'');
        sbLIZ.append(", networkType=");
        sbLIZ.append(this.LJJIIJZLJL);
        sbLIZ.append(", gearResultType='");
        sbLIZ.append(this.LJJIIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", gearResultStatus=");
        sbLIZ.append(this.LJJIIZI);
        sbLIZ.append(", gearIdentifier='");
        sbLIZ.append(this.LJJIJ);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
