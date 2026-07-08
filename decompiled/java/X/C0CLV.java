package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0CLV, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CLV {
    public static boolean LIZ() {
        try {
            Integer isProaccountDisplay = C0CLW.LIZIZ.LIZ.getProAccountEnableDetailInfo().getIsProaccountDisplay();
            if (isProaccountDisplay != null) {
                return isProaccountDisplay.intValue() == 2;
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
