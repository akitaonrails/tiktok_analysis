package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0glD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1178010glD {
    public static final C1177960gl8 LIZJ(C1178490glz c1178490glz) {
        return new C1177960gl8(c1178490glz.latitude, c1178490glz.longitude);
    }

    public static final C1178490glz LIZ(C1176580giu c1176580giu, C1178490glz c1178490glz, Pair<Integer, Integer> pair, int i) {
        try {
            double dDoubleValue = (c1176580giu.northeast.lat - c1176580giu.southwest.lat) / pair.getSecond().doubleValue();
            int iIntValue = pair.getSecond().intValue() / 2;
            int iAbs = Math.abs(iIntValue - i);
            if (iIntValue > i) {
                return new C1178490glz(c1178490glz.latitude - (((double) iAbs) * dDoubleValue), c1178490glz.longitude);
            }
            return new C1178490glz(c1178490glz.latitude + (((double) iAbs) * dDoubleValue), c1178490glz.longitude);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return c1178490glz;
        }
    }

    public static final C1176580giu LIZIZ(C1176580giu c1176580giu, Pair<Integer, Integer> pair, Pair<Integer, Integer> pair2, int i, int i2) {
        int iIntValue = pair.getSecond().intValue();
        int iIntValue2 = pair.getFirst().intValue();
        int iIntValue3 = pair2.getSecond().intValue();
        int iIntValue4 = pair2.getFirst().intValue();
        C1177960gl8 c1177960gl8 = c1176580giu.southwest;
        if (c1177960gl8 != null) {
            double d = c1177960gl8.lat;
            double d2 = c1177960gl8.lon;
            C1177960gl8 c1177960gl82 = c1176580giu.northeast;
            if (c1177960gl82 != null) {
                double d3 = c1177960gl82.lat;
                double d4 = c1177960gl82.lon;
                double dAbs = Math.abs(d - d3);
                double dAbs2 = Math.abs(d2 - d4);
                double d5 = iIntValue2;
                double d6 = (((double) iIntValue4) * dAbs2) / d5;
                double d7 = iIntValue;
                double d8 = (((double) iIntValue3) * dAbs) / d7;
                C1177960gl8 c1177960gl83 = new C1177960gl8(c1176580giu.northeast.lat - ((dAbs * ((double) i2)) / d7), c1176580giu.southwest.lon + ((dAbs2 * ((double) i)) / d5));
                return new C1176580giu(new C1177960gl8(c1177960gl83.lat - d8, c1177960gl83.lon), new C1177960gl8(c1177960gl83.lat, c1177960gl83.lon + d6));
            }
            return null;
        }
        return null;
    }
}
