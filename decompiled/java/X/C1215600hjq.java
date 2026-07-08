package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0hjq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1215600hjq {
    public static boolean LIZ() {
        try {
            return C0CLW.LIZIZ.LIZ.getMtcertSettings().getEnableChangeNicknameNotice().booleanValue();
        } catch (C316660CbA e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
