package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E7e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C359400E7e {
    public final C359410E7f LIZ;
    public final C0ELG LIZIZ;
    public final C0E7S LIZJ;
    public final C0E75 LIZLLL;
    public final C359620E8a LJ;
    public final C359380E7c LJFF;
    public final C359480E7m LJI;
    public final C359500E7o LJII;
    public final C375830EoP<Boolean> LJIIIIZZ;
    public final C375830EoP<C0E82> LJIIIZ;
    public final C375830EoP<Unit> LJIIJ;
    public final C375830EoP<Unit> LJIIJJI;
    public final C375830EoP<Integer> LJIIL;
    public final C375830EoP<Boolean> LJIILIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C359400E7e)) {
            return false;
        }
        C359400E7e c359400E7e = (C359400E7e) obj;
        return Intrinsics.LJFF(this.LIZ, c359400E7e.LIZ) && Intrinsics.LJFF(this.LIZIZ, c359400E7e.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c359400E7e.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c359400E7e.LIZLLL) && Intrinsics.LJFF(this.LJ, c359400E7e.LJ) && Intrinsics.LJFF(this.LJFF, c359400E7e.LJFF) && Intrinsics.LJFF(this.LJI, c359400E7e.LJI) && Intrinsics.LJFF(this.LJII, c359400E7e.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c359400E7e.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c359400E7e.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c359400E7e.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c359400E7e.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c359400E7e.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c359400E7e.LJIILIIL);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C0ELG c0elg = this.LIZIZ;
        int iHashCode2 = (((((((((((((iHashCode + (c0elg == null ? 0 : c0elg.hashCode())) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31;
        C375830EoP<Boolean> c375830EoP = this.LJIIIIZZ;
        int iHashCode3 = (iHashCode2 + (c375830EoP == null ? 0 : c375830EoP.hashCode())) * 31;
        C375830EoP<C0E82> c375830EoP2 = this.LJIIIZ;
        int iHashCode4 = (iHashCode3 + (c375830EoP2 == null ? 0 : c375830EoP2.hashCode())) * 31;
        C375830EoP<Unit> c375830EoP3 = this.LJIIJ;
        int iHashCode5 = (iHashCode4 + (c375830EoP3 == null ? 0 : c375830EoP3.hashCode())) * 31;
        C375830EoP<Unit> c375830EoP4 = this.LJIIJJI;
        int iHashCode6 = (iHashCode5 + (c375830EoP4 == null ? 0 : c375830EoP4.hashCode())) * 31;
        C375830EoP<Integer> c375830EoP5 = this.LJIIL;
        int iHashCode7 = (iHashCode6 + (c375830EoP5 == null ? 0 : c375830EoP5.hashCode())) * 31;
        C375830EoP<Boolean> c375830EoP6 = this.LJIILIIL;
        return iHashCode7 + (c375830EoP6 != null ? c375830EoP6.hashCode() : 0);
    }

    public final String toString() {
        return "TrackPanelStates(trackInitData=" + this.LIZ + ", trackPaints=" + this.LIZIZ + ", trackNLEData=" + this.LIZJ + ", trackSelectState=" + this.LIZLLL + ", subTrackTypeState=" + this.LJ + ", trackOperateState=" + this.LJFF + ", trackCustomUIState=" + this.LJI + ", trackGestureExclusionState=" + this.LJII + ", forceUpdateKeyframeEvent=" + this.LJIIIIZZ + ", recordAudioEvent=" + this.LJIIIZ + ", refreshTrackViewEvent=" + this.LJIIJ + ", stopFlingEvent=" + this.LJIIJJI + ", selectTransitionEvent=" + this.LJIIL + ", enablePreInitVisibleRect=" + this.LJIILIIL + ')';
    }

    public C359400E7e(C359410E7f c359410E7f, C0ELG c0elg, C0E7S c0e7s, C0E75 c0e75, C359620E8a c359620E8a, C359380E7c c359380E7c, C359480E7m c359480E7m, C359500E7o c359500E7o, C375830EoP<Boolean> c375830EoP, C375830EoP<C0E82> c375830EoP2, C375830EoP<Unit> c375830EoP3, C375830EoP<Unit> c375830EoP4, C375830EoP<Integer> c375830EoP5, C375830EoP<Boolean> c375830EoP6) {
        this.LIZ = c359410E7f;
        this.LIZIZ = c0elg;
        this.LIZJ = c0e7s;
        this.LIZLLL = c0e75;
        this.LJ = c359620E8a;
        this.LJFF = c359380E7c;
        this.LJI = c359480E7m;
        this.LJII = c359500E7o;
        this.LJIIIIZZ = c375830EoP;
        this.LJIIIZ = c375830EoP2;
        this.LJIIJ = c375830EoP3;
        this.LJIIJJI = c375830EoP4;
        this.LJIIL = c375830EoP5;
        this.LJIILIIL = c375830EoP6;
    }

    public static C359400E7e LIZ(C359400E7e c359400E7e, C359410E7f c359410E7f, C0ELG c0elg, C0E7S c0e7s, C0E75 c0e75, C359620E8a c359620E8a, C359380E7c c359380E7c, C359480E7m c359480E7m, C359500E7o c359500E7o, C375830EoP c375830EoP, C375830EoP c375830EoP2, C375830EoP c375830EoP3, C375830EoP c375830EoP4, C375830EoP c375830EoP5, C375830EoP c375830EoP6, int i) {
        C375830EoP c375830EoP7 = c375830EoP6;
        C375830EoP c375830EoP8 = c375830EoP5;
        C375830EoP c375830EoP9 = c375830EoP4;
        C375830EoP c375830EoP10 = c375830EoP3;
        C375830EoP c375830EoP11 = c375830EoP2;
        C375830EoP c375830EoP12 = c375830EoP;
        C359500E7o c359500E7o2 = c359500E7o;
        C359480E7m c359480E7m2 = c359480E7m;
        C359380E7c c359380E7c2 = c359380E7c;
        C359620E8a c359620E8a2 = c359620E8a;
        C0E75 c0e752 = c0e75;
        C0E7S c0e7s2 = c0e7s;
        C0ELG c0elg2 = c0elg;
        C359410E7f c359410E7f2 = c359410E7f;
        if ((i & 1) != 0) {
            c359410E7f2 = c359400E7e.LIZ;
        }
        if ((i & 2) != 0) {
            c0elg2 = c359400E7e.LIZIZ;
        }
        if ((i & 4) != 0) {
            c0e7s2 = c359400E7e.LIZJ;
        }
        if ((i & 8) != 0) {
            c0e752 = c359400E7e.LIZLLL;
        }
        if ((i & 16) != 0) {
            c359620E8a2 = c359400E7e.LJ;
        }
        if ((i & 32) != 0) {
            c359380E7c2 = c359400E7e.LJFF;
        }
        if ((i & 64) != 0) {
            c359480E7m2 = c359400E7e.LJI;
        }
        if ((i & 128) != 0) {
            c359500E7o2 = c359400E7e.LJII;
        }
        if ((i & 256) != 0) {
            c375830EoP12 = c359400E7e.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            c375830EoP11 = c359400E7e.LJIIIZ;
        }
        if ((i & 1024) != 0) {
            c375830EoP10 = c359400E7e.LJIIJ;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c375830EoP9 = c359400E7e.LJIIJJI;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c375830EoP8 = c359400E7e.LJIIL;
        }
        if ((i & 8192) != 0) {
            c375830EoP7 = c359400E7e.LJIILIIL;
        }
        c359400E7e.getClass();
        return new C359400E7e(c359410E7f2, c0elg2, c0e7s2, c0e752, c359620E8a2, c359380E7c2, c359480E7m2, c359500E7o2, c375830EoP12, c375830EoP11, c375830EoP10, c375830EoP9, c375830EoP8, c375830EoP7);
    }
}
