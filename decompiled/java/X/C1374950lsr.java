package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.0lsr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1374950lsr {
    public static final void LIZ(String str, Integer num, C1260870iur<?, ?> c1260870iur, Pair<Integer, String> pair) {
        C1387280mCk c1387280mCk = new C1387280mCk();
        c1387280mCk.LIZ = str;
        c1387280mCk.LIZLLL = 1;
        if (num != null) {
            c1387280mCk.LJ = num.intValue();
        }
        if (pair != null && pair.getFirst() != null) {
            c1387280mCk.LJFF = pair.getFirst().intValue();
        }
        if (c1260870iur != null) {
            c1260870iur.LIZJ(c1387280mCk.LIZ());
        }
    }
}
