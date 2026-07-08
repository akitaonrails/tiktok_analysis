package X;

import com.bytedance.im.core.client.configs.ReportTaskInfoConfig;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: renamed from: X.0YKf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C872390YKf {
    public static final ReportTaskInfoConfig LIZ;
    public static final C01GW LIZIZ;

    static {
        ReportTaskInfoConfig reportTaskInfoConfig = new ReportTaskInfoConfig();
        reportTaskInfoConfig.enable = 1;
        reportTaskInfoConfig.timeoutDurationMs = 30000L;
        reportTaskInfoConfig.executeTooLongMs = 30000L;
        reportTaskInfoConfig.callbackTooLongMs = Mp4ScreenVideoLoadTimeout.CONTROL;
        LIZ = reportTaskInfoConfig;
        LIZIZ = C452501pT.LIZIZ(new C872400YKg());
    }
}
