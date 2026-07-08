package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGeckoBannerOptimizeListSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGeckoBannerOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveBannerDegradeSettings;
import com.bytedance.android.livesdkapi.host.IHostConfig;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.pitaya.api.feature.IKVStore;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0yGl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1851050yGl {
    public static void LIZ() {
        Integer numLJIIJJI;
        IKVStore iKVStoreLIZ;
        String str;
        Integer numLJIIJJI2;
        String str2;
        if (((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).r72()) {
            Map<String, String> mapYM1 = ((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).yM1("optimize_disk");
            Integer num = -1;
            if (mapYM1 == null || (str2 = mapYM1.get("livesdk_live_play_label")) == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str2)) == null) {
                numLJIIJJI = num;
            }
            C1851040yGk.LIZIZ = numLJIIJJI;
            if (mapYM1 != null && (str = mapYM1.get("storage_sensitivity_label_v1")) != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(str)) != null) {
                num = numLJIIJJI2;
            }
            C1851040yGk.LIZJ = num;
            IKVStore iKVStoreLIZ2 = C1851040yGk.LIZ();
            if (iKVStoreLIZ2 != null) {
                Integer num2 = C1851040yGk.LIZIZ;
                iKVStoreLIZ2.setValueForKey("livesdk_live_play_label", Integer.valueOf(num2 != null ? num2.intValue() : -1));
            }
            IKVStore iKVStoreLIZ3 = C1851040yGk.LIZ();
            if (iKVStoreLIZ3 != null) {
                Integer num3 = C1851040yGk.LIZJ;
                iKVStoreLIZ3.setValueForKey("storage_sensitivity_label_v1", Integer.valueOf(num3 != null ? num3.intValue() : -1));
            }
            IKVStore iKVStoreLIZ4 = C1851040yGk.LIZ();
            if ((iKVStoreLIZ4 == null || iKVStoreLIZ4.getValueForKey("long_rule_clean_time") == null) && (iKVStoreLIZ = C1851040yGk.LIZ()) != null) {
                iKVStoreLIZ.setValueForKey("long_rule_clean_time", Long.valueOf(System.currentTimeMillis()));
            }
        }
        if (!LIZIZ() || ((IHostConfig) C1161920gLG.LIZJ(IHostConfig.class)).qD2()) {
            return;
        }
        C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0UpC
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LiveGeckoFEOptUtil@233c.deleteLiveGecko$1");
                try {
                    Iterator<String> it2 = LiveGeckoBannerOptimizeListSetting.INSTANCE.getValue().iterator();
                    while (it2.hasNext()) {
                        ((IHostResource) C1161920gLG.LIZJ(IHostResource.class)).Xg1(it2.next());
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LiveGeckoFEOptUtil@233c.deleteLiveGecko$1");
            }
        });
    }

    public static boolean LIZIZ() {
        return LiveGeckoBannerOptimizeSetting.INSTANCE.getValue() && !LiveBannerDegradeSettings.INSTANCE.enableBanner();
    }
}
