package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fpA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1142020fpA {
    public final C1136870fgr LIZ;
    public final String LIZIZ;
    public final EnumC1142140fpM LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final int LJFF;
    public final String LJI;
    public final String LJII;
    public final float LJIIIIZZ;
    public final int LJIIIZ;
    public final EnumC1142040fpC LJIIJ;
    public final String LJIIJJI;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C1142020fpA() {
        long j = 0;
        int i = 0;
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, j, j, i, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0.0f, i, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 4095);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1142020fpA)) {
            return false;
        }
        C1142020fpA c1142020fpA = (C1142020fpA) obj;
        return Intrinsics.LJFF(this.LIZ, c1142020fpA.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1142020fpA.LIZIZ) && this.LIZJ == c1142020fpA.LIZJ && this.LIZLLL == c1142020fpA.LIZLLL && this.LJ == c1142020fpA.LJ && this.LJFF == c1142020fpA.LJFF && Intrinsics.LJFF(this.LJI, c1142020fpA.LJI) && Intrinsics.LJFF(this.LJII, c1142020fpA.LJII) && Float.compare(this.LJIIIIZZ, c1142020fpA.LJIIIIZZ) == 0 && this.LJIIIZ == c1142020fpA.LJIIIZ && this.LJIIJ == c1142020fpA.LJIIJ && Intrinsics.LJFF(this.LJIIJJI, c1142020fpA.LJIIJJI);
    }

    public final String toString() {
        return "MusicGiftPreviewState(source=" + this.LIZ + ", playbackSessionId=" + this.LIZIZ + ", status=" + this.LIZJ + ", positionMs=" + this.LIZLLL + ", durationMs=" + this.LJ + ", lyricLineIndex=" + this.LJFF + ", lyricText=" + this.LJI + ", lyricNextText=" + this.LJII + ", lyricLineProgress=" + this.LJIIIIZZ + ", lyricLineDurationMs=" + this.LJIIIZ + ", lyricLoadStatus=" + this.LJIIJ + ", errorMessage=" + this.LJIIJJI + ')';
    }

    public final int hashCode() {
        C1136870fgr c1136870fgr = this.LIZ;
        int iHashCode = (c1136870fgr == null ? 0 : c1136870fgr.hashCode()) * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + this.LJFF) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + Float.floatToIntBits(this.LJIIIIZZ)) * 31) + this.LJIIIZ) * 31) + this.LJIIJ.hashCode()) * 31;
        String str2 = this.LJIIJJI;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public C1142020fpA(C1136870fgr c1136870fgr, String str, EnumC1142140fpM enumC1142140fpM, long j, long j2, int i, String str2, String str3, float f, int i2, EnumC1142040fpC enumC1142040fpC, String str4) {
        this.LIZ = c1136870fgr;
        this.LIZIZ = str;
        this.LIZJ = enumC1142140fpM;
        this.LIZLLL = j;
        this.LJ = j2;
        this.LJFF = i;
        this.LJI = str2;
        this.LJII = str3;
        this.LJIIIIZZ = f;
        this.LJIIIZ = i2;
        this.LJIIJ = enumC1142040fpC;
        this.LJIIJJI = str4;
    }

    public /* synthetic */ C1142020fpA(C1136870fgr c1136870fgr, String str, EnumC1142140fpM enumC1142140fpM, long j, long j2, int i, String str2, String str3, float f, int i2, EnumC1142040fpC enumC1142040fpC, String str4, int i3) {
        this((i3 & 1) != 0 ? null : c1136870fgr, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? EnumC1142140fpM.IDLE : enumC1142140fpM, (i3 & 8) != 0 ? 0L : j, (i3 & 16) == 0 ? j2 : 0L, (i3 & 32) != 0 ? 0 : i, (i3 & 64) != 0 ? "" : str2, (i3 & 128) == 0 ? str3 : "", (i3 & 256) != 0 ? 0.0f : f, (i3 & 512) == 0 ? i2 : 0, (i3 & 1024) != 0 ? EnumC1142040fpC.IDLE : enumC1142040fpC, (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? str4 : null);
    }

    public static C1142020fpA LIZ(C1142020fpA c1142020fpA, C1136870fgr c1136870fgr, EnumC1142140fpM enumC1142140fpM, long j, long j2, int i, String str, String str2, float f, int i2, EnumC1142040fpC enumC1142040fpC, String str3, int i3) {
        String str4;
        int i4 = i2;
        float f2 = f;
        String str5 = str2;
        String str6 = str;
        long j3 = j2;
        long j4 = j;
        int i5 = i;
        String str7 = str3;
        EnumC1142140fpM enumC1142140fpM2 = enumC1142140fpM;
        EnumC1142040fpC enumC1142040fpC2 = enumC1142040fpC;
        C1136870fgr c1136870fgr2 = c1136870fgr;
        if ((i3 & 1) != 0) {
            c1136870fgr2 = c1142020fpA.LIZ;
        }
        if ((i3 & 2) != 0) {
            str4 = c1142020fpA.LIZIZ;
        } else {
            str4 = null;
        }
        if ((i3 & 4) != 0) {
            enumC1142140fpM2 = c1142020fpA.LIZJ;
        }
        if ((i3 & 8) != 0) {
            j4 = c1142020fpA.LIZLLL;
        }
        if ((i3 & 16) != 0) {
            j3 = c1142020fpA.LJ;
        }
        if ((i3 & 32) != 0) {
            i5 = c1142020fpA.LJFF;
        }
        if ((i3 & 64) != 0) {
            str6 = c1142020fpA.LJI;
        }
        if ((i3 & 128) != 0) {
            str5 = c1142020fpA.LJII;
        }
        if ((i3 & 256) != 0) {
            f2 = c1142020fpA.LJIIIIZZ;
        }
        if ((i3 & 512) != 0) {
            i4 = c1142020fpA.LJIIIZ;
        }
        if ((i3 & 1024) != 0) {
            enumC1142040fpC2 = c1142020fpA.LJIIJ;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str7 = c1142020fpA.LJIIJJI;
        }
        c1142020fpA.getClass();
        return new C1142020fpA(c1136870fgr2, str4, enumC1142140fpM2, j4, j3, i5, str6, str5, f2, i4, enumC1142040fpC2, str7);
    }
}
