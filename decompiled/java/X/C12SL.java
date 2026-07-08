package X;

import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.12SL, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12SL {
    public final C375830EoP<Boolean> LIZ;
    public final C375830EoP<Boolean> LIZIZ;
    public final C375830EoP<Boolean> LIZJ;
    public final C375830EoP<List<Pair<Long, Float>>> LIZLLL;
    public final int LJ;
    public final C375830EoP<Boolean> LJFF;
    public final C375830EoP<AudioRecorderParam> LJI;
    public final C375830EoP<Boolean> LJII;
    public final C375830EoP<Pair<Integer, Integer>> LJIIIIZZ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C12SL() {
        C375830EoP c375830EoP = null;
        this(c375830EoP, c375830EoP, 511);
    }

    public /* synthetic */ C12SL(C375830EoP c375830EoP, C375830EoP c375830EoP2, int i) {
        C375830EoP c375830EoP3;
        C375830EoP c375830EoP4;
        C375830EoP c375830EoP5;
        int i2;
        C375830EoP c375830EoP6;
        C375830EoP c375830EoP7;
        C375830EoP c375830EoP8 = c375830EoP2;
        C375830EoP c375830EoP9 = (i & 1) != 0 ? new C375830EoP(Boolean.TRUE) : c375830EoP;
        if ((i & 2) != 0) {
            c375830EoP3 = new C375830EoP(Boolean.TRUE);
        } else {
            c375830EoP3 = null;
        }
        if ((i & 4) != 0) {
            c375830EoP4 = new C375830EoP(Boolean.TRUE);
        } else {
            c375830EoP4 = null;
        }
        if ((i & 8) != 0) {
            c375830EoP5 = new C375830EoP(new ArrayList());
        } else {
            c375830EoP5 = null;
        }
        if ((i & 16) != 0) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        if ((i & 32) != 0) {
            c375830EoP6 = new C375830EoP(Boolean.FALSE);
        } else {
            c375830EoP6 = null;
        }
        c375830EoP8 = (i & 64) != 0 ? new C375830EoP(new AudioRecorderParam()) : c375830EoP8;
        if ((i & 128) != 0) {
            c375830EoP7 = new C375830EoP(Boolean.FALSE);
        } else {
            c375830EoP7 = null;
        }
        this(c375830EoP9, c375830EoP3, c375830EoP4, c375830EoP5, i2, c375830EoP6, c375830EoP8, c375830EoP7, (i & 256) != 0 ? new C375830EoP(new Pair(0, 0)) : null);
    }

    public static C12SL LIZ(C12SL c12sl, C375830EoP c375830EoP, C375830EoP c375830EoP2, int i, C375830EoP c375830EoP3, C375830EoP c375830EoP4, C375830EoP c375830EoP5, int i2) {
        C375830EoP<Boolean> c375830EoP6;
        C375830EoP<Boolean> c375830EoP7;
        C375830EoP c375830EoP8 = c375830EoP5;
        C375830EoP c375830EoP9 = c375830EoP;
        C375830EoP c375830EoP10 = c375830EoP4;
        C375830EoP c375830EoP11 = c375830EoP3;
        int i3 = i;
        C375830EoP c375830EoP12 = c375830EoP2;
        if ((i2 & 1) != 0) {
            c375830EoP9 = c12sl.LIZ;
        }
        C375830EoP<Boolean> c375830EoP13 = null;
        if ((i2 & 2) != 0) {
            c375830EoP6 = c12sl.LIZIZ;
        } else {
            c375830EoP6 = null;
        }
        if ((i2 & 4) != 0) {
            c375830EoP7 = c12sl.LIZJ;
        } else {
            c375830EoP7 = null;
        }
        if ((i2 & 8) != 0) {
            c375830EoP12 = c12sl.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            i3 = c12sl.LJ;
        }
        if ((i2 & 32) != 0) {
            c375830EoP13 = c12sl.LJFF;
        }
        if ((i2 & 64) != 0) {
            c375830EoP11 = c12sl.LJI;
        }
        if ((i2 & 128) != 0) {
            c375830EoP10 = c12sl.LJII;
        }
        if ((i2 & 256) != 0) {
            c375830EoP8 = c12sl.LJIIIIZZ;
        }
        c12sl.getClass();
        return new C12SL(c375830EoP9, c375830EoP6, c375830EoP7, c375830EoP12, i3, c375830EoP13, c375830EoP11, c375830EoP10, c375830EoP8);
    }

    public C12SL(C375830EoP<Boolean> c375830EoP, C375830EoP<Boolean> c375830EoP2, C375830EoP<Boolean> c375830EoP3, C375830EoP<List<Pair<Long, Float>>> c375830EoP4, int i, C375830EoP<Boolean> c375830EoP5, C375830EoP<AudioRecorderParam> c375830EoP6, C375830EoP<Boolean> c375830EoP7, C375830EoP<Pair<Integer, Integer>> c375830EoP8) {
        this.LIZ = c375830EoP;
        this.LIZIZ = c375830EoP2;
        this.LIZJ = c375830EoP3;
        this.LIZLLL = c375830EoP4;
        this.LJ = i;
        this.LJFF = c375830EoP5;
        this.LJI = c375830EoP6;
        this.LJII = c375830EoP7;
        this.LJIIIIZZ = c375830EoP8;
    }
}
