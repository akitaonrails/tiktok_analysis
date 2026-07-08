package X;

import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.12SK, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12SK {
    public final C375830EoP<List<Pair<Long, Float>>> LIZ;
    public final C375830EoP<List<Float>> LIZIZ;
    public final int LIZJ;
    public final C375830EoP<Boolean> LIZLLL;
    public final C375830EoP<AudioRecorderParam> LJ;
    public final C375830EoP<Boolean> LJFF;
    public final C375830EoP<Boolean> LJI;

    /* JADX WARN: Illegal instructions before constructor call */
    public C12SK() {
        C375830EoP c375830EoP = null;
        this(c375830EoP, c375830EoP, 127);
    }

    public /* synthetic */ C12SK(C375830EoP c375830EoP, C375830EoP c375830EoP2, int i) {
        C375830EoP c375830EoP3;
        C375830EoP c375830EoP4;
        int i2;
        C375830EoP c375830EoP5;
        C375830EoP c375830EoP6 = c375830EoP2;
        C375830EoP c375830EoP7 = c375830EoP;
        if ((i & 1) != 0) {
            c375830EoP3 = new C375830EoP(new ArrayList());
        } else {
            c375830EoP3 = null;
        }
        if ((i & 2) != 0) {
            c375830EoP4 = new C375830EoP(new ArrayList());
        } else {
            c375830EoP4 = null;
        }
        if ((i & 4) != 0) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        if ((i & 8) != 0) {
            c375830EoP5 = new C375830EoP(Boolean.FALSE);
        } else {
            c375830EoP5 = null;
        }
        this(c375830EoP3, c375830EoP4, i2, c375830EoP5, (i & 16) != 0 ? new C375830EoP(new AudioRecorderParam()) : c375830EoP7, (i & 32) != 0 ? new C375830EoP(Boolean.TRUE) : c375830EoP6, (i & 64) != 0 ? new C375830EoP(Boolean.FALSE) : null);
    }

    public C12SK(C375830EoP<List<Pair<Long, Float>>> c375830EoP, C375830EoP<List<Float>> c375830EoP2, int i, C375830EoP<Boolean> c375830EoP3, C375830EoP<AudioRecorderParam> c375830EoP4, C375830EoP<Boolean> c375830EoP5, C375830EoP<Boolean> c375830EoP6) {
        this.LIZ = c375830EoP;
        this.LIZIZ = c375830EoP2;
        this.LIZJ = i;
        this.LIZLLL = c375830EoP3;
        this.LJ = c375830EoP4;
        this.LJFF = c375830EoP5;
        this.LJI = c375830EoP6;
    }

    public static C12SK LIZ(C12SK c12sk, C375830EoP c375830EoP, int i, C375830EoP c375830EoP2, C375830EoP c375830EoP3, C375830EoP c375830EoP4, C375830EoP c375830EoP5, int i2) {
        C375830EoP<List<Float>> c375830EoP6;
        C375830EoP c375830EoP7 = c375830EoP5;
        C375830EoP c375830EoP8 = c375830EoP4;
        C375830EoP c375830EoP9 = c375830EoP3;
        C375830EoP c375830EoP10 = c375830EoP2;
        int i3 = i;
        C375830EoP c375830EoP11 = c375830EoP;
        if ((i2 & 1) != 0) {
            c375830EoP11 = c12sk.LIZ;
        }
        if ((i2 & 2) != 0) {
            c375830EoP6 = c12sk.LIZIZ;
        } else {
            c375830EoP6 = null;
        }
        if ((i2 & 4) != 0) {
            i3 = c12sk.LIZJ;
        }
        if ((i2 & 8) != 0) {
            c375830EoP10 = c12sk.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            c375830EoP9 = c12sk.LJ;
        }
        if ((i2 & 32) != 0) {
            c375830EoP8 = c12sk.LJFF;
        }
        if ((i2 & 64) != 0) {
            c375830EoP7 = c12sk.LJI;
        }
        c12sk.getClass();
        return new C12SK(c375830EoP11, c375830EoP6, i3, c375830EoP10, c375830EoP9, c375830EoP8, c375830EoP7);
    }
}
