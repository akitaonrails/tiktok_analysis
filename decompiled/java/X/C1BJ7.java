package X;

import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.FacebookSdk;

/* JADX INFO: renamed from: X.1BJ7, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BJ7 {
    public final C2202741BIy LIZ() {
        C2202741BIy c2202741BIy;
        C2202741BIy c2202741BIy2 = C2202741BIy.LJI;
        if (c2202741BIy2 != null) {
            return c2202741BIy2;
        }
        synchronized (this) {
            try {
                c2202741BIy = C2202741BIy.LJI;
                if (c2202741BIy == null) {
                    c2202741BIy = new C2202741BIy(LocalBroadcastManager.LIZ(FacebookSdk.LIZJ()), new C2202761BJa());
                    C2202741BIy.LJI = c2202741BIy;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c2202741BIy;
    }
}
