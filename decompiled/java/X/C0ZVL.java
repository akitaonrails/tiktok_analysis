package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.callroom.api.analytics.IVoiceCallEntranceAnalytics;

/* JADX INFO: renamed from: X.0ZVL, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZVL {
    public static final /* synthetic */ C0ZVL LIZ = new C0ZVL();

    public static void LIZ(Context context, String str, String str2, String str3, String str4) {
        Activity activityLIZ;
        if (context != null && (activityLIZ = C2493909px.LIZ(context)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIIZ(2131831924);
            c1389890mGx.LJIIJJI();
        }
        C2274381E0m.LIZIZ.LIZ("im_voice_call", false);
        IVoiceCallEntranceAnalytics iVoiceCallEntranceAnalytics = (IVoiceCallEntranceAnalytics) PluggableExtentionKt.pluggableSpi$default(IVoiceCallEntranceAnalytics.class, false, false, false, 14, null);
        if (iVoiceCallEntranceAnalytics != null) {
            iVoiceCallEntranceAnalytics.LIZ("fail_plugin_not_ready", str, str2, str3, str4);
        }
    }
}
