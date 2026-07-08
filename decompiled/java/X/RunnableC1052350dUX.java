package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.common.applog.AppLog;

/* JADX INFO: renamed from: X.0dUX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class RunnableC1052350dUX implements Runnable {
    public static final RunnableC1052350dUX LL = new RunnableC1052350dUX();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("GeckoHighPriorityCheckInRequest@9be9.runReal$1");
        try {
            if (!TextUtils.isEmpty(AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId())) {
                Context context = C1552050qUV.LIZ;
                synchronized (C1552050qUV.class) {
                    C1551950qUL c1551950qULLJIIJJI = C1552050qUV.LJIIJJI();
                    if (c1551950qULLJIIJJI != null) {
                        c1551950qULLJIIJJI.LIZIZ("high_priority", null, null, new C1024460clY());
                    }
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GeckoHighPriorityCheckInRequest@9be9.runReal$1");
    }
}
