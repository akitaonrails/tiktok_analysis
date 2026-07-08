package X;

import com.ss.android.ugc.aweme.analytics.AppLogDualReportSettings;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0C8G, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C8G extends C09AY implements Function0<AppLogDualReportSettings.EventConfig> {
    public C0C8G() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.analytics.AppLogDualReportSettings$EventConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final AppLogDualReportSettings.EventConfig invoke() {
        return C08JS.LIZ(" {\n        \"categories\": {\n            \"has_diff\": \"status\"\n        },\n        \"sample_rate\": 0.01,\n        \"slardar_event\": \"ttk_cd_monitor_normal_event\"\n    }", AppLogDualReportSettings.EventConfig.class);
    }
}
