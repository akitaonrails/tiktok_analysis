package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.0K1E, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K1E {
    public static final WeakHashMap<Object, C0K1F> LIZ = new WeakHashMap<>();

    public static C0K1F LIZ(SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment) {
        C0K1F c0k1f;
        if (subscriptionPrivilegeDetailFragment == null) {
            return null;
        }
        WeakHashMap<Object, C0K1F> weakHashMap = LIZ;
        synchronized (weakHashMap) {
            try {
                C0K1F c0k1f2 = weakHashMap.get(subscriptionPrivilegeDetailFragment);
                if (c0k1f2 == null) {
                    c0k1f2 = new C0K1F();
                    weakHashMap.put(subscriptionPrivilegeDetailFragment, c0k1f2);
                }
                c0k1f = c0k1f2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c0k1f;
    }
}
