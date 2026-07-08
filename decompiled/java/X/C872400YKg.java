package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.im.core.client.configs.ReportTaskInfoConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YKg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C872400YKg extends C09AY implements Function0<ReportTaskInfoConfig> {
    public C872400YKg() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ReportTaskInfoConfig invoke() {
        ReportTaskInfoConfig reportTaskInfoConfig;
        try {
            SettingsManager.LIZLLL().getClass();
            reportTaskInfoConfig = (ReportTaskInfoConfig) SettingsManager.LJII("im_sdk_report_task_info", ReportTaskInfoConfig.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reportTaskInfoConfig = C872390YKf.LIZ;
        }
        return reportTaskInfoConfig == null ? C872390YKf.LIZ : reportTaskInfoConfig;
    }
}
