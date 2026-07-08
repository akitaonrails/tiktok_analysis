package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.199Z, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C199Z {
    public final String LIZ;
    public boolean LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;

    public C199Z() {
        this(null, 16383);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C199Z)) {
            return false;
        }
        C199Z c199z = (C199Z) obj;
        return Intrinsics.LJFF(this.LIZ, c199z.LIZ) && this.LIZIZ == c199z.LIZIZ && this.LIZJ == c199z.LIZJ && this.LIZLLL == c199z.LIZLLL && this.LJ == c199z.LJ && this.LJFF == c199z.LJFF && this.LJI == c199z.LJI && this.LJII == c199z.LJII && this.LJIIIIZZ == c199z.LJIIIIZZ && this.LJIIIZ == c199z.LJIIIZ && this.LJIIJ == c199z.LJIIJ && this.LJIIJJI == c199z.LJIIJJI && this.LJIIL == c199z.LJIIL && this.LJIILIIL == c199z.LJIILIIL;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + C786410Ut5.Y2(this.LJI)) * 31) + C786410Ut5.Y2(this.LJII)) * 31) + C786410Ut5.Y2(this.LJIIIIZZ)) * 31) + C786410Ut5.Y2(this.LJIIIZ)) * 31) + C786410Ut5.Y2(this.LJIIJ)) * 31) + C786410Ut5.Y2(this.LJIIJJI)) * 31) + C786410Ut5.Z2(this.LJIIL)) * 31) + C786410Ut5.Z2(this.LJIILIIL);
    }

    public final String toString() {
        return "SAFTikTokMonitorEvent(activityName=" + this.LIZ + ", savedInstance=" + this.LIZIZ + ", onInitSceneStart=" + this.LIZJ + ", onInitSceneDuration=" + this.LIZLLL + ", onSceneDispatchOnCreateStart=" + this.LJ + ", onSceneDispatchOnCreateDuration=" + this.LJFF + ", onSceneDispatchOnActivityCreatedStart=" + this.LJI + ", onSceneDispatchOnActivityCreatedDuration=" + this.LJII + ", onSceneDispatchOnStartStart=" + this.LJIIIIZZ + ", onSceneDispatchOnStartDuration=" + this.LJIIIZ + ", onSceneDispatchOnResumeStart=" + this.LJIIJ + ", onSceneDispatchOnResumeDuration=" + this.LJIIJJI + ", isColdStart=" + this.LJIIL + ", enableNavigation=" + this.LJIILIIL + ')';
    }

    public C199Z(String str, int i) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        boolean z;
        String str2 = (i & 1) != 0 ? "" : str;
        if ((i & 4) != 0) {
            j = -1;
        } else {
            j = 0;
        }
        if ((i & 8) != 0) {
            j2 = -1;
        } else {
            j2 = 0;
        }
        if ((i & 16) != 0) {
            j3 = -1;
        } else {
            j3 = 0;
        }
        if ((i & 32) != 0) {
            j4 = -1;
        } else {
            j4 = 0;
        }
        if ((i & 64) != 0) {
            j5 = -1;
        } else {
            j5 = 0;
        }
        if ((i & 128) != 0) {
            j6 = -1;
        } else {
            j6 = 0;
        }
        if ((i & 256) != 0) {
            j7 = -1;
        } else {
            j7 = 0;
        }
        if ((i & 512) != 0) {
            j8 = -1;
        } else {
            j8 = 0;
        }
        if ((i & 1024) != 0) {
            j9 = -1;
        } else {
            j9 = 0;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            j10 = -1;
        } else {
            j10 = 0;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LIZ = str2;
        this.LIZIZ = false;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = j3;
        this.LJFF = j4;
        this.LJI = j5;
        this.LJII = j6;
        this.LJIIIIZZ = j7;
        this.LJIIIZ = j8;
        this.LJIIJ = j9;
        this.LJIIJJI = j10;
        this.LJIIL = z;
        this.LJIILIIL = false;
    }
}
