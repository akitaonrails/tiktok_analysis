package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.setting.ServiceSkuRoutingConfig;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.ServiceSkuRoutingConfigSetting;

/* JADX INFO: renamed from: X.0fKZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1123050fKZ {
    public static final C1123050fKZ LIZ = new C1123050fKZ();

    public static String LIZ() {
        ServiceSkuRoutingConfig value = ServiceSkuRoutingConfigSetting.INSTANCE.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enabled=");
        sbLIZ.append(value.getEnabled());
        sbLIZ.append(" global_threshold=");
        sbLIZ.append(value.getGlobalThreshold());
        sbLIZ.append(" max_show_per_session=");
        sbLIZ.append(value.getMaxShowPerSession());
        sbLIZ.append(" max_show_per_day=");
        sbLIZ.append(value.getMaxShowPerDay());
        sbLIZ.append(" ignore_frequency_for_test=");
        sbLIZ.append(value.getIgnoreFrequencyForTest());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
