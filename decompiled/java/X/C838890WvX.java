package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WvX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838890WvX {
    public static double LIZ;
    public static Function0<Double> LIZIZ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static double LJII;
    public static int LJIIIZ;
    public static int LJIIJ;
    public static ScheduledFuture<?> LJIIJJI;
    public static double LIZJ = 1.0d;
    public static double LJFF = 0.99d;
    public static long LJI = 5;
    public static final ConcurrentHashMap<Integer, Double> LJIIIIZZ = new ConcurrentHashMap<>();

    public static boolean LIZ(int i) {
        double d;
        double dDoubleValue;
        Double dInvoke;
        double dDoubleValue2 = 1.0d;
        if (LIZLLL) {
            d = LIZ;
            Function0<Double> function0 = LIZIZ;
            if (function0 != null && (dInvoke = function0.invoke()) != null) {
                dDoubleValue = dInvoke.doubleValue();
            } else {
                dDoubleValue = 1.0d;
            }
        } else {
            d = LIZ;
            dDoubleValue = LIZJ;
        }
        if (!C0W9Q.LIZ(d * dDoubleValue)) {
            LJIIJ++;
            return false;
        }
        if (!LJ) {
            LJIIIZ++;
            return true;
        }
        ConcurrentHashMap<Integer, Double> concurrentHashMap = LJIIIIZZ;
        Double d2 = concurrentHashMap.get(Integer.valueOf(i));
        if (d2 != null) {
            double dDoubleValue3 = d2.doubleValue();
            dDoubleValue2 = LJII;
            if (dDoubleValue3 > dDoubleValue2) {
                dDoubleValue2 = d2.doubleValue() * LJFF;
            }
        }
        concurrentHashMap.put(Integer.valueOf(i), Double.valueOf(dDoubleValue2));
        boolean zLIZ = C0W9Q.LIZ(dDoubleValue2);
        if (zLIZ) {
            LJIIIZ++;
            return zLIZ;
        }
        LJIIJ++;
        return zLIZ;
    }
}
