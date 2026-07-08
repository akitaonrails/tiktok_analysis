package X;

import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostTakeTheStageFinalCallDurationSetting;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0beK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C981540beK {
    public static final long LJIIJJI = LiveCoHostTakeTheStageFinalCallDurationSetting.INSTANCE.getValue();
    public static final C981540beK LJIIL = new C981540beK(EnumC962960bAM.UNKNOWN, -10000, -10000, -10000, -10000, -10000, -10000, -10000, -10000, 0, 1536);
    public EnumC962960bAM LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C981540beK)) {
            return false;
        }
        C981540beK c981540beK = (C981540beK) obj;
        return this.LIZ == c981540beK.LIZ && this.LIZIZ == c981540beK.LIZIZ && this.LIZJ == c981540beK.LIZJ && this.LIZLLL == c981540beK.LIZLLL && this.LJ == c981540beK.LJ && this.LJFF == c981540beK.LJFF && this.LJI == c981540beK.LJI && this.LJII == c981540beK.LJII && this.LJIIIIZZ == c981540beK.LJIIIIZZ && this.LJIIIZ == c981540beK.LJIIIZ && this.LJIIJ == c981540beK.LJIIJ;
    }

    public final int hashCode() {
        return (((((((((((((((((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + C786410Ut5.Y2(this.LJI)) * 31) + C786410Ut5.Y2(this.LJII)) * 31) + C786410Ut5.Y2(this.LJIIIIZZ)) * 31) + C786410Ut5.Y2(this.LJIIIZ)) * 31) + C786410Ut5.Y2(this.LJIIJ);
    }

    public final String toString() {
        return "CompetitionCountTimeConfig(compeBizType=" + this.LIZ + ", playingStartTime=" + this.LIZIZ + ", playingPerformingStartTime=" + this.LIZJ + ", playingPerformingEndTime=" + this.LIZLLL + ", playingExtraDuration=" + this.LJ + ", playingPlannedEndTime=" + this.LJFF + ", playingFinalCallDuration=" + this.LJI + ", alarmClockDuration=" + this.LJII + ", punishStartTime=" + this.LJIIIIZZ + ", punishPlannedEndTime=" + this.LJIIIZ + ", punishDuration=" + this.LJIIJ + ')';
    }

    public final long LIZIZ() {
        long jLIZJ = (this.LJFF - this.LJII) - C158B.LIZJ();
        long j = jLIZJ < -100 ? LJIIJJI : jLIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getTakeTheStageFinalCallDuration");
        sbLIZ.append(", returnFinalCallDuration=");
        sbLIZ.append(j);
        sbLIZ.append(" ,finalCallDurationFromServer=");
        sbLIZ.append(jLIZJ);
        sbLIZ.append(", durationFallback=");
        sbLIZ.append(LJIIJJI);
        sbLIZ.append(", durationFallbackLimit=-100");
        C20441214yg.LIZIZ("CompetitionCountTimeConfig", C2188811AlT.LIZIZ(sbLIZ));
        return j;
    }

    public final long LIZ() {
        return (this.LJFF - (C974520bT0.LIZ() / ((long) LSPassThroughRecordSizeConfig.DEFAULT))) - this.LJ;
    }

    public C981540beK(EnumC962960bAM enumC962960bAM, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, int i) {
        long j10 = j3;
        long j11 = j2;
        long j12 = j6;
        long j13 = j5;
        long j14 = j4;
        long j15 = j9;
        long j16 = j8;
        long j17 = j7;
        long j18 = (i & 2) != 0 ? 0L : j;
        j11 = (i & 4) != 0 ? 0L : j11;
        j10 = (i & 8) != 0 ? 0L : j10;
        j14 = (i & 16) != 0 ? 0L : j14;
        j13 = (i & 32) != 0 ? 0L : j13;
        j12 = (i & 64) != 0 ? 0L : j12;
        j17 = (i & 128) != 0 ? 0L : j17;
        j16 = (i & 256) != 0 ? 0L : j16;
        j15 = (i & 512) != 0 ? 0L : j15;
        this.LIZ = enumC962960bAM;
        this.LIZIZ = j18;
        this.LIZJ = j11;
        this.LIZLLL = j10;
        this.LJ = j14;
        this.LJFF = j13;
        this.LJI = j12;
        this.LJII = j17;
        this.LJIIIIZZ = j16;
        this.LJIIIZ = j15;
        this.LJIIJ = 0L;
    }
}
