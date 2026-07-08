package X;

import com.ss.android.ugc.aweme.analytics.AppLogDualReportSettings;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0C8H, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C8H extends C09AY implements Function0<AppLogDualReportSettings.EventConfig> {
    public C0C8H() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.analytics.AppLogDualReportSettings$EventConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final AppLogDualReportSettings.EventConfig invoke() {
        return C08JS.LIZ("{\n        \"categories\": {\n            \"ab_group\": \"id\",\n            \"bottom_has_diff\": \"location\",\n            \"corner_has_diff\": \"count\",\n            \"diff_tabs\": \"enter_from\",\n            \"new_bottom_tab_content\": \"error_domain\",\n            \"new_corner_tab_content\": \"location3\",\n            \"new_tab_content\": \"content2\",\n            \"new_top_tab_content\": \"scene\",\n            \"origin_bottom_tab_content\": \"error_code\",\n            \"origin_corner_tab_content\": \"location2\",\n            \"origin_tab_content\": \"content\",\n            \"origin_top_tab_content\": \"content3\",\n            \"position_type\": \"mode\",\n            \"top_has_diff\": \"content4\"\n        },\n        \"extra\": {\n            \"exp_extra\": \"status2\",\n            \"fcp_config_v0\": \"status4\",\n            \"fcp_config_v2\": \"status3\",\n            \"has_diff\": \"status\"\n        },\n        \"sample_rate\": 1,\n        \"slardar_event\": \"ttk_cd_monitor_normal_event\"\n    }", AppLogDualReportSettings.EventConfig.class);
    }
}
