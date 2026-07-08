package X;

import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0nE7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1426570nE7 {
    public final C1DRG LIZ;
    public final int LIZIZ;
    public final Pair<String, Integer> LIZJ;
    public final C375830EoP<Boolean> LIZLLL;
    public final C375830EoP<Unit> LJ;

    public C1426570nE7(C1DRG c1drg, int i, Pair<String, Integer> pair, C375830EoP<Boolean> c375830EoP, C375830EoP<Unit> c375830EoP2) {
        this.LIZ = c1drg;
        this.LIZIZ = i;
        this.LIZJ = pair;
        this.LIZLLL = c375830EoP;
        this.LJ = c375830EoP2;
    }

    public static C1426570nE7 LIZ(C1426570nE7 c1426570nE7, int i, Pair pair, C375830EoP c375830EoP, int i2) {
        C1DRG c1drg;
        C375830EoP c375830EoP2 = c375830EoP;
        Pair pair2 = pair;
        int i3 = i;
        C375830EoP<Unit> c375830EoP3 = null;
        if ((i2 & 1) != 0) {
            c1drg = c1426570nE7.LIZ;
        } else {
            c1drg = null;
        }
        if ((i2 & 2) != 0) {
            i3 = c1426570nE7.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            pair2 = c1426570nE7.LIZJ;
        }
        if ((i2 & 8) != 0) {
            c375830EoP2 = c1426570nE7.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            c375830EoP3 = c1426570nE7.LJ;
        }
        c1426570nE7.getClass();
        return new C1426570nE7(c1drg, i3, pair2, c375830EoP2, c375830EoP3);
    }
}
