package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0tMe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1662500tMe {
    public final EnumC1662690tMx LIZ;
    public C0HWO LIZIZ;
    public C0HWO LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final C375830EoP<Boolean> LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final C375830EoP<Unit> LJIIJJI;
    public final C1662520tMg LJIIL;
    public final boolean LJIILIIL;
    public final Boolean LJIILJJIL;

    public /* synthetic */ C1662500tMe(EnumC1662690tMx enumC1662690tMx, boolean z, boolean z2, C375830EoP c375830EoP, boolean z3, boolean z4, boolean z5, boolean z6) {
        this(enumC1662690tMx, null, null, z, z2, true, c375830EoP, z3, z4, z5, z6, null, null, false, null);
    }

    public C1662500tMe(EnumC1662690tMx enumC1662690tMx, C0HWO c0hwo, C0HWO c0hwo2, boolean z, boolean z2, boolean z3, C375830EoP<Boolean> c375830EoP, boolean z4, boolean z5, boolean z6, boolean z7, C375830EoP<Unit> c375830EoP2, C1662520tMg c1662520tMg, boolean z8, Boolean bool) {
        this.LIZ = enumC1662690tMx;
        this.LIZIZ = c0hwo;
        this.LIZJ = c0hwo2;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = z3;
        this.LJI = c375830EoP;
        this.LJII = z4;
        this.LJIIIIZZ = z5;
        this.LJIIIZ = z6;
        this.LJIIJ = z7;
        this.LJIIJJI = c375830EoP2;
        this.LJIIL = c1662520tMg;
        this.LJIILIIL = z8;
        this.LJIILJJIL = bool;
    }

    public static C1662500tMe LIZ(C1662500tMe c1662500tMe, EnumC1662690tMx enumC1662690tMx, C0HWO c0hwo, C0HWO c0hwo2, boolean z, boolean z2, C375830EoP c375830EoP, boolean z3, boolean z4, boolean z5, boolean z6, C375830EoP c375830EoP2, C1662520tMg c1662520tMg, boolean z7, Boolean bool, int i) {
        boolean z8;
        Boolean bool2 = bool;
        boolean z9 = z7;
        C1662520tMg c1662520tMg2 = c1662520tMg;
        C375830EoP c375830EoP3 = c375830EoP2;
        boolean z10 = z6;
        boolean z11 = z5;
        boolean z12 = z4;
        boolean z13 = z3;
        C375830EoP c375830EoP4 = c375830EoP;
        boolean z14 = z2;
        boolean z15 = z;
        C0HWO c0hwo3 = c0hwo2;
        C0HWO c0hwo4 = c0hwo;
        EnumC1662690tMx enumC1662690tMx2 = enumC1662690tMx;
        if ((i & 1) != 0) {
            enumC1662690tMx2 = c1662500tMe.LIZ;
        }
        if ((i & 2) != 0) {
            c0hwo4 = c1662500tMe.LIZIZ;
        }
        if ((i & 4) != 0) {
            c0hwo3 = c1662500tMe.LIZJ;
        }
        if ((i & 8) != 0) {
            z8 = c1662500tMe.LIZLLL;
        } else {
            z8 = false;
        }
        if ((i & 16) != 0) {
            z15 = c1662500tMe.LJ;
        }
        if ((i & 32) != 0) {
            z14 = c1662500tMe.LJFF;
        }
        if ((i & 64) != 0) {
            c375830EoP4 = c1662500tMe.LJI;
        }
        if ((i & 128) != 0) {
            z13 = c1662500tMe.LJII;
        }
        if ((i & 256) != 0) {
            z12 = c1662500tMe.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            z11 = c1662500tMe.LJIIIZ;
        }
        if ((i & 1024) != 0) {
            z10 = c1662500tMe.LJIIJ;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c375830EoP3 = c1662500tMe.LJIIJJI;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c1662520tMg2 = c1662500tMe.LJIIL;
        }
        if ((i & 8192) != 0) {
            z9 = c1662500tMe.LJIILIIL;
        }
        if ((i & 16384) != 0) {
            bool2 = c1662500tMe.LJIILJJIL;
        }
        c1662500tMe.getClass();
        return new C1662500tMe(enumC1662690tMx2, c0hwo4, c0hwo3, z8, z15, z14, c375830EoP4, z13, z12, z11, z10, c375830EoP3, c1662520tMg2, z9, bool2);
    }
}
