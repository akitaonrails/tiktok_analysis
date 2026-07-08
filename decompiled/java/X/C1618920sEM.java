package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sEM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1618920sEM {
    public static final C1618920sEM LIZ = new C1618920sEM();
    public static boolean LIZIZ;
    public static boolean LIZJ;

    public static C1618930sEN LIZ() {
        if (C1618930sEN.LIZJ == null || !Intrinsics.LJFF(C1618930sEN.LIZIZ, AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId())) {
            synchronized (C1618930sEN.class) {
                try {
                    C1618930sEN.LIZIZ = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
                    C1618930sEN.LIZJ = new C1618930sEN();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return C1618930sEN.LIZJ;
    }
}
