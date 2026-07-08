package X;

import android.util.Size;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FB3, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FB3 {
    public final int LIZ;
    public final AbstractC363520ENa LIZIZ;
    public final C0EO0 LIZJ;
    public final Size LIZLLL;
    public final Size LJ;
    public final Size LJFF;
    public final Boolean LJI;
    public final String LJII;
    public final Boolean LJIIIIZZ;
    public final Boolean LJIIIZ;
    public final Boolean LJIIJ;
    public final C375830EoP<Unit> LJIIJJI;
    public final C375830EoP<Unit> LJIIL;
    public final long LJIILIIL;
    public final boolean LJIILJJIL;
    public final boolean LJIILL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0FB3)) {
            return false;
        }
        C0FB3 c0fb3 = (C0FB3) obj;
        return this.LIZ == c0fb3.LIZ && Intrinsics.LJFF(this.LIZIZ, c0fb3.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0fb3.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0fb3.LIZLLL) && Intrinsics.LJFF(this.LJ, c0fb3.LJ) && Intrinsics.LJFF(this.LJFF, c0fb3.LJFF) && Intrinsics.LJFF(this.LJI, c0fb3.LJI) && Intrinsics.LJFF(this.LJII, c0fb3.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c0fb3.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c0fb3.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c0fb3.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c0fb3.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c0fb3.LJIIL) && this.LJIILIIL == c0fb3.LJIILIIL && this.LJIILJJIL == c0fb3.LJIILJJIL && this.LJIILL == c0fb3.LJIILL;
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        AbstractC363520ENa abstractC363520ENa = this.LIZIZ;
        int iHashCode = (i + (abstractC363520ENa == null ? 0 : abstractC363520ENa.hashCode())) * 31;
        C0EO0 c0eo0 = this.LIZJ;
        int iHashCode2 = (iHashCode + (c0eo0 == null ? 0 : c0eo0.hashCode())) * 31;
        Size size = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (size == null ? 0 : size.hashCode())) * 31;
        Size size2 = this.LJ;
        int iHashCode4 = (iHashCode3 + (size2 == null ? 0 : size2.hashCode())) * 31;
        Size size3 = this.LJFF;
        int iHashCode5 = (iHashCode4 + (size3 == null ? 0 : size3.hashCode())) * 31;
        Boolean bool = this.LJI;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.LJII;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.LJIIIIZZ;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.LJIIIZ;
        int iHashCode9 = (iHashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.LJIIJ;
        int iHashCode10 = (iHashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        C375830EoP<Unit> c375830EoP = this.LJIIJJI;
        int iHashCode11 = (iHashCode10 + (c375830EoP == null ? 0 : c375830EoP.hashCode())) * 31;
        C375830EoP<Unit> c375830EoP2 = this.LJIIL;
        return ((((((iHashCode11 + (c375830EoP2 != null ? c375830EoP2.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LJIILIIL)) * 31) + C786410Ut5.Z2(this.LJIILJJIL)) * 31) + C786410Ut5.Z2(this.LJIILL);
    }

    public final String toString() {
        return "MaskAdjustPreviewState(textInputMaskHeight=" + this.LIZ + ", maskData=" + this.LIZIZ + ", videoRect=" + this.LIZJ + ", previewContainerSize=" + this.LIZLLL + ", canvasSize=" + this.LJ + ", originCanvasSize=" + this.LJFF + ", textInputComponentVisible=" + this.LJI + ", currentEditingTextMaskSlotUUID=" + this.LJII + ", showMaskAngle=" + this.LJIIIIZZ + ", enableCenterLine=" + this.LJIIIZ + ", enableAngleHelpLine=" + this.LJIIJ + ", showTextMaskTips=" + this.LJIIJJI + ", textInputTickPerformClick=" + this.LJIIL + ", playTime=" + this.LJIILIIL + ", isPip=" + this.LJIILJJIL + ", enableState=" + this.LJIILL + ')';
    }

    public C0FB3(int i, AbstractC363520ENa abstractC363520ENa, C0EO0 c0eo0, Size size, Size size2, Size size3, Boolean bool, String str, Boolean bool2, Boolean bool3, Boolean bool4, C375830EoP<Unit> c375830EoP, C375830EoP<Unit> c375830EoP2, long j, boolean z, boolean z2) {
        this.LIZ = i;
        this.LIZIZ = abstractC363520ENa;
        this.LIZJ = c0eo0;
        this.LIZLLL = size;
        this.LJ = size2;
        this.LJFF = size3;
        this.LJI = bool;
        this.LJII = str;
        this.LJIIIIZZ = bool2;
        this.LJIIIZ = bool3;
        this.LJIIJ = bool4;
        this.LJIIJJI = c375830EoP;
        this.LJIIL = c375830EoP2;
        this.LJIILIIL = j;
        this.LJIILJJIL = z;
        this.LJIILL = z2;
    }

    public static C0FB3 LIZ(C0FB3 c0fb3, AbstractC363520ENa abstractC363520ENa, C0EO0 c0eo0, Size size, Size size2, Size size3, Boolean bool, String str, Boolean bool2, Boolean bool3, Boolean bool4, C375830EoP c375830EoP, C375830EoP c375830EoP2, long j, boolean z, int i) {
        int i2;
        boolean z2;
        boolean z3 = z;
        long j2 = j;
        C375830EoP c375830EoP3 = c375830EoP2;
        C375830EoP c375830EoP4 = c375830EoP;
        Boolean bool5 = bool4;
        Boolean bool6 = bool3;
        Boolean bool7 = bool2;
        String str2 = str;
        Boolean bool8 = bool;
        Size size4 = size3;
        Size size5 = size2;
        Size size6 = size;
        C0EO0 c0eo02 = c0eo0;
        AbstractC363520ENa abstractC363520ENa2 = abstractC363520ENa;
        if ((i & 1) != 0) {
            i2 = c0fb3.LIZ;
        } else {
            i2 = 0;
        }
        if ((i & 2) != 0) {
            abstractC363520ENa2 = c0fb3.LIZIZ;
        }
        if ((i & 4) != 0) {
            c0eo02 = c0fb3.LIZJ;
        }
        if ((i & 8) != 0) {
            size6 = c0fb3.LIZLLL;
        }
        if ((i & 16) != 0) {
            size5 = c0fb3.LJ;
        }
        if ((i & 32) != 0) {
            size4 = c0fb3.LJFF;
        }
        if ((i & 64) != 0) {
            bool8 = c0fb3.LJI;
        }
        if ((i & 128) != 0) {
            str2 = c0fb3.LJII;
        }
        if ((i & 256) != 0) {
            bool7 = c0fb3.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            bool6 = c0fb3.LJIIIZ;
        }
        if ((i & 1024) != 0) {
            bool5 = c0fb3.LJIIJ;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c375830EoP4 = c0fb3.LJIIJJI;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c375830EoP3 = c0fb3.LJIIL;
        }
        if ((i & 8192) != 0) {
            j2 = c0fb3.LJIILIIL;
        }
        if ((i & 16384) != 0) {
            z2 = c0fb3.LJIILJJIL;
        } else {
            z2 = false;
        }
        if ((i & 32768) != 0) {
            z3 = c0fb3.LJIILL;
        }
        c0fb3.getClass();
        Size size7 = size6;
        return new C0FB3(i2, abstractC363520ENa2, c0eo02, size7, size5, size4, bool8, str2, bool7, bool6, bool5, c375830EoP4, c375830EoP3, j2, z2, z3);
    }
}
