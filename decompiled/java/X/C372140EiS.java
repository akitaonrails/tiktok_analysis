package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EiS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C372140EiS {
    public final C375830EoP<Boolean> LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final C349430Dmv LIZLLL;
    public final C375830EoP<Unit> LJ;
    public final C375830EoP<Unit> LJFF;
    public final C375830EoP<Unit> LJI;
    public final C375830EoP<Unit> LJII;
    public final C375830EoP<Unit> LJIIIIZZ;
    public final C375830EoP<Boolean> LJIIIZ;
    public final C0EHI LJIIJ;
    public final C375830EoP<Boolean> LJIIJJI;
    public final Boolean LJIIL;

    public C372140EiS() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C372140EiS)) {
            return false;
        }
        C372140EiS c372140EiS = (C372140EiS) obj;
        return Intrinsics.LJFF(this.LIZ, c372140EiS.LIZ) && this.LIZIZ == c372140EiS.LIZIZ && this.LIZJ == c372140EiS.LIZJ && Intrinsics.LJFF(this.LIZLLL, c372140EiS.LIZLLL) && Intrinsics.LJFF(this.LJ, c372140EiS.LJ) && Intrinsics.LJFF(this.LJFF, c372140EiS.LJFF) && Intrinsics.LJFF(this.LJI, c372140EiS.LJI) && Intrinsics.LJFF(this.LJII, c372140EiS.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c372140EiS.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c372140EiS.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c372140EiS.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c372140EiS.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c372140EiS.LJIIL);
    }

    public final int hashCode() {
        C375830EoP<Boolean> c375830EoP = this.LIZ;
        int iHashCode = (((((c375830EoP == null ? 0 : c375830EoP.hashCode()) * 31) + this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        C349430Dmv c349430Dmv = this.LIZLLL;
        int iHashCode2 = (iHashCode + (c349430Dmv == null ? 0 : c349430Dmv.hashCode())) * 31;
        C375830EoP<Unit> c375830EoP2 = this.LJ;
        int iHashCode3 = (iHashCode2 + (c375830EoP2 == null ? 0 : c375830EoP2.hashCode())) * 31;
        C375830EoP<Unit> c375830EoP3 = this.LJFF;
        int iHashCode4 = (iHashCode3 + (c375830EoP3 == null ? 0 : c375830EoP3.hashCode())) * 31;
        C375830EoP<Unit> c375830EoP4 = this.LJI;
        int iHashCode5 = (iHashCode4 + (c375830EoP4 == null ? 0 : c375830EoP4.hashCode())) * 31;
        C375830EoP<Unit> c375830EoP5 = this.LJII;
        int iHashCode6 = (iHashCode5 + (c375830EoP5 == null ? 0 : c375830EoP5.hashCode())) * 31;
        C375830EoP<Unit> c375830EoP6 = this.LJIIIIZZ;
        int iHashCode7 = (iHashCode6 + (c375830EoP6 == null ? 0 : c375830EoP6.hashCode())) * 31;
        C375830EoP<Boolean> c375830EoP7 = this.LJIIIZ;
        int iHashCode8 = (iHashCode7 + (c375830EoP7 == null ? 0 : c375830EoP7.hashCode())) * 31;
        C0EHI c0ehi = this.LJIIJ;
        int iHashCode9 = (iHashCode8 + (c0ehi == null ? 0 : c0ehi.hashCode())) * 31;
        C375830EoP<Boolean> c375830EoP8 = this.LJIIJJI;
        int iHashCode10 = (iHashCode9 + (c375830EoP8 == null ? 0 : c375830EoP8.hashCode())) * 31;
        Boolean bool = this.LJIIL;
        return iHashCode10 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "EditorProSceneStates(enterOrExitAnimEvent=" + this.LIZ + ", viewFullBgVisibility=" + this.LIZIZ + ", isAnimatingInOrOut=" + this.LIZJ + ", nleModelDoneNode=" + this.LIZLLL + ", reloadNLEMediaData=" + this.LJ + ", slideInCancel=" + this.LJFF + ", onSlideIn=" + this.LJI + ", slideFinish=" + this.LJII + ", onSlideOut=" + this.LJIIIIZZ + ", slideOutFinish=" + this.LJIIIZ + ", epLoaderData=" + this.LJIIJ + ", saveOrCancelEvent=" + this.LJIIJJI + ", saveBtnClickable=" + this.LJIIL + ')';
    }

    public /* synthetic */ C372140EiS(int i) {
        this(null, 4, false, null, null, null, null, null, null, null, null, null, null);
    }

    public C372140EiS(C375830EoP<Boolean> c375830EoP, int i, boolean z, C349430Dmv c349430Dmv, C375830EoP<Unit> c375830EoP2, C375830EoP<Unit> c375830EoP3, C375830EoP<Unit> c375830EoP4, C375830EoP<Unit> c375830EoP5, C375830EoP<Unit> c375830EoP6, C375830EoP<Boolean> c375830EoP7, C0EHI c0ehi, C375830EoP<Boolean> c375830EoP8, Boolean bool) {
        this.LIZ = c375830EoP;
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LIZLLL = c349430Dmv;
        this.LJ = c375830EoP2;
        this.LJFF = c375830EoP3;
        this.LJI = c375830EoP4;
        this.LJII = c375830EoP5;
        this.LJIIIIZZ = c375830EoP6;
        this.LJIIIZ = c375830EoP7;
        this.LJIIJ = c0ehi;
        this.LJIIJJI = c375830EoP8;
        this.LJIIL = bool;
    }

    public static C372140EiS LIZ(C372140EiS c372140EiS, C375830EoP c375830EoP, int i, boolean z, C349430Dmv c349430Dmv, C375830EoP c375830EoP2, C375830EoP c375830EoP3, C375830EoP c375830EoP4, C375830EoP c375830EoP5, C375830EoP c375830EoP6, C375830EoP c375830EoP7, C375830EoP c375830EoP8, Boolean bool, int i2) {
        C0EHI c0ehi;
        Boolean bool2 = bool;
        C375830EoP c375830EoP9 = c375830EoP8;
        C375830EoP c375830EoP10 = c375830EoP7;
        C375830EoP c375830EoP11 = c375830EoP6;
        C375830EoP c375830EoP12 = c375830EoP5;
        C375830EoP c375830EoP13 = c375830EoP4;
        C375830EoP c375830EoP14 = c375830EoP3;
        C375830EoP c375830EoP15 = c375830EoP2;
        C349430Dmv c349430Dmv2 = c349430Dmv;
        boolean z2 = z;
        int i3 = i;
        C375830EoP c375830EoP16 = c375830EoP;
        if ((i2 & 1) != 0) {
            c375830EoP16 = c372140EiS.LIZ;
        }
        if ((i2 & 2) != 0) {
            i3 = c372140EiS.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            z2 = c372140EiS.LIZJ;
        }
        if ((i2 & 8) != 0) {
            c349430Dmv2 = c372140EiS.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            c375830EoP15 = c372140EiS.LJ;
        }
        if ((i2 & 32) != 0) {
            c375830EoP14 = c372140EiS.LJFF;
        }
        if ((i2 & 64) != 0) {
            c375830EoP13 = c372140EiS.LJI;
        }
        if ((i2 & 128) != 0) {
            c375830EoP12 = c372140EiS.LJII;
        }
        if ((i2 & 256) != 0) {
            c375830EoP11 = c372140EiS.LJIIIIZZ;
        }
        if ((i2 & 512) != 0) {
            c375830EoP10 = c372140EiS.LJIIIZ;
        }
        if ((i2 & 1024) != 0) {
            c0ehi = c372140EiS.LJIIJ;
        } else {
            c0ehi = null;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c375830EoP9 = c372140EiS.LJIIJJI;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            bool2 = c372140EiS.LJIIL;
        }
        c372140EiS.getClass();
        return new C372140EiS(c375830EoP16, i3, z2, c349430Dmv2, c375830EoP15, c375830EoP14, c375830EoP13, c375830EoP12, c375830EoP11, c375830EoP10, c0ehi, c375830EoP9, bool2);
    }
}
