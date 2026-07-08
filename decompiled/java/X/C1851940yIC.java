package X;

import com.bytedance.speech.speechengine.SpeechEngine;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yIC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1851940yIC {
    public final String LIZ;
    public final SpeechEngine LIZIZ;
    public final long LIZJ;
    public long LIZLLL;
    public final List<Float> LJ;
    public boolean LJFF;
    public boolean LJI;
    public String LJII;
    public Runnable LJIIIIZZ;
    public Runnable LJIIIZ;
    public Runnable LJIIJ;
    public Runnable LJIIJJI;
    public final InterfaceC2038907yl LJIIL;

    public C1851940yIC() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1851940yIC)) {
            return false;
        }
        C1851940yIC c1851940yIC = (C1851940yIC) obj;
        return Intrinsics.LJFF(this.LIZ, c1851940yIC.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1851940yIC.LIZIZ) && this.LIZJ == c1851940yIC.LIZJ && this.LIZLLL == c1851940yIC.LIZLLL && Intrinsics.LJFF(this.LJ, c1851940yIC.LJ) && this.LJFF == c1851940yIC.LJFF && this.LJI == c1851940yIC.LJI && Intrinsics.LJFF(this.LJII, c1851940yIC.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1851940yIC.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1851940yIC.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1851940yIC.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c1851940yIC.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c1851940yIC.LJIIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31;
        String str = this.LJII;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Runnable runnable = this.LJIIIIZZ;
        int iHashCode3 = (iHashCode2 + (runnable == null ? 0 : runnable.hashCode())) * 31;
        Runnable runnable2 = this.LJIIIZ;
        int iHashCode4 = (iHashCode3 + (runnable2 == null ? 0 : runnable2.hashCode())) * 31;
        Runnable runnable3 = this.LJIIJ;
        int iHashCode5 = (iHashCode4 + (runnable3 == null ? 0 : runnable3.hashCode())) * 31;
        Runnable runnable4 = this.LJIIJJI;
        int iHashCode6 = (iHashCode5 + (runnable4 == null ? 0 : runnable4.hashCode())) * 31;
        InterfaceC2038907yl interfaceC2038907yl = this.LJIIL;
        return iHashCode6 + (interfaceC2038907yl != null ? interfaceC2038907yl.hashCode() : 0);
    }

    public final String toString() {
        return "AsrSession(sessionId=" + this.LIZ + ", engine=" + this.LIZIZ + ", startTs=" + this.LIZJ + ", lastVolumePublishTs=" + this.LIZLLL + ", volumeList=" + this.LJ + ", isMaxDurationTimeout=" + this.LJFF + ", hasStartedSpeaking=" + this.LJI + ", pendingStopReason=" + this.LJII + ", finishTimeoutRunnable=" + this.LJIIIIZZ + ", maxDurationRunnable=" + this.LJIIIZ + ", silenceSinceBeginRunnable=" + this.LJIIJ + ", autoSilenceAfterTalkRunnable=" + this.LJIIJJI + ", callback=" + this.LJIIL + ')';
    }

    public C1851940yIC(String str, SpeechEngine speechEngine, InterfaceC2038907yl interfaceC2038907yl) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        this.LIZ = str;
        this.LIZIZ = speechEngine;
        this.LIZJ = jCurrentTimeMillis;
        this.LIZLLL = 0L;
        this.LJ = arrayList;
        this.LJFF = false;
        this.LJI = false;
        this.LJII = null;
        this.LJIIIIZZ = null;
        this.LJIIIZ = null;
        this.LJIIJ = null;
        this.LJIIJJI = null;
        this.LJIIL = interfaceC2038907yl;
    }
}
