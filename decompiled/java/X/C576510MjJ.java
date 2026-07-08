package X;

import android.view.View;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0MjJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C576510MjJ {
    public final float LIZ;
    public final boolean LIZIZ;
    public final C375830EoP<Unit> LIZJ;
    public final C375830EoP<Pair<AbstractC577050MkB, Integer>> LIZLLL;
    public final C375830EoP<Unit> LJ;
    public final C375830EoP<Unit> LJFF;
    public final C375830EoP<Boolean> LJI;
    public final C375830EoP<Pair<Integer, View>> LJII;
    public final C375830EoP<Integer> LJIIIIZZ;
    public final C375830EoP<Pair<Integer, List<View>>> LJIIIZ;
    public final C375830EoP<Unit> LJIIJ;
    public final C375830EoP<Unit> LJIIJJI;

    public C576510MjJ(float f, boolean z, C375830EoP<Unit> c375830EoP, C375830EoP<Pair<AbstractC577050MkB, Integer>> c375830EoP2, C375830EoP<Unit> c375830EoP3, C375830EoP<Unit> c375830EoP4, C375830EoP<Boolean> c375830EoP5, C375830EoP<Pair<Integer, View>> c375830EoP6, C375830EoP<Integer> c375830EoP7, C375830EoP<Pair<Integer, List<View>>> c375830EoP8, C375830EoP<Unit> c375830EoP9, C375830EoP<Unit> c375830EoP10) {
        this.LIZ = f;
        this.LIZIZ = z;
        this.LIZJ = c375830EoP;
        this.LIZLLL = c375830EoP2;
        this.LJ = c375830EoP3;
        this.LJFF = c375830EoP4;
        this.LJI = c375830EoP5;
        this.LJII = c375830EoP6;
        this.LJIIIIZZ = c375830EoP7;
        this.LJIIIZ = c375830EoP8;
        this.LJIIJ = c375830EoP9;
        this.LJIIJJI = c375830EoP10;
    }

    public static C576510MjJ LIZ(C576510MjJ c576510MjJ, float f, boolean z, C375830EoP c375830EoP, C375830EoP c375830EoP2, C375830EoP c375830EoP3, C375830EoP c375830EoP4, C375830EoP c375830EoP5, C375830EoP c375830EoP6, C375830EoP c375830EoP7, C375830EoP c375830EoP8, C375830EoP c375830EoP9, C375830EoP c375830EoP10, int i) {
        C375830EoP c375830EoP11 = c375830EoP10;
        C375830EoP c375830EoP12 = c375830EoP9;
        C375830EoP c375830EoP13 = c375830EoP8;
        C375830EoP c375830EoP14 = c375830EoP7;
        C375830EoP c375830EoP15 = c375830EoP6;
        C375830EoP c375830EoP16 = c375830EoP5;
        C375830EoP c375830EoP17 = c375830EoP4;
        C375830EoP c375830EoP18 = c375830EoP3;
        C375830EoP c375830EoP19 = c375830EoP2;
        C375830EoP c375830EoP20 = c375830EoP;
        boolean z2 = z;
        float f2 = f;
        if ((i & 1) != 0) {
            f2 = c576510MjJ.LIZ;
        }
        if ((i & 2) != 0) {
            z2 = c576510MjJ.LIZIZ;
        }
        if ((i & 4) != 0) {
            c375830EoP20 = c576510MjJ.LIZJ;
        }
        if ((i & 8) != 0) {
            c375830EoP19 = c576510MjJ.LIZLLL;
        }
        if ((i & 16) != 0) {
            c375830EoP18 = c576510MjJ.LJ;
        }
        if ((i & 32) != 0) {
            c375830EoP17 = c576510MjJ.LJFF;
        }
        if ((i & 64) != 0) {
            c375830EoP16 = c576510MjJ.LJI;
        }
        if ((i & 128) != 0) {
            c375830EoP15 = c576510MjJ.LJII;
        }
        if ((i & 256) != 0) {
            c375830EoP14 = c576510MjJ.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            c375830EoP13 = c576510MjJ.LJIIIZ;
        }
        if ((i & 1024) != 0) {
            c375830EoP12 = c576510MjJ.LJIIJ;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c375830EoP11 = c576510MjJ.LJIIJJI;
        }
        c576510MjJ.getClass();
        return new C576510MjJ(f2, z2, c375830EoP20, c375830EoP19, c375830EoP18, c375830EoP17, c375830EoP16, c375830EoP15, c375830EoP14, c375830EoP13, c375830EoP12, c375830EoP11);
    }
}
