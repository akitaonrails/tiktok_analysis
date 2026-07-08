package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.settings.HybridWebResourceMetricsSettingsBean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Dr7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2268751Dr7 extends C09AY implements Function0<Boolean> {
    public C2268751Dr7() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        HybridWebResourceMetricsSettingsBean hybridWebResourceMetricsSettingsBean = (HybridWebResourceMetricsSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("hybrid_web_resource_metrics_switch", HybridWebResourceMetricsSettingsBean.class, C2268741Dr6.LIZ);
        return Boolean.valueOf(hybridWebResourceMetricsSettingsBean != null ? hybridWebResourceMetricsSettingsBean.enable_collect_resource_metrics : false);
    }
}
