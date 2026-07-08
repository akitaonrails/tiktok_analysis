package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0PHa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C642240PHa {
    public boolean LIZ;
    public boolean LIZIZ;
    public final int LIZJ;
    public int LIZLLL;
    public final Function2<? super String, ? super List<String>, ? extends List<String>> LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public final boolean LJIIJJI;
    public C0PJP LJIIL;
    public C0PIA LJIILIIL;

    /* JADX WARN: Multi-variable type inference failed */
    public C642240PHa() {
        this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 16383);
    }

    public static C642240PHa LIZ(C642240PHa c642240PHa) {
        boolean z = c642240PHa.LIZ;
        boolean z2 = c642240PHa.LIZIZ;
        int i = c642240PHa.LIZJ;
        int i2 = c642240PHa.LIZLLL;
        Function2<? super String, ? super List<String>, ? extends List<String>> function2 = c642240PHa.LJ;
        boolean z3 = c642240PHa.LJFF;
        boolean z4 = c642240PHa.LJI;
        boolean z5 = c642240PHa.LJII;
        boolean z6 = c642240PHa.LJIIIIZZ;
        boolean z7 = c642240PHa.LJIIIZ;
        boolean z8 = c642240PHa.LJIIJ;
        boolean z9 = c642240PHa.LJIIJJI;
        C0PJP c0pjp = c642240PHa.LJIIL;
        C0PIA c0pia = c642240PHa.LJIILIIL;
        c642240PHa.getClass();
        return new C642240PHa(z, z2, i, i2, function2, z3, z4, z5, z6, z7, z8, z9, c0pjp, c0pia);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C642240PHa(boolean z, boolean z2, int i, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, C0PJP c0pjp, C0PK1 c0pk1, int i2) {
        int iLIZ;
        C0PK1 c0pk12 = c0pk1;
        C0PJP c0pjp2 = c0pjp;
        boolean z10 = z9;
        boolean z11 = z8;
        boolean z12 = z7;
        boolean z13 = z6;
        boolean z14 = z5;
        boolean z15 = z4;
        boolean z16 = z3;
        int i3 = i;
        boolean z17 = z2;
        boolean z18 = (i2 & 1) != 0 ? true : z;
        z17 = (i2 & 2) != 0 ? false : z17;
        if ((i2 & 4) != 0) {
            iLIZ = C07IQ.LIZ();
        } else {
            iLIZ = 0;
        }
        this(z18, z17, iLIZ, (i2 & 8) != 0 ? 1 : i3, null, (i2 & 32) != 0 ? false : z16, (i2 & 64) != 0 ? false : z15, (i2 & 128) != 0 ? true : z14, (i2 & 256) != 0 ? true : z13, (i2 & 512) != 0 ? true : z12, (i2 & 1024) != 0 ? false : z11, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z10, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : c0pjp2, (i2 & 8192) != 0 ? null : c0pk12);
    }

    public C642240PHa(boolean z, boolean z2, int i, int i2, Function2<? super String, ? super List<String>, ? extends List<String>> function2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, C0PJP c0pjp, C0PIA c0pia) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = function2;
        this.LJFF = z3;
        this.LJI = z4;
        this.LJII = z5;
        this.LJIIIIZZ = z6;
        this.LJIIIZ = z7;
        this.LJIIJ = z8;
        this.LJIIJJI = z9;
        this.LJIIL = c0pjp;
        this.LJIILIIL = c0pia;
    }
}
