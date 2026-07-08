package X;

import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;

/* JADX INFO: renamed from: X.12RM, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12RM {
    public final C375830EoP<Boolean> LIZ;
    public final C375830EoP<Boolean> LIZIZ;
    public final C375830EoP<AudioRecorderParam> LIZJ;
    public final C375830EoP<AudioRecorderParam> LIZLLL;
    public final C375830EoP<Boolean> LJ;
    public final C375830EoP<Boolean> LJFF;
    public final C375830EoP<Boolean> LJI;
    public final C375830EoP<Integer> LJII;

    public C12RM() {
        this(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C12RM(int i) {
        Boolean bool = Boolean.FALSE;
        this(new C375830EoP(bool), new C375830EoP(bool), new C375830EoP(new AudioRecorderParam()), new C375830EoP(new AudioRecorderParam()), new C375830EoP(bool), new C375830EoP(bool), new C375830EoP(bool), new C375830EoP(0));
    }

    public static C12RM LIZ(C12RM c12rm, C375830EoP c375830EoP, C375830EoP c375830EoP2, C375830EoP c375830EoP3, C375830EoP c375830EoP4, C375830EoP c375830EoP5, int i) {
        C375830EoP<Boolean> c375830EoP6;
        C375830EoP<Boolean> c375830EoP7;
        C375830EoP c375830EoP8 = c375830EoP3;
        C375830EoP c375830EoP9 = c375830EoP5;
        C375830EoP c375830EoP10 = c375830EoP2;
        C375830EoP c375830EoP11 = c375830EoP4;
        C375830EoP c375830EoP12 = c375830EoP;
        C375830EoP<Boolean> c375830EoP13 = null;
        if ((i & 1) != 0) {
            c375830EoP6 = c12rm.LIZ;
        } else {
            c375830EoP6 = null;
        }
        if ((i & 2) != 0) {
            c375830EoP7 = c12rm.LIZIZ;
        } else {
            c375830EoP7 = null;
        }
        if ((i & 4) != 0) {
            c375830EoP12 = c12rm.LIZJ;
        }
        if ((i & 8) != 0) {
            c375830EoP10 = c12rm.LIZLLL;
        }
        if ((i & 16) != 0) {
            c375830EoP13 = c12rm.LJ;
        }
        if ((i & 32) != 0) {
            c375830EoP8 = c12rm.LJFF;
        }
        if ((i & 64) != 0) {
            c375830EoP11 = c12rm.LJI;
        }
        if ((i & 128) != 0) {
            c375830EoP9 = c12rm.LJII;
        }
        c12rm.getClass();
        return new C12RM(c375830EoP6, c375830EoP7, c375830EoP12, c375830EoP10, c375830EoP13, c375830EoP8, c375830EoP11, c375830EoP9);
    }

    public C12RM(C375830EoP<Boolean> c375830EoP, C375830EoP<Boolean> c375830EoP2, C375830EoP<AudioRecorderParam> c375830EoP3, C375830EoP<AudioRecorderParam> c375830EoP4, C375830EoP<Boolean> c375830EoP5, C375830EoP<Boolean> c375830EoP6, C375830EoP<Boolean> c375830EoP7, C375830EoP<Integer> c375830EoP8) {
        this.LIZ = c375830EoP;
        this.LIZIZ = c375830EoP2;
        this.LIZJ = c375830EoP3;
        this.LIZLLL = c375830EoP4;
        this.LJ = c375830EoP5;
        this.LJFF = c375830EoP6;
        this.LJI = c375830EoP7;
        this.LJII = c375830EoP8;
    }
}
