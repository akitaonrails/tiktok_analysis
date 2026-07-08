package X;

import android.util.SparseArray;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0PYW, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PYW {
    public static long LIZJ;
    public static volatile boolean LIZ = true;
    public static final long LIZIZ = C1150504el.LIZ().LJJII;
    public static long LIZLLL = -1;
    public static final SparseArray<Long> LJ = new SparseArray<>();
    public static final SparseArray<Long> LJFF = new SparseArray<>();
    public static final SparseArray<Long> LJI = new SparseArray<>();
    public static final SparseArray<Long> LJII = new SparseArray<>();
    public static final SparseArray<Long> LJIIIIZZ = new SparseArray<>();

    public static long LIZIZ() {
        return LIZLLL;
    }

    public static void LIZ(int i) {
        SparseArray<Long> sparseArray;
        Long l;
        if (i >= 0 && (l = (sparseArray = LJ).get(i)) != null && l.longValue() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jLongValue = jCurrentTimeMillis - l.longValue();
            LJII.put(i, Long.valueOf(jCurrentTimeMillis));
            LJFF.put(i, l);
            sparseArray.put(i, -1L);
            LJIIIIZZ.put(i, Long.valueOf(jLongValue));
        }
    }

    public static Map LIZJ(int i) {
        long jLongValue;
        long jLongValue2;
        Pair[] pairArr = new Pair[3];
        SparseArray<Long> sparseArray = LJFF;
        Long l = sparseArray.get(i);
        long jLongValue3 = -1;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = -1;
        }
        pairArr[0] = new Pair("searchTimestamp", Long.valueOf(jLongValue));
        SparseArray<Long> sparseArray2 = LJI;
        Long l2 = sparseArray2.get(i);
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        } else {
            jLongValue2 = -1;
        }
        pairArr[1] = new Pair("requestStartTimestamp", Long.valueOf(jLongValue2));
        SparseArray<Long> sparseArray3 = LJII;
        Long l3 = sparseArray3.get(i);
        if (l3 != null) {
            jLongValue3 = l3.longValue();
        }
        pairArr[2] = new Pair("requestEndTimestamp", Long.valueOf(jLongValue3));
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        sparseArray.put(i, -1L);
        sparseArray2.put(i, -1L);
        sparseArray3.put(i, -1L);
        return mapLJIIJ;
    }

    public static long LIZLLL(int i) {
        Long l = LJIIIIZZ.get(i);
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    public static void LJ(int i) {
        if (i < 0) {
            return;
        }
        LJ.put(i, Long.valueOf(System.currentTimeMillis()));
    }
}
