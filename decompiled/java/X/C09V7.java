package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.settings.SendAnalyticsEventData;

/* JADX INFO: renamed from: X.09V7, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09V7 {
    public static final SendAnalyticsEventData LIZ() {
        try {
            return (SendAnalyticsEventData) SettingsManager.LIZLLL().LJIIIIZZ("send_analytics_event_data", SendAnalyticsEventData.class, null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
