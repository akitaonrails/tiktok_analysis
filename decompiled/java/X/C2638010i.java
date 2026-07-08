package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.010i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2638010i {
    public static double LIZ(HashMap map) {
        double d = 0.0d;
        long j = 0;
        for (Map.Entry entry : map.entrySet()) {
            double dDoubleValue = ((Double) entry.getKey()).doubleValue();
            long jLongValue = ((Long) entry.getValue()).longValue();
            d += dDoubleValue * jLongValue;
            j += jLongValue;
        }
        if (j <= 0) {
            return 0.0d;
        }
        return d / j;
    }
}
