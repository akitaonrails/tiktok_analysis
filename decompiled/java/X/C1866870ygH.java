package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.settings.SparkWebViewWarmUpConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ygH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1866870ygH extends C09AY implements Function0<Integer> {
    public C1866870ygH() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int i;
        try {
            SparkWebViewWarmUpConfig.SparkWebViewWarmUpConfigModel sparkWebViewWarmUpConfigModel = (SparkWebViewWarmUpConfig.SparkWebViewWarmUpConfigModel) C0C64.LJIILLIIL().LJJIIJ(true, "spark_webview_warm_up_config", 31744, SparkWebViewWarmUpConfig.SparkWebViewWarmUpConfigModel.class, SparkWebViewWarmUpConfig.LIZ, 2);
            i = sparkWebViewWarmUpConfigModel != null ? sparkWebViewWarmUpConfigModel.group : 0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            i = SparkWebViewWarmUpConfig.LIZ.group;
        }
        return Integer.valueOf(i);
    }
}
