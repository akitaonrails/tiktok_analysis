package X;

import java.util.ArrayList;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0QYF, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QYF {
    public static final int[] LIZ;
    public static final C01GW LIZIZ;

    static {
        ArrayList arrayListLJ = C1697810uHb.LJ(-100, 8, 9, 141, 142);
        int i = 101;
        do {
            arrayListLJ.add(Integer.valueOf(i));
            i++;
        } while (i < 136);
        LIZ = C13LP.LLII(arrayListLJ);
        LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(641));
    }

    public static boolean LIZ(int i) {
        return !C13LQ.LJIILJJIL(i, (int[]) LIZIZ.getValue());
    }

    public static boolean LIZIZ(C0QER c0qer) {
        if (!C650500PfM.LIZJ(c0qer) || !LIZ(C650500PfM.LIZIZ(c0qer))) {
            if (!C650500PfM.LIZJ(c0qer) && LIZ(C650500PfM.LIZIZ(c0qer))) {
                return true;
            }
            return false;
        }
        return true;
    }
}
