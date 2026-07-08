package X;

import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0nAH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1424190nAH {
    public final C1DRG LIZ;
    public final int LIZIZ;
    public final Pair<String, Integer> LIZJ;
    public final C375830EoP<Boolean> LIZLLL;
    public final C375830EoP<Unit> LJ;
    public final C1422410n7P LJFF;

    public C1424190nAH(C1DRG c1drg, int i, Pair<String, Integer> pair, C375830EoP<Boolean> c375830EoP, C375830EoP<Unit> c375830EoP2, C1422410n7P c1422410n7P) {
        this.LIZ = c1drg;
        this.LIZIZ = i;
        this.LIZJ = pair;
        this.LIZLLL = c375830EoP;
        this.LJ = c375830EoP2;
        this.LJFF = c1422410n7P;
    }

    public static C1424190nAH LIZ(C1424190nAH c1424190nAH, int i, Pair pair, C375830EoP c375830EoP, C375830EoP c375830EoP2, int i2) {
        C1DRG c1drg;
        C375830EoP c375830EoP3 = c375830EoP2;
        C375830EoP c375830EoP4 = c375830EoP;
        Pair pair2 = pair;
        int i3 = i;
        C1422410n7P c1422410n7P = null;
        if ((i2 & 1) != 0) {
            c1drg = c1424190nAH.LIZ;
        } else {
            c1drg = null;
        }
        if ((i2 & 2) != 0) {
            i3 = c1424190nAH.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            pair2 = c1424190nAH.LIZJ;
        }
        if ((i2 & 8) != 0) {
            c375830EoP4 = c1424190nAH.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            c375830EoP3 = c1424190nAH.LJ;
        }
        if ((i2 & 32) != 0) {
            c1422410n7P = c1424190nAH.LJFF;
        }
        c1424190nAH.getClass();
        return new C1424190nAH(c1drg, i3, pair2, c375830EoP4, c375830EoP3, c1422410n7P);
    }
}
