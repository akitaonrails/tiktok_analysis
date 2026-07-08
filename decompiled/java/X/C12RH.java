package X;

import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;

/* JADX INFO: renamed from: X.12RH, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12RH {
    public final C375830EoP<Boolean> LIZ;
    public final C375830EoP<Boolean> LIZIZ;
    public final C375830EoP<AudioRecorderParam> LIZJ;
    public final C375830EoP<AudioRecorderParam> LIZLLL;
    public final C375830EoP<Boolean> LJ;

    public C12RH() {
        this(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C12RH(int i) {
        Boolean bool = Boolean.FALSE;
        this(new C375830EoP(bool), new C375830EoP(bool), new C375830EoP(new AudioRecorderParam()), new C375830EoP(new AudioRecorderParam()), new C375830EoP(bool));
    }

    public C12RH(C375830EoP<Boolean> c375830EoP, C375830EoP<Boolean> c375830EoP2, C375830EoP<AudioRecorderParam> c375830EoP3, C375830EoP<AudioRecorderParam> c375830EoP4, C375830EoP<Boolean> c375830EoP5) {
        this.LIZ = c375830EoP;
        this.LIZIZ = c375830EoP2;
        this.LIZJ = c375830EoP3;
        this.LIZLLL = c375830EoP4;
        this.LJ = c375830EoP5;
    }

    public static C12RH LIZ(C12RH c12rh, C375830EoP c375830EoP, C375830EoP c375830EoP2, C375830EoP c375830EoP3, C375830EoP c375830EoP4, int i) {
        C375830EoP<Boolean> c375830EoP5;
        C375830EoP c375830EoP6 = c375830EoP4;
        C375830EoP c375830EoP7 = c375830EoP3;
        C375830EoP c375830EoP8 = c375830EoP2;
        C375830EoP c375830EoP9 = c375830EoP;
        if ((i & 1) != 0) {
            c375830EoP9 = c12rh.LIZ;
        }
        if ((i & 2) != 0) {
            c375830EoP5 = c12rh.LIZIZ;
        } else {
            c375830EoP5 = null;
        }
        if ((i & 4) != 0) {
            c375830EoP8 = c12rh.LIZJ;
        }
        if ((i & 8) != 0) {
            c375830EoP7 = c12rh.LIZLLL;
        }
        if ((i & 16) != 0) {
            c375830EoP6 = c12rh.LJ;
        }
        c12rh.getClass();
        return new C12RH(c375830EoP9, c375830EoP5, c375830EoP8, c375830EoP7, c375830EoP6);
    }
}
