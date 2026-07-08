package X;

import com.bytedance.helios.api.config.ApiSampleRateConfig;
import com.bytedance.helios.api.config.DomainRange;
import com.bytedance.helios.api.config.ModifyConf;
import com.bytedance.helios.api.config.ModifyConfig;
import com.bytedance.helios.api.config.NetworkConfig;
import com.bytedance.helios.api.config.RangeConf;
import com.bytedance.helios.api.config.SampleRateConfig;
import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.api.config.ShutdownConfig;
import java.util.Collections;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Wyf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840830Wyf extends AbstractC841640Wzy {
    public static final SettingsModel LIZ;

    static {
        SettingsModel settingsModel = new SettingsModel("helios_default", null, false, false, false, 0L, 0L, null, null, null, null, new SampleRateConfig(false, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, Collections.singletonList(new ApiSampleRateConfig(C1697810uHb.LJIIJJI(400001, 400101, 400203), 0.001d, 0.05d, 1.0d, 0.0d, 16, null)), 1023, null), 0L, null, null, null, null, null, null, false, null, null, null, null, null, new NetworkConfig(true, false, 0L, 0L, null, null, null, null, null, 0L, 0L, 0.0d, null, null, null, 0.0d, false, false, 0.0d, null, new ShutdownConfig(0.25d, 0.0d, 1.0d, null, Collections.singletonList(new ModifyConfig("shutdown_modify_default", new RangeConf(null, Collections.singleton("http"), new DomainRange(null, C13LQ.LJLIIL(new String[]{"lf16-scmcdn.oecstatic.com", "lf16-tiktok-common.ttwstatic.com", "f-p-va.isnssdk.com", "tiktok.com", "sg.immers.page", "lf16-tiktok-web.ttwstatic.com", "f-p.sgsnssdk.com", "sf16-website-login.neutral.ttwstatic.com", "www.projectevogame.com", "lf16-upay.g-t-static.com", "v16m.tiktokcdn-us.com", "sf16-short-sg.bytedapm.com", "p19-sign.tiktokcdn-us.com", "p16-webcast.tiktokcdn-us.com", "p19-webcast.tiktokcdn-us.com"}), null, null, null, 29, null), null, 9, null), new ModifyConf(C2097908Jt.LIZJ(new Pair("http", "https")), C2097608Jq.LJ(), C2097608Jq.LJ()))), null, null, null, null, null, false, false, false, false, false, 32746, null), null, null, null, null, null, null, 0L, 0, false, null, null, false, null, false, false, false, false, false, 0.0d, null, null, false, -1048578, 2047, null), null, null, null, null, null, null, -33556482, null);
        LIZ = settingsModel;
        C308480C7i.LJ(settingsModel, "helios_settings");
    }
}
