package X;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: renamed from: X.0CGG, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CGG {
    public static final C0CGG LJIIIIZZ = new C0CGG(0);
    public final boolean LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final boolean LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;

    public C0CGG() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0CGG)) {
            return false;
        }
        C0CGG c0cgg = (C0CGG) obj;
        return this.LIZ == c0cgg.LIZ && this.LIZIZ == c0cgg.LIZIZ && this.LIZJ == c0cgg.LIZJ && this.LIZLLL == c0cgg.LIZLLL && this.LJ == c0cgg.LJ && this.LJFF == c0cgg.LJFF && this.LJI == c0cgg.LJI && this.LJII == c0cgg.LJII;
    }

    public final int hashCode() {
        return (((((((((((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF) * 31) + this.LJI) * 31) + this.LJII;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Config(enable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", minShowIntervalDays=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", minInstallIntervalDays=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", minHoursBetweenRatingStrategy=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", needCheckPlayTime=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", minPlayTimeMins=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", section=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", threshold=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0CGG(int i) {
        long jIntValue;
        boolean z;
        int iIntValue;
        Integer numValueOf = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 7, "app_store_score_min_install_days", true));
        if (numValueOf.intValue() > 0) {
            jIntValue = numValueOf.intValue();
        } else {
            jIntValue = 7;
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_play_time_trigger_praise_dialog", true, false)) {
            z = true;
        } else {
            z = false;
        }
        SettingsManager.LIZLLL().getClass();
        int iLJ = SettingsManager.LJ("play_time_threshold_to_trigger_praise_dialog", 180);
        Integer numLJJIIJ = C13LQ.LJJIIJ(0, C0C4F.LIZ());
        int iIntValue2 = numLJJIIJ != null ? numLJJIIJ.intValue() : 7;
        Integer numLJJIIJ2 = C13LQ.LJJIIJ(1, C0C4F.LIZ());
        if (numLJJIIJ2 != null) {
            iIntValue = numLJJIIJ2.intValue();
        } else {
            iIntValue = 3;
        }
        this.LIZ = true;
        this.LIZIZ = 14L;
        this.LIZJ = jIntValue;
        this.LIZLLL = 48L;
        this.LJ = z;
        this.LJFF = iLJ;
        this.LJI = iIntValue2;
        this.LJII = iIntValue;
    }
}
