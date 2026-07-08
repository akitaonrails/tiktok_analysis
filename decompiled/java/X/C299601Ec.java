package X;

import tikcast.linkmic.common.LinkerMediaChangeOperator;
import webcast.data.multi_guest_play.CountdownConfig;

/* JADX INFO: renamed from: X.01Ec, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C299601Ec {
    public final long LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final C01EB LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final long LJI;
    public final long LJII;
    public final int LJIIIIZZ;
    public final CountdownConfig LJIIIZ;
    public final LinkerMediaChangeOperator LJIIJ;
    public final Boolean LJIIJJI;

    public final String toString() {
        return "CountdownUser(userId=" + this.LIZ + ", countdownId=" + this.LIZIZ + ", linkMicId=" + this.LIZJ + ", state=" + this.LIZLLL + ", duration=" + this.LJ + ", startTime=" + this.LJFF + ", score=" + this.LJI + ", targetScore=" + this.LJII + ", completionProgressPercent=" + this.LJIIIIZZ + ", countdownConfig=" + this.LJIIIZ + ", operatorUserInfo=" + this.LJIIJ + ", isFinishCountdown=" + this.LJIIJJI + ')';
    }

    public C299601Ec(long j, long j2, String str, C01EB c01eb, long j3, long j4, long j5, long j6, int i, CountdownConfig countdownConfig, LinkerMediaChangeOperator linkerMediaChangeOperator, Boolean bool) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = str;
        this.LIZLLL = c01eb;
        this.LJ = j3;
        this.LJFF = j4;
        this.LJI = j5;
        this.LJII = j6;
        this.LJIIIIZZ = i;
        this.LJIIIZ = countdownConfig;
        this.LJIIJ = linkerMediaChangeOperator;
        this.LJIIJJI = bool;
    }
}
