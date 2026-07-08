package X;

import android.accounts.AccountManager;
import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0WJT, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WJT {
    public static boolean LIZ(Activity activity) {
        boolean z = false;
        try {
            if (C2204961BRm.LIZIZ(AccountManager.get(activity), "com.google", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk0qJ0lZQzCOmR3SNvJDCT3Lb8C/beFJQB3sYwuZjUK6k=", null)).length == 0) {
                z = true;
            }
            z = !z;
            return z;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return z;
        }
    }

    public static boolean LIZIZ(String str) {
        return C1697810uHb.LJIIJJI("google_onetap", "google").contains(str);
    }
}
