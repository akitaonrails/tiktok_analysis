package X;

import com.ss.android.ugc.aweme.account.logout.AccountSwitcherLogger;

/* JADX INFO: renamed from: X.1BV6, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BV6 {
    public static void LIZ(String str, String str2) {
        if (AccountSwitcherLogger.LIZ >= 0 && AccountSwitcherLogger.LIZIZ >= 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - AccountSwitcherLogger.LIZ;
            long j2 = jCurrentTimeMillis - AccountSwitcherLogger.LIZIZ;
            C0XGR c0xgr = new C0XGR();
            c0xgr.LIZLLL("step", str);
            c0xgr.LIZIZ(j, "duration");
            c0xgr.LIZIZ(j2, "entire_duration");
            c0xgr.LIZLLL("from_local_cache", str2);
            C20684815ws.LJIILLIIL("account_switch_duration", c0xgr.LIZ);
            AccountSwitcherLogger.LIZ = jCurrentTimeMillis;
        }
    }
}
