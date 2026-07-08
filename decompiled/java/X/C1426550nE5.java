package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0nE5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1426550nE5 {
    public final C113G LIZ;
    public final Boolean LIZIZ;
    public final int LIZJ;
    public final EnumC1426980nEm LIZLLL;
    public final List<C1427080nEw> LJ;
    public final int LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final C375830EoP<String> LJIIJJI;
    public final C375830EoP<Unit> LJIIL;
    public final C375830EoP<Unit> LJIILIIL;

    public C1426550nE5(C113G c113g, Boolean bool, int i, EnumC1426980nEm enumC1426980nEm, List<C1427080nEw> list, int i2, boolean z, boolean z2, String str, String str2, String str3, C375830EoP<String> c375830EoP, C375830EoP<Unit> c375830EoP2, C375830EoP<Unit> c375830EoP3) {
        this.LIZ = c113g;
        this.LIZIZ = bool;
        this.LIZJ = i;
        this.LIZLLL = enumC1426980nEm;
        this.LJ = list;
        this.LJFF = i2;
        this.LJI = z;
        this.LJII = z2;
        this.LJIIIIZZ = str;
        this.LJIIIZ = str2;
        this.LJIIJ = str3;
        this.LJIIJJI = c375830EoP;
        this.LJIIL = c375830EoP2;
        this.LJIILIIL = c375830EoP3;
    }

    public static C1426550nE5 LIZ(C1426550nE5 c1426550nE5, Boolean bool, EnumC1426980nEm enumC1426980nEm, List list, int i, boolean z, boolean z2, String str, String str2, String str3, C375830EoP c375830EoP, C375830EoP c375830EoP2, C375830EoP c375830EoP3, int i2) {
        C113G c113g;
        int i3;
        C375830EoP c375830EoP4 = c375830EoP3;
        C375830EoP c375830EoP5 = c375830EoP;
        String str4 = str3;
        String str5 = str2;
        String str6 = str;
        boolean z3 = z2;
        int i4 = i;
        List list2 = list;
        EnumC1426980nEm enumC1426980nEm2 = enumC1426980nEm;
        boolean z4 = z;
        C375830EoP c375830EoP6 = c375830EoP2;
        Boolean bool2 = bool;
        if ((i2 & 1) != 0) {
            c113g = c1426550nE5.LIZ;
        } else {
            c113g = null;
        }
        if ((i2 & 2) != 0) {
            bool2 = c1426550nE5.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            i3 = c1426550nE5.LIZJ;
        } else {
            i3 = 0;
        }
        if ((i2 & 8) != 0) {
            enumC1426980nEm2 = c1426550nE5.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            list2 = c1426550nE5.LJ;
        }
        if ((i2 & 32) != 0) {
            i4 = c1426550nE5.LJFF;
        }
        if ((i2 & 64) != 0) {
            z4 = c1426550nE5.LJI;
        }
        if ((i2 & 128) != 0) {
            z3 = c1426550nE5.LJII;
        }
        if ((i2 & 256) != 0) {
            str6 = c1426550nE5.LJIIIIZZ;
        }
        if ((i2 & 512) != 0) {
            str5 = c1426550nE5.LJIIIZ;
        }
        if ((i2 & 1024) != 0) {
            str4 = c1426550nE5.LJIIJ;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c375830EoP5 = c1426550nE5.LJIIJJI;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c375830EoP6 = c1426550nE5.LJIIL;
        }
        if ((i2 & 8192) != 0) {
            c375830EoP4 = c1426550nE5.LJIILIIL;
        }
        c1426550nE5.getClass();
        return new C1426550nE5(c113g, bool2, i3, enumC1426980nEm2, list2, i4, z4, z3, str6, str5, str4, c375830EoP5, c375830EoP6, c375830EoP4);
    }
}
