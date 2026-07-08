package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EJ5, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EJ5 {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final C375830EoP<Boolean> LIZJ;
    public final C375830EoP<Unit> LIZLLL;
    public final C375830EoP<Unit> LJ;
    public final C361980EHc LJFF;
    public final C361980EHc LJI;
    public final List<C361980EHc> LJII;
    public final C0EHY LJIIIIZZ;
    public final C375830EoP<C1G0U> LJIIIZ;
    public final C375830EoP<C362060EHk> LJIIJ;
    public final C375830EoP<C361980EHc> LJIIJJI;
    public final C375830EoP<C361980EHc> LJIIL;
    public final C362070EHl LJIILIIL;

    public C0EJ5() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0EJ5)) {
            return false;
        }
        C0EJ5 c0ej5 = (C0EJ5) obj;
        return this.LIZ == c0ej5.LIZ && this.LIZIZ == c0ej5.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0ej5.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0ej5.LIZLLL) && Intrinsics.LJFF(this.LJ, c0ej5.LJ) && Intrinsics.LJFF(this.LJFF, c0ej5.LJFF) && Intrinsics.LJFF(this.LJI, c0ej5.LJI) && Intrinsics.LJFF(this.LJII, c0ej5.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c0ej5.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c0ej5.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c0ej5.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c0ej5.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c0ej5.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c0ej5.LJIILIIL);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        C375830EoP<Boolean> c375830EoP = this.LIZJ;
        int iHashCode = (iZ2 + (c375830EoP == null ? 0 : c375830EoP.hashCode())) * 31;
        C375830EoP<Unit> c375830EoP2 = this.LIZLLL;
        int iHashCode2 = (iHashCode + (c375830EoP2 == null ? 0 : c375830EoP2.hashCode())) * 31;
        C375830EoP<Unit> c375830EoP3 = this.LJ;
        int iHashCode3 = (iHashCode2 + (c375830EoP3 == null ? 0 : c375830EoP3.hashCode())) * 31;
        C361980EHc c361980EHc = this.LJFF;
        int iHashCode4 = (iHashCode3 + (c361980EHc == null ? 0 : c361980EHc.hashCode())) * 31;
        C361980EHc c361980EHc2 = this.LJI;
        int iHashCode5 = (iHashCode4 + (c361980EHc2 == null ? 0 : c361980EHc2.hashCode())) * 31;
        List<C361980EHc> list = this.LJII;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        C0EHY c0ehy = this.LJIIIIZZ;
        int iHashCode7 = (iHashCode6 + (c0ehy == null ? 0 : c0ehy.hashCode())) * 31;
        C375830EoP<C1G0U> c375830EoP4 = this.LJIIIZ;
        int iHashCode8 = (iHashCode7 + (c375830EoP4 == null ? 0 : c375830EoP4.hashCode())) * 31;
        C375830EoP<C362060EHk> c375830EoP5 = this.LJIIJ;
        int iHashCode9 = (iHashCode8 + (c375830EoP5 == null ? 0 : c375830EoP5.hashCode())) * 31;
        C375830EoP<C361980EHc> c375830EoP6 = this.LJIIJJI;
        int iHashCode10 = (iHashCode9 + (c375830EoP6 == null ? 0 : c375830EoP6.hashCode())) * 31;
        C375830EoP<C361980EHc> c375830EoP7 = this.LJIIL;
        int iHashCode11 = (iHashCode10 + (c375830EoP7 == null ? 0 : c375830EoP7.hashCode())) * 31;
        C362070EHl c362070EHl = this.LJIILIIL;
        return iHashCode11 + (c362070EHl != null ? c362070EHl.hashCode() : 0);
    }

    public final String toString() {
        return "BottomBarStates(clickable=" + this.LIZ + ", needShowCutoutMenu=" + this.LIZIZ + ", backToRootEvent=" + this.LIZJ + ", backIconClickEvent=" + this.LIZLLL + ", refreshOnSort=" + this.LJ + ", currentItemState=" + this.LJFF + ", lastItemState=" + this.LJI + ", subFunctionList=" + this.LJII + ", rootFuncListState=" + this.LJIIIIZZ + ", insertItemEvent=" + this.LJIIIZ + ", replaceItemEvent=" + this.LJIIJ + ", removeItemEvent=" + this.LJIIJJI + ", updateItemEvent=" + this.LJIIL + ", showChildListState=" + this.LJIILIIL + ')';
    }

    public /* synthetic */ C0EJ5(int i) {
        this(true, false, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public static C0EJ5 LIZ(C0EJ5 c0ej5, boolean z, C375830EoP c375830EoP, C375830EoP c375830EoP2, C361980EHc c361980EHc, C361980EHc c361980EHc2, C0EHY c0ehy, C375830EoP c375830EoP3, C375830EoP c375830EoP4, C375830EoP c375830EoP5, C362070EHl c362070EHl, int i) {
        boolean z2;
        C375830EoP<Unit> c375830EoP6;
        List<C361980EHc> list;
        C362070EHl c362070EHl2 = c362070EHl;
        C375830EoP c375830EoP7 = c375830EoP5;
        C375830EoP c375830EoP8 = c375830EoP4;
        C0EHY c0ehy2 = c0ehy;
        C361980EHc c361980EHc3 = c361980EHc2;
        C375830EoP c375830EoP9 = c375830EoP3;
        C375830EoP c375830EoP10 = c375830EoP2;
        C361980EHc c361980EHc4 = c361980EHc;
        C375830EoP c375830EoP11 = c375830EoP;
        boolean z3 = z;
        if ((i & 1) != 0) {
            z3 = c0ej5.LIZ;
        }
        if ((i & 2) != 0) {
            z2 = c0ej5.LIZIZ;
        } else {
            z2 = false;
        }
        if ((i & 4) != 0) {
            c375830EoP11 = c0ej5.LIZJ;
        }
        if ((i & 8) != 0) {
            c375830EoP10 = c0ej5.LIZLLL;
        }
        C375830EoP<C1G0U> c375830EoP12 = null;
        if ((i & 16) != 0) {
            c375830EoP6 = c0ej5.LJ;
        } else {
            c375830EoP6 = null;
        }
        if ((i & 32) != 0) {
            c361980EHc4 = c0ej5.LJFF;
        }
        if ((i & 64) != 0) {
            c361980EHc3 = c0ej5.LJI;
        }
        if ((i & 128) != 0) {
            list = c0ej5.LJII;
        } else {
            list = null;
        }
        if ((i & 256) != 0) {
            c0ehy2 = c0ej5.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            c375830EoP12 = c0ej5.LJIIIZ;
        }
        if ((i & 1024) != 0) {
            c375830EoP9 = c0ej5.LJIIJ;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c375830EoP8 = c0ej5.LJIIJJI;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c375830EoP7 = c0ej5.LJIIL;
        }
        if ((i & 8192) != 0) {
            c362070EHl2 = c0ej5.LJIILIIL;
        }
        c0ej5.getClass();
        return new C0EJ5(z3, z2, c375830EoP11, c375830EoP10, c375830EoP6, c361980EHc4, c361980EHc3, list, c0ehy2, c375830EoP12, c375830EoP9, c375830EoP8, c375830EoP7, c362070EHl2);
    }

    public C0EJ5(boolean z, boolean z2, C375830EoP<Boolean> c375830EoP, C375830EoP<Unit> c375830EoP2, C375830EoP<Unit> c375830EoP3, C361980EHc c361980EHc, C361980EHc c361980EHc2, List<C361980EHc> list, C0EHY c0ehy, C375830EoP<C1G0U> c375830EoP4, C375830EoP<C362060EHk> c375830EoP5, C375830EoP<C361980EHc> c375830EoP6, C375830EoP<C361980EHc> c375830EoP7, C362070EHl c362070EHl) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = c375830EoP;
        this.LIZLLL = c375830EoP2;
        this.LJ = c375830EoP3;
        this.LJFF = c361980EHc;
        this.LJI = c361980EHc2;
        this.LJII = list;
        this.LJIIIIZZ = c0ehy;
        this.LJIIIZ = c375830EoP4;
        this.LJIIJ = c375830EoP5;
        this.LJIIJJI = c375830EoP6;
        this.LJIIL = c375830EoP7;
        this.LJIILIIL = c362070EHl;
    }
}
