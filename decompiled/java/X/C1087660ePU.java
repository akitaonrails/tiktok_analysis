package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ePU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1087660ePU {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(float f) {
        float f2 = f * 1000000;
        int i = (int) f2;
        if (i >= 1000000) {
            return true;
        }
        if (i <= 0) {
            return false;
        }
        try {
            if (AbstractC19994813Le.Default.nextInt(0, 1000000) <= f2) {
                return true;
            }
            return false;
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
