package X;

/* JADX INFO: renamed from: X.0beL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C981550beL {
    public static final /* synthetic */ int LJIILLIIL = 0;
    public final C981480beE LIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public long LJII;
    public boolean LJIIIIZZ;
    public EnumC973680bRe LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public long LJIILL;
    public String LIZIZ = "";
    public String LJIILJJIL = "";

    public final long LIZ() {
        long jLIZ;
        long j;
        if (this.LIZJ) {
            if (this.LJIIJ <= 0) {
                return 0L;
            }
            jLIZ = C158B.LIZ();
            j = this.LJIIJ;
        } else {
            if (this.LJIIJJI <= 0) {
                return 0L;
            }
            jLIZ = C158B.LIZ();
            j = this.LJIIJJI;
        }
        return jLIZ - j;
    }

    public final long LIZIZ() {
        if (this.LJIIL <= 0) {
            return 0L;
        }
        return C158B.LIZ() - this.LJIIL;
    }

    public final long LIZJ() {
        if (this.LJIILIIL <= 0) {
            return 0L;
        }
        return C158B.LIZ() - this.LJIILIIL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompetitionTrackingModel(initialSubMatchType='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("', isStarter=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isStartFromRematch=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", restartInviterUid=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", isFinishByRestart=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", isFromRematchInviteType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", finishType=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C981550beL(C981480beE c981480beE) {
        this.LIZ = c981480beE;
    }
}
