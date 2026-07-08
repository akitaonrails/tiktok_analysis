package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0FFO, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FFO {
    public final EnumC1466150oFx LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final List<Integer> LJIIIIZZ;
    public final boolean LJIIIZ;
    public final String LJIIJ;
    public final Pair<Float, Float> LJIIJJI;
    public final boolean LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;
    public final boolean LJIILL;
    public final boolean LJIILLIIL;
    public final boolean LJIIZILJ;
    public final InterfaceC386720FEg LJIJ;
    public final boolean LJIJI;
    public final boolean LJIJJ;

    public static C0FFO LIZ(C0FFO c0ffo, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Pair pair, boolean z7, boolean z8, int i) {
        EnumC1466150oFx enumC1466150oFx;
        int i2;
        List<Integer> list;
        boolean z9;
        String str;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16 = z7;
        Pair pair2 = pair;
        boolean z17 = z6;
        boolean z18 = z5;
        boolean z19 = z4;
        boolean z20 = z3;
        boolean z21 = z2;
        boolean z22 = z8;
        boolean z23 = z;
        InterfaceC386720FEg interfaceC386720FEg = null;
        if ((i & 1) != 0) {
            enumC1466150oFx = c0ffo.LIZ;
        } else {
            enumC1466150oFx = null;
        }
        if ((i & 2) != 0) {
            i2 = c0ffo.LIZIZ;
        } else {
            i2 = 0;
        }
        if ((i & 4) != 0) {
            z23 = c0ffo.LIZJ;
        }
        if ((i & 8) != 0) {
            z21 = c0ffo.LIZLLL;
        }
        if ((i & 16) != 0) {
            z20 = c0ffo.LJ;
        }
        if ((i & 32) != 0) {
            z19 = c0ffo.LJFF;
        }
        if ((i & 64) != 0) {
            z18 = c0ffo.LJI;
        }
        if ((i & 128) != 0) {
            z17 = c0ffo.LJII;
        }
        if ((i & 256) != 0) {
            list = c0ffo.LJIIIIZZ;
        } else {
            list = null;
        }
        if ((i & 512) != 0) {
            z9 = c0ffo.LJIIIZ;
        } else {
            z9 = false;
        }
        if ((i & 1024) != 0) {
            str = c0ffo.LJIIJ;
        } else {
            str = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            pair2 = c0ffo.LJIIJJI;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z16 = c0ffo.LJIIL;
        }
        if ((i & 8192) != 0) {
            z10 = c0ffo.LJIILIIL;
        } else {
            z10 = false;
        }
        if ((i & 16384) != 0) {
            z11 = c0ffo.LJIILJJIL;
        } else {
            z11 = false;
        }
        if ((32768 & i) != 0) {
            z12 = c0ffo.LJIILL;
        } else {
            z12 = false;
        }
        if ((65536 & i) != 0) {
            z22 = c0ffo.LJIILLIIL;
        }
        if ((131072 & i) != 0) {
            z13 = c0ffo.LJIIZILJ;
        } else {
            z13 = false;
        }
        if ((262144 & i) != 0) {
            interfaceC386720FEg = c0ffo.LJIJ;
        }
        if ((524288 & i) != 0) {
            z14 = c0ffo.LJIJI;
        } else {
            z14 = false;
        }
        if ((i & 1048576) != 0) {
            z15 = c0ffo.LJIJJ;
        } else {
            z15 = false;
        }
        c0ffo.getClass();
        return new C0FFO(enumC1466150oFx, i2, z23, z21, z20, z19, z18, z17, list, z9, str, pair2, z16, z10, z11, z12, z22, z13, interfaceC386720FEg, z14, z15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0FFO(EnumC1466150oFx enumC1466150oFx, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List list, Pair pair, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, InterfaceC386720FEg interfaceC386720FEg, int i2) {
        boolean z12;
        String str;
        boolean z13;
        boolean z14 = z11;
        boolean z15 = z10;
        boolean z16 = z9;
        boolean z17 = z8;
        boolean z18 = z6;
        boolean z19 = z7;
        Pair pair2 = pair;
        boolean z20 = z5;
        boolean z21 = z4;
        boolean z22 = z3;
        boolean z23 = z;
        int i3 = i;
        boolean z24 = z2;
        List arrayList = list;
        EnumC1466150oFx enumC1466150oFx2 = (i2 & 1) != 0 ? EnumC1466150oFx.NONE : enumC1466150oFx;
        i3 = (i2 & 2) != 0 ? -1 : i3;
        z23 = (i2 & 4) != 0 ? true : z23;
        z24 = (i2 & 8) != 0 ? true : z24;
        z22 = (i2 & 16) != 0 ? true : z22;
        z21 = (i2 & 32) != 0 ? true : z21;
        z20 = (i2 & 64) != 0 ? false : z20;
        if ((i2 & 128) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        arrayList = (i2 & 256) != 0 ? new ArrayList() : arrayList;
        if ((i2 & 1024) != 0) {
            str = "";
        } else {
            str = null;
        }
        pair2 = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? new Pair(Float.valueOf(-1.0f), Float.valueOf(-1.0f)) : pair2;
        z18 = (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? true : z18;
        z19 = (i2 & 8192) != 0 ? false : z19;
        z17 = (i2 & 16384) != 0 ? false : z17;
        z16 = (32768 & i2) != 0 ? true : z16;
        z15 = (65536 & i2) != 0 ? false : z15;
        z14 = (131072 & i2) != 0 ? false : z14;
        if ((i2 & 524288) != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        this(enumC1466150oFx2, i3, z23, z24, z22, z21, z20, z12, arrayList, false, str, pair2, z18, z19, z17, z16, z15, z14, interfaceC386720FEg, z13, false);
    }

    public C0FFO(EnumC1466150oFx enumC1466150oFx, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, List<Integer> list, boolean z7, String str, Pair<Float, Float> pair, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, InterfaceC386720FEg interfaceC386720FEg, boolean z14, boolean z15) {
        this.LIZ = enumC1466150oFx;
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = z4;
        this.LJI = z5;
        this.LJII = z6;
        this.LJIIIIZZ = list;
        this.LJIIIZ = z7;
        this.LJIIJ = str;
        this.LJIIJJI = pair;
        this.LJIIL = z8;
        this.LJIILIIL = z9;
        this.LJIILJJIL = z10;
        this.LJIILL = z11;
        this.LJIILLIIL = z12;
        this.LJIIZILJ = z13;
        this.LJIJ = interfaceC386720FEg;
        this.LJIJI = z14;
        this.LJIJJ = z15;
    }
}
