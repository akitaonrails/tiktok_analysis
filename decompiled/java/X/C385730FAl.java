package X;

import android.graphics.Bitmap;
import android.util.Size;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FAl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C385730FAl {
    public final Size LIZ;
    public final Size LIZIZ;
    public final Float LIZJ;
    public final Size LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public final Map<C0ELW, Boolean> LJI;
    public final Map<C0ELW, Boolean> LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;
    public final C0EO0 LJIIL;
    public final C0EO3 LJIILIIL;
    public final C0FBM LJIILJJIL;
    public final boolean LJIILL;
    public final List<C0FBW> LJIILLIIL;
    public final C375830EoP<Unit> LJIIZILJ;
    public final Bitmap LJIJ;
    public final boolean LJIJI;
    public final C375830EoP<Unit> LJIJJ;
    public final boolean LJIJJLI;

    public C385730FAl() {
        this(null, 4194303);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C385730FAl)) {
            return false;
        }
        C385730FAl c385730FAl = (C385730FAl) obj;
        return Intrinsics.LJFF(this.LIZ, c385730FAl.LIZ) && Intrinsics.LJFF(this.LIZIZ, c385730FAl.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c385730FAl.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c385730FAl.LIZLLL) && this.LJ == c385730FAl.LJ && this.LJFF == c385730FAl.LJFF && Intrinsics.LJFF(this.LJI, c385730FAl.LJI) && Intrinsics.LJFF(this.LJII, c385730FAl.LJII) && this.LJIIIIZZ == c385730FAl.LJIIIIZZ && this.LJIIIZ == c385730FAl.LJIIIZ && this.LJIIJ == c385730FAl.LJIIJ && this.LJIIJJI == c385730FAl.LJIIJJI && Intrinsics.LJFF(this.LJIIL, c385730FAl.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c385730FAl.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c385730FAl.LJIILJJIL) && this.LJIILL == c385730FAl.LJIILL && Intrinsics.LJFF(this.LJIILLIIL, c385730FAl.LJIILLIIL) && Intrinsics.LJFF(this.LJIIZILJ, c385730FAl.LJIIZILJ) && Intrinsics.LJFF(this.LJIJ, c385730FAl.LJIJ) && this.LJIJI == c385730FAl.LJIJI && Intrinsics.LJFF(this.LJIJJ, c385730FAl.LJIJJ) && this.LJIJJLI == c385730FAl.LJIJJLI;
    }

    public final int hashCode() {
        Size size = this.LIZ;
        int iHashCode = (size == null ? 0 : size.hashCode()) * 31;
        Size size2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (size2 == null ? 0 : size2.hashCode())) * 31;
        Float f = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Size size3 = this.LIZLLL;
        int iHashCode4 = (((((((((((((((((iHashCode3 + (size3 == null ? 0 : size3.hashCode())) * 31) + this.LJ) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31) + C786410Ut5.Z2(this.LJIIIZ)) * 31) + C786410Ut5.Z2(this.LJIIJ)) * 31) + C786410Ut5.Z2(this.LJIIJJI)) * 31;
        C0EO0 c0eo0 = this.LJIIL;
        int iHashCode5 = (((((((((iHashCode4 + (c0eo0 == null ? 0 : c0eo0.hashCode())) * 31) + this.LJIILIIL.hashCode()) * 31) + this.LJIILJJIL.hashCode()) * 31) + C786410Ut5.Z2(this.LJIILL)) * 31) + this.LJIILLIIL.hashCode()) * 31;
        C375830EoP<Unit> c375830EoP = this.LJIIZILJ;
        int iHashCode6 = (iHashCode5 + (c375830EoP == null ? 0 : c375830EoP.hashCode())) * 31;
        Bitmap bitmap = this.LJIJ;
        int iHashCode7 = (((iHashCode6 + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + C786410Ut5.Z2(this.LJIJI)) * 31;
        C375830EoP<Unit> c375830EoP2 = this.LJIJJ;
        return ((iHashCode7 + (c375830EoP2 != null ? c375830EoP2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIJJLI);
    }

    public final String toString() {
        return "PreviewPanelStates(containerViewSize=" + this.LIZ + ", canvasSize=" + this.LIZIZ + ", canvasRatio=" + this.LIZJ + ", originCanvasSize=" + this.LIZLLL + ", displayTopMargin=" + this.LJ + ", touchEventEnabled=" + this.LJFF + ", materialTouchEventEnabled=" + this.LJI + ", materialDeselectEnabled=" + this.LJII + ", materialRectBorderVisible=" + this.LJIIIIZZ + ", materialAngleVisible=" + this.LJIIIZ + ", canvasEdgeLineVisible=" + this.LJIIJ + ", canvasCenterLineVisible=" + this.LJIIJJI + ", materialRectInfo=" + this.LJIIL + ", centerLineState=" + this.LJIILIIL + ", canvasEdgeLineState=" + this.LJIILJJIL + ", enableOverLayDrawable=" + this.LJIILL + ", customOverlayDrawables=" + this.LJIILLIIL + ", notifyInvalidate=" + this.LJIIZILJ + ", capturedBitmap=" + this.LJIJ + ", capturedBitmapViewVisible=" + this.LJIJI + ", showAutoAdjustEffect=" + this.LJIJJ + ", isContrastEnabled=" + this.LJIJJLI + ')';
    }

    public C385730FAl(Map map, int i) {
        boolean z;
        Map mapLJ;
        C0EO3 c0eo3;
        C0FBM c0fbm;
        boolean z2;
        C13BV c13bv;
        Map mapLJ2 = map;
        if ((i & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 64) != 0) {
            mapLJ = C2097608Jq.LJ();
        } else {
            mapLJ = null;
        }
        mapLJ2 = (i & 128) != 0 ? C2097608Jq.LJ() : mapLJ2;
        if ((i & 8192) != 0) {
            c0eo3 = new C0EO3(false, false);
        } else {
            c0eo3 = null;
        }
        if ((i & 16384) != 0) {
            c0fbm = new C0FBM(false, false, false, false);
        } else {
            c0fbm = null;
        }
        if ((32768 & i) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 65536) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        this(null, null, null, null, 0, z, mapLJ, mapLJ2, false, false, false, false, null, c0eo3, c0fbm, z2, c13bv, null, null, false, null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C385730FAl(Size size, Size size2, Float f, Size size3, int i, boolean z, Map<C0ELW, Boolean> map, Map<C0ELW, Boolean> map2, boolean z2, boolean z3, boolean z4, boolean z5, C0EO0 c0eo0, C0EO3 c0eo3, C0FBM c0fbm, boolean z6, List<? extends C0FBW> list, C375830EoP<Unit> c375830EoP, Bitmap bitmap, boolean z7, C375830EoP<Unit> c375830EoP2, boolean z8) {
        this.LIZ = size;
        this.LIZIZ = size2;
        this.LIZJ = f;
        this.LIZLLL = size3;
        this.LJ = i;
        this.LJFF = z;
        this.LJI = map;
        this.LJII = map2;
        this.LJIIIIZZ = z2;
        this.LJIIIZ = z3;
        this.LJIIJ = z4;
        this.LJIIJJI = z5;
        this.LJIIL = c0eo0;
        this.LJIILIIL = c0eo3;
        this.LJIILJJIL = c0fbm;
        this.LJIILL = z6;
        this.LJIILLIIL = list;
        this.LJIIZILJ = c375830EoP;
        this.LJIJ = bitmap;
        this.LJIJI = z7;
        this.LJIJJ = c375830EoP2;
        this.LJIJJLI = z8;
    }

    public static C385730FAl LIZ(C385730FAl c385730FAl, Size size, Size size2, Float f, Size size3, int i, boolean z, Map map, Map map2, boolean z2, boolean z3, boolean z4, boolean z5, C0EO0 c0eo0, C0EO3 c0eo3, C0FBM c0fbm, boolean z6, List list, C375830EoP c375830EoP, Bitmap bitmap, boolean z7, C375830EoP c375830EoP2, boolean z8, int i2) {
        boolean z9 = z8;
        Bitmap bitmap2 = bitmap;
        C375830EoP c375830EoP3 = c375830EoP2;
        C375830EoP c375830EoP4 = c375830EoP;
        List list2 = list;
        C0EO0 c0eo02 = c0eo0;
        boolean z10 = z4;
        boolean z11 = z6;
        boolean z12 = z5;
        boolean z13 = z3;
        boolean z14 = z2;
        Map map3 = map;
        C0FBM c0fbm2 = c0fbm;
        Map map4 = map2;
        boolean z15 = z;
        boolean z16 = z7;
        Size size4 = size3;
        C0EO3 c0eo32 = c0eo3;
        int i3 = i;
        Float f2 = f;
        Size size5 = size2;
        Size size6 = size;
        if ((i2 & 1) != 0) {
            size6 = c385730FAl.LIZ;
        }
        if ((i2 & 2) != 0) {
            size5 = c385730FAl.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            f2 = c385730FAl.LIZJ;
        }
        if ((i2 & 8) != 0) {
            size4 = c385730FAl.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            i3 = c385730FAl.LJ;
        }
        if ((i2 & 32) != 0) {
            z15 = c385730FAl.LJFF;
        }
        if ((i2 & 64) != 0) {
            map3 = c385730FAl.LJI;
        }
        if ((i2 & 128) != 0) {
            map4 = c385730FAl.LJII;
        }
        if ((i2 & 256) != 0) {
            z14 = c385730FAl.LJIIIIZZ;
        }
        if ((i2 & 512) != 0) {
            z13 = c385730FAl.LJIIIZ;
        }
        if ((i2 & 1024) != 0) {
            z10 = c385730FAl.LJIIJ;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z12 = c385730FAl.LJIIJJI;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c0eo02 = c385730FAl.LJIIL;
        }
        if ((i2 & 8192) != 0) {
            c0eo32 = c385730FAl.LJIILIIL;
        }
        if ((i2 & 16384) != 0) {
            c0fbm2 = c385730FAl.LJIILJJIL;
        }
        if ((32768 & i2) != 0) {
            z11 = c385730FAl.LJIILL;
        }
        if ((65536 & i2) != 0) {
            list2 = c385730FAl.LJIILLIIL;
        }
        if ((131072 & i2) != 0) {
            c375830EoP4 = c385730FAl.LJIIZILJ;
        }
        if ((262144 & i2) != 0) {
            bitmap2 = c385730FAl.LJIJ;
        }
        if ((524288 & i2) != 0) {
            z16 = c385730FAl.LJIJI;
        }
        if ((1048576 & i2) != 0) {
            c375830EoP3 = c385730FAl.LJIJJ;
        }
        if ((i2 & 2097152) != 0) {
            z9 = c385730FAl.LJIJJLI;
        }
        c385730FAl.getClass();
        boolean z17 = z15;
        Map map5 = map3;
        Map map6 = map4;
        boolean z18 = z14;
        return new C385730FAl(size6, size5, f2, size4, i3, z17, map5, map6, z18, z13, z10, z12, c0eo02, c0eo32, c0fbm2, z11, list2, c375830EoP4, bitmap2, z16, c375830EoP3, z9);
    }
}
