package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0n1N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1418670n1N {
    public final List<AutoCutThemeData> LIZ;
    public final C375830EoP<Integer> LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final Pair<Boolean, Function0<Unit>> LJII;
    public final C375830EoP<Boolean> LJIIIIZZ;
    public final C375830EoP<Boolean> LJIIIZ;
    public final C375830EoP<Boolean> LJIIJ;
    public final Integer LJIIJJI;
    public final C375830EoP<Boolean> LJIIL;
    public final C375830EoP<Pair<Integer, Boolean>> LJIILIIL;
    public final boolean LJIILJJIL;
    public final boolean LJIILL;
    public final boolean LJIILLIIL;
    public final int LJIIZILJ;
    public final C375830EoP<Boolean> LJIJ;
    public final C375830EoP<Boolean> LJIJI;
    public final Map<String, C1416070mxB> LJIJJ;
    public final boolean LJIJJLI;

    public static C1418670n1N LIZ(C1418670n1N c1418670n1N, List list, C375830EoP c375830EoP, boolean z, boolean z2, boolean z3, Pair pair, C375830EoP c375830EoP2, C375830EoP c375830EoP3, C375830EoP c375830EoP4, Integer num, C375830EoP c375830EoP5, boolean z4, int i, Map map, boolean z5, int i2) {
        boolean z6;
        boolean z7;
        C375830EoP<Boolean> c375830EoP6;
        boolean z8;
        boolean z9;
        C375830EoP<Boolean> c375830EoP7;
        Map map2 = map;
        int i3 = i;
        boolean z10 = z4;
        C375830EoP c375830EoP8 = c375830EoP4;
        C375830EoP c375830EoP9 = c375830EoP3;
        boolean z11 = z5;
        C375830EoP c375830EoP10 = c375830EoP2;
        Pair pair2 = pair;
        boolean z12 = z2;
        C375830EoP c375830EoP11 = c375830EoP5;
        boolean z13 = z;
        boolean z14 = z3;
        C375830EoP c375830EoP12 = c375830EoP;
        Integer num2 = num;
        List list2 = list;
        if ((i2 & 1) != 0) {
            list2 = c1418670n1N.LIZ;
        }
        if ((i2 & 2) != 0) {
            c375830EoP12 = c1418670n1N.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            z13 = c1418670n1N.LIZJ;
        }
        if ((i2 & 8) != 0) {
            z12 = c1418670n1N.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            z6 = c1418670n1N.LJ;
        } else {
            z6 = false;
        }
        if ((i2 & 32) != 0) {
            z7 = c1418670n1N.LJFF;
        } else {
            z7 = false;
        }
        if ((i2 & 64) != 0) {
            z14 = c1418670n1N.LJI;
        }
        if ((i2 & 128) != 0) {
            pair2 = c1418670n1N.LJII;
        }
        if ((i2 & 256) != 0) {
            c375830EoP10 = c1418670n1N.LJIIIIZZ;
        }
        if ((i2 & 512) != 0) {
            c375830EoP9 = c1418670n1N.LJIIIZ;
        }
        if ((i2 & 1024) != 0) {
            c375830EoP8 = c1418670n1N.LJIIJ;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            num2 = c1418670n1N.LJIIJJI;
        }
        C375830EoP<Boolean> c375830EoP13 = null;
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c375830EoP6 = c1418670n1N.LJIIL;
        } else {
            c375830EoP6 = null;
        }
        if ((i2 & 8192) != 0) {
            c375830EoP11 = c1418670n1N.LJIILIIL;
        }
        if ((i2 & 16384) != 0) {
            z10 = c1418670n1N.LJIILJJIL;
        }
        if ((32768 & i2) != 0) {
            z8 = c1418670n1N.LJIILL;
        } else {
            z8 = false;
        }
        if ((65536 & i2) != 0) {
            z9 = c1418670n1N.LJIILLIIL;
        } else {
            z9 = false;
        }
        if ((131072 & i2) != 0) {
            i3 = c1418670n1N.LJIIZILJ;
        }
        if ((262144 & i2) != 0) {
            c375830EoP7 = c1418670n1N.LJIJ;
        } else {
            c375830EoP7 = null;
        }
        if ((524288 & i2) != 0) {
            c375830EoP13 = c1418670n1N.LJIJI;
        }
        if ((1048576 & i2) != 0) {
            map2 = c1418670n1N.LJIJJ;
        }
        if ((i2 & 2097152) != 0) {
            z11 = c1418670n1N.LJIJJLI;
        }
        c1418670n1N.getClass();
        return new C1418670n1N(list2, c375830EoP12, z13, z12, z6, z7, z14, pair2, c375830EoP10, c375830EoP9, c375830EoP8, num2, c375830EoP6, c375830EoP11, z10, z8, z9, i3, c375830EoP7, c375830EoP13, map2, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1418670n1N(List<AutoCutThemeData> list, C375830EoP<Integer> c375830EoP, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Pair<Boolean, ? extends Function0<Unit>> pair, C375830EoP<Boolean> c375830EoP2, C375830EoP<Boolean> c375830EoP3, C375830EoP<Boolean> c375830EoP4, Integer num, C375830EoP<Boolean> c375830EoP5, C375830EoP<Pair<Integer, Boolean>> c375830EoP6, boolean z6, boolean z7, boolean z8, int i, C375830EoP<Boolean> c375830EoP7, C375830EoP<Boolean> c375830EoP8, Map<String, C1416070mxB> map, boolean z9) {
        this.LIZ = list;
        this.LIZIZ = c375830EoP;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = z4;
        this.LJI = z5;
        this.LJII = pair;
        this.LJIIIIZZ = c375830EoP2;
        this.LJIIIZ = c375830EoP3;
        this.LJIIJ = c375830EoP4;
        this.LJIIJJI = num;
        this.LJIIL = c375830EoP5;
        this.LJIILIIL = c375830EoP6;
        this.LJIILJJIL = z6;
        this.LJIILL = z7;
        this.LJIILLIIL = z8;
        this.LJIIZILJ = i;
        this.LJIJ = c375830EoP7;
        this.LJIJI = c375830EoP8;
        this.LJIJJ = map;
        this.LJIJJLI = z9;
    }
}
