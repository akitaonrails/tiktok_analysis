package X;

import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargePurchaseLockEnabledSetting;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.0IiN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C474010IiN {
    public static final AtomicLong LIZ = new AtomicLong(0);

    public static void LIZIZ(EnumC474020IiO enumC474020IiO) {
        int i;
        if (!LiveRechargePurchaseLockEnabledSetting.INSTANCE.isEnabled()) {
            return;
        }
        long jCurrentTimeMillis = 0;
        long andSet = LIZ.getAndSet(0L);
        if (andSet != 0) {
            i = 1;
            jCurrentTimeMillis = System.currentTimeMillis() - andSet;
        } else {
            i = 0;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_wallet_recharge_lock_unlock");
        c474500IjALIZ.LJJII(enumC474020IiO.getTrackingName(), "reason");
        c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis), "held_duration_ms");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "was_held");
        c474500IjALIZ.LIZ();
    }

    public static void LIZ(long j, long j2, boolean z, Map map) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_wallet_recharge_lock_acquire_fail");
        c474500IjALIZ.LJJII(Long.valueOf(j), "ttl_ms");
        c474500IjALIZ.LJJII(Long.valueOf(j2), "held_for_ms");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "raced");
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                c474500IjALIZ.LJJII(value, str);
            }
        }
        c474500IjALIZ.LIZ();
    }
}
