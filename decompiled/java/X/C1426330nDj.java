package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.0nDj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1426330nDj {
    public final C375830EoP<Boolean> LIZ;
    public final Pair<String, Integer> LIZIZ;

    public C1426330nDj(C375830EoP<Boolean> c375830EoP, Pair<String, Integer> pair) {
        this.LIZ = c375830EoP;
        this.LIZIZ = pair;
    }

    public static C1426330nDj LIZ(C1426330nDj c1426330nDj, C375830EoP c375830EoP, Pair pair, int i) {
        if ((i & 1) != 0) {
            c375830EoP = c1426330nDj.LIZ;
        }
        if ((i & 2) != 0) {
            pair = c1426330nDj.LIZIZ;
        }
        c1426330nDj.getClass();
        return new C1426330nDj(c375830EoP, pair);
    }
}
