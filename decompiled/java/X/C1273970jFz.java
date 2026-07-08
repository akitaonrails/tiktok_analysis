package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveTTLSDebugLogEnableSettings;
import com.bytedance.android.livesdk.livesetting.performance.LiveTTLSThrowExceptionSettings;
import com.bytedance.android.livesdk.livesetting.performance.TTLSThreadPrioritySettings;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: renamed from: X.0jFz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1273970jFz {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0jG8] */
    public static void LIZ() {
        C1274080jGA.LIZ.LIZ = new Object() { // from class: X.0jG8
        };
        C1274040jG6.LIZ = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline();
        C1274040jG6.LIZIZ = LiveTTLSThrowExceptionSettings.INSTANCE.canThrowException();
        C1267520j5a.LIZ = LiveTTLSDebugLogEnableSettings.INSTANCE.isDebugLogEnabled();
        C143900gn.LIZIZ(TTLSThreadPrioritySettings.INSTANCE.getThreadConfigs());
    }
}
