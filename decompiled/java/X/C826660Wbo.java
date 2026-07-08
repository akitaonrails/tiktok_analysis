package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Wbo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C826660Wbo {
    public static int LIZ() {
        try {
            return C838410Wul.LIZ(C2213981Bky.LIZIZ.getApplicationContext(), "android.permission.READ_CONTACTS") == 0 ? 1 : 2;
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            return 2;
        }
    }
}
