package X;

import Y.ARunnableS117S0100000_17;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostApplogOpt;
import com.bytedance.applog.AppLog;

/* JADX INFO: renamed from: X.0eMq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1086020eMq {
    public static void LIZ() {
        if (LiveHostApplogOpt.isCacheEnabled()) {
            AppLog.disableInsertCache();
        }
        if (LiveHostApplogOpt.isTransactionEnabled()) {
            AppLog.setInsertByTransactionEnabled(false);
        }
    }

    public final void LIZIZ() {
        if (LiveHostApplogOpt.isTransactionEnabled()) {
            AppLog.setInsertByTransactionEnabled(true);
        }
        if (LiveHostApplogOpt.isCacheEnabled()) {
            LiveHostApplogOpt liveHostApplogOpt = LiveHostApplogOpt.INSTANCE;
            AppLog.enableInsertCache(C13LQ.LJJLIIIJLJLI(liveHostApplogOpt.getValue().whiteList), liveHostApplogOpt.getValue().maxInterval, liveHostApplogOpt.getValue().maxCount);
        }
        C473410IhP.LIZJ(new ARunnableS117S0100000_17(this, 12), LiveHostApplogOpt.getOptTime());
    }
}
