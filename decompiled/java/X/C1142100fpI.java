package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fpI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1142100fpI {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final EnumC1142190fpR LJIIIIZZ;
    public final String LJIIIZ;
    public final long LJIIJ;
    public final long LJIIJJI;
    public final int LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final float LJIILL;
    public final int LJIILLIIL;
    public final EnumC1142170fpP LJIIZILJ;
    public final EnumC1142150fpN LJIJ;
    public final EnumC1142160fpO LJIJI;
    public final EnumC1142210fpT LJIJJ;
    public final boolean LJIJJLI;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C1142100fpI() {
        long j = 0;
        this(j, j, j, j, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, j, 0, 0 == true ? 1 : 0, 4194303);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1142100fpI)) {
            return false;
        }
        C1142100fpI c1142100fpI = (C1142100fpI) obj;
        return this.LIZ == c1142100fpI.LIZ && this.LIZIZ == c1142100fpI.LIZIZ && this.LIZJ == c1142100fpI.LIZJ && this.LIZLLL == c1142100fpI.LIZLLL && Intrinsics.LJFF(this.LJ, c1142100fpI.LJ) && Intrinsics.LJFF(this.LJFF, c1142100fpI.LJFF) && Intrinsics.LJFF(this.LJI, c1142100fpI.LJI) && Intrinsics.LJFF(this.LJII, c1142100fpI.LJII) && this.LJIIIIZZ == c1142100fpI.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c1142100fpI.LJIIIZ) && this.LJIIJ == c1142100fpI.LJIIJ && this.LJIIJJI == c1142100fpI.LJIIJJI && this.LJIIL == c1142100fpI.LJIIL && Intrinsics.LJFF(this.LJIILIIL, c1142100fpI.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c1142100fpI.LJIILJJIL) && Float.compare(this.LJIILL, c1142100fpI.LJIILL) == 0 && this.LJIILLIIL == c1142100fpI.LJIILLIIL && this.LJIIZILJ == c1142100fpI.LJIIZILJ && this.LJIJ == c1142100fpI.LJIJ && this.LJIJI == c1142100fpI.LJIJI && this.LJIJJ == c1142100fpI.LJIJJ && this.LJIJJLI == c1142100fpI.LJIJJLI;
    }

    public final String toString() {
        return "MusicGiftSelectedSegment(giftId=" + this.LIZ + ", songId=" + this.LIZIZ + ", moodId=" + this.LIZJ + ", snippetId=" + this.LIZLLL + ", audioUrl=" + this.LJ + ", lyricsUrl=" + this.LJFF + ", songName=" + this.LJI + ", artistName=" + this.LJII + ", entrySource=" + this.LJIIIIZZ + ", playbackSessionId=" + this.LJIIIZ + ", positionMs=" + this.LJIIJ + ", durationMs=" + this.LJIIJJI + ", lyricLineIndex=" + this.LJIIL + ", lyricText=" + this.LJIILIIL + ", lyricNextText=" + this.LJIILJJIL + ", lyricLineProgress=" + this.LJIILL + ", lyricLineDurationMs=" + this.LJIILLIIL + ", lyricLoadState=" + this.LJIIZILJ + ", playbackState=" + this.LJIJ + ", resourceLoadState=" + this.LJIJI + ", previewError=" + this.LJIJJ + ", isPanelGift=" + this.LJIJJLI + ')';
    }

    public final int hashCode() {
        int iY2 = ((((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31;
        String str = this.LJ;
        int iHashCode = (iY2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJFF;
        int iHashCode2 = (((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31;
        String str3 = this.LJIIIZ;
        return ((((((((((((((((((((((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LJIIJ)) * 31) + C786410Ut5.Y2(this.LJIIJJI)) * 31) + this.LJIIL) * 31) + this.LJIILIIL.hashCode()) * 31) + this.LJIILJJIL.hashCode()) * 31) + Float.floatToIntBits(this.LJIILL)) * 31) + this.LJIILLIIL) * 31) + this.LJIIZILJ.hashCode()) * 31) + this.LJIJ.hashCode()) * 31) + this.LJIJI.hashCode()) * 31) + this.LJIJJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJIJJLI);
    }

    public static C1142100fpI LIZ(C1142100fpI c1142100fpI, EnumC1142190fpR enumC1142190fpR, String str, String str2, EnumC1142170fpP enumC1142170fpP, EnumC1142150fpN enumC1142150fpN, EnumC1142160fpO enumC1142160fpO, EnumC1142210fpT enumC1142210fpT, boolean z, int i) {
        long j;
        long j2;
        long j3;
        long j4;
        String str3;
        String str4;
        String str5;
        String str6;
        long j5;
        int i2;
        float f;
        int i3;
        boolean z2 = z;
        EnumC1142160fpO enumC1142160fpO2 = enumC1142160fpO;
        EnumC1142150fpN enumC1142150fpN2 = enumC1142150fpN;
        EnumC1142170fpP enumC1142170fpP2 = enumC1142170fpP;
        String str7 = str;
        String str8 = str2;
        EnumC1142210fpT enumC1142210fpT2 = enumC1142210fpT;
        EnumC1142190fpR enumC1142190fpR2 = enumC1142190fpR;
        long j6 = 0;
        if ((i & 1) != 0) {
            j = c1142100fpI.LIZ;
        } else {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = c1142100fpI.LIZIZ;
        } else {
            j2 = 0;
        }
        if ((i & 4) != 0) {
            j3 = c1142100fpI.LIZJ;
        } else {
            j3 = 0;
        }
        if ((i & 8) != 0) {
            j4 = c1142100fpI.LIZLLL;
        } else {
            j4 = 0;
        }
        String str9 = null;
        if ((i & 16) != 0) {
            str3 = c1142100fpI.LJ;
        } else {
            str3 = null;
        }
        if ((i & 32) != 0) {
            str4 = c1142100fpI.LJFF;
        } else {
            str4 = null;
        }
        if ((i & 64) != 0) {
            str5 = c1142100fpI.LJI;
        } else {
            str5 = null;
        }
        if ((i & 128) != 0) {
            str6 = c1142100fpI.LJII;
        } else {
            str6 = null;
        }
        if ((i & 256) != 0) {
            enumC1142190fpR2 = c1142100fpI.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            str9 = c1142100fpI.LJIIIZ;
        }
        if ((i & 1024) != 0) {
            j5 = c1142100fpI.LJIIJ;
        } else {
            j5 = 0;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            j6 = c1142100fpI.LJIIJJI;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            i2 = c1142100fpI.LJIIL;
        } else {
            i2 = 0;
        }
        if ((i & 8192) != 0) {
            str7 = c1142100fpI.LJIILIIL;
        }
        if ((i & 16384) != 0) {
            str8 = c1142100fpI.LJIILJJIL;
        }
        if ((32768 & i) != 0) {
            f = c1142100fpI.LJIILL;
        } else {
            f = 0.0f;
        }
        if ((65536 & i) != 0) {
            i3 = c1142100fpI.LJIILLIIL;
        } else {
            i3 = 0;
        }
        if ((131072 & i) != 0) {
            enumC1142170fpP2 = c1142100fpI.LJIIZILJ;
        }
        if ((262144 & i) != 0) {
            enumC1142150fpN2 = c1142100fpI.LJIJ;
        }
        if ((524288 & i) != 0) {
            enumC1142160fpO2 = c1142100fpI.LJIJI;
        }
        if ((1048576 & i) != 0) {
            enumC1142210fpT2 = c1142100fpI.LJIJJ;
        }
        if ((i & 2097152) != 0) {
            z2 = c1142100fpI.LJIJJLI;
        }
        c1142100fpI.getClass();
        return new C1142100fpI(j, j2, j3, j4, str3, str4, str5, str6, enumC1142190fpR2, str9, j5, j6, i2, str7, str8, f, i3, enumC1142170fpP2, enumC1142150fpN2, enumC1142160fpO2, enumC1142210fpT2, z2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1142100fpI(long j, long j2, long j3, long j4, String str, String str2, String str3, String str4, EnumC1142190fpR enumC1142190fpR, String str5, long j5, int i, EnumC1142150fpN enumC1142150fpN, int i2) {
        String str6;
        EnumC1142170fpP enumC1142170fpP;
        EnumC1142160fpO enumC1142160fpO;
        EnumC1142210fpT enumC1142210fpT;
        boolean z;
        EnumC1142150fpN enumC1142150fpN2 = enumC1142150fpN;
        int i3 = i;
        long j6 = j5;
        EnumC1142190fpR enumC1142190fpR2 = enumC1142190fpR;
        String str7 = str3;
        String str8 = str2;
        String str9 = str;
        long j7 = j4;
        long j8 = j3;
        String str10 = str5;
        long j9 = j2;
        String str11 = str4;
        long j10 = (i2 & 1) != 0 ? 0L : j;
        j9 = (i2 & 2) != 0 ? 0L : j9;
        j8 = (i2 & 4) != 0 ? 0L : j8;
        j7 = (i2 & 8) != 0 ? 0L : j7;
        str9 = (i2 & 16) != 0 ? null : str9;
        str8 = (i2 & 32) != 0 ? null : str8;
        str7 = (i2 & 64) != 0 ? "" : str7;
        str11 = (i2 & 128) != 0 ? "" : str11;
        enumC1142190fpR2 = (i2 & 256) != 0 ? EnumC1142190fpR.UNKNOWN : enumC1142190fpR2;
        str10 = (i2 & 512) != 0 ? null : str10;
        j6 = (i2 & 1024) != 0 ? 0L : j6;
        i3 = (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? 0 : i3;
        if ((i2 & 8192) != 0) {
            str6 = "";
        } else {
            str6 = null;
        }
        String str12 = (i2 & 16384) == 0 ? null : "";
        if ((131072 & i2) != 0) {
            enumC1142170fpP = EnumC1142170fpP.IDLE;
        } else {
            enumC1142170fpP = null;
        }
        enumC1142150fpN2 = (262144 & i2) != 0 ? EnumC1142150fpN.IDLE : enumC1142150fpN2;
        if ((524288 & i2) != 0) {
            enumC1142160fpO = EnumC1142160fpO.IDLE;
        } else {
            enumC1142160fpO = null;
        }
        if ((1048576 & i2) != 0) {
            enumC1142210fpT = EnumC1142210fpT.NONE;
        } else {
            enumC1142210fpT = null;
        }
        if ((i2 & 2097152) != 0) {
            z = true;
        } else {
            z = false;
        }
        this(j10, j9, j8, j7, str9, str8, str7, str11, enumC1142190fpR2, str10, j6, 0L, i3, str6, str12, 0.0f, 0, enumC1142170fpP, enumC1142150fpN2, enumC1142160fpO, enumC1142210fpT, z);
    }

    public C1142100fpI(long j, long j2, long j3, long j4, String str, String str2, String str3, String str4, EnumC1142190fpR enumC1142190fpR, String str5, long j5, long j6, int i, String str6, String str7, float f, int i2, EnumC1142170fpP enumC1142170fpP, EnumC1142150fpN enumC1142150fpN, EnumC1142160fpO enumC1142160fpO, EnumC1142210fpT enumC1142210fpT, boolean z) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
        this.LJ = str;
        this.LJFF = str2;
        this.LJI = str3;
        this.LJII = str4;
        this.LJIIIIZZ = enumC1142190fpR;
        this.LJIIIZ = str5;
        this.LJIIJ = j5;
        this.LJIIJJI = j6;
        this.LJIIL = i;
        this.LJIILIIL = str6;
        this.LJIILJJIL = str7;
        this.LJIILL = f;
        this.LJIILLIIL = i2;
        this.LJIIZILJ = enumC1142170fpP;
        this.LJIJ = enumC1142150fpN;
        this.LJIJI = enumC1142160fpO;
        this.LJIJJ = enumC1142210fpT;
        this.LJIJJLI = z;
    }
}
