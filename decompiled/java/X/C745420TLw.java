package X;

import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Locale;

/* JADX INFO: renamed from: X.0TLw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C745420TLw {
    public static int LIZ(int i, int i2, int i3, int i4) {
        double d;
        double d2;
        if (i <= 0 || i2 <= 0) {
            return 1;
        }
        if (i <= i2 || i3 >= i4) {
            if (i < i2 && i3 > i4) {
                return 2;
            }
            double d3 = ((double) i) / ((double) i2);
            double d4 = ((double) i3) / ((double) i4);
            try {
                Locale locale = Locale.US;
                d = CastDoubleProtector.parseDouble(C786410Ut5.k4(locale, "%.2f", new Object[]{Double.valueOf(d3)}));
                d2 = CastDoubleProtector.parseDouble(C786410Ut5.k4(locale, "%.2f", new Object[]{Double.valueOf(d4)}));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C2276411E8h.LIZIZ.LIZLLL("common_feed", th);
            }
            if (d <= 0.0d || d2 <= 0.0d || d == d2) {
                return 0;
            }
            return 3;
        }
        return 2;
    }
}
