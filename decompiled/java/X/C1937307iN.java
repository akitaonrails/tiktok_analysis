package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.07iN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1937307iN {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C085V());
    public static volatile Boolean LIZIZ;

    public static int LIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static boolean LIZIZ(int i, Context context) {
        boolean z;
        if ((LIZ() & 15) > 0 && (LIZ() & i) == i) {
            z = true;
        } else {
            z = false;
        }
        if (LIZIZ == null) {
            try {
                LIZIZ = Boolean.valueOf(C2162308dZ.LJI(context));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (LIZIZ != null && (!r0.booleanValue())) {
            if (!z || (LIZ() & 128) != 128) {
                return false;
            }
            return true;
        }
        return z;
    }
}
