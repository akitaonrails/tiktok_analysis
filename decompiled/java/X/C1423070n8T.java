package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0n8T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1423070n8T {
    public final C1DRG LIZ;
    public final int LIZIZ;
    public final C375830EoP<C443120HZe<List<C1419590n2r>, Pair<C443120HZe<C1419590n2r, Rect, Float>, Bitmap>, C1422890n8B>> LIZJ;
    public final C375830EoP<Unit> LIZLLL;
    public final C375830EoP<Unit> LJ;
    public final C1419590n2r LJFF;
    public final boolean LJI;
    public final EnumC1423210n8h LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final String LJIIJ;
    public final C375830EoP<Integer> LJIIJJI;
    public final C375830EoP<Pair<Integer, Boolean>> LJIIL;
    public final Boolean LJIILIIL;
    public final C1422970n8J LJIILJJIL;

    public static C1423070n8T LIZ(C1423070n8T c1423070n8T, C375830EoP c375830EoP, C375830EoP c375830EoP2, C375830EoP c375830EoP3, C1419590n2r c1419590n2r, boolean z, EnumC1423210n8h enumC1423210n8h, boolean z2, boolean z3, C375830EoP c375830EoP4, C375830EoP c375830EoP5, Boolean bool, C1422970n8J c1422970n8J, int i) {
        C1DRG c1drg;
        int i2;
        C1422970n8J c1422970n8J2 = c1422970n8J;
        boolean z4 = z3;
        boolean z5 = z2;
        EnumC1423210n8h enumC1423210n8h2 = enumC1423210n8h;
        boolean z6 = z;
        Boolean bool2 = bool;
        C1419590n2r c1419590n2r2 = c1419590n2r;
        C375830EoP c375830EoP6 = c375830EoP5;
        C375830EoP c375830EoP7 = c375830EoP3;
        C375830EoP c375830EoP8 = c375830EoP4;
        C375830EoP c375830EoP9 = c375830EoP2;
        C375830EoP c375830EoP10 = c375830EoP;
        String str = null;
        if ((i & 1) != 0) {
            c1drg = c1423070n8T.LIZ;
        } else {
            c1drg = null;
        }
        if ((i & 2) != 0) {
            i2 = c1423070n8T.LIZIZ;
        } else {
            i2 = 0;
        }
        if ((i & 4) != 0) {
            c375830EoP10 = c1423070n8T.LIZJ;
        }
        if ((i & 8) != 0) {
            c375830EoP9 = c1423070n8T.LIZLLL;
        }
        if ((i & 16) != 0) {
            c375830EoP7 = c1423070n8T.LJ;
        }
        if ((i & 32) != 0) {
            c1419590n2r2 = c1423070n8T.LJFF;
        }
        if ((i & 64) != 0) {
            z6 = c1423070n8T.LJI;
        }
        if ((i & 128) != 0) {
            enumC1423210n8h2 = c1423070n8T.LJII;
        }
        if ((i & 256) != 0) {
            z5 = c1423070n8T.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            z4 = c1423070n8T.LJIIIZ;
        }
        if ((i & 1024) != 0) {
            str = c1423070n8T.LJIIJ;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c375830EoP8 = c1423070n8T.LJIIJJI;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c375830EoP6 = c1423070n8T.LJIIL;
        }
        if ((i & 8192) != 0) {
            bool2 = c1423070n8T.LJIILIIL;
        }
        if ((i & 16384) != 0) {
            c1422970n8J2 = c1423070n8T.LJIILJJIL;
        }
        c1423070n8T.getClass();
        return new C1423070n8T(c1drg, i2, c375830EoP10, c375830EoP9, c375830EoP7, c1419590n2r2, z6, enumC1423210n8h2, z5, z4, str, c375830EoP8, c375830EoP6, bool2, c1422970n8J2);
    }

    public C1423070n8T(C1DRG c1drg, int i, C375830EoP<C443120HZe<List<C1419590n2r>, Pair<C443120HZe<C1419590n2r, Rect, Float>, Bitmap>, C1422890n8B>> c375830EoP, C375830EoP<Unit> c375830EoP2, C375830EoP<Unit> c375830EoP3, C1419590n2r c1419590n2r, boolean z, EnumC1423210n8h enumC1423210n8h, boolean z2, boolean z3, String str, C375830EoP<Integer> c375830EoP4, C375830EoP<Pair<Integer, Boolean>> c375830EoP5, Boolean bool, C1422970n8J c1422970n8J) {
        this.LIZ = c1drg;
        this.LIZIZ = i;
        this.LIZJ = c375830EoP;
        this.LIZLLL = c375830EoP2;
        this.LJ = c375830EoP3;
        this.LJFF = c1419590n2r;
        this.LJI = z;
        this.LJII = enumC1423210n8h;
        this.LJIIIIZZ = z2;
        this.LJIIIZ = z3;
        this.LJIIJ = str;
        this.LJIIJJI = c375830EoP4;
        this.LJIIL = c375830EoP5;
        this.LJIILIIL = bool;
        this.LJIILJJIL = c1422970n8J;
    }
}
