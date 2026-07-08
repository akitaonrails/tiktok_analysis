package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.10qz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19374310qz {
    public static CharSequence LIZ(Number number, C19348710mr c19348710mr, String str, int i, int i2) {
        int i3 = i;
        C19348710mr c19348710mr2 = c19348710mr;
        if ((i2 & 2) != 0) {
            c19348710mr2 = new C19348710mr(null, null, null, 15);
        }
        if ((i2 & 4) != 0) {
            str = C19374510r1.LIZIZ.LIZ.invoke();
        }
        if ((i2 & 8) != 0) {
            i3 = -1;
        }
        try {
            double dDoubleValue = number.doubleValue();
            Function1<? super String, String> function1 = C19374510r1.LIZIZ.LIZIZ;
            if (function1 != null && str != null) {
                str = function1.invoke(str);
            }
            Double dValueOf = Double.valueOf(dDoubleValue);
            C19375410rA c19375410rALIZ = C19374710r3.LIZ(str);
            if (c19348710mr2 == null) {
                c19348710mr2 = new C19348710mr(null, null, null, 15);
            }
            C19375310r9 c19375310r9LIZIZ = C19375110r7.LIZIZ(dValueOf, new C19374810r4(c19375410rALIZ, c19348710mr2, i3, null, 48));
            if (c19375310r9LIZIZ == null) {
                return number.toString();
            }
            return c19375310r9LIZIZ.LIZIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return number.toString();
        }
    }
}
