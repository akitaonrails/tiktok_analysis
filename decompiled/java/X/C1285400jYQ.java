package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0jYQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1285400jYQ {
    public static boolean LIZ(AbstractC1285340jYK abstractC1285340jYK, C1285360jYM c1285360jYM) {
        if (abstractC1285340jYK instanceof C1285370jYN) {
            if (TextUtils.equals(abstractC1285340jYK.LJIIJJI.LJII, c1285360jYM.LJII)) {
                C1285360jYM c1285360jYM2 = abstractC1285340jYK.LJIIJJI;
                if (c1285360jYM2.LJI == c1285360jYM.LJI) {
                    if (!abstractC1285340jYK.LIZ) {
                        if (c1285360jYM2.LJIIIIZZ == c1285360jYM.LJIIIIZZ && c1285360jYM2.LJIIIZ == c1285360jYM.LJIIIZ) {
                            return true;
                        }
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        if (!(abstractC1285340jYK instanceof C1285390jYP)) {
            return true;
        }
        return TextUtils.equals("audio/mp4a-latm", abstractC1285340jYK.LJIIJJI.LJII);
    }
}
