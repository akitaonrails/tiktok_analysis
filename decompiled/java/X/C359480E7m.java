package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E7m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C359480E7m {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;
    public final boolean LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;
    public final Float LJIILL;
    public final boolean LJIILLIIL;
    public final boolean LJIIZILJ;
    public final boolean LJIJ;
    public final boolean LJIJI;
    public final boolean LJIJJ;
    public final boolean LJIJJLI;

    public C359480E7m() {
        this(false, 4194303);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C359480E7m)) {
            return false;
        }
        C359480E7m c359480E7m = (C359480E7m) obj;
        return this.LIZ == c359480E7m.LIZ && this.LIZIZ == c359480E7m.LIZIZ && this.LIZJ == c359480E7m.LIZJ && this.LIZLLL == c359480E7m.LIZLLL && this.LJ == c359480E7m.LJ && this.LJFF == c359480E7m.LJFF && this.LJI == c359480E7m.LJI && this.LJII == c359480E7m.LJII && this.LJIIIIZZ == c359480E7m.LJIIIIZZ && this.LJIIIZ == c359480E7m.LJIIIZ && this.LJIIJ == c359480E7m.LJIIJ && this.LJIIJJI == c359480E7m.LJIIJJI && this.LJIIL == c359480E7m.LJIIL && this.LJIILIIL == c359480E7m.LJIILIIL && this.LJIILJJIL == c359480E7m.LJIILJJIL && Intrinsics.LJFF(this.LJIILL, c359480E7m.LJIILL) && this.LJIILLIIL == c359480E7m.LJIILLIIL && this.LJIIZILJ == c359480E7m.LJIIZILJ && this.LJIJ == c359480E7m.LJIJ && this.LJIJI == c359480E7m.LJIJI && this.LJIJJ == c359480E7m.LJIJJ && this.LJIJJLI == c359480E7m.LJIJJLI;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C359480E7m(boolean z, int i) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18 = z;
        if ((i & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i & 4) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((i & 8) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if ((i & 16) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if ((i & 32) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if ((i & 64) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        z18 = (i & 128) != 0 ? true : z18;
        if ((i & 256) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if ((i & 512) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i & 1024) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if ((i & 8192) != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        if ((262144 & i) != 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        if ((524288 & i) != 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        if ((i & 2097152) != 0) {
            z17 = true;
        } else {
            z17 = false;
        }
        this(z2, z3, z4, z5, z6, z7, z8, z18, z9, z10, z11, z12, z13, z14, false, null, false, false, z15, z16, false, z17);
    }

    public C359480E7m(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Float f, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = z4;
        this.LJ = z5;
        this.LJFF = z6;
        this.LJI = z7;
        this.LJII = z8;
        this.LJIIIIZZ = z9;
        this.LJIIIZ = z10;
        this.LJIIJ = z11;
        this.LJIIJJI = z12;
        this.LJIIL = z13;
        this.LJIILIIL = z14;
        this.LJIILJJIL = z15;
        this.LJIILL = f;
        this.LJIILLIIL = z16;
        this.LJIIZILJ = z17;
        this.LJIJ = z18;
        this.LJIJI = z19;
        this.LJIJJ = z20;
        this.LJIJJLI = z21;
    }

    public static C359480E7m LIZ(C359480E7m c359480E7m, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, Float f, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, int i) {
        boolean z21;
        boolean z22 = z20;
        boolean z23 = z19;
        boolean z24 = z17;
        boolean z25 = z16;
        boolean z26 = z15;
        boolean z27 = z12;
        Float f2 = f;
        boolean z28 = z11;
        boolean z29 = z10;
        boolean z30 = z9;
        boolean z31 = z8;
        boolean z32 = z14;
        boolean z33 = z7;
        boolean z34 = z6;
        boolean z35 = z5;
        boolean z36 = z18;
        boolean z37 = z13;
        boolean z38 = z4;
        boolean z39 = z3;
        boolean z40 = z2;
        boolean z41 = z;
        if ((i & 1) != 0) {
            z41 = c359480E7m.LIZ;
        }
        if ((i & 2) != 0) {
            z40 = c359480E7m.LIZIZ;
        }
        if ((i & 4) != 0) {
            z39 = c359480E7m.LIZJ;
        }
        if ((i & 8) != 0) {
            z38 = c359480E7m.LIZLLL;
        }
        if ((i & 16) != 0) {
            z35 = c359480E7m.LJ;
        }
        if ((i & 32) != 0) {
            z34 = c359480E7m.LJFF;
        }
        if ((i & 64) != 0) {
            z33 = c359480E7m.LJI;
        }
        if ((i & 128) != 0) {
            z21 = c359480E7m.LJII;
        } else {
            z21 = false;
        }
        if ((i & 256) != 0) {
            z31 = c359480E7m.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            z30 = c359480E7m.LJIIIZ;
        }
        if ((i & 1024) != 0) {
            z29 = c359480E7m.LJIIJ;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z28 = c359480E7m.LJIIJJI;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z27 = c359480E7m.LJIIL;
        }
        if ((i & 8192) != 0) {
            z37 = c359480E7m.LJIILIIL;
        }
        if ((i & 16384) != 0) {
            z32 = c359480E7m.LJIILJJIL;
        }
        if ((32768 & i) != 0) {
            f2 = c359480E7m.LJIILL;
        }
        if ((65536 & i) != 0) {
            z26 = c359480E7m.LJIILLIIL;
        }
        if ((131072 & i) != 0) {
            z25 = c359480E7m.LJIIZILJ;
        }
        if ((262144 & i) != 0) {
            z24 = c359480E7m.LJIJ;
        }
        if ((524288 & i) != 0) {
            z36 = c359480E7m.LJIJI;
        }
        if ((1048576 & i) != 0) {
            z23 = c359480E7m.LJIJJ;
        }
        if ((i & 2097152) != 0) {
            z22 = c359480E7m.LJIJJLI;
        }
        c359480E7m.getClass();
        boolean z42 = z23;
        boolean z43 = z22;
        boolean z44 = z34;
        boolean z45 = z29;
        boolean z46 = z28;
        boolean z47 = z27;
        return new C359480E7m(z41, z40, z39, z38, z35, z44, z33, z21, z31, z30, z45, z46, z47, z37, z32, f2, z26, z25, z24, z36, z42, z43);
    }
}
