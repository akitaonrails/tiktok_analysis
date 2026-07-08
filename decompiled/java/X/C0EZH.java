package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EZH, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EZH {
    public final C364440EQo LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final EnumC359990E9l LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;
    public final boolean LJIIL;
    public final Effect LJIILIIL;
    public final boolean LJIILJJIL;
    public final boolean LJIILL;

    public C0EZH() {
        this(null, false, false, false, false, false, false, false, null, false, false, false, null, false, false, 65535);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0EZH)) {
            return false;
        }
        C0EZH c0ezh = (C0EZH) obj;
        return Intrinsics.LJFF(this.LIZ, c0ezh.LIZ) && this.LIZIZ == c0ezh.LIZIZ && this.LIZJ == c0ezh.LIZJ && this.LIZLLL == c0ezh.LIZLLL && this.LJ == c0ezh.LJ && this.LJFF == c0ezh.LJFF && this.LJI == c0ezh.LJI && this.LJII == c0ezh.LJII && this.LJIIIIZZ == c0ezh.LJIIIIZZ && this.LJIIIZ == c0ezh.LJIIIZ && this.LJIIJ == c0ezh.LJIIJ && this.LJIIJJI == c0ezh.LJIIJJI && this.LJIIL == c0ezh.LJIIL && Intrinsics.LJFF(this.LJIILIIL, c0ezh.LJIILIIL) && this.LJIILJJIL == c0ezh.LJIILJJIL && this.LJIILL == c0ezh.LJIILL;
    }

    public final int hashCode() {
        C364440EQo c364440EQo = this.LIZ;
        int iHashCode = (((((((((((((((((c364440EQo == null ? 0 : c364440EQo.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII)) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31;
        EnumC359990E9l enumC359990E9l = this.LJIIIZ;
        int iHashCode2 = (((((((iHashCode + (enumC359990E9l == null ? 0 : enumC359990E9l.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIJ)) * 31) + C786410Ut5.Z2(this.LJIIJJI)) * 31) + C786410Ut5.Z2(this.LJIIL)) * 31;
        Effect effect = this.LJIILIIL;
        return ((((iHashCode2 + (effect != null ? effect.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIILJJIL)) * 31) + C786410Ut5.Z2(this.LJIILL);
    }

    public final String toString() {
        return "EditorProEnterMode(inlineCaptionCaches=" + this.LIZ + ", hasWarnShow=" + this.LIZIZ + ", fromEffect=" + this.LIZJ + ", fromSlide=" + this.LIZLLL + ", fromSideMenu=" + this.LJ + ", fromFilter=" + this.LJFF + ", withAnim=" + this.LJI + ", noMob=" + this.LJII + ", isPhotoPage=" + this.LJIIIIZZ + ", intent=" + this.LJIIIZ + ", fromCaption=" + this.LJIIJ + ", isFromRetouch=" + this.LJIIJJI + ", isRetouchMultiTrackMode=" + this.LJIIL + ", captionCaptionTemplate=" + this.LJIILIIL + ", fromMusicStrip=" + this.LJIILJJIL + ", fromReplaceMusicStrip=" + this.LJIILL + ')';
    }

    public C0EZH(C364440EQo c364440EQo, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, EnumC359990E9l enumC359990E9l, boolean z8, boolean z9, boolean z10, Effect effect, boolean z11, boolean z12, int i) {
        boolean z13 = z;
        boolean z14 = z3;
        boolean z15 = z2;
        boolean z16 = z5;
        boolean z17 = z4;
        boolean z18 = z7;
        boolean z19 = z6;
        boolean z20 = z8;
        EnumC359990E9l enumC359990E9l2 = enumC359990E9l;
        boolean z21 = z10;
        boolean z22 = z9;
        boolean z23 = z11;
        Effect effect2 = effect;
        boolean z24 = z12;
        C364440EQo c364440EQo2 = (i & 1) != 0 ? null : c364440EQo;
        z13 = (i & 2) != 0 ? false : z13;
        z15 = (i & 4) != 0 ? false : z15;
        z14 = (i & 8) != 0 ? false : z14;
        z17 = (i & 16) != 0 ? false : z17;
        z16 = (i & 32) != 0 ? false : z16;
        z19 = (i & 64) != 0 ? true : z19;
        z18 = (i & 128) != 0 ? false : z18;
        enumC359990E9l2 = (i & 512) != 0 ? null : enumC359990E9l2;
        z20 = (i & 1024) != 0 ? false : z20;
        z22 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z22;
        z21 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z21;
        effect2 = (i & 8192) != 0 ? null : effect2;
        z23 = (i & 16384) != 0 ? false : z23;
        z24 = (i & 32768) != 0 ? false : z24;
        this.LIZ = c364440EQo2;
        this.LIZIZ = z13;
        this.LIZJ = z15;
        this.LIZLLL = z14;
        this.LJ = z17;
        this.LJFF = z16;
        this.LJI = z19;
        this.LJII = z18;
        this.LJIIIIZZ = false;
        this.LJIIIZ = enumC359990E9l2;
        this.LJIIJ = z20;
        this.LJIIJJI = z22;
        this.LJIIL = z21;
        this.LJIILIIL = effect2;
        this.LJIILJJIL = z23;
        this.LJIILL = z24;
    }
}
