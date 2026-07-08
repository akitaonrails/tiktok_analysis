package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.0rKO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1584220rKO {
    public static final Pair<Integer, Integer> LIZ(Pair<Integer, Integer> pair) {
        int i = C1584210rKN.LIZ[C1584190rKL.LIZ().ordinal()];
        if (i != 1 && i != 2) {
            return new Pair<>(0, 0);
        }
        double d = 24;
        double d2 = 32;
        double d3 = 2;
        return new Pair<>(Integer.valueOf((int) ((pair.getFirst().doubleValue() - ((((double) pair.getFirst().intValue()) * d) / d2)) / d3)), Integer.valueOf((int) ((pair.getSecond().doubleValue() - ((((double) pair.getSecond().intValue()) * d) / d2)) / d3)));
    }
}
