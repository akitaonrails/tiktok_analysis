package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectItem;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0mqe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1412020mqe {
    public final boolean LIZ;
    public final Integer LIZIZ;
    public final C375830EoP<Integer> LIZJ;
    public final List<RecommendEffectItem> LIZLLL;
    public final Pair<Integer, List<RecommendEffectItem>> LJ;
    public final float LJFF;
    public final boolean LJI;
    public final int LJII;
    public final C375830EoP<Boolean> LJIIIIZZ;
    public final C375830EoP<Boolean> LJIIIZ;
    public final Pair<Boolean, Boolean> LJIIJ;
    public final Float LJIIJJI;
    public final boolean LJIIL;
    public final C375830EoP<Boolean> LJIILIIL;

    /* JADX WARN: Multi-variable type inference failed */
    public C1412020mqe(boolean z, Integer num, C375830EoP<Integer> c375830EoP, List<RecommendEffectItem> list, Pair<Integer, ? extends List<RecommendEffectItem>> pair, float f, boolean z2, int i, C375830EoP<Boolean> c375830EoP2, C375830EoP<Boolean> c375830EoP3, Pair<Boolean, Boolean> pair2, Float f2, boolean z3, C375830EoP<Boolean> c375830EoP4) {
        this.LIZ = z;
        this.LIZIZ = num;
        this.LIZJ = c375830EoP;
        this.LIZLLL = list;
        this.LJ = pair;
        this.LJFF = f;
        this.LJI = z2;
        this.LJII = i;
        this.LJIIIIZZ = c375830EoP2;
        this.LJIIIZ = c375830EoP3;
        this.LJIIJ = pair2;
        this.LJIIJJI = f2;
        this.LJIIL = z3;
        this.LJIILIIL = c375830EoP4;
    }

    public static C1412020mqe LIZ(C1412020mqe c1412020mqe, boolean z, Integer num, C375830EoP c375830EoP, List list, Pair pair, float f, boolean z2, int i, C375830EoP c375830EoP2, C375830EoP c375830EoP3, Pair pair2, Float f2, boolean z3, C375830EoP c375830EoP4, int i2) {
        C375830EoP c375830EoP5 = c375830EoP4;
        boolean z4 = z3;
        Float f3 = f2;
        Pair pair3 = pair2;
        C375830EoP c375830EoP6 = c375830EoP3;
        C375830EoP c375830EoP7 = c375830EoP2;
        int i3 = i;
        boolean z5 = z2;
        float f4 = f;
        Pair pair4 = pair;
        List list2 = list;
        C375830EoP c375830EoP8 = c375830EoP;
        Integer num2 = num;
        boolean z6 = z;
        if ((i2 & 1) != 0) {
            z6 = c1412020mqe.LIZ;
        }
        if ((i2 & 2) != 0) {
            num2 = c1412020mqe.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            c375830EoP8 = c1412020mqe.LIZJ;
        }
        if ((i2 & 8) != 0) {
            list2 = c1412020mqe.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            pair4 = c1412020mqe.LJ;
        }
        if ((i2 & 32) != 0) {
            f4 = c1412020mqe.LJFF;
        }
        if ((i2 & 64) != 0) {
            z5 = c1412020mqe.LJI;
        }
        if ((i2 & 128) != 0) {
            i3 = c1412020mqe.LJII;
        }
        if ((i2 & 256) != 0) {
            c375830EoP7 = c1412020mqe.LJIIIIZZ;
        }
        if ((i2 & 512) != 0) {
            c375830EoP6 = c1412020mqe.LJIIIZ;
        }
        if ((i2 & 1024) != 0) {
            pair3 = c1412020mqe.LJIIJ;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            f3 = c1412020mqe.LJIIJJI;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z4 = c1412020mqe.LJIIL;
        }
        if ((i2 & 8192) != 0) {
            c375830EoP5 = c1412020mqe.LJIILIIL;
        }
        c1412020mqe.getClass();
        return new C1412020mqe(z6, num2, c375830EoP8, list2, pair4, f4, z5, i3, c375830EoP7, c375830EoP6, pair3, f3, z4, c375830EoP5);
    }
}
