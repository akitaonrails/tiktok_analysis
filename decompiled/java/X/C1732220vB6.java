package X;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vB6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1732220vB6 {
    public static WeakReference<AbstractC1732690vBr> LIZ;

    public static boolean LIZ(AbstractC1732690vBr abstractC1732690vBr, Number number, Number number2) {
        long jLongValue;
        if (number != null) {
            jLongValue = number.longValue();
        } else {
            jLongValue = -1;
        }
        if (jLongValue > 0) {
            if (Intrinsics.LJFF(number2, 0)) {
                if (jLongValue <= abstractC1732690vBr.LLJI) {
                    return false;
                }
                abstractC1732690vBr.LLJI = jLongValue;
                return true;
            }
            if (Intrinsics.LJFF(number2, 1)) {
                if (jLongValue <= abstractC1732690vBr.LLJILJIL) {
                    return false;
                }
                abstractC1732690vBr.LLJILJIL = jLongValue;
            } else if (Intrinsics.LJFF(number2, 2)) {
                if (jLongValue <= abstractC1732690vBr.LLJIJIL) {
                    return false;
                }
                abstractC1732690vBr.LLJIJIL = jLongValue;
                return true;
            }
        }
        return true;
    }
}
